package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import u0.j;
import yh.l;

/* JADX INFO: compiled from: PersistentHashSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001(B\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", androidx.exifinterface.media.a.S4, "Lkotlin/collections/g;", "Lu0/j;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lu0/j;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "f", "retainAll", "containsAll", "clear", "", "iterator", "Lu0/j$a;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", ak.aF, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "b", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "", "d", "I", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;I)V", "e", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a<E> extends g<E> implements j<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final a f12746f = new a(e.INSTANCE.a(), 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<E> node;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: PersistentHashSet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a$a;", "", androidx.exifinterface.media.a.S4, "Lu0/j;", ak.av, "()Lu0/j;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/a;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final <E> j<E> a() {
            return a.f12746f;
        }
    }

    public a(@dl.d e<E> node, int i10) {
        f0.p(node, "node");
        this.node = node;
        this.size = i10;
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> add(E element) {
        e<E> eVarB = this.node.b(element != null ? element.hashCode() : 0, element, 0);
        return this.node == eVarB ? this : new a(eVarB, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        j.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(elements);
        return aVarBuilder.build();
    }

    @dl.d
    public final e<E> b() {
        return this.node;
    }

    @Override // u0.g
    @dl.d
    public j.a<E> builder() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> clear() {
        return INSTANCE.a();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.node.i(element != null ? element.hashCode() : 0, element, 0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        if (elements instanceof a) {
            return this.node.j(((a) elements).node, 0);
        }
        return elements instanceof b ? this.node.j(((b) elements).g(), 0) : super.containsAll(elements);
    }

    @Override // u0.g
    @dl.d
    public j<E> f(@dl.d l<? super E, Boolean> predicate) {
        f0.p(predicate, "predicate");
        j.a<E> aVarBuilder = builder();
        x.D0(aVarBuilder, predicate);
        return aVarBuilder.build();
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.g, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        return new c(this.node);
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> remove(E element) {
        e<E> eVarK = this.node.K(element != null ? element.hashCode() : 0, element, 0);
        return this.node == eVarK ? this : new a(eVarK, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> removeAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        j.a<E> aVarBuilder = builder();
        aVarBuilder.removeAll(elements);
        return aVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> retainAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        j.a<E> aVarBuilder = builder();
        aVarBuilder.retainAll(elements);
        return aVarBuilder.build();
    }
}
