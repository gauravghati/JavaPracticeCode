package com.example.hp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    Button btnsec;
    Button btnthird;
    EditText ename;
    TextView display;

    final int ACTIVITY3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsec = findViewById(R.id.button2);
        btnthird = findViewById(R.id.button3);
        ename = findViewById(R.id.editText);
        display = findViewById(R.id.textView3);


        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ename.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(MainActivity.this,"Please Enter all field",Toast.LENGTH_SHORT);
                    toast.show();
                }

                else{
                    String name = ename.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("data",name);
                    startActivity(intent);
                }
            }
        });

        btnthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                 startActivityForResult(intent,ACTIVITY3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK)
        {
            display.setText(data.getStringExtra("surname"));
        }
        else if(resultCode == RESULT_CANCELED){
            display.setText("no data received");
        }
    }
}
