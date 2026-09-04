package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ba implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103322c;

    private ba(TXVideoEditer tXVideoEditer, int i10, String str) {
        this.f103320a = tXVideoEditer;
        this.f103321b = i10;
        this.f103322c = str;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, String str) {
        return new ba(tXVideoEditer, i10, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$generateVideo$54(this.f103320a, this.f103321b, this.f103322c);
    }
}
