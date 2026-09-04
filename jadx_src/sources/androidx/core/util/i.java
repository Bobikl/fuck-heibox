package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import androidx.annotation.w0;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.l0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,132:1\n104#1,4:133\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n98#1:133,4\n*E\n"})
public final class i {

    /* JADX INFO: compiled from: LongSparseArray.kt */
    public static final class a extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f21260c;

        a(LongSparseArray<T> longSparseArray) {
            this.f21260c = longSparseArray;
        }

        public final int a() {
            return this.f21259b;
        }

        public final void b(int i10) {
            this.f21259b = i10;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f21259b < this.f21260c.size();
        }

        @Override // kotlin.collections.l0
        @SuppressLint({"ClassVerificationFailure"})
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f21260c;
            int i10 = this.f21259b;
            this.f21259b = i10 + 1;
            return longSparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    public static final class b<T> implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f21262c;

        b(LongSparseArray<T> longSparseArray) {
            this.f21262c = longSparseArray;
        }

        public final int a() {
            return this.f21261b;
        }

        public final void b(int i10) {
            this.f21261b = i10;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f21261b < this.f21262c.size();
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public T next() {
            LongSparseArray<T> longSparseArray = this.f21262c;
            int i10 = this.f21261b;
            this.f21261b = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean a(@dl.d LongSparseArray<T> longSparseArray, long j10) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean b(@dl.d LongSparseArray<T> longSparseArray, long j10) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean c(@dl.d LongSparseArray<T> longSparseArray, T t10) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t10) >= 0;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void d(@dl.d LongSparseArray<T> longSparseArray, @dl.d yh.p<? super Long, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T e(@dl.d LongSparseArray<T> longSparseArray, long j10, T t10) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        T t11 = longSparseArray.get(j10);
        return t11 == null ? t10 : t11;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T f(@dl.d LongSparseArray<T> longSparseArray, long j10, @dl.d yh.a<? extends T> defaultValue) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        T t10 = longSparseArray.get(j10);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> int g(@dl.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean h(@dl.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean i(@dl.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @dl.d
    @w0(16)
    public static final <T> l0 j(@dl.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return new a(longSparseArray);
    }

    @dl.d
    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> LongSparseArray<T> k(@dl.d LongSparseArray<T> longSparseArray, @dl.d LongSparseArray<T> other) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        l(longSparseArray2, longSparseArray);
        l(longSparseArray2, other);
        return longSparseArray2;
    }

    @w0(16)
    public static final <T> void l(@dl.d LongSparseArray<T> longSparseArray, @dl.d LongSparseArray<T> other) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean m(@dl.d LongSparseArray<T> longSparseArray, long j10, T t10) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.f0.g(t10, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    @w0(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void n(@dl.d LongSparseArray<T> longSparseArray, long j10, T t10) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        longSparseArray.put(j10, t10);
    }

    @dl.d
    @w0(16)
    public static final <T> Iterator<T> o(@dl.d LongSparseArray<T> longSparseArray) {
        kotlin.jvm.internal.f0.p(longSparseArray, "<this>");
        return new b(longSparseArray);
    }
}
