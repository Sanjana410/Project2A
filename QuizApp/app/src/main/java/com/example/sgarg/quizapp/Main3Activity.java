package com.example.sgarg.quizapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Main3Activity extends AppCompatActivity {
    TextView tv3;
    String correct = "10";
    int st;
    String score ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button rb = (Button) findViewById(R.id.restart_btn);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getApplicationContext(),SplashScreen.class);
                startActivity(r);
            }
        });

        tv3 = (TextView) findViewById(R.id.score_text_view);
        Intent intent = getIntent();
        String score = intent.getStringExtra("b");
        tv3.setText(score);

        final Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                String button = b1.getText().toString();
                Intent intent = getIntent();
                String score = intent.getStringExtra("b");
                tv3.setText(score);
                if(Objects.equals(button,correct))
                {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    i.putExtra("c",Integer.toString(st));
                    startActivity(i);

                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    startActivity(i);

                }

            }
        });

        final Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                String button = b2.getText().toString();

                if (Objects.equals(button, correct)) {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    i.putExtra("c",Integer.toString(st));
                    startActivity(i);
                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    startActivity(i);
                }



            }
        });

        final Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                String button = b3.getText().toString();

                if (Objects.equals(button, correct)) {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    i.putExtra("c",Integer.toString(st));
                    startActivity(i);
                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    startActivity(i);
                }



            }
        });

        final Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                String buttonText = b4.getText().toString();

                if (Objects.equals(buttonText, correct)) {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    i.putExtra("c",Integer.toString(st));
                    startActivity(i);
                }
                if (!Objects.equals(buttonText, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Scores.class);
                    startActivity(i);
                }



            }
        });
    }
}

