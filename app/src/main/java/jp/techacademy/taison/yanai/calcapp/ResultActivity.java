package jp.techacademy.taison.yanai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        double answer = intent.getDoubleExtra("answer",0);//0は値がなかった時のデフォ
        String Answer = Double.toString(answer);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(Answer);
    }
}
