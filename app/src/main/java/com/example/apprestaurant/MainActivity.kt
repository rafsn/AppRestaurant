package com.example.apprestaurant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.apprestaurant.list_item.FoodItem
import com.example.apprestaurant.model.Food
import com.example.apprestaurant.ui.theme.AppRestaurantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodList()
        }
    }
}

@Composable
fun FoodList() {
    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Macarrão à Carbonara",
            foodDescription = "Acompanhamentos: Arros, batata frita e camarão",
            price = "$ 120,00"
        ),

        Food(
            imgFood = R.drawable.food2,
            foodName = "Sushi de Salmão",
            foodDescription = "Acompanhamentos: arroz japonês com tempurá e wasabi",
            price = "$ 80,00"
        ),
        Food(
            imgFood = R.drawable.food3,
            foodName = "Picanha ao Forno",
            foodDescription = "Acompanhamentos: salada c/ couve flor e cenoura, molho barbecue e pastel",
            price = "$ 75,00"
        ),

        Food(
            imgFood = R.drawable.food4,
            foodName = "Pão de Alho",
            foodDescription = "Acompanhamentos: batata frita e arroz branco",
            price = "$ 65,00"
        ),

        Food(
            imgFood = R.drawable.food5,
            foodName = "Macarrão com queijo",
            foodDescription = "Acompanhamentos: queijo parmesão com farofa de bacon",
            price = "$ 95,00"
        ),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray)
    ) {
        LazyColumn {
            itemsIndexed(foodList) { _, food ->
                FoodItem(food)
            }
        }
    }
}
