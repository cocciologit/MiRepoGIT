package com.example.alumno.tp_rss;

import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 01/10/2015.
 */
public  class XmlParser {
    String xml;


    public XmlParser(String xml) {
        this.xml = xml;
    }

    public List<Noticia> obtenerListaNoticiasParser() {
        XmlPullParser parser = Xml.newPullParser();
        List<Noticia> noticias = new ArrayList<Noticia>();

        try {
            parser.setInput(new StringReader(this.xml));
            int event = parser.getEventType();


            Noticia noticia = null;
            while (event != XmlPullParser.END_DOCUMENT) {

                switch (event) {
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        String tag = parser.getName();
                        Log.d("parser", "encontro tag:"+tag);

                        if (tag.equals("item"))
                        {
                            noticia = new Noticia();
                        }

                            if ( noticia != null ) {

                                switch (tag) {
                                    case "title":
                                        String cont = parser.nextText();
                                        Log.d("parser", "encontro title. cont:"+cont);
                                        noticia.setTitulo(cont);
                                        break;
                                    case "link":
                                        noticia.setLinkNoticia(parser.nextText());
                                        break;
                                    case "thumbnail":
                                        String link = parser.getAttributeValue( null, "url");
                                        noticia.setLinkImagen(link);
                                        Log.d( "LinkImagen", link );
                                        break;
                                    case "description":
                                        noticia.setDescripción(parser.nextText());
                                        break;
                                    case "pubDate":
                                        noticia.setFecha(parser.nextText());
                                        break;
                                    case "img":
                                        noticia.setLinkNoticia(parser.nextText());
                                        break;
                                }/*switch*/
                            }

                        break;

                    case XmlPullParser.END_TAG:
                        String tag2 = parser.getName();
                        Log.d("parser", "encontro fin tag:"+tag2);
                        if(tag2.equals("item")) {

                            if (noticia != null) {
                                Log.d("parser", "agrego not a la lista");
                                noticias.add(noticia);
                            }
                        }
                        break;
                }
                event = parser.next();

            }/*while*/

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return noticias;
    }
}