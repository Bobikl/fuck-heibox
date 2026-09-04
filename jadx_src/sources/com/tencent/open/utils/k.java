package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import com.tencent.open.log.SLog;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, com.tencent.a.a.a> f101186a = new ConcurrentHashMap<>();

    public static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i10 = 0;
        while (i10 < strArrSplit.length && i10 < strArrSplit2.length) {
            try {
                int i11 = Integer.parseInt(strArrSplit[i10]);
                int i12 = Integer.parseInt(strArrSplit2[i10]);
                if (i11 < i12) {
                    return -1;
                }
                if (i11 > i12) {
                    return 1;
                }
                i10++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i10) {
            return 1;
        }
        return strArrSplit2.length > i10 ? -1 : 0;
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 == -1) {
                SLog.i("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j10);
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static String a(int i10) {
        if (i10 == 10103) {
            return "shareToQQ";
        }
        if (i10 == 10104) {
            return "shareToQzone";
        }
        if (i10 == 10105) {
            return "addToQQFavorites";
        }
        if (i10 == 10106) {
            return "sendToMyComputer";
        }
        if (i10 == 10107) {
            return "shareToTroopBar";
        }
        if (i10 == 11101) {
            return "action_login";
        }
        if (i10 == 10100) {
            return "action_request";
        }
        if (i10 != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    public static String a(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            SLog.i("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e10) {
            SLog.e("openSDK_LOG.SystemUtils", "NameNotFoundException", e10);
            return null;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.SystemUtils", "Exception", e11);
            return null;
        }
    }

    public static String a(Activity activity, String str) {
        if (activity == null) {
            SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName activity==null !!!!!!");
            return "";
        }
        try {
            byte[] bArrA = e.a(str);
            if (bArrA == null) {
                SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName shaBytes==null !!!!!!");
                return "";
            }
            byte[] bArr = new byte[8];
            System.arraycopy(bArrA, 5, bArr, 0, 8);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrA, 8, bArr2, 0, 16);
            return e.a(activity.getPackageName(), e.a(bArr2), bArr);
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.SystemUtils", "getEncryptPkgName", e10);
            return "";
        }
    }

    public static String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.SystemUtils", "getAppName exception", th2);
            try {
                int i10 = applicationInfo.labelRes;
                return i10 <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10);
            } catch (Throwable th3) {
                SLog.e("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th3);
                return "";
            }
        }
    }

    public static String a(Context context, String str) {
        String strA = h.a(context, c(), str);
        if (strA != null && !"UNKNOWN".equals(strA)) {
            return strA;
        }
        PackageInfo packageInfoE = e(context, str);
        if (packageInfoE != null) {
            return packageInfoE.versionName;
        }
        SLog.e("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
        return null;
    }

    public static void a() {
        f101186a.clear();
    }

    public static void a(String str) {
        if (str == null) {
            return;
        }
        f101186a.remove(str);
    }

    public static boolean a(Context context, Intent intent) {
        if (context == null || intent == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isActivityExist params error! [");
            sb2.append(context == null);
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(intent == null);
            sb2.append("]");
            SLog.e("openSDK_LOG.SystemUtils", sb2.toString());
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        boolean z10 = listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
        if (!z10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("isActivityExist false. result=");
            sb3.append(listQueryIntentActivities == null ? "null" : Integer.valueOf(listQueryIntentActivities.size()));
            sb3.append(" Intent= ");
            sb3.append(intent);
            SLog.e("openSDK_LOG.SystemUtils", sb3.toString());
        }
        return z10;
    }

    public static boolean a(Context context, String str, String str2) {
        SLog.v("openSDK_LOG.SystemUtils", "OpenUi, validateAppSignatureForPackage");
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                if (m.g(signature.toCharsString()).equals(str2)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    @SuppressLint({"SdCardPath"})
    public static boolean a(String str, String str2, int i10) {
        FileOutputStream fileOutputStream;
        SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: " + str);
        Context contextA = g.a();
        if (contextA == null) {
            SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
            return false;
        }
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("secure_lib", 0);
        File file = new File(contextA.getFilesDir(), str2);
        if (file.exists()) {
            int i11 = sharedPreferences.getInt("version", 0);
            SLog.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: " + i10 + " | oldVersion: " + i11);
            if (i10 == i11) {
                return true;
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
        InputStream inputStream = null;
        fileOutputStreamOpenFileOutput = null;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = contextA.getAssets().open(str);
            try {
                fileOutputStreamOpenFileOutput = contextA.openFileOutput(str2, 0);
                a(inputStreamOpen, fileOutputStreamOpenFileOutput);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("version", i10);
                editorEdit.commit();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (Exception e11) {
                e = e11;
                FileOutputStream fileOutputStream2 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream2;
                try {
                    SLog.e("openSDK_LOG.SystemUtils", "-->extractSecureLib, when copy lib execption.", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                FileOutputStream fileOutputStream3 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream3;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    throw th;
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static int b(String str) {
        if ("shareToQQ".equals(str)) {
            return 10103;
        }
        if ("shareToQzone".equals(str)) {
            return 10104;
        }
        if ("addToQQFavorites".equals(str)) {
            return 10105;
        }
        if ("sendToMyComputer".equals(str)) {
            return 10106;
        }
        if ("shareToTroopBar".equals(str)) {
            return 10107;
        }
        if ("action_login".equals(str)) {
            return 11101;
        }
        return "action_request".equals(str) ? 10100 : -1;
    }

    public static String b(Context context, String str) {
        String strA = "";
        SLog.v("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString");
        try {
            String packageName = context.getPackageName();
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(signatureArr[0].toByteArray());
            String strA2 = m.a(messageDigest.digest());
            messageDigest.reset();
            SLog.v("openSDK_LOG.SystemUtils", "-->sign: " + strA2);
            messageDigest.update(m.j(packageName + lg.a.f131412e + strA2 + lg.a.f131412e + str + ""));
            strA = m.a(messageDigest.digest());
            messageDigest.reset();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("-->signEncryped: ");
            sb2.append(strA);
            SLog.v("openSDK_LOG.SystemUtils", sb2.toString());
            return strA;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", e10);
            return strA;
        }
    }

    private static boolean b() {
        try {
            return ((Boolean) Environment.class.getMethod("isExternalStorageLegacy", new Class[0]).invoke(Environment.class, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        boolean zG = g(context, "com.tencent.mobileqq");
        SLog.i("openSDK_LOG.SystemUtils", "isQQInstalled " + zG);
        return zG;
    }

    public static boolean b(Context context, Intent intent) {
        boolean z10 = false;
        if (context != null && intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                SLog.i("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String strA = a(context, packageName);
            if (strA != null && !strA.isEmpty()) {
                z10 = true;
            }
            SLog.i("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + strA);
        }
        return z10;
    }

    public static int c(Context context, String str) {
        return a(a(context, "com.tencent.mobileqq"), str);
    }

    private static String c() {
        String strB = com.tencent.open.b.b.b();
        if (strB == null || strB.isEmpty()) {
            SLog.e("openSDK_LOG.SystemUtils", "getAppId error: " + strB);
        }
        return strB;
    }

    public static boolean c(Context context) {
        if (g(context, "com.tencent.mobileqq")) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: qq");
            return true;
        }
        if (g(context, com.tencent.connect.common.Constants.PACKAGE_TIM)) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: tim");
            return true;
        }
        if (g(context, com.tencent.connect.common.Constants.PACKAGE_QQ_PAD)) {
            SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: pad");
            return true;
        }
        SLog.i("openSDK_LOG.SystemUtils", "isQQBranchInstalled: disable speed");
        return false;
    }

    public static int d(Context context, String str) {
        return a(a(context, com.tencent.connect.common.Constants.PACKAGE_TIM), str);
    }

    public static boolean d(Context context) {
        return context != null && context.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29 && !b();
    }

    private static PackageInfo e(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (k.class) {
            if (!f101186a.containsKey(str)) {
                PackageInfo packageInfoF = f(context, str);
                f101186a.put(str, new com.tencent.a.a.a(str, packageInfoF));
                return packageInfoF;
            }
            com.tencent.a.a.a aVar = f101186a.get(str);
            if (aVar == null) {
                SLog.e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                return null;
            }
            PackageInfo packageInfo = aVar.f98730b;
            if (packageInfo == null) {
                SLog.e("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
            }
            return packageInfo;
        }
    }

    private static PackageInfo f(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                SLog.e("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            }
            return packageInfo;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.SystemUtils", "realGetPackageInfo exception", e10);
            return null;
        }
    }

    private static boolean g(Context context, String str) {
        return (h.a(context, c(), str) == null && e(context, str) == null) ? false : true;
    }
}
