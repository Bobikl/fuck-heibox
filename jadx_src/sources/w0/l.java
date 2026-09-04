package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0096\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lw0/l;", "K", androidx.exifinterface.media.a.X4, "Lu0/f;", "", "Lkotlin/collections/g;", "element", "", ak.av, "", "iterator", "", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "Lw0/c;", "map", "<init>", "(Lw0/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class l<K, V> extends kotlin.collections.g<Map.Entry<? extends K, ? extends V>> implements u0.f<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final c<K, V> f140945c;

    public l(@dl.d c<K, V> map) {
        f0.p(map, "map");
        this.f140945c = map;
    }

    public boolean a(@dl.d Map.Entry<? extends K, ? extends V> element) {
        f0.p(element, "element");
        V v10 = this.f140945c.get(element.getKey());
        if (v10 != null) {
            return f0.g(v10, element.getValue());
        }
        return element.getValue() == null && this.f140945c.containsKey(element.getKey());
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return a((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f140945c.size();
    }

    @Override // kotlin.collections.g, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return new m(this.f140945c);
    }
}
