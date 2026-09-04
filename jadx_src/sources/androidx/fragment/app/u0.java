package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.c1;

/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes6.dex */
public class u0 implements androidx.lifecycle.r, androidx.savedstate.d, c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fragment f23862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.b1 f23863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f23864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.y0.b f23865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.a0 f23866f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.savedstate.c f23867g = null;

    u0(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 androidx.lifecycle.b1 b1Var, @androidx.annotation.n0 Runnable runnable) {
        this.f23862b = fragment;
        this.f23863c = b1Var;
        this.f23864d = runnable;
    }

    void a(@androidx.annotation.n0 Lifecycle.Event event) {
        this.f23866f.l(event);
    }

    void b() {
        if (this.f23866f == null) {
            this.f23866f = new androidx.lifecycle.a0(this);
            androidx.savedstate.c cVarA = androidx.savedstate.c.a(this);
            this.f23867g = cVarA;
            cVarA.c();
            this.f23864d.run();
        }
    }

    boolean c() {
        return this.f23866f != null;
    }

    void d(@androidx.annotation.p0 Bundle bundle) {
        this.f23867g.d(bundle);
    }

    void e(@androidx.annotation.n0 Bundle bundle) {
        this.f23867g.e(bundle);
    }

    void f(@androidx.annotation.n0 Lifecycle.State state) {
        this.f23866f.s(state);
    }

    @Override // androidx.lifecycle.r
    @androidx.annotation.i
    @androidx.annotation.n0
    public u2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f23862b.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        u2.e eVar = new u2.e();
        if (application != null) {
            eVar.c(androidx.lifecycle.y0.a.f24293i, application);
        }
        eVar.c(SavedStateHandleSupport.f24115c, this.f23862b);
        eVar.c(SavedStateHandleSupport.f24116d, this);
        if (this.f23862b.getArguments() != null) {
            eVar.c(SavedStateHandleSupport.f24117e, this.f23862b.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    @androidx.annotation.n0
    public androidx.lifecycle.y0.b getDefaultViewModelProviderFactory() {
        androidx.lifecycle.y0.b defaultViewModelProviderFactory = this.f23862b.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f23862b.mDefaultFactory)) {
            this.f23865e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f23865e == null) {
            Application application = null;
            for (Context applicationContext = this.f23862b.requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            Fragment fragment = this.f23862b;
            this.f23865e = new androidx.lifecycle.s0(application, fragment, fragment.getArguments());
        }
        return this.f23865e;
    }

    @Override // androidx.lifecycle.y
    @androidx.annotation.n0
    public Lifecycle getLifecycle() {
        b();
        return this.f23866f;
    }

    @Override // androidx.savedstate.d
    @androidx.annotation.n0
    public androidx.savedstate.b getSavedStateRegistry() {
        b();
        return this.f23867g.b();
    }

    @Override // androidx.lifecycle.c1
    @androidx.annotation.n0
    public androidx.lifecycle.b1 getViewModelStore() {
        b();
        return this.f23863c;
    }
}
