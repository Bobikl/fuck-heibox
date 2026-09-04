package androidx.compose.ui.layout;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/r1;", "", "Landroidx/compose/ui/layout/r1$a;", "slotIds", "Lkotlin/b2;", ak.av, "slotId", "reusableSlotId", "", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface r1 {

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0003J\u0019\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0096\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0013\u001a\u00020\u00042\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0011J\u0016\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0015\u001a\u00020\u00042\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0011J\u0006\u0010\u0017\u001a\u00020\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/layout/r1$a;", "", "", "element", "", "contains", "elements", "containsAll", "isEmpty", "slotId", ak.av, "(Ljava/lang/Object;)Z", "", "iterator", "remove", "slotIds", "removeAll", "Lkotlin/Function1;", "predicate", "e", "retainAll", "g", "Lkotlin/b2;", "clear", "", "b", "Ljava/util/Set;", "set", "", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Ljava/util/Set;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a implements Collection<Object>, zh.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15039c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Set<Object> set;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(@dl.d Set<Object> set) {
            kotlin.jvm.internal.f0.p(set, "set");
            this.set = set;
        }

        public /* synthetic */ a(Set set, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(@dl.e Object slotId) {
            return this.set.add(slotId);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int b() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@dl.e Object element) {
            return this.set.contains(element);
        }

        @Override // java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return this.set.containsAll(elements);
        }

        public final boolean e(@dl.d yh.l<Object, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return kotlin.collections.x.D0(this.set, predicate);
        }

        public final boolean g(@dl.d yh.l<Object, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return kotlin.collections.x.N0(this.set, predicate);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@dl.e Object slotId) {
            return this.set.remove(slotId);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@dl.d Collection<? extends Object> slotIds) {
            kotlin.jvm.internal.f0.p(slotIds, "slotIds");
            return this.set.remove(slotIds);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@dl.d Collection<? extends Object> slotIds) {
            kotlin.jvm.internal.f0.p(slotIds, "slotIds");
            return this.set.retainAll(slotIds);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.a(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            return (T[]) kotlin.jvm.internal.t.b(this, array);
        }
    }

    void a(@dl.d a aVar);

    boolean b(@dl.e Object slotId, @dl.e Object reusableSlotId);
}
