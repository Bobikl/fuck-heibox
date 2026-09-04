package com.igexin.push.extension.distribution.basic.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SQLiteDatabase f63979a;

    public a(Context context) {
        super(context, "pushext.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f63979a = null;
    }

    private String a(String str, String str2) {
        return "delete from " + str + " where " + str2;
    }

    private String a(String[] strArr, String[] strArr2, int i10) {
        StringBuilder sb2 = new StringBuilder(" ");
        if (strArr.length == 1) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(strArr[0]);
                sb2.append(" = '");
                sb2.append(strArr2[i11]);
                sb2.append("'");
                if (i11 < i10 - 1) {
                    sb2.append(" or ");
                }
            }
        } else {
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(strArr[i12]);
                sb2.append(" = '");
                sb2.append(strArr2[i12]);
                sb2.append("'");
                if (i12 < i10 - 1) {
                    sb2.append(" and ");
                }
            }
        }
        return sb2.toString();
    }

    public Cursor a(String str, String[] strArr) {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.f63979a = readableDatabase;
        try {
            return readableDatabase.rawQuery(str, strArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public Cursor a(String str, String[] strArr, String str2) {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.f63979a = readableDatabase;
        return readableDatabase.query(str, strArr, str2, null, null, null, null);
    }

    public Cursor a(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        Cursor cursorQuery;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.f63979a = readableDatabase;
        readableDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            if (strArr == null) {
                cursorQuery = this.f63979a.query(str, strArr3, null, null, null, null, str2);
            } else if (strArr.length != 1) {
                cursorQuery = this.f63979a.query(str, strArr3, a(strArr, strArr2, strArr.length), null, null, null, str2);
            } else if (strArr2.length == 1) {
                cursorQuery = this.f63979a.query(str, strArr3, strArr[0] + " = ? ", strArr2, null, null, str2);
            } else {
                cursorQuery = this.f63979a.query(str, strArr3, a(strArr, strArr2, strArr2.length), null, null, null, str2);
            }
            cursor = cursorQuery;
            this.f63979a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63979a.endTransaction();
        }
        return cursor;
    }

    public void a(String str, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63979a = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            this.f63979a.insert(str, null, contentValues);
            this.f63979a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63979a.endTransaction();
        }
    }

    public void a(String str, String str2, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63979a = writableDatabase;
        try {
            writableDatabase.replace(str, str2, contentValues);
        } catch (Exception unused) {
        }
    }

    public void a(String str, String[] strArr, String[] strArr2) {
        SQLiteDatabase sQLiteDatabase;
        String strA;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63979a = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            if (strArr == null) {
                this.f63979a.delete(str, null, null);
            } else {
                if (strArr.length != 1) {
                    sQLiteDatabase = this.f63979a;
                    strA = a(str, a(strArr, strArr2, strArr.length));
                } else if (strArr2.length == 1) {
                    this.f63979a.delete(str, strArr[0] + " = ?", strArr2);
                } else {
                    sQLiteDatabase = this.f63979a;
                    strA = a(str, a(strArr, strArr2, strArr2.length));
                }
                sQLiteDatabase.execSQL(strA);
            }
            this.f63979a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63979a.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        try {
            this.f63979a.close();
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("create table if not exists image(id integer primary key autoincrement, imageurl text, imagesrc text, taskid text, createtime bigint)");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("create table if not exists message(id integer primary key autoincrement,messageid text,taskid text,appid text,info text,msgextra blob,key text,createtime integer)");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused2) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("create table if not exists sc(id integer primary key autoincrement, title text, value text)");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused3) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("create table if not exists extconfig (key integer primary key, value text)");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused4) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i11, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            sQLiteDatabase.execSQL("drop table if exists image");
        } catch (Exception unused) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists message");
        } catch (Exception unused2) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists sc");
        } catch (Exception unused3) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists extconfig");
        } catch (Exception unused4) {
        }
        onCreate(sQLiteDatabase);
    }
}
