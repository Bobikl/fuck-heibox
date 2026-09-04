package kotlin.reflect.jvm.internal.impl.utils;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SmartList.java */
/* JADX INFO: loaded from: classes5.dex */
public class d<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f128300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f128301c;

    /* JADX INFO: compiled from: SmartList.java */
    public static class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f128302b = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f128302b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: SmartList.java */
    public class c extends AbstractC1185d<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f128303c;

        public c() {
            super();
            this.f128303c = ((AbstractList) d.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.d.AbstractC1185d
        protected void a() {
            if (((AbstractList) d.this).modCount == this.f128303c) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) d.this).modCount + "; expected: " + this.f128303c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.d.AbstractC1185d
        protected E b() {
            return (E) d.this.f128301c;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            d.this.clear();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SmartList.java */
    public static abstract class AbstractC1185d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f128305b;

        private AbstractC1185d() {
        }

        protected abstract void a();

        protected abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f128305b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f128305b) {
                throw new NoSuchElementException();
            }
            this.f128305b = true;
            a();
            return b();
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = ak.av;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f128300b)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f128300b);
        }
        if (i11 == 0) {
            this.f128301c = e10;
        } else if (i11 == 1 && i10 == 0) {
            this.f128301c = new Object[]{e10, this.f128301c};
        } else {
            Object[] objArr = new Object[i11 + 1];
            if (i11 == 1) {
                objArr[0] = this.f128301c;
            } else {
                Object[] objArr2 = (Object[]) this.f128301c;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f128300b - i10);
            }
            objArr[i10] = e10;
            this.f128301c = objArr;
        }
        this.f128300b++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.f128300b;
        if (i10 == 0) {
            this.f128301c = e10;
        } else if (i10 == 1) {
            this.f128301c = new Object[]{this.f128301c, e10};
        } else {
            Object[] objArr = (Object[]) this.f128301c;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f128301c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f128300b] = e10;
        }
        this.f128300b++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f128301c = null;
        this.f128300b = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f128300b)) {
            return i11 == 1 ? (E) this.f128301c : (E) ((Object[]) this.f128301c)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f128300b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        int i10 = this.f128300b;
        if (i10 == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                a(2);
            }
            return bVarA;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f128300b)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f128300b);
        }
        if (i11 == 1) {
            e10 = (E) this.f128301c;
            this.f128301c = null;
        } else {
            Object[] objArr = (Object[]) this.f128301c;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f128301c = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f128300b - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f128300b--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f128300b)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f128300b);
        }
        if (i11 == 1) {
            E e11 = (E) this.f128301c;
            this.f128301c = e10;
            return e11;
        }
        Object[] objArr = (Object[]) this.f128301c;
        E e12 = (E) objArr[i10];
        objArr[i10] = e10;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f128300b;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f128300b;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f128301c, 0, i10, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @dl.d
    public <T> T[] toArray(@dl.d T[] tArr) {
        if (tArr == 0) {
            a(4);
        }
        int length = tArr.length;
        int i10 = this.f128300b;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f128301c;
                return tArr2;
            }
            tArr[0] = this.f128301c;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f128301c, i10, tArr.getClass());
                if (tArr3 == null) {
                    a(6);
                }
                return tArr3;
            }
            if (i10 != 0) {
                System.arraycopy(this.f128301c, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f128300b;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }
}
