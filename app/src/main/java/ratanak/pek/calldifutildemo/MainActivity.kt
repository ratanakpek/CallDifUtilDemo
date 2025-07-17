package ratanak.pek.calldifutildemo


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // data to populate the RecyclerView with
        // data to populate the RecyclerView with
        val animalNames = ArrayList<String>()
        animalNames.add("Horse")
        animalNames.add("Cow")
        animalNames.add("Camel")


        // set up the RecyclerView

        // set up the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvAnimals)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyRecyclerViewAdapter(this, animalNames)
       // adapter.setClickListener(this)
        recyclerView.adapter = adapter
    }


}