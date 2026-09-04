package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CommFun.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f61243a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f61244b = -1;

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("huawei.cust.HwCfgFilePolicy");
            File file = (File) cls.getDeclaredMethod("getCfgFile", String.class, Integer.TYPE).invoke(cls, "jars/hwpush.jar", Integer.valueOf(((Integer) cls.getDeclaredField("CUST_TYPE_CONFIG").get(cls)).intValue()));
            if (file != null && file.exists()) {
                HMSLog.d("CommFun", "get push cust File path success.");
                return true;
            }
        } catch (ClassNotFoundException unused) {
            HMSLog.e("CommFun", "HwCfgFilePolicy ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HMSLog.e("CommFun", "check cust exist push IllegalAccessException.");
        } catch (IllegalArgumentException unused3) {
            HMSLog.e("CommFun", "check cust exist push IllegalArgumentException.");
        } catch (NoSuchFieldException unused4) {
            HMSLog.e("CommFun", "check cust exist push NoSuchFieldException.");
        } catch (NoSuchMethodException unused5) {
            HMSLog.e("CommFun", "check cust exist push NoSuchMethodException.");
        } catch (SecurityException unused6) {
            HMSLog.e("CommFun", "check cust exist push SecurityException.");
        } catch (InvocationTargetException unused7) {
            HMSLog.e("CommFun", "check cust exist push InvocationTargetException.");
        }
        return false;
    }

    private static boolean a(Context context) {
        HMSLog.d("CommFun", "existFrameworkPush:" + f61244b);
        try {
            File file = new File("/system/framework/hwpush.jar");
            if (!a() && !file.isFile()) {
                return false;
            }
            HMSLog.d("CommFun", "push jarFile is exist");
            return true;
        } catch (Exception e10) {
            HMSLog.e("CommFun", "get Apk version faild ,Exception e= " + e10.toString());
            return false;
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        return jSONObject == null || (TextUtils.isEmpty(str) && jSONObject2 == null);
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean b() {
        return HwBuildEx.VERSION.EMUI_SDK_INT >= 21;
    }

    public static String c(Context context) {
        return AGConnectServicesConfig.fromContext(context).getString(AgConnectInfo.AgConnectKey.PROJECT_ID);
    }

    public static boolean c() {
        return HwBuildEx.VERSION.EMUI_SDK_INT < 19;
    }

    public static boolean d(Context context) {
        HMSLog.d("CommFun", "existFrameworkPush:" + f61244b);
        synchronized (f61243a) {
            int i10 = f61244b;
            if (-1 != i10) {
                return 1 == i10;
            }
            if (a(context)) {
                f61244b = 1;
            } else {
                f61244b = 0;
            }
            return 1 == f61244b;
        }
    }
}
