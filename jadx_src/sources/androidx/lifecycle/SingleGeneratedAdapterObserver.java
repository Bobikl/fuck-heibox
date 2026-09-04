package androidx.lifecycle;

/* JADX INFO: compiled from: SingleGeneratedAdapterObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SingleGeneratedAdapterObserver implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final o f24124b;

    public SingleGeneratedAdapterObserver(@dl.d o generatedAdapter) {
        kotlin.jvm.internal.f0.p(generatedAdapter, "generatedAdapter");
        this.f24124b = generatedAdapter;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        this.f24124b.a(source, event, false, null);
        this.f24124b.a(source, event, true, null);
    }
}
