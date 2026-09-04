package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.k0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
public final class b0 {

    /* JADX INFO: compiled from: SparseArray.kt */
    public static final class a extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f21236c;

        a(SparseArray<T> sparseArray) {
            this.f21236c = sparseArray;
        }

        public final int a() {
            return this.f21235b;
        }

        public final void b(int i10) {
            this.f21235b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21235b < this.f21236c.size();
        }

        @Override // kotlin.collections.k0
        public int nextInt() {
            SparseArray<T> sparseArray = this.f21236c;
            int i10 = this.f21235b;
            this.f21235b = i10 + 1;
            return sparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SparseArray.kt */
    public static final class b<T> implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f21238c;

        b(SparseArray<T> sparseArray) {
            this.f21238c = sparseArray;
        }

        public final int a() {
            return this.f21237b;
        }

        public final void b(int i10) {
            this.f21237b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21237b < this.f21238c.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f21238c;
            int i10 = this.f21237b;
            this.f21237b = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@dl.d SparseArray<T> sparseArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean b(@dl.d SparseArray<T> sparseArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean c(@dl.d SparseArray<T> sparseArray, T t10) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return sparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@dl.d SparseArray<T> sparseArray, @dl.d yh.p<? super Integer, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
        }
    }

    public static final <T> T e(@dl.d SparseArray<T> sparseArray, int i10, T t10) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        T t11 = sparseArray.get(i10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@dl.d SparseArray<T> sparseArray, int i10, @dl.d yh.a<? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        T t10 = sparseArray.get(i10);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    public static final <T> int g(@dl.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean h(@dl.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@dl.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @dl.d
    public static final <T> k0 j(@dl.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return new a(sparseArray);
    }

    @dl.d
    public static final <T> SparseArray<T> k(@dl.d SparseArray<T> sparseArray, @dl.d SparseArray<T> other) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size() + other.size());
        l(sparseArray2, sparseArray);
        l(sparseArray2, other);
        return sparseArray2;
    }

    public static final <T> void l(@dl.d SparseArray<T> sparseArray, @dl.d SparseArray<T> other) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public static final <T> boolean m(@dl.d SparseArray<T> sparseArray, int i10, T t10) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.f0.g(t10, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void n(@dl.d SparseArray<T> sparseArray, int i10, T t10) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        sparseArray.put(i10, t10);
    }

    @dl.d
    public static final <T> Iterator<T> o(@dl.d SparseArray<T> sparseArray) {
        kotlin.jvm.internal.f0.p(sparseArray, "<this>");
        return new b(sparseArray);
    }
}
