package com.techlearn.aswin.techlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ELearningActivity extends AppCompatActivity {

    Button pythonButton;
    Button ccppButton;
    Button javaButton;
    Button javascriptButton;
    Button djangoButton;
    Button webButton;
    Button mySQLButton;
    Button mlButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearning);

        Button editPortalButton = findViewById(R.id.editPortalButton);
        pythonButton = findViewById(R.id.python);
        ccppButton = findViewById(R.id.c);
        javaButton = findViewById(R.id.java);
        javascriptButton = findViewById(R.id.javaScript);
        djangoButton = findViewById(R.id.django);
        webButton = findViewById(R.id.web);
        mySQLButton = findViewById(R.id.mySQL);
        mlButton = findViewById(R.id.ml);

        // click event listener for edit button
        editPortalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/");
            }
        });

        //click event listener for python
        pythonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/python_notes/");
            }
        });

        //click event listener for c and cpp
        ccppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/c_notes/");
            }
        });

        //click event listener for java
        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/java_notes/");
            }
        });

        //click event listener for javaScript
        javascriptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/javascript_notes/");
            }
        });

        //click event listener for django
        djangoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/django_notes/");
            }
        });

        //click event listener for html and css
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/front_end_notes/");
            }
        });

        //click event listener for mySQL
        mySQLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/mysql_notes/");
            }
        });

        //click event listener for machine learning
        mlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = new WebView(ELearningActivity.this);
                setContentView(myWebView);
                myWebView.loadUrl("http://euno257.pythonanywhere.com/notes/machine_learning_notes/");
            }
        });
    }
}
