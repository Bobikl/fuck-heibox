package com.ss.bytertc.engine;

import android.content.Context;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public class NativeRTCVideoFunctionsEx {
    public static native long nativeCreateRTCVideoEx(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2);

    public static native void nativeDestroyRTCVideoEx(long j10);

    public static native int nativePushExternalVideoFrame(long j10, int i10, VideoFrame videoFrame);

    public static native int nativeSetAudioContentType(long j10, int i10, boolean z10, boolean z11, boolean z12);

    public static native int nativeSetAudioEncodeConfig(long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    public static native int nativeSetAudioSourceVolume(long j10, int i10, int i11);

    public static native int nativeSetCaptureVolume(long j10, int i10);

    public static native int nativeSetLocalStreamPriority(long j10, int i10, int i11);

    public static native int nativeSetRemoteAudioPlaybackVolume(long j10, String str, String str2, int i10, int i11);

    public static native int nativeSetScreenCaptureVolume(long j10, int i10);

    public static native int nativeSetVideoCaptureConfig(long j10, int i10, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native int nativeSetVideoSource(long j10, int i10, int i11, int i12);

    public static native int nativeStartVideoCapture(long j10, int i10, String str);

    public static native int nativeStopVideoCapture(long j10, int i10);
}
