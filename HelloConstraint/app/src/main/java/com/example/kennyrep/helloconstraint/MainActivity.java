package com.example.kennyrep.helloconstraint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mcount = 0;
    private TextView mshowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount = (TextView)	findViewById(R.id.show_count);
    }

    public void ShowToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }



    public void CountUp(View view) {
        mcount = mcount + 1;
        if(mshowCount != null)
            mshowCount.setText(Integer.toString(mcount));
    }
}
