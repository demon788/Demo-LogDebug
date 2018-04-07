package com.example.logdemo;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Admin on 07-Apr-18.
 */

public class HelloWorld extends AppCompatActivity {
    private void HelloWorld(String name){
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }
}
