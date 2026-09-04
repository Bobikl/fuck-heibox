package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import com.tencent.trtc.TRTCCloudListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TRTCCloudListener.TRTCSnapshotListener f99895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f99896b;

    private d(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        this.f99895a = tRTCSnapshotListener;
        this.f99896b = bitmap;
    }

    public static Runnable a(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        return new d(tRTCSnapshotListener, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TrtcCloudJni.lambda$onSnapshotComplete$2(this.f99895a, this.f99896b);
    }
}
