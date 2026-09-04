package androidx.compose.foundation.lazy;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListBeyondBoundsInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/i;", "", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/foundation/lazy/i$a;", ak.av, ak.aT, "Lkotlin/b2;", "e", "", "d", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/runtime/collection/e;", "beyondBoundsItems", ak.aF, "()I", "b", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<Interval> beyondBoundsItems = new androidx.compose.runtime.collection.e<>(new Interval[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.i$a, reason: from toString */
    /* JADX INFO: compiled from: LazyListBeyondBoundsInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/i$a;", "", "", ak.av, "b", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, ak.aF, "", "toString", "hashCode", "other", "", "equals", "I", "f", "()I", "e", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Interval {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        public Interval(int i10, int i11) {
            this.start = i10;
            this.end = i11;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i11 >= i10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public static /* synthetic */ Interval d(Interval interval, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = interval.start;
            }
            if ((i12 & 2) != 0) {
                i11 = interval.end;
            }
            return interval.c(i10, i11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @dl.d
        public final Interval c(int start, int end) {
            return new Interval(start, end);
        }

        public final int e() {
            return this.end;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int f() {
            return this.start;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        @dl.d
        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    @dl.d
    public final Interval a(int start, int end) {
        Interval interval = new Interval(start, end);
        this.beyondBoundsItems.b(interval);
        return interval;
    }

    public final int b() {
        int iE = this.beyondBoundsItems.t().e();
        androidx.compose.runtime.collection.e<Interval> eVar = this.beyondBoundsItems;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            Interval[] intervalArrG = eVar.G();
            f0.n(intervalArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                Interval interval = intervalArrG[i11];
                if (interval.e() > iE) {
                    iE = interval.e();
                }
                i11++;
            } while (i11 < i10);
        }
        return iE;
    }

    public final int c() {
        int iF = this.beyondBoundsItems.t().f();
        androidx.compose.runtime.collection.e<Interval> eVar = this.beyondBoundsItems;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            Interval[] intervalArrG = eVar.G();
            f0.n(intervalArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                Interval interval = intervalArrG[i11];
                if (interval.f() < iF) {
                    iF = interval.f();
                }
                i11++;
            } while (i11 < i10);
        }
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean d() {
        return this.beyondBoundsItems.Q();
    }

    public final void e(@dl.d Interval interval) {
        f0.p(interval, "interval");
        this.beyondBoundsItems.c0(interval);
    }
}
