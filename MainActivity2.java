package com.study.ex08_basiccontrol;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
public class MainActivity2 extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBox2;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
    }
    public void onCheckBox(View v) {
        if(checkBox.isChecked()) {
            Log.e("Main2", "checkBox1 체크");
        }else{
            Log.e("Main2", "checkBox1 언체크");
        }
        if(checkBox2.isChecked()) {
            Log.e("Main2", "checkBox2 체크.");
        }else{
            Log.e("Main2", "checkBox2 언체크.");
        }
    }
    public void onRadioButton(View v) {
        if( radioButton.isChecked() ) {
            Log.e("Main2", "radioButton1 체크.");
        }else{
            Log.e("Main2", "radioButton1 언체크.");
        }
        //리소스 아이디를 얻어온다. 어떤 라디오버튼인지 알수있음.
        int resid = ((RadioButton)v).getId();
        if( resid == R.id.radioButton ) {
            if( radioButton.isChecked() ) {
                Log.e("Main2", "radioButton1 체크.");
            }else{
                Log.e("Main2", "radioButton1 언체크.");
            }
        }
        else if( resid == R.id.radioButton2 ) {
            if( radioButton2.isChecked() ) {
                Log.e("Main2", "radioButton2 체크.");
            }else{
                Log.e("Main2", "radioButton2 언체크.");
            }
        }
        else if( resid == R.id.radioButton3 ) {
            if( radioButton3.isChecked() ) {
                Log.e("Main2", "radioButton3 체크.");
            }else{
                Log.e("Main2", "radioButton3 언체크.");
            }
        }
    }
}