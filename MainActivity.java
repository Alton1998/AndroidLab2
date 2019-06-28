package com.example.alton.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String item1,item2;
    public void logInClicked(View view)
    {
        EditText e1=(EditText) findViewById(R.id.t1);
        EditText e2=(EditText) findViewById(R.id.t2);
        item1=e1.getText().toString();
        item2=e2.getText().toString();
        Log.i("Username",e1.getText().toString());
        Log.i("Password",e2.getText().toString());
        Toast.makeText(MainActivity.this,item1,+Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,item2,+Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
