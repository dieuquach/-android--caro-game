package com.example.xocaro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mot, hai, ba, bon, nam, sau, bay, tam, chin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mot = findViewById(R.id.mot);
        hai = findViewById(R.id.hai);
        ba = findViewById(R.id.ba);
        bon = findViewById(R.id.bon);
        nam = findViewById(R.id.nam);
        sau = findViewById(R.id.sau);
        bay = findViewById(R.id.bay);
        tam = findViewById(R.id.tam);
        chin = findViewById(R.id.chin);

        mot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        hai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        nam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        sau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        tam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
        chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click(v);
            }
        });
    }

    int count = 0;

    void Click(View view) {
        if (count%2 == 0){
            ((Button) view).setText("X");
        }else {
            ((Button) view).setText("O");
        }
        count++;
        resultX();
    }

    void resultX(){
        ButtonX(mot, hai, ba);
        ButtonX(mot, bon, bay);
        ButtonX(mot, nam, chin);
        ButtonX(hai, nam, tam);
        ButtonX(ba, sau, chin);
        ButtonX(ba, nam, bay);
        ButtonX(bon, nam, sau);
        ButtonX(bay, tam, chin);

        Button0(mot, hai, ba);
        Button0(mot, bon, bay);
        Button0(mot, nam, chin);
        Button0(hai, nam, tam);
        Button0(ba, sau, chin);
        Button0(ba, nam, bay);
        Button0(bon, nam, sau);
        Button0(bay, tam, chin);
    }
    void ButtonX(Button a, Button b, Button c){
        if(a.getText().equals("X") && b.getText().equals("X") && c.getText().equals("X")){
            Toast.makeText(this, "X win", Toast.LENGTH_SHORT).show();
            setBtn();
        }
    }

    void Button0(Button a, Button b, Button c){
        if(a.getText().equals("0") && b.getText().equals("0") && c.getText().equals("0")){
            Toast.makeText(this, "0 win", Toast.LENGTH_SHORT).show();
            setBtn();
        }

    }

    void setBtn(){
        mot.setText("");
        hai.setText("");
        ba.setText("");
        bon.setText("");
        nam.setText("");
        sau.setText("");
        bay.setText("");
        tam.setText("");
        chin.setText("");
    }
}
