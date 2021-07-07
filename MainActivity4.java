package com.study.ex08_basiccontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void onButton(View v){
        ((ImageButton)v).setSelected(true);
    //스낵바 팝업
        Snackbar.make(v,"버튼 상태가 selected로 바뀜",Snackbar.LENGTH_LONG).show();
    }

}