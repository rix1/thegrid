package utils;

import android.os.AsyncTask;
import org.apache.commons.codec.binary.Base64;
//import android.util.Base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class GetXMLTask extends AsyncTask<String, Void, String> {

    protected String doInBackground(String... url) {
        URL obj = null;
        try {
            obj = new URL(url[0]);

            URLConnection conn = obj.openConnection();

            String username = "c2a858c9766b46b3ab9e8225c9742b69";
            String password = "7120e23a66914b528696b2402f6097dd";

            String userpass = username + ":" + password;
            String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
            conn.setRequestProperty ("Authorization", basicAuth);
            conn.addRequestProperty("Accept","application/xml");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            String output = "";

            while ((inputLine = in.readLine()) != null)
                output += inputLine;
            in.close();


            return output;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }


    }

}
