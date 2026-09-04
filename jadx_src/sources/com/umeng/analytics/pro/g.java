package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: UMDBManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SQLiteOpenHelper f104790b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Context f104791d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f104792a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f104793c;

    /* JADX INFO: compiled from: UMDBManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f104794a = new g();

        private a() {
        }
    }

    private g() {
        this.f104792a = new AtomicInteger();
    }

    public static g a(Context context) {
        if (f104791d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f104791d = applicationContext;
            f104790b = f.a(applicationContext);
        }
        return a.f104794a;
    }

    public synchronized SQLiteDatabase a() {
        if (this.f104792a.incrementAndGet() == 1) {
            this.f104793c = f104790b.getWritableDatabase();
        }
        return this.f104793c;
    }

    public synchronized void b() {
        try {
            if (this.f104792a.decrementAndGet() == 0) {
                this.f104793c.close();
            }
        } catch (Throwable unused) {
        }
    }
}
