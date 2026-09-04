package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.l1;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b`\u0010aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u001d\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u001f\u001a\u00020\u0004*\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010!\u001a\u00020\u0004*\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010#\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010&\u001a\u00020\u0004*\u00020$2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010(\u001a\u00020\u0004*\u00020'2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010*\u001a\u00020\u0004*\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010,\u001a\u00020\u0004*\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JX\u00108\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001bH\u0002JX\u0010?\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020.H\u0002J\u0018\u00103\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002J\u0018\u0010G\u001a\u00020E2\u0006\u0010(\u001a\u00020D2\u0006\u0010F\u001a\u00020EH\u0002J\u0010\u0010H\u001a\u00020B2\u0006\u0010(\u001a\u00020DH\u0002J \u0010J\u001a\u00020B2\u0006\u0010I\u001a\u00020B2\u0006\u0010=\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0002J \u0010M\u001a\u00020\u00042\u0006\u0010(\u001a\u00020D2\u0006\u0010=\u001a\u00020E2\u0006\u0010L\u001a\u00020KH\u0002J\f\u0010O\u001a\u00020N*\u00020NH\u0002J\f\u0010P\u001a\u00020.*\u00020.H\u0002J\u0006\u0010Q\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010R\u001a\u00020DJ\u0014\u00104\u001a\u00020\u00002\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0SJ\f\u0010V\u001a\b\u0012\u0004\u0012\u00020T0SJ\u0010\u0010W\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010YR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010[R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010[R\u0014\u0010^\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010[R\u0014\u0010_\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010[¨\u0006b"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "Landroidx/compose/ui/graphics/l1;", "target", "Lkotlin/b2;", "f", "Landroidx/compose/ui/graphics/vector/f$n;", "x", "Landroidx/compose/ui/graphics/vector/f$f;", "n", "Landroidx/compose/ui/graphics/vector/f$m;", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/ui/graphics/vector/f$e;", "m", "Landroidx/compose/ui/graphics/vector/f$l;", "v", "Landroidx/compose/ui/graphics/vector/f$d;", "l", "Landroidx/compose/ui/graphics/vector/f$r;", "B", "Landroidx/compose/ui/graphics/vector/f$s;", "H", "Landroidx/compose/ui/graphics/vector/f$k;", ak.aG, "Landroidx/compose/ui/graphics/vector/f$c;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/vector/f$p;", "", "prevIsCurve", ak.aD, "Landroidx/compose/ui/graphics/vector/f$h;", "r", "Landroidx/compose/ui/graphics/vector/f$o;", "y", "Landroidx/compose/ui/graphics/vector/f$g;", "q", "Landroidx/compose/ui/graphics/vector/f$q;", "prevIsQuad", androidx.exifinterface.media.a.W4, "Landroidx/compose/ui/graphics/vector/f$i;", ak.aB, "Landroidx/compose/ui/graphics/vector/f$j;", "t", "Landroidx/compose/ui/graphics/vector/f$a;", ak.aF, "p", "", "x0", "y0", "x1", "y1", ak.av, "b", "theta", "isMoreThanHalf", "isPositiveArc", "i", "cx", "cy", "e1x", "e1y", com.google.android.exoplayer2.text.ttml.d.f49798o0, "sweep", "d", "", com.taobao.agoo.a.a.b.JSON_CMD, "", "args", "", "", com.google.android.exoplayer2.text.ttml.d.f49800p0, "o", "k", MallPriceObj.TYPE_ORIGINAL, "g", "Landroidx/compose/ui/graphics/vector/h$a;", "result", "j", "", "G", "F", "e", "pathData", "", "Landroidx/compose/ui/graphics/vector/f;", "nodes", "C", "D", "", "Ljava/util/List;", "Landroidx/compose/ui/graphics/vector/h$b;", "Landroidx/compose/ui/graphics/vector/h$b;", "currentPoint", "ctrlPoint", "segmentPoint", "reflectiveCtrlPoint", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<f> nodes = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PathPoint currentPoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PathPoint ctrlPoint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PathPoint segmentPoint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PathPoint reflectiveCtrlPoint;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.h$a, reason: from toString */
    /* JADX INFO: compiled from: PathParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$a;", "", "", ak.av, "", "b", "endPosition", "endWithNegativeOrDot", ak.aF, "", "toString", "hashCode", "other", "equals", "I", "e", "()I", "g", "(I)V", "Z", "f", "()Z", RXScreenCaptureService.KEY_HEIGHT, "(Z)V", "<init>", "(IZ)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ExtractFloatResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private int endPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean endWithNegativeOrDot;

        /* JADX WARN: Multi-variable type inference failed */
        public ExtractFloatResult() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public ExtractFloatResult(int i10, boolean z10) {
            this.endPosition = i10;
            this.endWithNegativeOrDot = z10;
        }

        public /* synthetic */ ExtractFloatResult(int i10, boolean z10, int i11, u uVar) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
        }

        public static /* synthetic */ ExtractFloatResult d(ExtractFloatResult extractFloatResult, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = extractFloatResult.endPosition;
            }
            if ((i11 & 2) != 0) {
                z10 = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.c(i10, z10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getEndPosition() {
            return this.endPosition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        @dl.d
        public final ExtractFloatResult c(int endPosition, boolean endWithNegativeOrDot) {
            return new ExtractFloatResult(endPosition, endWithNegativeOrDot);
        }

        public final int e() {
            return this.endPosition;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) other;
            return this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot;
        }

        public final boolean f() {
            return this.endWithNegativeOrDot;
        }

        public final void g(int i10) {
            this.endPosition = i10;
        }

        public final void h(boolean z10) {
            this.endWithNegativeOrDot = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i10 = this.endPosition * 31;
            boolean z10 = this.endWithNegativeOrDot;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return i10 + r10;
        }

        @dl.d
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.h$b, reason: from toString */
    /* JADX INFO: compiled from: PathParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/h$b;", "", "Lkotlin/b2;", "g", "", ak.av, "b", "x", "y", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "F", "e", "()F", RXScreenCaptureService.KEY_HEIGHT, "(F)V", "f", "i", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class PathPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private float x;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public PathPoint() {
            float f10 = 0.0f;
            this(f10, f10, 3, null);
        }

        public PathPoint(float f10, float f11) {
            this.x = f10;
            this.y = f11;
        }

        public /* synthetic */ PathPoint(float f10, float f11, int i10, u uVar) {
            this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
        }

        public static /* synthetic */ PathPoint d(PathPoint pathPoint, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = pathPoint.x;
            }
            if ((i10 & 2) != 0) {
                f11 = pathPoint.y;
            }
            return pathPoint.c(f10, f11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @dl.d
        public final PathPoint c(float x10, float y10) {
            return new PathPoint(x10, y10);
        }

        public final float e() {
            return this.x;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) other;
            return f0.g(Float.valueOf(this.x), Float.valueOf(pathPoint.x)) && f0.g(Float.valueOf(this.y), Float.valueOf(pathPoint.y));
        }

        public final float f() {
            return this.y;
        }

        public final void g() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public final void h(float f10) {
            this.x = f10;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
        }

        public final void i(float f10) {
            this.y = f10;
        }

        @dl.d
        public String toString() {
            return "PathPoint(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    public h() {
        float f10 = 0.0f;
        int i10 = 3;
        u uVar = null;
        this.currentPoint = new PathPoint(f10, f10, i10, uVar);
        this.ctrlPoint = new PathPoint(f10, f10, i10, uVar);
        this.segmentPoint = new PathPoint(f10, f10, i10, uVar);
        this.reflectiveCtrlPoint = new PathPoint(f10, f10, i10, uVar);
    }

    private final void A(f.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z10, l1 l1Var) {
        if (z10) {
            this.reflectiveCtrlPoint.h(this.currentPoint.e() - this.ctrlPoint.e());
            this.reflectiveCtrlPoint.i(this.currentPoint.f() - this.ctrlPoint.f());
        } else {
            this.reflectiveCtrlPoint.g();
        }
        l1Var.c(this.reflectiveCtrlPoint.e(), this.reflectiveCtrlPoint.f(), relativeReflectiveQuadTo.g(), relativeReflectiveQuadTo.h());
        this.ctrlPoint.h(this.currentPoint.e() + this.reflectiveCtrlPoint.e());
        this.ctrlPoint.i(this.currentPoint.f() + this.reflectiveCtrlPoint.f());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeReflectiveQuadTo.g());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.i(pathPoint2.f() + relativeReflectiveQuadTo.h());
    }

    private final void B(f.RelativeVerticalTo relativeVerticalTo, l1 l1Var) {
        l1Var.t(0.0f, relativeVerticalTo.f());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.i(pathPoint.f() + relativeVerticalTo.f());
    }

    public static /* synthetic */ l1 E(h hVar, l1 l1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l1Var = androidx.compose.ui.graphics.o.a();
        }
        return hVar.D(l1Var);
    }

    private final double F(double d10) {
        return (d10 / ((double) 180)) * 3.141592653589793d;
    }

    private final float G(float f10) {
        return (f10 / 180.0f) * 3.1415927f;
    }

    private final void H(f.VerticalTo verticalTo, l1 l1Var) {
        l1Var.h(this.currentPoint.e(), verticalTo.f());
        this.currentPoint.i(verticalTo.f());
    }

    private final void a(char c10, float[] fArr) {
        this.nodes.addAll(g.b(c10, fArr));
    }

    private final void c(f.ArcTo arcTo, l1 l1Var) {
        i(l1Var, this.currentPoint.e(), this.currentPoint.f(), arcTo.l(), arcTo.m(), arcTo.n(), arcTo.p(), arcTo.o(), arcTo.q(), arcTo.r());
        this.currentPoint.h(arcTo.l());
        this.currentPoint.i(arcTo.m());
        this.ctrlPoint.h(this.currentPoint.e());
        this.ctrlPoint.i(this.currentPoint.f());
    }

    private final void d(l1 l1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * dCos;
        double d23 = d13 * dSin;
        double d24 = (d22 * dSin2) - (d23 * dCos2);
        double d25 = d21 * dSin;
        double d26 = d13 * dCos;
        double d27 = (dSin2 * d25) + (dCos2 * d26);
        double d28 = d18 / ((double) iCeil);
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < iCeil) {
            double d34 = d33 + d28;
            double dSin3 = Math.sin(d34);
            double dCos3 = Math.cos(d34);
            int i11 = iCeil;
            double d35 = (d10 + ((d19 * dCos) * dCos3)) - (d23 * dSin3);
            double d36 = d11 + (d19 * dSin * dCos3) + (d26 * dSin3);
            double d37 = (d22 * dSin3) - (d23 * dCos3);
            double d38 = (dSin3 * d25) + (dCos3 * d26);
            double d39 = d34 - d33;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            l1Var.q((float) (d29 + (d31 * dSin4)), (float) (d32 + (d30 * dSin4)), (float) (d35 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            dSin = dSin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d20;
            d31 = d37;
            dCos = dCos;
            iCeil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private final void f(l1 l1Var) {
        this.currentPoint.h(this.segmentPoint.e());
        this.currentPoint.i(this.segmentPoint.f());
        this.ctrlPoint.h(this.segmentPoint.e());
        this.ctrlPoint.i(this.segmentPoint.f());
        l1Var.close();
        l1Var.f(this.currentPoint.e(), this.currentPoint.f());
    }

    private final float[] g(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int length = original.length;
        if (start < 0 || start > length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = end - start;
        int iMin = Math.min(i10, length - start);
        float[] fArr = new float[i10];
        kotlin.collections.m.Z0(original, fArr, 0, start, iMin + start);
        return fArr;
    }

    private final void h(f.CurveTo curveTo, l1 l1Var) {
        l1Var.q(curveTo.k(), curveTo.n(), curveTo.l(), curveTo.o(), curveTo.m(), curveTo.p());
        this.ctrlPoint.h(curveTo.l());
        this.ctrlPoint.i(curveTo.o());
        this.currentPoint.h(curveTo.m());
        this.currentPoint.i(curveTo.p());
    }

    private final void i(l1 l1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double dF = F(d16);
        double dCos = Math.cos(dF);
        double dSin = Math.sin(dF);
        double d19 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d20 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d21 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d22 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d23 * d23) + (d24 * d24);
        if (d28 == 0.0d) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            i(l1Var, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d29);
        double d30 = d23 * dSqrt2;
        double d31 = dSqrt2 * d24;
        if (z10 == z11) {
            d17 = d26 - d31;
            d18 = d27 + d30;
        } else {
            d17 = d26 + d31;
            d18 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d20 - d18, d19 - d17);
        double dAtan3 = Math.atan2(d22 - d18, d21 - d17) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d32 = d17 * d14;
        double d33 = d18 * d15;
        d(l1Var, (d32 * dCos) - (d33 * dSin), (d32 * dSin) + (d33 * dCos), d14, d15, d10, d11, dF, dAtan2, dAtan3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    private final void j(String str, int i10, ExtractFloatResult extractFloatResult) {
        extractFloatResult.h(false);
        int i11 = i10;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ' ' || cCharAt == ',') {
                z10 = false;
                z12 = true;
            } else if (cCharAt == '-') {
                if (i11 == i10 || z10) {
                    z10 = false;
                } else {
                    extractFloatResult.h(true);
                    z10 = false;
                    z12 = true;
                }
            } else if (cCharAt != '.') {
                if (cCharAt == 'e' || cCharAt == 'E') {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (z11) {
                extractFloatResult.h(true);
                z10 = false;
                z12 = true;
            } else {
                z10 = false;
                z11 = true;
            }
            if (z12) {
                break;
            } else {
                i11++;
            }
        }
        extractFloatResult.g(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float[] k(String s10) {
        int i10 = 0;
        Object[] objArr = 0;
        if (s10.charAt(0) == 'z' || s10.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[s10.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(i10, objArr == true ? 1 : 0, 3, null);
        int length = s10.length();
        int i11 = 1;
        int i12 = 0;
        while (i11 < length) {
            j(s10, i11, extractFloatResult);
            int iE = extractFloatResult.e();
            if (i11 < iE) {
                String strSubstring = s10.substring(i11, iE);
                f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i12] = Float.parseFloat(strSubstring);
                i12++;
            }
            i11 = extractFloatResult.f() ? iE : iE + 1;
        }
        return g(fArr, 0, i12);
    }

    private final void l(f.HorizontalTo horizontalTo, l1 l1Var) {
        l1Var.h(horizontalTo.f(), this.currentPoint.f());
        this.currentPoint.h(horizontalTo.f());
    }

    private final void m(f.LineTo lineTo, l1 l1Var) {
        l1Var.h(lineTo.g(), lineTo.h());
        this.currentPoint.h(lineTo.g());
        this.currentPoint.i(lineTo.h());
    }

    private final void n(f.MoveTo moveTo, l1 l1Var) {
        this.currentPoint.h(moveTo.g());
        this.currentPoint.i(moveTo.h());
        l1Var.f(moveTo.g(), moveTo.h());
        this.segmentPoint.h(this.currentPoint.e());
        this.segmentPoint.i(this.currentPoint.f());
    }

    private final int o(String s10, int end) {
        while (end < s10.length()) {
            char cCharAt = s10.charAt(end);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    private final void q(f.QuadTo quadTo, l1 l1Var) {
        l1Var.l(quadTo.i(), quadTo.k(), quadTo.j(), quadTo.l());
        this.ctrlPoint.h(quadTo.i());
        this.ctrlPoint.i(quadTo.k());
        this.currentPoint.h(quadTo.j());
        this.currentPoint.i(quadTo.l());
    }

    private final void r(f.ReflectiveCurveTo reflectiveCurveTo, boolean z10, l1 l1Var) {
        if (z10) {
            float f10 = 2;
            this.reflectiveCtrlPoint.h((this.currentPoint.e() * f10) - this.ctrlPoint.e());
            this.reflectiveCtrlPoint.i((f10 * this.currentPoint.f()) - this.ctrlPoint.f());
        } else {
            this.reflectiveCtrlPoint.h(this.currentPoint.e());
            this.reflectiveCtrlPoint.i(this.currentPoint.f());
        }
        l1Var.q(this.reflectiveCtrlPoint.e(), this.reflectiveCtrlPoint.f(), reflectiveCurveTo.i(), reflectiveCurveTo.k(), reflectiveCurveTo.j(), reflectiveCurveTo.l());
        this.ctrlPoint.h(reflectiveCurveTo.i());
        this.ctrlPoint.i(reflectiveCurveTo.k());
        this.currentPoint.h(reflectiveCurveTo.j());
        this.currentPoint.i(reflectiveCurveTo.l());
    }

    private final void s(f.ReflectiveQuadTo reflectiveQuadTo, boolean z10, l1 l1Var) {
        if (z10) {
            float f10 = 2;
            this.reflectiveCtrlPoint.h((this.currentPoint.e() * f10) - this.ctrlPoint.e());
            this.reflectiveCtrlPoint.i((f10 * this.currentPoint.f()) - this.ctrlPoint.f());
        } else {
            this.reflectiveCtrlPoint.h(this.currentPoint.e());
            this.reflectiveCtrlPoint.i(this.currentPoint.f());
        }
        l1Var.l(this.reflectiveCtrlPoint.e(), this.reflectiveCtrlPoint.f(), reflectiveQuadTo.g(), reflectiveQuadTo.h());
        this.ctrlPoint.h(this.reflectiveCtrlPoint.e());
        this.ctrlPoint.i(this.reflectiveCtrlPoint.f());
        this.currentPoint.h(reflectiveQuadTo.g());
        this.currentPoint.i(reflectiveQuadTo.h());
    }

    private final void t(f.RelativeArcTo relativeArcTo, l1 l1Var) {
        float fL = relativeArcTo.l() + this.currentPoint.e();
        float fM = relativeArcTo.m() + this.currentPoint.f();
        i(l1Var, this.currentPoint.e(), this.currentPoint.f(), fL, fM, relativeArcTo.n(), relativeArcTo.p(), relativeArcTo.o(), relativeArcTo.q(), relativeArcTo.r());
        this.currentPoint.h(fL);
        this.currentPoint.i(fM);
        this.ctrlPoint.h(this.currentPoint.e());
        this.ctrlPoint.i(this.currentPoint.f());
    }

    private final void u(f.RelativeCurveTo relativeCurveTo, l1 l1Var) {
        l1Var.b(relativeCurveTo.k(), relativeCurveTo.n(), relativeCurveTo.l(), relativeCurveTo.o(), relativeCurveTo.m(), relativeCurveTo.p());
        this.ctrlPoint.h(this.currentPoint.e() + relativeCurveTo.l());
        this.ctrlPoint.i(this.currentPoint.f() + relativeCurveTo.o());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeCurveTo.m());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.i(pathPoint2.f() + relativeCurveTo.p());
    }

    private final void v(f.RelativeHorizontalTo relativeHorizontalTo, l1 l1Var) {
        l1Var.t(relativeHorizontalTo.f(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeHorizontalTo.f());
    }

    private final void w(f.RelativeLineTo relativeLineTo, l1 l1Var) {
        l1Var.t(relativeLineTo.g(), relativeLineTo.h());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeLineTo.g());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.i(pathPoint2.f() + relativeLineTo.h());
    }

    private final void x(f.RelativeMoveTo relativeMoveTo, l1 l1Var) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeMoveTo.g());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.i(pathPoint2.f() + relativeMoveTo.h());
        l1Var.a(relativeMoveTo.g(), relativeMoveTo.h());
        this.segmentPoint.h(this.currentPoint.e());
        this.segmentPoint.i(this.currentPoint.f());
    }

    private final void y(f.RelativeQuadTo relativeQuadTo, l1 l1Var) {
        l1Var.c(relativeQuadTo.i(), relativeQuadTo.k(), relativeQuadTo.j(), relativeQuadTo.l());
        this.ctrlPoint.h(this.currentPoint.e() + relativeQuadTo.i());
        this.ctrlPoint.i(this.currentPoint.f() + relativeQuadTo.k());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeQuadTo.j());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.i(pathPoint2.f() + relativeQuadTo.l());
    }

    private final void z(f.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z10, l1 l1Var) {
        if (z10) {
            this.reflectiveCtrlPoint.h(this.currentPoint.e() - this.ctrlPoint.e());
            this.reflectiveCtrlPoint.i(this.currentPoint.f() - this.ctrlPoint.f());
        } else {
            this.reflectiveCtrlPoint.g();
        }
        l1Var.b(this.reflectiveCtrlPoint.e(), this.reflectiveCtrlPoint.f(), relativeReflectiveCurveTo.i(), relativeReflectiveCurveTo.k(), relativeReflectiveCurveTo.j(), relativeReflectiveCurveTo.l());
        this.ctrlPoint.h(this.currentPoint.e() + relativeReflectiveCurveTo.i());
        this.ctrlPoint.i(this.currentPoint.f() + relativeReflectiveCurveTo.k());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.h(pathPoint.e() + relativeReflectiveCurveTo.j());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.i(pathPoint2.f() + relativeReflectiveCurveTo.l());
    }

    @dl.d
    public final List<f> C() {
        return this.nodes;
    }

    @dl.d
    public final l1 D(@dl.d l1 target) {
        f0.p(target, "target");
        target.reset();
        this.currentPoint.g();
        this.ctrlPoint.g();
        this.segmentPoint.g();
        this.reflectiveCtrlPoint.g();
        List<f> list = this.nodes;
        int size = list.size();
        f fVar = null;
        int i10 = 0;
        while (i10 < size) {
            f fVar2 = list.get(i10);
            if (fVar == null) {
                fVar = fVar2;
            }
            if (fVar2 instanceof f.b) {
                f(target);
            } else if (fVar2 instanceof f.RelativeMoveTo) {
                x((f.RelativeMoveTo) fVar2, target);
            } else if (fVar2 instanceof f.MoveTo) {
                n((f.MoveTo) fVar2, target);
            } else if (fVar2 instanceof f.RelativeLineTo) {
                w((f.RelativeLineTo) fVar2, target);
            } else if (fVar2 instanceof f.LineTo) {
                m((f.LineTo) fVar2, target);
            } else if (fVar2 instanceof f.RelativeHorizontalTo) {
                v((f.RelativeHorizontalTo) fVar2, target);
            } else if (fVar2 instanceof f.HorizontalTo) {
                l((f.HorizontalTo) fVar2, target);
            } else if (fVar2 instanceof f.RelativeVerticalTo) {
                B((f.RelativeVerticalTo) fVar2, target);
            } else if (fVar2 instanceof f.VerticalTo) {
                H((f.VerticalTo) fVar2, target);
            } else if (fVar2 instanceof f.RelativeCurveTo) {
                u((f.RelativeCurveTo) fVar2, target);
            } else if (fVar2 instanceof f.CurveTo) {
                h((f.CurveTo) fVar2, target);
            } else if (fVar2 instanceof f.RelativeReflectiveCurveTo) {
                f0.m(fVar);
                z((f.RelativeReflectiveCurveTo) fVar2, fVar.getIsCurve(), target);
            } else if (fVar2 instanceof f.ReflectiveCurveTo) {
                f0.m(fVar);
                r((f.ReflectiveCurveTo) fVar2, fVar.getIsCurve(), target);
            } else if (fVar2 instanceof f.RelativeQuadTo) {
                y((f.RelativeQuadTo) fVar2, target);
            } else if (fVar2 instanceof f.QuadTo) {
                q((f.QuadTo) fVar2, target);
            } else if (fVar2 instanceof f.RelativeReflectiveQuadTo) {
                f0.m(fVar);
                A((f.RelativeReflectiveQuadTo) fVar2, fVar.getIsQuad(), target);
            } else if (fVar2 instanceof f.ReflectiveQuadTo) {
                f0.m(fVar);
                s((f.ReflectiveQuadTo) fVar2, fVar.getIsQuad(), target);
            } else if (fVar2 instanceof f.RelativeArcTo) {
                t((f.RelativeArcTo) fVar2, target);
            } else if (fVar2 instanceof f.ArcTo) {
                c((f.ArcTo) fVar2, target);
            }
            i10++;
            fVar = fVar2;
        }
        return target;
    }

    @dl.d
    public final h b(@dl.d List<? extends f> nodes) {
        f0.p(nodes, "nodes");
        this.nodes.addAll(nodes);
        return this;
    }

    public final void e() {
        this.nodes.clear();
    }

    @dl.d
    public final h p(@dl.d String pathData) {
        f0.p(pathData, "pathData");
        this.nodes.clear();
        int i10 = 0;
        int i11 = 1;
        while (i11 < pathData.length()) {
            int iO = o(pathData, i11);
            String strSubstring = pathData.substring(i10, iO);
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - 1;
            int i12 = 0;
            boolean z10 = false;
            while (i12 <= length) {
                boolean z11 = f0.t(strSubstring.charAt(!z10 ? i12 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i12++;
                } else {
                    z10 = true;
                }
            }
            String string = strSubstring.subSequence(i12, length + 1).toString();
            if (string.length() > 0) {
                a(string.charAt(0), k(string));
            }
            i10 = iO;
            i11 = iO + 1;
        }
        if (i11 - i10 == 1 && i10 < pathData.length()) {
            a(pathData.charAt(i10), new float[0]);
        }
        return this;
    }
}
