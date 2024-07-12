//package com.apk.shopup.screens.login
//
//import android.content.Intent
//import android.provider.Settings
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CutCornerShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Lock
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.input.PasswordVisualTransformation
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.apk.shopup.data.AuthViewModel
//import com.apk.shopup.navigation.ROUT_SIGNUP
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LoginScreen(navController: NavHostController) {
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    val context = LocalContext.current
//
//    // Load your background image
//    val backgroundImage = painterResource(id = R.drawable.backg)
//
//    Column(modifier = Modifier.fillMaxSize()) {
//
//        // Background image
//        Image(
//            painter = backgroundImage,
//            contentDescription = null,
//            modifier = Modifier.fillMaxSize()
//        )
//
//        //TopAppBar
//        TopAppBar(
//            title = { Text(text = "Sign in") },
//            navigationIcon = {
//                IconButton(onClick = {
//                    navController.navigate(ROUT_SIGNUP)
//                }) {
//                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "arrowback")
//                }
//            },
//            actions = {
//                IconButton(onClick = {
//                    val shareIntent= Intent(Intent.ACTION_SEND)
//                    shareIntent.type="text/plain"
//                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
//                    context.startActivity(Intent.createChooser(shareIntent, "Share"))
//                }) {
//                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
//                }
//                IconButton(onClick = {
//                    val settingsIntent=Intent(Settings.ACTION_SETTINGS)
//                    context.startActivity(settingsIntent)
//                }) {
//                    Icon(imageVector = Icons.Filled.Settings, contentDescription = "settings")
//                }
//            },
//            backgroundColor = Color.Transparent,
//            elevation = 0.dp
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        // Textfields
//        Column(modifier = Modifier.padding(20.dp)) {
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//            OutlinedTextField(
//                value = email,
//                onValueChange = { email = it },
//                shape = RoundedCornerShape(5.dp),
//                modifier = Modifier.fillMaxWidth(),
//                label = { Text(text = "Email Address") },
//                placeholder = { Text(text = "Enter email") },
//                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
//            )
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//            OutlinedTextField(
//                value = password,
//                onValueChange = { password = it },
//                modifier = Modifier.fillMaxWidth(),
//                label = { Text(text = "Password") },
//                placeholder = { Text(text = "Type your password") },
//                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
//                visualTransformation = PasswordVisualTransformation()
//            )
//        }
//
//        // Login Button
//        Button(
//            onClick = {
//                // HANDLE LOGIN LOGIC //
//                var xyz = AuthViewModel(navController, context)
//                xyz.login(email, password)
//            },
//            colors = ButtonDefaults.buttonColors(Color.Green),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp, vertical = 10.dp),
//            shape = CutCornerShape(5.dp)
//        ) {
//            Text(text = "Login")
//        }
//
//        // Signup Text
//        Text(
//            text = "No account? Signup",
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUT_SIGNUP)
//                }
//                .padding(10.dp),
//            fontSize = 15.sp
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    LoginScreen(rememberNavController())
//}
//
