package com.example.teht31;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button plus, minus;
    private ImageButton reset;
    private TextView result;
    private Counter c;
    private RadioButton hex, dec;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset = findViewById(R.id.resetButton);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        hex = findViewById(R.id.hexa);
        dec = findViewById(R.id.decimal);
        final TextView result = findViewById(R.id.counterText);
        final Counter c = new Counter(20, 0);
        result.setText("" + 0);
        result.setGravity(Gravity.CENTER);

        hex.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.changeToHex();
                result.setText(c.getCurrentValue());

            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.changeToDec();
                result.setText(c.getCurrentValue());

            }
        });

        //setonClickListener
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.setToZero();
                result.setText(c.getCurrentValue());

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.clickedButtonMinus();
                result.setText(c.getCurrentValue());

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.clickedButtonPlus();
                result.setText(c.getCurrentValue());

            }
        });


    }


}