package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.k1;
import com.google.android.exoplayer2.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CacheFileMetadataIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50987c = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50988d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50989e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f50990f = "length";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50992h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f50993i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f50994j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f50995k = "name = ?";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f50997m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o8.b f50998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50999b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f50991g = "last_touch_timestamp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f50996l = {"name", "length", f50991g};

    public d(o8.b bVar) {
        this.f50998a = bVar;
    }

    @k1
    public static void a(o8.b bVar, long j10) throws DatabaseIOException {
        String hexString = Long.toHexString(j10);
        try {
            String strE = e(hexString);
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                o8.g.c(writableDatabase, 2, hexString);
                b(writableDatabase, strE);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase, String str) {
        String strValueOf = String.valueOf(str);
        sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
    }

    private Cursor d() {
        com.google.android.exoplayer2.util.a.g(this.f50999b);
        return this.f50998a.getReadableDatabase().query(this.f50999b, f50996l, null, null, null, null, null);
    }

    private static String e(String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? f50987c.concat(strValueOf) : new String(f50987c);
    }

    @k1
    public Map<String, c> c() throws DatabaseIOException {
        try {
            Cursor cursorD = d();
            try {
                HashMap map = new HashMap(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    map.put((String) com.google.android.exoplayer2.util.a.g(cursorD.getString(0)), new c(cursorD.getLong(1), cursorD.getLong(2)));
                }
                cursorD.close();
                return map;
            } catch (Throwable th2) {
                if (cursorD != null) {
                    try {
                        cursorD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @k1
    public void f(long j10) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j10);
            this.f50999b = e(hexString);
            if (o8.g.b(this.f50998a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f50998a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o8.g.d(writableDatabase, 2, hexString, 1);
                    b(writableDatabase, this.f50999b);
                    String str = this.f50999b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 108);
                    sb2.append("CREATE TABLE ");
                    sb2.append(str);
                    sb2.append(" ");
                    sb2.append(f50997m);
                    writableDatabase.execSQL(sb2.toString());
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @k1
    public void g(String str) throws DatabaseIOException {
        com.google.android.exoplayer2.util.a.g(this.f50999b);
        try {
            this.f50998a.getWritableDatabase().delete(this.f50999b, f50995k, new String[]{str});
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @k1
    public void h(Set<String> set) throws DatabaseIOException {
        com.google.android.exoplayer2.util.a.g(this.f50999b);
        try {
            SQLiteDatabase writableDatabase = this.f50998a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f50999b, f50995k, new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @k1
    public void i(String str, long j10, long j11) throws DatabaseIOException {
        com.google.android.exoplayer2.util.a.g(this.f50999b);
        try {
            SQLiteDatabase writableDatabase = this.f50998a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put(f50991g, Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f50999b, null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
