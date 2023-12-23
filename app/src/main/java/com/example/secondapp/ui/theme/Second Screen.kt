package com.example.secondapp.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontLoadingStrategy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondapp.R

@Composable
fun SecondScreen() {
    Column(modifier = Modifier.background(color = Color.White)) {
        Row {

            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "Discover",
                fontSize = 30.sp,
                fontWeight = FontWeight.W900,
                color = Color.Black,
                fontFamily = FontFamily(
                    Font(R.font.charm, loadingStrategy = FontLoadingStrategy.Async)
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                modifier = Modifier.padding(start = 0.dp, top = 25.dp, end = 20.dp),
                imageVector = Icons.Default.Search,
                contentDescription = "Search icon",
                tint = Color.Black

            )
        }
        Row {
            Text(
                modifier = Modifier.padding(start = 20.dp, top = 14.dp, bottom = 45.dp),
                text = "Just for you",
                fontSize = 22.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.weight(1f))
        }

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            modifier = Modifier
                .padding(start = 20.dp)
                .size(287.dp)
                .border(BorderStroke(3.dp, Color.LightGray), shape = RoundedCornerShape(10.dp))
                .padding(end = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dinoo),
                contentDescription = "Dino",
                modifier = Modifier
                    // .padding(start = 0.dp, end = 6.dp, top = 60.dp, bottom = 6.dp)
                    .size(184.dp)
            )
            Text(
                text = "    What makes great art, great",
                color = Color.Black,
                fontWeight = FontWeight.W600,
                fontSize = 22.sp,
            )
            Text(text = "    The know-how to help you out", fontSize = 20.sp, color = Color.Black)


            Row {
                Icon(
                    modifier = Modifier.padding(start = 20.dp, top = 17.dp),
                    imageVector = Icons.Default.Face,
                    contentDescription = "duration icon",
                    tint = Color.Black
                )
                Text(
                    text = " 11 min listen",
                    color = Color.Black,
                    modifier = Modifier.padding(top = 17.dp)
                )
                Spacer(
                    modifier = Modifier.weight(1f)
                )
            }
        }

        Row {
                Text(
                    text = "Art",
                    modifier = Modifier.padding(start = 22.dp, top = 50.dp, end = 315.dp, bottom = 13.dp),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black
                )

           // Spacer(modifier = Modifier.weight(1f))
            Text(modifier = Modifier.padding(top = 50.dp),
                text = "More",
                fontWeight = FontWeight.W400,
                color = Color.DarkGray)
        }
        Row {

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.hsl(259f, 0.9f, 0.83f)
                ), modifier = Modifier.padding(start = 20.dp, end = 5.dp)


            ) {
                Text(
                    modifier = Modifier.padding(top = 15.dp),
                    text = "Is art subjective",
                    fontSize = 25.sp,
                    color = Color.Black
                )
                Text(
                    text = "or objective", fontSize = 25.sp, color = Color.Black
                )
                Text(
                    modifier = Modifier.padding(top = 15.dp),
                    text = "Let a contemporary artist",
                    color = Color.DarkGray
                )
                Text(text = "inspire your creativity", color = Color.DarkGray)
                Row {
                    Icon(
                        modifier = Modifier.padding(start = 0.dp, top = 15.dp),
                        imageVector = Icons.Default.Face,
                        contentDescription = "duration icon",
                        tint = Color.DarkGray
                    )
                    Text(
                        modifier = Modifier.padding(start = 0.dp, top = 15.dp),
                        text = "4 min listen",
                        color = Color.DarkGray
                    )
                }
            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.hsl(347f, 0.9f, 0.75f)
                ), modifier = Modifier.padding(start = 23.dp)

            ) {
                Text(
                    modifier = Modifier.padding(start = 7.dp, top = 15.dp),
                    text = "What makes Van ",
                    fontSize = 25.sp,
                    color = Color.White
                )
                Text(
                    modifier = Modifier.padding(start = 7.dp),
                    text = "Gogh so famous",
                    fontSize = 25.sp,
                    color = Color.White
                )

                Text(
                    modifier = Modifier.padding(start = 7.dp, top = 15.dp),
                    text = "Painter here eager to",
                    color = Color.White
                )
                Text(
                    modifier = Modifier.padding(start = 7.dp),
                    text = "talk to you",
                    color = Color.White
                )
                Row {
                    Icon(
                        modifier = Modifier.padding(start = 6.dp, top = 15.dp),
                        imageVector = Icons.Default.Face,
                        contentDescription = "duration icon",
                        tint = Color.White
                    )
                    Text(
                        modifier = Modifier.padding(start = 5.dp, top = 15.dp),
                        text = "5 min listen",
                        color = Color.White
                    )
                }
            }
        }
    }
}

