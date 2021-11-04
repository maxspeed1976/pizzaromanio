package ru.s.pizza.serverWork

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.s.pizza.R
import ru.s.pizza.foodAdapters.DessertAdapter
import ru.s.pizza.foodAdapters.DrinkAdapter
import ru.s.pizza.foodAdapters.PizzaAdapter
import ru.s.pizza.models.food.Dessert
import ru.s.pizza.models.food.Drink
import ru.s.pizza.models.food.Pizza

class Server () {

    private val retrofitImpl: RetrofitImpl = RetrofitImpl()

    fun isOnline(): Boolean {

        return true
    }

    fun sendServerRequestDessert(context: Context?, list: RecyclerView, i: Int, listDessert: ArrayList<Dessert>): List<Dessert> {

        return retrofitImpl.getDessert()
    }

    fun sendServerRequestPizza(context: Context?, list: RecyclerView, i: Int, listPizza: ArrayList<Pizza>): ArrayList<Pizza> {

        return retrofitImpl.getPizza()
    }


    fun sendServerRequestDrink(context: Context?, list: RecyclerView, i: Int, listPizza: ArrayList<Drink>): List<Drink> {

        return retrofitImpl.getDrink()
    }


}
