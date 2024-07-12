package com.apk.shopup.newnewshop.home

//noinspection UsingMaterialAndMaterial3Libraries
//import com.apk.shopup.newnewshop.navigation.ROUTE_ADMIN
//import com.apk.shopup.newnewshop.products.fetchProduct
import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.R
import com.apk.shopup.models.Product
import com.apk.shopup.navigation.HOME_URL
import com.apk.shopup.navigation.ROUTE_ABOUT
import com.apk.shopup.navigation.ROUTE_ADMIN
import com.apk.shopup.navigation.ROUTE_DASH
import com.apk.shopup.navigation.ROUTE_PURCHASE
import com.apk.shopup.navigation.ROUT_CONTACT
import com.apk.shopup.navigation.ROUT_LOGIN
import com.apk.shopup.navigation.VIEW_PRODUCTS_URL
import com.apk.shopup.screens.product.rememberAsyncImagePainter

data class Screen(val title: String, val icon: Int)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var isDrawerOpen by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(true) }
    var productList by remember { mutableStateOf(emptyList<Product>()) }

    val painterCover = painterResource(id = R.drawable.ad3)
    val profilePainter = painterResource(id = R.drawable.mango)
    val menuPainter = painterResource(id = R.drawable.tech)

//    LaunchedEffect(Unit) {
//        fetchProduct() { fetchedProduct ->
//            product = fetchedProduct
//        }
//    }

//    LaunchedEffect(Unit) {
//        fetchProducts { fetchedProducts ->
//            productList = fetchedProducts
//            isLoading = false
//        }
//    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "WELCOME TO SHOPUP")
                },
                actions = {
                    IconButton(onClick = {
                        navController.navigate(ROUT_LOGIN) {
                            popUpTo(HOME_URL) { inclusive = true }
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1E1E1E),
                    titleContentColor = Color.White,
                )
            )
        },
        content = @Composable {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        if (isDrawerOpen) {
                            isDrawerOpen = false
                        }
                    }
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(color = Color.Black)
                ) {
                    item {
                        // Header with image and text
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(300.dp)
                        ) {
                            Image(
                                modifier = Modifier
                                    .fillMaxSize(),
                                painter = painterCover,
                                contentDescription = "product sample",
                                contentScale = ContentScale.Crop,
                            )

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        brush = Brush.verticalGradient(
                                            colors = listOf(
                                                Color.Blue,
                                                Color.Transparent,
                                                Color.Transparent,
                                                Color.Transparent,
                                                Color.Transparent,
                                                Color.Red,
                                                Color.Red,
                                            )
                                        )
                                    )
                            )

                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.TopStart,
                            ) {
                                Image(
                                    modifier = Modifier
                                        .padding(start = 16.dp, top = 16.dp)
                                        .width(34.dp)
                                        .height(34.dp)
                                        .clip(shape = CircleShape),
                                    painter = profilePainter,
                                    contentDescription = "Profile photo",
                                    contentScale = ContentScale.Crop
                                )
                            }

                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.TopEnd,
                            ) {
                                Image(
                                    modifier = Modifier
                                        .padding(end = 16.dp, top = 16.dp)
                                        .width(24.dp)
                                        .height(24.dp),
                                    painter = menuPainter,
                                    contentDescription = "Menu",
                                )
                            }

                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = "SHOP WITH US",
                                        textAlign = TextAlign.Center,
                                        color = Color.White,
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight(weight = 30)
                                    )
                                    Text(
                                        text = "Ever the Best!",
                                        textAlign = TextAlign.Center,
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontFamily = FontFamily.Cursive
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    // Dual Buttons
                    item {


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 16.dp, end = 16.dp),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                            ) {
                                Button(
                                    modifier = Modifier.weight(1f),
                                    onClick = {
                                        navController.navigate(VIEW_PRODUCTS_URL)
                                    }
                                ) {
                                    Text(text = "View Products")
                                }

                                Spacer(modifier = Modifier.width(16.dp))

                                Button(
                                    modifier = Modifier.weight(1f),
                                    onClick = {
                                        navController.navigate(ROUT_CONTACT)
                                    }
                                ) {
                                    Text(text = "Contact Us")
                                }
                            }
                       Row {


                                Button(
                                    modifier = Modifier.padding(20.dp),
                                    onClick = {
                                        navController.navigate(ROUTE_DASH)
                                    }
                                ) {
                                    Text(text = "View Dashboard")
                                }
                                Button(
                                    modifier = Modifier.padding(10.dp),
                                    onClick = {
                                        navController.navigate(ROUTE_ADMIN)
                                    }
                                ) {
                                    Text(text = "ADMIN SECTION")
                                }
                           Spacer(modifier = Modifier.height(30.dp))}
                           Row(modifier = Modifier.fillMaxWidth()) {
                               Button(
                                   onClick = { navController.navigate(ROUTE_ABOUT) },
                                   modifier = Modifier
                                       .weight(1f)
                                       .padding(end = 8.dp),
                               ) {
                                   Text(text = "About Us")
                               }}
//                            }

                            Spacer(modifier = Modifier.height(20.dp))
//                        }

                    }


                    // Horizontal products list
                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Top Products", color = Color.White, fontSize = 18.sp)


                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(16.dp) // Space between columns
                        ) {
                            Column(
                                modifier = Modifier.width(120.dp) // Adjust width as per your requirement
                            ) {
                                Text(text = "Product 1")
                                Button(
                                    onClick = { /* Handle button click */ },
                                    modifier = Modifier.padding(top = 8.dp),
                                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
                                ) {
                                    Text(text = "Buy Now")
                                }
                                Image(
                                    painter = painterResource(id = R.drawable.mango),
                                    contentDescription = "Product Image",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { ROUTE_PURCHASE }
                                )
                            }

                            Column(
                                modifier = Modifier.width(120.dp) // Adjust width as per your requirement
                            ) {
                                Text(text = "Product 2")
                                Button(
                                    onClick = { /* Handle button click */ },
                                    modifier = Modifier.padding(top = 8.dp),
                                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
                                ) {
                                    Text(text = "Buy Now")
                                }
                                Image(
                                    painter = painterResource(id = R.drawable.melon),
                                    contentDescription = "Product Image",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { ROUTE_PURCHASE }
                                )
                            }
                            Column(
                                modifier = Modifier.width(120.dp) // Adjust width as per your requirement
                            ) {
                                Text(text = "Product 2")
                                Button(
                                    onClick = { /* Handle button click */ },
                                    modifier = Modifier.padding(top = 8.dp),
                                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
                                ) {
                                    Text(text = "Buy Now")
                                }
                                Image(
                                    painter = painterResource(id = R.drawable.banana),
                                    contentDescription = "Product Image",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clickable { ROUTE_PURCHASE }
                                )
                            }
                        }



                        Spacer(modifier = Modifier.height(12.dp))
                        LazyRow {
                            items(productList.take(3)) { product ->
                                ProductListItem(product)
                            }
                        }
                    }
                }
            }
        },
        bottomBar = { BottomBar(navController = navController) }
    )

    AnimatedDrawer(
        isOpen = isDrawerOpen,
        onClose = { isDrawerOpen = false }
    )
}


@Composable
fun ProductListItem(product: Product) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { /* Handle click action */ }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            // Product Image
            Image(
                painter = rememberAsyncImagePainter(product.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Product Details
            Column {
                Text(text = product.name)
                Text(text = "Price: ${product.price}")
            }
        }
    }
}


@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }

    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp),
        color = Color.DarkGray,
    ) {
        Column {
            Text(text = "Ever The Best", color = Color.White)
            // Add more items to the drawer here
        }
    }
}
//
@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomAppBar (
    ){
        NavigationBar(
        ) {
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Home",
                        tint = Color.White
                    )
                },
                selected = selectedIndex.value == 0,
                onClick = {
                    selectedIndex.value = 0
                    navController.navigate(HOME_URL)
                }
            )
//           NavigationBarItem(
//                icon = {
//                    Icon(
//                        imageVector = Icons.Default.Favorite,
//                        contentDescription = "Admin",
//                        tint = Color.White
//                    )
//                },
//                selected = selectedIndex.value == 1,
//                onClick = {
//                    selectedIndex.value = 1
//                    navController.navigate(VIEW_PRODUCTS_URL)
//                }
//            )
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile",
                        tint = Color.White
                    )
                },
                selected = selectedIndex.value == 2,
                onClick = {
                    selectedIndex.value = 2
                    navController.navigate(ROUTE_ADMIN)
                }
            )
        }
    }
}
@Preview
@Composable
private fun Homescrnprev() {
    HomeScreen(navController = rememberNavController())
}