package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.annotation.z0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TelephonyManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f21095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f21096b;

    /* JADX INFO: compiled from: TelephonyManagerCompat.java */
    @w0(23)
    public static class a {
        private a() {
        }

        @SuppressLint({"MissingPermission"})
        @u
        @z0("android.permission.READ_PHONE_STATE")
        @p0
        static String a(TelephonyManager telephonyManager, int i10) {
            return telephonyManager.getDeviceId(i10);
        }
    }

    /* JADX INFO: compiled from: TelephonyManagerCompat.java */
    @w0(26)
    public static class b {
        private b() {
        }

        @SuppressLint({"MissingPermission"})
        @u
        @z0("android.permission.READ_PHONE_STATE")
        @p0
        static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* JADX INFO: renamed from: androidx.core.telephony.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TelephonyManagerCompat.java */
    @w0(30)
    public static class C0139c {
        private C0139c() {
        }

        @u
        static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private c() {
    }

    @z0("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    @p0
    public static String a(@n0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(telephonyManager);
        }
        int iB = b(telephonyManager);
        return (iB == Integer.MAX_VALUE || iB == -1) ? telephonyManager.getDeviceId() : a.a(telephonyManager, androidx.core.telephony.b.a(iB));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@n0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0139c.a(telephonyManager);
        }
        try {
            if (f21096b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f21096b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f21096b.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
