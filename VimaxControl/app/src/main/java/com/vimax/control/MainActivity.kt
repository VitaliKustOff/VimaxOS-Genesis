package com.vimax.control

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vimax.control.ui.theme.FerrariTheme
import com.vimax.control.ui.theme.FerrariRed
import com.vimax.control.ui.theme.SafeGreen
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            FerrariTheme {

                VimaxDashboard()

            }

        }
    }
}


@Composable
fun VimaxDashboard() {

    var columnTemp by remember { mutableStateOf(27.2) }
    var boilerTemp by remember { mutableStateOf(79.1) }
    var pressure by remember { mutableStateOf(101.52) }
    var heater by remember { mutableStateOf(75f) }


    LaunchedEffect(Unit) {

        while (true) {

            columnTemp += 0.1
            boilerTemp += 0.05
            pressure += 0.01

            if (columnTemp > 95)
                columnTemp = 27.2

            if (boilerTemp > 100)
                boilerTemp = 79.1

            if (pressure > 103)
                pressure = 101.52

            delay(1000)

        }
    }


    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050505))
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {


        Text(

            text = "VIMAX CONTROL",

            fontSize = 34.sp,

            color = FerrariRed

        )


        Text(

            text = "GENESIS COCKPIT v0.1",

            fontSize = 18.sp,

            color = Color.White

        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        VimaxPanel("СИСТЕМА") {

            Text(
                "🟡 ДЕМО РЕЖИМ",
                color = Color.Yellow,
                fontSize = 20.sp
            )

            Text(
                "ESP32: ожидание подключения"
            )

            Text(
                "WiFi: поиск сети"
            )

            Text(
                "IP: 192.168.4.1"
            )

        }



        VimaxPanel("ТЕМПЕРАТУРЫ") {

            Text(
                "🔥 Колонна %.1f °C"
                    .format(columnTemp),
                fontSize = 22.sp
            )

            Text(
                "♨ Куб %.1f °C"
                    .format(boilerTemp),
                fontSize = 22.sp
            )

        }



        VimaxPanel("ДАВЛЕНИЕ") {

            Text(

                "%.2f kPa"
                    .format(pressure),

                fontSize = 28.sp

            )

        }



        VimaxPanel("МОЩНОСТЬ НАГРЕВА") {


            Text(

                "${heater.toInt()} %",

                fontSize = 28.sp,

                color = FerrariRed

            )


            Slider(

                value = heater,

                onValueChange = {
                    heater = it
                },

                valueRange = 0f..100f

            )

        }



        VimaxPanel("ПРОЦЕСС") {

            Text("⚪ Нагрев")
            Text("⚪ Отбор голов")
            Text("⚪ Тело")
            Text("⚪ Хвосты")

        }



        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Text(

            text = "🟢 VIMAX SAFETY CORE READY",

            color = SafeGreen,

            fontSize = 20.sp

        )

    }

}



@Composable
fun VimaxPanel(

    title:String,

    content:@Composable ColumnScope.() -> Unit

) {


    Card(

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 8.dp),

        shape = RoundedCornerShape(20.dp),

        colors = CardDefaults.cardColors(

            containerColor = Color(0xFF151515)

        )

    ) {


        Column(

            modifier = Modifier.padding(18.dp),

            content = {

                Text(

                    title,

                    color = FerrariRed,

                    fontSize = 22.sp

                )


                Spacer(
                    modifier = Modifier.height(8.dp)
                )


                content()

            }

        )

    }

}