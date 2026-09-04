package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class f0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101586a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IVendorCallback f101587b = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
                if (f0.this.f101587b != null) {
                    f0.this.f101587b.onResult(e0.a(), e0.a(f0.this.f101586a), e0.b(f0.this.f101586a));
                }
            } catch (Exception e10) {
                if (f0.this.f101587b != null) {
                    f0.this.f101587b.onResult(false, "null", "null");
                }
                e10.printStackTrace();
            }
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        return "";
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101586a = context;
        this.f101587b = iVendorCallback;
        e0.c(context);
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        return "";
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        return e0.a();
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
        new Thread(new a()).start();
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
    }
}
