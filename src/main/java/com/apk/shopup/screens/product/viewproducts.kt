package com.apk.shopup.screens.product

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.data.ProductViewModel
import com.apk.shopup.models.Product
import com.apk.shopup.navigation.ADD_PRODUCTS_URL

//import coil.compose.rememberAsyncImagePainter
//import com.example.firebasestorage.data.ProductViewModel
//import com.example.firebasestorage.models.Product
//
//import com.example.firebasestorage.ui.theme.FirebasestorageTheme

@Composable
fun ViewProductsScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {


        val productRepository = ProductViewModel(navController, mContext)


        val emptyProductState = remember { mutableStateOf(Product("","","","","")) }
        val emptyProductsListState = remember { mutableStateListOf<Product>() }

        val products = productRepository.allProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn{
                items(products){
                    ProductItem(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        navController = navController,
                        productRepository = productRepository
                    )
                }
            }
        }
    }
}


@Composable
fun ProductItem(
    name: String, quantity: String, price: String, id: String,
    navController: NavHostController,
    productRepository: ProductViewModel
) {
    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxSize()) {

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
//            Image(
//                painter = rememberAsyncImagePainter(product.imageUrl),
//                contentDescription = null,
//                modifier = Modifier.fillMaxWidth().height(200.dp),
//                contentScale = ContentScale.FillBounds
//            )
        }

        Row(modifier = Modifier.padding(start = 50.dp)) {
            Text(text = "Product Name :", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = name)
        }

        Row(modifier = Modifier.padding(start = 50.dp)) {
            Text(text = "Product Quantity :", fontWeight = FontWeight.Bold,fontSize = 20.sp)
            Text(text = quantity)
        }
        Row(modifier = Modifier.padding(start = 50.dp)) {
            Text(text = "Product Price :", fontWeight = FontWeight.Bold,fontSize = 20.sp)
            Text(text = price)
        }




        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Row {
                Button(onClick = {
                    productRepository.deleteProduct(id)
                },shape = CutCornerShape(5.dp)    ) {
                    Text(text = "Delete")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = {
                    navController.navigate(ADD_PRODUCTS_URL)
                },shape = CutCornerShape(5.dp)) {
                    Text(text = "Update")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                },
                    shape = CutCornerShape(5.dp)
                ) {
                    Text(text = "Pay")
                }
            }
        }
    }
}

fun rememberAsyncImagePainter(imageUrl: String): Painter {

return rememberAsyncImagePainter(imageUrl)
}

@Composable
@Preview(showBackground = true)
fun ViewProductsScreenPreview(){

    ViewProductsScreen(navController = rememberNavController())

}