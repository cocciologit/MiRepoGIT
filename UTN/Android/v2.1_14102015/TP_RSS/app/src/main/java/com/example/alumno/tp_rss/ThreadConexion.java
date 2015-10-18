package com.example.alumno.tp_rss;

import android.os.Handler;
import android.os.Message;

import java.io.IOException;
import java.util.List;

/**
 * Created by profesor on 17/09/2015.
 */
public class ThreadConexion implements Runnable {

    private String url;
    private Handler h;

    public ThreadConexion(String url, Handler h)
    {
        this.url = url;
        this.h = h;
    }
    @Override
    public void run() {
        HttpManager http =  new HttpManager(url);

        try {
            String resultado = http.getStrDataByGET();
            /*List<Persona> personas = Persona.obtenerListaPersona(resultado);*/

            XmlParser xmlp = new XmlParser(resultado);
            //List<Noticia> noticias = xmlp.obtenerListaPersonaParser();

            List<Noticia> noticias = xmlp.obtenerListaNoticiasParser();

            Message msg= new Message();
            msg.obj = noticias;
            h.sendMessage(msg);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
