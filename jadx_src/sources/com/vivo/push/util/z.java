package com.vivo.push.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.AttributionReporter;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Utility.java */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f106706a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f106707b = {"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f106708c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String[] f106709d = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String[] f106710e = new String[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map<String, Bundle> f106711f = new ConcurrentHashMap();

    public static long a(Context context) {
        String strB = t.b(context);
        if (!TextUtils.isEmpty(strB)) {
            return a(context, strB);
        }
        p.a("Utility", "systemPushPkgName is null");
        return -1L;
    }

    public static long a(Context context, String str) {
        Object objA = a(context, str, "com.vivo.push.sdk_version");
        if (objA == null) {
            objA = a(context, str, "sdk_version");
        }
        if (objA == null) {
            p.a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
        try {
            return Long.parseLong(objA.toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("Utility", "getSdkVersionCode error ", e10);
            return -1L;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static Object a(Context context, String str, String str2) {
        Bundle bundle;
        Object obj = null;
        if (context == null || str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, Bundle> map = f106711f;
            Object obj2 = (map == null || map.size() <= 0 || (bundle = f106711f.get(str)) == null) ? null : bundle.get(str2);
            if (obj2 != null) {
                return obj2;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                Bundle bundle2 = applicationInfo != null ? applicationInfo.metaData : null;
                Object obj3 = bundle2 != null ? bundle2.get(str2) : obj2;
                try {
                    if (f106711f.size() > 300) {
                        return obj3;
                    }
                    f106711f.put(str, bundle2);
                    return obj3;
                } catch (Exception e10) {
                    obj = obj3;
                    e = e10;
                    p.a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                    return obj;
                }
            } catch (Exception e11) {
                e = e11;
                obj = obj2;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    public static void a(Context context, Intent intent) {
        String strB = t.b(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(strB)) {
            p.a("Utility", "illegality abe adapter : push pkg is null");
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            p.a("Utility", "illegality abe adapter : src pkg is null");
            return;
        }
        if (strB.equals(context.getPackageName())) {
            p.a("Utility", "illegality abe adapter : abe is not pushservice");
            return;
        }
        if (strB.equals(stringExtra)) {
            p.a("Utility", "illegality abe adapter : pushPkg = " + strB + " ; srcPkg = " + stringExtra);
            return;
        }
        p.d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + strB);
        intent.setPackage(strB);
        intent.setClassName(strB, "com.vivo.push.sdk.service.PushService");
        context.startService(intent);
    }

    private static void a(Context context, String str, String str2, boolean z10) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            if (z10) {
                List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, bb.c.b.f30606e8);
                if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    if (str2.equals(it.next().activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, bb.c.b.f30606e8);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                throw new VivoPushException("checkModule " + intent + " has no services");
            }
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (str2.equals(resolveInfo.serviceInfo.name)) {
                    if (resolveInfo.serviceInfo.exported) {
                        return;
                    }
                    throw new VivoPushException(resolveInfo.serviceInfo.name + " exported is false");
                }
            }
            throw new VivoPushException(str2 + " is missing");
        } catch (Exception e10) {
            p.a("Utility", "error  " + e10.getMessage());
            throw new VivoPushException("checkModule error" + e10.getMessage());
        }
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : f106706a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    a(componentInfo, str2);
                    return;
                }
                throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    public static String b(Context context, String str) {
        Object objA = a(context, str, "com.vivo.push.app_id");
        if (objA != null) {
            return objA.toString();
        }
        Object objA2 = a(context, str, "app_id");
        return objA2 != null ? objA2.toString() : "";
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    public static void b(Context context) throws VivoPushException {
        String string;
        p.d("Utility", "check PushService AndroidManifest declearation !");
        String strB = t.b(context);
        boolean zD = t.d(context, context.getPackageName());
        boolean zE = t.e(context, context.getPackageName());
        boolean zC = t.c(context, context.getPackageName());
        if (zE) {
            f106706a = new String[]{"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
            f106707b = new String[]{"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
            f106708c = new String[]{"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
            f106709d = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
        } else {
            if (!zC && !zD) {
                throw new VivoPushException("AndroidManifest.xml中receiver配置项错误，详见接入文档");
            }
            if (zC) {
                f106708c = new String[]{"com.vivo.push.sdk.service.CommandClientService"};
            } else {
                f106708c = new String[]{"com.vivo.push.sdk.service.CommandService"};
            }
            f106709d = new String[0];
            f106706a = new String[0];
            if (zD) {
                f106707b = new String[]{"android.permission.INTERNET", "android.permission.WRITE_SETTINGS"};
            } else {
                f106707b = new String[]{"android.permission.INTERNET"};
            }
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                throw new VivoPushException("Permissions is null!");
            }
            for (String str : f106707b) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        throw new VivoPushException("permission : " + str + "  check fail : " + Arrays.toString(strArr));
                    }
                    if (!str.equals(strArr[i10])) {
                        i10++;
                    }
                }
            }
            f(context, strB);
            d(context, strB);
            e(context, strB);
            try {
                if (a(context, context.getPackageName(), "local_iv") == null) {
                    throw new VivoPushException("AndroidManifest.xml中未配置".concat("local_iv"));
                }
                String packageName = context.getPackageName();
                Object objA = a(context, packageName, "com.vivo.push.api_key");
                if (objA != null) {
                    string = objA.toString();
                } else {
                    Object objA2 = a(context, packageName, "api_key");
                    string = objA2 != null ? objA2.toString() : "";
                }
                if (TextUtils.isEmpty(string)) {
                    throw new VivoPushException("com.vivo.push.api_key is null");
                }
                if (TextUtils.isEmpty(b(context, context.getPackageName()))) {
                    throw new VivoPushException("com.vivo.push.app_id is null");
                }
                if ((zD || zE) && a(context, context.getPackageName()) == -1) {
                    throw new VivoPushException("sdkversion is null");
                }
                if (zE) {
                    a(context, "com.vivo.pushservice.action.METHOD", "com.vivo.push.sdk.RegistrationReceiver", true);
                    a(context, "com.vivo.pushservice.action.PUSH_SERVICE", "com.vivo.push.sdk.service.PushService", false);
                }
            } catch (Exception e10) {
                throw new VivoPushException("getMetaValue error " + e10.getMessage());
            }
        } catch (Exception e11) {
            throw new VivoPushException(e11.getMessage());
        }
    }

    public static boolean b(Context context, String str, String str2) {
        Cursor cursor = null;
        try {
            try {
                try {
                    if (context == null) {
                        p.a("Utility", "context is null");
                        return false;
                    }
                    Cursor cursorQuery = context.getContentResolver().query(com.vivo.push.p.f106628c, null, "appPkgName = ? and regId = ? sdkVersion = ? ", new String[]{str, str2, "323"}, null);
                    if (cursorQuery == null) {
                        p.a("Utility", "cursor is null");
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception e10) {
                                p.a("Utility", "close", e10);
                            }
                        }
                        return false;
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return false;
                    }
                    boolean z10 = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("clientState")));
                    try {
                        cursorQuery.close();
                    } catch (Exception e11) {
                        p.a("Utility", "close", e11);
                    }
                    return z10;
                } catch (Exception e12) {
                    p.a("Utility", "isOverdue", e12);
                    if (0 != 0) {
                        cursor.close();
                    }
                }
            } catch (Exception e13) {
                p.a("Utility", "close", e13);
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e14) {
                    p.a("Utility", "close", e14);
                }
            }
            throw th2;
        }
    }

    public static String c(Context context, String str) {
        Object objA = a(context, str, "verification_status");
        return objA != null ? objA.toString() : "";
    }

    public static PublicKey c(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(com.vivo.push.p.f106626a, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    if ("pushkey".equals(cursorQuery.getString(cursorQuery.getColumnIndex("name")))) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                        p.d("Utility", "result key : ".concat(String.valueOf(string)));
                        PublicKey publicKeyA = u.a(string);
                        try {
                            cursorQuery.close();
                        } catch (Exception unused) {
                        }
                        return publicKeyA;
                    }
                } catch (Throwable th2) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused2) {
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            cursorQuery.close();
        } catch (Exception unused3) {
        }
        return null;
    }

    private static void d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                throw new VivoPushException("serviceInfos is null");
            }
            for (String str2 : f106708c) {
                a(str2, serviceInfoArr, str);
            }
        } catch (Exception e10) {
            throw new VivoPushException("error " + e10.getMessage());
        }
    }

    public static boolean d(Context context) {
        Cursor cursor = null;
        try {
            try {
                try {
                    if (context == null) {
                        p.a("Utility", "context is null");
                        return false;
                    }
                    String packageName = context.getPackageName();
                    Cursor cursorQuery = context.getContentResolver().query(com.vivo.push.p.f106627b, null, "pushVersion = ? and appPkgName = ? and appCode = ? ", new String[]{"323", packageName, String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode)}, null);
                    if (cursorQuery == null) {
                        p.a("Utility", "cursor is null");
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception e10) {
                                p.a("Utility", "close", e10);
                            }
                        }
                        return false;
                    }
                    if (!cursorQuery.moveToFirst() || (cursorQuery.getInt(cursorQuery.getColumnIndex(AttributionReporter.SYSTEM_PERMISSION)) & 1) == 0) {
                        cursorQuery.close();
                        return false;
                    }
                    try {
                        cursorQuery.close();
                    } catch (Exception e11) {
                        p.a("Utility", "close", e11);
                    }
                    return true;
                } catch (Exception e12) {
                    p.a("Utility", "close", e12);
                }
            } catch (Exception e13) {
                p.a("Utility", "isSupport", e13);
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e14) {
                    p.a("Utility", "close", e14);
                }
            }
            throw th2;
        }
    }

    private static void e(Context context, String str) throws VivoPushException {
        if (f106710e.length <= 0) {
            return;
        }
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                throw new VivoPushException("activityInfos is null");
            }
            for (String str2 : f106710e) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e10) {
            throw new VivoPushException("error " + e10.getMessage());
        }
    }

    private static void f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
            if (activityInfoArr == null) {
                throw new VivoPushException("receivers is null");
            }
            for (String str2 : f106709d) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e10) {
            throw new VivoPushException(e10.getMessage());
        }
    }
}
