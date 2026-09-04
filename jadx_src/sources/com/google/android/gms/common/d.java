package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@v8.a
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f52406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f52407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f52408c;

    static {
        o0 o0Var = new o0();
        o0Var.d("com.google.android.gms");
        o0Var.a(204200000L);
        d0 d0Var = f0.f52431d;
        o0Var.c(zzag.u(d0Var.f1(), f0.f52429b.f1()));
        d0 d0Var2 = f0.f52430c;
        o0Var.b(zzag.u(d0Var2.f1(), f0.f52428a.f1()));
        f52406a = o0Var.e();
        o0 o0Var2 = new o0();
        o0Var2.d("com.android.vending");
        o0Var2.a(82240000L);
        o0Var2.c(zzag.t(d0Var.f1()));
        o0Var2.b(zzag.t(d0Var2.f1()));
        f52407b = o0Var2.e();
        f52408c = new HashMap();
    }
}
