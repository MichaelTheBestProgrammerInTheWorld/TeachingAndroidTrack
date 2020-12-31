package com.michaelmagdy.sqlitedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class ToDoListDBAdapter {

    public static final String DB_NAME = "todolist.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_TODO = "table_todo";
    public static final String COLUMN_TODO_ID = "todo_id";
    public static final String COLUMN_TODO = "todo";

    private static String CREATE_TABLE_TODO="CREATE TABLE "+TABLE_TODO+"("+COLUMN_TODO_ID+" INTEGER PRIMARY KEY, "+COLUMN_TODO+" TEXT NOT NULL)";

    private Context context;
    private SQLiteDatabase sqLiteDatabase;
    private static ToDoListDBAdapter toDoListDBAdapter;

    private ToDoListDBAdapter(Context context){
        this.context = context;
        sqLiteDatabase = new ToDoListDBHelper(this.context, DB_NAME, DB_VERSION).getWritableDatabase();
    }

    public static ToDoListDBAdapter getToDoListDBAdapterInstance(Context context){
        if (toDoListDBAdapter == null){
            toDoListDBAdapter = new ToDoListDBAdapter(context);
        }
        return toDoListDBAdapter;
    }

    public boolean insertNewDataInsideTable(String todo){

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TODO, todo);

        return sqLiteDatabase.insert(TABLE_TODO, null, contentValues) > 0;
    }

    public boolean delete(int toDoId){

        return sqLiteDatabase.delete(TABLE_TODO, COLUMN_TODO_ID + "=" + toDoId, null) > 0;
    }

    public boolean update(int toDoId, String updatedToDo){

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TODO, updatedToDo);

        return sqLiteDatabase.update(TABLE_TODO, contentValues, COLUMN_TODO_ID + "=" + toDoId, null) > 0;
    }

    public List<Todo> getAllTodos(){

        List<Todo> todoList = new ArrayList<>();

        Cursor cursor = sqLiteDatabase.query(TABLE_TODO, new String[] {COLUMN_TODO_ID, COLUMN_TODO}, null, null, null,null, null );

        if (cursor != null && cursor.getCount() > 0){

            while (cursor.moveToNext()){
                    Todo todo = new Todo(cursor.getLong(0), cursor.getString(1));
                    todoList.add(todo);
            }

        }

        cursor.close();
        return todoList;
    }

    private static class ToDoListDBHelper extends SQLiteOpenHelper {


        ToDoListDBHelper(Context context, String databaseName, int dbVersion){
            super(context, databaseName, null, dbVersion);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {

            sqLiteDatabase.execSQL(CREATE_TABLE_TODO);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
