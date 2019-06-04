package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class Main2Activity extends AppCompatActivity {

    private TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txv=(TextView)findViewById(R.id.textView);
        showresult();
    }

    private void showresult() {
        NumberFormat numberFormat=NumberFormat.getInstance();
        Bundle bundle=getIntent().getExtras();
        int programming=bundle.getInt("programming");
        int datastructure=bundle.getInt("datastructure");
        int algorithm=bundle.getInt("algorithm");
        int sum=programming+datastructure+algorithm;
        double average=sum/3.0;
        String text="programming="+programming+"\ndatastructure="+datastructure+"\nalgorithm="+algorithm+"\nsum="+sum+"\naverage="+numberFormat.format(average);
        txv.setText(text);
    }
    public void back(View v){
        finish();
    }
}
