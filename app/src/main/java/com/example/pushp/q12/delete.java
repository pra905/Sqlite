package com.example.pushp.q12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class delete extends AppCompatActivity {

    EditText name;
    Button delete;
    database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        db = new database(this);

        name = (EditText) findViewById(R.id.editText2);
        delete = (Button) findViewById(R.id.button5);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.delete(name.getText().toString());
                finish();
            }
        });
    }
}
