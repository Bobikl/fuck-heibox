package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SavedStateHandleAttacher implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final SavedStateHandlesProvider f24109b;

    public SavedStateHandleAttacher(@dl.d SavedStateHandlesProvider provider) {
        kotlin.jvm.internal.f0.p(provider, "provider");
        this.f24109b = provider;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f24109b.c();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
