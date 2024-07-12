package com.apk.shopup.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.LocationActivity
import com.apk.shopup.R
import com.apk.shopup.navigation.ROUTE_PURCHASE
import com.apk.shopup.navigation.ROUT_LOGIN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderProductsScreen(navController: NavHostController) {
    val mContext = LocalContext.current

    // Load your background image
//    val backgroundImage = painterResource(id = R.drawable.backg)

    Surface(color = Color.Black) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Background image
//            Image(
//                painter = backgroundImage,
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Black)
//            )

            // Top app bar
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) },
                navigationIcon = {
                    // Navigate back to login screen
                    IconButton(onClick = {
                        navController.navigate(ROUT_LOGIN)
                    }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    // Share button
                    IconButton(onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this cool content")
                        mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                    }) {
                        Icon(Icons.Filled.Share, contentDescription = "Share")
                    }
                    // Location button
                    IconButton(onClick = {
                        mContext.startActivity(Intent(mContext, LocationActivity::class.java))
                    }) {
                        Icon(Icons.Filled.LocationOn, contentDescription = "Location")
                    }
                } ,
                modifier = Modifier.background(Color.Transparent),
//                backgroundColor = Color.Transparent, // Set transparent to see background image
//                elevation = 0.dp
            )

            // Spacer between app bar and content
            Spacer(modifier = Modifier.height(16.dp))

            // List of products with buttons
            ProductListItem(productName = "MANGO", onClick = {
                navController.navigate(ROUTE_PURCHASE)
            })
            ProductListItem(productName = "ORANGE", onClick = {
                navController.navigate(ROUTE_PURCHASE)
            })
            ProductListItem(productName = "APPLE", onClick = {
                navController.navigate(ROUTE_PURCHASE)
            })
            ProductListItem(productName = "BANANA", onClick = {
                navController.navigate(ROUTE_PURCHASE)
            })
            ProductListItem(productName = "BERRY", onClick = {
                navController.navigate(ROUTE_PURCHASE)
            })
        }
    }
}

@Composable
fun ProductListItem(productName: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Product image (replace with actual product images)
        Image(
            painter = painterResource(id = R.drawable.mango),
            contentDescription = "Product Image",
            modifier = Modifier.size(64.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        // Product name and button
        Column {
            Text(text = productName)
            Button(
                onClick = {},
                modifier = Modifier.padding(top = 8.dp),
                colors = ButtonDefaults.buttonColors( Color.DarkGray)
            ) {
                Text(text = "Buy Now")
            }


            Image(
                painter = painterResource(id = R.drawable.apple),
                contentDescription = "Product Image",
                modifier = Modifier.size(64.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Product name and button
            Column {
                Text(text = productName)
                Button(
                    onClick = {},
                    modifier = Modifier.padding(top = 8.dp),
                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
                ) {
                    Text(text = "Buy Now")
                }

                Image(
                    painter = painterResource(id = R.drawable.banana),
                    contentDescription = "Product Image",
                    modifier = Modifier.size(64.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                // Product name and button
                Column {
                    Text(text = productName)
                    Button(
                        onClick = {},
                        modifier = Modifier.padding(top = 8.dp),
                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
                    ) {
                        Text(text = "Buy Now")
                    }
                    Image(
                        painter = painterResource(id = R.drawable.orange),
                        contentDescription = "Product Image",
                        modifier = Modifier.size(64.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    // Product name and button
                    Column {
                        Text(text = productName)
                        Button(
                            onClick = {},
                            modifier = Modifier.padding(top = 8.dp),
                            colors = ButtonDefaults.buttonColors(Color.DarkGray)
                        ) {
                            Text(text = "Buy Now")
                        }
                    }
                }
            }}}}

@Preview(showBackground = true)
@Composable
fun OrderProductsScreenPreview() {
    OrderProductsScreen(rememberNavController())
}

