package com.lqr.customerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lqr.customerview.ui.practice0.CircleProgressActivity;
import com.lqr.customerview.ui.practice0.PostManLoadingActivity;
import com.lqr.customerview.ui.practice1.PracticeDrawActivity1;
import com.lqr.customerview.ui.practice2.PracticeDrawActivity2;
import com.lqr.customerview.ui.practice3.PracticeDrawActivity3;
import com.lqr.customerview.ui.practice4.PracticeDrawActivity4;
import com.lqr.customerview.ui.practice5.PracticeDrawActivity5;
import com.lqr.customerview.ui.practice6.PracticeDrawActivity6;
import com.lqr.customerview.ui.practice7.PracticeDrawActivity7;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CircleProgressView(View view) {
        startActivity(new Intent(this, CircleProgressActivity.class));
    }

    public void PostManLoadingView(View view) {
        startActivity(new Intent(this, PostManLoadingActivity.class));
    }

    public void PracticeDrawActivity1(View view) {
        startActivity(new Intent(this, PracticeDrawActivity1.class));
    }

    public void PracticeDrawActivity2(View view) {
        startActivity(new Intent(this, PracticeDrawActivity2.class));
    }

    public void PracticeDrawActivity3(View view) {
        startActivity(new Intent(this, PracticeDrawActivity3.class));
    }

    public void PracticeDrawActivity4(View view) {
        startActivity(new Intent(this, PracticeDrawActivity4.class));
    }

    public void PracticeDrawActivity5(View view) {
        startActivity(new Intent(this, PracticeDrawActivity5.class));
    }

    public void PracticeDrawActivity6(View view) {
        startActivity(new Intent(this, PracticeDrawActivity6.class));
    }

    public void PracticeDrawActivity7(View view) {
        startActivity(new Intent(this, PracticeDrawActivity7.class));
    }
}
