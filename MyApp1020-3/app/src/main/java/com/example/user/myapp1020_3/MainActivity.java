package com.example.user.myapp1020_3;

import android.content.Intent;
import android.net.Uri;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Uri uri = Uri.parse("http://tw.yahoo.com");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void click2(View v)
    {
        Uri uri = Uri.parse("tel:456789");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void click3(View v)
    {
        Uri uri = Uri.parse("geo:0,0?q=台北市忠孝東路二段3號");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void click4(View v)
    {
       // Uri uri = Uri.parse("market://search?d=john");
        Intent it = new Intent(Intent.ACTION_VIEW, Contacts.People.CONTENT_URI);
        startActivity(it);
    }
    public void click5(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();

        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        it.putExtra("mydata", str);
        startActivity(it);
    }
}
