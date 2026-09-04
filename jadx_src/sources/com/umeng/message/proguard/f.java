package com.umeng.message.proguard;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.common.UPLog;
import com.umeng.ut.device.UTDevice;
import java.io.Closeable;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f105798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f105799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Boolean f105800f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f105797c = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f105795a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f105796b = true;

    public static int a() {
        return View.generateViewId();
    }

    public static Bitmap a(File file, int i10, int i11) {
        try {
            if (i11 == 0 || i10 == 0) {
                return BitmapFactory.decodeFile(file.getPath(), null);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getPath(), options);
            float f10 = i10 >= i11 ? options.outWidth / i10 : options.outHeight / i11;
            if (f10 < 1.0f) {
                f10 = 1.0f;
            }
            options.inJustDecodeBounds = false;
            options.inSampleSize = (int) f10;
            return BitmapFactory.decodeFile(file.getPath(), options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object a(Object obj, String str) {
        try {
            return ((PackageManager) obj).getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f105798d)) {
            return f105798d;
        }
        String currentProcessName = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                currentProcessName = Application.getProcessName();
            }
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
        }
        if (TextUtils.isEmpty(currentProcessName)) {
            currentProcessName = UMFrUtils.getCurrentProcessName(context);
        }
        f105798d = currentProcessName;
        return currentProcessName;
    }

    public static String a(Context context, String str) {
        String str2 = context.getCacheDir() + "/umeng_push_inapp/";
        if (str == null) {
            return str2;
        }
        return str2 + str + "/";
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        str.hashCode();
        switch (str) {
            case "HW_TOKEN":
                return "huawei";
            case "MI_TOKEN":
                return "xiaomi";
            case "gcm":
                return UPushThirdTokenCallback.TYPE_FCM;
            case "HONOR_TOKEN":
                return "honor";
            case "OPPO_TOKEN":
                return "oppo";
            case "VIVO_TOKEN":
                return "vivo";
            case "MZ_TOKEN":
                return "meizu";
            default:
                return str;
        }
    }

    public static void a(Context context, Class<?> cls) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && packageManager.getApplicationEnabledSetting(context.getPackageName()) >= 0) {
                ComponentName componentName = new ComponentName(context, cls);
                if (a(packageManager, componentName)) {
                    return;
                }
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
        }
    }

    public static void a(Context context, String str, long j10) {
        try {
            ba.a(ba.a(UTDevice.class.getName(), "resetDid", (Class<?>[]) new Class[]{Context.class, String.class, Long.TYPE}), (Object) null, new Object[]{context, str, Long.valueOf(j10)});
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(long j10) {
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1);
        int i11 = calendar.get(6);
        calendar.setTimeInMillis(j10);
        return i11 == calendar.get(6) && i10 == calendar.get(1);
    }

    private static boolean a(PackageManager packageManager, ComponentName componentName) {
        try {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            return componentEnabledSetting == 1 || componentEnabledSetting == 0;
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
            return false;
        }
    }

    public static boolean b() {
        Boolean bool = f105800f;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = null;
        try {
            bool2 = (Boolean) ba.a(ba.a(UMConfigure.class.getName(), "isSilentMode", (Class<?>[]) new Class[0]), (Object) null, (Object[]) null);
        } catch (Throwable unused) {
        }
        Boolean boolValueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        f105800f = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean b(Context context) {
        Boolean bool = f105799e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        Boolean boolValueOf = Boolean.valueOf(!TextUtils.isEmpty(packageName) && TextUtils.equals(a(context), packageName));
        f105799e = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static void c() {
        try {
            Method methodA = ba.a(UMConfigure.class.getName(), "registerActionInfo", (Class<?>[]) new Class[]{Class.forName("com.umeng.ccg.ActionInfo")});
            if (methodA != null) {
                ba.a(methodA, (Object) null, new Object[]{ba.a(r.class.getName(), (Class<?>[]) null, (Object[]) null)});
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean c(Context context) {
        Boolean bool = null;
        try {
            bool = (Boolean) ba.a(ba.a(UTDevice.class.getName(), "isNewDid", (Class<?>[]) new Class[]{Context.class}), (Object) null, new Object[]{context});
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
        }
        return Boolean.TRUE.equals(bool);
    }

    public static String d(Context context) {
        try {
            return (String) ba.a(ba.a(UTDevice.class.getName(), "getTid", (Class<?>[]) new Class[]{Context.class}), (Object) null, new Object[]{context});
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
            return null;
        }
    }

    public static void e(Context context) {
        try {
            ba.a(ba.a(UTDevice.class.getName(), "removeTid", (Class<?>[]) new Class[]{Context.class}), (Object) null, new Object[]{context});
        } catch (Throwable th2) {
            UPLog.e("Helper", th2);
        }
    }

    public static boolean f(Context context) {
        return UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }

    public static File g(Context context) {
        File file = new File(context.getCacheDir(), "umeng_push");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return file;
    }
}
