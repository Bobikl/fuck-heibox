package com.ss.bytertc.engine;

import com.ss.bytertc.ktv.IKTVManagerEventHandler;

/* JADX INFO: loaded from: classes4.dex */
public class NativeKTVManagerFunctions {
    public static native void nativeCancelDownload(long j10, int i10);

    public static native void nativeClearCache(long j10);

    public static native int nativeDownloadLyric(long j10, String str, int i10);

    public static native int nativeDownloadMidi(long j10, String str);

    public static native int nativeDownloadMusic(long j10, String str);

    public static native void nativeGetHotMusic(long j10, int i10, int i11);

    public static native long nativeGetKTVPlayer(long j10);

    public static native void nativeGetMusicDetail(long j10, String str);

    public static native void nativeGetMusicList(long j10, int i10, int i11, int i12);

    public static native void nativeReleaseKTVManagerEventHandler(long j10);

    public static native void nativeSearchMusic(long j10, String str, int i10, int i11, int i12);

    public static native long nativeSetKTVManagerEventHandler(long j10, IKTVManagerEventHandler iKTVManagerEventHandler);

    public static native void nativeSetMaxCacheSize(long j10, int i10);
}
