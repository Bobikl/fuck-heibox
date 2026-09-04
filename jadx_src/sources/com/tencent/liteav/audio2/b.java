package com.tencent.liteav.audio2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidInterruptedStateListener f99532a;

    private b(AndroidInterruptedStateListener androidInterruptedStateListener) {
        this.f99532a = androidInterruptedStateListener;
    }

    public static Runnable a(AndroidInterruptedStateListener androidInterruptedStateListener) {
        return new b(androidInterruptedStateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidInterruptedStateListener.lambda$unregisterAudioRecordingCallback$1(this.f99532a);
    }
}
