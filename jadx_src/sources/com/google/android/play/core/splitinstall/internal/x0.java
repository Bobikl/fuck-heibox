package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class x0 implements a1, w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f56328c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile a1 f56329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f56330b = f56328c;

    private x0(a1 a1Var) {
        this.f56329a = a1Var;
    }

    public static w0 a(a1 a1Var) {
        return a1Var instanceof w0 ? (w0) a1Var : new x0(a1Var);
    }

    public static a1 b(a1 a1Var) {
        a1Var.getClass();
        return a1Var instanceof x0 ? a1Var : new x0(a1Var);
    }

    @Override // com.google.android.play.core.splitinstall.internal.a1
    public final Object zza() {
        Object objZza = this.f56330b;
        Object obj = f56328c;
        if (objZza == obj) {
            synchronized (this) {
                objZza = this.f56330b;
                if (objZza == obj) {
                    objZza = this.f56329a.zza();
                    Object obj2 = this.f56330b;
                    if (obj2 != obj && obj2 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f56330b = objZza;
                    this.f56329a = null;
                }
            }
        }
        return objZza;
    }
}
