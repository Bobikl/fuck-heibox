package com.tencent.qimei.d;

import android.os.SystemClock;
import com.tencent.qmsp.oaid2.IVendorCallback;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements IVendorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f101225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f101226b;

    public c(d dVar, e eVar) {
        this.f101226b = dVar;
        this.f101225a = eVar;
    }

    @Override // com.tencent.qmsp.oaid2.IVendorCallback
    public void onResult(boolean z10, String str, String str2) {
        this.f101226b.f101237k.a(str2);
        int i10 = (str2 == null || str2.isEmpty()) ? 0 : 1;
        if (i10 != 0) {
            this.f101226b.f101230d = SystemClock.elapsedRealtime() - this.f101226b.f101229c;
            com.tencent.qimei.n.a.a("oaid use time: %d", Long.valueOf(this.f101226b.f101230d));
        }
        e eVar = this.f101225a;
        if (eVar != null) {
            eVar.a(1 ^ i10);
        }
    }
}
