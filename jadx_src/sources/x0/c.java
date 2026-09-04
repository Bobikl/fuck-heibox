package x0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.f0;
import u0.j;

/* JADX INFO: compiled from: PersistentOrderedSetBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lx0/c;", androidx.exifinterface.media.a.S4, "Lkotlin/collections/f;", "Lu0/j$a;", "Lu0/j;", "build", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "Lkotlin/b2;", "clear", "", "iterator", "", "firstElement", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Lx0/a;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "e", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "Lx0/b;", "set", "<init>", "(Lx0/b;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c<E> extends f<E> implements j.a<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private b<E> f141053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Object f141054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Object f141055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<E, a> f141056e;

    public c(@dl.d b<E> set) {
        f0.p(set, "set");
        this.f141053b = set;
        this.f141054c = set.getF141050c();
        this.f141055d = this.f141053b.getF141051d();
        this.f141056e = this.f141053b.e().builder();
    }

    @Override // kotlin.collections.f
    /* JADX INFO: renamed from: a */
    public int getSize() {
        return this.f141056e.size();
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        if (this.f141056e.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.f141054c = element;
            this.f141055d = element;
            this.f141056e.put(element, new a());
            return true;
        }
        a aVar = this.f141056e.get(this.f141055d);
        f0.m(aVar);
        this.f141056e.put((E) this.f141055d, aVar.e(element));
        this.f141056e.put(element, new a(this.f141055d));
        this.f141055d = element;
        return true;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getF141054c() {
        return this.f141054c;
    }

    @Override // u0.g.a
    @dl.d
    public j<E> build() {
        b<E> bVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, a> dVarBuild = this.f141056e.build();
        if (dVarBuild == this.f141053b.e()) {
            y0.a.a(this.f141054c == this.f141053b.getF141050c());
            y0.a.a(this.f141055d == this.f141053b.getF141051d());
            bVar = this.f141053b;
        } else {
            bVar = new b<>(this.f141054c, this.f141055d, dVarBuild);
        }
        this.f141053b = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f141056e.clear();
        y0.c cVar = y0.c.f141522a;
        this.f141054c = cVar;
        this.f141055d = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.f141056e.containsKey(element);
    }

    @dl.d
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<E, a> e() {
        return this.f141056e;
    }

    public final void g(@dl.e Object obj) {
        this.f141054c = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<E> iterator() {
        return new e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        a aVarRemove = this.f141056e.remove(element);
        if (aVarRemove == null) {
            return false;
        }
        if (aVarRemove.b()) {
            a aVar = this.f141056e.get(aVarRemove.getF141046a());
            f0.m(aVar);
            this.f141056e.put((E) aVarRemove.getF141046a(), aVar.e(aVarRemove.getF141047b()));
        } else {
            this.f141054c = aVarRemove.getF141047b();
        }
        if (!aVarRemove.a()) {
            this.f141055d = aVarRemove.getF141046a();
            return true;
        }
        a aVar2 = this.f141056e.get(aVarRemove.getF141047b());
        f0.m(aVar2);
        this.f141056e.put((E) aVarRemove.getF141047b(), aVar2.f(aVarRemove.getF141046a()));
        return true;
    }
}
