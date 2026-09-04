package com.tencent.qmsp.sdk.g.c;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.qmsp.sdk.base.b, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f101970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IVendorCallback f101971b;

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        String strA;
        return (e() && (strA = this.f101970a.a()) != null) ? strA : "";
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101971b = iVendorCallback;
        this.f101970a = new c(context, this);
    }

    @Override // com.tencent.qmsp.sdk.g.c.c.b
    public void a(c cVar) {
        try {
            IVendorCallback iVendorCallback = this.f101971b;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(e(), b(), a());
            }
        } catch (Exception unused) {
            IVendorCallback iVendorCallback2 = this.f101971b;
            if (iVendorCallback2 != null) {
                iVendorCallback2.onResult(false, null, null);
            }
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        String strC;
        return (e() && (strC = this.f101970a.c()) != null) ? strC : "";
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        c cVar = this.f101970a;
        if (cVar != null) {
            return cVar.b();
        }
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
        c cVar = this.f101970a;
        if (cVar != null) {
            cVar.d();
        }
    }
}
