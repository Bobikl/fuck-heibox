package com.efs.sdk.base.samplingwhitelist;

/* JADX INFO: loaded from: classes6.dex */
public class SamplingWhiteListUtil {
    private static boolean sHitWL = false;

    public static boolean isHitWL() {
        return sHitWL;
    }

    public static void setHitWL(boolean z10) {
        sHitWL = z10;
    }
}
