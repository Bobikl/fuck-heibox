package com.heytap.openid.sdk;

import android.app.Activity;
import android.content.Context;
import com.heytap.openid.bean.OpenIDInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class OpenIDSDK {
    public static native int checkSelfOAIDPermission(Context context);

    @Deprecated
    public static void clear(Context context) {
    }

    @Deprecated
    public static String getAAID(Context context) {
        m_h.m_a("2005");
        return m_g.m_a(2, "AUID");
    }

    public static native Context getApplicationContext(Context context);

    public static OpenIDInfo getIds(Context context, int i10) {
        m_h.m_a("2021");
        HashMap<String, String> mapM_a = m_d.m_a(i10);
        return new OpenIDInfo(mapM_a.get("OUID") == null ? "" : mapM_a.get("OUID"), "TRUE".equalsIgnoreCase(mapM_a.get("OUID_STATUS") == null ? "FALSE" : mapM_a.get("OUID_STATUS")), mapM_a.get("DUID") != null ? mapM_a.get("DUID") : "", mapM_a.get("AUID") == null ? "" : mapM_a.get("AUID"));
    }

    @Deprecated
    public static String getOAID(Context context) {
        m_h.m_a("2003");
        return m_g.m_a(8, "OUID");
    }

    @Deprecated
    public static boolean getOAIDStatus(Context context) {
        m_h.m_a("2002");
        HashMap<String, String> mapM_a = m_d.m_a(32);
        return "TRUE".equalsIgnoreCase(mapM_a.get("OUID_STATUS") == null ? "FALSE" : mapM_a.get("OUID_STATUS"));
    }

    @Deprecated
    public static String getUDID(Context context) {
        m_h.m_a("2001");
        return m_g.m_a(16, "GUID");
    }

    @Deprecated
    public static String getVAID(Context context) {
        m_h.m_a("2004");
        return m_g.m_a(4, "DUID");
    }

    public static native void init(Context context);

    public static native boolean isSupported();

    public static native void requestOAIDPermission(Activity activity, int i10);

    public static native void setLoggable(boolean z10);
}
