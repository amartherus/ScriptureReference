package com.example.amartherus.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class getScripture extends AppCompatActivity {

    EditText first;
    EditText second;
    EditText third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_scripture);

        //reads text from user into an editText object
        first = (EditText) findViewById(R.id.Book);
        second = (EditText) findViewById(R.id.Chapter);
        third = (EditText) findViewById(R.id.Verse);
    }

    public void share(View v) {
        //This code starts a new intent, necessary for making a new activity
        Intent intent = new Intent(this, displayScripture.class);

        //converts user input to a string
        String book = first.getText().toString();
        String chapter = second.getText().toString();
        String verse = third.getText().toString();

        //puts strings into an intent to be passed to new activity
        intent.putExtra("book", book);
        intent.putExtra("chapter", chapter);
        intent.putExtra("verse", verse);
        startActivity(intent);

    }
}
