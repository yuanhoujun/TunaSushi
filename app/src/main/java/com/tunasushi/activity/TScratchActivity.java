package com.tunasushi.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.tunasushi.R;
import com.tunasushi.tuna.TScratch;
/**
 * @author Tunasashimi
 * @date 10/30/15 16:53
 * @Copyright 2015 Sashimi. All rights reserved.
 * @Description
 */
public class TScratchActivity extends Activity {

    private TScratch tScratch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_t_scratch);

        tScratch = findViewById(R.id.tScratch);

        tScratch.setOnScratchCompleteListener(new TScratch.onScratchCompleteListener() {
            @Override
            public void onScratchComplete() {
                Toast.makeText(getApplicationContext(), "刮除面积达到阈值", Toast.LENGTH_SHORT).show();
            }
        });
    }
}