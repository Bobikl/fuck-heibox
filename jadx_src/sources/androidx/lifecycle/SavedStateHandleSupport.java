package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,225:1\n1#2:226\n31#3:227\n63#3,2:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:227\n110#1:228,2\n*E\n"})
@xh.h(name = "SavedStateHandleSupport")
public final class SavedStateHandleSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f24113a = "androidx.lifecycle.internal.SavedStateHandlesVM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f24114b = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final u2.a.b<androidx.savedstate.d> f24115c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final u2.a.b<c1> f24116d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final u2.a.b<Bundle> f24117e = new a();

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class a implements u2.a.b<Bundle> {
        a() {
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class b implements u2.a.b<androidx.savedstate.d> {
        b() {
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class c implements u2.a.b<c1> {
        c() {
        }
    }

    private static final q0 a(androidx.savedstate.d dVar, c1 c1Var, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProviderD = d(dVar);
        r0 r0VarE = e(c1Var);
        q0 q0Var = r0VarE.c().get(str);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0VarA = q0.f24236f.a(savedStateHandlesProviderD.a(str), bundle);
        r0VarE.c().put(str, q0VarA);
        return q0VarA;
    }

    @dl.d
    @androidx.annotation.k0
    public static final q0 b(@dl.d u2.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        androidx.savedstate.d dVar = (androidx.savedstate.d) aVar.a(f24115c);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c1 c1Var = (c1) aVar.a(f24116d);
        if (c1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f24117e);
        String str = (String) aVar.a(y0.c.f24300d);
        if (str != null) {
            return a(dVar, c1Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.k0
    public static final <T extends androidx.savedstate.d & c1> void c(@dl.d T t10) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        Lifecycle.State stateB = t10.getLifecycle().b();
        if (!(stateB == Lifecycle.State.INITIALIZED || stateB == Lifecycle.State.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().c(f24114b) == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().j(f24114b, savedStateHandlesProvider);
            t10.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    @dl.d
    public static final SavedStateHandlesProvider d(@dl.d androidx.savedstate.d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        androidx.savedstate.b.c cVarC = dVar.getSavedStateRegistry().c(f24114b);
        SavedStateHandlesProvider savedStateHandlesProvider = cVarC instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) cVarC : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @dl.d
    public static final r0 e(@dl.d c1 c1Var) {
        kotlin.jvm.internal.f0.p(c1Var, "<this>");
        u2.c cVar = new u2.c();
        cVar.a(kotlin.jvm.internal.n0.d(r0.class), new yh.l<u2.a, r0>() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r0 invoke(@dl.d u2.a initializer) {
                kotlin.jvm.internal.f0.p(initializer, "$this$initializer");
                return new r0();
            }
        });
        return (r0) new y0(c1Var, cVar.b()).b(f24113a, r0.class);
    }
}
