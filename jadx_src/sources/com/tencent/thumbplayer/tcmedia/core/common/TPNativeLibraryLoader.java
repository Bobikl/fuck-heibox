package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativeLibraryLoader {
    private static final String DEFAULT_LIB_PLAYER_CORE_VERSION = "2.32.0.448.min";
    private static final String MAIN_PLAYER_CORE_VERSION = "2.32.0";
    private static boolean mIsLibLoaded = false;
    private static Object mIsLibLoadedLock = new Object();
    private static final boolean mIsNeedLoadThirdPartiesAndFFmpeg = true;
    private static final String mLibIjkPrefix = "ijkhlscache-master";
    private static ITPNativeLibraryExternalLoader mLibLoader = null;
    private static final boolean mLibNameHasArchSuffix = false;
    private static final String mLibPlayerCorePrefix = "tpcore-master";
    private static final String mLibThirdPartiesPrefix = "tpthirdparties-master";
    private static final int mPlayerCoreSupportMinAndroidAPILevel = 14;

    private static native String _getPlayerCoreVersion();

    public static String getLibVersion() {
        return getPlayerCoreVersion();
    }

    public static String getPlayerCoreVersion() {
        try {
            return _getPlayerCoreVersion();
        } catch (Throwable unused) {
            TPNativeLog.printLog(2, "getPlayerCoreVersion: *.so is not loaded yet, return the hard-coded version number:2.32.0.448.min");
            return DEFAULT_LIB_PLAYER_CORE_VERSION;
        }
    }

    public static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isLibLoadedAndTryToLoad() {
        boolean z10;
        try {
            loadLibIfNeeded(null);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "TPNativeLibraryLoader isLibLoaded error:" + th2.getMessage());
        }
        synchronized (mIsLibLoadedLock) {
            z10 = mIsLibLoaded;
        }
        return z10;
    }

    private static boolean isMatchJavaAndPlayerCore(String str, String str2) {
        TPNativeLog.printLog(2, "javaVersion:" + str + ", coreVersion:" + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
            return false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (!strArrSplit[i10].matches(strArrSplit2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean loadLib(Context context) {
        String strConcat;
        TPNativeLog.printLog(2, "loadLib cpu arch:" + TPSystemInfo.getCpuArchitecture());
        int i10 = 3;
        boolean zLoadLib = false;
        if (TPSystemInfo.getApiLevel() >= 14) {
            if (TPSystemInfo.getCpuArchitecture() != 3) {
                i10 = 4;
                if (TPSystemInfo.getCpuArchitecture() != 4 && TPSystemInfo.getCpuArchitecture() != 0) {
                    String strConcat2 = mLibThirdPartiesPrefix.concat("");
                    ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader = mLibLoader;
                    if (iTPNativeLibraryExternalLoader != null ? iTPNativeLibraryExternalLoader.loadLib(strConcat2, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(strConcat2, context)) {
                        String strConcat3 = mLibPlayerCorePrefix.concat("");
                        ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader2 = mLibLoader;
                        zLoadLib = iTPNativeLibraryExternalLoader2 != null ? iTPNativeLibraryExternalLoader2.loadLib(strConcat3, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(strConcat3, context);
                        if (zLoadLib) {
                            String playerCoreVersion = getPlayerCoreVersion();
                            boolean zIsMatchJavaAndPlayerCore = isMatchJavaAndPlayerCore(MAIN_PLAYER_CORE_VERSION, playerCoreVersion);
                            if (!zIsMatchJavaAndPlayerCore) {
                                TPNativeLog.printLog(4, "nativePlayerCoreVer(" + playerCoreVersion + ") doesn't match javaPlayerCoreVer:(2.32.0)");
                            }
                            zLoadLib = zIsMatchJavaAndPlayerCore;
                        }
                        String strConcat4 = mLibIjkPrefix.concat("");
                        ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader3 = mLibLoader;
                        if (iTPNativeLibraryExternalLoader3 != null) {
                            iTPNativeLibraryExternalLoader3.loadLib(strConcat4, DEFAULT_LIB_PLAYER_CORE_VERSION);
                        } else {
                            loadLibDefault(strConcat4, context);
                        }
                        if (zLoadLib) {
                            TPNativeLog.printLog(2, "Native libs loaded successfully");
                        } else {
                            TPNativeLog.printLog(4, "Failed to load native libs");
                        }
                    } else {
                        strConcat = "Failed to load ".concat(String.valueOf(strConcat2));
                    }
                }
            }
            return zLoadLib;
        }
        strConcat = "so load failed, current api level " + TPSystemInfo.getApiLevel() + " is less than 14";
        TPNativeLog.printLog(i10, strConcat);
        return false;
    }

    private static boolean loadLibDefault(String str, Context context) {
        boolean zLoad = false;
        try {
            TPNativeLog.printLog(2, "loadLibDefault loading ".concat(String.valueOf(str)));
            System.loadLibrary(str);
            zLoad = true;
            TPNativeLog.printLog(2, "loadLibDefault " + str + " loaded successfully");
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "loadLibDefault failed to load " + str + Constants.ACCEPT_TIME_SEPARATOR_SP + th2.getMessage());
        }
        if (!zLoad && context != null && TPSystemInfo.getCpuArchitecture() >= 6) {
            try {
                TPNativeLog.printLog(2, "loadLibDefault try to load " + str + " from APK");
                zLoad = TPLoadLibFromApk.load(str, TPNativeLibraryLoader.class.getClassLoader(), context);
                if (zLoad) {
                    TPNativeLog.printLog(2, "loadLibDefault loaded " + str + " from APK successfully");
                } else {
                    TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed");
                }
            } catch (Throwable th3) {
                TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed," + th3.getMessage());
            }
        }
        return zLoad;
    }

    public static void loadLibIfNeeded(Context context) {
        synchronized (mIsLibLoadedLock) {
            if (!mIsLibLoaded) {
                boolean zLoadLib = loadLib(context);
                mIsLibLoaded = zLoadLib;
                TPNativeLog.printLog(2, zLoadLib ? "TPNativeLibraryLoader load lib successfully" : "TPNativeLibraryLoader load lib failed");
            }
            if (!mIsLibLoaded) {
                throw new UnsupportedOperationException("Failed to load native library");
            }
        }
    }

    public static void setLibLoader(ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader) {
        mLibLoader = iTPNativeLibraryExternalLoader;
    }
}
