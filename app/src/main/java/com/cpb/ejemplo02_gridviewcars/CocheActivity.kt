package com.cpb.ejemplo02_gridviewcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cpb.ejemplo02_gridviewcars.databinding.ActivityCocheBinding

class CocheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCocheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_coche)
        binding = ActivityCocheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle: Bundle? = intent.extras
        val imagen = bundle!!.getInt("Imagen")
        val titulo = bundle.getString("Título")
        val descripcion = bundle.getString("Descripción")
        val precio = bundle.getString("Precio")

        binding.imageView.setImageResource(imagen)
        binding.textViewTitulo.text = titulo
        binding.textViewDescripcion.text = descripcion
        binding.textViewPrecio.text = precio

    }
}