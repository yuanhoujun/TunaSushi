package com.tunasushi.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tunasushi.R;
import com.tunasushi.tuna.TView;
import com.tunasushi.tuna.TWrap;

import java.util.Arrays;

public class TWrapActivity extends Activity {
    private TWrap tWrap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_t_wrap);

        tWrap = findViewById(R.id.tWrap);
        tWrap.setTWrapItemTextValueArray(
            new String[]{
                " 用户要求换车 ", "车辆不整洁", "车辆设施不完备 ", "车辆损坏 "
            });

        tWrap.setTouchUpListener(new TView.TouchUpListener() {
            @Override
            public void touchUp(TView t) {
                tWrap.setWrapCurrentXY(tWrap.getTouchEventX(), tWrap.getTouchEventY());
            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), Arrays.toString(tWrap.getWrapCurrentSelect()), Toast.LENGTH_LONG).show();
            }
        });
    }
}