package com.igexin.push.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.igexin.push.core.b.i;

/* JADX INFO: loaded from: classes.dex */
public class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f63325a;

    public b(Context context) {
        super(context, "pushsdk.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f63325a = null;
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

    private String b(String str, String str2) {
        return "delete from " + str + " where " + str2;
    }

    public int a(String str, String str2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63325a = writableDatabase;
        writableDatabase.beginTransaction();
        int i10 = 0;
        try {
            try {
                int iDelete = this.f63325a.delete(str, str2, null);
                try {
                    com.igexin.a.a.c.b.a("DBHelper|del " + iDelete + " msg", new Object[0]);
                    this.f63325a.setTransactionSuccessful();
                    return iDelete;
                } catch (Exception unused) {
                    i10 = iDelete;
                    return i10;
                }
            } catch (Exception unused2) {
            }
        } finally {
            this.f63325a.endTransaction();
        }
    }

    public Cursor a(String str, String[] strArr, String str2) {
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f63325a = readableDatabase;
            return readableDatabase.query(str, strArr, str2, null, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Cursor a(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        Cursor cursorQuery;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.f63325a = readableDatabase;
        readableDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            if (strArr == null) {
                cursorQuery = this.f63325a.query(str, strArr3, null, null, null, null, str2);
            } else if (strArr.length != 1) {
                cursorQuery = this.f63325a.query(str, strArr3, a(strArr, strArr2, strArr.length), null, null, null, str2);
            } else if (strArr2.length == 1) {
                cursorQuery = this.f63325a.query(str, strArr3, strArr[0] + "= ?", strArr2, null, null, str2);
            } else {
                cursorQuery = this.f63325a.query(str, strArr3, a(strArr, strArr2, strArr2.length), null, null, null, str2);
            }
            cursor = cursorQuery;
            this.f63325a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63325a.endTransaction();
        }
        return cursor;
    }

    public void a(String str, ContentValues contentValues, String[] strArr, String[] strArr2) {
        SQLiteDatabase sQLiteDatabase;
        String strA;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63325a = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            if (strArr == null) {
                this.f63325a.update(str, contentValues, null, null);
            } else {
                if (strArr.length != 1) {
                    sQLiteDatabase = this.f63325a;
                    strA = a(strArr, strArr2, strArr.length);
                } else if (strArr2.length == 1) {
                    sQLiteDatabase = this.f63325a;
                    strA = strArr[0] + "='" + strArr2[0] + "'";
                } else {
                    sQLiteDatabase = this.f63325a;
                    strA = a(strArr, strArr2, strArr2.length);
                }
                sQLiteDatabase.update(str, contentValues, strA, null);
            }
            this.f63325a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63325a.endTransaction();
        }
    }

    public void a(String str, String[] strArr, String[] strArr2) {
        SQLiteDatabase sQLiteDatabase;
        String strB;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63325a = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            if (strArr == null) {
                this.f63325a.delete(str, null, null);
            } else {
                if (strArr.length != 1) {
                    sQLiteDatabase = this.f63325a;
                    strB = b(str, a(strArr, strArr2, strArr.length));
                } else if (strArr2.length == 1) {
                    com.igexin.a.a.c.b.a("DBHelper|del " + str + " cnt = " + this.f63325a.delete(str, strArr[0] + " = ?", strArr2), new Object[0]);
                } else {
                    sQLiteDatabase = this.f63325a;
                    strB = b(str, a(strArr, strArr2, strArr2.length));
                }
                sQLiteDatabase.execSQL(strB);
            }
            this.f63325a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63325a.endTransaction();
        }
    }

    public boolean a(String str, ContentValues contentValues) {
        boolean z10;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63325a = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            this.f63325a.insert(str, null, contentValues);
            this.f63325a.setTransactionSuccessful();
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        } finally {
            this.f63325a.endTransaction();
        }
        return z10;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("create table if not exists config (id integer primary key,value text)");
            sQLiteDatabase.execSQL("create table if not exists runtime (id integer primary key,value text)");
            sQLiteDatabase.execSQL("create table if not exists message (id integer primary key autoincrement,messageid text,taskid text,appid text,info text,msgextra blob,key text,status integer,createtime integer)");
            sQLiteDatabase.execSQL("create table if not exists ral (id integer primary key,data text,type integer,time integer)");
            sQLiteDatabase.execSQL("create table if not exists ca (pkgname text primary key,signature text,permissions text, accesstoken blob, expire integer)");
            sQLiteDatabase.execSQL("create table if not exists bi(id integer primary key autoincrement, start_service_count integer, login_count integer, loginerror_nonetwork_count integer, loginerror_timeout_count integer, loginerror_connecterror_count integer, loginerror_other_count integer, online_time long, network_time long, running_time long, create_time text, type integer)");
            sQLiteDatabase.execSQL("create table if not exists st(id integer primary key autoincrement,type integer,value blob,time integer)");
            sQLiteDatabase.execSQL("create table if not exists at (id integer primary key autoincrement,from_page text,page text,enterTime text,exitTime text,is_exist text,create_time long)");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
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
        i.a().d(sQLiteDatabase);
        try {
            sQLiteDatabase.execSQL("drop table if exists config");
        } catch (Exception unused) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists runtime");
        } catch (Exception unused2) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists message");
        } catch (Exception unused3) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists ral");
        } catch (Exception unused4) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists ca");
        } catch (Exception unused5) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists bi");
        } catch (Exception unused6) {
        }
        try {
            sQLiteDatabase.execSQL("drop table if exists st");
        } catch (Exception unused7) {
        }
        onCreate(sQLiteDatabase);
    }
}
