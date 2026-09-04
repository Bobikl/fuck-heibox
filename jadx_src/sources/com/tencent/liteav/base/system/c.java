package com.tencent.liteav.base.system;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f99668a = new c();

    private c() {
    }

    public static Runnable a() {
        return f99668a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LiteavSystemInfo.lambda$getAppMemoryUsageFromSystem$9();
    }
}
