package com.ptit.rollcall.model.Entity.model.dao;

import android.content.Context;

import com.ptit.rollcall.common.CONST;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHepper extends SQLiteAssetHelper {
    public DatabaseOpenHepper(Context context){
        super(context, CONST.DATA_NAME,null,1);
    }
}
