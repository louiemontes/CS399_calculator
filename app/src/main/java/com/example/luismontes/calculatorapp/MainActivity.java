package com.example.luismontes.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    // buckets for the table
    EditText numberField;
    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9,
            plusButton, minusButton, divideButton, multiplyButton, equalButton, clearButton, decimalButton;

    // function flags, when made true, the evenlistener responds accordingly
    boolean plusNumbers, minusNumbers, multiplyNumbers, divideNumbers;

    // this flag stops errors from operating on an empty string
    boolean canUseOperator = false;

    // this flag stops multiple decimals from being entered
    boolean wantsDecimal = false;

    // present values to make functions on
    float firstVal, secondVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // pulling elements from xml to use in java
        numberField = (EditText) findViewById(R.id.numberField);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        decimalButton = (Button) findViewById(R.id.decimalButton);
        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        multiplyButton = (Button) findViewById(R.id.multiplyButton);
        divideButton = (Button) findViewById(R.id.divideButton);
        clearButton = (Button) findViewById(R.id.clearButton);
        equalButton = (Button) findViewById(R.id.equalButton);

        // setting functionality to our selected elements
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "0");
                canUseOperator = true;
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "1");
                canUseOperator = true;

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "2");
                canUseOperator = true;

            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "3");
                canUseOperator = true;

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "4");
                canUseOperator = true;

            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "5");
                canUseOperator = true;

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "6");
                canUseOperator = true;

            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "7");
                canUseOperator = true;

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "8");
                canUseOperator = true;

            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.setText(numberField.getText() + "9");
                canUseOperator = true;

            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (canUseOperator) {
                    firstVal = Float.parseFloat(numberField.getText() + "");
                    multiplyNumbers = true;
                    numberField.setText(null);
                    wantsDecimal = false;
                    canUseOperator = false;
                    multiplyButton.setTextColor(Color.parseColor("#FFFFFF"));

                }
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(canUseOperator) {
                    firstVal = Float.parseFloat(numberField.getText() + "");
                    divideNumbers = true;
                    numberField.setText(null);
                    wantsDecimal = false;
                    canUseOperator = false;
                    divideButton.setTextColor(Color.parseColor("#FFFFFF"));

                }
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (canUseOperator) {
                    firstVal = Float.parseFloat(numberField.getText() + "");
                    plusNumbers = true;
                    numberField.setText(null);
                    wantsDecimal = false;
                    canUseOperator = false;
                    plusButton.setTextColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (canUseOperator) {
                    firstVal = Float.parseFloat(numberField.getText() + "");
                    minusNumbers = true;
                    numberField.setText(null);
                    wantsDecimal = false;
                    minusButton.setTextColor(Color.parseColor("#FFFFFF"));
                    canUseOperator = false;
                }
            }
        });
        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(canUseOperator) { // to avoid adding a decimal to an empty string
                    if (wantsDecimal == false) {
                        wantsDecimal = true;
                        numberField.setText(numberField.getText() + ".");
                        canUseOperator=false;
                    }
                }
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (canUseOperator) {
                    // sees any operator flag and executes their function on the first and second values
                    secondVal = Float.parseFloat(numberField.getText() + "");
                    if (plusNumbers == true) {
                        numberField.setText(firstVal + secondVal + "");
                        plusNumbers = false;
                        plusButton.setTextColor(Color.parseColor("#0000FF"));
                    }

                    if (minusNumbers == true) {
                        numberField.setText(firstVal - secondVal + "");
                        minusNumbers = false;
                        minusButton.setTextColor(Color.parseColor("#0000FF"));
                    }

                    if (multiplyNumbers == true) {
                        numberField.setText(firstVal * secondVal + "");
                        multiplyNumbers = false;
                        multiplyButton.setTextColor(Color.parseColor("#0000FF"));
                    }

                    if (divideNumbers == true) {
                        numberField.setText(firstVal / secondVal + "");
                        divideNumbers = false;
                        divideButton.setTextColor(Color.parseColor("#0000FF"));

                    }
                    wantsDecimal = false;
                    canUseOperator = false;
                }
            }
        });
        // empties the number field
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    numberField.setText("");
                    wantsDecimal = false;
            }
        });
    }
}