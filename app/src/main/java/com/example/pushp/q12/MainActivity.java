package com.example.pushp.q12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button insert,delete,update,view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insert = (Button) findViewById(R.id.button);
        delete = (Button) findViewById(R.id.button2);
        update = (Button) findViewById(R.id.button3);
        view = (Button) findViewById(R.id.button4);
        insert.setOnClickListener(this);
        delete.setOnClickListener(this);
        update.setOnClickListener(this);
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Called",Toast.LENGTH_SHORT);

        if(v.getId()==R.id.button)
        {
            startActivity(new Intent(this,insert.class));
        }

        if(v.getId()==R.id.button2)
        {
            startActivity(new Intent(this,delete.class));
        }
        if(v.getId()==R.id.button3)
        {
            startActivity(new Intent(this,update.class));
        }
        if(v.getId()==R.id.button4)
        {
            startActivity(new Intent(this,view.class));
        }
    }
}
