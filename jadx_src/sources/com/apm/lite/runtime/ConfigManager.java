package com.apm.lite.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.lite.ICommonParams;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigManager {
    private static final String ALOG_UPLOAD_URL = "https://apmplus.volces.com/monitor/collect/c/cloudcontrol/file";
    public static final String ALOG_URL_SUFFIX = "/monitor/collect/c/cloudcontrol/file";
    public static final long BLOCK_MONITOR_INTERVAL = 1000;
    private static final long BLOCK_MONITOR_MIN_INTERVAL = 10;
    private static final String CONFIG_URL = "https://apmplus.volces.com/settings/get";
    public static final String CONFIG_URL_SUFFIX = "/settings/get";
    private static final String EXCEPTION_URL = "https://apmplus.volces.com/monitor/collect/c/exception";
    public static final String EXCEPTION_URL_SUFFIX = "/monitor/collect/c/exception";
    private static final String FILE_UPLOAD_URL = "https://apmplus.volces.com/monitor/collect/c/logcollect";
    public static final String FILE_UPLOAD_URL_SUFFIX = "/monitor/collect/c/logcollect";
    private static final String JAVA_CRASH_URL = "https://apmplus.volces.com/monitor/collect/c/crash";
    public static final String JAVA_URL_SUFFIX = "/monitor/collect/c/crash";
    private static final long LAUNCH_CRASH_INTERVAL = 8000;
    private static final String LAUNCH_CRASH_URL = "https://apmplus.volces.com/monitor/collect/c/exception/dump_collection";
    public static final String LAUNCH_URL_SUFFIX = "/monitor/collect/c/exception/dump_collection";
    private static final String NATIVE_CRASH_URL = "https://apmplus.volces.com/monitor/collect/c/native_bin_crash";
    public static final String NATIVE_URL_SUFFIX = "/monitor/collect/c/native_bin_crash";
    private static final String PAGEVIEW_URL = "https://apmplus.volces.com/monitor/collect/c/session";
    public static final String PAGEVIEW_URL_SUFFIX = "/monitor/collect/c/session";
    private ThreadPoolExecutor mThreadPoolExecutor;
    private boolean reportErrorEnable = true;
    private String mJavaCrashUploadUrl = JAVA_CRASH_URL;
    private String mLaunchCrashUploadUrl = LAUNCH_CRASH_URL;
    private String mExceptionUploadUrl = EXCEPTION_URL;
    private String mPageViewUrl = PAGEVIEW_URL;
    private String mConfigUrl = CONFIG_URL;
    private String mNativeCrashUploadUrl = NATIVE_CRASH_URL;
    private String mAlogUploadUrl = ALOG_UPLOAD_URL;
    private String mFileUploadUrl = FILE_UPLOAD_URL;
    private long mLaunchCrashInterval = 8000;
    private int mLogcatDumpCount = 512;
    private int mLogcatLevel = 1;
    private boolean mNativeCrashMiniDump = true;
    private boolean mEnsureEnable = true;
    private boolean mIsDebugMode = false;
    private boolean mRegisterJavaCrash = false;
    private boolean mJavaCrashEnable = true;
    private boolean mNativeCrashEnable = true;
    private boolean mANREnable = true;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40122b;

        a(String str) {
            this.f40122b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.apm.lite.e.h().b(this.f40122b);
            com.apm.lite.i.b.e();
        }
    }

    public class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40123c;

        b(String str) {
            this.f40123c = str;
        }

        @Override // com.apm.lite.runtime.f
        public Object a(String str) {
            return str.equals("md5") ? this.f40123c : super.a(str);
        }
    }

    public static void setDefaultCommonParams(ICommonParams iCommonParams, Context context) {
        com.apm.lite.e.d(new d(context, iCommonParams));
    }

    public static void updateDid(String str) {
        m.b().e(new a(str));
    }

    public String getAlogUploadUrl() {
        return this.mAlogUploadUrl;
    }

    public String getConfigUrl() {
        return this.mConfigUrl;
    }

    public String getExceptionUploadUrl() {
        return this.mExceptionUploadUrl;
    }

    public String getFileUploadUrl() {
        return this.mFileUploadUrl;
    }

    public Set<String> getFilterThreadSet() {
        return com.apm.lite.k.j.a();
    }

    public String getJavaCrashUploadUrl() {
        return this.mJavaCrashUploadUrl;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public String getLaunchCrashUploadUrl() {
        return this.mLaunchCrashUploadUrl;
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public String getNativeCrashUploadUrl() {
        return this.mNativeCrashUploadUrl;
    }

    public String getPageViewUrl() {
        return this.mPageViewUrl;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isAnrEnable() {
        return this.mANREnable;
    }

    public boolean isCrashIgnored(String str) {
        try {
            b bVar = new b(str);
            if (k.b("java_crash_ignore", bVar)) {
                return true;
            }
            if (com.apm.lite.k.p.c(com.apm.lite.e.m())) {
                return k.b("java_crash_ignore", bVar);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    public boolean isEnsureEnable() {
        return this.mEnsureEnable;
    }

    public boolean isJavaCrashEnable() {
        return this.mJavaCrashEnable;
    }

    public boolean isNativeCrashEnable() {
        return this.mNativeCrashEnable;
    }

    public boolean isNativeCrashMiniDump() {
        return this.mNativeCrashMiniDump;
    }

    public boolean isRegisterJavaCrashEnable() {
        return this.mRegisterJavaCrash;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    public void setAlogUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mAlogUploadUrl = str;
    }

    public void setAnrEnable(boolean z10) {
        this.mANREnable = z10;
    }

    public void setConfigUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mConfigUrl = str;
    }

    public void setCurrentProcessName(String str) {
        com.apm.lite.k.a.e(str);
    }

    public void setDebugMode(boolean z10) {
        this.mIsDebugMode = z10;
    }

    public void setEnsureEnable(boolean z10) {
        this.mEnsureEnable = z10;
    }

    public void setFileUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mFileUploadUrl = str;
    }

    public void setJavaCrashEnable(boolean z10) {
        this.mJavaCrashEnable = z10;
    }

    public void setJavaCrashUploadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mJavaCrashUploadUrl = str;
    }

    public void setLaunchCrashUrl(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mExceptionUploadUrl = str;
        int iIndexOf = str.indexOf("//");
        if (iIndexOf == -1) {
            str2 = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
        } else {
            str2 = str.substring(0, str.indexOf("/", iIndexOf + 2) + 1) + "monitor/collect/c/exception/dump_collection";
        }
        this.mLaunchCrashUploadUrl = str2;
    }

    public void setLogcatDumpCount(int i10) {
        if (i10 > 0) {
            this.mLogcatDumpCount = i10;
        }
    }

    public void setLogcatLevel(int i10) {
        if (i10 < 0 || i10 > 4) {
            return;
        }
        this.mLogcatLevel = i10;
    }

    public void setNativeCrashEnable(boolean z10) {
        this.mNativeCrashEnable = z10;
    }

    public void setNativeCrashUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mNativeCrashUploadUrl = str;
    }

    public void setPageViewUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mPageViewUrl = str;
    }

    public void setRegisterJavaCrashEnable(boolean z10) {
        this.mRegisterJavaCrash = z10;
    }

    public void setReportErrorEnable(boolean z10) {
        this.reportErrorEnable = z10;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }
}
