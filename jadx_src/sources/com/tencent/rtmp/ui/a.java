package com.tencent.rtmp.ui;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCloudVideoView f102112a;

    private a(TXCloudVideoView tXCloudVideoView) {
        this.f102112a = tXCloudVideoView;
    }

    public static Runnable a(TXCloudVideoView tXCloudVideoView) {
        return new a(tXCloudVideoView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f102112a.hideIndicatorView();
    }
}
