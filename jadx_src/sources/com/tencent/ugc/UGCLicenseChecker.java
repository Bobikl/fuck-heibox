package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCLicenseChecker {
    public static String getLicenseAppId() {
        return LicenseChecker.getInstance().getAppId();
    }

    public static boolean isEnterpriseFunctionSupport() {
        return isFunctionSupport(LicenseChecker.a.PITU_SIMPLE);
    }

    public static boolean isEnterpriseProFunctionSupport() {
        return isFunctionSupport(LicenseChecker.a.PITU);
    }

    private static boolean isFunctionSupport(LicenseChecker.a aVar) {
        if (LicenseChecker.getInstance().valid(aVar) == LicenseChecker.d.OK) {
            LiteavLog.i("UGCLicenseChecker", "isFunctionSupport true functionType = " + aVar.value);
            return true;
        }
        LiteavLog.e("UGCLicenseChecker", "isFunctionSupport false functionType = " + aVar.value);
        return false;
    }

    public static boolean isIMPluginFunctionSupport() {
        return nativeIsIMPluginFunctionSupport();
    }

    public static boolean isSimpleFunctionSupport() {
        return isFunctionSupport(LicenseChecker.a.UGC_SIMPLE);
    }

    public static boolean isStandardFunctionSupport() {
        return isFunctionSupport(LicenseChecker.a.UGC_STANDARD);
    }

    private static native boolean nativeIsIMPluginFunctionSupport();
}
