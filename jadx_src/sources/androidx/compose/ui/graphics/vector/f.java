package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0003\u0007\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/vector/f;", "", "", ak.av, "Z", "()Z", "isCurve", "b", "isQuad", "<init>", "(ZZ)V", ak.aF, "d", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ak.aB, "Landroidx/compose/ui/graphics/vector/f$a;", "Landroidx/compose/ui/graphics/vector/f$b;", "Landroidx/compose/ui/graphics/vector/f$c;", "Landroidx/compose/ui/graphics/vector/f$d;", "Landroidx/compose/ui/graphics/vector/f$e;", "Landroidx/compose/ui/graphics/vector/f$f;", "Landroidx/compose/ui/graphics/vector/f$g;", "Landroidx/compose/ui/graphics/vector/f$h;", "Landroidx/compose/ui/graphics/vector/f$i;", "Landroidx/compose/ui/graphics/vector/f$j;", "Landroidx/compose/ui/graphics/vector/f$k;", "Landroidx/compose/ui/graphics/vector/f$l;", "Landroidx/compose/ui/graphics/vector/f$m;", "Landroidx/compose/ui/graphics/vector/f$n;", "Landroidx/compose/ui/graphics/vector/f$o;", "Landroidx/compose/ui/graphics/vector/f$p;", "Landroidx/compose/ui/graphics/vector/f$q;", "Landroidx/compose/ui/graphics/vector/f$r;", "Landroidx/compose/ui/graphics/vector/f$s;", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCurve;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isQuad;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$a, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$a;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "j", "", "toString", "", "hashCode", "", "other", "equals", "F", "n", "()F", "p", "o", "Z", "q", "()Z", "r", "l", "m", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ArcTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float horizontalEllipseRadius;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float verticalEllipseRadius;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float theta;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMoreThanHalf;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPositiveArc;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final float arcStartX;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final float arcStartY;

        /* JADX WARN: Illegal instructions before constructor call */
        public ArcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.horizontalEllipseRadius = f10;
            this.verticalEllipseRadius = f11;
            this.theta = f12;
            this.isMoreThanHalf = z10;
            this.isPositiveArc = z11;
            this.arcStartX = f13;
            this.arcStartY = f14;
        }

        public static /* synthetic */ ArcTo k(ArcTo arcTo, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = arcTo.horizontalEllipseRadius;
            }
            if ((i10 & 2) != 0) {
                f11 = arcTo.verticalEllipseRadius;
            }
            float f15 = f11;
            if ((i10 & 4) != 0) {
                f12 = arcTo.theta;
            }
            float f16 = f12;
            if ((i10 & 8) != 0) {
                z10 = arcTo.isMoreThanHalf;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = arcTo.isPositiveArc;
            }
            boolean z13 = z11;
            if ((i10 & 32) != 0) {
                f13 = arcTo.arcStartX;
            }
            float f17 = f13;
            if ((i10 & 64) != 0) {
                f14 = arcTo.arcStartY;
            }
            return arcTo.j(f10, f15, f16, z12, z13, f17, f14);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) other;
            return f0.g(Float.valueOf(this.horizontalEllipseRadius), Float.valueOf(arcTo.horizontalEllipseRadius)) && f0.g(Float.valueOf(this.verticalEllipseRadius), Float.valueOf(arcTo.verticalEllipseRadius)) && f0.g(Float.valueOf(this.theta), Float.valueOf(arcTo.theta)) && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && f0.g(Float.valueOf(this.arcStartX), Float.valueOf(arcTo.arcStartX)) && f0.g(Float.valueOf(this.arcStartY), Float.valueOf(arcTo.arcStartY));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getArcStartX() {
            return this.arcStartX;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iFloatToIntBits = ((((Float.floatToIntBits(this.horizontalEllipseRadius) * 31) + Float.floatToIntBits(this.verticalEllipseRadius)) * 31) + Float.floatToIntBits(this.theta)) * 31;
            boolean z10 = this.isMoreThanHalf;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iFloatToIntBits + r10) * 31;
            boolean z11 = this.isPositiveArc;
            return ((((i10 + (z11 ? 1 : z11)) * 31) + Float.floatToIntBits(this.arcStartX)) * 31) + Float.floatToIntBits(this.arcStartY);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getArcStartY() {
            return this.arcStartY;
        }

        @dl.d
        public final ArcTo j(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartX, float arcStartY) {
            return new ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartX, arcStartY);
        }

        public final float l() {
            return this.arcStartX;
        }

        public final float m() {
            return this.arcStartY;
        }

        public final float n() {
            return this.horizontalEllipseRadius;
        }

        public final float o() {
            return this.theta;
        }

        public final float p() {
            return this.verticalEllipseRadius;
        }

        public final boolean q() {
            return this.isMoreThanHalf;
        }

        public final boolean r() {
            return this.isPositiveArc;
        }

        @dl.d
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$b;", "Landroidx/compose/ui/graphics/vector/f;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final b f14235c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$c, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/vector/f$c;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "x1", "y1", "x2", "y2", "x3", "y3", "i", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "k", "()F", "n", "l", "o", "m", "p", "<init>", "(FFFFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CurveTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y2;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x3;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y3;

        public CurveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.x1 = f10;
            this.y1 = f11;
            this.x2 = f12;
            this.y2 = f13;
            this.x3 = f14;
            this.y3 = f15;
        }

        public static /* synthetic */ CurveTo j(CurveTo curveTo, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = curveTo.x1;
            }
            if ((i10 & 2) != 0) {
                f11 = curveTo.y1;
            }
            float f16 = f11;
            if ((i10 & 4) != 0) {
                f12 = curveTo.x2;
            }
            float f17 = f12;
            if ((i10 & 8) != 0) {
                f13 = curveTo.y2;
            }
            float f18 = f13;
            if ((i10 & 16) != 0) {
                f14 = curveTo.x3;
            }
            float f19 = f14;
            if ((i10 & 32) != 0) {
                f15 = curveTo.y3;
            }
            return curveTo.i(f10, f16, f17, f18, f19, f15);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) other;
            return f0.g(Float.valueOf(this.x1), Float.valueOf(curveTo.x1)) && f0.g(Float.valueOf(this.y1), Float.valueOf(curveTo.y1)) && f0.g(Float.valueOf(this.x2), Float.valueOf(curveTo.x2)) && f0.g(Float.valueOf(this.y2), Float.valueOf(curveTo.y2)) && f0.g(Float.valueOf(this.x3), Float.valueOf(curveTo.x3)) && f0.g(Float.valueOf(this.y3), Float.valueOf(curveTo.y3));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getX3() {
            return this.x3;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getY3() {
            return this.y3;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.x1) * 31) + Float.floatToIntBits(this.y1)) * 31) + Float.floatToIntBits(this.x2)) * 31) + Float.floatToIntBits(this.y2)) * 31) + Float.floatToIntBits(this.x3)) * 31) + Float.floatToIntBits(this.y3);
        }

        @dl.d
        public final CurveTo i(float x10, float y10, float x11, float y11, float x12, float y12) {
            return new CurveTo(x10, y10, x11, y11, x12, y12);
        }

        public final float k() {
            return this.x1;
        }

        public final float l() {
            return this.x2;
        }

        public final float m() {
            return this.x3;
        }

        public final float n() {
            return this.y1;
        }

        public final float o() {
            return this.y2;
        }

        public final float p() {
            return this.y3;
        }

        @dl.d
        public String toString() {
            return "CurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", x3=" + this.x3 + ", y3=" + this.y3 + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$d, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$d;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "x", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "f", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class HorizontalTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        public HorizontalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.x = f10;
        }

        public static /* synthetic */ HorizontalTo e(HorizontalTo horizontalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = horizontalTo.x;
            }
            return horizontalTo.d(f10);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        @dl.d
        public final HorizontalTo d(float x10) {
            return new HorizontalTo(x10);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalTo) && f0.g(Float.valueOf(this.x), Float.valueOf(((HorizontalTo) other).x));
        }

        public final float f() {
            return this.x;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.x);
        }

        @dl.d
        public String toString() {
            return "HorizontalTo(x=" + this.x + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$e, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$e;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "x", "y", "e", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "g", "()F", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class LineTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public LineTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.x = f10;
            this.y = f11;
        }

        public static /* synthetic */ LineTo f(LineTo lineTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = lineTo.x;
            }
            if ((i10 & 2) != 0) {
                f11 = lineTo.y;
            }
            return lineTo.e(f10, f11);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @dl.d
        public final LineTo e(float x10, float y10) {
            return new LineTo(x10, y10);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) other;
            return f0.g(Float.valueOf(this.x), Float.valueOf(lineTo.x)) && f0.g(Float.valueOf(this.y), Float.valueOf(lineTo.y));
        }

        public final float g() {
            return this.x;
        }

        public final float h() {
            return this.y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
        }

        @dl.d
        public String toString() {
            return "LineTo(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$f, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$f;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "x", "y", "e", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "g", "()F", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class MoveTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public MoveTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.x = f10;
            this.y = f11;
        }

        public static /* synthetic */ MoveTo f(MoveTo moveTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = moveTo.x;
            }
            if ((i10 & 2) != 0) {
                f11 = moveTo.y;
            }
            return moveTo.e(f10, f11);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @dl.d
        public final MoveTo e(float x10, float y10) {
            return new MoveTo(x10, y10);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) other;
            return f0.g(Float.valueOf(this.x), Float.valueOf(moveTo.x)) && f0.g(Float.valueOf(this.y), Float.valueOf(moveTo.y));
        }

        public final float g() {
            return this.x;
        }

        public final float h() {
            return this.y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
        }

        @dl.d
        public String toString() {
            return "MoveTo(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$g, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$g;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "f", "x1", "y1", "x2", "y2", "g", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "i", "()F", "k", "j", "l", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class QuadTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y2;

        public QuadTo(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x1 = f10;
            this.y1 = f11;
            this.x2 = f12;
            this.y2 = f13;
        }

        public static /* synthetic */ QuadTo h(QuadTo quadTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = quadTo.x1;
            }
            if ((i10 & 2) != 0) {
                f11 = quadTo.y1;
            }
            if ((i10 & 4) != 0) {
                f12 = quadTo.x2;
            }
            if ((i10 & 8) != 0) {
                f13 = quadTo.y2;
            }
            return quadTo.g(f10, f11, f12, f13);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) other;
            return f0.g(Float.valueOf(this.x1), Float.valueOf(quadTo.x1)) && f0.g(Float.valueOf(this.y1), Float.valueOf(quadTo.y1)) && f0.g(Float.valueOf(this.x2), Float.valueOf(quadTo.x2)) && f0.g(Float.valueOf(this.y2), Float.valueOf(quadTo.y2));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        @dl.d
        public final QuadTo g(float x10, float y10, float x11, float y11) {
            return new QuadTo(x10, y10, x11, y11);
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.x1) * 31) + Float.floatToIntBits(this.y1)) * 31) + Float.floatToIntBits(this.x2)) * 31) + Float.floatToIntBits(this.y2);
        }

        public final float i() {
            return this.x1;
        }

        public final float j() {
            return this.x2;
        }

        public final float k() {
            return this.y1;
        }

        public final float l() {
            return this.y2;
        }

        @dl.d
        public String toString() {
            return "QuadTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$h, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$h;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "f", "x1", "y1", "x2", "y2", "g", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "i", "()F", "k", "j", "l", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ReflectiveCurveTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y2;

        public ReflectiveCurveTo(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.x1 = f10;
            this.y1 = f11;
            this.x2 = f12;
            this.y2 = f13;
        }

        public static /* synthetic */ ReflectiveCurveTo h(ReflectiveCurveTo reflectiveCurveTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = reflectiveCurveTo.x1;
            }
            if ((i10 & 2) != 0) {
                f11 = reflectiveCurveTo.y1;
            }
            if ((i10 & 4) != 0) {
                f12 = reflectiveCurveTo.x2;
            }
            if ((i10 & 8) != 0) {
                f13 = reflectiveCurveTo.y2;
            }
            return reflectiveCurveTo.g(f10, f11, f12, f13);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) other;
            return f0.g(Float.valueOf(this.x1), Float.valueOf(reflectiveCurveTo.x1)) && f0.g(Float.valueOf(this.y1), Float.valueOf(reflectiveCurveTo.y1)) && f0.g(Float.valueOf(this.x2), Float.valueOf(reflectiveCurveTo.x2)) && f0.g(Float.valueOf(this.y2), Float.valueOf(reflectiveCurveTo.y2));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        @dl.d
        public final ReflectiveCurveTo g(float x10, float y10, float x11, float y11) {
            return new ReflectiveCurveTo(x10, y10, x11, y11);
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.x1) * 31) + Float.floatToIntBits(this.y1)) * 31) + Float.floatToIntBits(this.x2)) * 31) + Float.floatToIntBits(this.y2);
        }

        public final float i() {
            return this.x1;
        }

        public final float j() {
            return this.x2;
        }

        public final float k() {
            return this.y1;
        }

        public final float l() {
            return this.y2;
        }

        @dl.d
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$i, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$i;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "x", "y", "e", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "g", "()F", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ReflectiveQuadTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float x;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y;

        public ReflectiveQuadTo(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x = f10;
            this.y = f11;
        }

        public static /* synthetic */ ReflectiveQuadTo f(ReflectiveQuadTo reflectiveQuadTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = reflectiveQuadTo.x;
            }
            if ((i10 & 2) != 0) {
                f11 = reflectiveQuadTo.y;
            }
            return reflectiveQuadTo.e(f10, f11);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @dl.d
        public final ReflectiveQuadTo e(float x10, float y10) {
            return new ReflectiveQuadTo(x10, y10);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) other;
            return f0.g(Float.valueOf(this.x), Float.valueOf(reflectiveQuadTo.x)) && f0.g(Float.valueOf(this.y), Float.valueOf(reflectiveQuadTo.y));
        }

        public final float g() {
            return this.x;
        }

        public final float h() {
            return this.y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
        }

        @dl.d
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$j, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$j;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "j", "", "toString", "", "hashCode", "", "other", "equals", "F", "n", "()F", "p", "o", "Z", "q", "()Z", "r", "l", "m", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeArcTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float horizontalEllipseRadius;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float verticalEllipseRadius;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float theta;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMoreThanHalf;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPositiveArc;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final float arcStartDx;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final float arcStartDy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeArcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.horizontalEllipseRadius = f10;
            this.verticalEllipseRadius = f11;
            this.theta = f12;
            this.isMoreThanHalf = z10;
            this.isPositiveArc = z11;
            this.arcStartDx = f13;
            this.arcStartDy = f14;
        }

        public static /* synthetic */ RelativeArcTo k(RelativeArcTo relativeArcTo, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeArcTo.verticalEllipseRadius;
            }
            float f15 = f11;
            if ((i10 & 4) != 0) {
                f12 = relativeArcTo.theta;
            }
            float f16 = f12;
            if ((i10 & 8) != 0) {
                z10 = relativeArcTo.isMoreThanHalf;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = relativeArcTo.isPositiveArc;
            }
            boolean z13 = z11;
            if ((i10 & 32) != 0) {
                f13 = relativeArcTo.arcStartDx;
            }
            float f17 = f13;
            if ((i10 & 64) != 0) {
                f14 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.j(f10, f15, f16, z12, z13, f17, f14);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) other;
            return f0.g(Float.valueOf(this.horizontalEllipseRadius), Float.valueOf(relativeArcTo.horizontalEllipseRadius)) && f0.g(Float.valueOf(this.verticalEllipseRadius), Float.valueOf(relativeArcTo.verticalEllipseRadius)) && f0.g(Float.valueOf(this.theta), Float.valueOf(relativeArcTo.theta)) && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && f0.g(Float.valueOf(this.arcStartDx), Float.valueOf(relativeArcTo.arcStartDx)) && f0.g(Float.valueOf(this.arcStartDy), Float.valueOf(relativeArcTo.arcStartDy));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iFloatToIntBits = ((((Float.floatToIntBits(this.horizontalEllipseRadius) * 31) + Float.floatToIntBits(this.verticalEllipseRadius)) * 31) + Float.floatToIntBits(this.theta)) * 31;
            boolean z10 = this.isMoreThanHalf;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iFloatToIntBits + r10) * 31;
            boolean z11 = this.isPositiveArc;
            return ((((i10 + (z11 ? 1 : z11)) * 31) + Float.floatToIntBits(this.arcStartDx)) * 31) + Float.floatToIntBits(this.arcStartDy);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        @dl.d
        public final RelativeArcTo j(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartDx, float arcStartDy) {
            return new RelativeArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartDx, arcStartDy);
        }

        public final float l() {
            return this.arcStartDx;
        }

        public final float m() {
            return this.arcStartDy;
        }

        public final float n() {
            return this.horizontalEllipseRadius;
        }

        public final float o() {
            return this.theta;
        }

        public final float p() {
            return this.verticalEllipseRadius;
        }

        public final boolean q() {
            return this.isMoreThanHalf;
        }

        public final boolean r() {
            return this.isPositiveArc;
        }

        @dl.d
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$k, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/vector/f$k;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "i", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "k", "()F", "n", "l", "o", "m", "p", "<init>", "(FFFFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeCurveTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy2;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx3;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy3;

        public RelativeCurveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.dx1 = f10;
            this.dy1 = f11;
            this.dx2 = f12;
            this.dy2 = f13;
            this.dx3 = f14;
            this.dy3 = f15;
        }

        public static /* synthetic */ RelativeCurveTo j(RelativeCurveTo relativeCurveTo, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeCurveTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeCurveTo.dy1;
            }
            float f16 = f11;
            if ((i10 & 4) != 0) {
                f12 = relativeCurveTo.dx2;
            }
            float f17 = f12;
            if ((i10 & 8) != 0) {
                f13 = relativeCurveTo.dy2;
            }
            float f18 = f13;
            if ((i10 & 16) != 0) {
                f14 = relativeCurveTo.dx3;
            }
            float f19 = f14;
            if ((i10 & 32) != 0) {
                f15 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.i(f10, f16, f17, f18, f19, f15);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) other;
            return f0.g(Float.valueOf(this.dx1), Float.valueOf(relativeCurveTo.dx1)) && f0.g(Float.valueOf(this.dy1), Float.valueOf(relativeCurveTo.dy1)) && f0.g(Float.valueOf(this.dx2), Float.valueOf(relativeCurveTo.dx2)) && f0.g(Float.valueOf(this.dy2), Float.valueOf(relativeCurveTo.dy2)) && f0.g(Float.valueOf(this.dx3), Float.valueOf(relativeCurveTo.dx3)) && f0.g(Float.valueOf(this.dy3), Float.valueOf(relativeCurveTo.dy3));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getDx3() {
            return this.dx3;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.dx1) * 31) + Float.floatToIntBits(this.dy1)) * 31) + Float.floatToIntBits(this.dx2)) * 31) + Float.floatToIntBits(this.dy2)) * 31) + Float.floatToIntBits(this.dx3)) * 31) + Float.floatToIntBits(this.dy3);
        }

        @dl.d
        public final RelativeCurveTo i(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
            return new RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3);
        }

        public final float k() {
            return this.dx1;
        }

        public final float l() {
            return this.dx2;
        }

        public final float m() {
            return this.dx3;
        }

        public final float n() {
            return this.dy1;
        }

        public final float o() {
            return this.dy2;
        }

        public final float p() {
            return this.dy3;
        }

        @dl.d
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$l, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$l;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "dx", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "f", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeHorizontalTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeHorizontalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dx = f10;
        }

        public static /* synthetic */ RelativeHorizontalTo e(RelativeHorizontalTo relativeHorizontalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.d(f10);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        @dl.d
        public final RelativeHorizontalTo d(float dx) {
            return new RelativeHorizontalTo(dx);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelativeHorizontalTo) && f0.g(Float.valueOf(this.dx), Float.valueOf(((RelativeHorizontalTo) other).dx));
        }

        public final float f() {
            return this.dx;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dx);
        }

        @dl.d
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.dx + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$m, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$m;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "dx", "dy", "e", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "g", "()F", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeLineTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeLineTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dx = f10;
            this.dy = f11;
        }

        public static /* synthetic */ RelativeLineTo f(RelativeLineTo relativeLineTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeLineTo.dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeLineTo.dy;
            }
            return relativeLineTo.e(f10, f11);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @dl.d
        public final RelativeLineTo e(float dx, float dy) {
            return new RelativeLineTo(dx, dy);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) other;
            return f0.g(Float.valueOf(this.dx), Float.valueOf(relativeLineTo.dx)) && f0.g(Float.valueOf(this.dy), Float.valueOf(relativeLineTo.dy));
        }

        public final float g() {
            return this.dx;
        }

        public final float h() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.dx) * 31) + Float.floatToIntBits(this.dy);
        }

        @dl.d
        public String toString() {
            return "RelativeLineTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$n, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$n;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "dx", "dy", "e", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "g", "()F", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeMoveTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeMoveTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dx = f10;
            this.dy = f11;
        }

        public static /* synthetic */ RelativeMoveTo f(RelativeMoveTo relativeMoveTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeMoveTo.dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeMoveTo.dy;
            }
            return relativeMoveTo.e(f10, f11);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @dl.d
        public final RelativeMoveTo e(float dx, float dy) {
            return new RelativeMoveTo(dx, dy);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) other;
            return f0.g(Float.valueOf(this.dx), Float.valueOf(relativeMoveTo.dx)) && f0.g(Float.valueOf(this.dy), Float.valueOf(relativeMoveTo.dy));
        }

        public final float g() {
            return this.dx;
        }

        public final float h() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.dx) * 31) + Float.floatToIntBits(this.dy);
        }

        @dl.d
        public String toString() {
            return "RelativeMoveTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$o, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$o;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "f", "dx1", "dy1", "dx2", "dy2", "g", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "i", "()F", "k", "j", "l", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeQuadTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy2;

        public RelativeQuadTo(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f10;
            this.dy1 = f11;
            this.dx2 = f12;
            this.dy2 = f13;
        }

        public static /* synthetic */ RelativeQuadTo h(RelativeQuadTo relativeQuadTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeQuadTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeQuadTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f12 = relativeQuadTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f13 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.g(f10, f11, f12, f13);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) other;
            return f0.g(Float.valueOf(this.dx1), Float.valueOf(relativeQuadTo.dx1)) && f0.g(Float.valueOf(this.dy1), Float.valueOf(relativeQuadTo.dy1)) && f0.g(Float.valueOf(this.dx2), Float.valueOf(relativeQuadTo.dx2)) && f0.g(Float.valueOf(this.dy2), Float.valueOf(relativeQuadTo.dy2));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        @dl.d
        public final RelativeQuadTo g(float dx1, float dy1, float dx2, float dy2) {
            return new RelativeQuadTo(dx1, dy1, dx2, dy2);
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.dx1) * 31) + Float.floatToIntBits(this.dy1)) * 31) + Float.floatToIntBits(this.dx2)) * 31) + Float.floatToIntBits(this.dy2);
        }

        public final float i() {
            return this.dx1;
        }

        public final float j() {
            return this.dx2;
        }

        public final float k() {
            return this.dy1;
        }

        public final float l() {
            return this.dy2;
        }

        @dl.d
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$p, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$p;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "e", "f", "dx1", "dy1", "dx2", "dy2", "g", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "i", "()F", "k", "j", "l", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeReflectiveCurveTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy2;

        public RelativeReflectiveCurveTo(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.dx1 = f10;
            this.dy1 = f11;
            this.dx2 = f12;
            this.dy2 = f13;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo h(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeReflectiveCurveTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeReflectiveCurveTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f12 = relativeReflectiveCurveTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f13 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.g(f10, f11, f12, f13);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) other;
            return f0.g(Float.valueOf(this.dx1), Float.valueOf(relativeReflectiveCurveTo.dx1)) && f0.g(Float.valueOf(this.dy1), Float.valueOf(relativeReflectiveCurveTo.dy1)) && f0.g(Float.valueOf(this.dx2), Float.valueOf(relativeReflectiveCurveTo.dx2)) && f0.g(Float.valueOf(this.dy2), Float.valueOf(relativeReflectiveCurveTo.dy2));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        @dl.d
        public final RelativeReflectiveCurveTo g(float dx1, float dy1, float dx2, float dy2) {
            return new RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2);
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.dx1) * 31) + Float.floatToIntBits(this.dy1)) * 31) + Float.floatToIntBits(this.dx2)) * 31) + Float.floatToIntBits(this.dy2);
        }

        public final float i() {
            return this.dx1;
        }

        public final float j() {
            return this.dx2;
        }

        public final float k() {
            return this.dy1;
        }

        public final float l() {
            return this.dy2;
        }

        @dl.d
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$q, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$q;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "d", "dx", "dy", "e", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "g", "()F", RXScreenCaptureService.KEY_HEIGHT, "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeReflectiveQuadTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dx;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy;

        public RelativeReflectiveQuadTo(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f10;
            this.dy = f11;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo f(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeReflectiveQuadTo.dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.e(f10, f11);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @dl.d
        public final RelativeReflectiveQuadTo e(float dx, float dy) {
            return new RelativeReflectiveQuadTo(dx, dy);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) other;
            return f0.g(Float.valueOf(this.dx), Float.valueOf(relativeReflectiveQuadTo.dx)) && f0.g(Float.valueOf(this.dy), Float.valueOf(relativeReflectiveQuadTo.dy));
        }

        public final float g() {
            return this.dx;
        }

        public final float h() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.dx) * 31) + Float.floatToIntBits(this.dy);
        }

        @dl.d
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$r, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$r;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "dy", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "f", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class RelativeVerticalTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeVerticalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dy = f10;
        }

        public static /* synthetic */ RelativeVerticalTo e(RelativeVerticalTo relativeVerticalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.d(f10);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @dl.d
        public final RelativeVerticalTo d(float dy) {
            return new RelativeVerticalTo(dy);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelativeVerticalTo) && f0.g(Float.valueOf(this.dy), Float.valueOf(((RelativeVerticalTo) other).dy));
        }

        public final float f() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy);
        }

        @dl.d
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.dy + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.f$s, reason: from toString */
    /* JADX INFO: compiled from: PathNode.kt */
    @m0
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/f$s;", "Landroidx/compose/ui/graphics/vector/f;", "", ak.aF, "y", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "f", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class VerticalTo extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public VerticalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.y = f10;
        }

        public static /* synthetic */ VerticalTo e(VerticalTo verticalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = verticalTo.y;
            }
            return verticalTo.d(f10);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @dl.d
        public final VerticalTo d(float y10) {
            return new VerticalTo(y10);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalTo) && f0.g(Float.valueOf(this.y), Float.valueOf(((VerticalTo) other).y));
        }

        public final float f() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y);
        }

        @dl.d
        public String toString() {
            return "VerticalTo(y=" + this.y + ')';
        }
    }

    private f(boolean z10, boolean z11) {
        this.isCurve = z10;
        this.isQuad = z11;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }

    public /* synthetic */ f(boolean z10, boolean z11, u uVar) {
        this(z10, z11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsCurve() {
        return this.isCurve;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsQuad() {
        return this.isQuad;
    }
}
