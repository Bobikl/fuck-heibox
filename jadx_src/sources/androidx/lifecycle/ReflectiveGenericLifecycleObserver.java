package androidx.lifecycle;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ReflectiveGenericLifecycleObserver implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d.a f24074c;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f24073b = obj;
        this.f24074c = d.f24181c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.v
    public void d(@androidx.annotation.n0 y yVar, @androidx.annotation.n0 Lifecycle.Event event) {
        this.f24074c.a(yVar, event, this.f24073b);
    }
}
