package com.example.matt.llr_toolkit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseAgent extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "userdata.sqlite";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db = this.getWritableDatabase();


    //Look into Logcat for debugging
    public DatabaseAgent(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /* Would BigDecimal be more efficient for monetary representation?
    *  Better alternative to the String data type for Date_Added?
    *  Private classes for each table containing final strings with respective column names?
    *  Also note Export_ID isn't listed as an argument because that wouldn't be known at the time
    *  of entry.*/
    public boolean insertSize(String newSize) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("size", newSize);
        long result = db.insert("Things", null, contentValues);
        return result != -1;
    }

    public String[] getFieldData (String field, int styleID, int sizeID, int importID) {
        String table;
        String[] str;

        if (field.equals("style")) table = "Styles";
        else if (field.equals("size")) table = "Sizes";
        else table = "Imports";

        Cursor cursor = db.query("Styles", new String[] {"style"}, null, null, null, null, null);
        int cursorCount = cursor.getCount();
        if (cursorCount > 0) {
            str = new String[cursorCount];
            int i = 0;
            while (cursor.moveToNext()) {
                str[i] = cursor.getString(cursor.getColumnIndex("style"));
                i++;
            }
            return str;
        }
        else {
            return new String[] {};
        }
        cursor.close();
    }

    public void setFieldLimits (String field) {

    }

}