package com.example.convertimate6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material3.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.convertimate6.ui.theme.ConvertiMate6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConvertiMate6Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController) }
                    composable("conversion") { ConversionScreen(navController) }
                    composable("tools") { ToolsScreen(navController) }
                    composable("distance") { DistanceScreen(navController) }
                    composable("time") { TimeScreen(navController) }
                    composable("sound") { SoundScreen(navController) }
                    composable("volume") { VolumeScreen(navController) }
                    composable("weight") { WeightScreen(navController) }
                    composable("temperature") { TemperatureScreen(navController) }
                    composable("periodictable") { PeriodictableScreen(navController) }
                    composable("protractor") { ProtractorScreen(navController) }
                    composable("indiamap") { IndiamapScreen(navController) }
                    composable("worldmap") { WorldmapScreen(navController) }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to ConvertiMate!!! \n\n Let's make your conversions as smooth as possible.",
            color = Color.Black,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Feel free to click on any tool you find necessary.",
            color = Color.Black,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Conversions",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("conversion") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Tools",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("tools") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ConversionScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "-:CONVERSIONS:-",
            color = Color.Black,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Distance",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("distance") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Sound",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("sound") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Temperature",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("temperature") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Time",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("time") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Volume",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("volume") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Weight",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("weight") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
    }
}

@Composable
fun ToolsScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "-:TOOLS:-",
            color = Color.Black,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Protractor",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier

                .fillMaxWidth()
                .clickable { navController.navigate("protractor") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Periodic Table",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("periodictable") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "India Map",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("indiamap") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "World Map",
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate("worldmap") }
                .padding(20.dp)
                .background(Color(0xFF9782BD)),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
    }
}


@Composable
fun WeightScreen(navController: NavController) {
    var enValue by remember { mutableStateOf("") }
    var reValue by remember { mutableStateOf("") }
    var fromUnit by remember { mutableStateOf("kg") }
    var toUnit by remember { mutableStateOf("kg") }
    val radioOptions = listOf("kg", "g", "mg", "ton")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "-:WEIGHT:-",
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            EditText(
                value = enValue,
                onValueChange = { enValue = it },
                placeholder = "Enter value",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(9.dp))
            EditText(
                value = reValue,
                onValueChange = { reValue = it },
                placeholder = "Result",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
        }

        Button(
            onClick = {
                reValue = convertWeight(enValue, fromUnit, toUnit)
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Convert")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = "From: $fromUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "To: $toUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = fromUnit,
                onOptionSelected = { fromUnit = it },
                modifier = Modifier.weight(1f)
            )
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = toUnit,
                onOptionSelected = { toUnit = it },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("conversion") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}

@Composable
fun SoundScreen(navController: NavController) {
    var enValue by remember { mutableStateOf("") }
    var reValue by remember { mutableStateOf("") }
    var fromUnit by remember { mutableStateOf("Bel") }
    var toUnit by remember { mutableStateOf("Bel") }
    val radioOptions = listOf("Bel", "Decibel", "Neper")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "-:SOUND:-",
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            EditText(
                value = enValue,
                onValueChange = { enValue = it },
                placeholder = "Enter value",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(9.dp))
            EditText(
                value = reValue,
                onValueChange = { reValue = it },
                placeholder = "Result",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
        }

        Button(
            onClick = {
                reValue = convertSound(enValue, fromUnit, toUnit)
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Convert")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = "From: $fromUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "To: $toUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioGroup(radioOptions = radioOptions, selectedOption = fromUnit, onOptionSelected = { fromUnit = it }, modifier = Modifier.weight(1f))
            RadioGroup(radioOptions = radioOptions, selectedOption = toUnit, onOptionSelected = { toUnit = it }, modifier = Modifier.weight(1f))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("conversion") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}

@Composable
fun TimeScreen(navController: NavController) {
    var enValue by remember { mutableStateOf("") }
    var reValue by remember { mutableStateOf("") }
    var fromUnit by remember { mutableStateOf("Hours") }
    var toUnit by remember { mutableStateOf("Hours") }
    val radioOptions = listOf("Hours", "Minutes", "Seconds")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "-:TIME:-",
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            EditText(
                value = enValue,
                onValueChange = { enValue = it },
                placeholder = "Enter value",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(9.dp))
            EditText(
                value = reValue,
                onValueChange = { reValue = it },
                placeholder = "Result",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
        }

        Button(
            onClick = {
                reValue = convertTime(enValue, fromUnit, toUnit)
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Convert")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = "From: $fromUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "To: $toUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioGroup(radioOptions = radioOptions, selectedOption = fromUnit, onOptionSelected = { fromUnit = it }, modifier = Modifier.weight(1f))
            RadioGroup(radioOptions = radioOptions, selectedOption = toUnit, onOptionSelected = { toUnit = it }, modifier = Modifier.weight(1f))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("conversion") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}


@Composable
fun TemperatureScreen(navController: NavController) {
    var enValue by remember { mutableStateOf("") }
    var reValue by remember { mutableStateOf("") }
    var fromUnit by remember { mutableStateOf("Celsius") }
    var toUnit by remember { mutableStateOf("Celsius") }
    val radioOptions = listOf("Celsius", "Fahrenheit", "Kelvin")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TEMPERATURE:",
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            EditText(
                value = enValue,
                onValueChange = { enValue = it },
                placeholder = "Enter value",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(9.dp))
            EditText(
                value = reValue,
                onValueChange = { reValue = it },
                placeholder = "Result",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
        }

        Button(
            onClick = {
                reValue = convertTemperature(enValue, fromUnit, toUnit)
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Convert")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = "From: $fromUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "To: $toUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = fromUnit,
                onOptionSelected = { fromUnit = it },
                modifier = Modifier.weight(1f)
            )
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = toUnit,
                onOptionSelected = { toUnit = it },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("conversion") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
    }
}

@Composable
fun VolumeScreen(navController: NavController) {
    var enValue by remember { mutableStateOf("") }
    var reValue by remember { mutableStateOf("") }
    var fromUnit by remember { mutableStateOf("Millilitre") }
    var toUnit by remember { mutableStateOf("Millilitre") }
    val radioOptions = listOf("Millilitre", "Litre", "Cubic cm", "Cubic m")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "-:VOLUME:-",
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            EditText(
                value = enValue,
                onValueChange = { enValue = it },
                placeholder = "Enter value",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(9.dp))
            EditText(
                value = reValue,
                onValueChange = { reValue = it },
                placeholder = "Result",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
        }

        Button(
            onClick = {
                reValue = convertVolume(enValue, fromUnit, toUnit)
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Convert")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = "From: $fromUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "To: $toUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = fromUnit,
                onOptionSelected = { fromUnit = it },
                modifier = Modifier.weight(1f)
            )
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = toUnit,
                onOptionSelected = { toUnit = it },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("conversion") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}

@Composable
fun DistanceScreen(navController: NavController) {
    var enValue by remember { mutableStateOf("") }
    var reValue by remember { mutableStateOf("") }
    var fromUnit by remember { mutableStateOf("Millimetre") }
    var toUnit by remember { mutableStateOf("Millimetre") }
    val radioOptions = listOf("Millimetre", "Centimetre", "Metre", "Kilometre")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC2B3DF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "-:DISTANCE:-",
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            EditText(
                value = enValue,
                onValueChange = { enValue = it },
                placeholder = "Enter value",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(9.dp))
            EditText(
                value = reValue,
                onValueChange = { reValue = it },
                placeholder = "Result",
                keyboardType = KeyboardType.Number,
                modifier = Modifier.weight(1f)
            )
        }

        Button(
            onClick = {
                reValue = convertDistance(enValue, fromUnit, toUnit)
            },
            modifier = Modifier
                .padding(bottom = 20.dp)
        ) {
            Text(text = "Convert")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = "From: $fromUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "To: $toUnit",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = fromUnit,
                onOptionSelected = { fromUnit = it },
                modifier = Modifier.weight(1f)
            )
            RadioGroup(
                radioOptions = radioOptions,
                selectedOption = toUnit,
                onOptionSelected = { toUnit = it },
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("conversion") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}

@Composable
fun ProtractorScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.protractor),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("tools") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}

@Composable
fun IndiamapScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.india),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(
                onClick = { navController.navigate("home") },
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(text = "Home")
            }
            Button(
                onClick = { navController.navigate("tools") },
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(text = "Back")
            }
        }
    }
}

@Composable
fun WorldmapScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.worldmap),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(
                onClick = { navController.navigate("home") },
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(text = "Home")
            }
            Button(
                onClick = { navController.navigate("tools") },
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(text = "Back")
            }
        }
    }
}

@Composable
fun PeriodictableScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.periodictable),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("tools") },
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = "Back")
        }
    }
}
}
@Composable
fun EditText(value: String, onValueChange: (String) -> Unit, placeholder: String, modifier: Modifier = Modifier, keyboardType: KeyboardType = KeyboardType.Text) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = { Text(text = placeholder) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyboardType),
        modifier = modifier
            .padding(15.dp)
            .background(Color(0xFF9782BD))
    )
}

@Composable
fun RadioGroup(radioOptions: List<String>, selectedOption: String, onOptionSelected: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        radioOptions.forEach { text ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) }
                )
                Text(
                    text = text,
                    fontSize = 20.sp
                )
            }
        }
    }
}

fun convertWeight(value: String, fromUnit: String, toUnit: String): String {
    val weight = value.toDoubleOrNull() ?: return ""
    val weightInKg = when (fromUnit) {
        "kg" -> weight
        "g" -> weight / 1000
        "mg" -> weight / 1_000_000
        "ton" -> weight * 1000
        else -> weight
    }
    val convertedWeight = when (toUnit) {
        "kg" -> weightInKg
        "g" -> weightInKg * 1000
        "mg" -> weightInKg * 1_000_000
        "ton" -> weightInKg / 1000
        else -> weightInKg
    }
    return convertedWeight.toString()
}

fun convertVolume(value: String, fromUnit: String, toUnit: String): String {
    val volumeValue = value.toDoubleOrNull() ?: return ""
    val volumeInLiters = when (fromUnit) {
        "Millilitre" -> volumeValue / 1000
        "Litre" -> volumeValue
        "Cubic cm" -> volumeValue / 1000
        "Cubic m" -> volumeValue * 1000
        else -> volumeValue
    }
    val convertedVolume = when (toUnit) {
        "Millilitre" -> volumeInLiters * 1000
        "Litre" -> volumeInLiters
        "Cubic cm" -> volumeInLiters * 1000
        "Cubic m" -> volumeInLiters / 1000
        else -> volumeInLiters
    }
    return convertedVolume.toString()
}

fun convertSound(value: String, fromUnit: String, toUnit: String): String {
    val soundValue = value.toDoubleOrNull() ?: return ""
    val soundInBel = when (fromUnit) {
        "Bel" -> soundValue
        "Decibel" -> soundValue / 10
        "Neper" -> soundValue * 0.8686
        else -> soundValue
    }
    val convertedSound = when (toUnit) {
        "Bel" -> soundInBel
        "Decibel" -> soundInBel * 10
        "Neper" -> soundInBel / 0.8686
        else -> soundInBel
    }
    return convertedSound.toString()
}

fun convertTime(value: String, fromUnit: String, toUnit: String): String {
    val timeValue = value.toDoubleOrNull() ?: return ""
    val timeInSeconds = when (fromUnit) {
        "Hours" -> timeValue * 3600
        "Minutes" -> timeValue * 60
        "Seconds" -> timeValue
        else -> timeValue
    }
    val convertedTime = when (toUnit) {
        "Hours" -> timeInSeconds / 3600
        "Minutes" -> timeInSeconds / 60
        "Seconds" -> timeInSeconds
        else -> timeInSeconds
    }
    return convertedTime.toString()
}

fun convertDistance(value: String, fromUnit: String, toUnit: String): String {
    val distanceValue = value.toDoubleOrNull() ?: return ""
    val distanceInMeters = when (fromUnit) {
        "Millimetre" -> distanceValue / 1000
        "Centimetre" -> distanceValue / 100
        "Metre" -> distanceValue
        "Kilometre" -> distanceValue * 1000
        else -> distanceValue
    }
    val convertedDistance = when (toUnit) {
        "Millimetre" -> distanceInMeters * 1000
        "Centimetre" -> distanceInMeters * 100
        "Metre" -> distanceInMeters
        "Kilometre" -> distanceInMeters / 1000
        else -> distanceInMeters
    }
    return convertedDistance.toString()
}

fun convertTemperature(value: String, fromUnit: String, toUnit: String): String {
    val temp = value.toDoubleOrNull() ?: return ""
    val tempInCelsius = when (fromUnit) {
        "Celsius" -> temp
        "Fahrenheit" -> (temp - 32) * 5 / 9
        "Kelvin" -> temp - 273.15
        else -> temp
    }
    val convertedTemp = when (toUnit) {
        "Celsius" -> tempInCelsius
        "Fahrenheit" -> tempInCelsius * 9 / 5 + 32
        "Kelvin" -> tempInCelsius + 273.15
        else -> tempInCelsius
    }
    return convertedTemp.toString()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ConvertiMate6Theme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen(navController) }
            composable("conversion") { ConversionScreen(navController) }
            composable("tools") { ToolsScreen(navController) }
            composable("distance") { DistanceScreen(navController) }
            composable("time") { TimeScreen(navController) }
            composable("sound") { SoundScreen(navController) }
            composable("volume") { VolumeScreen(navController) }
            composable("weight") { WeightScreen(navController) }
            composable("temperature") { TemperatureScreen(navController) }
            composable("protractor") { ProtractorScreen(navController) }
            composable("periodictable") { PeriodictableScreen(navController) }
            composable("indiamap") { IndiamapScreen(navController) }
            composable("worldmap") { WorldmapScreen(navController) }
        }
    }
}

