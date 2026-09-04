package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.w0;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Range.kt */
    public static final class a<T> implements fi.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Range<T> f21300b;

        a(Range<T> range) {
            this.f21300b = range;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // fi.g
        public Comparable D() {
            return this.f21300b.getLower();
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // fi.g
        public boolean a(@dl.d Comparable comparable) {
            return fi.g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // fi.g
        public Comparable e() {
            return this.f21300b.getUpper();
        }

        @Override // fi.g
        public boolean isEmpty() {
            return fi.g.a.b(this);
        }
    }

    @dl.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> a(@dl.d Range<T> range, @dl.d Range<T> other) {
        kotlin.jvm.internal.f0.p(range, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Range<T> rangeIntersect = range.intersect(other);
        kotlin.jvm.internal.f0.o(rangeIntersect, "intersect(other)");
        return rangeIntersect;
    }

    @dl.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> b(@dl.d Range<T> range, @dl.d Range<T> other) {
        kotlin.jvm.internal.f0.p(range, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        Range<T> rangeExtend = range.extend(other);
        kotlin.jvm.internal.f0.o(rangeExtend, "extend(other)");
        return rangeExtend;
    }

    @dl.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> c(@dl.d Range<T> range, @dl.d T value) {
        kotlin.jvm.internal.f0.p(range, "<this>");
        kotlin.jvm.internal.f0.p(value, "value");
        Range<T> rangeExtend = range.extend(value);
        kotlin.jvm.internal.f0.o(rangeExtend, "extend(value)");
        return rangeExtend;
    }

    @dl.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> d(@dl.d T t10, @dl.d T that) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(that, "that");
        return new Range<>(t10, that);
    }

    @dl.d
    @w0(21)
    public static final <T extends Comparable<? super T>> fi.g<T> e(@dl.d Range<T> range) {
        kotlin.jvm.internal.f0.p(range, "<this>");
        return new a(range);
    }

    @dl.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> f(@dl.d fi.g<T> gVar) {
        kotlin.jvm.internal.f0.p(gVar, "<this>");
        return new Range<>(gVar.D(), gVar.e());
    }
}
