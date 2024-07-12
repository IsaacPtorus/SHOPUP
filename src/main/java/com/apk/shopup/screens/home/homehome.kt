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
import com.apk.shopup.navigation.ROUTE_ADMIN
import com.apk.shopup.navigation.ROUTE_DASH
import com.apk.shopup.navigation.ROUTE_FIRSTORDER
import com.apk.shopup.navigation.ROUTE_PURCHASE
import com.apk.shopup.navigation.ROUT_LOGIN
import com.apk.shopup.navigation.ROUT_SIGNUP

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IscoHomeScreen(navController: NavHostController) {
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
                    IconButton(onClick = {
                        navController.navigate(ROUT_LOGIN)
                    }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this cool content")
                        mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                    }) {
                        Icon(Icons.Filled.Share, contentDescription = "Share")
                    }
                    IconButton(onClick = {
                        mContext.startActivity(Intent(mContext, LocationActivity::class.java))
                    }) {
                        Icon(Icons.Filled.LocationOn, contentDescription = "Location")
                    }
                },
                modifier = Modifier.background(Color.Transparent) // Set transparent to see background image
//                elevation = 0.dp

            )

            // Spacer between app bar and content
            Spacer(modifier = Modifier.height(16.dp))

            // Sample product image
            Image(
                painter = painterResource(id = R.drawable.orange),
                contentDescription = "Sample Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            // Spacer between image and buttons
            Spacer(modifier = Modifier.height(16.dp))

            // Buttons arranged in two rows
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HomeButton(text = "View Our Products", onClick = {
                        navController.navigate(ROUTE_DASH)
                    })
                    Spacer(modifier = Modifier.height(16.dp))
                    HomeButton(text = "Place your order here", onClick = {
                        navController.navigate(ROUTE_PURCHASE)
                    })
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HomeButton(text = "View All Products", onClick = {
                        navController.navigate(ROUTE_PURCHASE)
                    })
                    Spacer(modifier = Modifier.height(16.dp))
                    HomeButton(text = "ADMIN SECTION", onClick = {
                        navController.navigate(ROUTE_ADMIN)
                    })

                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HomeButton(text = "LOG IN", onClick = {
                        navController.navigate(ROUT_LOGIN)
                    })
                    Spacer(modifier = Modifier.height(16.dp))
                    HomeButton(text = "SIGN UP", onClick = {
                        navController.navigate(ROUT_SIGNUP)
                    })
                    Spacer(modifier = Modifier.height(16.dp))
                    HomeButton(text = "ORDERPROD", onClick = {
                        navController.navigate(ROUTE_FIRSTORDER)
                    })

                Spacer(modifier = Modifier.height(16.dp))
                HomeButton(text = "DASH", onClick = {
                    navController.navigate(ROUTE_DASH)
                })


                }
            }
        }
    }
}

@Composable
fun HomeButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = ButtonDefaults.buttonColors( Color.DarkGray) // Change button color
    ) {
        Text(text = "HOME")
    }
}

@Preview(showBackground = true)
@Composable
fun IscoHomeScreenPreview() {
    IscoHomeScreen(rememberNavController())
}