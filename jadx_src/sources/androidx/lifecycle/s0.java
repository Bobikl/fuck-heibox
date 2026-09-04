package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 extends y0.d implements y0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Application f24250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final y0.b f24251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Bundle f24252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Lifecycle f24253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private androidx.savedstate.b f24254f;

    public s0() {
        this.f24251c = new y0.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(@dl.e Application application, @dl.d androidx.savedstate.d owner) {
        this(application, owner, null);
        kotlin.jvm.internal.f0.p(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public s0(@dl.e Application application, @dl.d androidx.savedstate.d owner, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        this.f24254f = owner.getSavedStateRegistry();
        this.f24253e = owner.getLifecycle();
        this.f24252d = bundle;
        this.f24250b = application;
        this.f24251c = application != null ? y0.a.f24290f.b(application) : new y0.a();
    }

    @Override // androidx.lifecycle.y0.b
    @dl.d
    public <T extends w0> T a(@dl.d Class<T> modelClass) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y0.b
    @dl.d
    public <T extends w0> T b(@dl.d Class<T> modelClass, @dl.d u2.a extras) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        kotlin.jvm.internal.f0.p(extras, "extras");
        String str = (String) extras.a(y0.c.f24300d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(SavedStateHandleSupport.f24115c) == null || extras.a(SavedStateHandleSupport.f24116d) == null) {
            if (this.f24253e != null) {
                return (T) d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(y0.a.f24293i);
        boolean zIsAssignableFrom = b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? t0.c(modelClass, t0.f24260b) : t0.c(modelClass, t0.f24259a);
        if (constructorC == null) {
            return (T) this.f24251c.b(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) t0.d(modelClass, constructorC, SavedStateHandleSupport.b(extras)) : (T) t0.d(modelClass, constructorC, application, SavedStateHandleSupport.b(extras));
    }

    @Override // androidx.lifecycle.y0.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void c(@dl.d w0 viewModel) {
        kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        if (this.f24253e != null) {
            androidx.savedstate.b bVar = this.f24254f;
            kotlin.jvm.internal.f0.m(bVar);
            Lifecycle lifecycle = this.f24253e;
            kotlin.jvm.internal.f0.m(lifecycle);
            LegacySavedStateHandleController.a(viewModel, bVar, lifecycle);
        }
    }

    @dl.d
    public final <T extends w0> T d(@dl.d String key, @dl.d Class<T> modelClass) {
        T t10;
        Application application;
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        Lifecycle lifecycle = this.f24253e;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f24250b == null) ? t0.c(modelClass, t0.f24260b) : t0.c(modelClass, t0.f24259a);
        if (constructorC == null) {
            return this.f24250b != null ? (T) this.f24251c.a(modelClass) : (T) y0.c.f24298b.a().a(modelClass);
        }
        androidx.savedstate.b bVar = this.f24254f;
        kotlin.jvm.internal.f0.m(bVar);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(bVar, lifecycle, key, this.f24252d);
        if (!zIsAssignableFrom || (application = this.f24250b) == null) {
            t10 = (T) t0.d(modelClass, constructorC, savedStateHandleControllerB.c());
        } else {
            kotlin.jvm.internal.f0.m(application);
            t10 = (T) t0.d(modelClass, constructorC, application, savedStateHandleControllerB.c());
        }
        t10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return t10;
    }
}
