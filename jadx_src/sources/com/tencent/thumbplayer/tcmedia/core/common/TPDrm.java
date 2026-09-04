package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes4.dex */
public final class TPDrm {
    private static final String TAG = "TPDrm";
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

    public static int[] getDRMCapabilities() throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("Failed to load native library.");
        }
        try {
            int[] iArrNative_getDRMCapabilities = native_getDRMCapabilities();
            return iArrNative_getDRMCapabilities == null ? new int[0] : iArrNative_getDRMCapabilities;
        } catch (Throwable unused) {
            throw new TPNativeLibraryException("Failed to call native func.");
        }
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    static native int[] native_getDRMCapabilities();
}
