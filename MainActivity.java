package com.siddhesh.convertease;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private Button reverse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.convert);
        textView=findViewById(R.id.output);
        editText=findViewById(R.id.input);
        reverse=findViewById(R.id.reverse_unit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editText.getText().toString();
                int a=Integer.parseInt(s);
                long b= a* 1000L;
                textView.setText("Value of "+a+" Kg in gram is = "+b);
            }
        });

       reverse.setOnClickListener(view -> reverseUnit(view));

    }
    public void reverseUnit(View view){
       Intent intent=new Intent(this,ReverseActivity.class);
        startActivity(intent);
    }

}
