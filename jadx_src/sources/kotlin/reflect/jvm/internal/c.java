package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c<V> extends kotlin.reflect.jvm.internal.a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<Class<?>, V> f125273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private volatile a f125274b;

    /* JADX INFO: compiled from: CacheByClass.kt */
    public static final class a extends ClassValue<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<V> f125275a;

        a(c<V> cVar) {
            this.f125275a = cVar;
        }

        @Override // java.lang.ClassValue
        protected V computeValue(@dl.d Class<?> type) {
            f0.p(type, "type");
            return (V) ((c) this.f125275a).f125273a.invoke(type);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.d yh.l<? super Class<?>, ? extends V> compute) {
        f0.p(compute, "compute");
        this.f125273a = compute;
        this.f125274b = d();
    }

    private final a d() {
        return new a(this);
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
        this.f125274b = d();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@dl.d Class<?> key) {
        f0.p(key, "key");
        return this.f125274b.get(key);
    }
}
