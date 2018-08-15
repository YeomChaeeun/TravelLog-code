package com.massivcode.choisfamily.tracking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    // 여행 계획 버튼
    Button planBtn;
    // 로그 시작 버튼
    Button logBtn;
    // 여행 목록 버튼
    Button listBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        planBtn = (Button) findViewById(R.id.planBtn);
        logBtn = (Button) findViewById(R.id.logBtn);
        listBtn = (Button) findViewById(R.id.listBtn);

        // 여행 계획 이동


        // 여행 목록 이동

    }

    // 로그 시작 이동
    public void clickedLogBtn(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
