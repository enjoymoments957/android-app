package com.example.momentsIndia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.momentsIndia.pages.LoadingPage
import com.example.momentsIndia.pages.QRScannerPage
import com.example.momentsIndia.models.CompanyInfo

@Composable
fun AppNavigation(companyInfo: CompanyInfo) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "loading") {
        composable("loading") {
            LoadingPage(
                info = companyInfo,
                onNavigateToQRScanner = { navController.navigate("qrScanner") }
            )
        }
        composable("qrScanner") {
            QRScannerPage()
        }
    }
}