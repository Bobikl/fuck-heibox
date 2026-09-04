package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

/* JADX INFO: compiled from: UMDBCreater.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f104787b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f104788a;

    /* JADX INFO: compiled from: UMDBCreater.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f104789a = new f(f.f104787b, h.b(f.f104787b), e.f104721b, null, 2);

        private a() {
        }
    }

    private f(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, TextUtils.isEmpty(str) ? e.f104721b : str, cursorFactory, i10);
        this.f104788a = null;
        a();
    }

    private f(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(new c(context, str), str2, cursorFactory, i10);
    }

    public static f a(Context context) {
        if (f104787b == null) {
            f104787b = context.getApplicationContext();
        }
        return a.f104789a;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f104788a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f104788a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f104788a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f104788a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        if (!h.a(sQLiteDatabase, e.d.f104762a, "__av")) {
            h.a(sQLiteDatabase, e.d.f104762a, "__sp", "TEXT");
            h.a(sQLiteDatabase, e.d.f104762a, "__pp", "TEXT");
            h.a(sQLiteDatabase, e.d.f104762a, "__av", "TEXT");
            h.a(sQLiteDatabase, e.d.f104762a, "__vc", "TEXT");
        }
        if (!h.a(sQLiteDatabase, e.b.f104736a, "__av")) {
            h.a(sQLiteDatabase, e.b.f104736a, "__av", "TEXT");
            h.a(sQLiteDatabase, e.b.f104736a, "__vc", "TEXT");
        }
        if (h.a(sQLiteDatabase, e.a.f104725a, "__av")) {
            return;
        }
        h.a(sQLiteDatabase, e.a.f104725a, "__av", "TEXT");
        h.a(sQLiteDatabase, e.a.f104725a, "__vc", "TEXT");
    }

    private void f(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, e.d.f104762a);
        a(sQLiteDatabase, e.b.f104736a);
        a(sQLiteDatabase, e.a.f104725a);
        a();
    }

    public void a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!h.a(e.d.f104762a, writableDatabase)) {
                c(writableDatabase);
            }
            if (!h.a(e.c.f104749a, writableDatabase)) {
                d(writableDatabase);
            }
            if (!h.a(e.b.f104736a, writableDatabase)) {
                b(writableDatabase);
            }
            if (h.a(e.a.f104725a, writableDatabase)) {
                return;
            }
            a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                c(sQLiteDatabase);
                d(sQLiteDatabase);
                b(sQLiteDatabase);
                a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            h.a(f104787b);
        } catch (Throwable unused3) {
            if (sQLiteDatabase == null) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i11 <= i10 || i10 != 1) {
            return;
        }
        try {
            try {
                e(sQLiteDatabase);
            } catch (Exception unused) {
                f(sQLiteDatabase);
            }
        } catch (Exception unused2) {
            e(sQLiteDatabase);
        }
    }
}
