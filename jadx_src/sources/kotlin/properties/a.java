package kotlin.properties;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.n;
import yh.q;

/* JADX INFO: compiled from: Delegates.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f125017a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.properties.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Delegates.kt */
    public static final class C1132a<T> extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<n<?>, T, T, b2> f125018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1132a(T t10, q<? super n<?>, ? super T, ? super T, b2> qVar) {
            super(t10);
            this.f125018b = qVar;
        }

        @Override // kotlin.properties.c
        protected void c(@dl.d n<?> property, T t10, T t11) {
            f0.p(property, "property");
            this.f125018b.invoke(property, t10, t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Delegates.kt */
    public static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<n<?>, T, T, Boolean> f125019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t10, q<? super n<?>, ? super T, ? super T, Boolean> qVar) {
            super(t10);
            this.f125019b = qVar;
        }

        @Override // kotlin.properties.c
        protected boolean d(@dl.d n<?> property, T t10, T t11) {
            f0.p(property, "property");
            return this.f125019b.invoke(property, t10, t11).booleanValue();
        }
    }

    private a() {
    }

    @dl.d
    public final <T> f<Object, T> a() {
        return new kotlin.properties.b();
    }

    @dl.d
    public final <T> f<Object, T> b(T t10, @dl.d q<? super n<?>, ? super T, ? super T, b2> onChange) {
        f0.p(onChange, "onChange");
        return new C1132a(t10, onChange);
    }

    @dl.d
    public final <T> f<Object, T> c(T t10, @dl.d q<? super n<?>, ? super T, ? super T, Boolean> onChange) {
        f0.p(onChange, "onChange");
        return new b(t10, onChange);
    }
}
