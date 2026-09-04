package com.umeng.socialize.net.dplus.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;

/* JADX INFO: loaded from: classes4.dex */
public class StandardDBHelper extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f106344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106345b;

    public StandardDBHelper(Context context) {
        super(context, DBConfig.DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        this.f106345b = null;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f106345b = "create table if not exists stats (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists stats (Id integer primary key,_json TEXT)");
        } catch (SQLException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f106345b = "create table if not exists s_e (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists s_e (Id integer primary key,_json TEXT)");
        } catch (SQLException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f106345b = "create table if not exists auth (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists auth (Id integer primary key,_json TEXT)");
        } catch (SQLException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f106345b = "create table if not exists userinfo (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists userinfo (Id integer primary key,_json TEXT)");
        } catch (SQLException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f106345b = "create table if not exists dau (Id integer primary key,_json TEXT)";
            sQLiteDatabase.execSQL("create table if not exists dau (Id integer primary key,_json TEXT)");
        } catch (SQLException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        b(sQLiteDatabase);
        c(sQLiteDatabase);
        d(sQLiteDatabase);
        e(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
