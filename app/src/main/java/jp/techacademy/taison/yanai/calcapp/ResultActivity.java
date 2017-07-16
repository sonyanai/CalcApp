package jp.techacademy.taison.yanai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    double answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        answer = intent.getDoubleExtra("Answer",0);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.valueOf(answer));
    }
    /*@Override
    public void onClick(View v){
        if(v.getId() == R.id.button1){
            answer = value1 + value2;
        }else if(v.getId() == R.id.button2){
            answer = value1 - value2;
        }else if(v.getId() == R.id.button3){
            answer = value1 * value2;
        }else{
            answer = value1 / value2;
        }
    }*/
}
