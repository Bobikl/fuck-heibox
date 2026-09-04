package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends y0.d implements y0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final C0173a f24162e = new C0173a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f24163f = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private androidx.savedstate.b f24164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Lifecycle f24165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Bundle f24166d;

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.kt */
    public static final class C0173a {
        private C0173a() {
        }

        public /* synthetic */ C0173a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public a() {
    }

    public a(@dl.d androidx.savedstate.d owner, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        this.f24164b = owner.getSavedStateRegistry();
        this.f24165c = owner.getLifecycle();
        this.f24166d = bundle;
    }

    private final <T extends w0> T d(String str, Class<T> cls) {
        androidx.savedstate.b bVar = this.f24164b;
        kotlin.jvm.internal.f0.m(bVar);
        Lifecycle lifecycle = this.f24165c;
        kotlin.jvm.internal.f0.m(lifecycle);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(bVar, lifecycle, str, this.f24166d);
        T t10 = (T) e(str, cls, savedStateHandleControllerB.c());
        t10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return t10;
    }

    @Override // androidx.lifecycle.y0.b
    @dl.d
    public <T extends w0> T a(@dl.d Class<T> modelClass) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f24165c != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.y0.b
    @dl.d
    public <T extends w0> T b(@dl.d Class<T> modelClass, @dl.d u2.a extras) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        kotlin.jvm.internal.f0.p(extras, "extras");
        String str = (String) extras.a(y0.c.f24300d);
        if (str != null) {
            return this.f24164b != null ? (T) d(str, modelClass) : (T) e(str, modelClass, SavedStateHandleSupport.b(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.y0.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void c(@dl.d w0 viewModel) {
        kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        androidx.savedstate.b bVar = this.f24164b;
        if (bVar != null) {
            kotlin.jvm.internal.f0.m(bVar);
            Lifecycle lifecycle = this.f24165c;
            kotlin.jvm.internal.f0.m(lifecycle);
            LegacySavedStateHandleController.a(viewModel, bVar, lifecycle);
        }
    }

    @dl.d
    protected abstract <T extends w0> T e(@dl.d String str, @dl.d Class<T> cls, @dl.d q0 q0Var);
}
