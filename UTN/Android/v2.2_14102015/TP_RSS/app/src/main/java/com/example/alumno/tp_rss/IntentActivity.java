package com.example.alumno.tp_rss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_intent);

        /*intent explicitos*/
        Intent intent = getIntent();

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("urlNoticia");

        WebView noticiaWeb = (WebView)findViewById(R.id.webViewNoticia);
        WebSettings webSettings = noticiaWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);

        noticiaWeb.loadUrl(url);

    }

    /*Sobrescribo el metodo onStop para que al querer cerrar el WebView retorne que vuelve OK*/
    @Override
    protected void onStop() {
        super.onStop();

        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        super.finish();
    }

}
