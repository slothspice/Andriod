package com.jack.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle(R.string.about);
    }
}
