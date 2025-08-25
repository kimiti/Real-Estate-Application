package com.example.realestateapplication.feature.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestateapplication.R
import com.example.realestateapplication.ui.components.TopBar

@Composable
fun ProfileScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.light_grey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item { TopBar(onBack = { navController.navigateUp() }) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(100.dp)
                        .height(220.dp)
                        .clip(RoundedCornerShape(30.dp))
                )
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Sara Anderson",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.black),
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "+12 0123456789",
                    fontSize = 16.sp,
                    color = colorResource(R.color.black)
                )
                Text(
                    text = "saraanderson@gmail.com",
                    fontSize = 16.sp,
                    color = colorResource(R.color.black)
                )
            }

        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}


@Preview
@Composable
fun ProfileScreenPreview() {
    val fakeNavController = rememberNavController()

    ProfileScreen(navController = fakeNavController)
}