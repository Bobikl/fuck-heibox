package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lw0/g;", "K", androidx.exifinterface.media.a.X4, "", "Lkotlin/collections/f;", "element", "", "add", "(Ljava/lang/Object;)Z", "Lkotlin/b2;", "clear", "", "iterator", "remove", "contains", "", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "Lw0/d;", "builder", "<init>", "(Lw0/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class g<K, V> extends kotlin.collections.f<K> implements Set<K>, zh.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d<K, V> f140935b;

    public g(@dl.d d<K, V> builder) {
        f0.p(builder, "builder");
        this.f140935b = builder;
    }

    @Override // kotlin.collections.f
    /* JADX INFO: renamed from: a */
    public int getSize() {
        return this.f140935b.size();
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f140935b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.f140935b.containsKey(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<K> iterator() {
        return new h(this.f140935b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        if (!this.f140935b.containsKey(element)) {
            return false;
        }
        this.f140935b.remove(element);
        return true;
    }
}
