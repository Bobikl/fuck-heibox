package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.r0;

/* JADX INFO: compiled from: PersistentOrderedMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00017B5\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001c\u0012\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0#¢\u0006\u0004\b5\u00106J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0002J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\bH\u0001J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J*\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R,\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R&\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010-¨\u00068"}, d2 = {"Lw0/c;", "K", androidx.exifinterface.media.a.X4, "Lkotlin/collections/AbstractMap;", "Lu0/i;", "Lu0/f;", "", "n", "", ak.aF, "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Lw0/c;", "y", "(Ljava/lang/Object;)Lw0/c;", ak.aD, "", "m", "putAll", "clear", "Lu0/i$a;", "builder", "", "firstKey", "Ljava/lang/Object;", "r", "()Ljava/lang/Object;", "lastKey", "v", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Lw0/a;", "hashMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", ak.aG, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "e", "()I", UiKitSpanObj.TYPE_SIZE, "()Lu0/f;", Constants.PARAM_KEYS, "Lu0/b;", "t", "()Lu0/b;", "values", "B0", "entries", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c<K, V> extends AbstractMap<K, V> implements u0.i<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f140924h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final c f140925i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final Object f140926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final Object f140927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, w0.a<V>> f140928g;

    /* JADX INFO: compiled from: PersistentOrderedMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lw0/c$a;", "", "K", androidx.exifinterface.media.a.X4, "Lw0/c;", ak.av, "()Lw0/c;", "", "EMPTY", "Lw0/c;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final <K, V> c<K, V> a() {
            c<K, V> cVar = c.f140925i;
            f0.n(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return cVar;
        }
    }

    static {
        y0.c cVar = y0.c.f141522a;
        f140925i = new c(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a());
    }

    public c(@dl.e Object obj, @dl.e Object obj2, @dl.d androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, w0.a<V>> hashMap) {
        f0.p(hashMap, "hashMap");
        this.f140926e = obj;
        this.f140927f = obj2;
        this.f140928g = hashMap;
    }

    private final u0.f<Map.Entry<K, V>> n() {
        return new l(this);
    }

    public final /* bridge */ u0.b<V> A() {
        return g();
    }

    @Override // u0.e
    @dl.d
    public u0.f<Map.Entry<K, V>> B0() {
        return n();
    }

    @Override // u0.i
    @dl.d
    public u0.i.a<K, V> builder() {
        return new d(this);
    }

    @Override // kotlin.collections.AbstractMap
    @dl.d
    @r0
    public final Set<Map.Entry<K, V>> c() {
        return n();
    }

    @Override // java.util.Map, u0.i
    @dl.d
    public u0.i<K, V> clear() {
        return f140924h.a();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.f140928g.containsKey(key);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: e */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return this.f140928g.size();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    @dl.e
    public V get(Object key) {
        w0.a<V> aVar = this.f140928g.get(key);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMap
    @dl.d
    /* JADX INFO: renamed from: m */
    public u0.f<K> d() {
        return new n(this);
    }

    public final /* bridge */ u0.f<Map.Entry<K, V>> p() {
        return B0();
    }

    @Override // java.util.Map, u0.i
    @dl.d
    public u0.i<K, V> putAll(@dl.d Map<? extends K, ? extends V> m10) {
        f0.p(m10, "m");
        f0.n(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        u0.i.a<K, V> aVarBuilder = builder();
        aVarBuilder.putAll(m10);
        return aVarBuilder.build();
    }

    @dl.e
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Object getF140926e() {
        return this.f140926e;
    }

    @Override // kotlin.collections.AbstractMap
    @dl.d
    /* JADX INFO: renamed from: t */
    public u0.b<V> g() {
        return new q(this);
    }

    @dl.d
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, w0.a<V>> u() {
        return this.f140928g;
    }

    @dl.e
    /* JADX INFO: renamed from: v, reason: from getter */
    public final Object getF140927f() {
        return this.f140927f;
    }

    public final /* bridge */ u0.f<K> w() {
        return d();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, u0.i
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c<K, V> put(K key, V value) {
        if (isEmpty()) {
            return new c<>(key, key, this.f140928g.put(key, new w0.a<>(value)));
        }
        w0.a<V> aVar = this.f140928g.get(key);
        if (aVar != null) {
            if (aVar.e() == value) {
                return this;
            }
            return new c<>(this.f140926e, this.f140927f, this.f140928g.put(key, aVar.h(value)));
        }
        Object obj = this.f140927f;
        w0.a<V> aVar2 = this.f140928g.get(obj);
        f0.m(aVar2);
        return new c<>(this.f140926e, key, this.f140928g.put((K) obj, aVar2.f(key)).put(key, new w0.a<>(value, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMap, java.util.Map, u0.i
    @dl.d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K key) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar;
        w0.a<V> aVar = this.f140928g.get(key);
        if (aVar == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, w0.a<V>> dVarRemove = this.f140928g.remove(key);
        if (aVar.b()) {
            dVar = dVarRemove;
            Object obj = dVarRemove.get(aVar.getF140920b());
            f0.m(obj);
            dVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, w0.a<V>>) dVarRemove.put(aVar.getF140920b(), ((w0.a) obj).f(aVar.getF140921c()));
        }
        dVar = dVarRemove;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVarPut = dVar;
        if (aVar.a()) {
            Object obj2 = dVar.get(aVar.getF140921c());
            f0.m(obj2);
            dVarPut = dVar.put(aVar.getF140921c(), ((w0.a) obj2).g(aVar.getF140920b()));
        }
        return new c<>(!aVar.b() ? aVar.getF140921c() : this.f140926e, !aVar.a() ? aVar.getF140920b() : this.f140927f, dVarPut);
    }

    @Override // java.util.Map, u0.i
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K key, V value) {
        w0.a<V> aVar = this.f140928g.get(key);
        if (aVar != null && f0.g(aVar.e(), value)) {
            return remove(key);
        }
        return this;
    }
}
