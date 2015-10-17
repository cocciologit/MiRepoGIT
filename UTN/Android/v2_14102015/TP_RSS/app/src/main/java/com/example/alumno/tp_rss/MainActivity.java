package com.example.alumno.tp_rss;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback {

    private Handler handler = null;
    private RecyclerView rv = null;
    private List<Noticia> listaNoticias;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.rv = (RecyclerView)findViewById(R.id.list);

        handler = new Handler(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        rv.setLayoutManager(linearLayoutManager);

        ThreadConexion hiloConexion = new ThreadConexion("http://rss.cnn.com/rss/edition.rss", handler);

        /* con imagen por defecto - Ver ThreadPool */
        /*ThreadConexion hiloConexion = new ThreadConexion("http://www.infobae.com/rss/hoy.xml", handler);*/

        Thread hilo = new Thread(hiloConexion);

        hilo.start();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean handleMessage(Message msg) {

        Log.d("handleMessahe", "Recuperacion de noticia con flag: " + msg.arg1);
        if ( msg.arg1 == 0 ) {
            listaNoticias = (List<Noticia>) msg.obj;
            this.adapter = new MyAdapter((List<Noticia>) msg.obj, handler, this);
            rv.setAdapter(this.adapter);
        }
        else
        {
            /*listaPersonas = (List<Persona>) msg.obj;*/
            /*si viene bitmap*/
            Noticia p = this.listaNoticias.get(msg.arg2);
            Log.d("assignBitmapImgNotice", "Asigna bitmap de imagen de noticia " + p.getLinkNoticia());

            /*Si la imagen se esta bajando o fue bajada, no vuelve a asignarla*/
            Log.d( "estadoBajaImg", "Estado de imagen bajando " + p.getImgBajando() );
            if ( p.getImgBajando() == 0 )
            {
                Log.d("asigaBitmap", "Asigna bitmap de imagen de noticia " + p.getLinkNoticia());
                p.setImagenNoticia((Bitmap) msg.obj);
                p.setImgBajando(1);
            }
            /*Cambio mi ImageView*/
            adapter.notifyDataSetChanged();
        }

        return false;
    }

    public void clickNoticia(int posicionNoticiaClickeada ) {
        Noticia notice = listaNoticias.get( posicionNoticiaClickeada );
        Log.d("clickNoticia", "Datos noticia: " + notice.getFecha() + " " + notice.getTitulo() + " " + notice.getLinkNoticia());

        Toast.makeText( this.getBaseContext(), "Accediendo a (" + String.valueOf(posicionNoticiaClickeada) + ")" + notice.getTitulo(), Toast.LENGTH_SHORT).show();

        /*WebView myWebView = (WebView) this.findViewById(R.id.webView2);
        myWebView.loadUrl("https://amatellanes.wordpress.com/");*/
    }
}
