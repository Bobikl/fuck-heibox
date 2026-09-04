package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.RTCAudioEffectPlayerEventHandler;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAudioEffectPlayerFunctions {
    public static native int nativeGetDuration(long j10, int i10);

    public static native int nativeGetPosition(long j10, int i10);

    public static native int nativeGetVolume(long j10, int i10);

    public static native int nativePause(long j10, int i10);

    public static native int nativePauseAll(long j10);

    public static native int nativePreload(long j10, int i10, String str);

    public static native int nativeResume(long j10, int i10);

    public static native int nativeResumeAll(long j10);

    public static native int nativeSetEventHandler(long j10, long j11, RTCAudioEffectPlayerEventHandler rTCAudioEffectPlayerEventHandler);

    public static native int nativeSetPosition(long j10, int i10, int i11);

    public static native int nativeSetVolume(long j10, int i10, int i11);

    public static native int nativeSetVolumeAll(long j10, int i10);

    public static native int nativeStart(long j10, int i10, String str, int i11, int i12, int i13, int i14);

    public static native int nativeStop(long j10, int i10);

    public static native int nativeStopAll(long j10);

    public static native int nativeUnload(long j10, int i10);

    public static native int nativeUnloadAll(long j10);
}
