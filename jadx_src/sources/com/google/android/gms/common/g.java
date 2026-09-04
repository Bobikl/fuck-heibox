package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@s9.b
@v8.a
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static g f52435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile Set f52436d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f52438b;

    public g(@androidx.annotation.n0 Context context) {
        this.f52437a = context.getApplicationContext();
    }

    @androidx.annotation.n0
    @v8.a
    public static g a(@androidx.annotation.n0 Context context) {
        com.google.android.gms.common.internal.p.l(context);
        synchronized (g.class) {
            if (f52435c == null) {
                f0.e(context);
                f52435c = new g(context);
            }
        }
        return f52435c;
    }

    @Nullable
    static final b0 e(PackageInfo packageInfo, b0... b0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        c0 c0Var = new c0(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < b0VarArr.length; i10++) {
            if (b0VarArr[i10].equals(c0Var)) {
                return b0VarArr[i10];
            }
        }
        return null;
    }

    public static final boolean f(@androidx.annotation.n0 PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? e(packageInfo, e0.f52417a) : e(packageInfo, e0.f52417a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final m0 g(String str, boolean z10, boolean z11) {
        m0 m0VarC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return m0.c("null pkg");
        }
        if (str.equals(this.f52438b)) {
            return m0.b();
        }
        if (f0.g()) {
            m0VarC = f0.b(str, f.k(this.f52437a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f52437a.getPackageManager().getPackageInfo(str, 64);
                boolean zK = f.k(this.f52437a);
                if (packageInfo == null) {
                    m0VarC = m0.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        m0VarC = m0.c("single cert required");
                    } else {
                        c0 c0Var = new c0(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        m0 m0VarA = f0.a(str2, c0Var, zK, false);
                        m0VarC = (!m0VarA.f52611a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !f0.a(str2, c0Var, false, true).f52611a) ? m0VarA : m0.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return m0.d("no pkg ".concat(str), e10);
            }
        }
        if (m0VarC.f52611a) {
            this.f52438b = str;
        }
        return m0VarC;
    }

    @v8.a
    public boolean b(@androidx.annotation.n0 PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (f.k(this.f52437a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public boolean c(@androidx.annotation.n0 String str) {
        m0 m0VarG = g(str, false, false);
        m0VarG.e();
        return m0VarG.f52611a;
    }

    @com.google.android.gms.common.internal.t
    @v8.a
    public boolean d(int i10) {
        m0 m0VarC;
        String[] packagesForUid = this.f52437a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            m0VarC = m0.c("no pkgs");
        } else {
            m0VarC = null;
            for (String str : packagesForUid) {
                m0VarC = g(str, false, false);
                if (!m0VarC.f52611a) {
                }
            }
            com.google.android.gms.common.internal.p.l(m0VarC);
        }
        m0VarC.e();
        return m0VarC.f52611a;
    }
}
