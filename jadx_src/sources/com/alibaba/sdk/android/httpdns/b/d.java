package com.alibaba.sdk.android.httpdns.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f37903a = new Object();

    d(Context context) {
        super(context, "aliclound_httpdns.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    private long a(SQLiteDatabase sQLiteDatabase, g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(gVar.f37909i));
        contentValues.put("ip", gVar.f37911o);
        contentValues.put(RemoteMessageConst.TTL, gVar.f37912p);
        try {
            return sQLiteDatabase.insert("ip", null, contentValues);
        } catch (Exception unused) {
            return 0L;
        }
    }

    private List<g> a(long j10) throws Throwable {
        SQLiteDatabase writableDatabase;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            try {
                cursorQuery = writableDatabase.query("ip", null, "host_id=?", new String[]{String.valueOf(j10)}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    do {
                        g gVar = new g();
                        gVar.f37910id = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                        gVar.f37909i = cursorQuery.getInt(cursorQuery.getColumnIndex("host_id"));
                        gVar.f37911o = cursorQuery.getString(cursorQuery.getColumnIndex("ip"));
                        gVar.f37912p = cursorQuery.getString(cursorQuery.getColumnIndex(RemoteMessageConst.TTL));
                        arrayList.add(gVar);
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (writableDatabase != null) {
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            writableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
        writableDatabase.close();
        return arrayList;
    }

    private List<g> a(e eVar) {
        return a(eVar.f37906id);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private void m11a(long j10) {
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = getWritableDatabase();
            writableDatabase.delete("host", "id = ?", new String[]{String.valueOf(j10)});
        } catch (Exception unused) {
        } finally {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }

    private void a(g gVar) {
        m12b(gVar.f37910id);
    }

    private long b(SQLiteDatabase sQLiteDatabase, g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host_id", Long.valueOf(gVar.f37909i));
        contentValues.put("ip", gVar.f37911o);
        contentValues.put(RemoteMessageConst.TTL, gVar.f37912p);
        try {
            return sQLiteDatabase.insert("ipv6", null, contentValues);
        } catch (Exception unused) {
            return 0L;
        }
    }

    private List<g> b(long j10) throws Throwable {
        SQLiteDatabase writableDatabase;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            try {
                cursorQuery = writableDatabase.query("ipv6", null, "host_id=?", new String[]{String.valueOf(j10)}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    do {
                        g gVar = new g();
                        gVar.f37910id = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                        gVar.f37909i = cursorQuery.getInt(cursorQuery.getColumnIndex("host_id"));
                        gVar.f37911o = cursorQuery.getString(cursorQuery.getColumnIndex("ip"));
                        gVar.f37912p = cursorQuery.getString(cursorQuery.getColumnIndex(RemoteMessageConst.TTL));
                        arrayList.add(gVar);
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (writableDatabase != null) {
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            writableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
        writableDatabase.close();
        return arrayList;
    }

    private List<g> b(e eVar) {
        return b(eVar.f37906id);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private void m12b(long j10) {
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = getWritableDatabase();
            writableDatabase.delete("ip", "id = ?", new String[]{String.valueOf(j10)});
        } catch (Exception unused) {
        } finally {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }

    private void b(g gVar) {
        c(gVar.f37910id);
    }

    private void c(long j10) {
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = getWritableDatabase();
            writableDatabase.delete("ipv6", "id = ?", new String[]{String.valueOf(j10)});
        } catch (Exception unused) {
        } finally {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }

    private void c(e eVar) {
        m11a(eVar.f37906id);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    long m13a(e eVar) {
        synchronized (f37903a) {
            b(eVar.f37907m, eVar.host);
            ContentValues contentValues = new ContentValues();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    contentValues.put("host", eVar.host);
                    contentValues.put("sp", eVar.f37907m);
                    contentValues.put("time", c.c(eVar.f37908n));
                    contentValues.put("extra", eVar.f37904a);
                    contentValues.put("cache_key", eVar.f37905b);
                    long jInsert = writableDatabase.insert("host", null, contentValues);
                    eVar.f37906id = jInsert;
                    ArrayList<g> arrayList = eVar.f20a;
                    if (arrayList != null) {
                        for (g gVar : arrayList) {
                            gVar.f37909i = jInsert;
                            gVar.f37910id = a(writableDatabase, gVar);
                        }
                    }
                    ArrayList<g> arrayList2 = eVar.f21b;
                    if (arrayList2 != null) {
                        for (g gVar2 : arrayList2) {
                            gVar2.f37909i = jInsert;
                            gVar2.f37910id = b(writableDatabase, gVar2);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                    return jInsert;
                } catch (Exception unused) {
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                        sQLiteDatabase.close();
                    }
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    e a(String str, String str2) {
        SQLiteDatabase readableDatabase;
        e eVar;
        e eVar2;
        synchronized (f37903a) {
            Cursor cursor = null;
            eVar2 = null;
            eVar2 = null;
            cursor = null;
            cursor = null;
            Cursor cursor2 = null;
            try {
                try {
                    readableDatabase = getReadableDatabase();
                    try {
                        Cursor cursorQuery = readableDatabase.query("host", null, "sp=? AND host=?", new String[]{str, str2}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                try {
                                    if (cursorQuery.getCount() > 0) {
                                        cursorQuery.moveToFirst();
                                        eVar = new e();
                                        try {
                                            eVar.f37906id = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                                            eVar.host = cursorQuery.getString(cursorQuery.getColumnIndex("host"));
                                            eVar.f37907m = cursorQuery.getString(cursorQuery.getColumnIndex("sp"));
                                            eVar.f37908n = c.d(cursorQuery.getString(cursorQuery.getColumnIndex("time")));
                                            eVar.f20a = (ArrayList) a(eVar);
                                            eVar.f21b = (ArrayList) b(eVar);
                                            eVar.f37904a = cursorQuery.getString(cursorQuery.getColumnIndex("extra"));
                                            eVar.f37905b = cursorQuery.getString(cursorQuery.getColumnIndex("cache_key"));
                                            eVar2 = eVar;
                                        } catch (Exception unused) {
                                            cursor2 = cursorQuery;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (readableDatabase != null) {
                                                readableDatabase.close();
                                            }
                                            eVar2 = eVar;
                                        }
                                    }
                                } catch (Exception unused2) {
                                    eVar = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (readableDatabase != null) {
                                    readableDatabase.close();
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        readableDatabase.close();
                    } catch (Exception unused3) {
                        eVar = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Exception unused4) {
                eVar = null;
                readableDatabase = null;
            } catch (Throwable th5) {
                th = th5;
                readableDatabase = null;
            }
        }
        return eVar2;
    }

    List<e> b() {
        ArrayList arrayList;
        SQLiteDatabase readableDatabase;
        synchronized (f37903a) {
            arrayList = new ArrayList();
            Cursor cursorQuery = null;
            try {
                readableDatabase = getReadableDatabase();
                try {
                    cursorQuery = readableDatabase.query("host", null, null, null, null, null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        cursorQuery.moveToFirst();
                        do {
                            e eVar = new e();
                            eVar.f37906id = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                            eVar.host = cursorQuery.getString(cursorQuery.getColumnIndex("host"));
                            eVar.f37907m = cursorQuery.getString(cursorQuery.getColumnIndex("sp"));
                            eVar.f37908n = c.d(cursorQuery.getString(cursorQuery.getColumnIndex("time")));
                            eVar.f20a = (ArrayList) a(eVar);
                            eVar.f21b = (ArrayList) b(eVar);
                            eVar.f37904a = cursorQuery.getString(cursorQuery.getColumnIndex("extra"));
                            eVar.f37905b = cursorQuery.getString(cursorQuery.getColumnIndex("cache_key"));
                            arrayList.add(eVar);
                        } while (cursorQuery.moveToNext());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (readableDatabase != null) {
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (readableDatabase != null) {
                        readableDatabase.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                readableDatabase = null;
            } catch (Throwable th3) {
                th = th3;
                readableDatabase = null;
            }
            readableDatabase.close();
        }
        return arrayList;
    }

    void b(String str, String str2) {
        synchronized (f37903a) {
            e eVarA = a(str, str2);
            if (eVarA != null) {
                c(eVarA);
                ArrayList<g> arrayList = eVarA.f20a;
                if (arrayList != null) {
                    Iterator<g> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                }
                ArrayList<g> arrayList2 = eVarA.f21b;
                if (arrayList2 != null) {
                    Iterator<g> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        b(it2.next());
                    }
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE host (id INTEGER PRIMARY KEY,host TEXT,sp TEXT,time TEXT,extra TEXT,cache_key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ip (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE ipv6 (id INTEGER PRIMARY KEY,host_id INTEGER,ip TEXT,ttl TEXT);");
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS host;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ip;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ipv6;");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                onCreate(sQLiteDatabase);
            } catch (Exception unused) {
            }
        }
    }
}
