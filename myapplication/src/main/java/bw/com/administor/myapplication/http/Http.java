package bw.com.administor.myapplication.http;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/13 14:12:33
 * @Description:
 */
public class Http {
    public  static  String qing (String url){
        try {
            URL url1 = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();
            int code = httpURLConnection.getResponseCode();
            if (code==200){
                String s="";
                StringBuffer buffer=new StringBuffer();
                InputStream stream = httpURLConnection.getInputStream();
                BufferedReader reader=new BufferedReader(new InputStreamReader(stream,"utf-8"));
                while((s=reader.readLine())!=null){
                    buffer.append(s);
                }
                return buffer.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
