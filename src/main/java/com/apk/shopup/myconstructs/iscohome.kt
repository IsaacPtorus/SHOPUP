//package com.apk.shopup.myconstructs
//
////options for dashboard and purchase product
////for user....with button to go to admin section
//
//
//import android.content.Intent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.LocationOn
//import androidx.compose.material.icons.filled.Share
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.apk.shopup.LocationActivity
//import com.apk.shopup.R
//import com.apk.shopup.navigation.ROUTE_ADMIN
//import com.apk.shopup.navigation.ROUTE_PURCHASE
//import com.apk.shopup.navigation.ROUT_LOGIN
//import com.apk.shopup.navigation.VIEW_PRODUCTS_URL
//
////import com.example.firebasestorage.InsertActivity
////import com.example.firebasestorage.LocationActivity
////import com.example.firebasestorage.navigation.HOME_URL
////import com.example.firebasestorage.navigation.ROUT_CONTACT
////import com.example.firebasestorage.navigation.ROUT_LOGIN
////import com.example.firebasestorage.navigation.ROUT_SIGNUP
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun IscoHomeScreen(navController:NavHostController) {
//    val mContext= LocalContext.current
//    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
//
//        //TopAppBar
//        TopAppBar(title = { Text(text = "Welcome User!") },
//            navigationIcon = {
//                IconButton(onClick = {
//                    navController.navigate(ROUT_LOGIN)
//                }) {
//                    Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = "arrowback")
//                }
//            },
//            actions = {
//                IconButton(onClick = {
//                    val shareIntent= Intent(Intent.ACTION_SEND)
//                    shareIntent.type="text/plain"
//                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
//                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
//
//
//                }) {
//                    Icon(imageVector = Icons.Filled.Share , contentDescription = "share")
//                }
//                IconButton(onClick = {
//                    mContext.startActivity(Intent(mContext, LocationActivity::class.java))
//                }) {
//                    Icon(imageVector = Icons.Filled.LocationOn , contentDescription = "Location")
//                }
//            },
//            modifier = Modifier.background(Color.Green),)
////            backgroundColor = Color.Green)
//
//
//
//        Image(
//            painter = painterResource(id = R.drawable.orange),
//            contentDescription = "Sample Product Image",
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(400.dp)
//                .padding(horizontal = 16.dp)
//        )
//
//
//        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
//            Row(modifier = Modifier.fillMaxWidth()) {
//                Button(
//                    onClick = { navController.navigate(VIEW_PRODUCTS_URL) },
//                    modifier = Modifier.weight(1f).padding(end = 8.dp),
//                ) {
//                    Text(text = "View Our Products")
//                }
//                Button(
//                    onClick = { navController.navigate(ROUTE_PURCHASE) },
//                    modifier = Modifier.weight(1f),
//                ) {
//                    Text(text = "Order a Product")
//                }
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Row(modifier = Modifier.fillMaxWidth()) {
//                Button(
//                    onClick = { navController.navigate(ROUTE_ADMIN) },
//                    modifier = Modifier.weight(1f).background(Color.DarkGray).padding(end = 8.dp),
//                ) {
//                    Text(text = "ADMIN SECTION")
//                }
//
//                    }
//                }
//            }
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun IscoHomeScreenPreview() {
//    IscoHomeScreen(rememberNavController())
//
//}
