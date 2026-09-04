package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import b1.MutableRect;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
@Metadata(bv = {}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002\"/B1\u0012\u0006\u0010G\u001a\u00020C\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000309\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J§\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\u00032\u0006\u0010%\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+J\b\u0010.\u001a\u00020\u0003H\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0003H\u0016J\b\u00101\u001a\u00020\u0003H\u0016J%\u00104\u001a\u00020$2\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0018\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\u0006\u00103\u001a\u00020\u0017H\u0016J*\u0010=\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003092\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;H\u0016J\u001d\u0010@\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010AR\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\bE\u0010FR$\u0010L\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010I\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010NR\u0016\u0010P\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010IR\u0016\u0010Q\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010IR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010ZR\u001f\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u0014\u0010^\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/z0;", "Landroidx/compose/ui/layout/j;", "Lkotlin/b2;", "o", "Landroidx/compose/ui/graphics/d0;", "canvas", "l", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "shape", "", "clip", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "Landroidx/compose/ui/graphics/l0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", ak.av, "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;ZLandroidx/compose/ui/graphics/y1;JJLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)V", "Lb1/f;", CommonNetImpl.POSITION, RXScreenCaptureService.KEY_HEIGHT, "(J)Z", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "g", "(J)V", "Ls1/n;", "j", "invalidate", "b", "k", "destroy", "point", "inverse", "f", "(JZ)J", "Lb1/d;", "rect", ak.aF, "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "e", "Landroidx/compose/ui/graphics/c1;", "matrix", "d", "([F)V", "i", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "m", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "value", "Z", "n", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/g1;", "Landroidx/compose/ui/platform/g1;", "outlineResolver", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/h1;", "Landroidx/compose/ui/graphics/h1;", "softwareLayerPaint", "Landroidx/compose/ui/platform/b1;", "Landroidx/compose/ui/platform/o0;", "Landroidx/compose/ui/platform/b1;", "matrixCache", "Landroidx/compose/ui/graphics/e0;", "Landroidx/compose/ui/graphics/e0;", "canvasHolder", "J", "Landroidx/compose/ui/platform/o0;", "renderNode", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lyh/l;Lyh/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class RenderNodeLayer implements androidx.compose.ui.node.z0, androidx.compose.ui.layout.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final yh.p<o0, Matrix, kotlin.b2> f15661o = new yh.p<o0, Matrix, kotlin.b2>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        public final void a(@dl.d o0 rn, @dl.d Matrix matrix) {
            kotlin.jvm.internal.f0.p(rn, "rn");
            kotlin.jvm.internal.f0.p(matrix, "matrix");
            rn.p(matrix);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(o0 o0Var, Matrix matrix) {
            a(o0Var, matrix);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> f15663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private yh.a<kotlin.b2> f15664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g1 outlineResolver;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.h1 softwareLayerPaint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b1<o0> matrixCache;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.e0 canvasHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o0 renderNode;

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @androidx.annotation.w0(29)
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$b;", "", "Landroid/view/View;", sd.b.f139384b, "", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f15675a = new b();

        private b() {
        }

        @androidx.annotation.u
        @xh.m
        public static final long a(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(@dl.d AndroidComposeView ownerView, @dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock, @dl.d yh.a<kotlin.b2> invalidateParentLayer) {
        kotlin.jvm.internal.f0.p(ownerView, "ownerView");
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        kotlin.jvm.internal.f0.p(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.f15663c = drawBlock;
        this.f15664d = invalidateParentLayer;
        this.outlineResolver = new g1(ownerView.getF15427e());
        this.matrixCache = new b1<>(f15661o);
        this.canvasHolder = new androidx.compose.ui.graphics.e0();
        this.transformOrigin = androidx.compose.ui.graphics.o2.INSTANCE.a();
        o0 j1Var = Build.VERSION.SDK_INT >= 29 ? new j1(ownerView) : new h1(ownerView);
        j1Var.n(true);
        this.renderNode = j1Var;
    }

    private final void l(androidx.compose.ui.graphics.d0 d0Var) {
        if (this.renderNode.l() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.a(d0Var);
        }
    }

    private final void n(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.j0(this, z10);
        }
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 26) {
            s2.f15982a.a(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void a(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @dl.d androidx.compose.ui.graphics.g2 shape, boolean clip, @dl.e androidx.compose.ui.graphics.y1 renderEffect, long ambientShadowColor, long spotShadowColor, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
        yh.a<kotlin.b2> aVar;
        kotlin.jvm.internal.f0.p(shape, "shape");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.f0.p(density, "density");
        this.transformOrigin = transformOrigin;
        boolean z10 = this.renderNode.l() && !this.outlineResolver.d();
        this.renderNode.P(scaleX);
        this.renderNode.T(scaleY);
        this.renderNode.f(alpha);
        this.renderNode.Z(translationX);
        this.renderNode.o(translationY);
        this.renderNode.e(shadowElevation);
        this.renderNode.Q(androidx.compose.ui.graphics.n0.s(ambientShadowColor));
        this.renderNode.U(androidx.compose.ui.graphics.n0.s(spotShadowColor));
        this.renderNode.C(rotationZ);
        this.renderNode.z(rotationX);
        this.renderNode.A(rotationY);
        this.renderNode.y(cameraDistance);
        this.renderNode.s(androidx.compose.ui.graphics.o2.k(transformOrigin) * this.renderNode.getWidth());
        this.renderNode.t(androidx.compose.ui.graphics.o2.l(transformOrigin) * this.renderNode.getHeight());
        this.renderNode.w(clip && shape != androidx.compose.ui.graphics.x1.a());
        this.renderNode.c(clip && shape == androidx.compose.ui.graphics.x1.a());
        this.renderNode.R(renderEffect);
        boolean zG = this.outlineResolver.g(shape, this.renderNode.d(), this.renderNode.l(), this.renderNode.V(), layoutDirection, density);
        this.renderNode.v(this.outlineResolver.c());
        boolean z11 = this.renderNode.l() && !this.outlineResolver.d();
        if (z10 != z11 || (z11 && zG)) {
            invalidate();
        } else {
            o();
        }
        if (!this.drawnWithZ && this.renderNode.V() > 0.0f && (aVar = this.f15664d) != null) {
            aVar.invoke();
        }
        this.matrixCache.c();
    }

    @Override // androidx.compose.ui.node.z0
    public void b(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        Canvas canvasD = androidx.compose.ui.graphics.c.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            k();
            boolean z10 = this.renderNode.V() > 0.0f;
            this.drawnWithZ = z10;
            if (z10) {
                canvas.w();
            }
            this.renderNode.b(canvasD);
            if (this.drawnWithZ) {
                canvas.o();
                return;
            }
            return;
        }
        float F = this.renderNode.getLeft();
        float fK = this.renderNode.getTop();
        float fE = this.renderNode.getCom.google.android.exoplayer2.text.ttml.d.n0 java.lang.String();
        float fR = this.renderNode.getBottom();
        if (this.renderNode.d() < 1.0f) {
            androidx.compose.ui.graphics.h1 h1VarA = this.softwareLayerPaint;
            if (h1VarA == null) {
                h1VarA = androidx.compose.ui.graphics.i.a();
                this.softwareLayerPaint = h1VarA;
            }
            h1VarA.f(this.renderNode.d());
            canvasD.saveLayer(F, fK, fE, fR, h1VarA.getInternalPaint());
        } else {
            canvas.f();
        }
        canvas.b(F, fK);
        canvas.C(this.matrixCache.b(this.renderNode));
        l(canvas);
        yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> lVar = this.f15663c;
        if (lVar != null) {
            lVar.invoke(canvas);
        }
        canvas.u();
        n(false);
    }

    @Override // androidx.compose.ui.node.z0
    public void c(@dl.d MutableRect rect, boolean z10) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        if (!z10) {
            androidx.compose.ui.graphics.c1.l(this.matrixCache.b(this.renderNode), rect);
            return;
        }
        float[] fArrA = this.matrixCache.a(this.renderNode);
        if (fArrA == null) {
            rect.k(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            androidx.compose.ui.graphics.c1.l(fArrA, rect);
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void d(@dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        androidx.compose.ui.graphics.c1.u(matrix, this.matrixCache.b(this.renderNode));
    }

    @Override // androidx.compose.ui.node.z0
    public void destroy() {
        if (this.renderNode.h()) {
            this.renderNode.D();
        }
        this.f15663c = null;
        this.f15664d = null;
        this.isDestroyed = true;
        n(false);
        this.ownerView.p0();
        this.ownerView.n0(this);
    }

    @Override // androidx.compose.ui.node.z0
    public void e(@dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock, @dl.d yh.a<kotlin.b2> invalidateParentLayer) {
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        kotlin.jvm.internal.f0.p(invalidateParentLayer, "invalidateParentLayer");
        n(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = androidx.compose.ui.graphics.o2.INSTANCE.a();
        this.f15663c = drawBlock;
        this.f15664d = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.z0
    public long f(long point, boolean inverse) {
        if (!inverse) {
            return androidx.compose.ui.graphics.c1.j(this.matrixCache.b(this.renderNode), point);
        }
        float[] fArrA = this.matrixCache.a(this.renderNode);
        return fArrA != null ? androidx.compose.ui.graphics.c1.j(fArrA, point) : b1.f.f30364b.a();
    }

    @Override // androidx.compose.ui.node.z0
    public void g(long size) {
        int iM = s1.r.m(size);
        int iJ = s1.r.j(size);
        float f10 = iM;
        this.renderNode.s(androidx.compose.ui.graphics.o2.k(this.transformOrigin) * f10);
        float f11 = iJ;
        this.renderNode.t(androidx.compose.ui.graphics.o2.l(this.transformOrigin) * f11);
        o0 o0Var = this.renderNode;
        if (o0Var.B(o0Var.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + iM, this.renderNode.getTop() + iJ)) {
            this.outlineResolver.h(b1.n.a(f10, f11));
            this.renderNode.v(this.outlineResolver.c());
            invalidate();
            this.matrixCache.c();
        }
    }

    @Override // androidx.compose.ui.layout.j
    public long getLayerId() {
        return this.renderNode.a();
    }

    @Override // androidx.compose.ui.layout.j
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.z0
    public boolean h(long position) {
        float fP = b1.f.p(position);
        float fR = b1.f.r(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fP && fP < ((float) this.renderNode.getWidth()) && 0.0f <= fR && fR < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.l()) {
            return this.outlineResolver.e(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.z0
    public void i(@dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        float[] fArrA = this.matrixCache.a(this.renderNode);
        if (fArrA != null) {
            androidx.compose.ui.graphics.c1.u(matrix, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        n(true);
    }

    @Override // androidx.compose.ui.node.z0
    public void j(long position) {
        int iF = this.renderNode.getLeft();
        int iK = this.renderNode.getTop();
        int iM = s1.n.m(position);
        int iO = s1.n.o(position);
        if (iF == iM && iK == iO) {
            return;
        }
        this.renderNode.q(iM - iF);
        this.renderNode.g(iO - iK);
        o();
        this.matrixCache.c();
    }

    @Override // androidx.compose.ui.node.z0
    public void k() {
        if (this.isDirty || !this.renderNode.h()) {
            n(false);
            androidx.compose.ui.graphics.l1 l1VarB = (!this.renderNode.l() || this.outlineResolver.d()) ? null : this.outlineResolver.b();
            yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> lVar = this.f15663c;
            if (lVar != null) {
                this.renderNode.L(this.canvasHolder, l1VarB, lVar);
            }
        }
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }
}
