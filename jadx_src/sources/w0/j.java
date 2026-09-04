package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0096\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lw0/j;", "K", androidx.exifinterface.media.a.X4, "", "Lkotlin/collections/c;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "Lkotlin/b2;", "clear", "", "iterator", "", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "Lw0/d;", "builder", "<init>", "(Lw0/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class j<K, V> extends kotlin.collections.c<V> implements Collection<V>, zh.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d<K, V> f140943b;

    public j(@dl.d d<K, V> builder) {
        f0.p(builder, "builder");
        this.f140943b = builder;
    }

    @Override // kotlin.collections.c
    public int a() {
        return this.f140943b.size();
    }

    @Override // kotlin.collections.c, java.util.AbstractCollection, java.util.Collection
    public boolean add(V element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f140943b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object element) {
        return this.f140943b.containsValue(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<V> iterator() {
        return new k(this.f140943b);
    }
}
