package androidx.compose.ui.node;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000b2B\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tJ+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0086\bø\u0001\u0003J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u0018\u0010\"\u001a\u00028\u00002\u0006\u0010!\u001a\u00020 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\tH\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0002J\u0017\u0010)\u001a\u00020 2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010%J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010!\u001a\u00020 H\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 H\u0016J\u0006\u0010/\u001a\u00020\u0003R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010@\u001a\u00020 2\u0006\u0010<\u001a\u00020 8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010?\u0082\u0002\u0016\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/node/k;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", "v", "Landroidx/compose/ui/node/f;", "i", "()J", RXScreenCaptureService.KEY_HEIGHT, "", "l", ak.av, "", "distanceFromEdge", "isInLayer", ak.aG, "node", "Lkotlin/Function0;", "childHitTest", "o", "(Ljava/lang/Object;ZLyh/a;)V", ak.aB, "(Ljava/lang/Object;FZLyh/a;)V", "x", "block", RXScreenCaptureService.KEY_WIDTH, "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "clear", "", "", "b", "[Ljava/lang/Object;", "values", "", ak.aF, "[J", "distanceFromEdgeAndInLayer", "d", "I", "hitDepth", "<set-?>", "e", "j", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class k<T> implements List<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] values = new Object[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private long[] distanceFromEdgeAndInLayer = new long[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: compiled from: HitTestResult.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0006J\b\u0010\n\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/k$a;", "", "", "hasNext", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "previous", "previousIndex", "b", "I", ak.av, "()I", "d", "(I)V", UCropPlusActivity.ARG_INDEX, ak.aF, "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/k;III)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class a implements ListIterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public a(int i10, int i11, int i12) {
            this.index = i10;
            this.minIndex = i11;
            this.maxIndex = i12;
        }

        public /* synthetic */ a(k kVar, int i10, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? kVar.size() : i12);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMaxIndex() {
            return this.maxIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMinIndex() {
            return this.minIndex;
        }

        public final void d(int i10) {
            this.index = i10;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Object[] objArr = ((k) k.this).values;
            int i10 = this.index;
            this.index = i10 + 1;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Object[] objArr = ((k) k.this).values;
            int i10 = this.index - 1;
            this.index = i10;
            return (T) objArr[i10];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: HitTestResult.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010 \u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/k$b;", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "b", "I", "()I", "minIndex", ak.aF, ak.av, "maxIndex", "e", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/ui/node/k;II)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class b implements List<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public b(int i10, int i11) {
            this.minIndex = i10;
            this.maxIndex = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return indexOf(element) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int e() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public T get(int index) {
            return (T) ((k) k.this).values[index + this.minIndex];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i10 = this.minIndex;
            int i11 = this.maxIndex;
            if (i10 > i11) {
                return -1;
            }
            while (!kotlin.jvm.internal.f0.g(((k) k.this).values[i10], element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            k<T> kVar = k.this;
            int i10 = this.minIndex;
            return kVar.new a(i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i10 = this.maxIndex;
            int i11 = this.minIndex;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.f0.g(((k) k.this).values[i10], element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator() {
            k<T> kVar = k.this;
            int i10 = this.minIndex;
            return kVar.new a(i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator(int index) {
            k<T> kVar = k.this;
            int i10 = this.minIndex;
            return kVar.new a(index + i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        public T remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @dl.d
        public List<T> subList(int fromIndex, int toIndex) {
            k<T> kVar = k.this;
            int i10 = this.minIndex;
            return kVar.new b(fromIndex + i10, i10 + toIndex);
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

    private final void h() {
        int i10 = this.hitDepth;
        Object[] objArr = this.values;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = jArrCopyOf;
        }
    }

    private final long i() {
        long jA = l.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.hitDepth + 1;
        int iG = CollectionsKt__CollectionsKt.G(this);
        if (i10 <= iG) {
            while (true) {
                long jC = f.c(this.distanceFromEdgeAndInLayer[i10]);
                if (f.b(jC, jA) < 0) {
                    jA = jC;
                }
                if (f.f(jA) < 0.0f && f.i(jA)) {
                    return jA;
                }
                if (i10 != iG) {
                    i10++;
                }
            }
        }
        return jA;
    }

    private final void v() {
        int i10 = this.hitDepth + 1;
        int iG = CollectionsKt__CollectionsKt.G(this);
        if (i10 <= iG) {
            while (true) {
                this.values[i10] = null;
                if (i10 == iG) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void a() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        v();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int index) {
        return (T) this.values[index];
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        int iG = CollectionsKt__CollectionsKt.G(this);
        if (iG < 0) {
            return -1;
        }
        int i10 = 0;
        while (!kotlin.jvm.internal.f0.g(this.values[i10], element)) {
            if (i10 == iG) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final boolean l() {
        long jI = i();
        return f.f(jI) < 0.0f && f.i(jI);
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        for (int iG = CollectionsKt__CollectionsKt.G(this); -1 < iG; iG--) {
            if (kotlin.jvm.internal.f0.g(this.values[iG], element)) {
                return iG;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<T> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<T> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    public final void o(T node, boolean isInLayer, @dl.d yh.a<b2> childHitTest) {
        kotlin.jvm.internal.f0.p(childHitTest, "childHitTest");
        s(node, -1.0f, isInLayer, childHitTest);
    }

    @Override // java.util.List
    public T remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void s(T node, float distanceFromEdge, boolean isInLayer, @dl.d yh.a<b2> childHitTest) {
        kotlin.jvm.internal.f0.p(childHitTest, "childHitTest");
        int i10 = this.hitDepth;
        this.hitDepth = i10 + 1;
        h();
        Object[] objArr = this.values;
        int i11 = this.hitDepth;
        objArr[i11] = node;
        this.distanceFromEdgeAndInLayer[i11] = l.a(distanceFromEdge, isInLayer);
        v();
        childHitTest.invoke();
        this.hitDepth = i10;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @dl.d
    public List<T> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
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

    public final boolean u(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == CollectionsKt__CollectionsKt.G(this)) {
            return true;
        }
        return f.b(i(), l.a(distanceFromEdge, isInLayer)) > 0;
    }

    public final void w(@dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int i10 = this.hitDepth;
        block.invoke();
        this.hitDepth = i10;
    }

    public final void x(T node, float distanceFromEdge, boolean isInLayer, @dl.d yh.a<b2> childHitTest) {
        kotlin.jvm.internal.f0.p(childHitTest, "childHitTest");
        if (this.hitDepth == CollectionsKt__CollectionsKt.G(this)) {
            s(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.hitDepth + 1 == CollectionsKt__CollectionsKt.G(this)) {
                v();
                return;
            }
            return;
        }
        long jI = i();
        int i10 = this.hitDepth;
        this.hitDepth = CollectionsKt__CollectionsKt.G(this);
        s(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.hitDepth + 1 < CollectionsKt__CollectionsKt.G(this) && f.b(jI, i()) > 0) {
            int i11 = this.hitDepth + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.values;
            kotlin.collections.m.c1(objArr, objArr, i12, i11, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            kotlin.collections.m.b1(jArr, jArr, i12, i11, size());
            this.hitDepth = ((size() + i10) - this.hitDepth) - 1;
        }
        v();
        this.hitDepth = i10;
    }
}
