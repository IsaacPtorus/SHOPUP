//package com.apk.shopup.myconstructs
//
//
//
//import android.annotation.SuppressLint
//import android.app.ProgressDialog
//import androidx.activity.compose.BackHandler
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.foundation.lazy.grid.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AccountCircle
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.Card
//import androidx.compose.material3.CenterAlignedTopAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableIntStateOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.google.firebase.Firebase
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.firestore.FirebaseFirestore
//import com.google.firebase.firestore.SetOptions
//import com.google.firebase.firestore.firestore
//import com.google.firebase.firestore.ktx.toObject
//
//
//private var progressDialog: ProgressDialog? = null
//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun DashboardScreen(navController: NavHostController)  {
//    var school by remember { mutableStateOf("") }
//    var name by remember { mutableStateOf("") }
//    val currentUser = FirebaseAuth.getInstance().currentUser
//    val firestore = FirebaseFirestore.getInstance()
//    var user: User? by remember { mutableStateOf(null) }
//    var isLoading by remember { mutableStateOf(true) }
//    var studentCount by remember { mutableIntStateOf(0) }
//    var currentPassword by remember { mutableStateOf("") }
//    var newPassword by remember { mutableStateOf("") }
//    var confirmPassword by remember { mutableStateOf("") }
//
//    var loading by remember { mutableStateOf(false) }
//
//    val firestores = Firebase.firestore
//
//
//    val context = LocalContext.current
//
//    BackHandler {
//        navController.popBackStack()
//
//    }
//
//
//    // Fetch user details from Firestore
//    LaunchedEffect(key1 = currentUser?.uid) {
//        if (currentUser != null) {
//            val userDocRef = firestore.collection("users").document(currentUser.uid)
//            userDocRef.get()
//                .addOnSuccessListener { document ->
//                    if (document.exists()) {
//                        user = document.toObject<User>()
//                    }
//                    isLoading = false
//                }
//                .addOnFailureListener { e ->
//                    // Handle failure
//                    isLoading = false
//                }
//        }
//    }
//
//    LaunchedEffect(Unit) {
//        firestores.collection("Students")
//            .get()
//            .addOnSuccessListener { result ->
//                studentCount = result.size()
//            }
//            .addOnFailureListener { exception ->
//                // Handle failures
//            }
//    }
//
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(text = "Dashboard", color = Color.White, fontSize = 30.sp)
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color(0xff0FB06A),
//                    titleContentColor = Color.White,
//                ),
//                navigationIcon = {
//                    IconButton(onClick = {}) {
//                        Icon(Icons.Filled.ArrowBack, "backIcon",tint = Color.White)
//                    }
//                },
//
//
//
//                )
//        }, content = {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color(0xff9AEDC9)),
////                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//
//            ) {
//
//
////                            Dashboard starts here
//
//                val dashboardItems = listOf(
//                    DashboardItemData(
//                        title = "Profile",
//                        icon = Icons.Default.AccountCircle,
//                        badgeCount = 0,
//                        onClick = {
//                            // Navigate to profile screen
//                        }
//                    ),
//                    DashboardItemData(
//                        title = "Settings",
//                        icon = Icons.Default.Settings,
//                        badgeCount = 3,
//                        onClick = {
//                            // Navigate to settings screen
//                        }
//                    ),
//                    DashboardItemData(
//                        title = "Students",
//                        icon = Icons.Default.Person,
//                        badgeCount = 4,
//                        onClick = {
//                            // Navigate to messages screen
//                        }
//                    ),
//                    // Add more dashboard items as needed
//                )
//
//
//
//                LazyVerticalGrid(
//                    columns = GridCells.Fixed(2),
//                    modifier = Modifier.padding(16.dp)
//                ) {
//                    items(dashboardItems) { item ->
//                        DashboardItem(item)
//                    }
//                }
//
//
//
//
//
//
////                            Dashboard ends here
//
//
//
//
//
//            }
//
//        })
//
//}
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
//@Composable
//fun DashboardItem(item: DashboardItemData) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        shape = RoundedCornerShape(8.dp),
////        elevation = CardElevation.8.dp,
////        backgroundColor = Color.White,
//        onClick = item.onClick
//    ) {
//        Row(
//            modifier = Modifier
//                .padding(16.dp)
//                .fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Icon(
//                imageVector = item.icon,
//                contentDescription = "Dashboard Icon",
//                tint = Color.Black,
//                modifier = Modifier.size(36.dp)
//            )
//            Spacer(modifier = Modifier.width(16.dp))
//            Text(
//                text = item.title,
//                style = MaterialTheme.typography.bodyLarge,
//                color = Color.Black
//            )
//            // Add a badge if the badge count is greater than 0
//            if (item.badgeCount > 0) {
//                Badge(count = item.badgeCount)
//            }
//        }
//    }
//}
//@Composable
//fun Badge(count: Int) {
//    Box(
//        modifier = Modifier
//            .padding(start = 8.dp)
//            .size(20.dp)
//            .clip(CircleShape)
//            .background(Color.Red),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = count.toString(),
//            style = MaterialTheme.typography.bodyMedium,
//            color = Color.White
//        )
//    }
//}
//data class DashboardItemData(
//    val title: String,
//    val icon: ImageVector,
//    val badgeCount: Int,
//    val onClick: () -> Unit
//)
//data class User(
//    val userId: String = "",
//    val school: String = "",
//    val name: String = ""
//)
//
//fun saveUserDetails(user: User, param: (Any) -> Unit) {
//    val firestore = FirebaseFirestore.getInstance()
//    firestore.collection("users").document(user.userId)
//        .set(user, SetOptions.merge())
//        .addOnSuccessListener {
//
//            progressDialog?.dismiss()
//            // Success message or navigation
//        }
//        .addOnFailureListener {
//
//            progressDialog?.dismiss()
//            // Handle failure
//        }
//}
//
//@Preview
//@Composable
//private fun Dashprev() {
//    DashboardScreen(navController = rememberNavController())
//}