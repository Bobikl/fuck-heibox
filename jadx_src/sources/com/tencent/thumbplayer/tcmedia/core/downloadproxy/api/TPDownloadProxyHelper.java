package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadProxyHelper {
    private static final String FILE_NAME = "TPDownloadProxyHelper";
    private static Context applicationContext;
    private static ITPOfflineVinfoAdapter offlineVinfoAdapter;

    public static String checkVideoStatus(String str, String str2) {
        ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter;
        return (TPDownloadProxyFactory.canUseService() && (iTPOfflineVinfoAdapter = offlineVinfoAdapter) != null) ? iTPOfflineVinfoAdapter.checkVideoStatus(str, str2) : "";
    }

    public static Context getContext() {
        return applicationContext;
    }

    public static String getHLSOfflineExttag(String str, String str2, int i10, long j10) {
        try {
            return TPDownloadProxyNative.getInstance().isNativeLoaded() ? TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getHLSOfflineExttag(str, str2, i10, j10)) : "";
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "get exttag failed, error:" + th2.toString());
            return "";
        }
    }

    public static String getNativeInfo(int i10) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getNativeInfo(i10));
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th2.toString());
            return null;
        }
    }

    public static String getNativeLibVersion() {
        return TPDownloadProxyFactory.getNativeVersion();
    }

    public static int getRecordDuration(String str, String str2) {
        ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter = offlineVinfoAdapter;
        if (iTPOfflineVinfoAdapter != null) {
            return iTPOfflineVinfoAdapter.getRecordDuration(str, str2);
        }
        return -1;
    }

    public static boolean isReadyForPlay() {
        return TPDownloadProxyFactory.isReadyForPlay();
    }

    public static void setContext(Context context) {
        applicationContext = context;
    }

    public static void setNativeLibLoader(ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
        TPDownloadProxyNative.getInstance().setLibLoader(iTPDLProxyNativeLibLoader);
    }

    public static void setTPOfflineVinfoAdapter(ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter) {
        offlineVinfoAdapter = iTPOfflineVinfoAdapter;
    }

    public static void setTPProxyAdapter(ITPProxyAdapter iTPProxyAdapter) {
    }

    public static void setUseService(boolean z10) {
        TPDownloadProxyFactory.setUseService(z10);
    }

    public static void setUserData(String str, Object obj) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
            } catch (Throwable th2) {
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th2.toString());
            }
        }
    }

    public static long verifyOfflineCacheSync(String str, int i10, String str2, String str3) {
        try {
            if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
                return TPDownloadProxyNative.getInstance().verifyOfflineCacheSync(str, i10, str2, str3);
            }
            return -1L;
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "verify offline cache failed, error:" + th2.toString());
            return -1L;
        }
    }
}
