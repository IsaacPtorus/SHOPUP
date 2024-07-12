package com.apk.shopup.navigation

//import com.apk.shopup.newnewshop.products.AddProductScreen
//import com.apk.shopup.newnewshop.products.productListScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.myconstructs.AdminScreen
import com.apk.shopup.myconstructs.PurchaseScreen
import com.apk.shopup.newnewshop.about.AboutScreen
import com.apk.shopup.newnewshop.dashboard.DashboardScreen
import com.apk.shopup.newnewshop.home.HomeScreen
import com.apk.shopup.screens.contact.ContactScreen
import com.apk.shopup.screens.home.OrderProductsScreen
import com.apk.shopup.screens.login.LoginScreen
import com.apk.shopup.screens.signup.SignupScreen
import net.ezra.ui.products.AddProductScreen
import net.ezra.ui.products.ProductDetailScreen
import net.ezra.ui.products.ProductListScreen
import net.ezra.ui.products.ProductViewModel
import net.ezra.ui.products.UpdateProductScreen

//import com.example.firebasestorage.screens.login.LoginScreen
//import com.example.firebasestorage.screens.products.AddProductsScreen
//import com.example.firebasestorage.screens.products.ViewProductsScreen
//import com.example.firebasestorage.screens.signup.SignupScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_CONTACT){
            ContactScreen(navController)
        }
//
//        composable(ROUT_UPLOAD){
//            AddProductScreen(navController=navController)
//      composable(ROUTE_UPDATE) {
//            AddProductScreen(navController = navController){}
//        }
//        composable(VIEW_PRODUCTS_URL){
//            ProductsListScreen(navController = navController)
//        }
//        composable(HOME_URL){
//            MyHomeScreen(navController = navController)
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
//        composable(UPDATE_URL){
//            Update(navController = navController)
//        }
        composable(ROUTE_PURCHASE){
            PurchaseScreen(navController = navController)}

        composable(ROUTE_ADMIN){
            AdminScreen(navController = navController)}

        composable(ROUTE_DASH){
            DashboardScreen(navController = navController)
        }
//        composable(ROUTE_FIRSTHOME){
//            IscoHomeScreen(navController = navController)}
        composable(ROUTE_UPDATE){
            UpdateProductScreen (navController, productId="", productViewModel = ProductViewModel())
        }
        composable(ROUTE_FIRSTORDER){
            OrderProductsScreen(navController)
        }
        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }
//        composable("productDetail/{productId}") { backStackEntry ->
//            val productId = backStackEntry.arguments?.getString("productId") ?: ""
//            ProductDetailScreen(navController, productId)
//        }
//        composable(ROUTE_VIEW_PROD) {
//           ProductListScreen(navController = navController, products = listOf() )
//        }
        composable(ADD_PRODUCTS_URL) {
            AddProductScreen(navController = navController){}
        }
        composable(ROUTE_DASH) {
            DashboardScreen(navController)
        }
        composable(HOME_URL) {
            com.apk.shopup.newnewshop.home.HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(VIEW_PRODUCTS_URL) {
           ProductListScreen(navController = navController, products = listOf() )
        }
        composable(ROUTE_DETAIL) {
            ProductDetailScreen(navController, productId= String())
        }

    }
}