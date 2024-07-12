package com.apk.shopup


//import androidx.compose.material.Icon
//import androidx.compose.material.IconButton
//import androidx.compose.material.TopAppBar
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.apk.shopup.navigation.ROUT_HOME

//import com.example.firebasestorage.navigation.ROUT_HOME
//import com.example.firebasestorage.navigation.ROUT_SIGNUP
//import com.example.firebasestorage.ui.theme.FirebasestorageTheme

class LocationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleMap()
        }
    }
}

@SuppressLint("SetJavaScriptEnabled")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoogleMap(){

    val mContext= LocalContext.current

    Column (modifier = Modifier.fillMaxSize()){

        //TopAppBar
        TopAppBar(title = { Text(text = "Sign in") },
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, ROUT_HOME::class.java))
                }){
                    Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = "arrowback")
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent= Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                }) {
                    Icon(imageVector = Icons.Filled.Share , contentDescription = "share")
                }
                IconButton(onClick = {
                    val settingsIntent= Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(imageVector = Icons.Filled.Settings , contentDescription = "settings")
                }
            },
//            backgroundColor = Color.Green)
            modifier = Modifier.background(Color.Green),)

        //WebView

        val mUrl="https://maps.google.com/maps"
        AndroidView(factory = {
            WebView(it).apply {
                settings.javaScriptEnabled=true
                layoutParams=ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient= WebViewClient()
                loadUrl(mUrl)
            }
        })

    }

}


@Preview(showBackground = true)
@Composable
fun GoogleMapPreview(){
    GoogleMap()

}