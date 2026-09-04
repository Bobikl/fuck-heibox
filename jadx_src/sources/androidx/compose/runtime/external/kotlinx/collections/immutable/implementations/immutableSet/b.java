package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import u0.j;
import y0.DeltaCounter;

/* JADX INFO: compiled from: PersistentHashSetBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0016\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R*\u0010)\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010(R$\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020*8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", androidx.exifinterface.media.a.S4, "Lkotlin/collections/f;", "Lu0/j$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "b", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "retainAll", "removeAll", "containsAll", "remove", "Lkotlin/b2;", "clear", "", "iterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "<set-?>", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "", "e", "I", "()I", "modCount", "value", "f", ak.av, "i", "(I)V", UiKitSpanObj.TYPE_SIZE, "Ly0/f;", "ownership", "Ly0/f;", RXScreenCaptureService.KEY_HEIGHT, "()Ly0/f;", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b<E> extends kotlin.collections.f<E> implements j.a<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private a<E> set;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private y0.f f12750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private e<E> node;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int size;

    public b(@dl.d a<E> set) {
        f0.p(set, "set");
        this.set = set;
        this.f12750c = new y0.f();
        this.node = this.set.b();
        this.size = this.set.size();
    }

    @Override // kotlin.collections.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        int size = size();
        this.node = this.node.u(element != null ? element.hashCode() : 0, element, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        a<E> aVarBuild = elements instanceof a ? (a) elements : null;
        if (aVarBuild == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.addAll(elements);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        e<E> eVarV = this.node.v(aVarBuild.b(), 0, deltaCounter, this);
        int size2 = (elements.size() + size) - deltaCounter.d();
        if (size != size2) {
            this.node = eVarV;
            i(size2);
        }
        return size != size();
    }

    @Override // u0.j.a, u0.g.a
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a<E> build() {
        a<E> aVar;
        if (this.node == this.set.b()) {
            aVar = this.set;
        } else {
            this.f12750c = new y0.f();
            aVar = new a<>(this.node, size());
        }
        this.set = aVar;
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        e<E> eVarA = e.INSTANCE.a();
        f0.n(eVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eVarA;
        i(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.node.i(element != null ? element.hashCode() : 0, element, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        if (elements instanceof a) {
            return this.node.j(((a) elements).b(), 0);
        }
        return elements instanceof b ? this.node.j(((b) elements).node, 0) : super.containsAll(elements);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    @dl.d
    public final e<E> g() {
        return this.node;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final y0.f getF12750c() {
        return this.f12750c;
    }

    public void i(int i10) {
        this.size = i10;
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<E> iterator() {
        return new d(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int size = size();
        this.node = this.node.E(element != null ? element.hashCode() : 0, element, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        a<E> aVarBuild = elements instanceof a ? (a) elements : null;
        if (aVarBuild == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.removeAll(elements);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        Object objF = this.node.F(aVarBuild.b(), 0, deltaCounter, this);
        int iD = size - deltaCounter.d();
        if (iD == 0) {
            clear();
        } else if (iD != size) {
            f0.n(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (e) objF;
            i(iD);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        a<E> aVarBuild = elements instanceof a ? (a) elements : null;
        if (aVarBuild == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.retainAll(elements);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        Object objH = this.node.H(aVarBuild.b(), 0, deltaCounter, this);
        int iD = deltaCounter.d();
        if (iD == 0) {
            clear();
        } else if (iD != size) {
            f0.n(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.node = (e) objH;
            i(iD);
        }
        return size != size();
    }
}
