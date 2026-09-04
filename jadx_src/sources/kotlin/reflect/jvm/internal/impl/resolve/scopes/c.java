package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f127610a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f127611b;

        static {
            d.a aVar = d.f127613c;
            f127611b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return f127611b;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f127612a = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
