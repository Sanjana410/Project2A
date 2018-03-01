package com.example.sgarg.quizapp2;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScoresList extends AppCompatActivity {
    ListView score_list;
    ArrayList<String> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores_list);
        score_list=(ListView)findViewById(R.id.list_view);
        listscore();

        Button restart = (Button)findViewById(R.id.restart_btn);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(getApplicationContext(),SplashScreen.class);
                startActivity(v);
            }
        });
    }

    void listscore()
    {
        list =new ArrayList<>();
        try {
            SQLiteDatabase quizapp = this.openOrCreateDatabase("Scores", MODE_PRIVATE, null);
            Cursor c = quizapp.rawQuery("SELECT * from Scores", null);
            c.moveToFirst();
            int x = c.getColumnIndex("correct_ans");
            int y = c.getColumnIndex("incorr_ans");
            int z = c.getColumnIndex("Score");
            int u = c.getColumnIndex("Percentage");
            int v = c.getColumnIndex("Total_Ques");
            while (c != null) {
                list.add("\nCorrect Questions:   " + c.getString(x) + "\nIncorrect Questions:   " + c.getString(y) + "\nScore:     " + c.getString(z) + "\nPercentage:   " + c.getString(u) + "%" + "\nTotal Questions:   " + c.getString(v));
                c.moveToNext();


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
            score_list.setAdapter((ListAdapter) adapter);
        }
    }
}
