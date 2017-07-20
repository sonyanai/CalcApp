package jp.techacademy.taison.yanai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText aEditText;
    EditText bEditText;
    double answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        aEditText = (EditText) findViewById(R.id.editText1);
        bEditText = (EditText) findViewById(R.id.editText2);
    }
    @Override
    public void onClick(View v){

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setOnClickListener(this);

        if (aEditText.getText().toString().length()==0 || bEditText.getText().toString().length()==0){
            textView.setText("数字を入力してください");
            textView.setTextSize(20);
        }else{
            double an1 = Double.parseDouble(aEditText.getText().toString());
            double an2 = Double.parseDouble(bEditText.getText().toString());

            if (v.getId() == R.id.button1){
                answer = an1 + an2;
                Intent intent = new Intent(this,ResultActivity.class);
                intent.putExtra("Answer",answer);
                startActivity(intent);
            }else if(v.getId() == R.id.button2){
                answer = an1 - an2;
                Intent intent = new Intent(this,ResultActivity.class);
                intent.putExtra("Answer",answer);
                startActivity(intent);
            }else if(v.getId() == R.id.button3){
                answer = an1 * an2;
                Intent intent = new Intent(this,ResultActivity.class);
                intent.putExtra("Answer",answer);
                startActivity(intent);
            }else{
                if(an2 == 0){
                    textView.setText("0で割ることはできません");
                }else{
                    answer = an1 / an2;
                    Intent intent = new Intent(this,ResultActivity.class);
                    intent.putExtra("Answer",answer);
                    startActivity(intent);
                }
            }
        }
    }
}
