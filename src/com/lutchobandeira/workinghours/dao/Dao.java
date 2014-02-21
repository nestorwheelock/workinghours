package com.lutchobandeira.workinghours.dao;

import com.lutchobandeira.workinghours.db.DBHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class Dao {

	private SQLiteOpenHelper dbHelper;
	
	public Dao(Context context) {
		this.dbHelper = new DBHelper(context);
	}
	
	public void closeCursor(Cursor cursor) {
		if (!cursor.isClosed()) {
			cursor.close();
		}
	}
	
	public SQLiteDatabase getWritableDatabase() {
		return dbHelper.getWritableDatabase();
	}
	
	public SQLiteDatabase getReadableDatabase() {
		return dbHelper.getReadableDatabase();
	}
	
	public void closeDatabase() {
		if (dbHelper.getWritableDatabase().isOpen()) {
			dbHelper.close();
		}
	}
	
}
