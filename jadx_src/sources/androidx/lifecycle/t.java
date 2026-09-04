package androidx.lifecycle;

import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: LifecycleController.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
@androidx.annotation.k0
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Lifecycle f24255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Lifecycle.State f24256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final l f24257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final v f24258d;

    public t(@dl.d Lifecycle lifecycle, @dl.d Lifecycle.State minState, @dl.d l dispatchQueue, @dl.d final d2 parentJob) {
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.f0.p(minState, "minState");
        kotlin.jvm.internal.f0.p(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.f0.p(parentJob, "parentJob");
        this.f24255a = lifecycle;
        this.f24256b = minState;
        this.f24257c = dispatchQueue;
        v vVar = new v() { // from class: androidx.lifecycle.s
            @Override // androidx.lifecycle.v
            public final void d(y yVar, Lifecycle.Event event) {
                t.d(this.f24248b, parentJob, yVar, event);
            }
        };
        this.f24258d = vVar;
        if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            lifecycle.a(vVar);
        } else {
            d2.a.b(parentJob, null, 1, null);
            b();
        }
    }

    private final void c(d2 d2Var) {
        d2.a.b(d2Var, null, 1, null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(t this$0, d2 parentJob, y source, Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(parentJob, "$parentJob");
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "<anonymous parameter 1>");
        if (source.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            d2.a.b(parentJob, null, 1, null);
            this$0.b();
        } else if (source.getLifecycle().b().compareTo(this$0.f24256b) < 0) {
            this$0.f24257c.h();
        } else {
            this$0.f24257c.i();
        }
    }

    @androidx.annotation.k0
    public final void b() {
        this.f24255a.d(this.f24258d);
        this.f24257c.g();
    }
}
