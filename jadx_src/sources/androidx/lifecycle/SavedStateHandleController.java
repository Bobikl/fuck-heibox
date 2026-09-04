package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleController.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SavedStateHandleController implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f24110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final q0 f24111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24112d;

    public SavedStateHandleController(@dl.d String key, @dl.d q0 handle) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(handle, "handle");
        this.f24110b = key;
        this.f24111c = handle;
    }

    public final void b(@dl.d androidx.savedstate.b registry, @dl.d Lifecycle lifecycle) {
        kotlin.jvm.internal.f0.p(registry, "registry");
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        if (!(!this.f24112d)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f24112d = true;
        lifecycle.a(this);
        registry.j(this.f24110b, this.f24111c.o());
    }

    @dl.d
    public final q0 c() {
        return this.f24111c;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f24112d = false;
            source.getLifecycle().d(this);
        }
    }

    public final boolean e() {
        return this.f24112d;
    }
}
