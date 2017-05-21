package com.example.pushp.q12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class update extends AppCompatActivity {

    EditText name, phone,OLDname;
    Button update;

    database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        name = (EditText) findViewById(R.id.editText);
        phone = (EditText) findViewById(R.id.editText5);
        OLDname = (EditText) findViewById(R.id.editText6);
        update = (Button) findViewById(R.id.button7);
        db = new database(this);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.update(name.getText().toString(),phone.getText().toString(),OLDname.getText().toString());
                finish();
            }
        });
    }
}
