package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.b2;
import kotlin.collections.k0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SparseBooleanArray.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
public final class c0 {

    /* JADX INFO: compiled from: SparseBooleanArray.kt */
    public static final class a extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f21240c;

        a(SparseBooleanArray sparseBooleanArray) {
            this.f21240c = sparseBooleanArray;
        }

        public final int a() {
            return this.f21239b;
        }

        public final void b(int i10) {
            this.f21239b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21239b < this.f21240c.size();
        }

        @Override // kotlin.collections.k0
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f21240c;
            int i10 = this.f21239b;
            this.f21239b = i10 + 1;
            return sparseBooleanArray.keyAt(i10);
        }
    }

    /* JADX INFO: compiled from: SparseBooleanArray.kt */
    public static final class b extends kotlin.collections.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f21242c;

        b(SparseBooleanArray sparseBooleanArray) {
            this.f21242c = sparseBooleanArray;
        }

        @Override // kotlin.collections.o
        public boolean b() {
            SparseBooleanArray sparseBooleanArray = this.f21242c;
            int i10 = this.f21241b;
            this.f21241b = i10 + 1;
            return sparseBooleanArray.valueAt(i10);
        }

        public final int c() {
            return this.f21241b;
        }

        public final void d(int i10) {
            this.f21241b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21241b < this.f21242c.size();
        }
    }

    public static final boolean a(@dl.d SparseBooleanArray sparseBooleanArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@dl.d SparseBooleanArray sparseBooleanArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@dl.d SparseBooleanArray sparseBooleanArray, boolean z10) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z10) >= 0;
    }

    public static final void d(@dl.d SparseBooleanArray sparseBooleanArray, @dl.d yh.p<? super Integer, ? super Boolean, b2> action) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i10)), Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
        }
    }

    public static final boolean e(@dl.d SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i10, z10);
    }

    public static final boolean f(@dl.d SparseBooleanArray sparseBooleanArray, int i10, @dl.d yh.a<Boolean> defaultValue) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : defaultValue.invoke().booleanValue();
    }

    public static final int g(@dl.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean h(@dl.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@dl.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    @dl.d
    public static final k0 j(@dl.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return new a(sparseBooleanArray);
    }

    @dl.d
    public static final SparseBooleanArray k(@dl.d SparseBooleanArray sparseBooleanArray, @dl.d SparseBooleanArray other) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(sparseBooleanArray.size() + other.size());
        l(sparseBooleanArray2, sparseBooleanArray);
        l(sparseBooleanArray2, other);
        return sparseBooleanArray2;
    }

    public static final void l(@dl.d SparseBooleanArray sparseBooleanArray, @dl.d SparseBooleanArray other) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseBooleanArray.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public static final boolean m(@dl.d SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || z10 != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i10);
        return true;
    }

    public static final void n(@dl.d SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i10, z10);
    }

    @dl.d
    public static final kotlin.collections.o o(@dl.d SparseBooleanArray sparseBooleanArray) {
        kotlin.jvm.internal.f0.p(sparseBooleanArray, "<this>");
        return new b(sparseBooleanArray);
    }
}
