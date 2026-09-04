package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAudioDeviceManagerFunctions {
    public static native int nativeStartAudioDeviceRecordTest(long j10, int i10);

    public static native int nativeStartAudioPlaybackDeviceTest(long j10, String str, int i10);

    public static native int nativeStopAudioDevicePlayTest(long j10);

    public static native int nativeStopAudioDeviceRecordAndPlayTest(long j10);

    public static native int nativeStopAudioPlaybackDeviceTest(long j10);
}
