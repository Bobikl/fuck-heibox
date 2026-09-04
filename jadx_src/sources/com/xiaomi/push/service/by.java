package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class by implements aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile by f107980a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f1065a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    Context f1066a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private SharedPreferences f1067a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile boolean f1069a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, a> f1068a = new ConcurrentHashMap<>();

    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f107981a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f1070a;

        a(String str, long j10) {
            this.f1070a = str;
            this.f107981a = j10;
        }

        abstract void a(by byVar);

        @Override // java.lang.Runnable
        public void run() {
            if (by.f107980a != null) {
                Context context = by.f107980a.f1066a;
                if (com.xiaomi.push.bg.d(context)) {
                    if (System.currentTimeMillis() - by.f107980a.f1067a.getLong(":ts-" + this.f1070a, 0L) > this.f107981a || com.xiaomi.push.ae.a(context)) {
                        com.xiaomi.push.p.a(by.f107980a.f1067a.edit().putLong(":ts-" + this.f1070a, System.currentTimeMillis()));
                        a(by.f107980a);
                    }
                }
            }
        }
    }

    private by(Context context) {
        this.f1066a = context.getApplicationContext();
        this.f1067a = context.getSharedPreferences("sync", 0);
    }

    public static by a(Context context) {
        if (f107980a == null) {
            synchronized (by.class) {
                if (f107980a == null) {
                    f107980a = new by(context);
                }
            }
        }
        return f107980a;
    }

    public String a(String str, String str2) {
        return this.f1067a.getString(str + ":" + str2, "");
    }

    @Override // com.xiaomi.push.service.aq
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo745a() {
        if (this.f1069a) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f1065a < 3600000) {
            return;
        }
        this.f1065a = jCurrentTimeMillis;
        this.f1069a = true;
        com.xiaomi.push.ah.a(this.f1066a).a(new bz(this), (int) (Math.random() * 10.0d));
    }

    public void a(a aVar) {
        if (this.f1068a.putIfAbsent(aVar.f1070a, aVar) == null) {
            com.xiaomi.push.ah.a(this.f1066a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public void a(String str, String str2, String str3) {
        com.xiaomi.push.p.a(f107980a.f1067a.edit().putString(str + ":" + str2, str3));
    }
}
