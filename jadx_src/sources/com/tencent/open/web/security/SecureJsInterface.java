package com.tencent.open.web.security;

import com.tencent.open.log.SLog;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class SecureJsInterface extends com.tencent.open.b.C0975b {
    public static boolean isPWDEdit = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f101203a;

    public void clearAllEdit() {
        SLog.i("openSDK_LOG.SecureJsInterface", "-->clear all edit.");
        try {
            JniInterface.clearAllPWD();
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->clear all edit exception: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }

    public void curPosFromJS(String str) {
        int i10;
        SLog.d("openSDK_LOG.SecureJsInterface", "-->curPosFromJS: " + str);
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->curPosFromJS number format exception.", e10);
            i10 = -1;
        }
        if (i10 < 0) {
            throw new RuntimeException("position is illegal.");
        }
        boolean z10 = a.f101206c;
        boolean z11 = a.f101205b;
        if (z11) {
            if (Boolean.valueOf(JniInterface.BackSpaceChar(z11, i10)).booleanValue()) {
                a.f101205b = false;
                return;
            }
            return;
        }
        String str2 = a.f101204a;
        this.f101203a = str2;
        JniInterface.insetTextToArray(i10, str2, str2.length());
        SLog.v("openSDK_LOG.SecureJsInterface", "curPosFromJS mKey: " + this.f101203a);
    }

    @Override // com.tencent.open.b.C0975b
    public boolean customCallback() {
        return true;
    }

    public String getMD5FromNative() {
        SLog.i("openSDK_LOG.SecureJsInterface", "-->get md5 form native");
        try {
            String pWDKeyToMD5 = JniInterface.getPWDKeyToMD5(null);
            SLog.v("openSDK_LOG.SecureJsInterface", "-->getMD5FromNative, MD5= " + pWDKeyToMD5);
            return pWDKeyToMD5;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->get md5 form native exception: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }

    public void isPasswordEdit(String str) {
        int i10;
        SLog.i("openSDK_LOG.SecureJsInterface", "-->is pswd edit, flag: " + str);
        try {
            i10 = Integer.parseInt(str);
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.SecureJsInterface", "-->is pswd edit exception: " + e10.getMessage());
            i10 = -1;
        }
        if (i10 != 0 && i10 != 1) {
            throw new RuntimeException("is pswd edit flag is illegal.");
        }
        if (i10 == 0) {
            isPWDEdit = false;
        } else if (i10 == 1) {
            isPWDEdit = true;
        }
    }
}
