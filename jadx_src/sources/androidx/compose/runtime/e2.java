package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"androidx/compose/runtime/f2", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/g2", "androidx/compose/runtime/h2"}, d2 = {}, k = 4, mv = {1, 7, 1})
public final class e2 {
    @dl.d
    @h
    public static final <T extends R, R> m2<R> a(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, R r10, @dl.e CoroutineContext coroutineContext, @dl.e p pVar, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.b(eVar, r10, coroutineContext, pVar, i10, i11);
    }

    @dl.d
    @h
    public static final <T> m2<T> b(@dl.d kotlinx.coroutines.flow.u<? extends T> uVar, @dl.e CoroutineContext coroutineContext, @dl.e p pVar, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.c(uVar, coroutineContext, pVar, i10, i11);
    }

    @dl.d
    public static final <T> m2<T> c(@dl.d d2<T> d2Var, @dl.d yh.a<? extends T> aVar) {
        return f2.c(d2Var, aVar);
    }

    @dl.d
    public static final <T> m2<T> d(@dl.d yh.a<? extends T> aVar) {
        return f2.d(aVar);
    }

    public static final <T> T e(@dl.d m2<? extends T> m2Var, @dl.e Object obj, @dl.d kotlin.reflect.n<?> nVar) {
        return (T) h2.a(m2Var, obj, nVar);
    }

    @dl.d
    public static final <T> SnapshotStateList<T> f() {
        return h2.b();
    }

    @dl.d
    public static final <T> SnapshotStateList<T> g(@dl.d T... tArr) {
        return h2.c(tArr);
    }

    @dl.d
    public static final <K, V> androidx.compose.runtime.snapshots.t<K, V> h() {
        return h2.d();
    }

    @dl.d
    public static final <K, V> androidx.compose.runtime.snapshots.t<K, V> i(@dl.d Pair<? extends K, ? extends V>... pairArr) {
        return h2.e(pairArr);
    }

    @dl.d
    public static final <T> a1<T> j(T t10, @dl.d d2<T> d2Var) {
        return h2.f(t10, d2Var);
    }

    public static /* synthetic */ a1 k(Object obj, d2 d2Var, int i10, Object obj2) {
        return h2.g(obj, d2Var, i10, obj2);
    }

    @dl.d
    public static final <T> d2<T> l() {
        return g2.a();
    }

    public static final <R> void m(@dl.d yh.l<? super m2<?>, kotlin.b2> lVar, @dl.d yh.l<? super m2<?>, kotlin.b2> lVar2, @dl.d yh.a<? extends R> aVar) {
        f2.f(lVar, lVar2, aVar);
    }

    @dl.d
    @h
    public static final <T> m2<T> n(T t10, @dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, @dl.e p pVar2, int i10) {
        return SnapshotStateKt__ProduceStateKt.a(t10, obj, obj2, obj3, pVar, pVar2, i10);
    }

    @dl.d
    @h
    public static final <T> m2<T> o(T t10, @dl.e Object obj, @dl.e Object obj2, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, @dl.e p pVar2, int i10) {
        return SnapshotStateKt__ProduceStateKt.b(t10, obj, obj2, pVar, pVar2, i10);
    }

    @dl.d
    @h
    public static final <T> m2<T> p(T t10, @dl.e Object obj, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, @dl.e p pVar2, int i10) {
        return SnapshotStateKt__ProduceStateKt.c(t10, obj, pVar, pVar2, i10);
    }

    @dl.d
    @h
    public static final <T> m2<T> q(T t10, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, @dl.e p pVar2, int i10) {
        return SnapshotStateKt__ProduceStateKt.d(t10, pVar, pVar2, i10);
    }

    @dl.d
    @h
    public static final <T> m2<T> r(T t10, @dl.d Object[] objArr, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, @dl.e p pVar2, int i10) {
        return SnapshotStateKt__ProduceStateKt.e(t10, objArr, pVar, pVar2, i10);
    }

    @dl.d
    public static final <T> d2<T> s() {
        return g2.b();
    }

    @dl.d
    @h
    public static final <T> m2<T> t(T t10, @dl.e p pVar, int i10) {
        return h2.h(t10, pVar, i10);
    }

    public static final <T> void u(@dl.d a1<T> a1Var, @dl.e Object obj, @dl.d kotlin.reflect.n<?> nVar, T t10) {
        h2.i(a1Var, obj, nVar, t10);
    }

    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> v(@dl.d yh.a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.e(aVar);
    }

    @dl.d
    public static final <T> d2<T> w() {
        return g2.c();
    }

    @dl.d
    public static final <T> SnapshotStateList<T> x(@dl.d Collection<? extends T> collection) {
        return h2.j(collection);
    }

    @dl.d
    public static final <K, V> androidx.compose.runtime.snapshots.t<K, V> y(@dl.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return h2.k(iterable);
    }
}
