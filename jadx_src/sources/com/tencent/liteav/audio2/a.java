package com.tencent.liteav.audio2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidInterruptedStateListener f99531a;

    private a(AndroidInterruptedStateListener androidInterruptedStateListener) {
        this.f99531a = androidInterruptedStateListener;
    }

    public static Runnable a(AndroidInterruptedStateListener androidInterruptedStateListener) {
        return new a(androidInterruptedStateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidInterruptedStateListener.lambda$registerAudioRecordingCallback$0(this.f99531a);
    }
}
