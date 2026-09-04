package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.f0;
import kotlin.r0;

/* JADX INFO: compiled from: PersistentHashMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 1*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00012B#\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0002J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\bH\u0001J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J*\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0016R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R&\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'¨\u00063"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "K", androidx.exifinterface.media.a.X4, "Lkotlin/collections/AbstractMap;", "Lu0/i;", "Lu0/f;", "", "p", "", ak.aF, "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", RXScreenCaptureService.KEY_WIDTH, "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "x", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "y", "", "m", "putAll", "clear", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "n", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", ak.aG, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "", "f", "I", "()I", UiKitSpanObj.TYPE_SIZE, "()Lu0/f;", Constants.PARAM_KEYS, "Lu0/b;", "t", "()Lu0/b;", "values", "B0", "entries", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;I)V", "g", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d<K, V> extends AbstractMap<K, V> implements u0.i<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final d f12699h = new d(u.INSTANCE.a(), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final u<K, V> node;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PersistentHashMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d$a;", "", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", ak.av, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f12699h;
            f0.n(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    public d(@dl.d u<K, V> node, int i10) {
        f0.p(node, "node");
        this.node = node;
        this.size = i10;
    }

    private final u0.f<Map.Entry<K, V>> p() {
        return new o(this);
    }

    @Override // u0.e
    @dl.d
    public u0.f<Map.Entry<K, V>> B0() {
        return p();
    }

    @Override // kotlin.collections.AbstractMap
    @dl.d
    @r0
    public final Set<Map.Entry<K, V>> c() {
        return p();
    }

    @Override // java.util.Map, u0.i
    @dl.d
    public u0.i<K, V> clear() {
        return INSTANCE.a();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.node.n(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    @dl.e
    public V get(Object key) {
        return this.node.r(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public u0.f<K> d() {
        return new q(this);
    }

    @Override // u0.i
    @dl.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder() {
        return new f<>(this);
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

    public final /* bridge */ u0.f<Map.Entry<K, V>> r() {
        return B0();
    }

    @Override // kotlin.collections.AbstractMap
    @dl.d
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public u0.b<V> g() {
        return new s(this);
    }

    @dl.d
    public final u<K, V> u() {
        return this.node;
    }

    public final /* bridge */ u0.f<K> v() {
        return d();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, u0.i
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public d<K, V> put(K key, V value) {
        u.b<K, V> bVarS = this.node.S(key != null ? key.hashCode() : 0, key, value, 0);
        return bVarS == null ? this : new d<>(bVarS.a(), size() + bVarS.getSizeDelta());
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, u0.i
    @dl.d
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K key) {
        u<K, V> uVarT = this.node.T(key != null ? key.hashCode() : 0, key, 0);
        if (this.node == uVarT) {
            return this;
        }
        return uVarT == null ? INSTANCE.a() : new d<>(uVarT, size() - 1);
    }

    @Override // java.util.Map, u0.i
    @dl.d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K key, V value) {
        u<K, V> uVarU = this.node.U(key != null ? key.hashCode() : 0, key, value, 0);
        if (this.node == uVarU) {
            return this;
        }
        return uVarU == null ? INSTANCE.a() : new d<>(uVarU, size() - 1);
    }

    public final /* bridge */ u0.b<V> z() {
        return g();
    }
}
