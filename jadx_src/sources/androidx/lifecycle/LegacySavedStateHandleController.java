package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LegacySavedStateHandleController f24018a = new LegacySavedStateHandleController();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f24019b = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
    public static final class a implements androidx.savedstate.b.a {
        @Override // androidx.savedstate.b.a
        public void a(@dl.d androidx.savedstate.d owner) {
            kotlin.jvm.internal.f0.p(owner, "owner");
            if (!(owner instanceof c1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            b1 viewModelStore = ((c1) owner).getViewModelStore();
            androidx.savedstate.b savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                w0 w0VarB = viewModelStore.b(it.next());
                kotlin.jvm.internal.f0.m(w0VarB);
                LegacySavedStateHandleController.a(w0VarB, savedStateRegistry, owner.getLifecycle());
            }
            if (!viewModelStore.c().isEmpty()) {
                savedStateRegistry.k(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    @xh.m
    public static final void a(@dl.d w0 viewModel, @dl.d androidx.savedstate.b registry, @dl.d Lifecycle lifecycle) {
        kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        kotlin.jvm.internal.f0.p(registry, "registry");
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.e()) {
            return;
        }
        savedStateHandleController.b(registry, lifecycle);
        f24018a.c(registry, lifecycle);
    }

    @dl.d
    @xh.m
    public static final SavedStateHandleController b(@dl.d androidx.savedstate.b registry, @dl.d Lifecycle lifecycle, @dl.e String str, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(registry, "registry");
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.f0.m(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, q0.f24236f.a(registry.b(str), bundle));
        savedStateHandleController.b(registry, lifecycle);
        f24018a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.b bVar, final Lifecycle lifecycle) {
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.INITIALIZED || stateB.isAtLeast(Lifecycle.State.STARTED)) {
            bVar.k(a.class);
        } else {
            lifecycle.a(new v() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.v
                public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
                    kotlin.jvm.internal.f0.p(source, "source");
                    kotlin.jvm.internal.f0.p(event, "event");
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.d(this);
                        bVar.k(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
