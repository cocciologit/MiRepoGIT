package com.example.alumno.tp_rss;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.IOException;

/**
 * Created by profesor on 17/09/2015.
 */
public class ThreadImagenes implements Runnable
{
    private String url;
    private Handler h;
    private int position;

    public ThreadImagenes(String url, Handler h, int position)
    {
        this.url = url;
        this.h = h;
        this.position = position;
    }
    @Override
    public void run() {
        HttpManager http = null;

        if ( this.url == null )
        {
            Log.d("ImgPOR_DEFECTO", " this.url:  " + this.url);
            this.url = "http://sp7.fotolog.com/photo/23/51/43/xttamariitha/1203288020_f.jpg";
        }
        else {
            Log.d("ThreadImagenes", " this.url: getImgByThread " + this.url);
        }

        http = new HttpManager(this.url);

        byte[] miArray = new byte[0];
        try {
            miArray = http.getBytesDataByGET();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bitmap bitmapImg = BitmapFactory.decodeByteArray(miArray, 0, miArray.length);

        Message msg = new Message();
        msg.arg1 = 1;
        msg.arg2 = this.position;
        msg.obj = bitmapImg;
        h.sendMessage(msg);

    }
}
