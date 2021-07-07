package com.study.ex08_basiccontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity5 extends AppCompatActivity {
    ProgressBar progressBar;
    ProgressBar progressBar2;

    int time = 0;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    progressBar=findViewById(R.id.progressBar);
    progressBar2=findViewById(R.id.progressBar2);
    //타이머 발생시키기
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                time++;

                progressBar2.setProgress(time);
                if(time >=100){
                    dialog.dismiss();//닫아줌.
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,1000,100); //0.1초마다 호출

        showProgressDialog();

    }
    void showProgressDialog(){
        dialog = new ProgressDialog(MainActivity5.this);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setMessage("통신중입니다.");
        dialog.show();
    }
}