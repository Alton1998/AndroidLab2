package com.example.alton.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void logInClicked(View view)
    {
        EditText e1=(EditText) findViewById(R.id.t1);
        EditText e2=(EditText) findViewById(R.id.t2);
        Log.i("Username",e1.getText().toString());
        Log.i("Password",e2.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}