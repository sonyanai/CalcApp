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
        int value1 = intent.getIntExtra("Value1",0);
        int value2 = intent.getIntExtra("Value2",0);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.valueOf(value1+value2));
    }
}
