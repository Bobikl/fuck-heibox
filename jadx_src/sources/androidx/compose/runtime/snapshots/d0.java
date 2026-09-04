package androidx.compose.runtime.snapshots;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0016\u0010\u001d\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J \u0010 \u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R$\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b&\u00101¨\u00065"}, d2 = {"Landroidx/compose/runtime/snapshots/d0;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", "g", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "e", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "b", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", ak.av, "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "parentList", ak.aF, "I", androidx.constraintlayout.core.motion.utils.w.c.R, "d", "modification", "<set-?>", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d0<T> implements List<T>, zh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SnapshotStateList<T> parentList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/d0$a", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", ak.av, "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "b", ak.aF, "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements ListIterator<T>, zh.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f13233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0<T> f13234c;

        a(Ref.IntRef intRef, d0<T> d0Var) {
            this.f13233b = intRef;
            this.f13234c = d0Var;
        }

        @Override // java.util.ListIterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void add(T element) {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        @dl.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void set(T element) {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f13233b.f124889b < this.f13234c.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f13233b.f124889b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.f13233b.f124889b + 1;
            s.e(i10, this.f13234c.size());
            this.f13233b.f124889b = i10;
            return this.f13234c.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f13233b.f124889b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f13233b.f124889b;
            s.e(i10, this.f13234c.size());
            this.f13233b.f124889b = i10 - 1;
            return this.f13234c.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f13233b.f124889b;
        }
    }

    public d0(@dl.d SnapshotStateList<T> parentList, int i10, int i11) {
        kotlin.jvm.internal.f0.p(parentList, "parentList");
        this.parentList = parentList;
        this.offset = i10;
        this.modification = parentList.g();
        this.size = i11 - i10;
    }

    private final void g() {
        if (this.parentList.g() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @dl.d
    public final SnapshotStateList<T> a() {
        return this.parentList;
    }

    @Override // java.util.List
    public void add(int index, T element) {
        g();
        this.parentList.add(this.offset + index, element);
        this.size = size() + 1;
        this.modification = this.parentList.g();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        g();
        this.parentList.add(this.offset + size(), element);
        this.size = size() + 1;
        this.modification = this.parentList.g();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, @dl.d Collection<? extends T> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        g();
        boolean zAddAll = this.parentList.addAll(index + this.offset, elements);
        if (zAddAll) {
            this.size = size() + elements.size();
            this.modification = this.parentList.g();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@dl.d Collection<? extends T> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return addAll(size(), elements);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            g();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i10 = this.offset;
            snapshotStateList.x(i10, size() + i10);
            this.size = 0;
            this.modification = this.parentList.g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public T e(int index) {
        g();
        T tRemove = this.parentList.remove(this.offset + index);
        this.size = size() - 1;
        this.modification = this.parentList.g();
        return tRemove;
    }

    @Override // java.util.List
    public T get(int index) {
        g();
        s.e(index, size());
        return this.parentList.get(this.offset + index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        g();
        int i10 = this.offset;
        Iterator<Integer> it = fi.u.W1(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((k0) it).nextInt();
            if (kotlin.jvm.internal.f0.g(element, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        g();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!kotlin.jvm.internal.f0.g(element, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<T> listIterator(int index) {
        g();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f124889b = index - 1;
        return new a(intRef, this);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return e(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        g();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i10 = this.offset;
        int iY = snapshotStateList.y(elements, i10, size() + i10);
        if (iY > 0) {
            this.modification = this.parentList.g();
            this.size = size() - iY;
        }
        return iY > 0;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        s.e(index, size());
        g();
        T t10 = this.parentList.set(index + this.offset, element);
        this.modification = this.parentList.g();
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @dl.d
    public List<T> subList(int fromIndex, int toIndex) {
        if (!((fromIndex >= 0 && fromIndex <= toIndex) && toIndex <= size())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        g();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i10 = this.offset;
        return new d0(snapshotStateList, fromIndex + i10, toIndex + i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
