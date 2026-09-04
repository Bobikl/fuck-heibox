package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import g0.a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class l11l1111I1l {
    private Object l1111l111111Il;
    private Context l111l11111lIl;

    public l11l1111I1l() {
        this.l1111l111111Il = null;
        this.l111l11111lIl = null;
        try {
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context != null) {
                this.l111l11111lIl = context;
                this.l1111l111111Il = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context, "getSystemService", new Class[]{String.class}, new Object[]{a.f118921e});
            }
        } catch (Exception unused) {
        }
    }

    private Object l1111l111111Il(String str) {
        try {
            Context context = this.l111l11111lIl;
            if (context != null) {
                return com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context.getApplicationContext(), "getSystemService", new Class[]{String.class}, new Object[]{str});
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private String l111l11111Il() {
        Object obj;
        String str;
        try {
            return (!com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l11111lIl("android.permission.READ_PHONE_STATE") || (obj = this.l1111l111111Il) == null || (str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getDeviceId")) == null) ? "" : str;
        } catch (SecurityException | Exception unused) {
            return "";
        }
    }

    private String l111l1111l1Il() {
        Object obj;
        String str;
        try {
            return (!com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l111l11111lIl("android.permission.READ_PHONE_STATE") || (obj = this.l1111l111111Il) == null || (str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getSubscriberId")) == null) ? "" : str;
        } catch (SecurityException | Exception unused) {
            return "";
        }
    }

    private static int l111l1111llIl() {
        try {
            try {
                Class.forName("android.telephony.MSimTelephonyManager");
                return 1;
            } catch (Exception unused) {
                Class.forName("android.telephony.TelephonyManager2");
                return 2;
            }
        } catch (SecurityException unused2) {
            return -1001;
        } catch (Exception unused3) {
            return 0;
        }
    }

    public final String l1111l111111Il() {
        try {
            Object obj = this.l1111l111111Il;
            if (obj == null) {
                return "";
            }
            String str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getSimOperator");
            if (str != null) {
                try {
                    if (str.isEmpty()) {
                    }
                } catch (Exception unused) {
                }
                return str;
            }
            String str2 = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(this.l1111l111111Il, "getNetworkOperatorName");
            return str2 == null ? "" : str2;
        } catch (Exception unused2) {
            return "";
        }
    }

    public final String l111l11111I1l() {
        try {
            Object objL1111l111111Il = l1111l111111Il(a.f118921e);
            Method declaredMethod = objL1111l111111Il.getClass().getDeclaredMethod("getNetworkCountryIso", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(objL1111l111111Il, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l111l11111lIl() {
        try {
            Object objL1111l111111Il = l1111l111111Il(a.f118921e);
            Method declaredMethod = objL1111l111111Il.getClass().getDeclaredMethod("getSimCountryIso", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(objL1111l111111Il, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }
}
