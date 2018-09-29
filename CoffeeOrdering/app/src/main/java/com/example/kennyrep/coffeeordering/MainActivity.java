package com.example.kennyrep.coffeeordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private int sum = 0;
    private TextView showCount;
    private TextView showAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView)	findViewById(R.id.text_count_order);
        showAmount = (TextView)	findViewById(R.id.text_amount);
    }

    public void countUp(View view) {
        count++;
        sum = sum + 5;
        if(showCount != null)
            showCount.setText(Integer.toString(count));
            showAmount.setText(Integer.toString(sum));
    }
}
