package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp(
                        Modifier
                            .fillMaxSize()
                            .wrapContentSize()
                    )
                }
            }
        }
    }
}

@Composable
fun LemonadeApp( modifier: Modifier = Modifier) {
    Column (modifier=modifier){
        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ }

            ) {
                Image(
                    painter = painterResource(id = R.drawable.lemon_tree),
                    contentDescription = stringResource(R.string.lemmon_tree)
                )
            }
            Spacer(modifier = Modifier.height(72.dp))

            Text(
                text = stringResource(R.string.tap_the_lemon_tree),
                fontSize =18.sp
            )
        }
        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ }

            ) {
                Image(
                    painter = painterResource(id = R.drawable.lemon_squeeze),
                    contentDescription = stringResource(R.string.lemon)
                )

                Spacer(modifier = Modifier.height(72.dp))

                Text(text = stringResource(R.string.keep_tapping_the_lemon_to_squeeze_it),
                    fontSize = 18.sp
                )
            }
        }

        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ }

            ) {
                Image(
                    painter = painterResource(id = R.drawable.lemon_drink),
                    contentDescription = stringResource(R.string.glass_of_lemonade)
                )

                Spacer(modifier = Modifier.height(72.dp))

                Text(text = stringResource(R.string.tap_the_lemonade_to_drink_it),
                    fontSize = 18.sp
                )
            }
        }

        Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
            Button(onClick = { /*TODO*/ }

            ) {
                Image(
                    painter = painterResource(id = R.drawable.lemon_restart),
                    contentDescription = stringResource(R.string.empty_glass)
                )

                Spacer(modifier = Modifier.height(72.dp))

                Text(text = stringResource(R.string.tap_the_empty_glass_to_start_again),
                    fontSize = 18.sp
                )
            }
        }
    }

}







@Preview(showBackground = true)
@Composable
fun LemonadePreview() {
    LemonadeTheme {
        LemonadeApp(
            Modifier
                .fillMaxSize()
                .wrapContentSize()
        )
    }
}