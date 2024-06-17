package com.example.bike_coop
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun LoginScreem() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)){
        Login(Modifier.align(Alignment.Center))
        println("hola")
    }

}

@Composable
fun Login(modifier: Modifier) {
    Column(modifier = modifier) {
        HeaderImage()
        Spacer(Modifier.padding(4.dp))
        Titulo(Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.padding(16.dp))
        EmailField()
        Spacer(Modifier.padding(4.dp))
        PasswordField()
        Spacer(Modifier.padding(8.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(Modifier.padding(16.dp))
        LoginButton()



    }
}


@Composable
fun Titulo(modifier: Modifier) {
    Text(
        text = "Bike Coop",
        modifier = modifier,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFFFFFFF)
    )
}

@Composable
fun LoginButton() {
    Button(onClick = {},
        Modifier
            .fillMaxWidth()
            .height(48.dp)) {
        Text(text = "Iniciar sesión")
        
    }

    
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "Olvidaste la contraseña?",
        modifier = modifier.clickable {},
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFFF9800)
    )
}

@Composable
fun PasswordField() {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = { Text(text = "contraseña") },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
    )
}


@Composable
fun EmailField() {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = { Text(text = "Email") },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
    )
}


@Composable
fun HeaderImage() {
    Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo",modifier = Modifier.clip(
        CircleShape) )
}


