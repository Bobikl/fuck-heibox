package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: compiled from: HeaderHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f105376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f105377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f105378c;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HeaderHelper.java */
    public static class C1043a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f105379a = new a();

        private C1043a() {
        }
    }

    private a() {
        this.f105377b = null;
        this.f105378c = null;
    }

    public static a a(Context context) {
        if (f105376a == null && context != null) {
            f105376a = context.getApplicationContext();
        }
        return C1043a.f105379a;
    }

    private void e(String str) {
        try {
            this.f105377b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/Android/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f105376a));
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(f105376a, th2);
        }
    }

    private void f(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] strArrSplit = str2.split("&=");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ak.aP);
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    String strSubstring = str3.substring(0, 2);
                    if (strSubstring.endsWith(ContainerUtils.KEY_VALUE_DELIMITER)) {
                        strSubstring = strSubstring.replace(ContainerUtils.KEY_VALUE_DELIMITER, "");
                    }
                    sb2.append(strSubstring);
                }
            }
            this.f105378c = sb2.toString();
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(f105376a, th2);
        }
    }

    public String a() {
        return this.f105378c;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ak.av);
    }

    public String b() {
        return this.f105377b;
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("t");
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ak.aD);
    }

    public void d(String str) {
        String strSubstring = str.substring(0, str.indexOf(95));
        f(strSubstring);
        e(strSubstring);
    }
}
