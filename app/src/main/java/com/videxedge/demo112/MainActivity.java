package com.videxedge.demo112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    EditText eT;

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT=(EditText)findViewById(R.id.eT);

        count=0;

    }

    public void countOp(View view) {
        String str=eT.getText().toString();
        if (str==null) count+=1;
    }

    public void exitOp(View view) {
        finish();
    }
}
