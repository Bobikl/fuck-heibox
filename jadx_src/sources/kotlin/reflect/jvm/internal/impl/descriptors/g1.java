package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: Visibility.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f125626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f125627b;

    protected g1(@dl.d String name, boolean z10) {
        kotlin.jvm.internal.f0.p(name, "name");
        this.f125626a = name;
        this.f125627b = z10;
    }

    @dl.e
    public Integer a(@dl.d g1 visibility) {
        kotlin.jvm.internal.f0.p(visibility, "visibility");
        return f1.f125614a.a(this, visibility);
    }

    @dl.d
    public String b() {
        return this.f125626a;
    }

    public final boolean c() {
        return this.f125627b;
    }

    @dl.d
    public g1 d() {
        return this;
    }

    @dl.d
    public final String toString() {
        return b();
    }
}
