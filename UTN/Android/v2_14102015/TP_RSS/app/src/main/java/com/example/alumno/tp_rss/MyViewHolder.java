package com.example.alumno.tp_rss;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by profesor on 17/09/2015.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView txtFechaNoticia;
    private TextView txtEncabezadoNoticia;
    private TextView txtDesarrolloNoticia;
    private ImageView imagenNoticia;
    public int posicion;

    private MainActivity ma;

    public MyViewHolder(View view, MainActivity ma){
        super(view);
        this.ma = ma;

        txtFechaNoticia = (TextView) view.findViewById(R.id.txtVFechaNoticia);
        txtEncabezadoNoticia= (TextView) view.findViewById(R.id.txtVEncabezadoNoticia);
        txtDesarrolloNoticia= (TextView) view.findViewById(R.id.txtVDesarroloDeLaNoticia);
        imagenNoticia = (ImageView) view.findViewById(R.id.imgVImagenNoticia);

        imagenNoticia.setOnClickListener( (View.OnClickListener)this );
    }

    public TextView getTxtFechaNoticia() {
        return txtFechaNoticia;
    }

    public void setTxtFechaNoticia(String txtFechaNoticia) {
        this.txtFechaNoticia.setText(txtFechaNoticia);
    }

    public TextView getTxtEncabezadoNoticia() {
        return txtEncabezadoNoticia;
    }

    public void setTxtEncabezadoNoticia(String txtEncabezadoNoticia) {
        this.txtEncabezadoNoticia.setText(txtEncabezadoNoticia);
    }

    public TextView getTxtDesarrolloNoticia() {
        return txtDesarrolloNoticia;
    }

    public void setTxtDesarrolloNoticia(String txtDesarrolloNoticia) {
        this.txtDesarrolloNoticia.setText(txtDesarrolloNoticia);
    }

    public ImageView getImagenNoticia() {
        return imagenNoticia;
    }

    @Override
    public void onClick(View v) {
        this.ma.clickNoticia( this.posicion );
    }
}
