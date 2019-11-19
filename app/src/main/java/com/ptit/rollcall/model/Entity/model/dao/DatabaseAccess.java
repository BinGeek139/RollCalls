package com.ptit.rollcall.model.Entity.model.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.ptit.rollcall.model.dao.DatabaseOpenHepper;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private  SQLiteDatabase database;
    private  static DatabaseAccess instance;
    private Cursor cursor;
    public DatabaseAccess(Context context){
        openHelper= new DatabaseOpenHepper(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        if(instance==null){
            instance= new DatabaseAccess(context);
        }
        return instance;
    }
    public void open(){
        Log.e("tag","ok2");
        database=openHelper.getWritableDatabase();
        Log.e("tag","ok3");
    }
    public void close(){
        if(database != null){
            database.close();
        }
    }
    public String getMember(){

        String s="";

        Cursor cursor=database.rawQuery("select lastName from Member where id=1;",null);
        while (cursor.moveToNext()){
            s+=cursor.getString(0);

        }
        return s;
    }
//    public List<Classs> getClassAll(){
//        List<Classs> classses=new ArrayList<Classs>();
//        String query=String.format(CONST.QUERY_SELECT_ALL,"Class");
//        cursor=database.rawQuery(query,null);
//        while (cursor.moveToNext()){
//            Classs classs=new Classs(cursor.getInt(0),cursor.getString(1), Conver.StringToCalender(cursor.getString(2)),Conver.StringToCalender(3));
//            classses.add(classs);
//        }
//        return  classses;
//    }
//    public Member getMember(int id){
//        String query=String.format(CONST.QUERY_SELECT_ID,"Member",id);
//        cursor=database.rawQuery()
//    }
}
