package com.bw.dongjianru2019213;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText zh;
    private EditText mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zh = findViewById(R.id.zhanghao);
        mm = findViewById(R.id.mima);
        findViewById(R.id.deng).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zhzh = zh.getText().toString();
                String mmmm = mm.getText().toString();
                if (zhzh.equals("") || mmmm.equals("") || mmmm.trim()=="" || zhzh.trim()==""){
                    Toast.makeText(MainActivity.this,"用户名或密码不能为空",Toast.LENGTH_SHORT).show();
                }else if(zhzh.equals("天呢！用户名和密码怎么都是空") && mmmm.equals("1")){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
                }
            }
        });
        findViewById(R.id.zhu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
