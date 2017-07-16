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
    double value1 = Double.parseDouble(String.valueOf(aEditText));
    double value2 = Double.parseDouble(String.valueOf(bEditText));

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

        //double value1 = Double.parseDouble(String.valueOf(aEditText));
        //double value2 = Double.parseDouble(String.valueOf(bEditText));

        if(v.getId() == R.id.button1){
            answer = value1 + value2;
        }else if(v.getId() == R.id.button2){
            answer = value1 - value2;
        }else if(v.getId() == R.id.button3){
            answer = value1 * value2;
        }else{
            answer = value1 / value2;
        }
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("Answer",answer);
        startActivity(intent);
    }
}
