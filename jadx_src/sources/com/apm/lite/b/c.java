package com.apm.lite.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.k.r;
import com.apm.lite.k.v;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f39869a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f39870b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f39871c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f39872d;

    static String a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        if (!com.apm.lite.e.z()) {
            return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("|------------- processErrorStateInfo--------------|\n");
        sb2.append("condition: " + processErrorStateInfo.condition + "\n");
        sb2.append("processName: " + processErrorStateInfo.processName + "\n");
        sb2.append("pid: " + processErrorStateInfo.pid + "\n");
        sb2.append("uid: " + processErrorStateInfo.uid + "\n");
        sb2.append("tag: " + processErrorStateInfo.tag + "\n");
        sb2.append("shortMsg : " + processErrorStateInfo.shortMsg + "\n");
        sb2.append("longMsg : " + processErrorStateInfo.longMsg + "\n");
        sb2.append("-----------------------end----------------------------");
        return sb2.toString();
    }

    static String b(Context context, int i10) {
        if (r.c(256)) {
            f39871c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - f39870b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoB = com.apm.lite.k.a.b(context, i10);
            if (processErrorStateInfoB != null && Process.myPid() == processErrorStateInfoB.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f39872d;
                if (processErrorStateInfo != null && e(processErrorStateInfo, processErrorStateInfoB)) {
                    return null;
                }
                f39872d = processErrorStateInfoB;
                f39869a = null;
                f39870b = SystemClock.uptimeMillis();
                f39871c = false;
                return a(processErrorStateInfoB);
            }
        } catch (Throwable unused) {
        }
        String str = f39869a;
        if (str == null) {
            return null;
        }
        f39871c = true;
        f39869a = null;
        f39870b = SystemClock.uptimeMillis();
        return str;
    }

    public static JSONObject c(boolean z10) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", v.e(stackTrace));
            return jSONObject;
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
            return null;
        }
    }

    public static boolean d() {
        return f39871c;
    }

    static boolean e(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        return String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg));
    }

    public static void f() {
        f39872d = null;
    }
}
