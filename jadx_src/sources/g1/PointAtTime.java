package g1;

import androidx.collection.k;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: g1.b, reason: from toString */
/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lg1/b;", "", "Lb1/f;", ak.av, "()J", "", "b", "point", "time", ak.aF, "(JJ)Lg1/b;", "", "toString", "", "hashCode", "other", "", "equals", "J", "e", "f", "<init>", "(JJLkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PointAtTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    private final long point;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private final long time;

    private PointAtTime(long j10, long j11) {
        this.point = j10;
        this.time = j11;
    }

    public /* synthetic */ PointAtTime(long j10, long j11, u uVar) {
        this(j10, j11);
    }

    public static /* synthetic */ PointAtTime d(PointAtTime pointAtTime, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pointAtTime.point;
        }
        if ((i10 & 2) != 0) {
            j11 = pointAtTime.time;
        }
        return pointAtTime.c(j10, j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getPoint() {
        return this.point;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @dl.d
    public final PointAtTime c(long point, long time) {
        return new PointAtTime(point, time, null);
    }

    public final long e() {
        return this.point;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointAtTime)) {
            return false;
        }
        PointAtTime pointAtTime = (PointAtTime) other;
        return b1.f.l(this.point, pointAtTime.point) && this.time == pointAtTime.time;
    }

    public final long f() {
        return this.time;
    }

    public int hashCode() {
        return (b1.f.s(this.point) * 31) + k.a(this.time);
    }

    @dl.d
    public String toString() {
        return "PointAtTime(point=" + ((Object) b1.f.y(this.point)) + ", time=" + this.time + ')';
    }
}
