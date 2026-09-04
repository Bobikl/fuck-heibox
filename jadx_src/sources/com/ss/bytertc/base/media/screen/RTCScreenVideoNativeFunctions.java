package com.ss.bytertc.base.media.screen;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes10.dex */
public final class RTCScreenVideoNativeFunctions {
    public static native void nativeOnCapturerError(long j10, int i10, String str);

    public static native void nativeOnCapturerSetType(long j10, int i10);

    public static native void nativeOnCapturerStarted(long j10);

    public static native void nativeOnCapturerStopped(long j10);

    public static native void nativeOnFrameCaptured(long j10, VideoFrame videoFrame);
}
