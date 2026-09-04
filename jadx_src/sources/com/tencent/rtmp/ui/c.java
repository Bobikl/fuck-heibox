package com.tencent.rtmp.ui;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCloudVideoView f102118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102122e;

    private c(TXCloudVideoView tXCloudVideoView, int i10, int i11, int i12, int i13) {
        this.f102118a = tXCloudVideoView;
        this.f102119b = i10;
        this.f102120c = i11;
        this.f102121d = i12;
        this.f102122e = i13;
    }

    public static Runnable a(TXCloudVideoView tXCloudVideoView, int i10, int i11, int i12, int i13) {
        return new c(tXCloudVideoView, i10, i11, i12, i13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f102118a.showFocusViewInternal(this.f102119b, this.f102120c, this.f102121d, this.f102122e);
    }
}
