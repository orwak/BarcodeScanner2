package com.example.henrik.barcodescanner;

import android.widget.Toast;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Henrik on 2015-05-24.
 */
public class HttpComClass  {

    public HttpComClass(){


        try {
            URL url = new URL("http://www.tigersoft.se");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            readStream(con.getInputStream());
            Toast.makeText(getApplicationContext(), "reading stream", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"catch exception eeeee", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }






    }
});
    }
}
