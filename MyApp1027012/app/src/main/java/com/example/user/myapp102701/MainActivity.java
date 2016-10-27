package com.example.user.myapp102701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String[] data = {"aab", "aac", "abc", "acc", "bba", "bbb", "cca"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, data);
        act.setThreshold(1);
        act.setAdapter(adapter);
    }

    public void click2(View v)
    {
        Toast.makeText(MainActivity.this, act.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }
}
