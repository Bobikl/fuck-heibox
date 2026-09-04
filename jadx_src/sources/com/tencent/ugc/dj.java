package com.tencent.ugc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dj implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103507b;

    private dj(UGCImageProvider uGCImageProvider, int i10) {
        this.f103506a = uGCImageProvider;
        this.f103507b = i10;
    }

    public static Callable a(UGCImageProvider uGCImageProvider, int i10) {
        return new dj(uGCImageProvider, i10);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return UGCImageProvider.lambda$setPictureTransition$5(this.f103506a, this.f103507b);
    }
}
