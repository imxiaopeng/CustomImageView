package com.mxth.photoimageview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cxp.photoview.PhotoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhotoView iv = (PhotoView) findViewById(R.id.iv);
        iv.setImageDrawable(ContextCompat.getDrawable(this,R.mipmap.ic_launcher));
    }
}
