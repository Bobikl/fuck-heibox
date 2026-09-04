package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: FragmentTransaction.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class q0 {
    public static final /* synthetic */ <F extends Fragment> p0 a(p0 p0Var, @androidx.annotation.d0 int i10, String str, Bundle bundle) {
        kotlin.jvm.internal.f0.p(p0Var, "<this>");
        kotlin.jvm.internal.f0.y(4, "F");
        p0 p0VarE = p0Var.e(i10, Fragment.class, bundle, str);
        kotlin.jvm.internal.f0.o(p0VarE, "add(containerViewId, F::class.java, args, tag)");
        return p0VarE;
    }

    public static final /* synthetic */ <F extends Fragment> p0 b(p0 p0Var, String tag, Bundle bundle) {
        kotlin.jvm.internal.f0.p(p0Var, "<this>");
        kotlin.jvm.internal.f0.p(tag, "tag");
        kotlin.jvm.internal.f0.y(4, "F");
        p0 p0VarH = p0Var.h(Fragment.class, bundle, tag);
        kotlin.jvm.internal.f0.o(p0VarH, "add(F::class.java, args, tag)");
        return p0VarH;
    }

    public static /* synthetic */ p0 c(p0 p0Var, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.f0.p(p0Var, "<this>");
        kotlin.jvm.internal.f0.y(4, "F");
        p0 p0VarE = p0Var.e(i10, Fragment.class, bundle, str);
        kotlin.jvm.internal.f0.o(p0VarE, "add(containerViewId, F::class.java, args, tag)");
        return p0VarE;
    }

    public static /* synthetic */ p0 d(p0 p0Var, String tag, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.f0.p(p0Var, "<this>");
        kotlin.jvm.internal.f0.p(tag, "tag");
        kotlin.jvm.internal.f0.y(4, "F");
        p0 p0VarH = p0Var.h(Fragment.class, bundle, tag);
        kotlin.jvm.internal.f0.o(p0VarH, "add(F::class.java, args, tag)");
        return p0VarH;
    }

    public static final /* synthetic */ <F extends Fragment> p0 e(p0 p0Var, @androidx.annotation.d0 int i10, String str, Bundle bundle) {
        kotlin.jvm.internal.f0.p(p0Var, "<this>");
        kotlin.jvm.internal.f0.y(4, "F");
        p0 p0VarB = p0Var.B(i10, Fragment.class, bundle, str);
        kotlin.jvm.internal.f0.o(p0VarB, "replace(containerViewId, F::class.java, args, tag)");
        return p0VarB;
    }

    public static /* synthetic */ p0 f(p0 p0Var, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.f0.p(p0Var, "<this>");
        kotlin.jvm.internal.f0.y(4, "F");
        p0 p0VarB = p0Var.B(i10, Fragment.class, bundle, str);
        kotlin.jvm.internal.f0.o(p0VarB, "replace(containerViewId, F::class.java, args, tag)");
        return p0VarB;
    }
}
