package com.bw.dongjianru2019213;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.zhuce).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText zhanghao1 = findViewById(R.id.zhanghao1);
                EditText mima1 = findViewById(R.id.mima1);
                String zhang = zhanghao1.getText().toString();
                String mi = mima1.getText().toString();
                if (zhang.equals("") || mi.equals("") || mi.trim()=="" || zhang.trim()==""){
                    Toast.makeText(Main2Activity.this,"用户名或密码不能为空",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Main2Activity.this,"注册成功",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
