package ru.s.pizza.serverWork

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.s.pizza.R
import ru.s.pizza.models.food.Dessert
import ru.s.pizza.models.food.Drink
import ru.s.pizza.models.food.Pizza

class RetrofitImpl {

    fun getPizza(): ArrayList<Pizza> {
        val pizzaList= arrayListOf(
            Pizza(1,"Маргарита","120","650,1200","помидор, сыр, моцарелла",
                R.drawable.a4),
            Pizza(2,"Сальмоне","130","800","лосось, сыр, помидоры", R.drawable.a1),
            Pizza(3,"Мясная","150","950","лосось, сыр, помидоры", R.drawable.a2),
            Pizza(3,"Охотничья","250","1050","лосось, сыр, помидоры", R.drawable.a3

            )
        )

        val pizzaArrayList = pizzaList
        return pizzaArrayList
    }

    fun getDessert(): List<Dessert> {
        val dessertList = listOf(Dessert(1,"Маргарита",120f,13f,1,"dddd",1))
        return dessertList
    }

    fun getDrink(): List<Drink> {
        val drinkList = listOf(Drink(1,"Cola",1,30f,"30",0.5f,"dsdsd"))
        return drinkList
    }


}