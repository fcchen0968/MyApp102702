package com.example.user.myapp102704;

import android.support.v7.app.AppCompatActivity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int tmp=0, ch=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click1(View v)
    {
        AlertDialog.Builder builer = new AlertDialog.Builder(MainActivity.this);
        builer.setTitle("這是標題");
        builer.setMessage("這是內文");
        builer.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "按確定", Toast.LENGTH_SHORT).show();
            }
        });
        builer.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "按取消", Toast.LENGTH_SHORT).show();
            }
        });
        builer.show();
    }
    public void click2(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("輸入");
        builder.setMessage("請輸入資料:");
        final EditText ed = new EditText(MainActivity.this);
        builder.setView(ed);
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "輸入為:" + ed.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
    public void click3(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("多選一");
        tmp = 0;
        builder.setSingleChoiceItems(R.array.drinks, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                tmp = which;
            }
        });
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] str = getResources().getStringArray(R.array.drinks);
                TextView tv = (TextView) findViewById(R.id.textView);
                ch = tmp;
                tv.setText(str[ch]);
            }
        });
        builder.show();
    }
}
