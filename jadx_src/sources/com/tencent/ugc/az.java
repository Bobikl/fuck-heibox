package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class az implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103318b;

    private az(TXVideoEditer tXVideoEditer, int i10) {
        this.f103317a = tXVideoEditer;
        this.f103318b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new az(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setAudioBitrate$53(this.f103317a, this.f103318b);
    }
}
