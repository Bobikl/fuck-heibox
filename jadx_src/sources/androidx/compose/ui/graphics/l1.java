package androidx.compose.ui.graphics;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H&J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H&J(\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J(\u0010%\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001cH&J \u0010)\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&J \u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H&J'\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020/H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\u0005H&J\b\u00104\u001a\u00020\u0005H&J\u001d\u00105\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\b\u00107\u001a\u00020\u001cH&J-\u0010<\u001a\u00020 2\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=R%\u0010C\u001a\u00020>8&@&X¦\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010Eø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006HÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/l1;", "", "", "x", "y", "Lkotlin/b2;", "f", "dx", "dy", ak.av, RXScreenCaptureService.KEY_HEIGHT, "t", "x1", "y1", "x2", "y2", "l", "dx1", "dy1", "dx2", "dy2", ak.aF, "x3", "y3", "q", "dx3", "dy3", "b", "Lb1/i;", "rect", "startAngleRadians", "sweepAngleRadians", "", "forceMoveTo", "r", "startAngleDegrees", "sweepAngleDegrees", "o", "m", "oval", "k", ak.aG, "i", "Lb1/k;", "roundRect", "p", FlutterActivityLaunchConfigs.EXTRA_PATH, "Lb1/f;", androidx.constraintlayout.core.motion.utils.w.c.R, "g", "(Landroidx/compose/ui/graphics/l1;J)V", "close", "reset", "d", "(J)V", "getBounds", "path1", "path2", "Landroidx/compose/ui/graphics/q1;", "operation", ak.aB, "(Landroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/l1;I)Z", "Landroidx/compose/ui/graphics/n1;", "e", "()I", "n", "(I)V", "fillType", "j", "()Z", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13909a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.l1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Path.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/l1$a;", "", "Landroidx/compose/ui/graphics/q1;", "operation", "Landroidx/compose/ui/graphics/l1;", "path1", "path2", ak.av, "(ILandroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/l1;)Landroidx/compose/ui/graphics/l1;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f13909a = new Companion();

        private Companion() {
        }

        @dl.d
        public final l1 a(int operation, @dl.d l1 path1, @dl.d l1 path2) {
            kotlin.jvm.internal.f0.p(path1, "path1");
            kotlin.jvm.internal.f0.p(path2, "path2");
            l1 l1VarA = o.a();
            if (l1VarA.s(path1, path2, operation)) {
                return l1VarA;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        @Deprecated
        public static void b(@dl.d l1 l1Var, @dl.d b1.i rect, float f10, float f11, boolean z10) {
            kotlin.jvm.internal.f0.p(rect, "rect");
            k1.a(l1Var, rect, f10, f11, z10);
        }
    }

    void a(float f10, float f11);

    void b(float f10, float f11, float f12, float f13, float f14, float f15);

    void c(float f10, float f11, float f12, float f13);

    void close();

    void d(long offset);

    int e();

    void f(float f10, float f11);

    void g(@dl.d l1 path, long offset);

    @dl.d
    b1.i getBounds();

    void h(float f10, float f11);

    void i(@dl.d b1.i iVar, float f10, float f11);

    boolean isEmpty();

    boolean j();

    void k(@dl.d b1.i iVar);

    void l(float f10, float f11, float f12, float f13);

    void m(@dl.d b1.i iVar);

    void n(int i10);

    void o(@dl.d b1.i iVar, float f10, float f11, boolean z10);

    void p(@dl.d b1.k kVar);

    void q(float f10, float f11, float f12, float f13, float f14, float f15);

    void r(@dl.d b1.i iVar, float f10, float f11, boolean z10);

    void reset();

    boolean s(@dl.d l1 path1, @dl.d l1 path2, int operation);

    void t(float f10, float f11);

    void u(@dl.d b1.i iVar, float f10, float f11);
}
