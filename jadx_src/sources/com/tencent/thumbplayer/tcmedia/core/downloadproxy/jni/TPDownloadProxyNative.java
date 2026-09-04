package com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyNativeLibLoader;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadProxyNative {
    private static final String FILE_NAME = "TPDownloadProxyNative";
    private static Context appContext = null;
    private static boolean isLoadDownloadProxySucceed = false;
    private ITPDLProxyNativeLibLoader mLibLoader;

    public static class SingletonHolder {
        private static final TPDownloadProxyNative INSTANCE = new TPDownloadProxyNative();

        private SingletonHolder() {
        }
    }

    private TPDownloadProxyNative() {
    }

    public static TPDownloadProxyNative getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static int nativeIntMessageCallback(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return TPListenerManager.getInstance().handleIntCallbackMessage(i10, i11, obj, obj2, obj3, obj4, obj5);
    }

    private static void nativeLogCallback(int i10, byte[] bArr, int i11, byte[] bArr2, byte[] bArr3) {
        if (i10 == 6) {
            TPDLProxyLog.e(TPDLProxyUtils.byteArrayToString(bArr), i11, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
            return;
        }
        if (i10 == 5) {
            TPDLProxyLog.w(TPDLProxyUtils.byteArrayToString(bArr), i11, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        } else if (i10 == 4 || i10 != 3) {
            TPDLProxyLog.i(TPDLProxyUtils.byteArrayToString(bArr), i11, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        } else {
            TPDLProxyLog.d(TPDLProxyUtils.byteArrayToString(bArr), i11, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        }
    }

    private static void nativeMessageCallback(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TPListenerManager.getInstance().handleCallbackMessage(i10, i11, obj, obj2, obj3, obj4, obj5);
    }

    private static String nativeStringMessageCallback(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return TPListenerManager.getInstance().handleStringCallbackMessage(i10, i11, obj, obj2, obj3, obj4, obj5);
    }

    public native boolean checkResourceExist(String str, String str2, long j10);

    public native int checkResourceStatus(String str, String str2, int i10);

    public native int clearCache(String str, String str2, int i10, long j10);

    public native int createDownloadTask(int i10, String str, int i11, int i12);

    public native int deInitService(int i10);

    public native int deleteCache(String str, String str2, long j10);

    public native int deleteOfflineLicenseKeySetId(String str, String str2, String str3);

    public Context getAppContext() {
        return appContext;
    }

    public native byte[] getClipPlayUrl(int i10, int i11, int i12);

    public native byte[] getErrorCodeStr(int i10);

    public native byte[] getHLSOfflineExttag(String str, String str2, int i10, long j10);

    public native byte[] getNativeInfo(int i10);

    public String getNativeVersion() {
        String strByteArrayToString = isLoadDownloadProxySucceed ? TPDLProxyUtils.byteArrayToString(getVersion()) : "2.32.0.00445";
        TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "get native version:".concat(String.valueOf(strByteArrayToString)));
        return strByteArrayToString;
    }

    public native byte[] getOfflineLicenseKeySetId(String str, String str2, String str3);

    public native TPDLProxyMsg.TPPDTInfo[] getPDTInfos(int i10);

    public native float getResourceDownloadProgress(String str, String str2, long j10);

    public native long getResourceSize(String str, String str2);

    public native byte[] getVersion();

    public native int initService(int i10, String str, String str2, String str3);

    public boolean isNativeLoaded() {
        if (!isLoadDownloadProxySucceed) {
            try {
                ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader = this.mLibLoader;
                if (iTPDLProxyNativeLibLoader != null) {
                    isLoadDownloadProxySucceed = iTPDLProxyNativeLibLoader.loadLib("downloadproxy", getNativeVersion());
                    StringBuilder sb2 = new StringBuilder("third module so load ret:");
                    sb2.append(isLoadDownloadProxySucceed ? "0" : "1");
                    TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, sb2.toString());
                }
            } catch (Throwable th2) {
                isLoadDownloadProxySucceed = false;
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "third module so load failed, error:" + th2.toString());
            }
            try {
                if (!isLoadDownloadProxySucceed) {
                    System.loadLibrary("downloadproxy");
                    isLoadDownloadProxySucceed = true;
                    TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "system so load success!");
                }
            } catch (Throwable th3) {
                isLoadDownloadProxySucceed = false;
                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "system so load failed, error:" + th3.toString());
            }
        }
        if (!isLoadDownloadProxySucceed && getAppContext() != null && TextUtils.equals(getAppContext().getPackageName(), "com.tencent.liteav.demo")) {
            System.exit(0);
        }
        return isLoadDownloadProxySucceed;
    }

    public native boolean isNativeReadyForWork();

    public boolean isReadyForWork() {
        if (isLoadDownloadProxySucceed) {
            return isNativeReadyForWork();
        }
        return false;
    }

    public native int pauseDownload(int i10);

    public native void pushEvent(int i10);

    public native int resumeDownload(int i10);

    public void setAppContext(Context context) {
        if (context != null) {
            appContext = context.getApplicationContext();
        }
    }

    public native int setClipInfo(int i10, int i11, String str, int i12, String str2, String str3, String str4);

    public void setLibLoader(ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
        TPDLProxyLog.i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "set third module so loader!!!");
        this.mLibLoader = iTPDLProxyNativeLibLoader;
    }

    public native int setMaxStorageSizeMB(int i10, long j10);

    public native void setPlayerState(int i10, int i11);

    public native void setUserData(String str, String str2);

    public native int startDownload(int i10);

    public native int stopAllDownload(int i10);

    public native int stopDownload(int i10);

    public native void switchToResolution(int i10, int i11, int i12);

    public native void updatePlayerPlayMsg(int i10, int i11, int i12, int i13);

    public native int updateStoragePath(int i10, String str);

    public native void updateTaskInfo(int i10, String str, String str2);

    public native long verifyOfflineCacheSync(String str, int i10, String str2, String str3);
}
