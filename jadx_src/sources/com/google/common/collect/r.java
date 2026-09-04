package com.google.common.collect;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f58165a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f58166b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f58167c = new b(1);

    /* JADX INFO: compiled from: ComparisonChain.java */
    public class a extends r {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.r
        public r d(double d10, double d11) {
            return o(Double.compare(d10, d11));
        }

        @Override // com.google.common.collect.r
        public r e(float f10, float f11) {
            return o(Float.compare(f10, f11));
        }

        @Override // com.google.common.collect.r
        public r f(int i10, int i11) {
            return o(Ints.e(i10, i11));
        }

        @Override // com.google.common.collect.r
        public r g(long j10, long j11) {
            return o(Longs.d(j10, j11));
        }

        @Override // com.google.common.collect.r
        public r i(Comparable<?> comparable, Comparable<?> comparable2) {
            return o(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.r
        public <T> r j(@x1 T t10, @x1 T t11, Comparator<T> comparator) {
            return o(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.r
        public r k(boolean z10, boolean z11) {
            return o(Booleans.d(z10, z11));
        }

        @Override // com.google.common.collect.r
        public r l(boolean z10, boolean z11) {
            return o(Booleans.d(z11, z10));
        }

        @Override // com.google.common.collect.r
        public int m() {
            return 0;
        }

        r o(int i10) {
            if (i10 < 0) {
                return r.f58166b;
            }
            return i10 > 0 ? r.f58167c : r.f58165a;
        }
    }

    /* JADX INFO: compiled from: ComparisonChain.java */
    public static final class b extends r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f58168d;

        b(int i10) {
            super(null);
            this.f58168d = i10;
        }

        @Override // com.google.common.collect.r
        public r d(double d10, double d11) {
            return this;
        }

        @Override // com.google.common.collect.r
        public r e(float f10, float f11) {
            return this;
        }

        @Override // com.google.common.collect.r
        public r f(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.r
        public r g(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.r
        public r i(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.r
        public <T> r j(@x1 T t10, @x1 T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.r
        public r k(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.r
        public r l(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.r
        public int m() {
            return this.f58168d;
        }
    }

    private r() {
    }

    /* synthetic */ r(a aVar) {
        this();
    }

    public static r n() {
        return f58165a;
    }

    public abstract r d(double d10, double d11);

    public abstract r e(float f10, float f11);

    public abstract r f(int i10, int i11);

    public abstract r g(long j10, long j11);

    @Deprecated
    public final r h(Boolean bool, Boolean bool2) {
        return k(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract r i(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> r j(@x1 T t10, @x1 T t11, Comparator<T> comparator);

    public abstract r k(boolean z10, boolean z11);

    public abstract r l(boolean z10, boolean z11);

    public abstract int m();
}
