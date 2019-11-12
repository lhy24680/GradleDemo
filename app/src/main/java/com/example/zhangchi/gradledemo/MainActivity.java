package com.example.zhangchi.gradledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.utils.UtilTestMaven;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView2);
        tv.setText(UtilTestMaven.TEST_VALUE);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Intent tent = new Intent(this,SecondActivity.class);
                startActivity(tent);
                break;
            default:
                break;
        }
    }
}
