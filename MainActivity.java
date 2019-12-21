package com.example.nil.cablinks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.olacabs.com"));
        startActivity(browserIntent);
    }
    public void open1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uber.com/in/en/"));
        startActivity(browserIntent);
    }
    public void open2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jugnoo.in/rides/bhubaneswar"));
        startActivity(browserIntent);
    }
    public void open3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.savaari.com/bhubaneswar/book-taxi"));
        startActivity(browserIntent);
    }
    public void open4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bookcab.in/"));
        startActivity(browserIntent);
    }




}
