package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.k0;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: SavedStateRegistryController.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f27397d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d f27398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final b f27399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27400c;

    /* JADX INFO: compiled from: SavedStateRegistryController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final c a(@dl.d d owner) {
            f0.p(owner, "owner");
            return new c(owner, null);
        }
    }

    private c(d dVar) {
        this.f27398a = dVar;
        this.f27399b = new b();
    }

    public /* synthetic */ c(d dVar, u uVar) {
        this(dVar);
    }

    @dl.d
    @m
    public static final c a(@dl.d d dVar) {
        return f27397d.a(dVar);
    }

    @dl.d
    public final b b() {
        return this.f27399b;
    }

    @k0
    public final void c() {
        Lifecycle lifecycle = this.f27398a.getLifecycle();
        if (!(lifecycle.b() == Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f27398a));
        this.f27399b.g(lifecycle);
        this.f27400c = true;
    }

    @k0
    public final void d(@dl.e Bundle bundle) {
        if (!this.f27400c) {
            c();
        }
        Lifecycle lifecycle = this.f27398a.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            this.f27399b.h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    @k0
    public final void e(@dl.d Bundle outBundle) {
        f0.p(outBundle, "outBundle");
        this.f27399b.i(outBundle);
    }
}
