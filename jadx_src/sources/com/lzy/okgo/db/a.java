package com.lzy.okgo.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: BaseDao.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static String f64696d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Lock f64697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SQLiteOpenHelper f64698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SQLiteDatabase f64699c;

    /* JADX INFO: renamed from: com.lzy.okgo.db.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseDao.java */
    public interface InterfaceC0522a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public a(SQLiteOpenHelper sQLiteOpenHelper) {
        f64696d = getClass().getSimpleName();
        this.f64697a = e.f64715l;
        this.f64698b = sQLiteOpenHelper;
        this.f64699c = n();
    }

    public boolean A(SQLiteDatabase sQLiteDatabase, List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, list}, this, changeQuickRedirect, false, bb.c.b.f30902r6, new Class[]{SQLiteDatabase.class, List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.replace(h(), null, g(it.next()));
            }
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        }
    }

    public boolean B(T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 480, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (t10 == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            this.f64699c.replace(h(), null, g(t10));
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceT");
        }
    }

    public boolean C(List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 484, new Class[]{List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (list == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f64699c.replace(h(), null, g(it.next()));
            }
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceList");
        }
    }

    public void D(InterfaceC0522a interfaceC0522a) {
        if (PatchProxy.proxy(new Object[]{interfaceC0522a}, this, changeQuickRedirect, false, bb.c.b.E6, new Class[]{InterfaceC0522a.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f64697a.lock();
        try {
            try {
                this.f64699c.beginTransaction();
                interfaceC0522a.a(this.f64699c);
                this.f64699c.setTransactionSuccessful();
            } catch (Exception e10) {
                la.d.i(e10);
            }
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
        }
    }

    public abstract void E();

    public long F(SQLiteDatabase sQLiteDatabase, ContentValues contentValues, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, contentValues, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f30990v6, new Class[]{SQLiteDatabase.class, ContentValues.class, String.class, String[].class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : sQLiteDatabase.update(h(), contentValues, str, strArr);
    }

    public long G(SQLiteDatabase sQLiteDatabase, T t10, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, t10, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f30946t6, new Class[]{SQLiteDatabase.class, Object.class, String.class, String[].class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : sQLiteDatabase.update(h(), g(t10), str, strArr);
    }

    public boolean H(ContentValues contentValues, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{contentValues, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f30968u6, new Class[]{ContentValues.class, String.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            this.f64699c.update(h(), contentValues, str, strArr);
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " updateContentValues");
        }
    }

    public boolean I(T t10, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f30924s6, new Class[]{Object.class, String.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (t10 == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            this.f64699c.update(h(), g(t10), str, strArr);
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " updateT");
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        if (PatchProxy.proxy(new Object[]{sQLiteDatabase, cursor}, this, changeQuickRedirect, false, bb.c.b.f30557c6, new Class[]{SQLiteDatabase.class, Cursor.class}, Void.TYPE).isSupported) {
            return;
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.close();
    }

    public long b(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f30742k6, new Class[]{SQLiteDatabase.class, String.class, String[].class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : sQLiteDatabase.delete(h(), str, strArr);
    }

    public boolean c(String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, bb.c.b.f30719j6, new Class[]{String.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            this.f64699c.delete(h(), str, strArr);
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " delete");
        }
    }

    public long d(SQLiteDatabase sQLiteDatabase) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase}, this, changeQuickRedirect, false, bb.c.b.f30696i6, new Class[]{SQLiteDatabase.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : b(sQLiteDatabase, null, null);
    }

    public boolean e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30673h6, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(null, null);
    }

    public boolean f(List<Pair<String, String[]>> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.f30765l6, new Class[]{List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            for (Pair<String, String[]> pair : list) {
                this.f64699c.delete(h(), (String) pair.first, (String[]) pair.second);
            }
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " deleteList");
        }
    }

    public abstract ContentValues g(T t10);

    public abstract String h();

    public long i(SQLiteDatabase sQLiteDatabase, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, t10}, this, changeQuickRedirect, false, bb.c.b.f30604e6, new Class[]{SQLiteDatabase.class, Object.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : sQLiteDatabase.insert(h(), null, g(t10));
    }

    public boolean j(SQLiteDatabase sQLiteDatabase, List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, list}, this, changeQuickRedirect, false, bb.c.b.f30650g6, new Class[]{SQLiteDatabase.class, List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.insert(h(), null, g(it.next()));
            }
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        }
    }

    public boolean k(T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.b.f30581d6, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (t10 == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            this.f64699c.insert(h(), null, g(t10));
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " insertT");
        }
    }

    public boolean l(List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.f30627f6, new Class[]{List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (list == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f64699c.insert(h(), null, g(it.next()));
            }
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " insertList");
        }
    }

    public SQLiteDatabase m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 468, new Class[0], SQLiteDatabase.class);
        return patchProxyResultProxy.isSupported ? (SQLiteDatabase) patchProxyResultProxy.result : this.f64698b.getReadableDatabase();
    }

    public SQLiteDatabase n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30534b6, new Class[0], SQLiteDatabase.class);
        return patchProxyResultProxy.isSupported ? (SQLiteDatabase) patchProxyResultProxy.result : this.f64698b.getWritableDatabase();
    }

    public abstract T o(Cursor cursor);

    public List<T> p(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f31034x6, new Class[]{SQLiteDatabase.class, String.class, String[].class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : q(sQLiteDatabase, null, str, strArr, null, null, null, null);
    }

    public List<T> q(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) throws Throwable {
        Cursor cursorQuery;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, str5}, this, changeQuickRedirect, false, 493, new Class[]{SQLiteDatabase.class, String[].class, String.class, String[].class, String.class, String.class, String.class, String.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = sQLiteDatabase.query(h(), strArr, str, strArr2, str2, str3, str4, str5);
            while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                try {
                    try {
                        arrayList.add(o(cursorQuery));
                    } catch (Exception e10) {
                        e = e10;
                        la.d.i(e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a(null, cursorQuery);
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
            a(null, cursorQuery);
            throw th;
        }
        a(null, cursorQuery);
        return arrayList;
    }

    public List<T> r(String str, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, bb.c.b.B6, new Class[]{String.class, String[].class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : s(null, str, strArr, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.database.Cursor] */
    public List<T> s(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) throws Throwable {
        Cursor cursorQuery;
        String str6;
        StringBuilder sb2;
        ?? r10 = 497;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr, str, strArr2, str2, str3, str4, str5}, this, changeQuickRedirect, false, bb.c.b.D6, new Class[]{String[].class, String.class, String[].class, String.class, String.class, String.class, String.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                this.f64699c.beginTransaction();
                cursorQuery = this.f64699c.query(h(), strArr, str, strArr2, str2, str3, str4, str5);
                while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(o(cursorQuery));
                    } catch (Exception e10) {
                        e = e10;
                        la.d.i(e);
                        a(null, cursorQuery);
                        this.f64699c.endTransaction();
                        this.f64697a.unlock();
                        str6 = f64696d;
                        sb2 = new StringBuilder();
                    }
                }
                this.f64699c.setTransactionSuccessful();
                a(null, cursorQuery);
                this.f64699c.endTransaction();
                this.f64697a.unlock();
                str6 = f64696d;
                sb2 = new StringBuilder();
            } catch (Throwable th2) {
                th = th2;
                a(null, r10);
                this.f64699c.endTransaction();
                this.f64697a.unlock();
                la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " query");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
            a(null, r10);
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " query");
            throw th;
        }
        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb2.append(" query");
        la.d.k(str6, sb2.toString());
        return arrayList;
    }

    public List<T> t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.A6, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : r(null, null);
    }

    public List<T> u(SQLiteDatabase sQLiteDatabase) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase}, this, changeQuickRedirect, false, bb.c.b.f31012w6, new Class[]{SQLiteDatabase.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : p(sQLiteDatabase, null, null);
    }

    public T v(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, str, strArr}, this, changeQuickRedirect, false, bb.c.b.f31056y6, new Class[]{SQLiteDatabase.class, String.class, String[].class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        List<T> listQ = q(sQLiteDatabase, null, str, strArr, null, null, null, "1");
        if (listQ.size() > 0) {
            return listQ.get(0);
        }
        return null;
    }

    public T w(String str, String[] strArr) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, bb.c.b.C6, new Class[]{String.class, String[].class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<T> listS = s(null, str, strArr, null, null, null, "1");
        la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " queryOne");
        if (listS.size() > 0) {
            return listS.get(0);
        }
        return null;
    }

    public long x(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, contentValues}, this, changeQuickRedirect, false, bb.c.b.f30857p6, new Class[]{SQLiteDatabase.class, ContentValues.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : sQLiteDatabase.replace(h(), null, contentValues);
    }

    public long y(SQLiteDatabase sQLiteDatabase, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, t10}, this, changeQuickRedirect, false, bb.c.b.f30811n6, new Class[]{SQLiteDatabase.class, Object.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : sQLiteDatabase.replace(h(), null, g(t10));
    }

    public boolean z(ContentValues contentValues) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{contentValues}, this, changeQuickRedirect, false, bb.c.b.f30834o6, new Class[]{ContentValues.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f64697a.lock();
        try {
            this.f64699c.beginTransaction();
            this.f64699c.replace(h(), null, contentValues);
            this.f64699c.setTransactionSuccessful();
            return true;
        } catch (Exception e10) {
            la.d.i(e10);
            return false;
        } finally {
            this.f64699c.endTransaction();
            this.f64697a.unlock();
            la.d.k(f64696d, (System.currentTimeMillis() - jCurrentTimeMillis) + " replaceContentValues");
        }
    }
}
