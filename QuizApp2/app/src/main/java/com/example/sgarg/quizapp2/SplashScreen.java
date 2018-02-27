package com.example.sgarg.quizapp2;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        }.start();
    }
}






//    HashMap<String, String> questions = new HashMap<>();
//    ArrayList<HashMap<String, String>> lstAns;
//    ArrayList<HashMap<String, String>> mylist;
//    TextView question_text_view;
//    Button b1,b2,b3,b4;
//    Random rand = new Random();
//    String value;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        question_text_view= findViewById(R.id.question_text_view);
//        b1 = findViewById(R.id.button1);
//        b2 = findViewById(R.id.button2);
//        b3 = findViewById(R.id.button3);
//        b4 = findViewById(R.id.button4);
//        questions.put("7+11", "18");
//        questions.put("3+2", "5");
//        questions.put("7+8", "15");
//        questions.put("6+7", "13");
//        lstAns = new ArrayList<HashMap<String,String>>();
//        mylist = new ArrayList<HashMap<String,String>>();
//        lstAns.add(questions);
//        for (HashMap<String, String> map : lstAns)
//            for (Map.Entry<String, String> mapEntry : map.entrySet())
//            {
//                String key = mapEntry.getKey();
//                value = mapEntry.getValue();
//                question_text_view.setText(key);
//                int v = Integer.parseInt(value);
//                Log.e("Value",""+(rand.nextInt())/v);
//                b1.setText(""+ (rand.nextInt(v)));
//                b2.setText(""+rand.nextInt(v));
//                b3.setText(""+rand.nextInt(v));
//                b4.setText(value);
//            }
//    }
//
//    public void score(View v)
//    {
//        int id = v.getId();
//        switch (id){
//
//            case R.id.button1:
//
//                break;
//
//            case R.id.button2:
//                break;
//
//            case R.id.button3:
//                break;
//
//            case R.id.button4:
//                break;
//        }
//
//    }

