package com.xiaomi.push;

import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class ba implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f106857a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ay.b f208a;

    ba(ay.b bVar, IBinder iBinder) {
        this.f208a = bVar;
        this.f106857a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String packageName = ay.this.f201a.getPackageName();
            String strB = ay.this.b();
            ay.a aVar = new ay.a();
            aVar.f106844b = ay.c.a(this.f106857a, packageName, strB, "OUID");
            ay.this.f203a = aVar;
            ay.this.m157b();
            ay.this.f200a = 2;
            synchronized (ay.this.f204a) {
                try {
                    ay.this.f204a.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ay.this.m157b();
            ay.this.f200a = 2;
            synchronized (ay.this.f204a) {
                try {
                    ay.this.f204a.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th2) {
            ay.this.m157b();
            ay.this.f200a = 2;
            synchronized (ay.this.f204a) {
                try {
                    ay.this.f204a.notifyAll();
                } catch (Exception unused4) {
                }
                throw th2;
            }
        }
    }
}
