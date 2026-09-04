package com.tencent.qmsp.sdk.g.d;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.f;

/* JADX INFO: loaded from: classes4.dex */
public class e implements com.tencent.qmsp.sdk.base.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f101988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f101989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IVendorCallback f101990c;

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        String strB;
        return (!e() || (strB = this.f101988a.b()) == null) ? "" : strB;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        if (b.a(context)) {
            String strA = f.a(context);
            if (!TextUtils.isEmpty(strA)) {
                b.a(context, strA);
            }
            this.f101988a = new b(context, this);
            this.f101990c = iVendorCallback;
            this.f101989b = context;
        }
    }

    @Override // com.tencent.qmsp.sdk.g.d.c
    public void a(boolean z10) {
        IVendorCallback iVendorCallback = this.f101990c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), b(), a());
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        String strA;
        return (!e() || (strA = this.f101988a.a()) == null) ? "" : strA;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
        b bVar = this.f101988a;
        if (bVar != null) {
            bVar.a(f.a(this.f101989b));
        } else {
            g();
        }
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        b bVar = this.f101988a;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
        b bVar = this.f101988a;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // com.tencent.qmsp.sdk.g.d.c
    public void g() {
        IVendorCallback iVendorCallback = this.f101990c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, "", "");
        }
    }
}
