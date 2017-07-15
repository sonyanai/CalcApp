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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        aEditText = (EditText) findViewById(R.id.editText1);
        bEditText = (EditText) findViewById(R.id.editText2);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("Value1",20);
        intent.putExtra("Value2",20);
        startActivity(intent);
    }
}
