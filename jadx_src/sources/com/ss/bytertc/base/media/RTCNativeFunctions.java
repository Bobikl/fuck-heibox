package com.ss.bytertc.base.media;

/* JADX INFO: loaded from: classes10.dex */
public final class RTCNativeFunctions {
    public static native void nativeNotifyChoreographerDoFrame(long j10, Object obj, String str);

    public static native void nativeNotifySurfaceAvailable(long j10, Object obj, String str, boolean z10, boolean z11);

    public static native void nativeNotifySurfaceDestroyed(long j10, Object obj, String str, boolean z10, boolean z11);

    public static native void nativeNotifySurfaceSizeChanged(long j10, String str, boolean z10);

    public static native void nativeNotifyVSyncDoFrame(long j10, String str);
}
