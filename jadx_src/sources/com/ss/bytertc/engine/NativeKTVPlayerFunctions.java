package com.ss.bytertc.engine;

import com.ss.bytertc.ktv.IKTVPlayerEventHandler;

/* JADX INFO: loaded from: classes4.dex */
public class NativeKTVPlayerFunctions {
    public static native void nativePauseMusic(long j10, String str);

    public static native void nativePlayMusic(long j10, String str, int i10, int i11);

    public static native void nativeReleaseKTVPlayerEventHandler(long j10);

    public static native void nativeResumeMusic(long j10, String str);

    public static native void nativeSeekMusic(long j10, String str, int i10);

    public static native void nativeSetMusicPitch(long j10, String str, int i10);

    public static native void nativeSetMusicVolume(long j10, String str, int i10);

    public static native long nativeSetPlayerEventHandler(long j10, IKTVPlayerEventHandler iKTVPlayerEventHandler);

    public static native void nativeStopMusic(long j10, String str);

    public static native void nativeSwitchAudioTrackType(long j10, String str);
}
