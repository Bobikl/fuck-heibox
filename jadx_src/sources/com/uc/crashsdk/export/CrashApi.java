package com.uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.google.android.exoplayer2.j;
import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.d;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.b;
import com.uc.crashsdk.e;
import com.uc.crashsdk.g;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class CrashApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CrashApi f104301a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f104302c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f104303d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104304b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z10, boolean z11, boolean z12) {
        this.f104304b = false;
        Context contextA = a(context);
        b(contextA);
        b.f104227g = z11;
        b.f104228h = z12;
        if (b.L()) {
            b(contextA);
            a(contextA, customInfo, versionInfo, iCrashClient);
            if (z10) {
                a();
            }
            if (b.f104227g && e.e("libcrashsdk.so")) {
                b.f104226f = true;
                b();
                return;
            }
            return;
        }
        if (customInfo == null || versionInfo == null) {
            a.d("crashsdk", "VersionInfo and CustomInfo can not be null!");
            throw null;
        }
        g.a(customInfo);
        try {
            a(contextA, customInfo, versionInfo, iCrashClient);
        } catch (Throwable th2) {
            a(th2);
        }
        if (z10) {
            try {
                a();
            } catch (Throwable th3) {
                a(th3);
            }
        }
        try {
            b.M();
            h.a();
            d.a();
            com.uc.crashsdk.a.g.j();
        } catch (Throwable th4) {
            com.uc.crashsdk.a.g.a(th4);
        }
        try {
            if (!b.a(contextA)) {
                a.d("crashsdk", "registerLifecycleCallbacks failed!");
            }
        } catch (Throwable th5) {
            com.uc.crashsdk.a.g.a(th5);
        }
        try {
            com.uc.crashsdk.a.n();
            try {
                e.A();
            } catch (Throwable th6) {
                com.uc.crashsdk.a.g.b(th6);
            }
            e.B();
        } catch (Throwable th7) {
            com.uc.crashsdk.a.g.a(th7);
        }
        try {
            if (g.r() && b.F() && !this.f104304b) {
                e.G();
                this.f104304b = true;
            }
        } catch (Throwable th8) {
            com.uc.crashsdk.a.g.b(th8);
        }
    }

    private static Context a(Context context) {
        if (context == null) {
            a.d("crashsdk", "context can not be null!");
            throw null;
        }
        if (!f104302c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
            return context;
        }
        a.d("crashsdk", "Can not get Application context from given context!");
        throw new IllegalArgumentException("Can not get Application context from given context!");
    }

    private static void a() {
        if (b.f104210a) {
            a.b("Has enabled java log!");
            return;
        }
        e.s();
        e.o();
        b.f104210a = true;
    }

    private static void a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        com.uc.crashsdk.d.a(iCrashClient);
        g.a(customInfo, versionInfo);
        if (b.L()) {
            return;
        }
        e.p();
        e.a(context);
        e.b(context);
    }

    private static void a(Throwable th2) {
        new e().a(Thread.currentThread(), th2, true);
    }

    private static boolean a(String str) {
        if (!b.L()) {
            return false;
        }
        a.d("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }

    private static void b() {
        synchronized (b.f104225e) {
            if (b.f104227g && b.f104226f) {
                if (b.f104222b) {
                    a.b("Has enabled native log!");
                    return;
                }
                c();
                e.D();
                b.f104222b = true;
                JNIBridge.cmd(6);
                g.d();
            }
        }
    }

    private static void b(Context context) {
        try {
            if (f104303d) {
                return;
            }
            com.uc.crashsdk.a.g.a(context);
            com.uc.crashsdk.a.f104130a = context.getPackageName();
            f104303d = true;
        } catch (Throwable th2) {
            a(th2);
        }
    }

    private static void c() {
        if (b.f104224d) {
            return;
        }
        g.b();
        JNIBridge.cmd(5);
        g.c();
        b.f104224d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z10, boolean z11, boolean z12) {
        if (f104301a == null) {
            f104301a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z10, z11, z12);
        }
        return f104301a;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z10) {
        return createInstanceEx(context, str, z10, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z10, Bundle bundle) {
        return createInstanceEx(context, str, z10, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z10, Bundle bundle, ICrashClient iCrashClient) {
        CrashApi crashApi = f104301a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f104302c = bundle.getBoolean("useApplicationContext", true);
        Context contextA = a(context);
        b(contextA);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = false;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z10;
        bundle.putString("crver", org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d);
        CustomInfo customInfoA = g.a(customInfo, bundle);
        VersionInfo versionInfoA = g.a(bundle);
        boolean z11 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_JAVA, true);
        boolean z12 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_NATIVE, true);
        boolean z13 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_UNEXP, b.F());
        boolean z14 = bundle.getBoolean(UMCrash.KEY_ENABLE_ANR, true);
        CrashApi crashApiCreateInstance = createInstance(contextA, customInfoA, versionInfoA, iCrashClient, z11, z12, z13);
        crashApiCreateInstance.disableLog(j.G);
        b.a(z14);
        if (z12 || z13) {
            if (e.e("libcrashsdk.so")) {
                crashApiCreateInstance.crashSoLoaded();
            } else {
                a.d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i10 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i10 >= 0 && b.F()) {
            e.b(i10);
        }
        return crashApiCreateInstance;
    }

    public static CrashApi getInstance() {
        return f104301a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str == null || str2 == null) {
            throw null;
        }
        return com.uc.crashsdk.a.b(str, str2);
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        dumpFileInfo.getClass();
        String str2 = dumpFileInfo.mCategory;
        if (str2 == null || (str = dumpFileInfo.mFileTobeDump) == null) {
            throw null;
        }
        int i10 = dumpFileInfo.mLogType;
        if ((1048849 & i10) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i10, dumpFileInfo.mDeleteAfterDump);
    }

    public int addDumpFile(String str, String str2, int i10, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i10);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    public void addHeaderInfo(String str, String str2) {
        str.getClass();
        com.uc.crashsdk.a.a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (a("addStatInfo")) {
            return false;
        }
        if (com.uc.crashsdk.a.g.a(str)) {
            throw null;
        }
        if (str.length() > 24) {
            throw new IllegalArgumentException("key is too long!");
        }
        if (str2 != null && str2.length() > 512) {
            str2 = str2.substring(0, 512);
        }
        return h.a(str, str2);
    }

    public void crashSoLoaded() {
        if (a("crashSoLoaded")) {
            return;
        }
        b.f104226f = true;
        b();
        synchronized (b.f104225e) {
            if (b.f104228h && b.f104226f && !b.f104223c) {
                if (!b.f104224d) {
                    c();
                    g.d();
                }
                e.x();
                b.f104223c = true;
            }
        }
        com.uc.crashsdk.a.n();
        e.m();
    }

    public int createCachedInfo(String str, int i10, int i11) {
        str.getClass();
        if (i10 <= 0) {
            throw new IllegalArgumentException("capacity must > 0!");
        }
        if ((1048849 & i11) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i10, i11);
    }

    public void disableLog(int i10) {
        synchronized (b.f104225e) {
            b.b(i10);
            if (LogType.isForJava(i10) && b.f104210a) {
                e.t();
                b.f104210a = false;
            }
            if (LogType.isForNative(i10)) {
                if (b.f104222b) {
                    JNIBridge.cmd(9);
                    b.f104222b = false;
                } else {
                    b.f104227g = false;
                }
            }
            if (LogType.isForANR(i10)) {
                b.a(false);
            }
            if (LogType.isForUnexp(i10)) {
                if (!b.f104223c) {
                    b.f104228h = false;
                } else if (e.z()) {
                    b.f104223c = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        String str;
        StringBuilder sb2;
        customLogInfo.getClass();
        if (customLogInfo.mData == null || (str = customLogInfo.mLogType) == null) {
            throw new NullPointerException("mData or mLogType is null!");
        }
        if (str.contains(lg.a.f131412e) || customLogInfo.mLogType.contains(" ")) {
            throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
        }
        ArrayList<Integer> arrayList = customLogInfo.mDumpTids;
        if (arrayList == null || arrayList.size() <= 0) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            Iterator<Integer> it = customLogInfo.mDumpTids.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().intValue());
                sb2.append(" ");
            }
        }
        long j10 = customLogInfo.mAddHeader ? 1L : 0L;
        if (customLogInfo.mAddFooter) {
            j10 |= 2;
        }
        if (customLogInfo.mAddLogcat) {
            j10 |= 4;
        }
        if (customLogInfo.mAddThreadsDump) {
            j10 |= 8;
        }
        if (customLogInfo.mAddBuildId) {
            j10 |= 16;
        }
        if (customLogInfo.mUploadNow) {
            j10 |= 32;
        }
        return e.a(customLogInfo.mData, customLogInfo.mLogType, j10, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb2 != null ? sb2.toString() : null);
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    public boolean generateTraces(String str, long j10) {
        if (a("generateTraces")) {
            return false;
        }
        if (b.f104224d) {
            return JNIBridge.nativeCmd(12, j10, str, null) == 1;
        }
        a.d("crashsdk", "Crash so is not loaded!");
        return false;
    }

    public String getCrashLogUploadUrl() {
        if (a("getCrashLogUploadUrl")) {
            return null;
        }
        return e.k();
    }

    public ParcelFileDescriptor getHostFd() {
        return e.E();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return e.E();
    }

    public int getLastExitType() {
        if (a("getLastExitType")) {
            return 1;
        }
        return b.I();
    }

    public int getLastExitTypeEx() {
        if (a("getLastExitTypeEx")) {
            return 1;
        }
        return b.J();
    }

    public Throwable getUncaughtException() {
        return e.v();
    }

    public int getUnexpReason() {
        if (a("getUnexpReason")) {
            return 100;
        }
        return e.w();
    }

    public void onExit() {
        b.w();
    }

    public boolean registerCallback(int i10, ValueCallback<Bundle> valueCallback) {
        valueCallback.getClass();
        if (i10 == 1) {
            return com.uc.crashsdk.d.a(valueCallback);
        }
        if (i10 == 2) {
            return com.uc.crashsdk.d.c(valueCallback);
        }
        if (i10 == 3) {
            return com.uc.crashsdk.d.d(valueCallback);
        }
        if (i10 == 4) {
            return com.uc.crashsdk.d.b(valueCallback);
        }
        throw new IllegalArgumentException("Unknown event type: " + i10);
    }

    public int registerInfoCallback(String str, int i10) {
        str.getClass();
        if ((1048849 & i10) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i10, null, 0L, 0);
    }

    public int registerInfoCallback(String str, int i10, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        }
        if ((1048849 & i10) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i10, callable, 0L, 0);
    }

    public int registerThread(int i10, String str) {
        return com.uc.crashsdk.a.a(i10, str);
    }

    public int reportCrashStats(boolean z10) {
        if (a("reportCrashStats")) {
            return 0;
        }
        if (g.O()) {
            a.a("CrashApi::reportCrashStats. currentProcessOnly: " + z10);
        }
        e.d(z10);
        return e.e(z10);
    }

    public int resetCrashStats(boolean z10) {
        if (a("resetCrashStats")) {
            return 0;
        }
        if (g.O()) {
            a.a("CrashApi::resetCrashStats. currentProcessOnly: " + z10);
        }
        return e.f(z10);
    }

    public void setForeground(boolean z10) {
        b.b(z10);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (a("setNewInstall")) {
            return;
        }
        b.v();
    }

    public int updateCustomInfo(Bundle bundle) {
        bundle.getClass();
        return updateCustomInfo(g.a((CustomInfo) null, bundle));
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        customInfo.getClass();
        return g.b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (a("updateUnexpInfo")) {
            return false;
        }
        return com.uc.crashsdk.a.a(true);
    }

    public void updateVersionInfo(Bundle bundle) {
        bundle.getClass();
        updateVersionInfo(g.a(bundle));
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        versionInfo.getClass();
        g.a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (a("uploadCrashLogs")) {
            return;
        }
        e.a(false, true);
    }
}
