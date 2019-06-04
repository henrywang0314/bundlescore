package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }

    private void findview() {
        ed1=(EditText)findViewById(R.id.editText7);
        ed2=(EditText)findViewById(R.id.editText8);
        ed3=(EditText)findViewById(R.id.editText9);
    }
    private boolean isvalid(EditText editText){
        String pattern="1[0]{2}|[0-9]{1,2}";
        String text=editText.getText().toString();
        if(!text.matches(pattern)){
            editText.setError("0~100");
            return false;
        }
        else{
            return true;
        }
    }
    public void submit(View v){
        boolean isvalid=isvalid(ed1)&&isvalid(ed2)&&isvalid(ed3);
        if(!isvalid){
            return;
        }
        int programming=Integer.parseInt(ed1.getText().toString());
        int datastructure=Integer.parseInt(ed2.getText().toString());
        int algorithm=Integer.parseInt(ed3.getText().toString());
        Intent intent=new Intent(this,Main2Activity.class);
        Bundle bundle=new Bundle();
        bundle.putInt("programming",programming);
        bundle.putInt("datastructure",datastructure);
        bundle.putInt("algorithm",algorithm);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
