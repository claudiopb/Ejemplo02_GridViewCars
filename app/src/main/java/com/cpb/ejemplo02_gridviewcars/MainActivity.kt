package com.cpb.ejemplo02_gridviewcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cpb.ejemplo02_gridviewcars.databinding.ActivityMainBinding

class MainActivity(): AppCompatActivity() {
    var adapter: CochesAdapter? = null
    var listaDeCoches = ArrayList<coche>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        listaDeCoches.add(coche(R.drawable.car,
                "Bowser", "Coche del malvado Bowser",
            "Precio: $350", false))
        listaDeCoches.add(coche(R.drawable.car2,
            "Bowser", "Coche Amarillo",
            "Precio: $750", true))

        adapter = CochesAdapter(this,listaDeCoches)
        binding.gridView.adapter = adapter




    }
}