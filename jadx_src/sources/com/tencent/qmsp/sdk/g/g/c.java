package com.tencent.qmsp.sdk.g.g;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.qmsp.sdk.base.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102010a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IVendorCallback f102011b = null;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
                if (c.this.f102011b != null) {
                    c.this.f102011b.onResult(b.a(), b.a(c.this.f102010a), b.b(c.this.f102010a));
                }
            } catch (Exception e10) {
                if (c.this.f102011b != null) {
                    c.this.f102011b.onResult(false, null, null);
                }
                e10.printStackTrace();
            }
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        return "";
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f102010a = context;
        this.f102011b = iVendorCallback;
        b.c(context);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        return "";
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
        new Thread(new a()).start();
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        return b.a();
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
    }
}
