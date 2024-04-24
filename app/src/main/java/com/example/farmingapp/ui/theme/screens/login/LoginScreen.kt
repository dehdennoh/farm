package com.example.farmingapp.ui.theme.screens.login

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_SIGNUP

@Composable
fun LoginScreen(navController : NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Login here")

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(
            value = email ,
            onValueChange = {email=it},
            placeholder = { Text(text = "Email")},
            )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password ,
            onValueChange = {password=it},
            placeholder = { Text(text = "password")},
            )
        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
            // HANDLE LOGIN LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.login(email.text,password.text)

        }) {
            Text(text = "Login")
        }

        Button(onClick = {
            navController.navigate(ROUT_SIGNUP)
        }) {
            Text(text = "No account? Signup")
        }
        val mContext = LocalContext.current
        Button(onClick = {
        }, ) {
            Text(text = "Next")
        }

    }
}

@Preview  (showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}