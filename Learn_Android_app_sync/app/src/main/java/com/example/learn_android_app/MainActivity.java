package com.example.learn_android_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.learn_android_app.CP4_Activity.ActivityDataBack;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.act_data_back);
        btn1.setOnClickListener((View.OnClickListener) this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        int vID = v.getId();
        switch (vID){
            case R.id.act_data_back:
                //switch activity
                Intent actDataBack = new Intent(this, ActivityDataBack.class);
                startActivity(actDataBack);
                break;
        }

    }
}