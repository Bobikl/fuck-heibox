package com.lzy.okgo.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DBUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, str, str2}, null, changeQuickRedirect, true, bb.c.b.f30512a7, new Class[]{SQLiteDatabase.class, String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || sQLiteDatabase == null || str2 == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                if (cursorRawQuery != null && cursorRawQuery.getColumnIndex(str2) != -1) {
                    z10 = true;
                }
                return z10;
            } catch (Exception e10) {
                la.d.i(e10);
                return false;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, hVar}, null, changeQuickRedirect, true, bb.c.b.Y6, new Class[]{SQLiteDatabase.class, h.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!c(sQLiteDatabase, hVar.f64721a)) {
            return true;
        }
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select * from " + hVar.f64721a, null);
        if (cursorRawQuery == null) {
            return false;
        }
        try {
            int iC = hVar.c();
            if (iC != cursorRawQuery.getColumnCount()) {
                return true;
            }
            for (int i10 = 0; i10 < iC; i10++) {
                if (hVar.d(cursorRawQuery.getColumnName(i10)) == -1) {
                    return true;
                }
            }
            return false;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static boolean c(SQLiteDatabase sQLiteDatabase, String str) {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sQLiteDatabase, str}, null, changeQuickRedirect, true, bb.c.b.Z6, new Class[]{SQLiteDatabase.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[]{"table", str});
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return false;
                }
                i10 = cursorRawQuery.getInt(0);
                cursorRawQuery.close();
            } catch (Exception e10) {
                la.d.i(e10);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                i10 = 0;
            }
            return i10 > 0;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }
}
