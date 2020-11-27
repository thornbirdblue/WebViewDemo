package cc.thornbird.mywebview

import android.R
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var m_WebSettings: WebSettings
    private val url = "http://113.118.216.99:8000/hellotj.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        webView = WebView(this)
        m_WebSettings = webView.settings
        m_WebSettings.setJavaScriptEnabled(true)
        webView.loadUrl(url)

        setContentView(webView)
    }
}