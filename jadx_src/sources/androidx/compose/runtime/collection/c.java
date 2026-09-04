package androidx.compose.runtime.collection;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;
import kotlin.r0;
import yh.l;

/* JADX INFO: compiled from: IdentityArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b1\u0010/J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\rJ\u0006\u0010\u0013\u001a\u00020\u0012J+\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\rJ \u0010\u001b\u001a\u00020\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0014H\u0086\bø\u0001\u0000J\u0016\u0010\u001e\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002R\"\u0010&\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"Landroidx/compose/runtime/collection/c;", "", androidx.exifinterface.media.a.f23244d5, "", "value", "", "b", "midIndex", "valueHash", "e", "element", "", "contains", "(Ljava/lang/Object;)Z", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "add", "Lkotlin/b2;", "clear", "Lkotlin/Function1;", "block", ak.av, "isEmpty", "j", "remove", "predicate", "l", "", "elements", "containsAll", "", "iterator", "I", "g", "()I", "o", "(I)V", UiKitSpanObj.TYPE_SIZE, "", ak.aF, "[Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "()[Ljava/lang/Object;", ak.aB, "([Ljava/lang/Object;)V", "getValues$annotations", "()V", "values", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c<T> implements Set<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] values = new Object[16];

    /* JADX INFO: compiled from: IdentityArraySet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"androidx/compose/runtime/collection/c$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "I", ak.av, "()I", "(I)V", UCropPlusActivity.ARG_INDEX, "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f12638c;

        a(c<T> cVar) {
            this.f12638c = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void b(int i10) {
            this.index = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f12638c.size();
        }

        @Override // java.util.Iterator
        @dl.d
        public T next() {
            Object[] values = this.f12638c.getValues();
            int i10 = this.index;
            this.index = i10 + 1;
            T t10 = (T) values[i10];
            f0.n(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final int b(Object value) {
        int size = size() - 1;
        int iB = androidx.compose.runtime.b.b(value);
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            T t10 = get(i11);
            int iB2 = androidx.compose.runtime.b.b(t10);
            if (iB2 < iB) {
                i10 = i11 + 1;
            } else {
                if (iB2 <= iB) {
                    return t10 == value ? i11 : e(i11, value, iB);
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    private final int e(int midIndex, Object value, int valueHash) {
        for (int i10 = midIndex - 1; -1 < i10; i10--) {
            Object obj = this.values[i10];
            if (obj == value) {
                return i10;
            }
            if (androidx.compose.runtime.b.b(obj) != valueHash) {
                break;
            }
        }
        int size = midIndex + 1;
        int size2 = size();
        while (size < size2) {
            Object obj2 = this.values[size];
            if (obj2 == value) {
                return size;
            }
            if (androidx.compose.runtime.b.b(obj2) != valueHash) {
                return -(size + 1);
            }
            size++;
        }
        size = size();
        return -(size + 1);
    }

    @r0
    public static /* synthetic */ void i() {
    }

    public final void a(@dl.d l<? super T, b2> block) {
        f0.p(block, "block");
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            block.invoke(get(i10));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@dl.d T value) {
        int iB;
        f0.p(value, "value");
        if (size() > 0) {
            iB = b(value);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i10 = -(iB + 1);
        int size = size();
        Object[] objArr = this.values;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            m.c1(objArr, objArr2, i10 + 1, i10, size());
            m.l1(this.values, objArr2, 0, 0, i10, 6, null);
            this.values = objArr2;
        } else {
            m.c1(objArr, objArr, i10 + 1, i10, size());
        }
        this.values[i10] = value;
        o(size() + 1);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        m.w2(this.values, null, 0, 0, 6, null);
        o(0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@dl.e Object element) {
        return element != null && b(element) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
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

    /* JADX INFO: renamed from: g, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @dl.d
    public final T get(int index) {
        T t10 = (T) this.values[index];
        f0.n(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t10;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean j() {
        return size() > 0;
    }

    public final void l(@dl.d l<? super T, Boolean> predicate) {
        f0.p(predicate, "predicate");
        int size = size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getValues()[i11];
            f0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!predicate.invoke(obj).booleanValue()) {
                if (i10 != i11) {
                    getValues()[i10] = obj;
                }
                i10++;
            }
        }
        int size2 = size();
        for (int i12 = i10; i12 < size2; i12++) {
            getValues()[i12] = null;
        }
        o(i10);
    }

    public void o(int i10) {
        this.size = i10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@dl.e T value) {
        int iB;
        if (value == null || (iB = b(value)) < 0) {
            return false;
        }
        if (iB < size() - 1) {
            Object[] objArr = this.values;
            m.c1(objArr, objArr, iB, iB + 1, size());
        }
        o(size() - 1);
        this.values[size()] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void s(@dl.d Object[] objArr) {
        f0.p(objArr, "<set-?>");
        this.values = objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return t.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        f0.p(array, "array");
        return (T[]) t.b(this, array);
    }
}
