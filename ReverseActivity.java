package com.siddhesh.convertease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private  Button reverse1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        button=findViewById(R.id.convert);
        textView=findViewById(R.id.output);
        editText=findViewById(R.id.input);
        reverse1=findViewById(R.id.reverse_unit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editText.getText().toString();
                int a=Integer.parseInt(s);
                double b= a/1000F;
                textView.setText("Value of "+a+" grams in Kg is = "+b);
            }
        });

        reverse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                reverseUnit(view);
            }
        });
    }
    public void reverseUnit(View view){
       Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
