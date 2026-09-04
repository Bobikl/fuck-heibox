package com.tencent.qmsp.sdk.g.h;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.qmsp.sdk.base.b, b.InterfaceC1007b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IVendorCallback f102029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f102030b;

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        String strB;
        return (e() && (strB = this.f102030b.b()) != null) ? strB : "";
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f102029a = iVendorCallback;
        b bVar = new b(context, this);
        this.f102030b = bVar;
        bVar.c();
    }

    @Override // com.tencent.qmsp.sdk.g.h.b.InterfaceC1007b
    public void a(b bVar) {
        IVendorCallback iVendorCallback = this.f102029a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), b(), a());
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        String strA;
        return (e() && (strA = this.f102030b.a()) != null) ? strA : "";
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
        b bVar = this.f102030b;
        if (bVar != null) {
            return bVar.d();
        }
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
        b bVar = this.f102030b;
        if (bVar != null) {
            bVar.e();
        }
    }
}
