package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView[] tv = new TextView[6];
    EditText[] et = new EditText[3];
    Button[] btn = new Button[4];
    ImageView[] imgv = new ImageView[3];
    boolean[] bo = {false, false, false};
    Random rnd = new Random();
    int sum = 0;
    int temp1, temp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv[0] = (TextView)findViewById(R.id.tv11);
        tv[1] = (TextView)findViewById(R.id.tv12);
        tv[2] = (TextView)findViewById(R.id.tv21);
        tv[3] = (TextView)findViewById(R.id.tv22);
        tv[4] = (TextView)findViewById(R.id.tv31);
        tv[5] = (TextView)findViewById(R.id.tv32);

        et[0] = (EditText)findViewById(R.id.tee1);
        et[1] = (EditText)findViewById(R.id.te2);
        et[2] = (EditText)findViewById(R.id.te3);

        btn[0] = (Button)findViewById(R.id.butn1);
        btn[1] = (Button)findViewById(R.id.butn2);
        btn[2] = (Button)findViewById(R.id.butn3);
        btn[3] = (Button)findViewById(R.id.btnew);

        imgv[0] = (ImageView)findViewById(R.id.iv1);
        imgv[1] = (ImageView)findViewById(R.id.iv2);
        imgv[2] = (ImageView)findViewById(R.id.iv3);

        temp1 = (rnd.nextInt(90)+10);
        temp2 = (rnd.nextInt(90)+10);
        tv[0].setText(temp1);
        tv[1].setText(temp2);
    }

    public void go1(View view) {
        if (!bo[0]){
            if((temp1+temp2==et[0].getText()))
        }
    }

    public void go2(View view) {
    }

    public void go3(View view) {
    }

    public void clr(View view) {

    }
}