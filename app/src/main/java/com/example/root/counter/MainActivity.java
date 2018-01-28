package com.example.root.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a = 0;
    int b = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  scora(int a){
            TextView textView = findViewById(R.id.scoa);
            textView.setText(""+a);
    }
    public void  scorb(int a){
        TextView textView = findViewById(R.id.scob);
        textView.setText(""+a);
    }

    public void sco3a(View view) {
        a=a+3;
        scora(a);
    }
    public void sco2a(View view) {
        a=a+2;
        scora(a);
    }

    public void sco1a(View view) {
        a=a+1;
        scora(a);
    }
    public void sco3b(View view) {
        b=b+3;
        scorb(b);
    }
    public void sco2b(View view) {
        b=b+2;
        scorb(b);
    }

    public void sco1b(View view) {
        b=b+1;
        scorb(b);
    }


    public void rest(View view) {
        a = 0;
        b=0;
        scorb(b);
        scora(a);

    }
}
