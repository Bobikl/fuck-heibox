package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.y0;
import kotlin.DeprecationLevel;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavGraphViewModelLazyKt {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> e(Fragment fragment, @androidx.annotation.d0 int i10, yh.a<? extends y0.b> aVar) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$1 navGraphViewModelLazyKt$navGraphViewModels$1 = new NavGraphViewModelLazyKt$navGraphViewModels$1(zVarC);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$2(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, navGraphViewModelLazyKt$navGraphViewModels$1, aVar);
    }

    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> f(Fragment fragment, @androidx.annotation.d0 int i10, yh.a<? extends u2.a> aVar, yh.a<? extends y0.b> aVar2) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$3 navGraphViewModelLazyKt$navGraphViewModels$3 = new NavGraphViewModelLazyKt$navGraphViewModels$3(aVar, zVarC);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$4(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, navGraphViewModelLazyKt$navGraphViewModels$3, aVar2);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> g(Fragment fragment, String navGraphRoute, yh.a<? extends y0.b> aVar) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(navGraphRoute, "navGraphRoute");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$5 navGraphViewModelLazyKt$navGraphViewModels$5 = new NavGraphViewModelLazyKt$navGraphViewModels$5(zVarC);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$6(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, navGraphViewModelLazyKt$navGraphViewModels$5, aVar);
    }

    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> h(Fragment fragment, String navGraphRoute, yh.a<? extends u2.a> aVar, yh.a<? extends y0.b> aVar2) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(navGraphRoute, "navGraphRoute");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$7 navGraphViewModelLazyKt$navGraphViewModels$7 = new NavGraphViewModelLazyKt$navGraphViewModels$7(aVar, zVarC);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$8(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, navGraphViewModelLazyKt$navGraphViewModels$7, aVar2);
    }

    public static /* synthetic */ kotlin.z i(Fragment fragment, int i10, yh.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$1 navGraphViewModelLazyKt$navGraphViewModels$1 = new NavGraphViewModelLazyKt$navGraphViewModels$1(zVarC);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$2(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, navGraphViewModelLazyKt$navGraphViewModels$1, aVar);
    }

    public static /* synthetic */ kotlin.z j(Fragment fragment, int i10, yh.a aVar, yh.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$3 navGraphViewModelLazyKt$navGraphViewModels$3 = new NavGraphViewModelLazyKt$navGraphViewModels$3(aVar, zVarC);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$4(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, navGraphViewModelLazyKt$navGraphViewModels$3, aVar2);
    }

    public static /* synthetic */ kotlin.z k(Fragment fragment, String navGraphRoute, yh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(navGraphRoute, "navGraphRoute");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$5 navGraphViewModelLazyKt$navGraphViewModels$5 = new NavGraphViewModelLazyKt$navGraphViewModels$5(zVarC);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$6(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, navGraphViewModelLazyKt$navGraphViewModels$5, aVar);
    }

    public static /* synthetic */ kotlin.z l(Fragment fragment, String navGraphRoute, yh.a aVar, yh.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(navGraphRoute, "navGraphRoute");
        kotlin.z zVarC = kotlin.b0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(zVarC);
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        NavGraphViewModelLazyKt$navGraphViewModels$7 navGraphViewModelLazyKt$navGraphViewModels$7 = new NavGraphViewModelLazyKt$navGraphViewModels$7(aVar, zVarC);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$8(zVarC);
        }
        return FragmentViewModelLazyKt.h(fragment, dVarD, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, navGraphViewModelLazyKt$navGraphViewModels$7, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry m(kotlin.z<NavBackStackEntry> zVar) {
        return zVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry n(kotlin.z<NavBackStackEntry> zVar) {
        return zVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry o(kotlin.z<NavBackStackEntry> zVar) {
        return zVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry p(kotlin.z<NavBackStackEntry> zVar) {
        return zVar.getValue();
    }
}
