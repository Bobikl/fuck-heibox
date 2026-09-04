package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\nH\u0096\u0002J\u001c\u0010\r\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lw0/e;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/a;", "", "element", "", "i", "Lkotlin/b2;", "clear", "", "iterator", "", RXScreenCaptureService.KEY_HEIGHT, "e", "", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "Lw0/d;", "builder", "<init>", "(Lw0/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d<K, V> f140933b;

    public e(@dl.d d<K, V> builder) {
        f0.p(builder, "builder");
        this.f140933b = builder;
    }

    @Override // kotlin.collections.f
    /* JADX INFO: renamed from: a */
    public int getSize() {
        return this.f140933b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f140933b.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean e(@dl.d Map.Entry<? extends K, ? extends V> element) {
        f0.p(element, "element");
        V v10 = this.f140933b.get(element.getKey());
        if (v10 != null) {
            return f0.g(v10, element.getValue());
        }
        return element.getValue() == null && this.f140933b.containsKey(element.getKey());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.a
    public boolean h(@dl.d Map.Entry<? extends K, ? extends V> element) {
        f0.p(element, "element");
        return this.f140933b.remove(element.getKey(), element.getValue());
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(@dl.d Map.Entry<K, V> element) {
        f0.p(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return new f(this.f140933b);
    }
}
