package com.huawei.secure.android.common.sign;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.secure.android.common.util.LogsUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class HiPkgSignManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62921a = "HiPkgSignManager";

    private static PackageInfo a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageArchiveInfo(str, 64);
            }
            return null;
        } catch (Exception e10) {
            LogsUtil.e(f62921a, "Exception : " + e10.getMessage(), true);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            if ((b10 & 255) < 16) {
                stringBuffer.append("0" + Integer.toHexString(bArr[i10] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(b10 & 255));
            }
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }

    private static List<String> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        if (signatureArr != null && signatureArr.length != 0) {
            for (Signature signature : signatureArr) {
                arrayList.add(b(signature.toByteArray()));
            }
        }
        return arrayList;
    }

    private static String b(byte[] bArr) {
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e10) {
            LogsUtil.e(f62921a, "NoSuchAlgorithmException" + e10.getMessage());
            return "";
        }
    }

    public static boolean doCheckArchiveApk(Context context, String str, String str2, String str3) {
        PackageInfo packageInfoA;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || context == null || TextUtils.isEmpty(str3) || (packageInfoA = a(context, str2)) == null) {
            return false;
        }
        return str.equalsIgnoreCase(b(packageInfoA.signatures[0].toByteArray())) && str3.equals(packageInfoA.packageName);
    }

    public static boolean doCheckInstalled(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        return str.equalsIgnoreCase(getInstalledAppHash(context, str2));
    }

    public static boolean doCheckInstalledV2V3(Context context, List<String> list, String str) {
        List<String> installedAppHashV2V3;
        if (TextUtils.isEmpty(str) || list == null || context == null || (installedAppHashV2V3 = getInstalledAppHashV2V3(context, str)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
        }
        Iterator<String> it2 = installedAppHashV2V3.iterator();
        while (it2.hasNext()) {
            if (!arrayList.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static byte[] getInstalledAPPSignature(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            LogsUtil.e(f62921a, "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            LogsUtil.e(f62921a, "PackageManager.NameNotFoundException : " + e10.getMessage(), true);
        } catch (Exception e11) {
            LogsUtil.e(f62921a, "Exception : " + e11.getMessage(), true);
        }
        return new byte[0];
    }

    public static String getInstalledAppHash(Context context, String str) {
        byte[] installedAPPSignature = getInstalledAPPSignature(context, str);
        return (installedAPPSignature == null || installedAPPSignature.length <= 0) ? "" : b(installedAPPSignature);
    }

    public static List<String> getInstalledAppHashV2V3(Context context, String str) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo != null && (signingInfo = packageInfo.signingInfo) != null) {
                    return signingInfo.hasMultipleSigners() ? a(packageInfo.signingInfo.getApkContentsSigners()) : a(packageInfo.signingInfo.getSigningCertificateHistory());
                }
                return null;
            }
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            if (packageInfo2 != null && (signatureArr = packageInfo2.signatures) != null && signatureArr.length != 0 && signatureArr[0] != null) {
                return a(signatureArr);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static String getUnInstalledAPPPackageName(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogsUtil.e(f62921a, "archiveFilePath is null or context is null");
            return "";
        }
        PackageInfo packageInfoA = a(context, str);
        return packageInfoA != null ? packageInfoA.packageName : "";
    }

    public static byte[] getUnInstalledAPPSignature(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogsUtil.e(f62921a, "archiveFilePath is null or context is null");
            return new byte[0];
        }
        PackageInfo packageInfoA = a(context, str);
        if (packageInfoA != null) {
            Signature signature = packageInfoA.signatures[0];
            if (signature != null) {
                return signature.toByteArray();
            }
        } else {
            LogsUtil.e(f62921a, "PackageInfo is null ");
        }
        return new byte[0];
    }

    public static String getUnInstalledAppHash(Context context, String str) {
        byte[] unInstalledAPPSignature = getUnInstalledAPPSignature(context, str);
        return (unInstalledAPPSignature == null || unInstalledAPPSignature.length <= 0) ? "" : b(unInstalledAPPSignature);
    }
}
