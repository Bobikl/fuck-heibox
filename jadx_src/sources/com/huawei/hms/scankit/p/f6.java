package com.huawei.hms.scankit.p;

import android.hardware.Camera;

/* JADX INFO: compiled from: PreviewCallbackProxy.java */
/* JADX INFO: loaded from: classes7.dex */
public class f6 implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j0.e f61809a;

    public f6(j0.e eVar) {
        this.f61809a = eVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f61809a.a(bArr);
    }
}
