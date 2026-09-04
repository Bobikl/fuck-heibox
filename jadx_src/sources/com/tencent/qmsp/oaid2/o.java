package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class o implements b, p.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f101640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IVendorCallback f101641b;

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        String strA;
        return (e() && (strA = this.f101640a.a()) != null) ? strA : "";
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101641b = iVendorCallback;
        this.f101640a = new p(context, this);
    }

    @Override // com.tencent.qmsp.oaid2.p.b
    public void a(p pVar) {
        try {
            IVendorCallback iVendorCallback = this.f101641b;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(e(), d(), a());
            }
        } catch (Exception unused) {
            IVendorCallback iVendorCallback2 = this.f101641b;
            if (iVendorCallback2 != null) {
                iVendorCallback2.onResult(false, "null", "null");
            }
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        String strC;
        return (e() && (strC = this.f101640a.c()) != null) ? strC : "";
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        p pVar = this.f101640a;
        if (pVar != null) {
            return pVar.b();
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
        p pVar = this.f101640a;
        if (pVar != null) {
            pVar.d();
        }
    }
}
