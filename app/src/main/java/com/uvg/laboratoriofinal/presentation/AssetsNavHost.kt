package com.uvg.laboratoriofinal.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.uvg.laboratoriofinal.presentation.listadoAsserts.ListadoAssertsDestination
import com.uvg.laboratoriofinal.presentation.listadoAsserts.listadoAsserts

@Composable
fun AssetsNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination =ListadoAssertsDestination,
        modifier = modifier
    ){
        listadoAsserts()


    }

}