package com.example.admin.stobular;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class QuizActivity extends AppCompatActivity {

    TextView times;

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestionLibrary.mQuestions.length;
    private Context context;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.txtQuestion);
        mButtonChoice1 = (Button) findViewById(R.id.button1);
        mButtonChoice2 = (Button) findViewById(R.id.button2);
        mButtonChoice3 = (Button) findViewById(R.id.button3);
        mButtonChoice4 = (Button) findViewById(R.id.button4);

        times = (TextView) findViewById(R.id.timers);

        updateQuestion(r.nextInt(mQuestionsLength));
        times.setText("00");
        CounterClass timer = new CounterClass(60000, 1000);
        timer.start();


        updateQuestion(r.nextInt(mQuestionsLength));

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionsLength));
                }

            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionsLength));
                }

            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionsLength));
                }

            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionsLength));
                }

            }
        });


    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onFinish() {
            timeUp(context);

        }


        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub

            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d",
                    TimeUnit.MILLISECONDS.toSeconds(millis));
            System.out.println(hms);
            times.setText(hms);
        }

    }

    public void timeUp(Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(
                QuizActivity.this);
        builder.setTitle("Times up!")
                .setMessage("Game over")
                .setCancelable(false)
                .setNeutralButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                QuizActivity.this.finish();
                                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                                intent.putExtra ("score", mScore);
                                startActivity(intent);
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }



    private void updateQuestion(int mQuestionNumber){

        if(mQuestionNumber<mQuestionLibrary.getLength()) {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);

    }
    else {
            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
            intent.putExtra ("score", mScore);
            startActivity(intent);
        }
        }

    private void updateScore(int point) {
        mScoreView.setText(" Score   " + mScore);
    }

    public void back(View o) {

        Intent intent = new Intent(QuizActivity.this, home.class);

        startActivity(intent);

    }


}

