package com.example.tarea4

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class GoogleMapsActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_maps)

        val lat = intent.getDoubleExtra("lat", 0.0)
        val lon = intent.getDoubleExtra("lon", 0.0)

        val url = "https://www.google.com/maps/search/?api=1&query=$lat,$lon"

        val btnRegresar = findViewById<ImageButton>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            finish() // simplemente termina la actividad actual y regresa a MainActivity
        }

        webView = findViewById(R.id.googleWebView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest): Boolean {
                val newUrl = request.url.toString()
                return if (newUrl.startsWith("http") || newUrl.startsWith("https")) {
                    false // permite que el WebView la cargue
                } else {
                    true // bloquea esquemas desconocidos como intent://
                }
            }
        }

        webView.loadUrl(url)
    }
}

