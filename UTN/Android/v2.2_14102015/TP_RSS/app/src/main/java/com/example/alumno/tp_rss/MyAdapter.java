package com.example.alumno.tp_rss;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by profesor on 17/09/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Noticia> myList;
    private Handler handler;
    private MainActivity ma;

    public MyAdapter(List<Noticia> myList, Handler handler, MainActivity ma)
    {
        this.myList = myList;
        this.handler = handler;
        this.ma = ma;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
        View v = li.inflate(R.layout.layout_noticia, null);

        MyViewHolder mvh = new MyViewHolder(v, this.ma);

        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int posicion) {
        Noticia noticia = myList.get(posicion);
        myViewHolder.setTxtFechaNoticia(noticia.getFecha());

        myViewHolder.setTxtEncabezadoNoticia(noticia.getTitulo().toString());

        myViewHolder.setTxtDesarrolloNoticia(noticia.getNoticiaCompleta());

        myViewHolder.posicion = posicion;

        //otra opcion: lanzo thread por esta etapa
        if ( noticia.getImagenNoticia() == null ) {
            /*Agrego un atributo mas a opersona que mencione que se esta bajando la imagen*/
            if ( noticia.getImgBajando() == 0 ) {
                    ThreadImagenes thI = new ThreadImagenes(noticia.getLinkImagen(), handler, posicion);
                    Thread t = new Thread(thI);
                    t.start();
                    Log.d("bajandoImg", "Bajanado imagen " + noticia.getLinkImagen());
                    //noticia.setImgBajando(1);
            }
        }
        else
        {
            myViewHolder.getImagenNoticia().setImageBitmap(noticia.getImagenNoticia());
        }

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
