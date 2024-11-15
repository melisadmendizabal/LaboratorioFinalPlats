package com.uvg.laboratoriofinal.presentation.listadoAsserts

import androidx.navigation.compose.composable
import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

@Serializable
data object ListadoAssertsDestination

fun NavGraphBuilder.listadoAsserts(

){
    composable<ListadoAssertsDestination>{
        ListadoAssertsRoute(

        )
    }
}