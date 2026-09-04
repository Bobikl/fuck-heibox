package com.tencent.qmsp.sdk.u;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.qmsp.sdk.app.QmspSDK;
import com.tencent.qmsp.sdk.app.a;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.e;

/* JADX INFO: loaded from: classes4.dex */
public class U {
    public static final String BEACON_ID_VERSION = "4.1";
    public static final String COMMIT_HASH = "ffa4247e15760071d8d74e2ca7d6df5801c1769c";

    static {
        try {
            System.loadLibrary("qmp");
        } catch (Throwable th2) {
            th2.printStackTrace();
            load_so();
        }
    }

    public static native String a(Context context, int i10, Activity activity, String str);

    public static native String[] c(int i10);

    public static void clearContent(Context context) {
        e.a(context);
    }

    public static void getOAID(IVendorCallback iVendorCallback) {
        new e().a(iVendorCallback);
    }

    public static String getOAIDSync(Context context) {
        return e.a(context, (String) null, 0);
    }

    private static String getP() {
        try {
            return (String) BeaconReport.class.getDeclaredMethod("getSoPath", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static boolean getSDKIsAlive() {
        return QmspSDK.getSDKIsAlive();
    }

    public static void init_o(Context context, boolean z10, boolean z11) {
        e.a(context, z10, z11);
    }

    private static boolean load_so() {
        String p10 = getP();
        try {
            if (TextUtils.isEmpty(p10)) {
                return false;
            }
            System.load(p10);
            return true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static void setUserID(String str) {
        a.setmUid(str);
    }

    public static int startQ(Context context, String str, String str2, String str3, String str4, boolean z10) {
        QmspSDK.setLogcat(z10);
        return QmspSDK.startQmsp(context, str, str2, str3, str4);
    }

    public static void stopQ() {
        QmspSDK.stopQmsp();
    }
}
