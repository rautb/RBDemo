package com.example.buddhadebraut.rbdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg;
    RadioButton rb;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn=(Button)findViewById(R.id.btn);
        rg=(RadioGroup)findViewById(R.id.rg);

        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectetd=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(selectetd);
                Toast.makeText(MainActivity.this,rb.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
