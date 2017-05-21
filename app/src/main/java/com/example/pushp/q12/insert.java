package com.example.pushp.q12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class insert extends AppCompatActivity {

    database db;
    EditText name,mob;
    Button insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        name = (EditText) findViewById(R.id.editText3);
        mob = (EditText) findViewById(R.id.editText4);
        insert = (Button) findViewById(R.id.button6);
        db = new database(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insert(name.getText().toString(),mob.getText().toString());
                finish();
            }
        });
    }
}
