package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: UMDBUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class h {
    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(e.f104721b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            f.a(context).a();
        } catch (Throwable unused) {
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.execSQL("alter table " + str + " add " + str2 + " " + str3);
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z10 = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query(str, null, null, null, null, null, "LIMIT 0");
            if (cursorQuery != null && cursorQuery.getColumnIndex(str2) != -1) {
                z10 = true;
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
            }
        } catch (Throwable th2) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th2;
        }
        return z10;
    }

    public static boolean a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"count(*)"}, "type=? and name=?", new String[]{"table", str.trim()}, null, null, null, null);
            if (cursorQuery.moveToNext() && cursorQuery.getInt(0) > 0) {
                z10 = true;
            }
        } catch (Exception unused) {
            if (cursorQuery != null) {
            }
            return z10;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
        cursorQuery.close();
        return z10;
    }

    public static String b(Context context) {
        return context.getDatabasePath(e.f104721b).getParent() + File.separator;
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public static String c(Context context) {
        return b(context) + "subprocess/";
    }
}
