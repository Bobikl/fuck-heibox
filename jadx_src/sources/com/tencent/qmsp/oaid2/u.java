package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class u implements b, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f101658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f101659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IVendorCallback f101660c;

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        String strB;
        return (!e() || (strB = this.f101658a.b()) == null) ? "" : strB;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        if (r.a(context)) {
            String strA = e.a(context);
            if (!TextUtils.isEmpty(strA)) {
                r.a(context, strA);
            }
            this.f101658a = new r(context, this);
            this.f101660c = iVendorCallback;
            this.f101659b = context;
        }
    }

    @Override // com.tencent.qmsp.oaid2.s
    public void a(boolean z10) {
        IVendorCallback iVendorCallback = this.f101660c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), d(), a());
        }
    }

    @Override // com.tencent.qmsp.oaid2.s
    public void b() {
        IVendorCallback iVendorCallback = this.f101660c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, "", "");
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        String strA;
        return (!e() || (strA = this.f101658a.a()) == null) ? "" : strA;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        r rVar = this.f101658a;
        if (rVar != null) {
            return rVar.c();
        }
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
        r rVar = this.f101658a;
        if (rVar != null) {
            rVar.a(e.a(this.f101659b));
        } else {
            b();
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
        r rVar = this.f101658a;
        if (rVar != null) {
            rVar.d();
        }
    }
}
