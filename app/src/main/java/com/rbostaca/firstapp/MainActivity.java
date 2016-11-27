package com.rbostaca.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");
        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);
        mainEditText = (EditText) findViewById(R.id.main_edittext);
    }

    public void OnButtonClick(View v){
        Toast.makeText(getApplicationContext(),"Ai apasat pe +!",Toast.LENGTH_LONG).show();
    }

    public void OnButtonClick2(View v){
        Toast.makeText(getApplicationContext(),"Ai apasat pe play!",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        mainTextView.setText(mainEditText.getText().toString()
                + " invata Android!");

    }
}
