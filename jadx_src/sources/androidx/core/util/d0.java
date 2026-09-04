package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.b2;
import kotlin.collections.k0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SparseIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class d0 {

    /* JADX INFO: compiled from: SparseIntArray.kt */
    public static final class a extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f21244c;

        a(SparseIntArray sparseIntArray) {
            this.f21244c = sparseIntArray;
        }

        public final int a() {
            return this.f21243b;
        }

        public final void b(int i10) {
            this.f21243b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21243b < this.f21244c.size();
        }

        @Override // kotlin.collections.k0
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f21244c;
            int i10 = this.f21243b;
            this.f21243b = i10 + 1;
            return sparseIntArray.keyAt(i10);
        }
    }

    /* JADX INFO: compiled from: SparseIntArray.kt */
    public static final class b extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f21246c;

        b(SparseIntArray sparseIntArray) {
            this.f21246c = sparseIntArray;
        }

        public final int a() {
            return this.f21245b;
        }

        public final void b(int i10) {
            this.f21245b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21245b < this.f21246c.size();
        }

        @Override // kotlin.collections.k0
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f21246c;
            int i10 = this.f21245b;
            this.f21245b = i10 + 1;
            return sparseIntArray.valueAt(i10);
        }
    }

    public static final boolean a(@dl.d SparseIntArray sparseIntArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@dl.d SparseIntArray sparseIntArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@dl.d SparseIntArray sparseIntArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i10) >= 0;
    }

    public static final void d(@dl.d SparseIntArray sparseIntArray, @dl.d yh.p<? super Integer, ? super Integer, b2> action) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = sparseIntArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(sparseIntArray.keyAt(i10)), Integer.valueOf(sparseIntArray.valueAt(i10)));
        }
    }

    public static final int e(@dl.d SparseIntArray sparseIntArray, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.get(i10, i11);
    }

    public static final int f(@dl.d SparseIntArray sparseIntArray, int i10, @dl.d yh.a<Integer> defaultValue) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : defaultValue.invoke().intValue();
    }

    public static final int g(@dl.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean h(@dl.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@dl.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    @dl.d
    public static final k0 j(@dl.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return new a(sparseIntArray);
    }

    @dl.d
    public static final SparseIntArray k(@dl.d SparseIntArray sparseIntArray, @dl.d SparseIntArray other) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        SparseIntArray sparseIntArray2 = new SparseIntArray(sparseIntArray.size() + other.size());
        l(sparseIntArray2, sparseIntArray);
        l(sparseIntArray2, other);
        return sparseIntArray2;
    }

    public static final void l(@dl.d SparseIntArray sparseIntArray, @dl.d SparseIntArray other) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public static final boolean m(@dl.d SparseIntArray sparseIntArray, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || i11 != sparseIntArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void n(@dl.d SparseIntArray sparseIntArray, int i10, int i11) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        sparseIntArray.put(i10, i11);
    }

    @dl.d
    public static final k0 o(@dl.d SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.f0.p(sparseIntArray, "<this>");
        return new b(sparseIntArray);
    }
}
