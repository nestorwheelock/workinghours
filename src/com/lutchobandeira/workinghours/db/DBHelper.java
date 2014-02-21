package com.lutchobandeira.workinghours.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	private static final String NAME = "workinghours.db";
	private static final int VERSION = 1;
	
	private static final
		String CREATE_TABLE_TIME_ENTRY = "CREATE TABLE TimeEntry ("
				+ "id INTEGER PRIMARY KEY, "
				+ "time INTEGER )";

	public DBHelper(Context context) {
		super(context, NAME, null, VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLE_TIME_ENTRY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}

}
