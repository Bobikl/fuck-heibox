package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class er implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoJoiner.DurationControlMode f103583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask f103584c;

    private er(UGCMediaListSource uGCMediaListSource, TXVideoJoiner.DurationControlMode durationControlMode, FutureTask futureTask) {
        this.f103582a = uGCMediaListSource;
        this.f103583b = durationControlMode;
        this.f103584c = futureTask;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, TXVideoJoiner.DurationControlMode durationControlMode, FutureTask futureTask) {
        return new er(uGCMediaListSource, durationControlMode, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setDurationControlMode$3(this.f103582a, this.f103583b, this.f103584c);
    }
}
