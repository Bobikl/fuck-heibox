package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/¢\u0006\u0004\b1\u00102J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R(\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lw0/d;", "K", androidx.exifinterface.media.a.X4, "Lkotlin/collections/e;", "Lu0/i$a;", "Lu0/i;", "build", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlin/b2;", "clear", "", "<set-?>", "firstKey", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Lw0/a;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "", ak.aF, "()I", UiKitSpanObj.TYPE_SIZE, "", "", ak.av, "()Ljava/util/Set;", "entries", "b", Constants.PARAM_KEYS, "", "d", "()Ljava/util/Collection;", "values", "Lw0/c;", "map", "<init>", "(Lw0/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d<K, V> extends kotlin.collections.e<K, V> implements u0.i.a<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private c<K, V> f140929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Object f140930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Object f140931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> f140932e;

    public d(@dl.d c<K, V> map) {
        f0.p(map, "map");
        this.f140929b = map;
        this.f140930c = map.getF140926e();
        this.f140931d = this.f140929b.getF140927f();
        this.f140932e = this.f140929b.u().builder();
    }

    @Override // kotlin.collections.e
    @dl.d
    public Set<Map.Entry<K, V>> a() {
        return new e(this);
    }

    @Override // kotlin.collections.e
    @dl.d
    public Set<K> b() {
        return new g(this);
    }

    @Override // u0.i.a
    @dl.d
    public u0.i<K, V> build() {
        c<K, V> cVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> dVarBuild = this.f140932e.build();
        if (dVarBuild == this.f140929b.u()) {
            y0.a.a(this.f140930c == this.f140929b.getF140926e());
            y0.a.a(this.f140931d == this.f140929b.getF140927f());
            cVar = this.f140929b;
        } else {
            cVar = new c<>(this.f140930c, this.f140931d, dVarBuild);
        }
        this.f140929b = cVar;
        return cVar;
    }

    @Override // kotlin.collections.e
    /* JADX INFO: renamed from: c */
    public int getSize() {
        return this.f140932e.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f140932e.clear();
        y0.c cVar = y0.c.f141522a;
        this.f140930c = cVar;
        this.f140931d = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.f140932e.containsKey(key);
    }

    @Override // kotlin.collections.e
    @dl.d
    public Collection<V> d() {
        return new j(this);
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getF140930c() {
        return this.f140930c;
    }

    @dl.d
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> g() {
        return this.f140932e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @dl.e
    public V get(Object key) {
        a<V> aVar = this.f140932e.get(key);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @Override // kotlin.collections.e, java.util.AbstractMap, java.util.Map
    @dl.e
    public V put(K key, V value) {
        a<V> aVar = this.f140932e.get(key);
        if (aVar != null) {
            if (aVar.e() == value) {
                return value;
            }
            this.f140932e.put(key, aVar.h(value));
            return aVar.e();
        }
        if (isEmpty()) {
            this.f140930c = key;
            this.f140931d = key;
            this.f140932e.put(key, new a<>(value));
            return null;
        }
        Object obj = this.f140931d;
        a<V> aVar2 = this.f140932e.get(obj);
        f0.m(aVar2);
        a<V> aVar3 = aVar2;
        y0.a.a(!aVar3.a());
        this.f140932e.put((K) obj, aVar3.f(key));
        this.f140932e.put(key, new a<>(value, obj));
        this.f140931d = key;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @dl.e
    public V remove(Object key) {
        a<V> aVarRemove = this.f140932e.remove(key);
        if (aVarRemove == null) {
            return null;
        }
        if (aVarRemove.b()) {
            a<V> aVar = this.f140932e.get(aVarRemove.getF140920b());
            f0.m(aVar);
            this.f140932e.put((K) aVarRemove.getF140920b(), aVar.f(aVarRemove.getF140921c()));
        } else {
            this.f140930c = aVarRemove.getF140921c();
        }
        if (aVarRemove.a()) {
            a<V> aVar2 = this.f140932e.get(aVarRemove.getF140921c());
            f0.m(aVar2);
            this.f140932e.put((K) aVarRemove.getF140921c(), aVar2.g(aVarRemove.getF140920b()));
        } else {
            this.f140931d = aVarRemove.getF140920b();
        }
        return aVarRemove.e();
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        a<V> aVar = this.f140932e.get(key);
        if (aVar == null || !f0.g(aVar.e(), value)) {
            return false;
        }
        remove(key);
        return true;
    }
}
