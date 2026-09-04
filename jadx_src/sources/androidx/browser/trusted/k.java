package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PackageIdentityUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3279a = "PackageIdentity";

    /* JADX INFO: compiled from: PackageIdentityUtils.java */
    @w0(28)
    public static class a implements c {
        a() {
        }

        @Override // androidx.browser.trusted.k.c
        @p0
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(k.a(signature));
                }
            } else {
                arrayList.add(k.a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.k.c
        public boolean b(String str, PackageManager packageManager, o oVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> listA;
            if (oVar.h().equals(str) && (listA = a(str, packageManager)) != null) {
                return listA.size() == 1 ? packageManager.hasSigningCertificate(str, oVar.f(0), 1) : oVar.equals(o.c(str, listA));
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: PackageIdentityUtils.java */
    public static class b implements c {
        b() {
        }

        @Override // androidx.browser.trusted.k.c
        @SuppressLint({"PackageManagerGetSignatures"})
        @p0
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] bArrA = k.a(signature);
                if (bArrA == null) {
                    return null;
                }
                arrayList.add(bArrA);
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.k.c
        public boolean b(String str, PackageManager packageManager, o oVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> listA;
            if (str.equals(oVar.h()) && (listA = a(str, packageManager)) != null) {
                return oVar.equals(o.c(str, listA));
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: PackageIdentityUtils.java */
    public interface c {
        @p0
        List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        boolean b(String str, PackageManager packageManager, o oVar) throws PackageManager.NameNotFoundException, IOException;
    }

    private k() {
    }

    @p0
    static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @p0
    static List<byte[]> b(String str, PackageManager packageManager) {
        try {
            return c().a(str, packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f3279a, "Could not get fingerprint for package.", e10);
            return null;
        }
    }

    private static c c() {
        return Build.VERSION.SDK_INT >= 28 ? new a() : new b();
    }

    static boolean d(String str, PackageManager packageManager, o oVar) {
        try {
            return c().b(str, packageManager, oVar);
        } catch (PackageManager.NameNotFoundException | IOException e10) {
            Log.e(f3279a, "Could not check if package matches token.", e10);
            return false;
        }
    }
}
