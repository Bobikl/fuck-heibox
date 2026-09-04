package com.igexin.push.core.e;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f63736a;

    protected e() {
        this.f63736a = Build.VERSION.SDK_INT >= 30 ? new a() : new b();
        com.igexin.a.a.c.b.a("SDCardWrapper|SDCardWrapper.mBase = " + this.f63736a.getClass(), new Object[0]);
    }

    @Override // com.igexin.push.core.e.c
    public String a(Context context) {
        try {
            return this.f63736a.a(context);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("SDCardWrapper|getDeviceId()|" + th2.toString(), new Object[0]);
            return null;
        }
    }

    @Override // com.igexin.push.core.e.c
    public void a(Context context, long j10) {
        try {
            this.f63736a.a(context, j10);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("SDCardWrapper|saveSession()|" + th2.toString(), new Object[0]);
        }
    }

    @Override // com.igexin.push.core.e.c
    public void a(Context context, String str) {
        try {
            this.f63736a.a(context, str);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("SDCardWrapper|saveDeviceId()|" + th2.toString(), new Object[0]);
        }
    }

    @Override // com.igexin.push.core.e.c
    public String b(Context context) {
        try {
            return this.f63736a.b(context);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("SDCardWrapper|getCid()|" + th2.toString(), new Object[0]);
            return null;
        }
    }

    @Override // com.igexin.push.core.e.c
    public void b(Context context, String str) {
        try {
            this.f63736a.b(context, str);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("SDCardWrapper|saveCid()|" + th2.toString(), new Object[0]);
        }
    }

    @Override // com.igexin.push.core.e.c
    public long c(Context context) {
        try {
            return this.f63736a.c(context);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("SDCardWrapper|getSession()|" + th2.toString(), new Object[0]);
            return 0L;
        }
    }
}
