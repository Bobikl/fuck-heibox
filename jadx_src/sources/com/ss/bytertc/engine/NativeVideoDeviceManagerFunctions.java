package com.ss.bytertc.engine;

import com.ss.bytertc.engine.video.VideoDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NativeVideoDeviceManagerFunctions {
    public static native List<VideoDeviceInfo> nativeEnumerateVideoCaptureDevices(long j10);

    public static native int nativeSetVideoCaptureDevice(long j10, String str);
}
