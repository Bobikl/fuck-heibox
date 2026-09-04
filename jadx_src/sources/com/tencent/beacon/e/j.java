package com.tencent.beacon.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StrategyModule;
import com.umeng.analytics.pro.ao;
import java.util.Locale;

/* JADX INFO: compiled from: StrategyUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f99038a;

    /* JADX INFO: compiled from: StrategyUtils.java */
    public static class a extends SQLiteOpenHelper {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(@p0 Context context, @p0 String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                str2 = "beacon_db";
            } else {
                str2 = "beacon_db_" + str;
            }
            super(context, str2, (SQLiteDatabase.CursorFactory) null, 30);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s int unique , %s int , %s blob)", "t_strategy", ao.f104522d, "_key", "_ut", "_datas"));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            com.tencent.beacon.base.util.c.a("[db] Upgrade a db  [%s] from v %d to v %d , deleted all tables!", "beacon_db", Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public static synchronized i a(Context context, int i10) {
        SQLiteDatabase writableDatabase;
        i iVar;
        Cursor cursor = null;
        iVarA = null;
        i iVarA = null;
        cursor = null;
        Cursor cursor2 = null;
        cursor = null;
        try {
            if (context == null) {
                com.tencent.beacon.base.util.c.e("[db] context is null", new Object[0]);
                return null;
            }
            try {
                try {
                    writableDatabase = new a(context, com.tencent.beacon.a.c.c.d().f()).getWritableDatabase();
                    try {
                        if (writableDatabase == null) {
                            com.tencent.beacon.base.util.c.e("[db] getWritableDatabase fail!", new Object[0]);
                            if (writableDatabase != null && writableDatabase.isOpen()) {
                                writableDatabase.close();
                            }
                            return null;
                        }
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[2];
                        objArr[0] = "_key";
                        objArr[1] = Integer.valueOf(i10);
                        Cursor cursorQuery = writableDatabase.query("t_strategy", null, String.format(locale, " %s = %d ", objArr), null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToNext() && (iVarA = a(cursorQuery)) != null) {
                                    com.tencent.beacon.base.util.c.a("[db] read strategy key: %d", Integer.valueOf(iVarA.f99036b));
                                }
                            } catch (Exception e10) {
                                e = e10;
                                iVar = null;
                                cursor2 = cursorQuery;
                                com.tencent.beacon.a.b.g.e().a("605", "[db] TB: t_strategy query fail!");
                                com.tencent.beacon.base.util.c.a(e);
                                if (cursor2 != null && !cursor2.isClosed()) {
                                    cursor2.close();
                                }
                                if (writableDatabase != null && writableDatabase.isOpen()) {
                                    writableDatabase.close();
                                }
                                iVarA = iVar;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null && !cursor.isClosed()) {
                                    cursor.close();
                                }
                                if (writableDatabase != null && writableDatabase.isOpen()) {
                                    writableDatabase.close();
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (writableDatabase.isOpen()) {
                            writableDatabase.close();
                        }
                        return iVarA;
                    } catch (Exception e11) {
                        e = e11;
                        iVar = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    iVar = null;
                    writableDatabase = null;
                } catch (Throwable th3) {
                    th = th3;
                    writableDatabase = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    private static i a(Cursor cursor) {
        if (cursor == null || cursor.isBeforeFirst() || cursor.isAfterLast()) {
            return null;
        }
        com.tencent.beacon.base.util.c.a("[db] parse bean.", new Object[0]);
        i iVar = new i();
        iVar.f99035a = cursor.getLong(cursor.getColumnIndex(ao.f104522d));
        iVar.f99036b = cursor.getInt(cursor.getColumnIndex("_key"));
        iVar.f99037c = cursor.getBlob(cursor.getColumnIndex("_datas"));
        return iVar;
    }

    public static String a() {
        if (!TextUtils.isEmpty(f99038a)) {
            return f99038a;
        }
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        f99038a = aVarA.getString("initsdkdate", "");
        if (!com.tencent.beacon.base.util.b.d().equals(f99038a)) {
            com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putString("initsdkdate", com.tencent.beacon.base.util.b.d());
            }
        }
        return f99038a;
    }

    public static boolean b() {
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        int i10 = com.tencent.beacon.base.util.b.d().equals(a()) ? aVarA.getInt("QUERY_TIMES_KEY", 0) : 0;
        if (i10 > com.tencent.beacon.e.a.a().c()) {
            com.tencent.beacon.base.util.c.d("[strategy] sdk init max times", new Object[0]);
            return true;
        }
        int i11 = i10 + 1;
        com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
        if (!com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
            return false;
        }
        sharedPreferencesEditorC0949aEdit.putInt("QUERY_TIMES_KEY", i11);
        return false;
    }

    public static boolean c() {
        b bVarB = ((StrategyModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STRATEGY)).b();
        if (bVarB.i()) {
            com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = ((jCurrentTimeMillis / 60000) + 480) % 1440;
            if (j10 >= 0 && j10 <= 30 && jCurrentTimeMillis - aVarA.getLong("last_success_strategy_query_time", 0L) <= 90000000) {
                return true;
            }
            if (com.tencent.beacon.base.util.b.d().equals(a())) {
                return aVarA.getInt("today_success_strategy_query_times", 0) >= bVarB.c();
            }
            com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putInt("today_success_strategy_query_times", 0);
            }
        }
        return false;
    }

    public static void d() {
        b bVarB = ((StrategyModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STRATEGY)).b();
        if (bVarB == null || !bVarB.i()) {
            return;
        }
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        int i10 = aVarA.getInt("today_success_strategy_query_times", 0) + 1;
        com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
            sharedPreferencesEditorC0949aEdit.putInt("today_success_strategy_query_times", i10).putLong("last_success_strategy_query_time", System.currentTimeMillis());
        }
    }
}
