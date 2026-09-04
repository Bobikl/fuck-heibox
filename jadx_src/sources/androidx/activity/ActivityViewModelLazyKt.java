package androidx.activity;

import androidx.annotation.k0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.z;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @k0
    public static final /* synthetic */ <VM extends w0> z<VM> a(ComponentActivity componentActivity, yh.a<? extends y0.b> aVar) {
        f0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        f0.y(4, "VM");
        return new ViewModelLazy(n0.d(w0.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @k0
    public static final /* synthetic */ <VM extends w0> z<VM> b(ComponentActivity componentActivity, yh.a<? extends u2.a> aVar, yh.a<? extends y0.b> aVar2) {
        f0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        f0.y(4, "VM");
        return new ViewModelLazy(n0.d(w0.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }

    public static /* synthetic */ z c(ComponentActivity componentActivity, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        f0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        f0.y(4, "VM");
        return new ViewModelLazy(n0.d(w0.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ z d(ComponentActivity componentActivity, yh.a aVar, yh.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        f0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        f0.y(4, "VM");
        return new ViewModelLazy(n0.d(w0.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }
}
