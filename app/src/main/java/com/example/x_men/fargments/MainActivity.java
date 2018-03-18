package com.example.x_men.fargments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.fargments.R;

public class MainActivity extends AppCompatActivity {

    private boolean mTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewGroup fragmentContainer =
                findViewById (R.id.detail_fragment_container);
        mTablet = (fragmentContainer != null);

        TextView tvOut = findViewById (R.id.textOut);
        tvOut.setText ("Fragments side-by-side? = " + mTablet);

    }

}
