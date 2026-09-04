package com.apm.lite.k;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40046a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f40047b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f40048c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f40049d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f40050e = false;

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        return ((long) i10) * 1024;
    }

    public static ActivityManager.ProcessErrorStateInfo b(Context context, int i10) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        if (activityManager == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        int i11 = 0;
        while (i11 < i10) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                        return processErrorStateInfo;
                    }
                }
            }
            i11++;
            if (i10 == i11 || com.apm.lite.b.e.a()) {
                break;
            }
            SystemClock.sleep(200L);
        }
        return null;
    }

    private static String c() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    public static void d(Context context, JSONObject jSONObject) {
        try {
            f(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager != null) {
                j(jSONObject, activityManager);
            }
            g(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    public static void e(String str) {
        f40046a = str;
    }

    private static void f(JSONObject jSONObject) throws JSONException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        try {
            String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
            if (!TextUtils.isEmpty(memoryStat)) {
                jSONObject2.put("summary.graphics", a(Integer.parseInt(memoryStat)));
            }
        } catch (Throwable unused) {
        }
        jSONObject2.put("totalPrivateClean", c.a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", c.b(memoryInfo));
        jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", a(c.c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    private static void g(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        com.apm.lite.d.a.k(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.freeMemory();
        long j10 = runtime.totalMemory();
        jSONObject2.put("max_memory", jMaxMemory);
        jSONObject2.put("free_memory", jFreeMemory);
        jSONObject2.put("total_memory", j10);
        com.apm.lite.d.a.k(jSONObject, "filters", "java_heap_leak", String.valueOf(((float) (j10 - jFreeMemory)) > ((float) jMaxMemory) * 0.95f));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    public static boolean h(Context context) {
        if (context == null) {
            return com.apm.lite.runtime.a.b.y().H();
        }
        return com.apm.lite.runtime.a.b.y().H() || p(context);
    }

    private static String i() {
        try {
            return (String) com.apm.lite.f.a.b("android.app.ActivityThread", "currentProcessName", new Object[0]);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private static void j(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", n.a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    public static boolean k(Context context) {
        String strM = m(context);
        if (strM != null && strM.contains(":")) {
            return false;
        }
        if (strM == null || !strM.equals(context.getPackageName())) {
            return strM != null && strM.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    private static String l() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i10 = bufferedReader.read();
                    if (i10 <= 0) {
                        String string = sb2.toString();
                        k.a(bufferedReader);
                        return string;
                    }
                    sb2.append((char) i10);
                }
            } catch (Throwable unused) {
                k.a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static String m(Context context) {
        if (!TextUtils.isEmpty(f40046a)) {
            return f40046a;
        }
        String strC = c();
        f40046a = strC;
        if (!TextUtils.isEmpty(strC)) {
            return f40046a;
        }
        String strI = i();
        f40046a = strI;
        if (!TextUtils.isEmpty(strI)) {
            return f40046a;
        }
        String strL = l();
        f40046a = strL;
        return strL;
    }

    public static String n(Context context) {
        Class<?> clsQ = q(context);
        if (f40048c == null && clsQ != null) {
            try {
                f40048c = clsQ.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f40048c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static int o(Context context) {
        Class<?> clsQ = q(context);
        if (f40049d == null && clsQ != null) {
            try {
                f40049d = clsQ.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f40049d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    private static boolean p(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            return (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) ? false : true;
        } catch (Throwable unused) {
        }
    }

    private static Class<?> q(Context context) {
        if (f40047b == null && !f40050e) {
            try {
                f40047b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f40050e = true;
        }
        return f40047b;
    }
}
