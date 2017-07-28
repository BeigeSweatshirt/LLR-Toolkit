package com.example.matt.llr_toolkit;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseAgent extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "userdata.sqlite";
    private static final int DATABASE_VERSION = 1;

    public DatabaseAgent(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
