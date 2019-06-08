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
        final Button btna = (Button) findViewById(R.id.btnplus);
        final Button btns = (Button) findViewById(R.id.btnminus);
        final Button btnd = (Button) findViewById(R.id.btndiv);
        final Button btnm = (Button) findViewById(R.id.btnmul);
        Button btne = (Button) findViewById(R.id.btne);
        Button btndel = (Button) findViewById(R.id.btndel);
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                String str = tv.getText().toString();
                if (str.length() >= 1) {
                    tv.setText(str.substring(0,str.length() - 1));
                } else
                    tv.setText("");
                if (str.charAt(str.length() - 1) == '.') {
                    Button btnno = (Button) findViewById(R.id.btndecimal);
                    btnno.setVisibility(View.VISIBLE);
                }
            }
        });
        Button btnno = (Button) findViewById(R.id.btndecimal);
        Button btnno1 = (Button) findViewById(R.id.btnno1);
        Button btnno2 = (Button) findViewById(R.id.btnno2);
        btnno1.setVisibility(View.INVISIBLE);
        btnno2.setVisibility(View.INVISIBLE);
        map.put(btna, false);
        map.put(btns, false);
        map.put(btnm, false);
        map.put(btnd, false);
        btnno.setOnClickListener(this);
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
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                TextView tv1 = (TextView) findViewById(R.id.txtsmall);
                equal(map);
                tv1.setText(tv.getText());
                tv.setText("");
                map.put(btna ,true);
                Button btnn = (Button) findViewById(R.id.btndecimal);
                btnn.setVisibility(View.VISIBLE);
            }
        });
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                TextView tv1 = (TextView) findViewById(R.id.txtsmall);
                equal(map);
                tv1.setText(tv.getText());
                tv.setText("");
                map.put(btns ,true);
                Button btnn = (Button) findViewById(R.id.btndecimal);
                btnn.setVisibility(View.VISIBLE);
            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                TextView tv1 = (TextView) findViewById(R.id.txtsmall);
                equal(map);
                tv1.setText(tv.getText());
                tv.setText("");
                map.put(btnd ,true);
                Button btnn = (Button) findViewById(R.id.btndecimal);
                btnn.setVisibility(View.VISIBLE);
            }
        });
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                TextView tv1 = (TextView) findViewById(R.id.txtsmall);
                equal(map);
                tv1.setText(tv.getText());
                tv.setText("");
                map.put(btnm ,true);
                Button btnn = (Button) findViewById(R.id.btndecimal);
                btnn.setVisibility(View.VISIBLE);
            }
        });
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equal(map);
                Button btnn = (Button) findViewById(R.id.btndecimal);
                btnn.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void equal(HashMap<Button,Boolean> map) {
        Set<Button> set = map.keySet();
        for (Button btn : set) {
            if (map.get(btn)) {
                TextView tv = (TextView) findViewById(R.id.txtv);
                TextView tv1 = (TextView) findViewById(R.id.txtsmall);
                double numone = 0;
                double numtwo = 0;
                String str = tv.getText().toString();
                String strtwo = tv1.getText().toString();
                double result;
                switch (btn.getId()) {
                    case R.id.btnplus:
                        if (str.length() != 0) {
                            numone = Double.parseDouble(str);
                        }
                        if (strtwo.length() != 0) {
                            numtwo = Double.parseDouble(strtwo);
                        }
                        result = numone + numtwo;
                        tv.setText(result+"");
                        tv1.setText("");
                        break;
                    case R.id.btnminus:
                        if (str.length() != 0) {
                            numone = Double.parseDouble(str);
                        }
                        if (strtwo.length() != 0) {
                            numtwo = Double.parseDouble(strtwo);
                        }
                        result = numtwo - numone;
                        tv.setText(result+"");
                        tv1.setText("");
                        break;
                    case R.id.btnmul:
                        if (str.length() != 0) {
                            numone = Double.parseDouble(str);
                        }
                        if (strtwo.length() != 0) {
                            numtwo = Double.parseDouble(strtwo);
                        }
                        result = numtwo * numone;
                        tv.setText(result+"");
                        tv1.setText("");
                        break;
                    case R.id.btndiv:
                        if (str.length() != 0) {
                            numone = Double.parseDouble(str);
                        }
                        if (strtwo.length() != 0) {
                            numtwo = Double.parseDouble(strtwo);
                        }
                        result = numtwo / numone;
                        tv.setText(result+"");
                        tv1.setText("");
                        break;
                }
                break;
            }
        }
        for (Button btn : set) {
            map.put(btn,false);
        }
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
                case R.id.btndecimal:
                    ch = '.';
                    Button btnno = (Button) findViewById(R.id.btndecimal);
                    btnno.setVisibility(View.INVISIBLE);
                    break;
            }
            tv.setText(str + ch);
        }
    }
}
