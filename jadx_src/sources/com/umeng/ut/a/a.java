package com.umeng.ut.a;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f106415a = new a();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f70a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f69a = 0;

    private a() {
    }

    public static a a() {
        return f106415a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m52a() {
        return System.currentTimeMillis() + this.f69a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Context m53a() {
        return this.f70a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m54a() {
        return "" + m52a();
    }

    public void a(long j10) {
        this.f69a = j10 - System.currentTimeMillis();
    }

    public synchronized void a(Context context) {
        if (this.f70a == null) {
            if (context == null) {
                return;
            }
            if (context.getApplicationContext() != null) {
                this.f70a = context.getApplicationContext();
            } else {
                this.f70a = context;
            }
        }
    }
}
