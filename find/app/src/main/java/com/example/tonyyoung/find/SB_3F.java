package com.example.tonyyoung.find;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SB_3F extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sb_3_f);
    }

    public void upTo4F(View v){
        Intent it = new Intent(this, SB_4F.class);
        startActivity(it);
    }

    public void downTo2F(View v){
        Intent it = new Intent(this, SB_2F.class);
        startActivity(it);
    }

    public void toSC_3F(View v){
        Intent it = new Intent(this, SC_3F.class);
        startActivity(it);
    }

    public void toSA_3F(View v){
        Intent it = new Intent(this, SA_3F.class);
        startActivity(it);
    }

    public void backToMain(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
