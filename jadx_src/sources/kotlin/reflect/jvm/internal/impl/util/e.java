package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AttributeArrayOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e<K, T> extends a<K, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private c<T> f128232b;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        h hVar = h.f128237b;
        f0.n(hVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(hVar);
    }

    protected e(@dl.d c<T> arrayMap) {
        f0.p(arrayMap, "arrayMap");
        this.f128232b = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @dl.d
    protected final c<T> a() {
        return this.f128232b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.a
    protected final void e(@dl.d kotlin.reflect.d<? extends K> tClass, @dl.d T value) {
        f0.p(tClass, "tClass");
        f0.p(value, "value");
        int iD = b().d(tClass);
        int iA = this.f128232b.a();
        if (iA == 0) {
            this.f128232b = new n(value, iD);
            return;
        }
        if (iA == 1) {
            c<T> cVar = this.f128232b;
            f0.n(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            n nVar = (n) cVar;
            if (nVar.e() == iD) {
                this.f128232b = new n(value, iD);
                return;
            } else {
                d dVar = new d();
                this.f128232b = dVar;
                dVar.b(nVar.e(), nVar.g());
            }
        }
        this.f128232b.b(iD, value);
    }
}
