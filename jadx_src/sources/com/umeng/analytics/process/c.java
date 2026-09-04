package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: UMProcessDBManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f105022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f105023b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f105024c;

    /* JADX INFO: compiled from: UMProcessDBManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicInteger f105025a = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SQLiteOpenHelper f105026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SQLiteDatabase f105027c;

        private a() {
        }

        static a a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f105026b = b.a(appContext, str);
            return aVar;
        }

        synchronized SQLiteDatabase a() {
            if (this.f105025a.incrementAndGet() == 1) {
                this.f105027c = this.f105026b.getWritableDatabase();
            }
            return this.f105027c;
        }

        synchronized void b() {
            try {
                if (this.f105025a.decrementAndGet() == 0) {
                    this.f105027c.close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private c() {
    }

    static c a(Context context) {
        if (f105022a == null) {
            synchronized (c.class) {
                if (f105022a == null) {
                    f105022a = new c();
                }
            }
        }
        c cVar = f105022a;
        cVar.f105024c = context;
        return cVar;
    }

    private a c(String str) {
        if (this.f105023b.get(str) != null) {
            return this.f105023b.get(str);
        }
        a aVarA = a.a(this.f105024c, str);
        this.f105023b.put(str, aVarA);
        return aVarA;
    }

    synchronized SQLiteDatabase a(String str) {
        return c(str).a();
    }

    synchronized void b(String str) {
        c(str).b();
    }
}
