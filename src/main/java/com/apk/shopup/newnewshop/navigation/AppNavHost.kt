//package com.apk.shopup.newnewshop.navigation
//
////import net.ezra.ui.SplashScreen
////import net.ezra.ui.auth.LoginScreen
////import net.ezra.ui.auth.SignUpScreen
////import net.ezra.ui.auth.SignupScreen
//import androidx.activity.compose.BackHandler
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.apk.shopup.newnewshop.about.AboutScreen
//import com.apk.shopup.newnewshop.dashboard.DashboardScreen
//import com.apk.shopup.newnewshop.home.HomeScreen
//import com.apk.shopup.newnewshop.products.AddProductScreen
//import com.apk.shopup.newnewshop.products.ProductDetailScreen
//import com.apk.shopup.newnewshop.products.productListScreen
//
////import net.ezra.ui.students.AddStudents
////import net.ezra.ui.students.Search
////import net.ezra.ui.students.Students
//
//@Composable
//fun AppNavHost(
//    modifier: Modifier = Modifier,
//    navController: NavHostController = rememberNavController(),
//    startDestination: String = ROUTE_HOME
//
//
//) {
//
//
//    BackHandler {
//        navController.popBackStack()
//
//        }
//    NavHost(
//        modifier = modifier,
//        navController = navController,
//        startDestination = startDestination
//    ) {
//
//
//        composable(ROUTE_HOME) {
//            HomeScreen(navController)
//        }
//
//
//        composable(ROUTE_ABOUT) {
//            AboutScreen(navController)
//        }
//
//
////        composable(ROUTE_ADD_STUDENTS) {
////            AddStudents(navController)
////        }
////
////        composable(ROUTE_SPLASH) {
////            SplashScreen(navController)
////        }
////
////        composable(ROUTE_VIEW_STUDENTS) {
////           Students(navController = navController, viewModel = viewModel() )
////        }
////
////        composable(ROUTE_SEARCH) {
////            Search(navController)
////        }
//
//        composable(ROUTE_DASHBOARD) {
//            DashboardScreen(navController)
//        }
//
////        composable(ROUTE_REGISTER) {
////           SignUpScreen(navController = navController) {
////
////           }
////        }
////
////        composable(ROUTE_LOGIN) {
////            LoginScreen(navController = navController){}
////        }
//
//        composable(ROUTE_ADD_PRODUCT) {
//            AddProductScreen(navController = navController){}
//        }

//        composable(ROUTE_VIEW_PROD) {
//            productListScreen(navController = navController, products = listOf() )
//        }
//        composable("productDetail/{productId}") { backStackEntry ->
//            val productId = backStackEntry.arguments?.getString("productId") ?: ""
//            ProductDetailScreen(navController, productId)
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}