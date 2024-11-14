package com.arroyo.proyectofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Importacion de librerias
import android.webkit.WebView
import android.app.Activity
import android.os.Build
import android.window.OnBackInvokedDispatcher
import android.annotation.SuppressLint
import android.view.inputmethod.InputBinding
import com.arroyo.proyectofinal.databinding.ActivityMainBinding
//Importar dependencia para el toolbar
import androidx.appcompat.widget.Toolbar




class MainActivity : AppCompatActivity() {
    private val url="https://jack625a.github.io/TemaPaginaWeb/"
    private lateinit var binding: ActivityMainBinding
    private lateinit var webView: WebView

    //Configuracion del ToolBar como cabecera
    val toolbar:Toolbar=findViewById(R.id.toolbar)

    @SuppressLint("SetJavaScriptEnabled")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Configuracion del Titulo del Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title="Mi aplicacion Prueba"

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        webView=binding.webView

        //Configuracion del manejor del boton retrocedere


        //Habilitaer Javascript
        webView.settings.domStorageEnabled=true
        webView.settings.javaScriptEnabled=true

        //Caragr la url

        webView.loadUrl(url)
    }
}