package com.uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.CustomInfo;
import com.uc.crashsdk.export.VersionInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static RuntimeException f104310a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static RuntimeException f104311b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f104312c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static CustomInfo f104313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static VersionInfo f104314e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f104316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f104317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f104318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f104319j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f104315f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f104320k = new Object();

    static int A() {
        return f104313d.mLogMaxBytesLimit;
    }

    static int B() {
        return f104313d.mLogMaxUploadBytesLimit;
    }

    static long C() {
        return f104313d.mMaxUploadBytesPerDay;
    }

    static int D() {
        return f104313d.mMaxUploadBuiltinLogCountPerDay;
    }

    static int E() {
        return f104313d.mMaxUploadCustomLogCountPerDay;
    }

    static int F() {
        return f104313d.mMaxCustomLogCountPerTypePerDay;
    }

    static int G() {
        return f104313d.mInfoUpdateInterval;
    }

    static int H() {
        return f104313d.mInfoSaveFrequency;
    }

    static int I() {
        return f104313d.mReservedJavaFileHandleCount;
    }

    static int J() {
        return f104313d.mFdDumpMinLimit;
    }

    static int K() {
        return f104313d.mThreadsDumpMinLimit;
    }

    static boolean L() {
        return f104313d.mAutoDetectLifeCycle;
    }

    static boolean M() {
        return f104313d.mMonitorBattery;
    }

    static int N() {
        return f104313d.mAnrTraceStrategy;
    }

    public static boolean O() {
        CustomInfo customInfo = f104313d;
        return customInfo == null || customInfo.mDebug;
    }

    static boolean P() {
        CustomInfo customInfo = f104313d;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    public static boolean Q() {
        return f104313d.mEnableStatReport;
    }

    public static boolean R() {
        return f104313d.mIsInternational;
    }

    public static boolean S() {
        return f104313d.mAddPvForNewDay;
    }

    public static String T() {
        return com.uc.crashsdk.a.g.a(f104314e.mVersion) ? a.a() : a(f104314e.mVersion);
    }

    public static String U() {
        return com.uc.crashsdk.a.g.a(f104314e.mSubVersion) ? "release" : f104314e.mSubVersion;
    }

    public static String V() {
        return com.uc.crashsdk.a.g.a(f104314e.mBuildId) ? ad() : a(f104314e.mBuildId);
    }

    public static String W() {
        if (f104317h == null) {
            f104317h = com.uc.crashsdk.a.g.b() + File.separatorChar + f104313d.mTagFilesFolderName + File.separatorChar;
        }
        return f104317h;
    }

    static String X() {
        if (f104318i == null) {
            f104318i = com.uc.crashsdk.a.g.b() + File.separatorChar + f104313d.mCrashLogsFolderName + File.separatorChar;
        }
        return f104318i;
    }

    static String Y() {
        if (f104319j == null) {
            if (com.uc.crashsdk.a.g.a(f104313d.mLogsBackupPathName)) {
                f104319j = (com.uc.crashsdk.a.g.b() + File.separatorChar + "msdb" + File.separatorChar) + File.separatorChar + f104313d.mCrashLogsFolderName + File.separatorChar;
            } else {
                String strTrim = f104313d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!strTrim.endsWith(str)) {
                    strTrim = strTrim + str;
                }
                f104319j = strTrim;
            }
        }
        return f104319j;
    }

    public static boolean Z() {
        return f104313d.mEnableCrpStat;
    }

    public static CustomInfo a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = f104313d;
            customInfo = customInfo2 == null ? new CustomInfo() : new CustomInfo(customInfo2);
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e10) {
                        com.uc.crashsdk.a.g.a(e10);
                        StringBuilder sb2 = new StringBuilder("Field ");
                        sb2.append(str);
                        sb2.append(" must be a ");
                        sb2.append(field.getType().getName());
                        sb2.append(", but give a ");
                        sb2.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    public static VersionInfo a(Bundle bundle) {
        VersionInfo versionInfo = f104314e;
        VersionInfo versionInfo2 = versionInfo == null ? new VersionInfo() : new VersionInfo(versionInfo);
        String string = bundle.getString("mVersion");
        if (!com.uc.crashsdk.a.g.a(string)) {
            versionInfo2.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!com.uc.crashsdk.a.g.a(string2)) {
            versionInfo2.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!com.uc.crashsdk.a.g.a(string3)) {
            versionInfo2.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!com.uc.crashsdk.a.g.a(string4)) {
            a.f104131b = string4;
            ae();
        }
        return versionInfo2;
    }

    private static String a(String str) {
        return (str == null || !str.contains(lg.a.f131412e)) ? str : str.replaceAll(lg.a.f131412e, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    static void a() {
        b.y();
        b.x();
        if (f104313d.mBackupLogs) {
            File file = new File(Y());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static void a(CustomInfo customInfo) {
        boolean z10 = f104312c;
        if (!z10 && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        }
        if (!z10 && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        }
        if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    public static void a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f104313d = customInfo2;
        c(customInfo2);
        if (!f104313d.mZipLog) {
            f104310a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f104313d.mEncryptLog) {
            f104311b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f104314e = new VersionInfo(versionInfo);
        if (b.L()) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
    }

    public static void a(VersionInfo versionInfo) {
        synchronized (f104315f) {
            f104314e = new VersionInfo(versionInfo);
            e.c();
            if (b.f104224d) {
                JNIBridge.set(109, T());
                JNIBridge.set(110, U());
                JNIBridge.set(111, V());
                JNIBridge.set(112, "211215141717");
                JNIBridge.cmd(2);
            }
        }
    }

    private static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean aa() {
        return f104313d.mEnableStatToWPKDirect;
    }

    public static String ab() {
        return f104313d.mUserId;
    }

    public static String ac() {
        return f104313d.mChannel;
    }

    private static String ad() {
        ZipFile zipFile;
        Throwable th2;
        String str = f104316g;
        if (str != null) {
            return str;
        }
        try {
            try {
                zipFile = new ZipFile(com.uc.crashsdk.a.g.c());
                try {
                    f104316g = Long.toHexString(zipFile.getEntry(com.meituan.robust.Constants.CLASSES_DEX_NAME).getCrc());
                    com.uc.crashsdk.a.a.a("crashsdk", "version unique build id: " + f104316g);
                    zipFile.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        f104316g = "";
                        com.uc.crashsdk.a.g.a(th2);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return f104316g;
                    } catch (Throwable th4) {
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th5) {
            zipFile = null;
            th2 = th5;
        }
        return f104316g;
    }

    private static void ae() {
        if (b.f104224d) {
            JNIBridge.nativeSet(24, 1L, a.f104131b, null);
        }
    }

    public static int b(CustomInfo customInfo) {
        int i10;
        int i11;
        boolean z10;
        synchronized (f104320k) {
            i10 = 0;
            if (customInfo != null) {
                c(customInfo);
                if (f104313d == null) {
                    f104313d = new CustomInfo();
                }
                CustomInfo customInfo2 = f104313d;
                boolean z11 = true;
                if (a(customInfo.mAppId, customInfo2.mAppId)) {
                    i11 = 0;
                } else {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (b.f104224d) {
                        JNIBridge.set(102, str);
                    }
                    i11 = 1;
                }
                int i12 = i11;
                if (!a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i11++;
                }
                if (!a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (b.f104224d) {
                        JNIBridge.set(100, str2);
                    }
                    i11++;
                    i12 = 1;
                }
                if (!a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (b.f104224d) {
                        JNIBridge.set(101, str3);
                    }
                    i11++;
                    i12 = 1;
                }
                if (i12 != 0) {
                    e.c();
                    if (b.f104224d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z12 = customInfo2.mPrintStackInfos;
                boolean z13 = customInfo.mPrintStackInfos;
                if (z12 != z13) {
                    customInfo2.mPrintStackInfos = z13;
                    if (b.f104224d) {
                        JNIBridge.set(11, z13);
                    }
                    i11++;
                }
                boolean z14 = customInfo2.mDebug;
                boolean z15 = customInfo.mDebug;
                if (z14 != z15) {
                    customInfo2.mDebug = z15;
                    if (b.f104224d) {
                        JNIBridge.set(18, z15);
                    }
                    i11++;
                }
                boolean z16 = customInfo2.mBackupLogs;
                boolean z17 = customInfo.mBackupLogs;
                if (z16 != z17) {
                    customInfo2.mBackupLogs = z17;
                    if (b.f104224d) {
                        JNIBridge.set(12, z17);
                    }
                    i11++;
                }
                boolean z18 = customInfo2.mOmitNativeCrash;
                boolean z19 = customInfo.mOmitNativeCrash;
                if (z18 != z19) {
                    customInfo2.mOmitNativeCrash = z19;
                    if (b.f104224d) {
                        JNIBridge.set(21, z19);
                    }
                    i11++;
                }
                int i13 = customInfo2.mCrashRestartInterval;
                int i14 = customInfo.mCrashRestartInterval;
                if (i13 != i14) {
                    customInfo2.mCrashRestartInterval = i14;
                    if (b.f104224d) {
                        JNIBridge.set(13, i14);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        b.M();
                    }
                    i11++;
                }
                int i15 = customInfo2.mMaxBuiltinLogFilesCount;
                int i16 = customInfo.mMaxBuiltinLogFilesCount;
                if (i15 != i16) {
                    customInfo2.mMaxBuiltinLogFilesCount = i16;
                    if (b.f104224d) {
                        JNIBridge.set(14, i16);
                    }
                    i11++;
                }
                int i17 = customInfo2.mMaxNativeLogcatLineCount;
                int i18 = customInfo.mMaxNativeLogcatLineCount;
                if (i17 != i18) {
                    customInfo2.mMaxNativeLogcatLineCount = i18;
                    if (b.f104224d) {
                        JNIBridge.set(15, i18);
                    }
                    i11++;
                }
                int i19 = customInfo2.mMaxJavaLogcatLineCount;
                int i20 = customInfo.mMaxJavaLogcatLineCount;
                if (i19 != i20) {
                    customInfo2.mMaxJavaLogcatLineCount = i20;
                    i11++;
                }
                int i21 = customInfo2.mMaxUnexpLogcatLineCount;
                int i22 = customInfo.mMaxUnexpLogcatLineCount;
                if (i21 != i22) {
                    customInfo2.mMaxUnexpLogcatLineCount = i22;
                    if (b.f104224d) {
                        JNIBridge.set(16, i22);
                    }
                    i11++;
                }
                int i23 = customInfo2.mMaxAnrLogcatLineCount;
                int i24 = customInfo.mMaxAnrLogcatLineCount;
                if (i23 != i24) {
                    customInfo2.mMaxAnrLogcatLineCount = i24;
                    if (b.f104224d) {
                        JNIBridge.set(31, i24);
                    }
                    i11++;
                }
                boolean z20 = customInfo2.mZipLog;
                boolean z21 = customInfo.mZipLog;
                if (z20 != z21) {
                    customInfo2.mZipLog = z21;
                    if (!z21) {
                        com.uc.crashsdk.a.a.d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f104310a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i11++;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    z11 = z10;
                } else {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i11++;
                }
                if (z11 && b.f104224d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                int i25 = customInfo2.mLogMaxBytesLimit;
                int i26 = customInfo.mLogMaxBytesLimit;
                if (i25 != i26) {
                    customInfo2.mLogMaxBytesLimit = i26;
                    if (b.f104224d) {
                        JNIBridge.set(4, i26);
                    }
                    i11++;
                }
                boolean z22 = customInfo2.mEncryptLog;
                boolean z23 = customInfo.mEncryptLog;
                if (z22 != z23) {
                    customInfo2.mEncryptLog = z23;
                    if (z23) {
                        com.uc.crashsdk.a.a.d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f104311b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i11++;
                }
                boolean z24 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z25 = customInfo.mSyncUploadSetupCrashLogs;
                if (z24 != z25) {
                    customInfo2.mSyncUploadSetupCrashLogs = z25;
                    i11++;
                }
                boolean z26 = customInfo2.mSyncUploadLogs;
                boolean z27 = customInfo.mSyncUploadLogs;
                if (z26 != z27) {
                    customInfo2.mSyncUploadLogs = z27;
                    i11++;
                }
                int i27 = customInfo2.mMaxCustomLogFilesCount;
                int i28 = customInfo.mMaxCustomLogFilesCount;
                if (i27 != i28) {
                    customInfo2.mMaxCustomLogFilesCount = i28;
                    i11++;
                }
                boolean z28 = customInfo2.mOmitJavaCrash;
                boolean z29 = customInfo.mOmitJavaCrash;
                if (z28 != z29) {
                    customInfo2.mOmitJavaCrash = z29;
                    i11++;
                }
                int i29 = customInfo2.mLogMaxUploadBytesLimit;
                int i30 = customInfo.mLogMaxUploadBytesLimit;
                if (i29 != i30) {
                    customInfo2.mLogMaxUploadBytesLimit = i30;
                    i11++;
                }
                long j10 = customInfo2.mMaxUploadBytesPerDay;
                long j11 = customInfo.mMaxUploadBytesPerDay;
                if (j10 != j11) {
                    customInfo2.mMaxUploadBytesPerDay = j11;
                    i11++;
                }
                int i31 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i32 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i31 != i32) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i32;
                    i11++;
                }
                int i33 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i34 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i33 != i34) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i34;
                    i11++;
                }
                int i35 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i36 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i35 != i36) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i36;
                    i11++;
                }
                int i37 = customInfo2.mMaxAnrLogCountPerProcess;
                int i38 = customInfo.mMaxAnrLogCountPerProcess;
                if (i37 != i38) {
                    customInfo2.mMaxAnrLogCountPerProcess = i38;
                    if (b.f104224d) {
                        JNIBridge.set(32, f104313d.mMaxAnrLogCountPerProcess);
                    }
                    i11++;
                }
                boolean z30 = customInfo2.mCallJavaDefaultHandler;
                boolean z31 = customInfo.mCallJavaDefaultHandler;
                if (z30 != z31) {
                    customInfo2.mCallJavaDefaultHandler = z31;
                    i11++;
                }
                boolean z32 = customInfo2.mCallNativeDefaultHandler;
                boolean z33 = customInfo.mCallNativeDefaultHandler;
                if (z32 != z33) {
                    customInfo2.mCallNativeDefaultHandler = z33;
                    i11++;
                    if (b.f104224d) {
                        JNIBridge.set(5, f104313d.mCallNativeDefaultHandler);
                    }
                }
                boolean z34 = customInfo2.mDumpUserSolibBuildId;
                boolean z35 = customInfo.mDumpUserSolibBuildId;
                if (z34 != z35) {
                    customInfo2.mDumpUserSolibBuildId = z35;
                    i11++;
                    if (b.f104224d) {
                        JNIBridge.set(6, f104313d.mDumpUserSolibBuildId);
                    }
                }
                boolean z36 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z37 = customInfo.mDumpHprofDataForJavaOOM;
                if (z36 != z37) {
                    customInfo2.mDumpHprofDataForJavaOOM = z37;
                    i11++;
                }
                boolean z38 = customInfo2.mRenameFileToDefaultName;
                boolean z39 = customInfo.mRenameFileToDefaultName;
                if (z38 != z39) {
                    customInfo2.mRenameFileToDefaultName = z39;
                    i11++;
                }
                boolean z40 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z41 = customInfo.mAutoDeleteOldVersionStats;
                if (z40 != z41) {
                    customInfo2.mAutoDeleteOldVersionStats = z41;
                    i11++;
                }
                int i39 = customInfo2.mFdDumpMinLimit;
                int i40 = customInfo.mFdDumpMinLimit;
                if (i39 != i40) {
                    customInfo2.mFdDumpMinLimit = i40;
                    if (b.f104224d) {
                        JNIBridge.set(10, i40);
                    }
                    i11++;
                }
                int i41 = customInfo2.mThreadsDumpMinLimit;
                int i42 = customInfo.mThreadsDumpMinLimit;
                if (i41 != i42) {
                    customInfo2.mThreadsDumpMinLimit = i42;
                    if (b.f104224d) {
                        JNIBridge.set(22, i42);
                    }
                    i11++;
                }
                int i43 = customInfo2.mInfoUpdateInterval;
                int i44 = customInfo.mInfoUpdateInterval;
                if (i43 != i44) {
                    if (i43 <= 0 && i44 > 0) {
                        a.a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i11++;
                }
                int i45 = customInfo2.mInfoSaveFrequency;
                int i46 = customInfo.mInfoSaveFrequency;
                if (i45 != i46) {
                    customInfo2.mInfoSaveFrequency = i46;
                    i11++;
                }
                long j12 = customInfo2.mDisableBackgroundSignals;
                long j13 = customInfo.mDisableBackgroundSignals;
                if (j12 != j13) {
                    customInfo2.mDisableBackgroundSignals = j13;
                    if (b.f104224d) {
                        JNIBridge.set(9, j13);
                    }
                    i11++;
                }
                boolean z42 = customInfo2.mEnableStatReport;
                boolean z43 = customInfo.mEnableStatReport;
                if (z42 != z43) {
                    customInfo2.mEnableStatReport = z43;
                    if (z43) {
                        e.B();
                    }
                    i11++;
                }
                boolean z44 = customInfo2.mEnableCrpStat;
                boolean z45 = customInfo.mEnableCrpStat;
                if (z44 != z45) {
                    customInfo2.mEnableCrpStat = z45;
                    i11++;
                }
                boolean z46 = customInfo2.mEnableStatToWPKDirect;
                boolean z47 = customInfo.mEnableStatToWPKDirect;
                if (z46 != z47) {
                    customInfo2.mEnableStatToWPKDirect = z47;
                    i11++;
                }
                boolean z48 = customInfo2.mIsInternational;
                boolean z49 = customInfo.mIsInternational;
                if (z48 != z49) {
                    customInfo2.mIsInternational = z49;
                    if (b.f104224d) {
                        JNIBridge.set(23, z49);
                    }
                    e.l();
                    com.uc.crashsdk.a.d.c();
                    h.k();
                    i11++;
                }
                boolean z50 = customInfo2.mAutoDetectLifeCycle;
                boolean z51 = customInfo.mAutoDetectLifeCycle;
                if (z50 != z51) {
                    customInfo2.mAutoDetectLifeCycle = z51;
                    if (z51) {
                        b.C();
                    }
                    i11++;
                }
                boolean z52 = customInfo2.mMonitorBattery;
                boolean z53 = customInfo.mMonitorBattery;
                if (z52 != z53) {
                    customInfo2.mMonitorBattery = z53;
                    e.c(b.B());
                    i11++;
                }
                int i47 = customInfo2.mUnexpSubTypes;
                int i48 = customInfo.mUnexpSubTypes;
                if (i47 != i48) {
                    customInfo2.mUnexpSubTypes = i48;
                    i11++;
                }
                boolean z54 = customInfo2.mEnableMemoryGroup;
                boolean z55 = customInfo.mEnableMemoryGroup;
                if (z54 != z55) {
                    customInfo2.mEnableMemoryGroup = z55;
                    if (b.f104224d) {
                        JNIBridge.set(35, z55);
                    }
                    i11++;
                }
                boolean z56 = customInfo2.mEnableLibcMallocDetail;
                boolean z57 = customInfo.mEnableLibcMallocDetail;
                if (z56 != z57) {
                    customInfo2.mEnableLibcMallocDetail = z57;
                    if (b.f104224d) {
                        JNIBridge.set(36, z57);
                    }
                    i11++;
                }
                String str4 = customInfo2.mLibcMallocDetailConfig;
                String str5 = customInfo.mLibcMallocDetailConfig;
                if (str4 != str5) {
                    customInfo2.mLibcMallocDetailConfig = str5;
                    if (b.f104224d) {
                        JNIBridge.set(131, str5);
                    }
                    i11++;
                }
                if (!a(customInfo.mUserId, customInfo2.mUserId)) {
                    customInfo2.mUserId = customInfo.mUserId;
                    i11++;
                }
                if (!a(customInfo.mChannel, customInfo2.mChannel)) {
                    customInfo2.mChannel = customInfo.mChannel;
                    i11++;
                }
                if (!a(customInfo2.mCrashLogUploadUrl, customInfo.mCrashLogUploadUrl)) {
                    customInfo2.mCrashLogUploadUrl = customInfo.mCrashLogUploadUrl;
                    i11++;
                }
                if (!a(customInfo2.mCrashRateUploadUrl, customInfo.mCrashRateUploadUrl)) {
                    String str6 = customInfo.mCrashRateUploadUrl;
                    customInfo2.mCrashRateUploadUrl = str6;
                    i11++;
                    if (b.f104224d) {
                        JNIBridge.set(38, str6);
                    }
                }
                if (!a(customInfo2.mCrashSDKAuthUrl, customInfo.mCrashSDKAuthUrl)) {
                    String str7 = customInfo.mCrashSDKAuthUrl;
                    customInfo2.mCrashSDKAuthUrl = str7;
                    i11++;
                    if (b.f104224d) {
                        JNIBridge.set(39, str7);
                    }
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public static void b() {
        JNIBridge.set(103, com.uc.crashsdk.a.g.b());
        JNIBridge.set(104, f104313d.mTagFilesFolderName);
        JNIBridge.set(105, f104313d.mCrashLogsFolderName);
        JNIBridge.set(106, Y());
        JNIBridge.set(107, e.h());
        JNIBridge.set(108, b.a());
        JNIBridge.set(109, T());
        JNIBridge.set(110, U());
        JNIBridge.set(111, V());
        JNIBridge.set(112, "211215141717");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, e.q());
        JNIBridge.set(5, f104313d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f104313d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f104313d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f104313d.mNativeCrashLogFileName);
        JNIBridge.set(101, f104313d.mUnexpCrashLogFileName);
        JNIBridge.set(35, f104313d.mEnableMemoryGroup);
        JNIBridge.set(36, f104313d.mEnableLibcMallocDetail);
        JNIBridge.set(131, f104313d.mLibcMallocDetailConfig);
        JNIBridge.set(102, f104313d.mAppId);
        JNIBridge.set(38, f104313d.mCrashRateUploadUrl);
        JNIBridge.set(39, f104313d.mCrashSDKAuthUrl);
    }

    public static void c() {
        JNIBridge.set(11, P());
        JNIBridge.set(12, f104313d.mBackupLogs);
        JNIBridge.set(13, f104313d.mCrashRestartInterval);
        JNIBridge.set(14, f104313d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f104313d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f104313d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f104313d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, O());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f104313d.mOmitNativeCrash);
        JNIBridge.set(32, f104313d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f104313d.mDisableSignals);
        JNIBridge.set(9, f104313d.mDisableBackgroundSignals);
        CustomInfo customInfo = f104313d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f104313d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    private static void c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (customInfo.mZippedLogExtension.equals(".tmp")) {
            throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
        }
        if (customInfo.mOmitJavaCrash) {
            customInfo.mCallJavaDefaultHandler = false;
        }
        if (customInfo.mOmitNativeCrash) {
            customInfo.mCallNativeDefaultHandler = false;
        }
        long jB = e.b();
        if (jB >= 1) {
            customInfo.mMaxBuiltinLogFilesCount = 200;
            customInfo.mMaxCustomLogFilesCount = 100;
            customInfo.mMaxUploadBytesPerDay = 268435456L;
            customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
            customInfo.mMaxUploadCustomLogCountPerDay = 2000;
            customInfo.mMaxCustomLogCountPerTypePerDay = 100;
            customInfo.mMaxAnrLogCountPerProcess = 100;
            customInfo.mAnrTraceStrategy = 2;
            if (jB >= 2) {
                customInfo.mSyncUploadSetupCrashLogs = true;
                customInfo.mSyncUploadLogs = true;
                if (jB >= 3) {
                    customInfo.mBackupLogs = true;
                    customInfo.mPrintStackInfos = true;
                    customInfo.mDebug = true;
                }
            }
        }
    }

    public static void d() {
        JNIBridge.set(23, f104313d.mIsInternational);
        if (b.H()) {
            JNIBridge.set(34, true);
        }
        if (e.i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f104313d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f104313d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(b.B());
        JNIBridge.set(2, b.F());
        a.e();
        a.g();
        a.i();
        a.k();
        JNIBridge.set(113, a.f104130a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f104313d.mThreadsDumpMinLimit);
        JNIBridge.set(122, a.a());
        JNIBridge.set(33, a.c());
        ae();
        b.K();
        b.D();
        com.uc.crashsdk.a.g.k();
    }

    public static String e() {
        return f104313d.mAppId;
    }

    static boolean f() {
        if (com.uc.crashsdk.a.g.b(f104313d.mJavaCrashLogFileName) || com.uc.crashsdk.a.g.b(f104313d.mNativeCrashLogFileName)) {
            return true;
        }
        return com.uc.crashsdk.a.g.b(f104313d.mUnexpCrashLogFileName);
    }

    static String g() {
        return f104313d.mJavaCrashLogFileName;
    }

    static int h() {
        return f104313d.mCrashRestartInterval;
    }

    static boolean i() {
        return f104313d.mCallJavaDefaultHandler;
    }

    static boolean j() {
        return f104313d.mDumpHprofDataForJavaOOM;
    }

    static boolean k() {
        return f104313d.mRenameFileToDefaultName;
    }

    static int l() {
        return f104313d.mMaxBuiltinLogFilesCount;
    }

    static int m() {
        return f104313d.mMaxCustomLogFilesCount;
    }

    static int n() {
        return f104313d.mMaxJavaLogcatLineCount;
    }

    static int o() {
        return f104313d.mUnexpDelayMillSeconds;
    }

    static int p() {
        return f104313d.mUnexpSubTypes;
    }

    static boolean q() {
        return f104313d.mBackupLogs;
    }

    public static boolean r() {
        return f104313d.mSyncUploadSetupCrashLogs;
    }

    static boolean s() {
        return f104313d.mSyncUploadLogs;
    }

    static boolean t() {
        return f104313d.mOmitJavaCrash;
    }

    static boolean u() {
        return f104313d.mAutoDeleteOldVersionStats;
    }

    static boolean v() {
        return f104313d.mZipLog;
    }

    static String w() {
        return f104313d.mZippedLogExtension;
    }

    static boolean x() {
        return f104313d.mEncryptLog;
    }

    public static String y() {
        return f104313d.mCrashLogUploadUrl;
    }

    public static String z() {
        return f104313d.mCrashRateUploadUrl;
    }
}
