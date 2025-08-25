package com.example.realestateapplication.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestateapplication.R
import com.example.realestateapplication.ui.components.CategoriesRow
import com.example.realestateapplication.ui.components.HeaderSection
import com.example.realestateapplication.ui.components.PropertyCard
import com.example.realestateapplication.ui.components.SearchRow

@Composable
@Preview
fun MainScreen() {
    val items = remember { sampleProperties() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(color = colorResource(R.color.light_grey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item { HeaderSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item{ SearchRow() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { CategoriesRow() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        items(items){property -> PropertyCard(property) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}