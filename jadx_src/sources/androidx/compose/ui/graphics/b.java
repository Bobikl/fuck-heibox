package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bm\u0010gJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000J)\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000J \u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001d\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J=\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.*\u00020&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J-\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J0\u00105\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J@\u00108\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J0\u00109\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J-\u0010<\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=JH\u0010B\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010C\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J-\u0010G\u001a\u00020\u00072\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJE\u0010O\u001a\u00020\u00072\u0006\u0010E\u001a\u00020D2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020K2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ3\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020Q2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\b\u0010U\u001a\u00020\u0007H\u0016J\b\u0010V\u001a\u00020\u0007H\u0016J-\u0010W\u001a\u00020\u00072\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ-\u0010]\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010^R,\u0010h\u001a\u00060_j\u0002``8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010a\u0012\u0004\bf\u0010g\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010jR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010j\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"Landroidx/compose/ui/graphics/b;", "Landroidx/compose/ui/graphics/d0;", "", "Lb1/f;", "points", "Landroidx/compose/ui/graphics/h1;", "paint", "Lkotlin/b2;", "d", "", "stepBy", ak.aF, "", "H", "G", "f", ak.aG, "Lb1/i;", "bounds", "l", "", "dx", "dy", "b", "sx", "sy", "q", "degrees", ak.aD, "B", "Landroidx/compose/ui/graphics/c1;", "matrix", "C", "([F)V", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Landroidx/compose/ui/graphics/k0;", "clipOp", ak.av, "(FFFFI)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "e", "(Landroidx/compose/ui/graphics/l1;I)V", "Landroid/graphics/Region$Op;", "L", "(I)Landroid/graphics/Region$Op;", "p1", "p2", "x", "(JJLandroidx/compose/ui/graphics/h1;)V", "r", "radiusX", "radiusY", "F", ak.aB, com.google.android.exoplayer2.text.ttml.d.f49794m0, "radius", androidx.exifinterface.media.a.S4, "(JFLandroidx/compose/ui/graphics/h1;)V", "startAngle", "sweepAngle", "", "useCenter", "m", "D", "Landroidx/compose/ui/graphics/y0;", "image", "topLeftOffset", "t", "(Landroidx/compose/ui/graphics/y0;JLandroidx/compose/ui/graphics/h1;)V", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "dstOffset", "dstSize", "i", "(Landroidx/compose/ui/graphics/y0;JJJJLandroidx/compose/ui/graphics/h1;)V", "Landroidx/compose/ui/graphics/t1;", "pointMode", RXScreenCaptureService.KEY_HEIGHT, "(ILjava/util/List;Landroidx/compose/ui/graphics/h1;)V", RXScreenCaptureService.KEY_WIDTH, "o", "j", "(I[FLandroidx/compose/ui/graphics/h1;)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/x;", "blendMode", "k", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/h1;)V", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "I", "()Landroid/graphics/Canvas;", "K", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class b implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Canvas internalCanvas = c.f13681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Rect srcRect = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Rect dstRect = new Rect();

    private final void G(float[] fArr, h1 h1Var, int i10) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, fArr.length - 3), i10 * 2);
        int iH = jVarB1.h();
        int i11 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ <= 0 || iH > i11) && (iJ >= 0 || i11 > iH)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawLine(fArr[iH], fArr[iH + 1], fArr[iH + 2], fArr[iH + 3], h1Var.getInternalPaint());
            if (iH == i11) {
                return;
            } else {
                iH += iJ;
            }
        }
    }

    private final void H(float[] fArr, h1 h1Var, int i10) {
        if (fArr.length % 2 != 0) {
            return;
        }
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, fArr.length - 1), i10);
        int iH = jVarB1.h();
        int i11 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ <= 0 || iH > i11) && (iJ >= 0 || i11 > iH)) {
            return;
        }
        while (true) {
            this.internalCanvas.drawPoint(fArr[iH], fArr[iH + 1], h1Var.getInternalPaint());
            if (iH == i11) {
                return;
            } else {
                iH += iJ;
            }
        }
    }

    @kotlin.r0
    public static /* synthetic */ void J() {
    }

    private final void c(List<b1.f> list, h1 h1Var, int i10) {
        if (list.size() < 2) {
            return;
        }
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, list.size() - 1), i10);
        int iH = jVarB1.h();
        int i11 = jVarB1.i();
        int iJ = jVarB1.j();
        if ((iJ <= 0 || iH > i11) && (iJ >= 0 || i11 > iH)) {
            return;
        }
        while (true) {
            long f30368a = list.get(iH).getF30368a();
            long f30368a2 = list.get(iH + 1).getF30368a();
            this.internalCanvas.drawLine(b1.f.p(f30368a), b1.f.r(f30368a), b1.f.p(f30368a2), b1.f.r(f30368a2), h1Var.getInternalPaint());
            if (iH == i11) {
                return;
            } else {
                iH += iJ;
            }
        }
    }

    private final void d(List<b1.f> list, h1 h1Var) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            long f30368a = list.get(i10).getF30368a();
            this.internalCanvas.drawPoint(b1.f.p(f30368a), b1.f.r(f30368a), h1Var.getInternalPaint());
        }
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void A(b1.i iVar, h1 h1Var) {
        c0.e(this, iVar, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void B(float f10, float f11) {
        this.internalCanvas.skew(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void C(@dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        if (d1.c(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        g.a(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void D(@dl.d l1 path, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((j) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void E(long center, float radius, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawCircle(b1.f.p(center), b1.f.r(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void F(float f10, float f11, float f12, float f13, float f14, float f15, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint.getInternalPaint());
    }

    @dl.d
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void K(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @dl.d
    public final Region.Op L(int i10) {
        return k0.f(i10, k0.INSTANCE.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.d0
    public void a(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, L(clipOp));
    }

    @Override // androidx.compose.ui.graphics.d0
    public void b(float f10, float f11) {
        this.internalCanvas.translate(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void e(@dl.d l1 path, int clipOp) {
        kotlin.jvm.internal.f0.p(path, "path");
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((j) path).getInternalPath(), L(clipOp));
    }

    @Override // androidx.compose.ui.graphics.d0
    public void f() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void g(b1.i iVar, float f10, float f11, boolean z10, h1 h1Var) {
        c0.b(this, iVar, f10, f11, z10, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void h(int pointMode, @dl.d List<b1.f> points, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(points, "points");
        kotlin.jvm.internal.f0.p(paint, "paint");
        t1.Companion companion = t1.INSTANCE;
        if (t1.g(pointMode, companion.a())) {
            c(points, paint, 2);
        } else if (t1.g(pointMode, companion.c())) {
            c(points, paint, 1);
        } else if (t1.g(pointMode, companion.b())) {
            d(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.d0
    public void i(@dl.d y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(image, "image");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapB = f.b(image);
        Rect rect = this.srcRect;
        rect.left = s1.n.m(srcOffset);
        rect.top = s1.n.o(srcOffset);
        rect.right = s1.n.m(srcOffset) + s1.r.m(srcSize);
        rect.bottom = s1.n.o(srcOffset) + s1.r.j(srcSize);
        kotlin.b2 b2Var = kotlin.b2.f124493a;
        Rect rect2 = this.dstRect;
        rect2.left = s1.n.m(dstOffset);
        rect2.top = s1.n.o(dstOffset);
        rect2.right = s1.n.m(dstOffset) + s1.r.m(dstSize);
        rect2.bottom = s1.n.o(dstOffset) + s1.r.j(dstSize);
        canvas.drawBitmap(bitmapB, rect, rect2, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void j(int pointMode, @dl.d float[] points, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(points, "points");
        kotlin.jvm.internal.f0.p(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        t1.Companion companion = t1.INSTANCE;
        if (t1.g(pointMode, companion.a())) {
            G(points, paint, 2);
        } else if (t1.g(pointMode, companion.c())) {
            G(points, paint, 1);
        } else if (t1.g(pointMode, companion.b())) {
            H(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.d0
    public void k(@dl.d Vertices vertices, int blendMode, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(vertices, "vertices");
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawVertices(t.a(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void l(@dl.d b1.i bounds, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(bounds, "bounds");
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.saveLayer(bounds.t(), bounds.getF30372b(), bounds.x(), bounds.j(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void m(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void n(b1.i iVar, h1 h1Var) {
        c0.d(this, iVar, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void o() {
        g0.f13850a.a(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void p(b1.i iVar, int i10) {
        c0.a(this, iVar, i10);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void q(float f10, float f11) {
        this.internalCanvas.scale(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void r(float f10, float f11, float f12, float f13, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawRect(f10, f11, f12, f13, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void s(float f10, float f11, float f12, float f13, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawOval(f10, f11, f12, f13, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void t(@dl.d y0 image, long topLeftOffset, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(image, "image");
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawBitmap(f.b(image), b1.f.p(topLeftOffset), b1.f.r(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public void u() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void v(b1.i iVar, float f10, float f11, boolean z10, h1 h1Var) {
        c0.c(this, iVar, f10, f11, z10, h1Var);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void w() {
        g0.f13850a.a(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void x(long p10, long p11, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        this.internalCanvas.drawLine(b1.f.p(p10), b1.f.r(p10), b1.f.p(p11), b1.f.r(p11), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.d0
    public /* synthetic */ void y(float f10, float f11) {
        c0.f(this, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.d0
    public void z(float f10) {
        this.internalCanvas.rotate(f10);
    }
}
