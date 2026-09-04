package com.tencent.thumbplayer.tcmedia.core.config;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;

/* JADX INFO: loaded from: classes4.dex */
public class TPPlayerCoreConfig {
    private static boolean mCoreEventProcessEnable = false;
    private static boolean mMediaDrmReuseEnable = false;
    private static int mVideoMediaCodecCoexistMaxCnt = 0;
    private static String mWidevineProvisioningServerUrl = "";

    private static native void _setMediaDrmReuseEnable(boolean z10);

    private static native void _setWidevineProvisioningServerUrl(String str);

    public static boolean getCoreEventProcessEnable() {
        return mCoreEventProcessEnable;
    }

    public static boolean getMediaDrmReuseEnable() {
        return mMediaDrmReuseEnable;
    }

    public static int getVideoMediaCodecCoexistMaxCnt() {
        return mVideoMediaCodecCoexistMaxCnt;
    }

    public static String getWidevineProvisioningServerUrl() {
        return mWidevineProvisioningServerUrl;
    }

    public static void setCoreEventProcessEnable(boolean z10) {
        mCoreEventProcessEnable = z10;
    }

    public static void setMediaDrmReuseEnable(boolean z10) {
        if (!TPNativeLibraryLoader.isLibLoaded()) {
            TPNativeLog.printLog(3, "setMediaDrmReuseEnable, PlayerCore library has not been loaded");
            return;
        }
        mMediaDrmReuseEnable = z10;
        try {
            _setMediaDrmReuseEnable(z10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.toString());
        }
    }

    public static void setVideoMediaCodecCoexistMaxCnt(int i10) {
        mVideoMediaCodecCoexistMaxCnt = i10;
    }

    public static void setWidevineProvisioningServerUrl(String str) {
        if (!TPNativeLibraryLoader.isLibLoaded()) {
            TPNativeLog.printLog(3, "setWidevineProvisioningServerUrl,PlayerCore library has not been loaded");
            return;
        }
        mWidevineProvisioningServerUrl = str;
        try {
            _setWidevineProvisioningServerUrl(str);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.toString());
        }
    }
}
