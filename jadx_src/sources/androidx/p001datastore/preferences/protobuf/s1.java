package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s1 implements y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y1 f22599b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1 f22600a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static final class a implements y1 {
        a() {
        }

        @Override // androidx.p001datastore.preferences.protobuf.y1
        public x1 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.p001datastore.preferences.protobuf.y1
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class b implements y1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y1[] f22601a;

        b(y1... y1VarArr) {
            this.f22601a = y1VarArr;
        }

        @Override // androidx.p001datastore.preferences.protobuf.y1
        public x1 a(Class<?> cls) {
            for (y1 y1Var : this.f22601a) {
                if (y1Var.b(cls)) {
                    return y1Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.p001datastore.preferences.protobuf.y1
        public boolean b(Class<?> cls) {
            for (y1 y1Var : this.f22601a) {
                if (y1Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public s1() {
        this(b());
    }

    private s1(y1 y1Var) {
        this.f22600a = (y1) i1.e(y1Var, "messageInfoFactory");
    }

    private static y1 b() {
        return new b(c1.c(), c());
    }

    private static y1 c() {
        try {
            return (y1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f22599b;
        }
    }

    private static boolean d(x1 x1Var) {
        return x1Var.f() == ProtoSyntax.PROTO2;
    }

    private static <T> x2<T> e(Class<T> cls, x1 x1Var) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return d(x1Var) ? c2.S(cls, x1Var, l2.b(), o1.b(), z2.S(), s0.b(), w1.b()) : c2.S(cls, x1Var, l2.b(), o1.b(), z2.S(), null, w1.b());
        }
        return d(x1Var) ? c2.S(cls, x1Var, l2.a(), o1.a(), z2.K(), s0.a(), w1.a()) : c2.S(cls, x1Var, l2.a(), o1.a(), z2.L(), null, w1.a());
    }

    @Override // androidx.p001datastore.preferences.protobuf.y2
    public <T> x2<T> a(Class<T> cls) {
        z2.M(cls);
        x1 x1VarA = this.f22600a.a(cls);
        if (x1VarA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? d2.m(z2.S(), s0.b(), x1VarA.b()) : d2.m(z2.K(), s0.a(), x1VarA.b());
        }
        return e(cls, x1VarA);
    }
}
