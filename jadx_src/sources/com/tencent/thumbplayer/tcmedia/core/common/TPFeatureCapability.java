package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes4.dex */
public class TPFeatureCapability {
    private static String TAG = "TPFeatureCapability";
    private static boolean mIsLibLoaded;

    static {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            mIsLibLoaded = true;
        } catch (UnsupportedOperationException e10) {
            TPNativeLog.printLog(4, e10.getMessage());
            mIsLibLoaded = false;
        }
    }

    private static native boolean _isFeatureSupport(int i10);

    public static boolean isFeatureSupport(int i10) throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("isFeatureSupport: Failed to load native library.");
        }
        try {
            return _isFeatureSupport(i10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _isFeatureSupport.");
        }
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }
}
