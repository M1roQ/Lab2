package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pclick(View view){
        TextView cnt = (TextView) findViewById(R.id.textView);
        String zz = cnt.getText().toString();
        if (zz.isEmpty()){
            zz = "0";
        }
        EditText inc = (EditText) findViewById(R.id.editTextNumber);
        String i = inc.getText().toString();
        if (i.isEmpty()){
            i = "1";
        }
        int pz = Integer.valueOf(zz.toString());
        pz = pz + Integer.parseInt(i.toString());
        cnt.setText(Integer.toString(pz));
    }

    public void Mclick(View view){
        TextView cnt = (TextView) findViewById(R.id.textView);
        String zz = cnt.getText().toString();
        if (zz.isEmpty()){
            zz = "0";
        }
        EditText inc = (EditText) findViewById(R.id.editTextNumber);
        String i = inc.getText().toString();
        if (i.isEmpty()){
            i = "1";
        }
        int pz = Integer.valueOf(zz.toString());
        pz = pz - Integer.parseInt(i.toString());
        cnt.setText(Integer.toString(pz));
    }
}

