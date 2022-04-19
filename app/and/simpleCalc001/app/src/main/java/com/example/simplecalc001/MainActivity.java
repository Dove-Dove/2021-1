package com.example.simplecalc001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button btnPlus, btnMinus, btnMultiply, btnDevide;
    TextView txtResult;

    String num1, num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = etNum1.getText().toString();
                num2 = etNum2.getText().toString();
                result = Integer.parseInt(num1)+Integer.parseInt(num2);
                txtResult.setText(result+"");
            }
        });

        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = etNum1.getText().toString();
                num2 = etNum2.getText().toString();
                result = Integer.parseInt(num1)-Integer.parseInt(num2);
                txtResult.setText(result+"");
            }
        });
        btnMultiply = (Button) findViewById(R.id.btnMultply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = etNum1.getText().toString();
                num2 = etNum2.getText().toString();
                result = Integer.parseInt(num1)*Integer.parseInt(num2);
                txtResult.setText(result+"");
            }
        });
        btnDevide = (Button) findViewById(R.id.btnDevide);
        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = etNum1.getText().toString();
                num2 = etNum2.getText().toString();
                double result = Double.parseDouble(num1) / Double.parseDouble(num2);
                txtResult.setText(result+"");
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(result);
            }
        });
        txtResult = (TextView) findViewById(R.id.txtResult);
    }
}
// 5/2 = 1.0