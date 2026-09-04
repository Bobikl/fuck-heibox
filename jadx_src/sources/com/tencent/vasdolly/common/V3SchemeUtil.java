package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class V3SchemeUtil {
    public static final int APK_SIGNATURE_SCHEME_V3_BLOCK_ID = -262969152;

    public static boolean containV3Signature(File file) {
        try {
            return V2SchemeUtil.getAllIdValue(V2SchemeUtil.getApkSigningBlock(file)).containsKey(Integer.valueOf(APK_SIGNATURE_SCHEME_V3_BLOCK_ID));
        } catch (SignatureNotFoundException unused) {
            System.out.println("APK : " + file.getAbsolutePath() + " not have apk v3 signature block");
            return false;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
