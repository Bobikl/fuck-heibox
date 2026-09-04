package androidx.collection;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1100:1\n1#2:1101\n*E\n"})
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final MutableScatterSet<Object> f3629a = new MutableScatterSet<>(0);

    @dl.d
    public static final <E> ScatterSet<E> a() {
        MutableScatterSet<Object> mutableScatterSet = f3629a;
        kotlin.jvm.internal.f0.n(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    @dl.d
    public static final <E> MutableScatterSet<E> b() {
        return new MutableScatterSet<>(0, 1, null);
    }

    @dl.d
    public static final <E> MutableScatterSet<E> c(E e10) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.Z(e10);
        return mutableScatterSet;
    }

    @dl.d
    public static final <E> MutableScatterSet<E> d(E e10, E e11) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.Z(e10);
        mutableScatterSet.Z(e11);
        return mutableScatterSet;
    }

    @dl.d
    public static final <E> MutableScatterSet<E> e(E e10, E e11, E e12) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.Z(e10);
        mutableScatterSet.Z(e11);
        mutableScatterSet.Z(e12);
        return mutableScatterSet;
    }

    @dl.d
    public static final <E> MutableScatterSet<E> f(@dl.d E... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.b0(elements);
        return mutableScatterSet;
    }

    @dl.d
    public static final <E> ScatterSet<E> g() {
        MutableScatterSet<Object> mutableScatterSet = f3629a;
        kotlin.jvm.internal.f0.n(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    @dl.d
    public static final <E> ScatterSet<E> h(E e10) {
        return c(e10);
    }

    @dl.d
    public static final <E> ScatterSet<E> i(E e10, E e11) {
        return d(e10, e11);
    }

    @dl.d
    public static final <E> ScatterSet<E> j(E e10, E e11, E e12) {
        return e(e10, e11, e12);
    }

    @dl.d
    public static final <E> ScatterSet<E> k(@dl.d E... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.b0(elements);
        return mutableScatterSet;
    }
}
