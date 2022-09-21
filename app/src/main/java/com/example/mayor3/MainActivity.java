package com.example.mayor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblResultado;
    private Button btnMayor;
    private EditText tfNum1;
    private EditText tfNum2;
    private EditText tfNum3;


    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tfNum1 = (EditText)findViewById(R.id.tfNum1);
        tfNum2 = (EditText)findViewById(R.id.tfNum2);
        tfNum3 = (EditText)findViewById(R.id.tfNum3);

        lblResultado = (TextView) findViewById(R.id.lblResultado);

        btnMayor = (Button) findViewById(R.id.btnMayor);
        btnMayor.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                int num1 = Integer.parseInt(tfNum1.getText().toString());
                int num2 = Integer.parseInt(tfNum2.getText().toString());
                int num3 = Integer.parseInt(tfNum3.getText().toString());

                if(num1 > num2 && num1 > num3) {
                    lblResultado.setText(String.valueOf(num1));
                }
                else if(num2 > num1 && num2 > num3) {
                    lblResultado.setText(String.valueOf(num2));
                }
                else {
                    lblResultado.setText(String.valueOf(num3));
                }
            }
        });
    }
}