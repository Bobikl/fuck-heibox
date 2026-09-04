package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f103677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f103678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bitmap f103679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f103680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f103681f;

    private gw(UGCVideoProcessor uGCVideoProcessor, Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12) {
        this.f103676a = uGCVideoProcessor;
        this.f103677b = bitmap;
        this.f103678c = f10;
        this.f103679d = bitmap2;
        this.f103680e = f11;
        this.f103681f = f12;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, Bitmap bitmap, float f10, Bitmap bitmap2, float f11, float f12) {
        return new gw(uGCVideoProcessor, bitmap, f10, bitmap2, f11, f12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103676a.mVideoProcessManager.setFilter(this.f103677b, this.f103678c, this.f103679d, this.f103680e, this.f103681f);
    }
}
