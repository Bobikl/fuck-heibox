package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: LogAdaptor.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60436b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60435a = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f60437c = new c();

    private e a(int i10, String str, String str2, Throwable th2) {
        e eVar = new e(8, this.f60436b, i10, str);
        eVar.a(str2);
        eVar.a(th2);
        return eVar;
    }

    private void b() {
        try {
            Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");
        } catch (Throwable unused) {
        }
    }

    public d a() {
        return this.f60437c;
    }

    public void a(int i10, String str, String str2) {
        try {
            if (a(i10)) {
                e eVarA = a(i10, str, str2, null);
                this.f60437c.a(eVarA.c() + eVarA.a(), i10, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public void a(Context context, int i10, String str) {
        this.f60435a = i10;
        this.f60436b = str;
        this.f60437c.a(context, "HMSCore");
    }

    public void a(d dVar) {
        this.f60437c = dVar;
    }

    public void a(String str, String str2) {
        try {
            e eVarA = a(4, str, str2, null);
            this.f60437c.a(eVarA.c() + '\n' + eVarA.a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public boolean a(int i10) {
        return i10 >= this.f60435a;
    }

    public void b(int i10, String str, String str2, Throwable th2) {
        try {
            if (a(i10)) {
                e eVarA = a(i10, str, str2, th2);
                String str3 = eVarA.c() + eVarA.a();
                this.f60437c.a(str3, i10, str, str2 + '\n' + Log.getStackTraceString(th2));
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }
}
