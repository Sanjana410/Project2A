package com.example.sgarg.quizapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_view);
        TextView txt=(TextView) findViewById(R.id.Scores);

        Intent intent = getIntent();
        String score = intent.getStringExtra("scores");
        txt.setText(score);

        Button restart=(Button) findViewById(R.id.restart_btn);

        restart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent in2=new Intent(getApplicationContext(),SplashScreen.class);
                startActivity(in2);
            }
        });
    }
}
