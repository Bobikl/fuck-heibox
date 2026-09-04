package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UMFrUtils {
    private static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    private static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    private static String mDefaultEnvelopeDir = "envelope";
    private static String mDefaultEnvelopeDirPath = null;
    private static Object mEnvelopeBuildTimeLock = new Object();
    private static Object mEnvelopeFileLock = new Object();
    private static String sCurrentProcessName = "";

    private static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(applicationContext, th2);
            return false;
        }
    }

    public static int envelopeFileNumber(Context context) {
        String[] list;
        if (context != null) {
            try {
                File file = new File(getEnvelopeDirPath(context));
                synchronized (mEnvelopeFileLock) {
                    if (file.isDirectory() && (list = file.list()) != null) {
                        return list.length;
                    }
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
        }
        return 0;
    }

    public static String getCurrentProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(sCurrentProcessName)) {
            try {
                int iMyPid = Process.myPid();
                String processName = getProcessName(iMyPid);
                if (TextUtils.isEmpty(processName)) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.pid == iMyPid) {
                                sCurrentProcessName = runningAppProcessInfo.processName;
                                break;
                            }
                        }
                    }
                } else {
                    sCurrentProcessName = processName;
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context.getApplicationContext(), th2);
            }
        }
        return sCurrentProcessName;
    }

    private static long getDistanceDays(long j10, long j11) {
        return (j10 < j11 ? j11 - j10 : j10 - j11) / 86400000;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    mDefaultEnvelopeDirPath = context.getFilesDir().getAbsolutePath() + File.separator + "." + mDefaultEnvelopeDir;
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.d("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
            str = mDefaultEnvelopeDirPath;
        }
        return str;
    }

    public static File getEnvelopeFile(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.UMFrUtils.2
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long jLastModified = file2.lastModified() - file3.lastModified();
                        if (jLastModified > 0) {
                            return 1;
                        }
                        return jLastModified == 0 ? 0 : -1;
                    }
                });
                return fileArrListFiles[0];
            }
            return null;
        }
    }

    public static long getLastInstantBuildTime(Context context) {
        long j10;
        synchronized (mEnvelopeBuildTimeLock) {
            j10 = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, 0L);
        }
        return j10;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j10;
        synchronized (mEnvelopeBuildTimeLock) {
            j10 = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_SUCC_BUILD_TIME, 0L);
        }
        return j10;
    }

    public static String getLegacyEnvelopeDir(Context context) {
        try {
            String processName = getProcessName(Process.myPid());
            if (!TextUtils.isEmpty(processName)) {
                String strReplace = processName.replace(':', '_');
                ULog.d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                return strReplace;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    ULog.d("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                    return mDefaultEnvelopeDir;
                }
                if (runningAppProcesses.size() == 0) {
                    return mDefaultEnvelopeDir;
                }
                try {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == Process.myPid()) {
                            String strReplace2 = runningAppProcessInfo.processName.replace(':', '_');
                            ULog.d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                            return strReplace2;
                        }
                    }
                } catch (Throwable th2) {
                    UMCrashManager.reportCrash(context, th2);
                }
            }
        } catch (Throwable th3) {
            UMCrashManager.reportCrash(context, th3);
        }
        return mDefaultEnvelopeDir;
    }

    private static String getProcessName(int i10) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i10 + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                return line;
            } catch (Throwable unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
    }

    public static String getSubProcessName(Context context) {
        String strSubstring = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int iIndexOf = currentProcessName.indexOf(":");
            strSubstring = iIndexOf >= 0 ? currentProcessName.substring(iIndexOf + 1) : "";
            if (iIndexOf < 0) {
                String packageName = context.getPackageName();
                return currentProcessName.length() > packageName.length() ? currentProcessName.substring(packageName.length() + 1, currentProcessName.length()) : currentProcessName;
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th2);
        }
        return strSubstring;
    }

    public static boolean hasEnvelopeFile(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        String str = ak.av;
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
            str = "i";
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_ZeroEnv) {
            str = ak.aD;
        }
        String envelopeDirPath = getEnvelopeDirPath(context);
        if (envelopeDirPath == null) {
            return false;
        }
        File file = new File(envelopeDirPath);
        synchronized (mEnvelopeFileLock) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.getName().startsWith(str)) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(context, th2);
            }
        }
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th2);
            return false;
        }
    }

    public static boolean removeEnvelopeFile(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        return file.delete();
                    }
                } catch (Throwable th2) {
                    UMCrashManager.reportCrash(appContext, th2);
                }
            }
            return true;
        }
    }

    public static void removeRedundantEnvelopeFiles(Context context, int i10) {
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > i10) {
                    Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.UMFrUtils.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(File file2, File file3) {
                            long jLastModified = file2.lastModified() - file3.lastModified();
                            if (jLastModified > 0) {
                                return 1;
                            }
                            return jLastModified == 0 ? 0 : -1;
                        }
                    });
                    if (fileArrListFiles.length > i10) {
                        for (int i11 = 0; i11 < fileArrListFiles.length - i10; i11++) {
                            try {
                                if (!fileArrListFiles[i11].delete()) {
                                    ULog.d("--->>> remove [" + i11 + "] file fail.");
                                }
                            } catch (Throwable th2) {
                                UMCrashManager.reportCrash(context, th2);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static int saveEnvelopeFile(Context context, String str, byte[] bArr) {
        if (bArr == null) {
            return 101;
        }
        File file = new File(getEnvelopeDirPath(context) + File.separator + str);
        synchronized (mEnvelopeFileLock) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(bArr);
                        fileOutputStream2.close();
                        boolean zA = com.umeng.commonsdk.statistics.internal.a.a(context).a(str);
                        boolean zB = com.umeng.commonsdk.statistics.internal.a.a(context).b(str);
                        if (zA) {
                            updateLastSuccessfulBuildTime(context);
                        }
                        if (zB) {
                            updateLastInstantBuildTime(context);
                        }
                        return 0;
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        UMCrashManager.reportCrash(context, e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                UMCrashManager.reportCrash(context, th2);
                            }
                        }
                        return 101;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                UMCrashManager.reportCrash(context, th4);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context == null) {
            return;
        }
        try {
            String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
            if (TextUtils.isEmpty(legacyEnvelopeDir) || legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                return;
            }
            File file = new File(context.getFilesDir().getAbsolutePath() + "/." + legacyEnvelopeDir);
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    try {
                        if (file.isDirectory()) {
                            file.delete();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        UMCrashManager.reportCrash(context, th2);
                        return;
                    }
                }
                try {
                    String envelopeDirPath = getEnvelopeDirPath(context);
                    for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                        fileArrListFiles[i10].renameTo(new File(envelopeDirPath + File.separator + fileArrListFiles[i10].getName()));
                    }
                    if (file.isDirectory()) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    UMCrashManager.reportCrash(context, th3);
                    return;
                }
                UMCrashManager.reportCrash(context, th);
            }
        } catch (Throwable th4) {
            UMCrashManager.reportCrash(context, th4);
        }
    }

    public static byte[] toByteArray(String str) throws IOException {
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            FileChannel channel = null;
            try {
                try {
                    channel = new RandomAccessFile(str, "r").getChannel();
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                    bArr = new byte[(int) channel.size()];
                    if (mappedByteBufferLoad.remaining() > 0) {
                        mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                        try {
                            channel.close();
                        } catch (Throwable th2) {
                            UMCrashManager.reportCrash(appContext, th2);
                        }
                    } else {
                        channel.close();
                    }
                } catch (IOException e10) {
                    UMCrashManager.reportCrash(appContext, e10);
                    throw e10;
                }
            } catch (Throwable th3) {
                try {
                    channel.close();
                } catch (Throwable th4) {
                    UMCrashManager.reportCrash(appContext, th4);
                }
                throw th3;
            }
            throw th;
        }
        return bArr;
    }

    private static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    private static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }
}
