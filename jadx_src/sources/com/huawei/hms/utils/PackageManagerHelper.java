package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.feature.dynamic.f.e;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes7.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PackageManager f62784a;

    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED,
        SPOOF
    }

    public PackageManagerHelper(Context context) {
        this.f62784a = context.getPackageManager();
    }

    private byte[] a(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f62784a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (AndroidException e10) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e10.getMessage());
        } catch (RuntimeException e11) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.", e11);
        }
        HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public String getApplicationName(String str) {
        try {
            return this.f62784a.getApplicationLabel(this.f62784a.getApplicationInfo(str, 128)).toString();
        } catch (AndroidException unused) {
            HMSLog.e("PackageManagerHelper", "Failed to get application name for " + str);
            return null;
        }
    }

    public long getPackageFirstInstallTime(String str) {
        try {
            PackageInfo packageInfo = this.f62784a.getPackageInfo(str, 128);
            if (packageInfo != null) {
                return packageInfo.firstInstallTime;
            }
            return 0L;
        } catch (AndroidException | RuntimeException unused) {
            return 0L;
        }
    }

    public String getPackageSignature(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length == 0) {
            return null;
        }
        return HEX.encodeHexString(SHA256.digest(bArrA), true);
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            return PackageStates.NOT_INSTALLED;
        }
        try {
            return this.f62784a.getApplicationInfo(str, 128).enabled ? PackageStates.ENABLED : PackageStates.DISABLED;
        } catch (AndroidException unused) {
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) {
        try {
            PackageInfo packageInfo = this.f62784a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (AndroidException e10) {
            HMSLog.e("PackageManagerHelper", "get PackageVersionCode failed " + e10);
            return 0;
        } catch (RuntimeException e11) {
            HMSLog.e("PackageManagerHelper", "get PackageVersionCode failed", e11);
            return 0;
        }
    }

    public String getPackageVersionName(String str) {
        String str2;
        try {
            PackageInfo packageInfo = this.f62784a.getPackageInfo(str, 16);
            return (packageInfo == null || (str2 = packageInfo.versionName) == null) ? "" : str2;
        } catch (AndroidException unused) {
            return "";
        } catch (RuntimeException e10) {
            HMSLog.e("PackageManagerHelper", "get getPackageVersionName failed", e10);
            return "";
        }
    }

    public boolean hasProvider(String str, String str2) {
        ProviderInfo[] providerInfoArr;
        try {
            PackageInfo packageInfo = this.f62784a.getPackageInfo(str, 8);
            if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return false;
    }

    public boolean isPackageFreshInstall(String str) {
        try {
            PackageInfo packageInfo = this.f62784a.getPackageInfo(str, 128);
            return packageInfo != null && packageInfo.firstInstallTime == packageInfo.lastUpdateTime;
        } catch (AndroidException | RuntimeException unused) {
            return false;
        }
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
        PackageInfo packageArchiveInfo;
        InputStream inputStream = null;
        try {
            packageArchiveInfo = this.f62784a.getPackageArchiveInfo(str, 64);
        } catch (Exception e10) {
            HMSLog.e("PackageManagerHelper", "getPackageArchiveInfo Exception. " + e10.getMessage());
            packageArchiveInfo = null;
        }
        if (packageArchiveInfo != null && packageArchiveInfo.signatures.length > 0) {
            try {
                if (!str2.equals(packageArchiveInfo.packageName)) {
                    return false;
                }
                try {
                    inputStream = IOUtils.toInputStream(packageArchiveInfo.signatures[0].toByteArray());
                    return str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance(e.f60731b).generateCertificate(inputStream).getEncoded()), true));
                } catch (IOException | CertificateException e11) {
                    HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e11.getMessage());
                    IOUtils.closeQuietly(inputStream);
                }
            } finally {
                IOUtils.closeQuietly((InputStream) null);
            }
        }
        return false;
    }
}
