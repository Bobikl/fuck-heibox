package dj;

import dl.d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.b2;
import kotlin.j1;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.k1;
import kotlin.n1;
import kotlin.o1;
import kotlin.r1;
import kotlin.s;
import kotlin.s1;
import kotlin.time.e;
import kotlin.x1;
import kotlin.y1;
import kotlinx.serialization.g;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.a0;
import kotlinx.serialization.internal.a2;
import kotlinx.serialization.internal.b0;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.c1;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.g0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.h;
import kotlinx.serialization.internal.h2;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.i2;
import kotlinx.serialization.internal.k;
import kotlinx.serialization.internal.l1;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.n2;
import kotlinx.serialization.internal.o2;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.q;
import kotlinx.serialization.internal.q0;
import kotlinx.serialization.internal.q2;
import kotlinx.serialization.internal.r;
import kotlinx.serialization.internal.r2;
import kotlinx.serialization.internal.t2;
import kotlinx.serialization.internal.u2;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.internal.w2;
import kotlinx.serialization.internal.x2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.internal.y2;
import kotlinx.serialization.internal.z;

/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @d
    public static final g<x1> A(@d x1.a aVar) {
        f0.p(aVar, "<this>");
        return x2.f130782a;
    }

    @d
    public static final g<b2> B(@d b2 b2Var) {
        f0.p(b2Var, "<this>");
        return y2.f130789b;
    }

    @d
    public static final g<Boolean> C(@d l lVar) {
        f0.p(lVar, "<this>");
        return i.f130704a;
    }

    @d
    public static final g<Byte> D(@d n nVar) {
        f0.p(nVar, "<this>");
        return kotlinx.serialization.internal.l.f130718a;
    }

    @d
    public static final g<Character> E(@d p pVar) {
        f0.p(pVar, "<this>");
        return r.f130749a;
    }

    @d
    public static final g<Double> F(@d v vVar) {
        f0.p(vVar, "<this>");
        return a0.f130663a;
    }

    @d
    public static final g<Float> G(@d y yVar) {
        f0.p(yVar, "<this>");
        return g0.f130698a;
    }

    @d
    public static final g<Integer> H(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return q0.f130745a;
    }

    @d
    public static final g<Long> I(@d i0 i0Var) {
        f0.p(i0Var, "<this>");
        return c1.f130681a;
    }

    @d
    public static final g<Short> J(@d r0 r0Var) {
        f0.p(r0Var, "<this>");
        return h2.f130702a;
    }

    @d
    public static final g<String> K(@d v0 v0Var) {
        f0.p(v0Var, "<this>");
        return i2.f130706a;
    }

    @d
    public static final g<e> L(@d e.a aVar) {
        f0.p(aVar, "<this>");
        return b0.f130669a;
    }

    @d
    @kotlinx.serialization.d
    public static final <T, E extends T> g<E[]> a(@d kotlin.reflect.d<T> kClass, @d g<E> elementSerializer) {
        f0.p(kClass, "kClass");
        f0.p(elementSerializer, "elementSerializer");
        return new a2(kClass, elementSerializer);
    }

    @kotlinx.serialization.d
    public static final /* synthetic */ <T, E extends T> g<E[]> b(g<E> elementSerializer) {
        f0.p(elementSerializer, "elementSerializer");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return a(n0.d(Object.class), elementSerializer);
    }

    @d
    public static final g<boolean[]> c() {
        return h.f130701c;
    }

    @d
    public static final g<byte[]> d() {
        return k.f130713c;
    }

    @d
    public static final g<char[]> e() {
        return q.f130744c;
    }

    @d
    public static final g<double[]> f() {
        return z.f130791c;
    }

    @d
    public static final g<float[]> g() {
        return kotlinx.serialization.internal.f0.f130692c;
    }

    @d
    public static final g<int[]> h() {
        return p0.f130741c;
    }

    @d
    public static final <T> g<List<T>> i(@d g<T> elementSerializer) {
        f0.p(elementSerializer, "elementSerializer");
        return new f(elementSerializer);
    }

    @d
    public static final g<long[]> j() {
        return b1.f130671c;
    }

    @d
    public static final <K, V> g<Map.Entry<K, V>> k(@d g<K> keySerializer, @d g<V> valueSerializer) {
        f0.p(keySerializer, "keySerializer");
        f0.p(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    @d
    public static final <K, V> g<Map<K, V>> l(@d g<K> keySerializer, @d g<V> valueSerializer) {
        f0.p(keySerializer, "keySerializer");
        f0.p(valueSerializer, "valueSerializer");
        return new w0(keySerializer, valueSerializer);
    }

    @d
    @kotlinx.serialization.d
    public static final g m() {
        return l1.f130721a;
    }

    @d
    public static final <K, V> g<Pair<K, V>> n(@d g<K> keySerializer, @d g<V> valueSerializer) {
        f0.p(keySerializer, "keySerializer");
        f0.p(valueSerializer, "valueSerializer");
        return new PairSerializer(keySerializer, valueSerializer);
    }

    @d
    public static final <T> g<Set<T>> o(@d g<T> elementSerializer) {
        f0.p(elementSerializer, "elementSerializer");
        return new y0(elementSerializer);
    }

    @d
    public static final g<short[]> p() {
        return g2.f130700c;
    }

    @d
    public static final <A, B, C> g<Triple<A, B, C>> q(@d g<A> aSerializer, @d g<B> bSerializer, @d g<C> cSerializer) {
        f0.p(aSerializer, "aSerializer");
        f0.p(bSerializer, "bSerializer");
        f0.p(cSerializer, "cSerializer");
        return new TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    @d
    @s
    @kotlinx.serialization.d
    public static final g<k1> r() {
        return n2.f130733c;
    }

    @d
    @s
    @kotlinx.serialization.d
    public static final g<o1> s() {
        return q2.f130748c;
    }

    @d
    @s
    @kotlinx.serialization.d
    public static final g<s1> t() {
        return t2.f130766c;
    }

    @d
    @s
    @kotlinx.serialization.d
    public static final g<y1> u() {
        return w2.f130780c;
    }

    @d
    public static final <T> g<T> v(@d g<T> gVar) {
        f0.p(gVar, "<this>");
        return gVar.a().c() ? gVar : new m1(gVar);
    }

    public static /* synthetic */ void w(g gVar) {
    }

    @d
    public static final g<j1> x(@d j1.a aVar) {
        f0.p(aVar, "<this>");
        return o2.f130737a;
    }

    @d
    public static final g<n1> y(@d n1.a aVar) {
        f0.p(aVar, "<this>");
        return r2.f130753a;
    }

    @d
    public static final g<r1> z(@d r1.a aVar) {
        f0.p(aVar, "<this>");
        return u2.f130769a;
    }
}
