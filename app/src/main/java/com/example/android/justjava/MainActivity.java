package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    double quantity = 0;
    double tax = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        EditText amount_text = (EditText) findViewById(R.id.editText);
        tax = Double.parseDouble(amount_text.getText().toString());
        double quantity1 = quantity*5+tax;
        displayPrice(quantity1);
    }

    private void display(double number) {
        TextView quantityTextView = (TextView) findViewById(R.id.number_text_view);
        quantityTextView.setText("" + (int)number);

    }

    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.priceNumber_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment(View view)   {
        quantity++;
        display(quantity);
    }

    public void decrement(View view)   {
        quantity--;
        display(quantity);
    }
}