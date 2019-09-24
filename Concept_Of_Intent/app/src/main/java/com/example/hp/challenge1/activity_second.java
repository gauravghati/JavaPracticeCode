package com.example.hp.challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class activity_second extends AppCompatActivity implements View.OnClickListener{

    EditText name , phoneNumber , webSide , location ;
    ImageView happy , medium , sad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.edtname);
        phoneNumber = findViewById(R.id.edtphone);
        webSide = findViewById(R.id.edtweb);
        location = findViewById(R.id.edtlocation);

        happy = findViewById(R.id.vsHappy);
        sad = findViewById(R.id.vsSad);
        medium = findViewById(R.id.vsMedium);

        sad.setOnClickListener(this);
        happy.setOnClickListener(this);
        medium.setOnClickListener(this);
        }

    @Override
    public void onClick(View v){
         if(phoneNumber.getText().toString().isEmpty() || name.getText().toString().isEmpty()
                 || webSide.getText().toString().isEmpty() || location.getText().toString().isEmpty())
         {
             Toast toast = Toast.makeText(activity_second.this,"Please Enter all the fields",Toast.LENGTH_SHORT);
             toast.show();
         }
         else {
             Intent intent = new Intent();
             intent.putExtra("name", name.getText().toString().trim());
             intent.putExtra("phoneNumber",phoneNumber.getText().toString().trim());
             intent.putExtra("webSide", webSide.getText().toString().trim());
             intent.putExtra("location", location.getText().toString().trim());

             if(v.getId() == R.id.vsSad)
                 intent.putExtra("ButtonValue","sad");

             else if(v.getId()==R.id.vsHappy)
                 intent.putExtra("ButtonValue","happy");

             else if(v.getId() == R.id.vsMedium)
                  intent.putExtra("ButtonValue","medium");

             setResult(RESULT_OK,intent);
             activity_second.this.finish();
         }
    }
}
