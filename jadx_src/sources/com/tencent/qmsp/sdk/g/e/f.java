package com.tencent.qmsp.sdk.g.e;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;

/* JADX INFO: loaded from: classes4.dex */
public class f implements com.tencent.qmsp.sdk.base.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102005a;

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        return d.b(this.f102005a);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f102005a = context;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        return d.a(this.f102005a);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return true;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        return d.a();
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
    }
}
