package com.tencent.beacon.event.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.n0;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.d.c;
import com.tencent.beacon.a.d.d;
import com.tencent.beacon.event.EventBean;
import com.umeng.analytics.pro.ao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: EventDAO.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements d<EventBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f99045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f99046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f99047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f99048d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f99049e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.beacon.event.c.b f99050f = com.tencent.beacon.event.c.b.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SQLiteDatabase f99051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SQLiteDatabase f99052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f99053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f99054j;

    private a() {
        c cVar = new c(com.tencent.beacon.a.c.b.c(com.tencent.beacon.a.c.c.d().c()));
        this.f99051g = cVar.getWritableDatabase();
        SQLiteDatabase readableDatabase = cVar.getReadableDatabase();
        this.f99052h = readableDatabase;
        this.f99046b = readableDatabase.compileStatement("INSERT INTO t_r_e (_appKey,_time,_length,_data )VALUES(?,?,?,?)");
        this.f99047c = this.f99052h.compileStatement("INSERT INTO t_n_e (_appKey,_time,_length,_data )VALUES(?,?,?,?)");
        this.f99053i = a("t_r_e");
        long jA = a("t_n_e");
        this.f99054j = jA;
        if (this.f99053i == 0 && jA == 0) {
            return;
        }
        String str = " realtime: " + this.f99053i + ", normal: " + this.f99054j;
        com.tencent.beacon.base.util.c.a("[EventDAO]", str, new Object[0]);
        g.e().a("607", "[EventDAO]" + str);
    }

    public static a a() {
        if (f99045a == null) {
            synchronized (a.class) {
                if (f99045a == null) {
                    f99045a = new a();
                }
            }
        }
        return f99045a;
    }

    private List<EventBean> a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            b bVar = new b();
            bVar.f99055a = cursor.getLong(0);
            bVar.f99058d = cursor.getString(1);
            bVar.f99056b = cursor.getInt(2);
            bVar.f99057c = cursor.getLong(3);
            bVar.f99059e = cursor.getBlob(4);
            arrayList.add(this.f99050f.c().a(bVar));
        }
        if (!cursor.isClosed()) {
            cursor.close();
        }
        return arrayList;
    }

    private void a(boolean z10, boolean z11, long j10) {
        if (z10) {
            synchronized (this.f99048d) {
                try {
                    if (z11) {
                        this.f99053i += j10;
                    } else {
                        this.f99053i -= j10;
                    }
                    com.tencent.beacon.base.util.c.a("[EventDAO]", "current db realtime:%s", Long.valueOf(this.f99053i));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f99049e) {
            try {
                if (z11) {
                    this.f99054j += j10;
                } else {
                    this.f99054j -= j10;
                }
                com.tencent.beacon.base.util.c.a("[EventDAO]", "current db normal:%s", Long.valueOf(this.f99054j));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public long a(String str) {
        long j10;
        Cursor cursorRawQuery = null;
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT count(?) FROM ");
                sb2.append(str);
                String string = sb2.toString();
                cursorRawQuery = this.f99052h.rawQuery(string, new String[]{ao.f104522d});
                cursorRawQuery.moveToFirst();
                j10 = cursorRawQuery.getLong(0);
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            } catch (Exception e10) {
                g gVarE = g.e();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("type: ");
                sb3.append(str);
                sb3.append(" query err: ");
                sb3.append(e10.getMessage());
                gVarE.a("605", sb3.toString(), e10);
                com.tencent.beacon.base.util.c.a(e10);
                if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
                j10 = -1;
            }
            return j10;
        } catch (Throwable th2) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public List<EventBean> a(@n0 String str, String str2, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<EventBean> listA = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" SELECT * FROM ");
            sb2.append(str);
            sb2.append(" WHERE ");
            sb2.append(ao.f104522d);
            sb2.append(" NOT IN (");
            sb2.append(str2);
            sb2.append(") ORDER BY ");
            sb2.append("_time");
            sb2.append(" DESC LIMIT ");
            sb2.append(i10);
            listA = a(this.f99052h.rawQuery(sb2.toString(), null));
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.a(e10);
            g.e().a("605", "type: " + str + " query err: " + e10.getMessage(), e10);
        }
        com.tencent.beacon.base.util.c.a("[EventDAO]", "query tableName: %s, args: %s", str, str2);
        com.tencent.beacon.base.util.c.a("[EventDAO]", "query cost time: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return listA;
    }

    public boolean a(int i10) {
        boolean z10;
        if (i10 == 1) {
            synchronized (this.f99048d) {
                z10 = this.f99053i >= ((long) com.tencent.beacon.e.b.a().b());
            }
            return z10;
        }
        synchronized (this.f99049e) {
            z10 = this.f99054j >= ((long) com.tencent.beacon.e.b.a().b());
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public boolean a(EventBean eventBean) {
        boolean z10;
        if (eventBean == null) {
            return false;
        }
        b bVarA = this.f99050f.b().a(eventBean);
        boolean zA = com.tencent.beacon.event.c.d.a(eventBean.getEventType());
        try {
            try {
                this.f99051g.beginTransactionNonExclusive();
                this.f99046b.clearBindings();
                if (zA) {
                    this.f99046b.bindString(1, bVarA.f99058d);
                    this.f99046b.bindLong(2, bVarA.f99056b);
                    this.f99046b.bindLong(3, bVarA.f99057c);
                    this.f99046b.bindBlob(4, bVarA.f99059e);
                } else {
                    this.f99047c.bindString(1, bVarA.f99058d);
                    this.f99047c.bindLong(2, bVarA.f99056b);
                    this.f99047c.bindLong(3, bVarA.f99057c);
                    this.f99047c.bindBlob(4, bVarA.f99059e);
                }
                if (zA) {
                    if (this.f99046b.executeInsert() >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (this.f99047c.executeInsert() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    this.f99051g.setTransactionSuccessful();
                    this.f99051g.endTransaction();
                } catch (Exception e10) {
                    g.e().a("603", "type: " + zA + " insert err: " + e10.getMessage(), e10);
                    com.tencent.beacon.base.util.c.a(e10);
                }
            } catch (Exception e11) {
                g.e().a("603", "type: " + zA + " insert err: " + e11.getMessage(), e11);
                com.tencent.beacon.base.util.c.a(e11);
                try {
                    this.f99051g.setTransactionSuccessful();
                    this.f99051g.endTransaction();
                } catch (Exception e12) {
                    g.e().a("603", "type: " + zA + " insert err: " + e12.getMessage(), e12);
                    com.tencent.beacon.base.util.c.a(e12);
                }
                z10 = false;
            }
            if (z10) {
                a(zA, true, 1L);
            } else {
                g.e().a("603", "type: " + zA + " insert result: false");
            }
            return z10;
        } catch (Throwable th2) {
            try {
                this.f99051g.setTransactionSuccessful();
                this.f99051g.endTransaction();
            } catch (Exception e13) {
                g.e().a("603", "type: " + zA + " insert err: " + e13.getMessage(), e13);
                com.tencent.beacon.base.util.c.a(e13);
            }
            throw th2;
        }
    }

    public boolean a(@n0 String str, String str2) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("_id IN (");
            sb2.append(str2);
            sb2.append(")");
            int iDelete = this.f99051g.delete(str, sb2.toString(), null);
            a(str.equals("t_r_e"), false, iDelete);
            return iDelete >= 0;
        } catch (Exception e10) {
            g.e().a("606", "type: " + str + " delete err: " + e10.getMessage() + " target: " + str2, e10);
            com.tencent.beacon.base.util.c.a(e10);
            return false;
        }
    }

    public Map<String, Integer> b(String str) {
        HashMap map = new HashMap();
        Cursor cursorRawQuery = null;
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT _appKey,count(_appKey) FROM ");
                sb2.append(str);
                sb2.append(" GROUP BY ");
                sb2.append("_appKey");
                cursorRawQuery = this.f99052h.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        map.put(cursorRawQuery.getString(0), Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                }
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            } catch (Exception e10) {
                g gVarE = g.e();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("type: ");
                sb3.append(str);
                sb3.append(" query err: ");
                sb3.append(e10.getMessage());
                gVarE.a("605", sb3.toString(), e10);
                com.tencent.beacon.base.util.c.a(e10);
                if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            }
            return map;
        } catch (Throwable th2) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }
}
