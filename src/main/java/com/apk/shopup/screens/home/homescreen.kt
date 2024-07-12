//package com.apk.shopup.screens.home
//
//import android.content.Intent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
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
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.apk.shopup.LocationActivity
//import com.apk.shopup.navigation.HOME_URL
//import com.apk.shopup.navigation.ROUT_CONTACT
//import com.apk.shopup.navigation.ROUT_LOGIN
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
//fun HomeScreen(navController:NavHostController) {
//    val mContext= LocalContext.current
//    Column(modifier = Modifier.fillMaxSize()) {
//
//        //TopAppBar
//        TopAppBar(title = { Text(text = "HomePage") },
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
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            navController.navigate(ROUT_CONTACT)
//        }) {
//            Text(text = "Contact Us")
//        }
//
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            navController.navigate(HOME_URL)
//        }) {
//            Text(text = "Products Page")
//        }
//
//
//
//    }
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen(rememberNavController())
//
//}
