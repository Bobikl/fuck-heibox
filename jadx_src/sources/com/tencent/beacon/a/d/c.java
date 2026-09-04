package com.tencent.beacon.a.d;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: DBOpenHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98834a;

    public c(String str) {
        super(com.tencent.beacon.a.c.c.d().c(), "beacon_db_" + str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f98834a = "";
        com.tencent.beacon.base.util.c.a("[DB]", 0, "DBOpenHelper construc.", new Object[0]);
        this.f98834a = "beacon_db_" + str;
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        try {
            ArrayList<String> arrayList = new ArrayList();
            cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = 'table'", null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(cursorQuery.getString(0));
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.tencent.beacon.a.b.g.e().a("608", "[db] drop all tables error! ", th);
                            com.tencent.beacon.base.util.c.a(th);
                            return false;
                        } finally {
                            if (cursorQuery != null && !cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                for (String str : arrayList) {
                    if (!str.equals("sqlite_sequence") && !str.equals("android_metadata")) {
                        sQLiteDatabase.execSQL("drop table if exists " + str);
                        com.tencent.beacon.base.util.c.a("[DB]", 1, "[db] drop %s", str);
                    }
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        if (a(sQLiteDatabase)) {
            com.tencent.beacon.base.util.c.a("[DB]", 0, "[db] drop all success recreate!", new Object[0]);
            onCreate(sQLiteDatabase);
            return;
        }
        com.tencent.beacon.base.util.c.e("[db] drop all fail try deleted file,may next time will success!", new Object[0]);
        File databasePath = com.tencent.beacon.a.c.c.d().c().getDatabasePath(this.f98834a);
        if (databasePath == null || !databasePath.canWrite()) {
            return;
        }
        databasePath.delete();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setPageSize(4096L);
        sQLiteDatabase.enableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        com.tencent.beacon.base.util.c.a("[DB]", 0, "DBOpenHelper onCreate.", new Object[0]);
        try {
            Iterator<String> it = b.f98833a.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(it.next());
            }
        } catch (SQLException e10) {
            com.tencent.beacon.a.b.g.e().a("601", "error msg: " + e10.getMessage(), e10);
            com.tencent.beacon.base.util.c.b("[DB] crate db table error!", new Object[0]);
            com.tencent.beacon.base.util.c.a(e10);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        com.tencent.beacon.base.util.c.a("[DB]", 0, "[db] Downgrade a db  [%s] from v %d to  v%d , deleted all tables!", this.f98834a, Integer.valueOf(i10), Integer.valueOf(i11));
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        com.tencent.beacon.base.util.c.a("[DB]", 0, "[db] Upgrade a db  [%s] from v %d to v %d , deleted all tables!", this.f98834a, Integer.valueOf(i10), Integer.valueOf(i11));
        b(sQLiteDatabase);
    }
}
