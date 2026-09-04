package com.tekartik.sqflite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.Constants;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Database.java */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final boolean f98658n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f98659o = "com.tekartik.sqflite.wal_enabled";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Boolean f98660p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f98661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    final String f98662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f98663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f98664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    final Context f98665e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f98668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    SQLiteDatabase f98669i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Integer f98672l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<com.tekartik.sqflite.operation.h> f98666f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<Integer, w> f98667g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f98670j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f98671k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f98673m = 0;

    /* JADX INFO: compiled from: Database.java */
    public class a implements DatabaseErrorHandler {
        a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    j(Context context, String str, int i10, boolean z10, int i11) {
        this.f98665e = context;
        this.f98662b = str;
        this.f98661a = z10;
        this.f98663c = i10;
        this.f98664d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor H(g0 g0Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        g0Var.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(com.tekartik.sqflite.operation.e eVar) {
        Boolean boolE = eVar.e();
        boolean z10 = Boolean.TRUE.equals(boolE) && eVar.d();
        if (z10) {
            int i10 = this.f98671k + 1;
            this.f98671k = i10;
            this.f98672l = Integer.valueOf(i10);
        }
        if (!x(eVar)) {
            if (z10) {
                this.f98672l = null;
            }
        } else if (z10) {
            HashMap map = new HashMap();
            map.put(b.f98598q, this.f98672l);
            eVar.success(map);
        } else {
            if (Boolean.FALSE.equals(boolE)) {
                this.f98672l = null;
            }
            eVar.success(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        while (!this.f98666f.isEmpty() && this.f98672l == null) {
            this.f98666f.get(0).a();
            this.f98666f.remove(0);
        }
    }

    private void T(@n0 com.tekartik.sqflite.operation.e eVar, Runnable runnable) {
        Integer transactionId = eVar.getTransactionId();
        Integer num = this.f98672l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (transactionId == null || !(transactionId.equals(num) || transactionId.intValue() == -1)) {
            this.f98666f.add(new com.tekartik.sqflite.operation.h(eVar, runnable));
            return;
        }
        runnable.run();
        if (this.f98672l != null || this.f98666f.isEmpty()) {
            return;
        }
        this.f98668h.c(this, new Runnable() { // from class: com.tekartik.sqflite.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f98652b.R();
            }
        });
    }

    @j1
    @dl.d
    protected static boolean i(Context context, String str, boolean z10) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : z(context, packageName, 128)).metaData.getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @j1
    @dl.d
    protected static boolean j(Context context) {
        return i(context, f98659o, false);
    }

    private void l(int i10) {
        w wVar = this.f98667g.get(Integer.valueOf(i10));
        if (wVar != null) {
            m(wVar);
        }
    }

    private void m(@n0 w wVar) {
        try {
            int i10 = wVar.f98717a;
            if (u.c(this.f98664d)) {
                Log.d(b.J, B() + "closing cursor " + i10);
            }
            this.f98667g.remove(Integer.valueOf(i10));
            wVar.f98719c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, @p0 Integer num) {
        HashMap map = null;
        int columnCount = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (map == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                columnCount = cursor.getColumnCount();
                map2.put(b.f98606y, Arrays.asList(cursor.getColumnNames()));
                map2.put(b.f98607z, arrayList2);
                arrayList = arrayList2;
                map = map2;
            }
            arrayList.add(h0.a(cursor, columnCount));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(com.tekartik.sqflite.operation.e eVar) {
        if (!x(eVar)) {
            return false;
        }
        eVar.success(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean J(com.tekartik.sqflite.operation.e eVar) throws Throwable {
        Exception e10;
        Cursor cursorRawQuery;
        if (!x(eVar)) {
            return false;
        }
        androidx.room.util.a.C0215a c0215a = 0;
        if (eVar.f()) {
            eVar.success(null);
            return true;
        }
        try {
            try {
                cursorRawQuery = D().rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            if (cursorRawQuery.getInt(0) == 0) {
                                if (u.b(this.f98664d)) {
                                    Log.d(b.J, B() + "no changes (id was " + cursorRawQuery.getLong(1) + ")");
                                }
                                eVar.success(null);
                                cursorRawQuery.close();
                                return true;
                            }
                            long j10 = cursorRawQuery.getLong(1);
                            if (u.b(this.f98664d)) {
                                Log.d(b.J, B() + "inserted " + j10);
                            }
                            eVar.success(Long.valueOf(j10));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        E(e10, eVar);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return false;
                    }
                }
                Log.e(b.J, B() + "fail to read changes for Insert");
                eVar.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                c0215a = "SELECT changes(), last_insert_rowid()";
                if (c0215a != 0) {
                    c0215a.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (c0215a != 0) {
                c0215a.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.tekartik.sqflite.operation.e, com.tekartik.sqflite.operation.f] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tekartik.sqflite.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.tekartik.sqflite.j] */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean K(@n0 com.tekartik.sqflite.operation.e eVar) throws Throwable {
        Integer num = (Integer) eVar.a(b.A);
        final ?? C = eVar.c();
        if (u.b(this.f98664d)) {
            Log.d(b.J, B() + C);
        }
        w wVar = null;
        try {
            try {
                C = A().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.tekartik.sqflite.h
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return j.H(C, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, C.c(), b.N, null);
                try {
                    Map<String, Object> mapN = n(C, num);
                    if ((num == null || C.isLast() || C.isAfterLast()) ? false : true) {
                        int i10 = this.f98673m + 1;
                        this.f98673m = i10;
                        mapN.put(b.B, Integer.valueOf(i10));
                        w wVar2 = new w(i10, num.intValue(), C);
                        try {
                            this.f98667g.put(Integer.valueOf(i10), wVar2);
                            wVar = wVar2;
                        } catch (Exception e10) {
                            e = e10;
                            wVar = wVar2;
                            E(e, eVar);
                            if (wVar != null) {
                                m(wVar);
                            }
                            if (wVar == null && C != 0) {
                                C.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            wVar = wVar2;
                            if (wVar == null && C != 0) {
                                C.close();
                            }
                            throw th;
                        }
                    }
                    eVar.success(mapN);
                    if (wVar == null && C != 0) {
                        C.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
            C = 0;
        } catch (Throwable th4) {
            th = th4;
            C = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean L(@n0 com.tekartik.sqflite.operation.e eVar) throws Throwable {
        boolean z10;
        int iIntValue = ((Integer) eVar.a(b.B)).intValue();
        boolean zEquals = Boolean.TRUE.equals(eVar.a("cancel"));
        if (u.c(this.f98664d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(B());
            sb2.append("cursor ");
            sb2.append(iIntValue);
            sb2.append(zEquals ? " cancel" : " next");
            Log.d(b.J, sb2.toString());
        }
        w wVar = null;
        if (zEquals) {
            l(iIntValue);
            eVar.success(null);
            return true;
        }
        w wVar2 = this.f98667g.get(Integer.valueOf(iIntValue));
        boolean z11 = false;
        try {
            if (wVar2 == null) {
                throw new IllegalStateException("Cursor " + iIntValue + " not found");
            }
            Cursor cursor = wVar2.f98719c;
            Map<String, Object> mapN = n(cursor, Integer.valueOf(wVar2.f98718b));
            z10 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
            if (z10) {
                try {
                    try {
                        mapN.put(b.B, Integer.valueOf(iIntValue));
                    } catch (Exception e10) {
                        e = e10;
                        E(e, eVar);
                        if (wVar2 != null) {
                            m(wVar2);
                        } else {
                            wVar = wVar2;
                        }
                        if (!z10 && wVar != null) {
                            m(wVar);
                        }
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z11 = z10;
                    if (!z11 && wVar2 != null) {
                        m(wVar2);
                    }
                    throw th;
                }
            }
            eVar.success(mapN);
            if (!z10) {
                m(wVar2);
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th3) {
            th = th3;
            if (!z11) {
                m(wVar2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean M(com.tekartik.sqflite.operation.e eVar) throws Throwable {
        if (!x(eVar)) {
            return false;
        }
        Cursor cursor = null;
        if (eVar.f()) {
            eVar.success(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = D().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i10 = cursorRawQuery.getInt(0);
                            if (u.b(this.f98664d)) {
                                Log.d(b.J, B() + "changed " + i10);
                            }
                            eVar.success(Integer.valueOf(i10));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = cursorRawQuery;
                        E(e, eVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e(b.J, B() + "fail to read changes for Update/Delete");
                eVar.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean x(com.tekartik.sqflite.operation.e eVar) {
        g0 g0VarC = eVar.c();
        if (u.b(this.f98664d)) {
            Log.d(b.J, B() + g0VarC);
        }
        Boolean boolE = eVar.e();
        try {
            D().execSQL(g0VarC.c(), g0VarC.d());
            v(boolE);
            return true;
        } catch (Exception e10) {
            E(e10, eVar);
            return false;
        }
    }

    public static boolean y(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo z(Context context, String str, int i10) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    public SQLiteDatabase A() {
        return this.f98669i;
    }

    String B() {
        return Constants.ARRAY_TYPE + C() + "] ";
    }

    String C() {
        Thread threadCurrentThread = Thread.currentThread();
        return this.f98663c + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
    }

    public SQLiteDatabase D() {
        return this.f98669i;
    }

    void E(Exception exc, com.tekartik.sqflite.operation.e eVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            eVar.error("sqlite_error", "open_failed " + this.f98662b, null);
            return;
        }
        if (exc instanceof SQLException) {
            eVar.error("sqlite_error", exc.getMessage(), com.tekartik.sqflite.operation.i.a(eVar));
        } else {
            eVar.error("sqlite_error", exc.getMessage(), com.tekartik.sqflite.operation.i.a(eVar));
        }
    }

    public void F(final com.tekartik.sqflite.operation.e eVar) {
        T(eVar, new Runnable() { // from class: com.tekartik.sqflite.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f98626b.J(eVar);
            }
        });
    }

    synchronized boolean G() {
        return this.f98670j > 0;
    }

    public void N() {
        if (f98660p == null) {
            Boolean boolValueOf = Boolean.valueOf(j(this.f98665e));
            f98660p = boolValueOf;
            if (boolValueOf.booleanValue() && u.c(this.f98664d)) {
                Log.d(b.J, B() + "[sqflite] WAL enabled");
            }
        }
        this.f98669i = SQLiteDatabase.openDatabase(this.f98662b, null, f98660p.booleanValue() ? com.google.android.exoplayer2.j.G : 268435456);
    }

    public void O() {
        this.f98669i = SQLiteDatabase.openDatabase(this.f98662b, null, 1, new a());
    }

    public void P(@n0 final com.tekartik.sqflite.operation.e eVar) {
        T(eVar, new Runnable() { // from class: com.tekartik.sqflite.f
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f98631b.K(eVar);
            }
        });
    }

    public void Q(@n0 final com.tekartik.sqflite.operation.e eVar) {
        T(eVar, new Runnable() { // from class: com.tekartik.sqflite.c
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f98611b.L(eVar);
            }
        });
    }

    public void S(@n0 final com.tekartik.sqflite.operation.e eVar) {
        T(eVar, new Runnable() { // from class: com.tekartik.sqflite.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f98656b.M(eVar);
            }
        });
    }

    void h(MethodCall methodCall, MethodChannel.Result result) {
        com.tekartik.sqflite.operation.d dVar = new com.tekartik.sqflite.operation.d(methodCall, result);
        boolean zF = dVar.f();
        boolean zG = dVar.g();
        List list = (List) dVar.a("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tekartik.sqflite.operation.c cVar = new com.tekartik.sqflite.operation.c((Map) it.next(), zF);
            String method = cVar.getMethod();
            method.hashCode();
            switch (method) {
                case "execute":
                    if (!p(cVar)) {
                        if (!zG) {
                            cVar.n(result);
                            return;
                        }
                        cVar.o(arrayList);
                        break;
                    } else {
                        cVar.p(arrayList);
                        break;
                    }
                    break;
                case "insert":
                    if (!J(cVar)) {
                        if (!zG) {
                            cVar.n(result);
                            return;
                        }
                        cVar.o(arrayList);
                        break;
                    } else {
                        cVar.p(arrayList);
                        break;
                    }
                    break;
                case "update":
                    if (!M(cVar)) {
                        if (!zG) {
                            cVar.n(result);
                            return;
                        }
                        cVar.o(arrayList);
                        break;
                    } else {
                        cVar.p(arrayList);
                        break;
                    }
                    break;
                case "query":
                    if (!K(cVar)) {
                        if (!zG) {
                            cVar.n(result);
                            return;
                        }
                        cVar.o(arrayList);
                        break;
                    } else {
                        cVar.p(arrayList);
                        break;
                    }
                    break;
                default:
                    result.error("bad_param", "Batch method '" + method + "' not supported", null);
                    return;
            }
        }
        if (zF) {
            result.success(null);
        } else {
            result.success(arrayList);
        }
    }

    public void k() {
        if (!this.f98667g.isEmpty() && u.b(this.f98664d)) {
            Log.d(b.J, B() + this.f98667g.size() + " cursor(s) are left opened");
        }
        this.f98669i.close();
    }

    public boolean u() {
        try {
            return this.f98669i.enableWriteAheadLogging();
        } catch (Exception e10) {
            Log.e(b.J, B() + "enable WAL error: " + e10);
            return false;
        }
    }

    synchronized void v(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f98670j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f98670j--;
        }
    }

    public void w(@n0 final com.tekartik.sqflite.operation.e eVar) {
        T(eVar, new Runnable() { // from class: com.tekartik.sqflite.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f98621b.I(eVar);
            }
        });
    }
}
