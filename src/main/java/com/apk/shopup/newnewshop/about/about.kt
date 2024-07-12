package com.apk.shopup.newnewshop.about

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.shopup.navigation.HOME_URL
import com.apk.shopup.navigation.ROUTE_ABOUT


@Composable
fun AboutScreen(navController: NavHostController) {




    Column {
        Text(text = "Welcome to SHOPUP, your go-to online shopping destination! Discover a curated selection of fashion, home decor, gadgets, and gifts—all at your fingertips. With SHOPUP, shopping is easy, enjoyable, and tailored to your preferences. Experience the future of online shopping with us today!Welcome to SHOPUP, your go-to online shopping destination! Discover a curated selection of fashion, home decor, gadgets, and gifts—all at your fingertips. With SHOPUP, shopping is easy, enjoyable, and tailored to your preferences. Experience the future of online shopping with us today!")

//        Text(text = stringResource(id = R.string.Trap))

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(HOME_URL) {
                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                    }
                },
            text = "Home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

