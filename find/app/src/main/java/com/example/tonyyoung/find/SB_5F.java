package com.example.tonyyoung.find;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SB_5F extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sb_5_f);
    }

    public void downTo4F(View v){
        Intent it = new Intent(this, SB_4F.class);
        startActivity(it);
    }

    public void backToMain(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
