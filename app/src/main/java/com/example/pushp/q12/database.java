package com.example.pushp.q12;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class database extends SQLiteOpenHelper {

    static final String DB_NAME = "ContactDatabase";
    static final String TABLENAME = "contact";
    static final String NAME = "name";
    static final String Mobile_NUMBER = "mob_number";

    static final String CREATE_TABLE_SQUERY = "create table "+ TABLENAME + "( _id integer PRIMARY KEY AUTOINCREMENT, " + NAME + " varchar(50), " + Mobile_NUMBER
            +" varchar(10) "+")";

    public database(Context context) {

        super(context, DB_NAME, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_SQUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists" + TABLENAME);
        onCreate(db);
    }

    void insert(String name,String mob) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, name);
        contentValues.put(Mobile_NUMBER,mob);
        db.insert(TABLENAME, null, contentValues);
    }

    void delete(String name)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLENAME, NAME + "=?",new String[]{name});
    }

    void update(String name,String ph,String OldName)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME,name);
        contentValues.put(Mobile_NUMBER,ph);
        db.update(TABLENAME,contentValues,NAME +"=?",new String[]{OldName});
    }

    Cursor view()
    {
        return this.getReadableDatabase().query(TABLENAME,new String[]{"_id",NAME,Mobile_NUMBER},
                null,
                null,
                null,
                null,
                null);
    }
}
