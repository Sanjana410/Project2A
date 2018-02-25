package com.example.sgarg.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Scores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        TextView tv5 = (TextView)findViewById(R.id.score_view);
        Intent intent = getIntent();
        String score = intent.getStringExtra("c");
        tv5.setText("Your score is: "+score+"/3");
        Button b5 = (Button)findViewById(R.id.restart_button);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(getApplicationContext(),SplashScreen.class);
                startActivity(v);
            }
        });
    }
}
