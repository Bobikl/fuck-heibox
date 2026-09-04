package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.RTCAudioFileFrameObserver;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAudioMixingManagerFunctions {
    public static native void nativeDisableAudioMixingFrame(long j10, int i10);

    public static native void nativeEnableAudioMixingFrame(long j10, int i10, int i11);

    public static native int nativeGetAudioMixingCurrentPosition(long j10, int i10);

    public static native int nativeGetAudioMixingDuration(long j10, int i10);

    public static native int nativeGetAudioMixingPlaybackDuration(long j10, int i10);

    public static native int nativeGetAudioTrackCount(long j10, int i10);

    public static native void nativePauseAllAudioMixing(long j10);

    public static native void nativePauseAudioMixing(long j10, int i10);

    public static native void nativePreloadAudioMixing(long j10, int i10, String str);

    public static native int nativePushAudioMixingFrame(long j10, int i10, byte[] bArr, int i11, int i12, int i13);

    public static native void nativeResumeAllAudioMixing(long j10);

    public static native void nativeResumeAudioMixing(long j10, int i10);

    public static native void nativeSelectAudioTrack(long j10, int i10, int i11);

    public static native void nativeSetAllAudioMixingVolume(long j10, int i10, int i11);

    public static native void nativeSetAudioFileFrameObserver(long j10, long j11, RTCAudioFileFrameObserver rTCAudioFileFrameObserver);

    public static native void nativeSetAudioMixingDualMonoMode(long j10, int i10, int i11);

    public static native void nativeSetAudioMixingLoudness(long j10, int i10, float f10);

    public static native void nativeSetAudioMixingPitch(long j10, int i10, int i11);

    public static native int nativeSetAudioMixingPlaybackSpeed(long j10, int i10, int i11);

    public static native void nativeSetAudioMixingPosition(long j10, int i10, int i11);

    public static native void nativeSetAudioMixingProgressInterval(long j10, int i10, long j11);

    public static native void nativeSetAudioMixingVolume(long j10, int i10, int i11, int i12);

    public static native void nativeStartAudioMixing(long j10, int i10, String str, int i11, int i12, int i13, long j11, boolean z10);

    public static native void nativeStopAllAudioMixing(long j10);

    public static native void nativeStopAudioMixing(long j10, int i10);

    public static native void nativeUnloadAudioMixing(long j10, int i10);
}
