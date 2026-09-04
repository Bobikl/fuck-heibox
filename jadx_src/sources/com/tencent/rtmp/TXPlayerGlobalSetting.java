package com.tencent.rtmp;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.common.VodPlayerControl;
import com.tencent.liteav.txcplayer.common.c;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXPlayerGlobalSetting {
    private static final String TAG = "TXPlayerGlobalSetting";
    private static DrmProvisionEnv sDrmProvisionEnv = DrmProvisionEnv.DRM_PROVISION_ENV_COM;

    public enum DrmProvisionEnv {
        DRM_PROVISION_ENV_COM,
        DRM_PROVISION_ENV_CN
    }

    public static String getCacheFolderPath() {
        return com.tencent.liteav.txcplayer.common.b.a();
    }

    public static DrmProvisionEnv getDrmProvisionEnv() {
        return sDrmProvisionEnv;
    }

    public static int getMaxCacheSize() {
        return Math.max(com.tencent.liteav.txcplayer.common.b.b(), 0);
    }

    public static Object getOptions(int i10) {
        if (i10 == 1000) {
            return c.a(LicenseChecker.a.PLAYER_PROJECTION) ? Boolean.TRUE : Boolean.FALSE;
        }
        return null;
    }

    public static void setCacheFolderPath(String str) {
        LiteavLog.i(TAG, "setCacheFolderPath: ".concat(String.valueOf(str)));
        com.tencent.liteav.txcplayer.common.b.a(str);
        com.tencent.liteav.txcvodplayer.c.a.a().b();
    }

    public static void setDrmProvisionEnv(DrmProvisionEnv drmProvisionEnv) {
        LiteavLog.i(TAG, "setDrmProvisionEnv: ".concat(String.valueOf(drmProvisionEnv)));
        sDrmProvisionEnv = drmProvisionEnv;
    }

    public static void setLicenseFlexibleValid(boolean z10) {
        LiteavLog.i(TAG, "setLicenseFlexibleValid: ".concat(String.valueOf(z10)));
        LiteavLog.i("VodLicenseCheck", "setLicenseFlexibleValid isOpen=".concat(String.valueOf(z10)));
        VodPlayerControl.nativeSetLicenseFlexibleValid(z10);
    }

    public static void setMaxCacheSize(int i10) {
        LiteavLog.i(TAG, "setMaxCacheSize(MB): ".concat(String.valueOf(i10)));
        com.tencent.liteav.txcplayer.common.b.a(i10);
    }

    public static void setPlayCGIHosts(List<String> list) {
        LiteavLog.i(TAG, "setPlayCGIHosts: ".concat(String.valueOf(list)));
        com.tencent.liteav.txcplayer.common.b.a(list);
    }
}
