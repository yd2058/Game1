package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    String str ="";
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
        tv[0].setText(String.valueOf(temp1));
        tv[1].setText(String.valueOf(temp2));
    }

    public void go1(View view) {
        if (!bo[0]){
            if((temp1+temp2==Integer.parseInt(String.valueOf(et[0].getText())))){
                imgv[0].setImageResource(R.drawable.vee);sum++;}
            else{
                imgv[0].setImageResource(R.drawable.ix);}
            bo[0] = true;
            temp1 = (rnd.nextInt(90)+10);
            temp2 = (rnd.nextInt(90)+10);
            tv[2].setText(String.valueOf(temp1));
            tv[3].setText(String.valueOf(temp2));
        }
    }

    public void go2(View view) {
        if(bo[0]&&!(bo[1])){
            if((temp1+temp2==Integer.parseInt(String.valueOf(et[1].getText())))){
                imgv[1].setImageResource(R.drawable.vee); sum++;}
            else{
                imgv[1].setImageResource(R.drawable.ix);}
            bo[1] = true;
            temp1 = (rnd.nextInt(90)+10);
            temp2 = (rnd.nextInt(90)+10);
            tv[4].setText(String.valueOf(temp1));
            tv[5].setText(String.valueOf(temp2));
        }
    }

    public void go3(View view) {
        if(bo[1]&&!(bo[2])){
            if((temp1+temp2==Integer.parseInt(String.valueOf(et[2].getText())))){
                imgv[2].setImageResource(R.drawable.vee); sum++;}
            else{
                imgv[2].setImageResource(R.drawable.ix);}
            bo[2] = true;
            str+= String.valueOf(100/sum) + " % done, " +String.valueOf(sum) + "/3";
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }


}

    public void clrng(View view) {
        for(int i = 0; i<3; i++)
            bo[i] = false;
        for(int i=0; i<6; i++)
            tv[i].setText("");
        imgv[0].setImageResource(R.drawable.trans);
        imgv[1].setImageResource(R.drawable.trans);
        imgv[2].setImageResource(R.drawable.trans);
        str = "";
        temp1 = (rnd.nextInt(90)+10);
        temp2 = (rnd.nextInt(90)+10);
        tv[0].setText(String.valueOf(temp1));
        tv[1].setText(String.valueOf(temp2));
    }
    }