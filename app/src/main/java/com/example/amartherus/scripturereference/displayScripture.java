package com.example.amartherus.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class displayScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);

        Bundle extras = getIntent().getExtras();

        String book = extras.getString("book");
        String chapter = extras.getString("chapter");
        String verse = extras.getString("verse");

        TextView theTextView = (TextView)findViewById(R.id.textView);
        theTextView.setText("Your favorite scripture is " + book + " " + chapter + ": " + verse + "!");

    }
}
