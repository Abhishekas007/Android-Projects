package com.abc.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

public class database extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "contacts";
    public static int DATABASE_VERSION = 1;
    public static String COLUMN_ID = "id";
    public static String COLUMN_NAME = "name";
    public static String COLUMN_MOBILE = "mobile";
    public static String COLUMN_EMAIL = "email";
    public static String TABLE_NAME = "contactinfo";
    public static String COLUMN_ADD = "address";


    public database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String creatable = " CREATE TABLE " + TABLE_NAME + " ( " + COLUMN_ID + " integer(10) primary key,"
                + " " + COLUMN_NAME + " varchar(50) NOT NULL,"
                + " " + COLUMN_MOBILE + " varchar(200) NOT NULL,"
                + " " + COLUMN_EMAIL + " varchar(200) NOT NULL,"
                + " " + COLUMN_ADD + " varchar(200) );";
        db.execSQL(creatable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addContact(contact contact) {

        SQLiteDatabase db1 = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, contact.getUname());
        cv.put(COLUMN_MOBILE, contact.getUcontact());
        cv.put(COLUMN_EMAIL, contact.getUemail());
        cv.put(COLUMN_ADD, contact.getUaddress());
        boolean h = db1.insert(TABLE_NAME, null, cv) != -1;
        return h;


    }

    public List<contact> getContact() {
        List<contact> dat = new ArrayList<>();
        SQLiteDatabase db2 = getReadableDatabase();
        Cursor c = db2.rawQuery("SELECT  *  FROM " + TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                dat.add(new contact(c.getString(1),c.getString(2),c.getString(3),c.getString(4)));
            }
            while (c.moveToNext());
        }
        return dat;


    }




}
