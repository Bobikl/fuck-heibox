package com.tencent.qmsp.sdk.g.a;

import android.content.Context;
import android.os.IBinder;
import com.tencent.qmsp.sdk.base.IVendorCallback;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.qmsp.sdk.base.b, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IVendorCallback f101944a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f101947d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f101945b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f101946c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f101948e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f101949f = false;

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        return this.f101945b;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101944a = iVendorCallback;
        d dVar = new d(context);
        this.f101947d = dVar;
        dVar.a(this);
    }

    @Override // com.tencent.qmsp.sdk.g.a.b
    public void a(a aVar) {
        try {
            String strC = aVar.c();
            this.f101945b = strC;
            if (strC == null) {
                this.f101945b = "";
            }
        } catch (Exception unused) {
        }
        try {
            String strH = aVar.h();
            this.f101946c = strH;
            if (strH == null) {
                this.f101946c = "";
            }
        } catch (Exception unused2) {
        }
        try {
            this.f101949f = aVar.g();
        } catch (Exception unused3) {
        }
        this.f101948e = true;
        IVendorCallback iVendorCallback = this.f101944a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(this.f101949f, this.f101946c, this.f101945b);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        return this.f101946c;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
        this.f101947d.a(this);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return false;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        return this.f101949f;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
        d dVar;
        if (!this.f101948e || (dVar = this.f101947d) == null) {
            return;
        }
        dVar.a();
    }

    @Override // com.tencent.qmsp.sdk.g.a.b
    public void g() {
        IVendorCallback iVendorCallback = this.f101944a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, null, null);
        }
    }
}
