package androidx.navigation;

/* JADX INFO: compiled from: NavDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final p.a f25226a = new p.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private m0<?> f25227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Object f25229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25230e;

    @dl.d
    public final p a() {
        return this.f25226a.a();
    }

    @dl.e
    public final Object b() {
        return this.f25229d;
    }

    public final boolean c() {
        return this.f25228c;
    }

    @dl.d
    public final m0<?> d() {
        m0<?> m0Var = this.f25227b;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final boolean e() {
        return this.f25230e;
    }

    public final void f(@dl.e Object obj) {
        this.f25229d = obj;
        this.f25226a.b(obj);
    }

    public final void g(boolean z10) {
        this.f25228c = z10;
        this.f25226a.c(z10);
    }

    public final void h(@dl.d m0<?> value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.f25227b = value;
        this.f25226a.d(value);
    }

    public final void i(boolean z10) {
        this.f25230e = z10;
        this.f25226a.e(z10);
    }
}
