package com.example.alumno.tp_rss;

import android.graphics.Bitmap;

/**
 * Created by alumno on 08/10/2015.
 */
public class Noticia
{
    private String titulo;
    private String descripción;
    private String fecha;
    private String linkNoticia;
    private String noticiaCompleta;
    private Bitmap imagenNoticia;
    private int imgBajando;
    private String linkImagen;


    /**
     *
     * @param titulo
     * @param descripción
     * @param fecha
     * @param linkNoticia
     * @param noticiaCompleta
     * @param imagenNoticia
     * @param imgBajando
     */
    public Noticia(String titulo, String descripción, String fecha, String linkNoticia, String noticiaCompleta, Bitmap imagenNoticia) {
        this.titulo = titulo;
        this.descripción = descripción;
        this.fecha = fecha;
        this.linkNoticia = linkNoticia;
        this.noticiaCompleta = noticiaCompleta;
        this.imagenNoticia = imagenNoticia;
    }

    public Noticia() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLinkNoticia() {
        return linkNoticia;
    }

    public void setLinkNoticia(String linkNoticia) {
        this.linkNoticia = linkNoticia;
    }

    public String getNoticiaCompleta() {
        return noticiaCompleta;
    }

    public void setNoticiaCompleta(String noticiaCompleta) {
        this.noticiaCompleta = noticiaCompleta;
    }

    public Bitmap getImagenNoticia() {
        return imagenNoticia;
    }

    public void setImagenNoticia(Bitmap imagenNoticia) {
        this.imagenNoticia = imagenNoticia;
    }

    public int getImgBajando() {
        return imgBajando;
    }

    public void setImgBajando(int imgBajando) {
        this.imgBajando = imgBajando;
    }

    public String getLinkImagen() {
        return linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }
}
