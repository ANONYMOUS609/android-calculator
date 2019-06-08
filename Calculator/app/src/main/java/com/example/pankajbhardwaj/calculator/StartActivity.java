package com.example.pankajbhardwaj.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final HashMap<Button, Boolean> map = new HashMap<>();
        setContentView(R.layout.activity_main);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnc = (Button) findViewById(R.id.btnc);
        Button btna = (Button) findViewById(R.id.btnplus);
        Button btns = (Button) findViewById(R.id.btnminus);
        Button btnd = (Button) findViewById(R.id.btndiv);
        Button btnm = (Button) findViewById(R.id.btnmul);
        Button btne = (Button) findViewById(R.id.btne);
        map.put(btna, false);
        map.put(btns, false);
        map.put(btnm, false);
        map.put(btnd, false);
        final Set<Button> set = map.keySet();
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                TextView tv1 = (TextView) findViewById(R.id.txtsmall);
                String one = tv.getText().toString();
                String two = tv1.getText().toString();
                int resone = 0;
                int restwo = 1;
                int ans = resone + restwo;
                tv.setText(ans+"");
                tv1.setText("");
            }
        });
        /*btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button btn : set) {
                    if (map.get(btn)) {

                    }
                }
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) findViewById(R.id.txtv);
        String str = tv.getText().toString();
        if (v.getId() == R.id.btnc) {
            tv.setText("");
        } else {
            char ch = ' ';
            switch (v.getId()) {
                case R.id.btn0:
                    ch = '0';
                    break;
                case R.id.btn1:
                    ch = '1';
                    break;
                case R.id.btn2:
                    ch = '2';
                    break;
                case R.id.btn3:
                    ch = '3';
                    break;
                case R.id.btn4:
                    ch = '4';
                    break;
                case R.id.btn5:
                    ch = '5';
                    break;
                case R.id.btn6:
                    ch = '6';
                    break;
                case R.id.btn7:
                    ch = '7';
                    break;
                case R.id.btn8:
                    ch = '8';
                    break;
                case R.id.btn9:
                    ch = '9';
                    break;
            }
            tv.setText(str + ch);
        }
    }
}
