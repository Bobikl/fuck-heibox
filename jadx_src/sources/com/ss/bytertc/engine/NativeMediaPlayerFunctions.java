package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.RTCMediaPlayerAudioFrameObserver;
import com.ss.bytertc.engine.handler.RTCMediaPlayerCustomSourceProvider;
import com.ss.bytertc.engine.handler.RTCMediaPlayerEventHandler;

/* JADX INFO: loaded from: classes4.dex */
public class NativeMediaPlayerFunctions {
    public static native void nativeDestory(long j10);

    public static native int nativeGetAudioTrackCount(long j10);

    public static native int nativeGetPlaybackDuration(long j10);

    public static native int nativeGetPosition(long j10);

    public static native int nativeGetTotalDuration(long j10);

    public static native int nativeGetVolume(long j10, int i10);

    public static native int nativeOpen(long j10, String str, int i10, int i11, int i12, boolean z10, long j11, boolean z11);

    public static native int nativeOpenWithCustomSource(long j10, int i10, int i11, RTCMediaPlayerCustomSourceProvider rTCMediaPlayerCustomSourceProvider, int i12, int i13, int i14, boolean z10, long j11, boolean z11);

    public static native int nativePause(long j10);

    public static native int nativePushExternalAudioFrame(long j10, byte[] bArr, int i10, int i11, int i12);

    public static native int nativeRegisterAudioFrameObserver(long j10, RTCMediaPlayerAudioFrameObserver rTCMediaPlayerAudioFrameObserver);

    public static native int nativeResume(long j10);

    public static native int nativeSelectAudioTrack(long j10, int i10);

    public static native int nativeSetAudioDualMonoMode(long j10, int i10);

    public static native int nativeSetAudioPitch(long j10, int i10);

    public static native int nativeSetEventHandler(long j10, RTCMediaPlayerEventHandler rTCMediaPlayerEventHandler);

    public static native int nativeSetLoudness(long j10, float f10);

    public static native int nativeSetPlaybackSpeed(long j10, int i10);

    public static native int nativeSetPosition(long j10, int i10);

    public static native int nativeSetProgressInterval(long j10, long j11);

    public static native int nativeSetVolume(long j10, int i10, int i11);

    public static native int nativeStart(long j10);

    public static native int nativeStop(long j10);
}
