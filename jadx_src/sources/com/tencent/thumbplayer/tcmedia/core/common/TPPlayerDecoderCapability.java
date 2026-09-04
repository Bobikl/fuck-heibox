package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import com.google.android.exoplayer2.util.y;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPPlayerDecoderCapability {
    private static String TAG = "TPPlayerDecoderCapability";
    private static boolean mIsLibLoaded;
    private long mNativeContext = 0;

    static {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            mIsLibLoaded = true;
        } catch (UnsupportedOperationException e10) {
            TPNativeLog.printLog(4, e10.getMessage());
            mIsLibLoaded = false;
        }
    }

    private static native boolean _addACodecBlacklist(int i10, int i11, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addACodecWhitelist(int i10, int i11, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addVCodecBlacklist(int i10, int i11, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native boolean _addVCodecWhitelist(int i10, int i11, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> _getDecoderMaxCapabilityMap(int i10);

    private static native boolean _isACodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private static native boolean _isVCodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    public static boolean addACodecBlacklist(int i10, int i11, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("addACodecBlacklist: Failed to load native library.");
        }
        try {
            return _addACodecBlacklist(i10, i11, tPACodecPropertyRange);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _addACodecBlacklist.");
        }
    }

    public static boolean addACodecWhitelist(int i10, int i11, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("addACodecWhitelist: Failed to load native library.");
        }
        try {
            return _addACodecWhitelist(i10, i11, tPACodecPropertyRange);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _addVCodecWhitelist.");
        }
    }

    public static boolean addDRMLevel1Blacklist(int i10) {
        return TPCodecUtils.addDRMLevel1Blacklist(i10);
    }

    public static boolean addHDRBlackList(int i10, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPCodecUtils.addHDRBlackList(i10, TPSystemInfo.getDeviceName(), tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i10, int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPCodecUtils.addHDRVideoDecoderTypeWhiteList(i10, i11, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i10, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPCodecUtils.addHDRWhiteList(i10, TPSystemInfo.getDeviceName(), tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i10, int i11, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("addVCodecBlacklist: Failed to load native library.");
        }
        try {
            return _addVCodecBlacklist(i10, i11, tPVCodecPropertyRange);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _addVCodecBlacklist.");
        }
    }

    public static boolean addVCodecWhitelist(int i10, int i11, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("addVCodecWhitelist :Failed to load native library.");
        }
        try {
            return _addVCodecWhitelist(i10, i11, tPVCodecPropertyRange);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _addVCodecWhitelist.");
        }
    }

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i10) throws TPNativeLibraryException {
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _getDecoderMaxCapabilityMap(i10);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _getDecoderMaxCapabilityMap.");
        }
    }

    public static synchronized void init(Context context, boolean z10) {
        TPCodecUtils.init(context, z10);
    }

    public static boolean isACodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15, int i16) throws TPNativeLibraryException {
        String str;
        if (2 == i10) {
            if (i11 == 5012) {
                str = y.Z;
            } else if (i11 != 5040) {
                switch (i11) {
                    case 5002:
                        str = "audio/aac";
                        break;
                    case 5003:
                        str = y.L;
                        break;
                    case 5004:
                        str = "audio/dts";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = y.M;
            }
            if (TPCodecUtils.isInMediaCodecWhiteList(str)) {
                return true;
            }
            if (TPCodecUtils.isAMediaCodecBlackListModel() || TPCodecUtils.isBlackListType(str)) {
                return false;
            }
        }
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _isACodecCapabilitySupport(i10, i11, i12, i13, i14, i15, i16);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _isACodecCapabilitySupport.");
        }
    }

    public static boolean isDDPlusSupported() {
        return TPCodecUtils.isMediaCodecDDPlusSupported();
    }

    public static boolean isDolbyDSSupported() {
        return TPCodecUtils.isMediaCodecDolbyDSSupported();
    }

    public static boolean isHDRsupport(int i10, int i11, int i12) {
        return TPCodecUtils.isHDRsupport(i10, i11, i12);
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isVCodecCapabilitySupport(int i10, int i11, int i12, int i13, int i14, int i15, int i16) throws TPNativeLibraryException {
        String str;
        if (102 == i10) {
            if (i11 == 26) {
                str = "video/avc";
            } else if (i11 == 138) {
                str = "video/x-vnd.on2.vp8";
            } else if (i11 == 166) {
                str = "video/x-vnd.on2.vp9";
            } else if (i11 != 172) {
                str = i11 != 1029 ? "" : "video/av01";
            } else {
                str = "video/hevc";
            }
            if (TPCodecUtils.isInMediaCodecWhiteList(str)) {
                return true;
            }
            if (TPCodecUtils.isVMediaCodecBlackListModel() || TPCodecUtils.isBlackListType(str)) {
                return false;
            }
        }
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _isVCodecCapabilitySupport(i10, i11, i12, i13, i14, i15, i16);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _isVCodecCapabilitySupport.");
        }
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z10) {
        TPCodecUtils.setMediaCodecPreferredSoftwareComponent(z10);
    }
}
