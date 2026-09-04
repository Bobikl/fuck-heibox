package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoJoiner.DurationControlMode f103327b;

    private bd(TXVideoEditer tXVideoEditer, TXVideoJoiner.DurationControlMode durationControlMode) {
        this.f103326a = tXVideoEditer;
        this.f103327b = durationControlMode;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, TXVideoJoiner.DurationControlMode durationControlMode) {
        return new bd(tXVideoEditer, durationControlMode);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103326a.mMediaListSource.setDurationControlMode(this.f103327b);
    }
}
