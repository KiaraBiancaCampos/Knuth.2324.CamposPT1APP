package com.example.campos_pt1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText txtNum1, txtNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myNum1 = Integer.parseInt(txtNum1.getText().toString());
                int myNum2 = Integer.parseInt(txtNum2.getText().toString());
                int sum = myNum1 + myNum2;

                txtResult.setText(String.valueOf(sum));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double myNum1 = Double.parseDouble(txtNum1.getText().toString());
                double myNum2 = Double.parseDouble(txtNum2.getText().toString());
                double dif = myNum1 - myNum2;

                txtResult.setText(String.valueOf(dif));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double myNum1 = Double.parseDouble(txtNum1.getText().toString());
                double myNum2 = Double.parseDouble(txtNum2.getText().toString());
                double product = myNum1 * myNum2;

                txtResult.setText(String.valueOf(product));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double myNum1 = Double.parseDouble(txtNum1.getText().toString());
                double myNum2 = Double.parseDouble(txtNum2.getText().toString());
                double quotient = myNum1 / myNum2;

                txtResult.setText(String.valueOf(quotient));
            }
        });
    }
}
