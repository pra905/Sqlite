package com.example.pushp.q12;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class view extends AppCompatActivity {

    ListView listView;
    database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        db = new database(this);
        listView = (ListView) findViewById(R.id.listview);
        Cursor data = db.view();
        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(this,R.layout.single_row,data,
                new String[]{db.NAME,db.Mobile_NUMBER},new int[]{R.id.textView4,R.id.textView5},0);
        listView.setAdapter(simpleCursorAdapter);
    }
}
