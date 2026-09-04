package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.p0;
import com.google.errorprone.annotations.RestrictedInheritance;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@s9.b
@v8.a
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static s f52583b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile q f52584a;

    private static s c() {
        s sVar;
        synchronized (s.class) {
            if (f52583b == null) {
                f52583b = new s();
            }
            sVar = f52583b;
        }
        return sVar;
    }

    @com.google.android.gms.common.internal.t
    @androidx.annotation.n0
    @v8.a
    public k a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        boolean zK = f.k(context);
        c();
        if (!f0.f()) {
            throw new zzae();
        }
        String strConcat = String.valueOf(str).concat(true != zK ? "-0" : "-1");
        if (this.f52584a != null && this.f52584a.f52623a.equals(strConcat)) {
            return this.f52584a.f52624b;
        }
        c();
        m0 m0VarC = f0.c(str, zK, false, false);
        if (m0VarC.f52611a) {
            this.f52584a = new q(strConcat, k.d(str, m0VarC.f52614d));
            return this.f52584a.f52624b;
        }
        com.google.android.gms.common.internal.p.l(m0VarC.f52612b);
        return k.a(str, m0VarC.f52612b, m0VarC.f52613c);
    }

    @com.google.android.gms.common.internal.t
    @androidx.annotation.n0
    @v8.a
    public k b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        try {
            k kVarA = a(context, str);
            kVarA.b();
            return kVarA;
        } catch (SecurityException e10) {
            k kVarA2 = a(context, str);
            if (!kVarA2.c()) {
                return kVarA2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e10);
            return kVarA2;
        }
    }
}
