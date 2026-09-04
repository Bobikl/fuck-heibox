package com.tencent.qmsp.sdk.c;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f101765d = {6, 98, -78, org.apache.tools.tar.c.P, 38, 11, 101, -14, com.google.common.base.a.f56673z, 96};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f101766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f101767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f101768c;

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0991a {
        void a();

        void run();
    }

    public a(String str, long j10) {
        this.f101766a = str;
        this.f101767b = j10;
    }

    private boolean a() {
        boolean z10 = false;
        SharedPreferences sharedPreferences = com.tencent.qmsp.sdk.app.a.getContext().getSharedPreferences(b.f101769a + a(f101765d), 0);
        this.f101768c = true;
        try {
            long j10 = sharedPreferences.getLong(this.f101766a, 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = jCurrentTimeMillis - j10;
            if (j10 == 0 || j11 >= this.f101767b || j11 <= 0) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(this.f101766a, jCurrentTimeMillis);
                editorEdit.commit();
                return false;
            }
            try {
                this.f101768c = false;
                return true;
            } catch (Exception e10) {
                e = e10;
                z10 = true;
            }
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
        return z10;
    }

    private void b() {
        if (this.f101768c) {
            try {
                SharedPreferences.Editor editorEdit = com.tencent.qmsp.sdk.app.a.getContext().getSharedPreferences(b.f101769a + a(f101765d), 0).edit();
                editorEdit.remove(this.f101766a);
                editorEdit.commit();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public String a(byte[] bArr) {
        return com.tencent.qmsp.sdk.f.h.a(bArr);
    }

    public void a(InterfaceC0991a interfaceC0991a) {
        if (interfaceC0991a != null) {
            if (a()) {
                interfaceC0991a.a();
            } else {
                interfaceC0991a.run();
            }
            b();
        }
    }
}
