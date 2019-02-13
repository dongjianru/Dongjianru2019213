package bw.com.administor.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import bw.com.administor.myapplication.http.Http;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(){
            @Override
            public void run() {
                super.run();
                String s = Http.qing("http://api.expoon.com/AppNews/getNewsList/type/1/p/1");
                Message message=new Message();
                message.obj=s;
                handler.sendMessage(message);
            }
        }.start();
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String s= (String) msg.obj;
            Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
        }
    };
}
