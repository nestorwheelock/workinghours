package com.lutchobandeira.workinghours.dao;

import com.lutchobandeira.workinghours.model.TimeEntry;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class TimeEntryDao extends Dao {
	
	public TimeEntryDao(Context context) {
		super(context);
	}
	
	public long insert(TimeEntry timeEntry) {
		ContentValues values = new ContentValues();
		values.put("id", timeEntry.getId());
		values.put("time", timeEntry.getTime().getTime());
		return getWritableDatabase().insert("TimeEntry", null, values);
	}
	
	public long update(TimeEntry timeEntry) {
		String id = Long.toString(timeEntry.getId());
		ContentValues values = new ContentValues();
		return (long) getWritableDatabase()
				.update("TimeEntry", values, "id = ?", new String[]{ id });
	}
	
	public boolean exists(TimeEntry timeEntry) {
		String id = Long.toString(timeEntry.getId());
		Cursor cursor = getWritableDatabase().query("TimeEntry",
				new String[] {"id"}, "id = ?", new String[] {id}, null, null, null);
		boolean exists = cursor.getCount() > 0;
		closeCursor(cursor);
		return exists;
	}

}
