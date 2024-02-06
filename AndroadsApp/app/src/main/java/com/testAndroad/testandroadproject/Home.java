package com.testAndroad.testandroadproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    private Button buttonContact;
    private Button viewmember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonContact=findViewById(R.id.button2);
        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Contact.class);
                startActivity(intent);
            }
        });



        viewmember=findViewById(R.id.btngallary);
        viewmember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, ViewMember.class);
                startActivity(intent);
            }
        });



    }


}