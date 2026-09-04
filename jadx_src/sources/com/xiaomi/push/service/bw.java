package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.ew;
import com.xiaomi.push.ex;
import com.xiaomi.push.ie;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bw f107978a = new bw();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f1060a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.ak.b f1061a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ew.a f1062a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<a> f1063a = new ArrayList();

    public static abstract class a {
        public void a(ew.a aVar) {
        }

        public void a(ex.b bVar) {
        }
    }

    private bw() {
    }

    public static bw a() {
        return f107978a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized String m738a() {
        if (f1060a == null) {
            SharedPreferences sharedPreferences = C1339r.m655a().getSharedPreferences("XMPushServiceConfig", 0);
            String string = sharedPreferences.getString("DeviceUUID", null);
            f1060a = string;
            if (string == null) {
                String strA = com.xiaomi.push.i.a(C1339r.m655a(), false);
                f1060a = strA;
                if (strA != null) {
                    sharedPreferences.edit().putString("DeviceUUID", f1060a).commit();
                }
            }
        }
        return f1060a;
    }

    private void b() throws Throwable {
        if (this.f1062a == null) {
            d();
        }
    }

    private void c() {
        if (this.f1061a != null) {
            return;
        }
        bx bxVar = new bx(this);
        this.f1061a = bxVar;
        ie.a(bxVar);
    }

    private void d() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        Exception e10;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(C1339r.m655a().openFileInput("XMCloudCfg"));
                try {
                    this.f1062a = ew.a.b(com.xiaomi.push.b.a(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Exception e11) {
                    e10 = e11;
                    com.xiaomi.channel.commonutils.logger.b.m62a("load config failure: " + e10.getMessage());
                }
            } catch (Throwable th3) {
                th2 = th3;
                com.xiaomi.push.x.a((Closeable) bufferedInputStream);
                throw th2;
            }
        } catch (Exception e12) {
            bufferedInputStream = null;
            e10 = e12;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            com.xiaomi.push.x.a((Closeable) bufferedInputStream);
            throw th2;
        }
        com.xiaomi.push.x.a((Closeable) bufferedInputStream);
        if (this.f1062a == null) {
            this.f1062a = new ew.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f1062a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(C1339r.m655a().openFileOutput("XMCloudCfg", 0));
                com.xiaomi.push.c cVarA = com.xiaomi.push.c.a(bufferedOutputStream);
                this.f1062a.a(cVarA);
                cVarA.m196a();
                bufferedOutputStream.close();
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("save config failure: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    int m741a() throws Throwable {
        b();
        ew.a aVar = this.f1062a;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public ew.a m742a() throws Throwable {
        b();
        return this.f1062a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    synchronized void m743a() {
        this.f1063a.clear();
    }

    void a(ex.b bVar) {
        a[] aVarArr;
        if (bVar.m314d() && bVar.d() > m741a()) {
            c();
        }
        synchronized (this) {
            List<a> list = this.f1063a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }

    public synchronized void a(a aVar) {
        this.f1063a.add(aVar);
    }
}
