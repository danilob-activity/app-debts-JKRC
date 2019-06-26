package com.example.danilo.appdebts.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aluno on 26/06/19.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String mdbName = "debts.db";
    private static final int mdbVersion = 1;

    public DatabaseHelper(Context context) {
        super(context, mdbName, null, mdbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

            sqLiteDatabase.execSQL(ScriptDLL.createTableCategory());
            sqLiteDatabase.execSQL(ScriptDLL.createTableDebts());


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
