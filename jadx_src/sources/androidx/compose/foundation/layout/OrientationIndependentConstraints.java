package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.l0, reason: from toString */
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b \u0010!B\u001c\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0002¢\u0006\u0004\b \u0010\"J\u0006\u0010\u0002\u001a\u00020\u0000J\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/l0;", "", "m", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Ls1/b;", "n", "(Landroidx/compose/foundation/layout/LayoutOrientation;)J", "", "l", "k", ak.av, "b", ak.aF, "d", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "e", "", "toString", "hashCode", "other", "", "equals", "I", "j", "()I", "i", RXScreenCaptureService.KEY_HEIGHT, "g", "<init>", "(IIII)V", "(JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class OrientationIndependentConstraints {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mainAxisMin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mainAxisMax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int crossAxisMin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int crossAxisMax;

    public OrientationIndependentConstraints(int i10, int i11, int i12, int i13) {
        this.mainAxisMin = i10;
        this.mainAxisMax = i11;
        this.crossAxisMin = i12;
        this.crossAxisMax = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private OrientationIndependentConstraints(long j10, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        this(layoutOrientation == layoutOrientation2 ? s1.b.r(j10) : s1.b.q(j10), layoutOrientation == layoutOrientation2 ? s1.b.p(j10) : s1.b.o(j10), layoutOrientation == layoutOrientation2 ? s1.b.q(j10) : s1.b.r(j10), layoutOrientation == layoutOrientation2 ? s1.b.o(j10) : s1.b.p(j10));
    }

    public /* synthetic */ OrientationIndependentConstraints(long j10, LayoutOrientation layoutOrientation, kotlin.jvm.internal.u uVar) {
        this(j10, layoutOrientation);
    }

    public static /* synthetic */ OrientationIndependentConstraints f(OrientationIndependentConstraints orientationIndependentConstraints, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = orientationIndependentConstraints.mainAxisMin;
        }
        if ((i14 & 2) != 0) {
            i11 = orientationIndependentConstraints.mainAxisMax;
        }
        if ((i14 & 4) != 0) {
            i12 = orientationIndependentConstraints.crossAxisMin;
        }
        if ((i14 & 8) != 0) {
            i13 = orientationIndependentConstraints.crossAxisMax;
        }
        return orientationIndependentConstraints.e(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCrossAxisMax() {
        return this.crossAxisMax;
    }

    @dl.d
    public final OrientationIndependentConstraints e(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        return new OrientationIndependentConstraints(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) other;
        return this.mainAxisMin == orientationIndependentConstraints.mainAxisMin && this.mainAxisMax == orientationIndependentConstraints.mainAxisMax && this.crossAxisMin == orientationIndependentConstraints.crossAxisMin && this.crossAxisMax == orientationIndependentConstraints.crossAxisMax;
    }

    public final int g() {
        return this.crossAxisMax;
    }

    public final int h() {
        return this.crossAxisMin;
    }

    public int hashCode() {
        return (((((this.mainAxisMin * 31) + this.mainAxisMax) * 31) + this.crossAxisMin) * 31) + this.crossAxisMax;
    }

    public final int i() {
        return this.mainAxisMax;
    }

    public final int j() {
        return this.mainAxisMin;
    }

    public final int k(@dl.d LayoutOrientation orientation) {
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? this.crossAxisMax : this.mainAxisMax;
    }

    public final int l(@dl.d LayoutOrientation orientation) {
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? this.mainAxisMax : this.crossAxisMax;
    }

    @dl.d
    public final OrientationIndependentConstraints m() {
        int i10 = this.mainAxisMin;
        int i11 = this.mainAxisMax;
        int i12 = this.crossAxisMax;
        return new OrientationIndependentConstraints(i10, i11, i12 != Integer.MAX_VALUE ? i12 : this.crossAxisMin, i12);
    }

    public final long n(@dl.d LayoutOrientation orientation) {
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        return orientation == LayoutOrientation.Horizontal ? s1.c.a(this.mainAxisMin, this.mainAxisMax, this.crossAxisMin, this.crossAxisMax) : s1.c.a(this.crossAxisMin, this.crossAxisMax, this.mainAxisMin, this.mainAxisMax);
    }

    @dl.d
    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.mainAxisMin + ", mainAxisMax=" + this.mainAxisMax + ", crossAxisMin=" + this.crossAxisMin + ", crossAxisMax=" + this.crossAxisMax + ')';
    }
}
