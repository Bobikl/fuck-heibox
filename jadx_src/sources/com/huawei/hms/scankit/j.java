package com.huawei.hms.scankit;

import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.o4;

/* JADX INFO: compiled from: PreviewCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public class j implements j0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f61502a;

    public j(d dVar) {
        this.f61502a = dVar;
    }

    @Override // com.huawei.hms.scankit.p.j0.e
    public void a(byte[] bArr) {
        o4.a("scan-time", "request frame time:" + System.currentTimeMillis());
        this.f61502a.a().obtainMessage(R.id.scankit_decode, bArr).sendToTarget();
    }
}
