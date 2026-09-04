package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class b0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101559a;

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        return c0.b(this.f101559a);
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101559a = context;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        Context context = this.f101559a;
        return c0.a(context, e.a(context));
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        return c0.a(this.f101559a);
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return true;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
    }
}
