package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@s9.b
public final class f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile com.google.android.gms.common.internal.c0 f52432e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f52434g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d0 f52428a = new x(b0.r0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final d0 f52429b = new y(b0.r0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final d0 f52430c = new z(b0.r0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d0 f52431d = new a0(b0.r0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f52433f = new Object();

    static m0 a(String str, b0 b0Var, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, b0Var, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static m0 b(String str, boolean z10, boolean z11, boolean z12) {
        return i(str, z10, false, false, true);
    }

    static m0 c(String str, boolean z10, boolean z11, boolean z12) {
        return i(str, z10, false, false, false);
    }

    static /* synthetic */ String d(boolean z10, String str, b0 b0Var) throws Exception {
        String str2 = true != (!z10 && h(str, b0Var, true, false).f52611a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = z8.a.b("SHA-256");
        com.google.android.gms.common.internal.p.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, z8.n.a(messageDigestB.digest(b0Var.f1())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void e(Context context) {
        if (f52434g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f52434g = context.getApplicationContext();
        }
    }

    static boolean f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                return f52432e.D();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return false;
        }
    }

    static boolean g() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                return f52432e.B();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return false;
        }
    }

    private static m0 h(final String str, final b0 b0Var, final boolean z10, boolean z11) {
        try {
            j();
            com.google.android.gms.common.internal.p.l(f52434g);
            try {
                return f52432e.T0(new zzs(str, b0Var, z10, z11), com.google.android.gms.dynamic.e.f1(f52434g.getPackageManager())) ? m0.b() : new k0(new Callable() { // from class: com.google.android.gms.common.w
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return f0.d(z10, str, b0Var);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return m0.d("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return m0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.c] */
    private static m0 i(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        m0 m0VarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.p.l(f52434g);
            try {
                j();
                zzo zzoVar = new zzo(str, z10, false, com.google.android.gms.dynamic.e.f1(f52434g), false);
                try {
                    zzq zzqVarA0 = z13 ? f52432e.a0(zzoVar) : f52432e.d0(zzoVar);
                    if (zzqVarA0.c()) {
                        m0VarD = m0.f(zzqVarA0.d());
                    } else {
                        String strB = zzqVarA0.b();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarA0.f() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strB == null) {
                            strB = "error checking package certificate";
                        }
                        m0VarD = m0.g(zzqVarA0.d(), zzqVarA0.f(), strB, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    m0VarD = m0.d("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                m0VarD = m0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            return m0VarD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static void j() throws DynamiteModule.LoadingException {
        if (f52432e != null) {
            return;
        }
        com.google.android.gms.common.internal.p.l(f52434g);
        synchronized (f52433f) {
            if (f52432e == null) {
                f52432e = com.google.android.gms.common.internal.b0.N(DynamiteModule.e(f52434g, DynamiteModule.f52683j, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
