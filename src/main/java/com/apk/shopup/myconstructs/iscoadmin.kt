package com.apk.shopup.myconstructs

//scrn to contain button for add,upload products,view uploads,and view products ,and go to user

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.LocationActivity
import com.apk.shopup.R
import com.apk.shopup.navigation.ADD_PRODUCTS_URL
import com.apk.shopup.navigation.HOME_URL
import com.apk.shopup.navigation.ROUTE_DETAIL
import com.apk.shopup.navigation.ROUTE_UPDATE
import com.apk.shopup.navigation.ROUT_LOGIN
import com.apk.shopup.navigation.VIEW_PRODUCTS_URL

//import com.example.firebasestorage.InsertActivity
//import com.example.firebasestorage.LocationActivity
//import com.example.firebasestorage.navigation.HOME_URL
//import com.example.firebasestorage.navigation.ROUT_CONTACT
//import com.example.firebasestorage.navigation.ROUT_LOGIN
//import com.example.firebasestorage.navigation.ROUT_SIGNUP

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize().background(Color.DarkGray)) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "ADMINISTRATOR SECTION") },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_LOGIN)
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "arrowback")
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                }) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                }
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, LocationActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "Location")
                }
            },

            modifier = Modifier.background(Color.Green),
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // Space between columns
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Space between columns
            ) {
                Column(
                    modifier = Modifier.width(120.dp) // Adjust width as per your requirement
                ) {
//                    Text(text = "Product 1")
                    Button(
                        onClick = { /* Handle button click */ },
                        modifier = Modifier.padding(top = 8.dp),
                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
                    ) {
//                        Text(text = "Buy Now")
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ad3),
                        contentDescription = "Product Image",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable { /* Navigate or perform action */ }
                    )
                }
                Column(
                    modifier = Modifier.width(120.dp) // Adjust width as per your requirement
                ) {
//                    Text(text = "Product 1")
                    Button(
                        onClick = { /* Handle button click */ },
                        modifier = Modifier.padding(top = 8.dp),
                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
                    ) {
//                        Text(text = "Buy Now")
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ad2),
                        contentDescription = "Product Image",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable { /* Navigate or perform action */ }
                    )
                }
                Column(
                    modifier = Modifier.width(120.dp) // Adjust width as per your requirement
                ) {
//                    Text(text = "Product 1")
                    Button(
                        onClick = { /* Handle button click */ },
                        modifier = Modifier.padding(top = 8.dp),
                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
                    ) {
//                        Text(text = "Buy Now")
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ad3),
                        contentDescription = "Product Image",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable { /* Navigate or perform action */ }
                    )
                }}}
//
//                Column(
//                    modifier = Modifier.width(120.dp) // Adjust width as per your requirement
//                ) {
//                    Text(text = "Product 2")
//                    Button(
//                        onClick = { /* Handle button click */ },
//                        modifier = Modifier.padding(top = 8.dp),
//                        colors = ButtonDefaults.buttonColors(Color.DarkGray)
//                    ) {
//                        Text(text = "Buy Now")
//                    }
//                    Image(
//                        painter = painterResource(id = R.drawable.banana),
//                        contentDescription = "Product Image",
//                        modifier = Modifier
//                            .size(70.dp)
//                            .clickable { /* Navigate or perform action */ }
//                    )
//                }
//            }

//            Column(
//                modifier = Modifier.width(120.dp) // Adjust width as per your requirement
//            ) {
//                Text(text = "Product 1")
//                Button(
//                    onClick = { /* Handle button click */ },
//                    modifier = Modifier.padding(top = 8.dp),
//                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
//                ) {
//                    Text(text = "Buy Now")
//                }
//                Image(
//                    painter = painterResource(id = R.drawable.mango),
//                    contentDescription = "Product Image",
//                    modifier = Modifier
//                        .size(150.dp)
//                        .clickable { /* Navigate or perform action */ }
//                )
//            }
//        }
//
//        Column(
//            modifier = Modifier.width(120.dp) // Adjust width as per your requirement
//        ) {
//            Text(text = "Product 2")
//            Button(
//                onClick = { /* Handle button click */ },
//                modifier = Modifier.padding(top = 8.dp),
//                colors = ButtonDefaults.buttonColors(Color.DarkGray)
//            ) {
//                Text(text = "Buy Now")
//            }
//            Image(
//                painter = painterResource(id = R.drawable.banana),
//                contentDescription = "Product Image",
//                modifier = Modifier
//                    .size(150.dp)
//                    .clickable { /* Navigate or perform action */ }
//            )
//        }
//    }

//    Image(
//        painter = painterResource(id = R.drawable.orange),
//        contentDescription = "Sample Product Image",
//        modifier = Modifier
//            .size(200.dp)
//            .width(100.dp)
//            .height(200.dp)
//            .fillMaxWidth()
//            .padding(horizontal = 60.dp)
//    )
//            backgroundColor = Color.Green)
//    Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            navController.navigate(ROUT_UPLOAD)
//        }) {
//            Text(text = "Upload Product")
//        }

//        Spacer(modifier = Modifier.height(20.dp))

//        Button(onClick = {
//            navController.navigate(ADD_PRODUCTS_URL)
//        }) {
//            Text(text = "Add New Product")
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            navController.navigate(VIEW_PRODUCTS_URL)
//        }) {
//            Text(text = "View All Products")
//        }
//
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            navController.navigate(HOME_URL)
//        }) {
//            Text(text = "Back to Previous Page")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_UPDATE)
//        }) {
//            Text(text = "Update Products")
//        }
//        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Button(
            onClick = { navController.navigate(ADD_PRODUCTS_URL) },
            modifier = Modifier.weight(1f).padding(end = 8.dp),
        ) {
            Text(text = "Add Product")
        }
        Button(
            onClick = { navController.navigate(ROUTE_UPDATE) },
            modifier = Modifier.weight(1f),
        ) {
            Text(text = "Update Product")
        }}
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { navController.navigate(VIEW_PRODUCTS_URL) },
                modifier = Modifier.weight(1f).padding(end = 8.dp),
            ) {
                Text(text = "View Products")
            }
            Button(
                onClick = { navController.navigate(ROUTE_DETAIL) },
                modifier = Modifier.weight(1f),
            ) {
                Text(text = "Update Details")
            }}
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { navController.navigate(HOME_URL) },
                modifier = Modifier.weight(1f).padding(end = 8.dp),
            ) {
                Text(text = "Home")
            }
    }}
    }
//    Spacer(modifier = Modifier.height(16.dp))
//    Row(modifier = Modifier.fillMaxWidth()) {
//        Button(
//            onClick = { navController.navigate(HOME_URL) },
//            modifier = Modifier.weight(1f).padding(end = 8.dp),
//        ) {
//            Text(text = "BACK")
//        }
//        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
//            Row(modifier = Modifier.fillMaxWidth()) {
//                Button(
//                    onClick = { navController.navigate(VIEW_PRODUCTS_URL) },
//                    modifier = Modifier.weight(1f).padding(end = 8.dp),
//                ) {
//                    Text(text = "View Products")
//                }
//                Button(
//                    onClick = { navController.navigate(ROUTE_DETAIL) },
//                    modifier = Modifier.weight(1f),
//                ) {
//                    Text(text = "Product Details")
//                }
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Row(modifier = Modifier.fillMaxWidth()) {
//                Button(
//                    onClick = { navController.navigate(HOME_URL) },
//                    modifier = Modifier.weight(1f).padding(end = 8.dp),
//                ) {
//                    Text(text = "Back to home")
//                }
//            }
//        }
//                Button(
//                    onClick = { navController.navigate(ROUTE_PURCHASE) },
//                    modifier = Modifier.weight(1f),
//                ) {
//                    Text(text = "View All Products")
//                }






@Preview(showBackground = true)
@Composable
fun AdminScreenPreview() {
    AdminScreen(rememberNavController())

}
