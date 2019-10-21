package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button seven, eight, nine, zero, one, two, three, four, five, six, multiply, divide, subtract, add, clear, equal;
    String displaynum = "";
    int res;
    String op;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.text0);

        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        zero = findViewById(R.id.btn0);
        one = findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        multiply = findViewById(R.id.btnmult);
        divide = findViewById(R.id.btndiv);
        subtract = findViewById(R.id.btnsub);
        add = findViewById(R.id.btnadd);
        clear = findViewById(R.id.btnc);
        equal = findViewById(R.id.btnequal);

        add.setOnClickListener(this);
        clear.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);
        subtract.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                displaynum += 1;
                editText.setText(displaynum);

        }
        switch (v.getId()) {
            case R.id.btn2:
                displaynum += 2;
                editText.setText((displaynum));
                break;

            case R.id.btn3:
                displaynum += 3;
                editText.setText((displaynum));
                break;
            case R.id.btn4:
                displaynum +=4;
                editText.setText((displaynum));
            case R.id.btn5:
                displaynum +=5;
                editText.setText((displaynum));
            case R.id.btn6:
                displaynum +=6;
                editText.setText((displaynum));
            case R.id.btn7:
                displaynum +=7;
                editText.setText((displaynum));
            case R.id.btn8:
                displaynum +=8;
                editText.setText((displaynum));
            case R.id.btn9:
                displaynum +=9;
                editText.setText((displaynum));



            case R.id.btnadd:
                num1=Integer.parseInt(displaynum);
                displaynum="";
                op="+";
                break;
            case R.id.btnequal:
                num2=Integer.parseInt(displaynum);
                res= getResult(op,num1,num2);
                editText.setText(String.valueOf(res));
        }
    }

    private int getResult(String op, int n1, int n2) {
        switch (op){
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "/":
                if (num2 == 0) {
                    Toast.makeText(this, "Cannot be divided by 0 ", Toast.LENGTH_SHORT).show();
                } else {
                    return num1/num2;
                }
            default:
                return 0;
        }
    }
}

