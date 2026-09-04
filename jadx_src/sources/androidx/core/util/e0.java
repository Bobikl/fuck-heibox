package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import androidx.annotation.w0;
import kotlin.b2;
import kotlin.collections.k0;
import kotlin.collections.l0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SparseLongArray.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n103#1,4:127\n1#2:126\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n97#1:127,4\n*E\n"})
public final class e0 {

    /* JADX INFO: compiled from: SparseLongArray.kt */
    public static final class a extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f21248c;

        a(SparseLongArray sparseLongArray) {
            this.f21248c = sparseLongArray;
        }

        public final int a() {
            return this.f21247b;
        }

        public final void b(int i10) {
            this.f21247b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21247b < this.f21248c.size();
        }

        @Override // kotlin.collections.k0
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f21248c;
            int i10 = this.f21247b;
            this.f21247b = i10 + 1;
            return sparseLongArray.keyAt(i10);
        }
    }

    /* JADX INFO: compiled from: SparseLongArray.kt */
    public static final class b extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f21250c;

        b(SparseLongArray sparseLongArray) {
            this.f21250c = sparseLongArray;
        }

        public final int a() {
            return this.f21249b;
        }

        public final void b(int i10) {
            this.f21249b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21249b < this.f21250c.size();
        }

        @Override // kotlin.collections.l0
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f21250c;
            int i10 = this.f21249b;
            this.f21249b = i10 + 1;
            return sparseLongArray.valueAt(i10);
        }
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean a(@dl.d SparseLongArray sparseLongArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean b(@dl.d SparseLongArray sparseLongArray, int i10) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean c(@dl.d SparseLongArray sparseLongArray, long j10) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j10) >= 0;
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void d(@dl.d SparseLongArray sparseLongArray, @dl.d yh.p<? super Integer, ? super Long, b2> action) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = sparseLongArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
        }
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long e(@dl.d SparseLongArray sparseLongArray, int i10, long j10) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.get(i10, j10);
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long f(@dl.d SparseLongArray sparseLongArray, int i10, @dl.d yh.a<Long> defaultValue) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : defaultValue.invoke().longValue();
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int g(@dl.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean h(@dl.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean i(@dl.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @dl.d
    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final k0 j(@dl.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return new a(sparseLongArray);
    }

    @dl.d
    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final SparseLongArray k(@dl.d SparseLongArray sparseLongArray, @dl.d SparseLongArray other) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        SparseLongArray sparseLongArray2 = new SparseLongArray(sparseLongArray.size() + other.size());
        l(sparseLongArray2, sparseLongArray);
        l(sparseLongArray2, other);
        return sparseLongArray2;
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void l(@dl.d SparseLongArray sparseLongArray, @dl.d SparseLongArray other) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseLongArray.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean m(@dl.d SparseLongArray sparseLongArray, int i10, long j10) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || j10 != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void n(@dl.d SparseLongArray sparseLongArray, int i10, long j10) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        sparseLongArray.put(i10, j10);
    }

    @dl.d
    @w0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final l0 o(@dl.d SparseLongArray sparseLongArray) {
        kotlin.jvm.internal.f0.p(sparseLongArray, "<this>");
        return new b(sparseLongArray);
    }
}
