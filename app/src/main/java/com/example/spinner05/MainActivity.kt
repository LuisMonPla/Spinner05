package com.example.spinner05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    lateinit var txtTitulo: TextView
    lateinit var txtCaracteristicas: TextView
    lateinit var spLenguajes: Spinner
    var lenguajes = arrayOf("JAVA", "KOTLIN", "PHP", "SWIFT", "DART", "JS", "C++", "C#")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inicializar
        txtTitulo = findViewById(R.id.tituloVentana)
        txtCaracteristicas = findViewById(R.id.txtCaracteristica)
        spLenguajes = findViewById(R.id.spLenguajes)
        // crear adaptador
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lenguajes)
        // como se comportara
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, posicion: Int, p3: Long) {
            val valorSeleccionado = lenguajes[posicion]
        Toast.makeText(this, "Selecciono $valorSeleccionado", Toast.LENGTH_LONG).show()

        txtTitulo.text = valorSeleccionado
        when(valorSeleccionado){
            "JAVA" -> txtCaracteristicas.setText("Esta chido java")
            "KOTLIN" -> txtCaracteristicas.setText("Esta chido kotlin")
            "PHP" -> txtCaracteristicas.setText("Esta chido Php")
            "SWIFT" -> txtCaracteristicas.setText("Esta chido swift")
            "DART" -> txtCaracteristicas.setText("Esta chido dart")
            "JS" -> txtCaracteristicas.setText("Esta chido js")
            "C++" -> txtCaracteristicas.setText("Esta chido c++")
            "C#" -> txtCaracteristicas.setText("Esta chido C#")
        }}
    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}