package com.apk.shopup.screens.home


import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.navigation.ADD_PRODUCTS_URL
import com.apk.shopup.navigation.ROUT_LOGIN
import com.apk.shopup.navigation.VIEW_PRODUCTS_URL

//import com.example.firebasestorage.navigation.ADD_PRODUCTS_URL
//import com.example.firebasestorage.navigation.ROUT_LOGIN
//import com.example.firebasestorage.navigation.VIEW_PRODUCTS_URL
//import com.example.firebasestorage.ui.theme.Blue
//import com.example.firebasestorage.navigation.ADD_PRODUCTS_URL
//import com.example.firebasestorage.navigation.ROUT_LOGIN
//import com.example.firebasestorage.navigation.VIEW_PRODUCTS_URL
//import com.example.firebasestorage.ui.theme.Blue
//import com.example.firebasestorage.ui.theme.FirebasestorageTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyHomeScreen(navController:NavHostController){

    val mContext= LocalContext.current

    Column (modifier = Modifier.fillMaxSize()){
        //TopAppBar
        TopAppBar(title = { Text(text = "Products") },
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, ROUT_LOGIN::class.java))
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = "arrowback")
                }
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Blue))



        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.height(30.dp))


            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Button(onClick = {
                    navController.navigate(ADD_PRODUCTS_URL)
                }, shape = CutCornerShape(5.dp)) {
                    Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription ="", tint = Color.White )
                    Text(text = "Add Products")
                }

            }


            Spacer(modifier = Modifier.height(30.dp))

            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Button(onClick = {
                    navController.navigate(VIEW_PRODUCTS_URL)
                },
                    shape = CutCornerShape(5.dp)) {
                    Icon(imageVector = Icons.Filled.Info, contentDescription ="", tint = Color.White )
                    Text(text = "View Products")
                }
            }




        }
    }
}

@Composable
@Preview(showBackground = true)
fun MyHomeScreenPreview(){
    MyHomeScreen(navController = rememberNavController())

}