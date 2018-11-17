package com.techlearn.aswin.techlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button phoneSetUpButton;
    Button ELearningButton;
    Button aboutUsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phoneSetUpButton = findViewById(R.id.phoneSetUpButton);
        phoneSetUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,phoneSetUpActivity.class);
                startActivity(i);
            }
        });

        ELearningButton = findViewById(R.id.ELearningPortalButton);
        ELearningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ELearningActivity.class);
                startActivity(i);
            }
        });

        aboutUsButton = findViewById(R.id.aboutUsButton);
        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(i);
            }
        });




    }


}
