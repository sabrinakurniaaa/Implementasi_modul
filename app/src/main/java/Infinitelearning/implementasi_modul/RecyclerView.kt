package Infinitelearning.implementasi_modul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.paneer_butter_masala, "Paneer Butter Masala"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.dosa, "Dosa"))

        foodList.add(Food(R.drawable.veg_biryani, "Veg Biryani"))

        foodList.add(Food(R.drawable.paneer_butter_masala, "Paneer Butter Masala"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.dosa, "Dosa"))
        foodList.add(Food(R.drawable.veg_biryani, "Veg Biryani"))

        foodList.add(Food(R.drawable.paneer_butter_masala, "Paneer Butter Masala"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.dosa, "Dosa"))
        foodList.add(Food(R.drawable.veg_biryani, "Veg Biryani"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter
    }
}