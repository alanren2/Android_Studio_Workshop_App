package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    double quantity = 0;
    double tax = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        EditText amount_text = (EditText) findViewById(R.id.editText);
        tax = Double.parseDouble(amount_text.getText().toString());
        double quantity1 = quantity*5+tax;
        displayPrice(quantity1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(double number) {
        TextView quantityTextView = (TextView) findViewById(R.id.number_text_view);
        quantityTextView.setText("" + (int)number);

    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.priceNumber_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    // This is when you press the add button.
    public void increment(View view)   {
        quantity++;
        display(quantity);
    }

    // This is when you press the subtract button.
    public void decrement(View view)   {
        quantity--;
        display(quantity);
    }
}