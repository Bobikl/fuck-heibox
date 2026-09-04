package com.umeng.umcrash;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.w;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.uc.crashsdk.export.CrashApi;
import g0.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class UMCrashUtils {
    private static final int DEF_CLOSE_RATE = 0;
    private static final int MAX_TRACE_RATE = 100;
    public static final String UNKNOW = "";

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String[] getActiveUser(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.utils.UMUtils");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getActiveUser", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return (String[]) objInvoke;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static int getInnerConfig(Context context, String str, int i10) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            return i10;
        }
        try {
            return (TextUtils.isEmpty(str) || (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) == null) ? i10 : sharedPreferences.getInt(str, i10);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return i10;
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(a.f118921e);
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static boolean isHarmony(final Context context) {
        try {
            final SharedPreferences sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0);
            if (sharedPreferences.contains("um_apm_harmony")) {
                return sharedPreferences.getBoolean("um_apm_harmony", false);
            }
            WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrashUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        sharedPreferences.edit().putBoolean("um_apm_harmony", context.getString(Resources.getSystem().getIdentifier("config_os_brand", w.b.f17895e, "android")).equals("harmony")).apply();
                    } catch (Throwable unused) {
                    }
                }
            });
            return false;
        } catch (Throwable unused) {
        }
    }

    public static boolean random(int i10) {
        if (i10 == 0) {
            return false;
        }
        return i10 == 100 || new Random().nextInt(100) <= i10;
    }

    public static void saveInnerConfig(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || obj == null || (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) == null || (editorEdit = sharedPreferences.edit()) == null) {
                    return;
                }
                editorEdit.putInt(str, Integer.parseInt(obj.toString()));
                editorEdit.commit();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void setCommonTag(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.UMConfigure");
            Class<?> cls2 = Class.forName("com.umeng.commonsdk.UMConfigure$BS_TYPE");
            Method declaredMethod = cls.getDeclaredMethod("setModuleTag", cls2, String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                for (Enum r10 : (Enum[]) cls2.getEnumConstants()) {
                    if (r10 != null && r10.name().equals("APM")) {
                        declaredMethod.invoke(cls, r10, str, str2);
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void setIntegrationTesingParams(String str) {
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().addHeaderInfo("um_dk", str);
        }
        if (UMCrash.getReporter() != null) {
            HashMap map = new HashMap();
            map.put("um_dk", str);
            UMCrash.getReporter().addPublicParams(map);
        }
    }

    public static void setPuidAndProvider(String str, String str2) {
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PUID, str);
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PROVIDER, str2);
        }
        HashMap map = new HashMap();
        map.put(UMCrash.KEY_HEADER_PUID, str);
        map.put(UMCrash.KEY_HEADER_PROVIDER, str2);
        if (UMCrash.getReporter() != null) {
            UMCrash.getReporter().addPublicParams(map);
        }
    }

    public static String splitByByte(String str, int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10);
        try {
            int length = str.length();
            int length2 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String strValueOf = String.valueOf(str.charAt(i11));
                length2 += strValueOf.getBytes().length;
                if (i10 < length2) {
                    break;
                }
                stringBuffer.append(strValueOf);
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
