package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010B\u001a\u00020>¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J8\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J8\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J(\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0002H\u0016J \u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0016J \u0010*\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016J%\u00101\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00012\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\tH\u0016J\b\u00104\u001a\u00020\tH\u0016J\u001d\u00105\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\b\u00107\u001a\u00020\u0002H\u0016J-\u0010<\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u00012\u0006\u0010;\u001a\u00020:H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010B\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b\u001f\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR-\u0010R\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\bJ\u0010O\"\u0004\bP\u0010QR\u001a\u0010W\u001a\u00020\u00048VX\u0096\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010T\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/ui/graphics/j;", "Landroidx/compose/ui/graphics/l1;", "Lb1/i;", "rect", "", "v", "", "x", "y", "Lkotlin/b2;", "f", "dx", "dy", ak.av, RXScreenCaptureService.KEY_HEIGHT, "t", "x1", "y1", "x2", "y2", "l", "dx1", "dy1", "dx2", "dy2", ak.aF, "x3", "y3", "q", "dx3", "dy3", "b", "startAngleDegrees", "sweepAngleDegrees", "forceMoveTo", "o", "m", "oval", "k", "startAngleRadians", "sweepAngleRadians", ak.aG, "i", "Lb1/k;", "roundRect", "p", FlutterActivityLaunchConfigs.EXTRA_PATH, "Lb1/f;", androidx.constraintlayout.core.motion.utils.w.c.R, "g", "(Landroidx/compose/ui/graphics/l1;J)V", "close", "reset", "d", "(J)V", "getBounds", "path1", "path2", "Landroidx/compose/ui/graphics/q1;", "operation", ak.aB, "(Landroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/l1;I)Z", "Landroid/graphics/Path;", "Landroid/graphics/Path;", RXScreenCaptureService.KEY_WIDTH, "()Landroid/graphics/Path;", "internalPath", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "mMatrix", "Landroidx/compose/ui/graphics/n1;", "value", "()I", "n", "(I)V", "fillType", "j", "()Z", "isConvex$annotations", "()V", "isConvex", "isEmpty", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class j implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Path internalPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RectF rectF;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] radii;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Matrix mMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public j(@dl.d Path internalPath) {
        kotlin.jvm.internal.f0.p(internalPath, "internalPath");
        this.internalPath = internalPath;
        this.rectF = new RectF();
        this.radii = new float[8];
        this.mMatrix = new Matrix();
    }

    public /* synthetic */ j(Path path, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new Path() : path);
    }

    private final boolean v(b1.i rect) {
        if (!(!Float.isNaN(rect.t()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(!Float.isNaN(rect.getF30372b()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(!Float.isNaN(rect.x()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        if (!Float.isNaN(rect.j())) {
            return true;
        }
        throw new IllegalStateException("Rect.bottom is NaN".toString());
    }

    public static /* synthetic */ void x() {
    }

    @Override // androidx.compose.ui.graphics.l1
    public void a(float f10, float f11) {
        this.internalPath.rMoveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.internalPath.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void c(float f10, float f11, float f12, float f13) {
        this.internalPath.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.l1
    public void d(long offset) {
        this.mMatrix.reset();
        this.mMatrix.setTranslate(b1.f.p(offset), b1.f.r(offset));
        this.internalPath.transform(this.mMatrix);
    }

    @Override // androidx.compose.ui.graphics.l1
    public int e() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? n1.INSTANCE.a() : n1.INSTANCE.b();
    }

    @Override // androidx.compose.ui.graphics.l1
    public void f(float f10, float f11) {
        this.internalPath.moveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void g(@dl.d l1 path, long offset) {
        kotlin.jvm.internal.f0.p(path, "path");
        Path path2 = this.internalPath;
        if (!(path instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((j) path).getInternalPath(), b1.f.p(offset), b1.f.r(offset));
    }

    @Override // androidx.compose.ui.graphics.l1
    @dl.d
    public b1.i getBounds() {
        this.internalPath.computeBounds(this.rectF, true);
        RectF rectF = this.rectF;
        return new b1.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void h(float f10, float f11) {
        this.internalPath.lineTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void i(@dl.d b1.i oval, float f10, float f11) {
        kotlin.jvm.internal.f0.p(oval, "oval");
        if (!v(oval)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.rectF.set(w1.a(oval));
        this.internalPath.addArc(this.rectF, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.l1
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.l1
    public boolean j() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.l1
    public void k(@dl.d b1.i oval) {
        kotlin.jvm.internal.f0.p(oval, "oval");
        this.rectF.set(w1.a(oval));
        this.internalPath.addOval(this.rectF, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void l(float f10, float f11, float f12, float f13) {
        this.internalPath.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void m(@dl.d b1.i rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        if (!v(rect)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.rectF.set(w1.b(rect));
        this.internalPath.addRect(this.rectF, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void n(int i10) {
        this.internalPath.setFillType(n1.f(i10, n1.INSTANCE.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void o(@dl.d b1.i rect, float f10, float f11, boolean z10) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        this.rectF.set(rect.t(), rect.getF30372b(), rect.x(), rect.j());
        this.internalPath.arcTo(this.rectF, f10, f11, z10);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void p(@dl.d b1.k roundRect) {
        kotlin.jvm.internal.f0.p(roundRect, "roundRect");
        this.rectF.set(roundRect.q(), roundRect.s(), roundRect.r(), roundRect.m());
        this.radii[0] = b1.a.m(roundRect.t());
        this.radii[1] = b1.a.o(roundRect.t());
        this.radii[2] = b1.a.m(roundRect.u());
        this.radii[3] = b1.a.o(roundRect.u());
        this.radii[4] = b1.a.m(roundRect.o());
        this.radii[5] = b1.a.o(roundRect.o());
        this.radii[6] = b1.a.m(roundRect.n());
        this.radii[7] = b1.a.o(roundRect.n());
        this.internalPath.addRoundRect(this.rectF, this.radii, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void q(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.internalPath.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.l1
    public /* synthetic */ void r(b1.i iVar, float f10, float f11, boolean z10) {
        k1.a(this, iVar, f10, f11, z10);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.l1
    public boolean s(@dl.d l1 path1, @dl.d l1 path2, int operation) {
        Path.Op op;
        kotlin.jvm.internal.f0.p(path1, "path1");
        kotlin.jvm.internal.f0.p(path2, "path2");
        q1.Companion aVar = q1.INSTANCE;
        if (q1.i(operation, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (q1.i(operation, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (q1.i(operation, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = q1.i(operation, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.internalPath;
        if (!(path1 instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((j) path1).getInternalPath();
        if (path2 instanceof j) {
            return path.op(internalPath, ((j) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.l1
    public void t(float f10, float f11) {
        this.internalPath.rLineTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.l1
    public void u(@dl.d b1.i oval, float f10, float f11) {
        kotlin.jvm.internal.f0.p(oval, "oval");
        i(oval, p0.a(f10), p0.a(f11));
    }

    @dl.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public final Path getInternalPath() {
        return this.internalPath;
    }
}
