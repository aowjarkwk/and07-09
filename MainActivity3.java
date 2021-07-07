package com.study.ex08_basiccontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //변경 전에 호출
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //변경 되었을때 호출
                int len = editText.getText().toString().length();
                textView.setText(len+"/20자 입력됨");
            }

            @Override
            public void afterTextChanged(Editable s) {
                //변경 후에 호출
            }
        });
    }

}