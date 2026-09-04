package androidx.fragment.app;

import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.c1;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FragmentViewModelLazyKt {
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> c(Fragment fragment, yh.a<? extends androidx.lifecycle.y0.b> aVar) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> d(Fragment fragment, yh.a<? extends u2.a> aVar, yh.a<? extends androidx.lifecycle.y0.b> aVar2) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    public static /* synthetic */ kotlin.z e(Fragment fragment, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    public static /* synthetic */ kotlin.z f(Fragment fragment, yh.a aVar, yh.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @androidx.annotation.k0
    public static final /* synthetic */ kotlin.z g(final Fragment fragment, kotlin.reflect.d viewModelClass, yh.a storeProducer, yh.a aVar) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.f0.p(storeProducer, "storeProducer");
        return h(fragment, viewModelClass, storeProducer, new yh.a<u2.a>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, aVar);
    }

    @dl.d
    @androidx.annotation.k0
    public static final <VM extends androidx.lifecycle.w0> kotlin.z<VM> h(@dl.d final Fragment fragment, @dl.d kotlin.reflect.d<VM> viewModelClass, @dl.d yh.a<? extends androidx.lifecycle.b1> storeProducer, @dl.d yh.a<? extends u2.a> extrasProducer, @dl.e yh.a<? extends androidx.lifecycle.y0.b> aVar) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.f0.p(storeProducer, "storeProducer");
        kotlin.jvm.internal.f0.p(extrasProducer, "extrasProducer");
        if (aVar == null) {
            aVar = new yh.a<androidx.lifecycle.y0.b>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // yh.a
                @dl.d
                public final androidx.lifecycle.y0.b invoke() {
                    androidx.lifecycle.y0.b defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                    kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            };
        }
        return new ViewModelLazy(viewModelClass, storeProducer, aVar, extrasProducer);
    }

    public static /* synthetic */ kotlin.z i(Fragment fragment, kotlin.reflect.d dVar, yh.a aVar, yh.a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        return g(fragment, dVar, aVar, aVar2);
    }

    public static /* synthetic */ kotlin.z j(final Fragment fragment, kotlin.reflect.d dVar, yh.a aVar, yh.a aVar2, yh.a aVar3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = new yh.a<u2.a>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final u2.a invoke() {
                    u2.a defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
            };
        }
        if ((i10 & 8) != 0) {
            aVar3 = null;
        }
        return h(fragment, dVar, aVar, aVar2, aVar3);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> k(Fragment fragment, yh.a<? extends c1> ownerProducer, yh.a<? extends androidx.lifecycle.y0.b> aVar) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(ownerProducer, "ownerProducer");
        kotlin.z zVarB = kotlin.b0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(zVarB);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(zVarB);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$viewModels$4(fragment, zVarB);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar);
    }

    @androidx.annotation.k0
    public static final /* synthetic */ <VM extends androidx.lifecycle.w0> kotlin.z<VM> l(Fragment fragment, yh.a<? extends c1> ownerProducer, yh.a<? extends u2.a> aVar, yh.a<? extends androidx.lifecycle.y0.b> aVar2) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(ownerProducer, "ownerProducer");
        kotlin.z zVarB = kotlin.b0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(zVarB);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar, zVarB);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$8(fragment, zVarB);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar2);
    }

    public static /* synthetic */ kotlin.z m(final Fragment fragment, yh.a ownerProducer, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ownerProducer = new yh.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(ownerProducer, "ownerProducer");
        kotlin.z zVarB = kotlin.b0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(zVarB);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(zVarB);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$viewModels$4(fragment, zVarB);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar);
    }

    public static /* synthetic */ kotlin.z n(final Fragment fragment, yh.a ownerProducer, yh.a aVar, yh.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ownerProducer = new yh.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$5
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(ownerProducer, "ownerProducer");
        kotlin.z zVarB = kotlin.b0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        kotlin.jvm.internal.f0.y(4, "VM");
        kotlin.reflect.d dVarD = kotlin.jvm.internal.n0.d(androidx.lifecycle.w0.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(zVarB);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar, zVarB);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$8(fragment, zVarB);
        }
        return h(fragment, dVarD, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 o(kotlin.z<? extends c1> zVar) {
        return zVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 p(kotlin.z<? extends c1> zVar) {
        return zVar.getValue();
    }
}
