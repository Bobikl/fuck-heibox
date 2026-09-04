package androidx.lifecycle;

/* JADX INFO: compiled from: CompositeGeneratedAdaptersObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class CompositeGeneratedAdaptersObserver implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final o[] f23964b;

    public CompositeGeneratedAdaptersObserver(@dl.d o[] generatedAdapters) {
        kotlin.jvm.internal.f0.p(generatedAdapters, "generatedAdapters");
        this.f23964b = generatedAdapters;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        h0 h0Var = new h0();
        for (o oVar : this.f23964b) {
            oVar.a(source, event, false, h0Var);
        }
        for (o oVar2 : this.f23964b) {
            oVar2.a(source, event, true, h0Var);
        }
    }
}
