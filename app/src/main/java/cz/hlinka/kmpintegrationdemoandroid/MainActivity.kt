package cz.hlinka.kmpintegrationdemoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cz.hlinka.kmpintegrationdemo.Greeter
import cz.hlinka.kmpintegrationdemoandroid.ui.theme.KMPIntegrationDemoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KMPIntegrationDemoAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = Greeter().greet(),
        modifier = modifier,
        style = TextStyle(
            fontSize = 24.sp
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KMPIntegrationDemoAndroidTheme {
        Greeting()
    }
}