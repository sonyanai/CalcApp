package jp.techacademy.taison.yanai.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        double an1 = new Double(String.valueOf(aEditText));
        double an2 = new Double(String.valueOf(bEditText));

        if(v.getId() == R.id.button1){
            answer = an1 + an2;
        }else if(v.getId() == R.id.button2){
            answer = an1 - an2;
        }else if(v.getId() == R.id.button3){
            answer = an1 * an2;
        }else{
            answer = an1 / an2;
        }

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("Answer",answer);
        startActivity(intent);
    }
}
