package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: SourceElement.java */
/* JADX INFO: loaded from: classes5.dex */
public interface t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f125942a = new a();

    /* JADX INFO: compiled from: SourceElement.java */
    public static final class a implements t0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.t0
        @dl.d
        public u0 b() {
            u0 u0Var = u0.f125943a;
            if (u0Var == null) {
                d(0);
            }
            return u0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    @dl.d
    u0 b();
}
