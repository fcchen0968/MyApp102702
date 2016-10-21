package com.example.test.myapp1019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ACT", "This is onCreate");
    }


    public void click1(View v)
    {
        Log.d("ACT", "按鈕被按下");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Button clicked!!");
    }


    public void click2(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        String str = ed.getText().toString();
        String str2 = ed2.getText().toString();

        double n = Double.parseDouble(str);
        double n2 = Double.parseDouble(str2);
        String str3 = String.valueOf(n+n2);

        TextView tv3 = (TextView) findViewById(R.id.textView2);
        tv3.setText(str3);


    }

}
