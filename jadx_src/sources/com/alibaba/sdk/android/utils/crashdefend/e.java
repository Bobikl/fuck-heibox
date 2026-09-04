package com.alibaba.sdk.android.utils.crashdefend;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CrashDefendUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.StringBuilder] */
    private static String a() throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        String strTrim;
        ?? MyPid = Process.myPid();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                File file = new File("/proc/" + MyPid + "/cmdline");
                if (file.exists()) {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        bufferedReader2 = bufferedReader;
                        strTrim = bufferedReader.readLine().trim();
                    } catch (Exception e10) {
                        e = e10;
                        Log.d("CrashUtils", "getProcessNameByPid error: " + e);
                        if (bufferedReader == null) {
                            return null;
                        }
                        try {
                            bufferedReader.close();
                            return null;
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            return null;
                        }
                    }
                } else {
                    strTrim = null;
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                return strTrim;
            } catch (Throwable th3) {
                th2 = th3;
                if (MyPid != 0) {
                    try {
                        MyPid.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
            bufferedReader = null;
        } catch (Throwable th4) {
            th2 = th4;
            MyPid = 0;
            if (MyPid != 0) {
                MyPid.close();
            }
            throw th2;
        }
    }

    private static String a(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        String strC = c(context);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        String strA = a();
        return !TextUtils.isEmpty(strA) ? strA : b(context);
    }

    static void a(Context context, a aVar, List<c> list) {
        if (context == null) {
            return;
        }
        synchronized (list) {
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (aVar != null) {
                                jSONObject.put("startSerialNumber", aVar.f38042a);
                            }
                            try {
                                JSONArray jSONArray = new JSONArray();
                                for (c cVar : list) {
                                    if (cVar != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("sdkId", cVar.f65a);
                                        jSONObject2.put("sdkVersion", cVar.f67b);
                                        jSONObject2.put("crashLimit", cVar.f38048a);
                                        jSONObject2.put("crashCount", cVar.crashCount);
                                        jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, cVar.f38049b);
                                        jSONObject2.put("registerSerialNumber", cVar.f66b);
                                        jSONObject2.put("startSerialNumber", cVar.f63a);
                                        jSONObject2.put("restoreCount", cVar.f38050c);
                                        jSONArray.put(jSONObject2);
                                    }
                                }
                                jSONObject.put("sdkList", jSONArray);
                            } catch (JSONException e10) {
                                Log.w("CrashUtils", "save sdk json fail:", e10);
                            }
                            String string = jSONObject.toString();
                            fileOutputStreamOpenFileOutput = m35a(context) ? context.openFileOutput("com_alibaba_aliyun_crash_defend_sdk_info", 0) : context.openFileOutput("com_alibaba_aliyun_crash_defend_sdk_info_" + a(context), 0);
                            fileOutputStreamOpenFileOutput.write(string.getBytes());
                        } catch (IOException e11) {
                            Log.w("CrashUtils", "save sdk io fail:", e11);
                            if (fileOutputStreamOpenFileOutput != null) {
                            }
                        }
                    } catch (Exception e12) {
                        Log.w("CrashUtils", "save sdk exception:", e12);
                        if (fileOutputStreamOpenFileOutput != null) {
                        }
                    }
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m35a(Context context) {
        return context.getPackageName().equalsIgnoreCase(a(context));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x0123, TRY_ENTER, TryCatch #3 {all -> 0x0123, blocks: (B:18:0x0047, B:34:0x0082, B:36:0x0088, B:38:0x008a, B:39:0x00a4, B:41:0x00aa, B:43:0x00b0, B:45:0x0103, B:51:0x011a, B:48:0x010a, B:50:0x0113, B:55:0x011f, B:56:0x0122, B:8:0x000c, B:10:0x0012, B:13:0x0034, B:14:0x0038, B:16:0x003e, B:12:0x001a, B:23:0x004f, B:27:0x005a, B:31:0x0065), top: B:62:0x000c, inners: #8, #8 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x0123, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {all -> 0x0123, blocks: (B:18:0x0047, B:34:0x0082, B:36:0x0088, B:38:0x008a, B:39:0x00a4, B:41:0x00aa, B:43:0x00b0, B:45:0x0103, B:51:0x011a, B:48:0x010a, B:50:0x0113, B:55:0x011f, B:56:0x0122, B:8:0x000c, B:10:0x0012, B:13:0x0034, B:14:0x0038, B:16:0x003e, B:12:0x001a, B:23:0x004f, B:27:0x005a, B:31:0x0065), top: B:62:0x000c, inners: #8, #8 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[Catch: Exception -> 0x0109, JSONException -> 0x0112, all -> 0x0123, TryCatch #8 {JSONException -> 0x0112, Exception -> 0x0109, blocks: (B:38:0x008a, B:39:0x00a4, B:41:0x00aa, B:43:0x00b0, B:45:0x0103), top: B:68:0x008a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0 A[Catch: Exception -> 0x0109, JSONException -> 0x0112, all -> 0x0123, TryCatch #8 {JSONException -> 0x0112, Exception -> 0x0109, blocks: (B:38:0x008a, B:39:0x00a4, B:41:0x00aa, B:43:0x00b0, B:45:0x0103), top: B:68:0x008a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0103 A[Catch: Exception -> 0x0109, JSONException -> 0x0112, all -> 0x0123, TRY_LEAVE, TryCatch #8 {JSONException -> 0x0112, Exception -> 0x0109, blocks: (B:38:0x008a, B:39:0x00a4, B:41:0x00aa, B:43:0x00b0, B:45:0x0103), top: B:68:0x008a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0106 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    static boolean m36a(Context context, a aVar, List<c> list) {
        JSONArray jSONArray;
        int i10;
        JSONObject jSONObject;
        c cVar;
        if (context == null) {
            return false;
        }
        FileInputStream fileInputStreamOpenFileInput = null;
        StringBuilder sb2 = new StringBuilder();
        synchronized (list) {
            try {
                try {
                    try {
                        fileInputStreamOpenFileInput = m35a(context) ? context.openFileInput("com_alibaba_aliyun_crash_defend_sdk_info") : context.openFileInput("com_alibaba_aliyun_crash_defend_sdk_info_" + a(context));
                        byte[] bArr = new byte[512];
                        while (true) {
                            int i11 = fileInputStreamOpenFileInput.read(bArr);
                            if (i11 == -1) {
                                break;
                            }
                            sb2.append(new String(bArr, 0, i11));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (FileNotFoundException e10) {
                    Log.d("CrashUtils", "load sdk file fail:" + e10.getMessage());
                    if (fileInputStreamOpenFileInput != null) {
                        break;
                    }
                    if (sb2.length() == 0) {
                        return false;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(sb2.toString());
                        aVar.f38042a = jSONObject2.optLong("startSerialNumber", 1L);
                        jSONArray = jSONObject2.getJSONArray("sdkList");
                        for (i10 = 0; i10 < jSONArray.length(); i10++) {
                            jSONObject = jSONArray.getJSONObject(i10);
                            if (jSONObject != null) {
                                cVar = new c();
                                cVar.f65a = jSONObject.optString("sdkId", "");
                                cVar.f67b = jSONObject.optString("sdkVersion", "");
                                cVar.f38048a = jSONObject.optInt("crashLimit", -1);
                                cVar.crashCount = jSONObject.optInt("crashCount", 0);
                                cVar.f38049b = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, 0);
                                cVar.f66b = jSONObject.optLong("registerSerialNumber", 0L);
                                cVar.f63a = jSONObject.optLong("startSerialNumber", 0L);
                                cVar.f38050c = jSONObject.optInt("restoreCount", 0);
                                if (TextUtils.isEmpty(cVar.f65a)) {
                                    continue;
                                } else {
                                    list.add(cVar);
                                }
                            }
                        }
                    } catch (JSONException e11) {
                        Log.w("CrashUtils", "load sdk json fail:", e11);
                    } catch (Exception e12) {
                        Log.w("CrashUtils", "load sdk exception:", e12);
                    }
                    return true;
                } catch (IOException e13) {
                    Log.w("CrashUtils", "load sdk io fail:", e13);
                    if (fileInputStreamOpenFileInput == null) {
                        if (sb2.length() == 0) {
                            return false;
                        }
                        JSONObject jSONObject3 = new JSONObject(sb2.toString());
                        aVar.f38042a = jSONObject3.optLong("startSerialNumber", 1L);
                        jSONArray = jSONObject3.getJSONArray("sdkList");
                        while (i10 < jSONArray.length()) {
                            jSONObject = jSONArray.getJSONObject(i10);
                            if (jSONObject != null) {
                                cVar = new c();
                                cVar.f65a = jSONObject.optString("sdkId", "");
                                cVar.f67b = jSONObject.optString("sdkVersion", "");
                                cVar.f38048a = jSONObject.optInt("crashLimit", -1);
                                cVar.crashCount = jSONObject.optInt("crashCount", 0);
                                cVar.f38049b = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, 0);
                                cVar.f66b = jSONObject.optLong("registerSerialNumber", 0L);
                                cVar.f63a = jSONObject.optLong("startSerialNumber", 0L);
                                cVar.f38050c = jSONObject.optInt("restoreCount", 0);
                                if (TextUtils.isEmpty(cVar.f65a)) {
                                    list.add(cVar);
                                } else {
                                    continue;
                                }
                            }
                        }
                        return true;
                    }
                    throw th2;
                } catch (Exception e14) {
                    Log.w("CrashUtils", "load sdk exception:", e14);
                    if (fileInputStreamOpenFileInput == null) {
                        if (sb2.length() == 0) {
                            return false;
                        }
                        JSONObject jSONObject4 = new JSONObject(sb2.toString());
                        aVar.f38042a = jSONObject4.optLong("startSerialNumber", 1L);
                        jSONArray = jSONObject4.getJSONArray("sdkList");
                        while (i10 < jSONArray.length()) {
                            jSONObject = jSONArray.getJSONObject(i10);
                            if (jSONObject != null) {
                                cVar = new c();
                                cVar.f65a = jSONObject.optString("sdkId", "");
                                cVar.f67b = jSONObject.optString("sdkVersion", "");
                                cVar.f38048a = jSONObject.optInt("crashLimit", -1);
                                cVar.crashCount = jSONObject.optInt("crashCount", 0);
                                cVar.f38049b = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, 0);
                                cVar.f66b = jSONObject.optLong("registerSerialNumber", 0L);
                                cVar.f63a = jSONObject.optLong("startSerialNumber", 0L);
                                cVar.f38050c = jSONObject.optInt("restoreCount", 0);
                                if (TextUtils.isEmpty(cVar.f65a)) {
                                    list.add(cVar);
                                } else {
                                    continue;
                                }
                            }
                        }
                        return true;
                    }
                    throw th2;
                }
                fileInputStreamOpenFileInput.close();
                if (sb2.length() == 0) {
                    return false;
                }
                JSONObject jSONObject5 = new JSONObject(sb2.toString());
                aVar.f38042a = jSONObject5.optLong("startSerialNumber", 1L);
                jSONArray = jSONObject5.getJSONArray("sdkList");
                while (i10 < jSONArray.length()) {
                    jSONObject = jSONArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        cVar = new c();
                        cVar.f65a = jSONObject.optString("sdkId", "");
                        cVar.f67b = jSONObject.optString("sdkVersion", "");
                        cVar.f38048a = jSONObject.optInt("crashLimit", -1);
                        cVar.crashCount = jSONObject.optInt("crashCount", 0);
                        cVar.f38049b = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, 0);
                        cVar.f66b = jSONObject.optLong("registerSerialNumber", 0L);
                        cVar.f63a = jSONObject.optLong("startSerialNumber", 0L);
                        cVar.f38050c = jSONObject.optInt("restoreCount", 0);
                        if (TextUtils.isEmpty(cVar.f65a)) {
                            list.add(cVar);
                        } else {
                            continue;
                        }
                    }
                }
                return true;
            } catch (Throwable th3) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th3;
            }
        }
    }

    private static String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    private static String c(Context context) {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, context.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e10) {
            Log.d("CrashUtils", "getProcessNameByActivityThread error: " + e10);
            return null;
        }
    }
}
