package com.iiitm.lost.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Convert (View view){

        EditText input = findViewById(R.id.editText);


        Double Dollar = Double.parseDouble(input.getText().toString());
        Double Rupee = 72.22*Dollar;

        Log.i("Dollar", input.getText().toString());

        Toast.makeText(MainActivity.this,Rupee.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
