package com.example.hp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText editText;
    Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().isEmpty())
                {
                    Toast toast = Toast.makeText(Main3Activity.this,"Please Enter all field",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    String surname = editText.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("surname", surname);
                    setResult(RESULT_OK, intent);
                    Main3Activity.this.finish();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED,intent);
                Main3Activity.this.finish();
            }
        });
    }
}
