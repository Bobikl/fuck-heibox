package com.ss.bytertc.base.media;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes10.dex */
public final class RXNativeFunctions {
    public static native void nativeOnCapturerError(long j10, int i10);

    public static native void nativeOnCapturerFormatSelected(long j10, int i10, int i11, int i12, int i13, int i14);

    public static native void nativeOnCapturerStarted(long j10, boolean z10);

    public static native void nativeOnCapturerStopped(long j10);

    public static native void nativeOnFrameCaptured(long j10, VideoFrame videoFrame);
}
