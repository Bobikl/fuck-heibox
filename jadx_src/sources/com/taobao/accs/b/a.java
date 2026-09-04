package com.taobao.accs.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.j;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f98163c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lock f98164e = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinkedList<C0947a> f98166b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f98167d;

    /* JADX INFO: renamed from: com.taobao.accs.b.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public class C0947a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f98168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f98169b;

        private C0947a(String str, Object[] objArr) {
            this.f98168a = str;
            this.f98169b = objArr;
        }
    }

    private a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
        this.f98165a = 0;
        this.f98166b = new LinkedList<>();
        this.f98167d = context;
    }

    public static a a(Context context) {
        if (f98163c == null) {
            synchronized (a.class) {
                if (f98163c == null) {
                    f98163c = new a(context, Constants.DB_NAME, null, 3);
                }
            }
        }
        return f98163c;
    }

    private synchronized void a(String str, Object[] objArr, boolean z10) {
        try {
            this.f98166b.add(new C0947a(str, objArr));
            if (this.f98166b.size() > 5 || z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                while (this.f98166b.size() > 0) {
                    try {
                        C0947a c0947aRemoveFirst = this.f98166b.removeFirst();
                        Object[] objArr2 = c0947aRemoveFirst.f98169b;
                        if (objArr2 != null) {
                            writableDatabase.execSQL(c0947aRemoveFirst.f98168a, objArr2);
                        } else {
                            writableDatabase.execSQL(c0947aRemoveFirst.f98168a);
                        }
                        if (c0947aRemoveFirst.f98168a.contains("INSERT")) {
                            int i10 = this.f98165a + 1;
                            this.f98165a = i10;
                            if (i10 > 4000) {
                                ALog.d("DBHelper", "db is full!", new Object[0]);
                                onUpgrade(writableDatabase, 0, 1);
                                this.f98165a = 0;
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        writableDatabase.close();
                        throw th2;
                    }
                }
                writableDatabase.close();
            }
        } catch (Exception e10) {
            ALog.d("DBHelper", e10.toString(), new Object[0]);
        }
    }

    private synchronized boolean a(String str, String str2, boolean z10, String str3) {
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return false;
                }
                cursorQuery = writableDatabase.query(d.F, new String[]{ao.f104522d, Progress.L, "host", "serviceid", "bid", "isbackground", UiKitSpanObj.TYPE_SIZE}, "date=? AND host=? AND bid=? AND isbackground=?", new String[]{str3, str, str2, String.valueOf(z10)}, null, null, null, String.valueOf(100));
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.close();
                    return true;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            } catch (Exception e10) {
                ALog.w("DBHelper", e10.toString(), new Object[0]);
                if (cursorQuery != null) {
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public List<TrafficsMonitor.a> a(boolean z10) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    if (writableDatabase == null) {
                        return null;
                    }
                    Cursor cursorQuery = z10 ? writableDatabase.query(d.F, new String[]{ao.f104522d, Progress.L, "host", "serviceid", "bid", "isbackground", UiKitSpanObj.TYPE_SIZE}, "date=?", new String[]{UtilityImpl.a(System.currentTimeMillis())}, null, null, null, String.valueOf(100)) : writableDatabase.query(d.F, new String[]{ao.f104522d, Progress.L, "host", "serviceid", "bid", "isbackground", UiKitSpanObj.TYPE_SIZE}, null, null, null, null, null, String.valueOf(100));
                    if (cursorQuery == null) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                String string = cursorQuery.getString(1);
                                String string2 = cursorQuery.getString(2);
                                String string3 = cursorQuery.getString(3);
                                String string4 = cursorQuery.getString(4);
                                boolean zBooleanValue = Boolean.valueOf(cursorQuery.getString(5)).booleanValue();
                                long j10 = cursorQuery.getLong(6);
                                if (string4 != null && j10 > 0) {
                                    arrayList.add(new TrafficsMonitor.a(string, string4, string3, zBooleanValue, string2, j10));
                                }
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                    } catch (Exception e10) {
                        cursor = cursorQuery;
                        e = e10;
                        ALog.w("DBHelper", e.toString(), new Object[0]);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    public void a() {
        a("DELETE FROM traffic", null, true);
    }

    public void a(String str, String str2, String str3, boolean z10, long j10, String str4) {
        if (a(str, str3, z10, str4)) {
            a("UPDATE traffic SET size=? WHERE date=? AND host=? AND bid=? AND isbackground=?", new Object[]{Long.valueOf(j10), str4, str, str3, String.valueOf(z10)}, true);
        } else {
            a("INSERT INTO traffic VALUES(null,?,?,?,?,?,?)", new Object[]{str4, str, str2, str3, String.valueOf(z10), Long.valueOf(j10)}, true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        if (j.a(super.getWritableDatabase().getPath(), 102400)) {
            return super.getWritableDatabase();
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            if (f98164e.tryLock()) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traffic(_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, host TEXT,serviceid TEXT, bid TEXT, isbackground TEXT, size TEXT)");
            }
        } finally {
            f98164e.unlock();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < i11) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS service");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ping");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS msg");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ack");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS election");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindApp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindUser");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traffic");
            onCreate(sQLiteDatabase);
        }
    }
}
