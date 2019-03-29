package com.example.test329;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick1(View view) {
        {
            try {
                //startActivity(new Intent("com.AndroidTest.SecondActivity"));//隐式intent
                Intent intent = new Intent(this, activityTwo.class);//显示intent
                startActivity(intent);
            } catch (Exception ex) {
                // 显示异常信息
                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        /*Intent intent = new Intent();
        intent.putExtra("Score", "0");
        intent.setClass(MainActivity.this, SecondActivity.class);
        MainActivity.this.startActivity(intent);*/
    }
}
