package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.b1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PackageInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: PackageInfoCompat.java */
    @w0(28)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        @p0
        static Signature[] a(@n0 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @androidx.annotation.u
        static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @androidx.annotation.u
        @p0
        static Signature[] c(@n0 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @androidx.annotation.u
        static boolean d(@n0 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @androidx.annotation.u
        static boolean e(@n0 PackageManager packageManager, @n0 String str, @n0 byte[] bArr, int i10) {
            return packageManager.hasSigningCertificate(str, bArr, i10);
        }
    }

    private c() {
    }

    private static boolean a(@n0 byte[][] bArr, @n0 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e10);
        }
    }

    public static long c(@n0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(packageInfo) : packageInfo.versionCode;
    }

    @n0
    public static List<Signature> d(@n0 PackageManager packageManager, @n0 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArrA;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArrA = a.d(signingInfo) ? a.a(signingInfo) : a.c(signingInfo);
        } else {
            signatureArrA = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArrA == null ? Collections.emptyList() : Arrays.asList(signatureArrA);
    }

    public static boolean e(@n0 PackageManager packageManager, @n0 String str, @n0 @b1(min = 1) Map<byte[], Integer> map, boolean z10) throws PackageManager.NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr : setKeySet) {
            if (bArr == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> listD = d(packageManager, str);
        if (!z10 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr2 : setKeySet) {
                if (!a.e(packageManager, str, bArr2, map.get(bArr2).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (listD.size() != 0 && map.size() <= listD.size() && (!z10 || map.size() == listD.size())) {
            byte[][] bArr3 = null;
            if (map.containsValue(1)) {
                bArr3 = new byte[listD.size()][];
                for (int i10 = 0; i10 < listD.size(); i10++) {
                    bArr3[i10] = b(listD.get(i10).toByteArray());
                }
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!a(bArr3, next)) {
                        return false;
                    }
                } else if (!listD.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
