package com.example.sgarg.quizapp;

import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity  {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    String score;
    int st=0;
    String correct ="5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                timer();
                String button = b1.getText().toString();
                if(Objects.equals(button,correct))
                {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    i.putExtra("a",Integer.toString(st));
                    startActivity(i);

                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(i);

                }
            }
        });

        final Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                timer();
                String button = b2.getText().toString();
                if(Objects.equals(button,correct))
                {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    i.putExtra("a",Integer.toString(st));

                    startActivity(i);

                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(i);

                }

            }
        });

        final Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                timer();
                String button = b3.getText().toString();
                if(Objects.equals(button,correct))
                {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    i.putExtra("a",Integer.toString(st));
                    startActivity(i);

                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(i);

                }
            }
        });

        final Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                timer();
                String button = b4.getText().toString();
                if(Objects.equals(button,correct))
                {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    i.putExtra("a",Integer.toString(st));
                    startActivity(i);

                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(i);

                }

            }
        });

        Button rb = (Button) findViewById(R.id.restart_btn);
        rb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getApplicationContext(),SplashScreen.class);
                startActivity(r);

            }
        });

        tv1 = (TextView) findViewById(R.id.timer_text_view);
        tv2 = (TextView) findViewById(R.id.question_text_view);
        tv3 = (TextView) findViewById(R.id.score_text_view);
        tv4 = (TextView) findViewById(R.id.message_test_view);


    }

    public void timer() {
         new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv1.setText(""+millisUntilFinished/1000);

            }


            @Override
            public void onFinish() {
                Intent j = new Intent(getApplicationContext(),Scores.class);
                startActivity(j);

            }

        }.start();


    }




}
