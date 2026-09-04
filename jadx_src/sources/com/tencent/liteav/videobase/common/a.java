package com.tencent.liteav.videobase.common;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f100305a = new a();

    private a() {
    }

    public static Runnable a() {
        return f100305a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HDRCapability.checkIsHDR10Supported();
    }
}
