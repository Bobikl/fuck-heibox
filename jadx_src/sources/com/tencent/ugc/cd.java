package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass3 f103412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioFrame f103413b;

    private cd(TXVideoEditer.AnonymousClass3 anonymousClass3, AudioFrame audioFrame) {
        this.f103412a = anonymousClass3;
        this.f103413b = audioFrame;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass3 anonymousClass3, AudioFrame audioFrame) {
        return new cd(anonymousClass3, audioFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass3.a(this.f103412a, this.f103413b);
    }
}
