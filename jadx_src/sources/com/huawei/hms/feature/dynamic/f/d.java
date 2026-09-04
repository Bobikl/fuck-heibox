package com.huawei.hms.feature.dynamic.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60727a = "SignVerifier";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f60728b = "com.huawei.hms.fingerprint_signature";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f60729c = "com.huawei.hms.sign_certchain";

    public static String a(PackageInfo packageInfo) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            Logger.e(f60727a, "Failed to get application signature certificate fingerprint.");
            return null;
        }
        byte[] byteArray = signatureArr[0].toByteArray();
        if (byteArray == null || byteArray.length == 0) {
            return null;
        }
        return b.b(a(byteArray), true);
    }

    public static boolean a(Context context, String str) {
        String string;
        ApplicationInfo applicationInfo;
        StringBuilder sb2;
        String str2;
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 192);
        if (packageArchiveInfo == null || (applicationInfo = packageArchiveInfo.applicationInfo) == null) {
            string = "PackageArchiveInfo is null.";
        } else {
            String str3 = packageArchiveInfo.packageName;
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                sb2 = new StringBuilder();
                sb2.append("Verify package ");
                sb2.append(str3);
                str2 = " failed for metadata is null.";
            } else if (!bundle.containsKey(f60728b)) {
                sb2 = new StringBuilder();
                sb2.append("Verify package ");
                sb2.append(str3);
                str2 = " failed for no signer.";
            } else if (bundle.containsKey(f60729c)) {
                String strA = a(packageArchiveInfo);
                if (TextUtils.isEmpty(strA)) {
                    string = "Get PackageSignature failed: null.";
                } else {
                    if (a(bundle.getString(f60728b), bundle.getString(f60729c), str3 + "&" + strA)) {
                        Logger.i(f60727a, "verify signature with cert chain success.");
                        return true;
                    }
                    string = "Check CertChain failed.";
                }
            } else {
                sb2 = new StringBuilder();
                sb2.append("Verify package ");
                sb2.append(str3);
                str2 = " failed for no cert chain.";
            }
            sb2.append(str2);
            string = sb2.toString();
        }
        Logger.e(f60727a, string);
        return false;
    }

    public static boolean a(String str) {
        String str2;
        try {
            new ZipFile(str).close();
            return true;
        } catch (ZipException unused) {
            str2 = "Check module file ZipException: not a valid zip.";
            Logger.w(f60727a, str2);
            return false;
        } catch (IOException unused2) {
            str2 = "Check module file IOException";
            Logger.w(f60727a, str2);
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str4 = "Args is invalid.";
        } else {
            List<X509Certificate> listB = e.b(str2);
            if (listB.size() == 0) {
                str4 = "CertChain is empty.";
            } else if (e.a(e.a(), listB)) {
                X509Certificate x509Certificate = listB.get(0);
                if (!e.a(x509Certificate, "Huawei CBG HMS Kit")) {
                    str4 = "CN is invalid";
                } else if (e.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                    byte[] bytes = null;
                    try {
                        bytes = str3.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e10) {
                        Logger.e(f60727a, "checkCertChain UnsupportedEncodingException:", e10);
                    }
                    if (e.a(x509Certificate, bytes, a.a(str))) {
                        return true;
                    }
                    str4 = "signature is invalid: ";
                } else {
                    str4 = "OU is invalid";
                }
            } else {
                str4 = "failed to verify cert chain";
            }
        }
        Logger.e(f60727a, str4);
        return false;
    }

    public static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            Logger.e(f60727a, "NoSuchAlgorithmException" + e10.getMessage());
            return new byte[0];
        }
    }

    public static boolean b(Context context, String str) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "The context is null or module path is invalid.";
        } else if (!a(str)) {
            str2 = "The module file is in wrong format.";
        } else {
            if (a(context, str)) {
                return true;
            }
            str2 = "check signature failed.";
        }
        Logger.e(f60727a, str2);
        return false;
    }
}
