package com.example.sgarg.quizapp2;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    long time = 30;
    int score = 0;
    CountDownTimer ct = null;
    int total_questions = 0;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv1 = (TextView) findViewById(R.id.timer_text_view);

        newActivity();
        ct = new CountDownTimer(30000, 1000) {


            public void onTick(long millisUntilFinished) {
                tv1.setText(" " + millisUntilFinished / 1000 + " ");
                time = millisUntilFinished / 1000;
            }

            public void onFinish() {
                tv1.setText(" 00 ");
                Intent in2=new Intent(getApplicationContext(),ScoreView.class);
                in2.putExtra("scores",Integer.toString(score));
                in2.putExtra("totalQ",Integer.toString(count));
                startActivity(in2);


            }

        }.start();




    }

    void newActivity() {


        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        TextView tv2 = (TextView) findViewById(R.id.question_text_view);
        Button b5 =(Button)findViewById(R.id.Scv);


        int a, b, c = 0;
        int num= 0;
        final int small = 0;
        final int lar = 80;


        Random r = new Random();

        int n1 = r.nextInt((lar - small)) + 1;
        int n2 = r.nextInt((lar - small)) - 1;

        String ques = Integer.toString(n1) + " + " + Integer.toString(n2);
        tv2.setText(ques);


        num = r.nextInt((3)) + 1;



        a = r.nextInt((lar - small) + 1);
        b= r.nextInt((lar- small) - 1);
        c = r.nextInt((lar - small) + 1);
        final TextView tv3 = (TextView) findViewById(R.id.score_text_view);

        switch (num) {

            case 1:
                b1.setText(Integer.toString(n1 + n2));
                b2.setText(Integer.toString(a));
                b3.setText(Integer.toString(b));
                b4.setText(Integer.toString(c));
                b1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (total_questions == 0)
                            ct.start();

                        if (time > 0) {
                            count++;
                            int s1 = Integer.parseInt((String) tv3.getText());
                            s1 = s1 + 1;
                            score = s1;
                            tv3.setText(Integer.toString(s1));
                            total_questions = total_questions + 1;
                            newActivity();

                        } else {

                            return;
                        }

                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();
                        } else
                            return;

                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();
                        } else
                            return;

                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();
                        } else
                            return;

                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),SplashScreen.class);
                        startActivity(i);
                    }
                });
                break;

            case 2:
                b2.setText(Integer.toString(n1 + n2));
                b1.setText(Integer.toString(a));
                b3.setText(Integer.toString(b));
                b4.setText(Integer.toString(c));


                b2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (total_questions == 0)
                            ct.start();
                        if (time > 0) {
                            count++;
                            int s1 = Integer.parseInt((String) tv3.getText());
                            s1 = s1 + 1;
                            score = s1;
                            tv3.setText(Integer.toString(s1));
                            total_questions = total_questions + 1;
                            newActivity();

                        } else {
                            return;
                        }

                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            total_questions = total_questions + 1;
                            count++;
                            newActivity();

                        } else
                            return;

                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),SplashScreen.class);
                        startActivity(i);
                    }
                });
                break;


            case 3:
                b3.setText(Integer.toString(n1 + n2));
                b1.setText(Integer.toString(a));
                b2.setText(Integer.toString(b));
                b4.setText(Integer.toString(c));


                b3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (total_questions == 0)
                            ct.start();
                        if (time > 0) {
                            count++;
                            int s1 = Integer.parseInt((String) tv3.getText());
                            s1 = s1+ 1;
                            score = s1;
                            tv3.setText(Integer.toString(s1));
                            total_questions = total_questions + 1;
                            newActivity();

                        } else {
                            return;
                        }

                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),SplashScreen.class);
                        startActivity(i);
                    }
                });
                break;

            case 4:
                b4.setText(Integer.toString(n1 + n2));
                b1.setText(Integer.toString(a));
                b2.setText(Integer.toString(b));
                b3.setText(Integer.toString(c));


                b4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (total_questions == 0)
                            ct.start();
                        if (time > 0) {
                            count++;
                            int s1 = Integer.parseInt((String) tv3.getText());
                            s1 = s1 + 1;
                            score = s1;
                            tv3.setText(Integer.toString(s1));
                            total_questions = total_questions + 1;
                            newActivity();

                        } else {
                            return;
                        }

                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();

                        } else
                            return;

                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if (time > 0) {
                            count++;
                            total_questions = total_questions + 1;
                            newActivity();
                        } else
                            return;

                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),SplashScreen.class);
                        startActivity(i);
                    }
                });
                break;


        }


    }

}















