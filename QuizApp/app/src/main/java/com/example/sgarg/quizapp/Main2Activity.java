package com.example.sgarg.quizapp;

import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Main2Activity extends AppCompatActivity {
    String correct = "22";
    String score ;
    int st;
    TextView tv3,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button rb = (Button) findViewById(R.id.restart_btn);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(getApplicationContext(),SplashScreen.class);
                startActivity(r);

            }
        });

        tv3 = (TextView) findViewById(R.id.score_text_view);
        tv1 = (TextView)findViewById(R.id.timer_text_view);
        Intent intent = getIntent();
        final String score = intent.getStringExtra("a");
        tv3.setText(score);



//       final long startTime= bundle.getLong("hi");
//        new CountDownTimer(startTime, 1000) {
//            @Override
//            public void onTick(long l) {
//                tv1.setText(""+startTime);
//
//
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        }.start();


        final Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                String button = b1.getText().toString();
                if(Objects.equals(button,correct))
                {
                    st = Integer.parseInt((String)tv3.getText());
                    st=st+1;
                    tv3.setText(Integer.toString(st));
                    Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    i.putExtra("b",Integer.toString(st));
                    startActivity(i);

                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
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
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    i.putExtra("b",Integer.toString(st));
                    startActivity(i);
                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
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
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    i.putExtra("b",Integer.toString(st));
                    startActivity(i);
                }
                if (!Objects.equals(button, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
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
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    i.putExtra("b",Integer.toString(st));
                    startActivity(i);
                }
                if (!Objects.equals(buttonText, correct)) {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(i);
                }



            }
        });


    }
}
