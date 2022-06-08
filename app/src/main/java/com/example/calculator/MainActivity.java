package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String data = "";
    TextView text_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_0 = findViewById(R.id.btn_0);
        Button btn_00 = findViewById(R.id.btn_00);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_ac = findViewById(R.id.btn_ac);
        Button btn_back = findViewById(R.id.btn_back);
        Button btn_check = findViewById(R.id.btn_check);
        Button btn_equal = findViewById(R.id.btn_equal);
        Button btn_plus = findViewById(R.id.btn_plus);
        Button btn_minus = findViewById(R.id.btn_minus);
        Button btn_multi = findViewById(R.id.btn_multi);
        Button btn_divide = findViewById(R.id.btn_divide);
        Button btn_dot = findViewById(R.id.btn_dot);
        text_ans = findViewById(R.id.text_ans);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("0");
            }
        });
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "00");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("");
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("");
            }
        });
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("");
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                calculate();
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("0");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("0");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + ".");
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText("0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text_ans.getText().toString();
                text_ans.setText(data + "9");
            }
        });

    }

    void calculate() {
        int i, ps = 0;
        String st1 = "", st2 = "";
        for (i = 0; i < data.length(); i++) {
            if (data.charAt(i) != '+') {
                st1 = st1 + data.charAt(i);
            } else {
                ps = i;
                break;
            }
        }
        for (int j = ps + 1; j < data.length(); j++) {
            st1 = st1 + data.charAt(j);
        }
        result(st1,st2);

    }

    void result(String t1,String t2) {
        int a=Integer.parseInt(t1);
        int b=Integer.parseInt(t2);

        text_ans.setText(""+(a+b));
    }
}