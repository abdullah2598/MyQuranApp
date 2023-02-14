package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper
{
    private SQLiteDatabase mDatabase;
    public String db_name="data.db";
    String dbLoc="/data/data/com.example.myapplication/databases/";
    private final Context myContext;

    public DBHelper(Context context )
    {
        super(context, "data.db", null, 2);
        this.myContext=context;

    }

    public void openDatabase()
    {
        String dbPath = myContext.getDatabasePath(db_name).getPath();
        if(mDatabase != null && mDatabase.isOpen()) {
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}


    // get all the suarh name in list<string>

    public ArrayList<AyatSurahcla> getAllSurah(){
        openDatabase();
        ArrayList<AyatSurahcla> list=new ArrayList<>();
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cursor=mydb.rawQuery("select DISTINCT surah_name  from QuranMetaData_Sheet1",null);
        if(cursor.moveToFirst())
        {
            while(cursor.moveToNext())
            {
               AyatSurahcla ayatSurahcla=new AyatSurahcla();
               ayatSurahcla.setValue(cursor.getString(0));
                list.add(ayatSurahcla);
            }
        }
        cursor.close();
        mydb.close();
        return list;
    }

    public ArrayList<String> getAllParah(){
        openDatabase();
        ArrayList<String> list=new ArrayList<>();
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cursor=mydb.rawQuery("select DISTINCT juz from QuranMetaData_Sheet1",null);
        if(cursor.moveToFirst())
        {
            while(cursor.moveToNext())
            {
                // Toast.makeText(myContext, cursor.getString(0), Toast.LENGTH_SHORT).show();
                list.add(cursor.getString(0));
            }
        }
        cursor.close();
        mydb.close();
        return list;
    }


    public ArrayList<QuranCla> getAllStudent()
    {
        openDatabase();
        ArrayList<QuranCla> list=new ArrayList<>();
        SQLiteDatabase mydb=this.getWritableDatabase();
        Cursor cursor=mydb.rawQuery("select *  from QuranMetaData_Sheet1",null);
        if(cursor.moveToFirst())
        {
            while(cursor.moveToNext())
            {
                QuranCla  q=new QuranCla();
                q.setNumber(Integer.parseInt(cursor.getString(0)));
                q.setAyat(cursor.getString(1));
                list.add(q);
            }
        }
        cursor.close();
        mydb.close();
        return list;
    }

//    public ArrayList<StudentRecord> getAllData()
//    {
//        ArrayList<StudentRecord> list=new ArrayList<>();
//        SQLiteDatabase mydb=this.getWritableDatabase();
//        Cursor cursor=mydb.rawQuery("select * from studentrecord",null);
//        if(cursor.moveToFirst())
//        {
//            while(cursor.moveToNext())
//            {
//                StudentRecord q=new StudentRecord();
//                q.setName(cursor.getString(1));
//                q.setParano(cursor.getString(2));
//                q.setAyats(cursor.getString(3));
//                q.setAyate(cursor.getString(4));
//
//                q.setLastSabaq(cursor.getString(5));
//                q.setManzil(cursor.getString(7));
//                q.setDate(cursor.getString(6));
//
//
//                list.add(q);
//            }
//        }
//        cursor.close();
//        mydb.close();
//        return list;
//    }


}