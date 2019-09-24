package com.example.hp.challenge1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView call , web , location , mood;
    Button btnNewContact;
    EditText text;
    final int CREATE_CONTACT = 1;
    String stringlocation , moodbyFace , phoneNumber , webSide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = findViewById(R.id.vsCall);
        web = findViewById(R.id.vsWeb);
        location = findViewById(R.id.vslocation);
        btnNewContact = findViewById(R.id.btnNewContact);
        text = findViewById(R.id.edtNamePrint);
        mood = findViewById(R.id.vsMood);

        call.setVisibility(View.GONE);
        web.setVisibility(View.GONE);
        location.setVisibility(View.GONE);
        mood.setVisibility(View.GONE);


        btnNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, activity_second.class);
                startActivityForResult(intent,CREATE_CONTACT);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+phoneNumber));
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+webSide));
                startActivity(intent);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+stringlocation));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CREATE_CONTACT) {
            if (resultCode == RESULT_OK) {
                call.setVisibility(View.VISIBLE);
                web.setVisibility(View.VISIBLE);
                location.setVisibility(View.VISIBLE);
                mood.setVisibility(View.VISIBLE);

                String name = data.getStringExtra("name");
                text.setText(name);
                webSide = data.getStringExtra("webSide");
                phoneNumber = data.getStringExtra("phoneNumber");
                stringlocation = data.getStringExtra("location");
                moodbyFace = data.getStringExtra("ButtonValue");

                if (moodbyFace.equals("happy"))
                    mood.setImageResource(R.drawable.happy);

                else if (moodbyFace.equals("sad"))
                    mood.setImageResource(R.drawable.sad);

                else if (moodbyFace.equals("medium"))
                    mood.setImageResource(R.drawable.medium_feeling);
            } else {
                Toast.makeText(MainActivity.this, "No Data Passed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
