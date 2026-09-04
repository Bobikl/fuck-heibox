package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public class h implements b, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IVendorCallback f101590a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f101593d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101591b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101592c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f101594e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101595f = false;

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        return this.f101591b;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101590a = iVendorCallback;
        i iVar = new i(context);
        this.f101593d = iVar;
        iVar.a(this);
    }

    @Override // com.tencent.qmsp.oaid2.g
    public void a(f fVar) {
        try {
            String strC = fVar.c();
            this.f101591b = strC;
            if (strC == null) {
                this.f101591b = "";
            }
        } catch (Exception unused) {
        }
        try {
            String strI = fVar.i();
            this.f101592c = strI;
            if (strI == null) {
                this.f101592c = "";
            }
        } catch (Exception unused2) {
        }
        try {
            this.f101595f = fVar.b();
        } catch (Exception unused3) {
        }
        this.f101594e = true;
        IVendorCallback iVendorCallback = this.f101590a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(this.f101595f, this.f101592c, this.f101591b);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.tencent.qmsp.oaid2.g
    public void b() {
        IVendorCallback iVendorCallback = this.f101590a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, null, null);
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        return this.f101592c;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        return this.f101595f;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
        this.f101593d.a(this);
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
        i iVar;
        if (!this.f101594e || (iVar = this.f101593d) == null) {
            return;
        }
        iVar.a();
    }
}
