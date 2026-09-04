package com.tencent.ugc.beauty.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoFrameReader f103332a;

    private a(VideoFrameReader videoFrameReader) {
        this.f103332a = videoFrameReader;
    }

    public static Runnable a(VideoFrameReader videoFrameReader) {
        return new a(videoFrameReader);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103332a.threadLoop();
    }
}
