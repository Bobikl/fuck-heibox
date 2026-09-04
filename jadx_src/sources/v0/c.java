package v0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.aranger.constant.Constants;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0006H\u0096\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006("}, d2 = {"Lv0/c;", "K", androidx.exifinterface.media.a.X4, "Lu0/e;", "", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "b", "()I", UiKitSpanObj.TYPE_SIZE, "Lu0/f;", Constants.PARAM_KEYS, "Lu0/f;", "m", "()Lu0/f;", "Lu0/b;", "values", "Lu0/b;", "t", "()Lu0/b;", "", "entries", "B0", "impl", "<init>", "(Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c<K, V> implements e<K, V>, Map<K, V>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<K, V> f140813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final f<K> f140814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final u0.b<V> f140815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final f<Map.Entry<K, V>> f140816e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.d Map<K, ? extends V> impl) {
        f0.p(impl, "impl");
        this.f140813b = impl;
        this.f140814c = new d(impl.keySet());
        this.f140815d = new a(impl.values());
        this.f140816e = new d(impl.entrySet());
    }

    @Override // u0.e
    @dl.d
    public f<Map.Entry<K, V>> B0() {
        return this.f140816e;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ f<Map.Entry<K, V>> entrySet() {
        return B0();
    }

    public int b() {
        return this.f140813b.size();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ f<K> keySet() {
        return m();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.f140813b.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.f140813b.containsValue(value);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ u0.b<V> values() {
        return t();
    }

    @Override // java.util.Map
    public boolean equals(@dl.e Object other) {
        return this.f140813b.equals(other);
    }

    @Override // java.util.Map
    @dl.e
    public V get(Object key) {
        return this.f140813b.get(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f140813b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f140813b.isEmpty();
    }

    @Override // u0.e
    @dl.d
    public f<K> m() {
        return this.f140814c;
    }

    @Override // java.util.Map
    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    @Override // u0.e
    @dl.d
    public u0.b<V> t() {
        return this.f140815d;
    }

    @dl.d
    public String toString() {
        return this.f140813b.toString();
    }
}
