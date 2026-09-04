package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class k0 implements b, j0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IVendorCallback f101624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f101625b;

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        String strB;
        return (e() && (strB = this.f101625b.b()) != null) ? strB : "";
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101624a = iVendorCallback;
        j0 j0Var = new j0(context, this);
        this.f101625b = j0Var;
        j0Var.c();
    }

    @Override // com.tencent.qmsp.oaid2.j0.b
    public void a(j0 j0Var) {
        IVendorCallback iVendorCallback = this.f101624a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), d(), a());
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        String strA;
        return (e() && (strA = this.f101625b.a()) != null) ? strA : "";
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        j0 j0Var = this.f101625b;
        if (j0Var != null) {
            return j0Var.d();
        }
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
        j0 j0Var = this.f101625b;
        if (j0Var != null) {
            j0Var.e();
        }
    }
}
