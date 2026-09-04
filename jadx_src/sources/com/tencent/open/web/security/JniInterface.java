package com.tencent.open.web.security;

import android.content.Context;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import java.io.File;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class JniInterface {
    public static boolean isJniOk = false;

    public static native boolean BackSpaceChar(boolean z10, int i10);

    public static native boolean clearAllPWD();

    public static native String d1(String str);

    public static native String d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i10, String str, int i11);

    public static void loadSo() {
        if (isJniOk) {
            return;
        }
        try {
            Context contextA = g.a();
            if (contextA != null) {
                if (new File(contextA.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                    System.load(contextA.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
                    isJniOk = true;
                    SLog.i("openSDK_LOG.JniInterface", "-->load lib success:" + AuthAgent.SECURE_LIB_NAME);
                } else {
                    SLog.i("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + AuthAgent.SECURE_LIB_NAME);
                }
            } else {
                SLog.i("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + AuthAgent.SECURE_LIB_NAME);
            }
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.JniInterface", "-->load lib error:" + AuthAgent.SECURE_LIB_NAME, th2);
        }
    }
}
