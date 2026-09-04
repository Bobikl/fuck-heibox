package com.tencent.thumbplayer.tcmedia.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f103149a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f103150b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f103151c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseIntArray f103152d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f103152d = sparseIntArray;
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(8, 2);
        sparseIntArray.put(9, 2);
        sparseIntArray.put(10, 2);
        sparseIntArray.put(12, 2);
        sparseIntArray.put(14, 2);
        sparseIntArray.put(15, 2);
        sparseIntArray.put(13, 3);
    }

    public static int a(Context context) {
        int i10 = f103149a;
        if (i10 > 0 && !f103150b) {
            return i10;
        }
        if (context == null) {
            return -1;
        }
        int iG = g(context);
        f103149a = iG;
        return iG;
    }

    private static int a(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? h(context) : b(context, i10);
    }

    private static boolean a() {
        return true;
    }

    private static boolean a(Context context, String str) {
        if (!a()) {
            return true;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return Settings.System.canWrite(context);
        }
        try {
            return context.checkSelfPermission(str) == 0;
        } catch (Exception e10) {
            TPLogUtil.e("TPNetWorkUtils", e10.getMessage());
            return false;
        }
    }

    private static int b(Context context, int i10) {
        if (d(context) == 20) {
            TPLogUtil.i("TPNetWorkUtils", "get5GNetworkTypeIfNeed netWorkType==4");
            return 4;
        }
        Integer numValueOf = Integer.valueOf(f103152d.get(i10));
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf.intValue();
    }

    public static void b(Context context) {
        f103150b = true;
        c(context);
        a(context);
        f103150b = false;
    }

    public static boolean c(Context context) {
        int i10 = f103151c;
        if (i10 != -1 && !f103150b) {
            return i10 == 1;
        }
        if (context != null) {
            try {
                NetworkInfo networkInfoF = f(context);
                f103151c = 0;
                if (networkInfoF != null && networkInfoF.getState() == NetworkInfo.State.CONNECTED) {
                    f103151c = 1;
                }
            } catch (Exception e10) {
                TPLogUtil.e("TPNetWorkUtils", e10.getMessage());
            }
        }
        return f103151c == 1;
    }

    private static int d(Context context) {
        int i10 = 0;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (telephonyManager == null) {
                TPLogUtil.e("TPNetWorkUtils", "get5GNetworkTypeIfNeed TelephonyManager is null");
                return 0;
            }
            if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                TPLogUtil.e("TPNetWorkUtils", "get5GNetworkTypeIfNeed no permission");
                return 0;
            }
            if (Build.VERSION.SDK_INT < 29) {
                TPLogUtil.e("TPNetWorkUtils", "get5GNetworkTypeIfNeed less api 29");
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            try {
                if (networkType != 13) {
                    TPLogUtil.i("TPNetWorkUtils", "get5GNetworkTypeIfNeed not NETWORK_TYPE_LTE");
                    return networkType;
                }
                ServiceState serviceState = telephonyManager.getServiceState();
                if (serviceState == null) {
                    TPLogUtil.e("TPNetWorkUtils", "get5GNetworkTypeIfNeed serviceState is null");
                    return networkType;
                }
                int iIntValue = ((Integer) k.a(serviceState, "android.telephony.ServiceState", "getNrState", new Class[0], new Object[0])).intValue();
                if (iIntValue != 2 && iIntValue != 3) {
                    return networkType;
                }
                i10 = 20;
                TPLogUtil.i("TPNetWorkUtils", "get5GNetworkTypeIfNeed networkType is 20, 5G");
                return i10;
            } catch (Throwable th2) {
                i10 = networkType;
                th = th2;
                TPLogUtil.e("TPNetWorkUtils", th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static ConnectivityManager e(Context context) {
        if (context == null) {
            return null;
        }
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    private static NetworkInfo f(Context context) {
        ConnectivityManager connectivityManagerE = e(context);
        if (connectivityManagerE == null) {
            return null;
        }
        return connectivityManagerE.getActiveNetworkInfo();
    }

    private static int g(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return -1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return type != 1 ? -1 : 0;
            }
            return a(context, activeNetworkInfo.getSubtype());
        } catch (Throwable th2) {
            TPLogUtil.e("TPNetWorkUtils", th2.getMessage());
            return -1;
        }
    }

    private static int h(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            if (a(context, "android.permission.READ_PHONE_STATE")) {
                return b(context, telephonyManager.getDataNetworkType());
            }
            TPLogUtil.e("TPNetWorkUtils", "getNetWorkClassAPI29 fail: no phone permission");
            return -1;
        } catch (Throwable th2) {
            TPLogUtil.e("TPNetWorkUtils", th2.getMessage());
            return -1;
        }
    }
}
