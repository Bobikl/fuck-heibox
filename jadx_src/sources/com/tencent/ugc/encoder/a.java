package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoEncodeParams f103569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UGCVideoEncoderJNI.UGCVideoEncoderListener f103570c;

    private a(UGCVideoEncodeController uGCVideoEncodeController, VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        this.f103568a = uGCVideoEncodeController;
        this.f103569b = videoEncodeParams;
        this.f103570c = uGCVideoEncoderListener;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController, VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        return new a(uGCVideoEncodeController, videoEncodeParams, uGCVideoEncoderListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoEncodeController.lambda$start$0(this.f103568a, this.f103569b, this.f103570c);
    }
}
