package com.example.sgarg.quizapp2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreView extends AppCompatActivity {
    int corr_ans ,incorr_ans;
    int sc ,tq;
    double per;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_view);
        TextView txt=(TextView) findViewById(R.id.Scores);
        TextView textView = (TextView)findViewById(R.id.total_ques);

        Intent intent = getIntent();
       String score = intent.getStringExtra("scores");
        txt.setText(score);
        sc = Integer.parseInt(score);
       String total_ques = intent.getStringExtra("totalQ");
        textView.setText(total_ques);
        tq = Integer.parseInt(total_ques);
        corr_ans = sc;
        incorr_ans = tq - corr_ans;
        per = ((corr_ans/tq)*100);
        scores(corr_ans,incorr_ans,sc,per,tq);



        Button View=(Button) findViewById(R.id.Scv);

        View.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent in2=new Intent(getApplicationContext(),ScoresList.class);
                startActivity(in2);
            }
        });
    }

    void scores(int c,int i,int s,double p,int t)
    {
     try
     {
         SQLiteDatabase quizapp = this.openOrCreateDatabase("Scores",MODE_PRIVATE,null);
         quizapp.execSQL("CREATE TABLE IF NOT EXISTS Scores(correct_ans INT ,incorr_ans INT,Score INT,Percentage DECIMAL,Total_Ques INT)");
         quizapp.execSQL("INSERT INTO Scores(correct_ans,incorr_ans,Score,Percentage,Total_Ques)VAlUES ('"+c+"','"+i+"','"+s+"','"+p+"','"+t+"')");

     }

     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
