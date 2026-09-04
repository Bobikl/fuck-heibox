package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: compiled from: CacheDBHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class am extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f104507b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static am f104508c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f104509d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f104510e = "DROP TABLE IF EXISTS stf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f104511f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f104512a;

    private am(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
        this.f104512a = context;
    }

    public static final int a() {
        return 1;
    }

    public static am a(Context context) {
        am amVar;
        synchronized (f104507b) {
            if (f104508c == null) {
                f104508c = new am(context, ao.f104520b, null, 1);
            }
            amVar = f104508c;
        }
        return amVar;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f104510e);
            sQLiteDatabase.execSQL(f104509d);
        } catch (SQLException unused) {
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f104509d);
        } catch (SQLiteDatabaseCorruptException unused) {
            a(sQLiteDatabase);
        } catch (Throwable th2) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th2.getMessage());
        }
    }

    private void d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL(f104511f);
            } catch (Throwable unused) {
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }

    public an a(String str) {
        Cursor cursorA;
        an anVar = null;
        try {
            cursorA = a(str, new String[]{ao.f104527i, ao.f104523e, ao.f104524f, ao.f104525g, ao.f104528j, ao.f104529k}, null, null, null, null, null, "1");
            if (cursorA != null) {
                try {
                    if (cursorA.moveToFirst()) {
                        an anVar2 = new an();
                        try {
                            anVar2.f104513a = cursorA.getString(0);
                            anVar2.f104514b = cursorA.getString(1);
                            String string = cursorA.getString(2);
                            String string2 = cursorA.getString(3);
                            anVar2.f104515c = i.a(this.f104512a).d(string);
                            anVar2.f104516d = i.a(this.f104512a).d(string2);
                            anVar2.f104517e = cursorA.getString(4);
                            anVar2.f104518f = cursorA.getString(5);
                            anVar = anVar2;
                        } catch (Throwable unused) {
                            anVar = anVar2;
                            try {
                                d();
                                return anVar;
                            } finally {
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (cursorA != null) {
            }
        } catch (Throwable unused3) {
            cursorA = null;
        }
        return anVar;
    }

    public void a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, String str2) {
        a(str, "_uuid=?", new String[]{str2});
    }

    public void a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    public boolean b(String str) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (writableDatabase.isOpen()) {
                        cursorQuery = writableDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (writableDatabase == null) {
                        return false;
                    }
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return true;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (writableDatabase == null) {
                return false;
            }
            writableDatabase.close();
            return false;
        } catch (Throwable unused2) {
            writableDatabase = null;
        }
    }

    public boolean c() {
        return !b(ao.f104521c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
