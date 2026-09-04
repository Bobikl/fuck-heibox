package com.apm.lite.c.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.lite.c;
import com.apm.lite.k.q;
import com.umeng.analytics.pro.ao;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f39876a = ao.f104522d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f39877b;

    protected a(String str) {
        this.f39877b = str;
    }

    protected abstract ContentValues a(T t10);

    protected abstract HashMap<String, String> b();

    public void c(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f39877b);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mapB = b();
            if (mapB != null) {
                for (String str : mapB.keySet()) {
                    sb2.append(str);
                    sb2.append(" ");
                    sb2.append(mapB.get(str));
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.delete(sb2.length() - 1, sb2.length());
                sb2.append(")");
                sQLiteDatabase.execSQL(sb2.toString());
            }
        } catch (Throwable th2) {
            c.a();
            c.b("NPTH_CATCH", th2);
        }
    }

    public void d(SQLiteDatabase sQLiteDatabase, T t10) {
        if (sQLiteDatabase == null || t10 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f39877b, null, a(t10));
        } catch (Throwable th2) {
            q.g(th2);
        }
    }
}
