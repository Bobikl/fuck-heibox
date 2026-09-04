package com.tencent.qmsp.sdk.g.f;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.f;

/* JADX INFO: loaded from: classes4.dex */
public class a implements com.tencent.qmsp.sdk.base.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102006a;

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        return b.b(this.f102006a);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f102006a = context;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        Context context = this.f102006a;
        return b.a(context, f.a(context));
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
        return b.a(this.f102006a);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
    }
}
