package x0;

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

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B/\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lx0/b;", androidx.exifinterface.media.a.S4, "Lkotlin/collections/g;", "Lu0/j;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lu0/j;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "f", "retainAll", "clear", "", "iterator", "Lu0/j$a;", "builder", "", "firstElement", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "lastElement", "g", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Lx0/a;", "hashMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "e", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b<E> extends g<E> implements j<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f141048f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final b f141049g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Object f141050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final Object f141051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, x0.a> f141052e;

    /* JADX INFO: compiled from: PersistentOrderedSet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lx0/b$a;", "", androidx.exifinterface.media.a.S4, "Lu0/j;", ak.av, "()Lu0/j;", "Lx0/b;", "", "EMPTY", "Lx0/b;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final <E> j<E> a() {
            return b.f141049g;
        }
    }

    static {
        y0.c cVar = y0.c.f141522a;
        f141049g = new b(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a());
    }

    public b(@dl.e Object obj, @dl.e Object obj2, @dl.d androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, x0.a> hashMap) {
        f0.p(hashMap, "hashMap");
        this.f141050c = obj;
        this.f141051d = obj2;
        this.f141052e = hashMap;
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> add(E element) {
        if (this.f141052e.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new b(element, element, this.f141052e.put(element, new x0.a()));
        }
        Object obj = this.f141051d;
        x0.a aVar = this.f141052e.get(obj);
        f0.m(aVar);
        return new b(this.f141050c, element, this.f141052e.put((E) obj, aVar.e(element)).put(element, new x0.a(obj)));
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        j.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(elements);
        return aVarBuilder.build();
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getF141050c() {
        return this.f141050c;
    }

    @Override // u0.g
    @dl.d
    public j.a<E> builder() {
        return new c(this);
    }

    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> clear() {
        return f141048f.a();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.f141052e.containsKey(element);
    }

    @dl.d
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, x0.a> e() {
        return this.f141052e;
    }

    @Override // u0.g
    @dl.d
    public j<E> f(@dl.d l<? super E, Boolean> predicate) {
        f0.p(predicate, "predicate");
        j.a<E> aVarBuilder = builder();
        x.D0(aVarBuilder, predicate);
        return aVarBuilder.build();
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getF141051d() {
        return this.f141051d;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return this.f141052e.size();
    }

    @Override // kotlin.collections.g, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        return new d(this.f141050c, this.f141052e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, u0.g, java.util.List
    @dl.d
    public j<E> remove(E element) {
        x0.a aVar = this.f141052e.get(element);
        if (aVar == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVarRemove = this.f141052e.remove(element);
        if (aVar.b()) {
            V v10 = dVarRemove.get(aVar.getF141046a());
            f0.m(v10);
            dVarRemove = dVarRemove.put(aVar.getF141046a(), ((x0.a) v10).e(aVar.getF141047b()));
        }
        if (aVar.a()) {
            V v11 = dVarRemove.get(aVar.getF141047b());
            f0.m(v11);
            dVarRemove = dVarRemove.put(aVar.getF141047b(), ((x0.a) v11).f(aVar.getF141046a()));
        }
        return new b(!aVar.b() ? aVar.getF141047b() : this.f141050c, !aVar.a() ? aVar.getF141046a() : this.f141051d, dVarRemove);
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
