package com.example.samnang.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Samnang on 11/18/2017.
 */


public class RegisterPage extends AppCompatActivity{
    public Button btback;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        btback = (Button)findViewById(R.id.backbutton);

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(RegisterPage.this,MainActivity.class);
                startActivity(back);
            }
        });

    }
}
