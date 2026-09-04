package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import y0.DeltaCounter;

/* JADX INFO: compiled from: PersistentHashMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\bB\u0010CJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0011\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00102\u001a\u00020(2\u0006\u0010\r\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00105\u001a\u0002032\u0006\u00104\u001a\u0002038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010@¨\u0006D"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "K", androidx.exifinterface.media.a.X4, "Lu0/i$a;", "Lkotlin/collections/e;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "e", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Lkotlin/b2;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "n", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)V", "node", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "operationResult", "", "f", "I", "g", "()I", "l", "(I)V", "modCount", ak.aF, "r", UiKitSpanObj.TYPE_SIZE, "Ly0/f;", "<set-?>", "ownership", "Ly0/f;", "j", "()Ly0/f;", "", "", ak.av, "()Ljava/util/Set;", "entries", Constants.PARAM_KEYS, "", "()Ljava/util/Collection;", "values", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f<K, V> extends kotlin.collections.e<K, V> implements u0.i.a<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private d<K, V> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private y0.f f12706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private u<K, V> node;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private V operationResult;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int size;

    public f(@dl.d d<K, V> map) {
        f0.p(map, "map");
        this.map = map;
        this.f12706c = new y0.f();
        this.node = this.map.u();
        this.size = this.map.size();
    }

    @Override // kotlin.collections.e
    @dl.d
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // kotlin.collections.e
    @dl.d
    public Set<K> b() {
        return new j(this);
    }

    @Override // kotlin.collections.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u<K, V> uVarA = u.INSTANCE.a();
        f0.n(uVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = uVarA;
        r(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.node.n(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.e
    @dl.d
    public Collection<V> d() {
        return new l(this);
    }

    @Override // u0.i.a
    @dl.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d<K, V> build() {
        d<K, V> dVar;
        if (this.node == this.map.u()) {
            dVar = this.map;
        } else {
            this.f12706c = new y0.f();
            dVar = new d<>(this.node, size());
        }
        this.map = dVar;
        return dVar;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @dl.e
    public V get(Object key) {
        return this.node.r(key != null ? key.hashCode() : 0, key, 0);
    }

    @dl.d
    public final u<K, V> h() {
        return this.node;
    }

    @dl.e
    public final V i() {
        return this.operationResult;
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final y0.f getF12706c() {
        return this.f12706c;
    }

    public final void l(int i10) {
        this.modCount = i10;
    }

    public final void n(@dl.d u<K, V> uVar) {
        f0.p(uVar, "<set-?>");
        this.node = uVar;
    }

    public final void p(@dl.e V v10) {
        this.operationResult = v10;
    }

    @Override // kotlin.collections.e, java.util.AbstractMap, java.util.Map
    @dl.e
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.G(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@dl.d Map<? extends K, ? extends V> from) {
        f0.p(from, "from");
        d<K, V> dVarBuild = from instanceof d ? (d) from : null;
        if (dVarBuild == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVarBuild = fVar != null ? fVar.build() : null;
        }
        if (dVarBuild == null) {
            super.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        u<K, V> uVar = this.node;
        u<K, V> uVarU = dVarBuild.u();
        f0.n(uVarU, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = uVar.H(uVarU, 0, deltaCounter, this);
        int size2 = (dVarBuild.size() + size) - deltaCounter.d();
        if (size != size2) {
            r(size2);
        }
    }

    public void r(int i10) {
        this.size = i10;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @dl.e
    public V remove(Object key) {
        this.operationResult = null;
        u uVarJ = this.node.J(key != null ? key.hashCode() : 0, key, 0, this);
        if (uVarJ == null) {
            uVarJ = u.INSTANCE.a();
            f0.n(uVarJ, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = uVarJ;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        u uVarK = this.node.K(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (uVarK == null) {
            uVarK = u.INSTANCE.a();
            f0.n(uVarK, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = uVarK;
        return size != size();
    }
}
