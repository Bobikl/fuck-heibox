package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b.\b\u0001\u0018\u0000 t2\u00020\u0001:\u0001)B\u0010\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J.\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\f\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u0010\r\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\"\u0010\u000e\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b<\u00102\"\u0004\b=\u00104R$\u0010D\u001a\u0004\u0018\u00010>8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010K\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\b/\u0010JR\u0014\u0010N\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010MR\u0014\u0010P\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u00102R\u0014\u0010R\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u00102R$\u0010X\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010[\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR$\u0010]\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010U\"\u0004\bG\u0010WR$\u0010`\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR$\u0010b\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010U\"\u0004\b8\u0010WR$\u0010d\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00102\"\u0004\bc\u00104R$\u0010g\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u00102\"\u0004\bf\u00104R$\u0010j\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010U\"\u0004\bi\u0010WR$\u0010m\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010U\"\u0004\bl\u0010WR$\u0010p\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010U\"\u0004\bo\u0010WR$\u0010s\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010U\"\u0004\br\u0010WR$\u0010v\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010U\"\u0004\bu\u0010WR$\u0010y\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010U\"\u0004\bx\u0010WR$\u0010|\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bz\u0010I\"\u0004\b{\u0010JR$\u0010}\u001a\u00020S2\u0006\u0010E\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010U\"\u0004\b;\u0010WR\u0014\u0010~\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010I¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/platform/h1;", "Landroidx/compose/ui/platform/o0;", "Lkotlin/b2;", "a0", "Landroid/view/RenderNode;", "renderNode", "h0", "Landroid/graphics/Outline;", "outline", "v", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "", "B", androidx.constraintlayout.core.motion.utils.w.c.R, "q", "g", "Landroidx/compose/ui/graphics/e0;", "canvasHolder", "Landroidx/compose/ui/graphics/l1;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "drawBlock", "L", "Landroid/graphics/Matrix;", "matrix", "p", "x", "Landroid/graphics/Canvas;", "canvas", "b", "hasOverlappingRendering", "n", "Landroidx/compose/ui/platform/p0;", "k", "D", "Landroidx/compose/ui/platform/AndroidComposeView;", ak.av, "Landroidx/compose/ui/platform/AndroidComposeView;", "c0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroid/view/RenderNode;", ak.aF, "I", "F", "()I", "e0", "(I)V", "d", "K", "g0", "e", androidx.exifinterface.media.a.S4, "f0", "f", "r", "d0", "Landroidx/compose/ui/graphics/y1;", "Landroidx/compose/ui/graphics/y1;", "m", "()Landroidx/compose/ui/graphics/y1;", "R", "(Landroidx/compose/ui/graphics/y1;)V", "renderEffect", "value", RXScreenCaptureService.KEY_HEIGHT, "Z", "J", "()Z", "(Z)V", "clipToBounds", "", "()J", "uniqueId", "getWidth", "width", "getHeight", "height", "", androidx.exifinterface.media.a.R4, "()F", "P", "(F)V", "scaleX", "b0", androidx.exifinterface.media.a.f23244d5, "scaleY", "H", "translationX", "G", "o", "translationY", androidx.exifinterface.media.a.X4, "elevation", "Q", "ambientShadowColor", "M", "U", "spotShadowColor", "O", "C", "rotationZ", "X", ak.aD, "rotationX", "N", androidx.exifinterface.media.a.W4, "rotationY", ak.aG, "y", "cameraDistance", "i", ak.aB, "pivotX", "j", "t", "pivotY", "l", RXScreenCaptureService.KEY_WIDTH, "clipToOutline", "alpha", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class h1 implements o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f15906j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int left;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int top;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int right;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int bottom;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.y1 renderEffect;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f15907k = true;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.h1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RenderNodeApi23.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/h1$a;", "", "", "testFailCreateRenderNode", "Z", ak.av, "()Z", "b", "(Z)V", "needToValidateAccess", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final boolean a() {
            return h1.f15906j;
        }

        public final void b(boolean z10) {
            h1.f15906j = z10;
        }
    }

    public h1(@dl.d AndroidComposeView ownerView) {
        kotlin.jvm.internal.f0.p(ownerView, "ownerView");
        this.ownerView = ownerView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", ownerView);
        kotlin.jvm.internal.f0.o(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.renderNode = renderNodeCreate;
        if (f15907k) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            h0(renderNodeCreate);
            a0();
            f15907k = false;
        }
        if (f15906j) {
            throw new NoClassDefFoundError();
        }
    }

    private final void a0() {
        if (Build.VERSION.SDK_INT >= 24) {
            o1.f15937a.a(this.renderNode);
        } else {
            n1.f15936a.a(this.renderNode);
        }
    }

    private final void h0(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            p1 p1Var = p1.f15962a;
            p1Var.c(renderNode, p1Var.a(renderNode));
            p1Var.d(renderNode, p1Var.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.o0
    public void A(float f10) {
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean B(int left, int top, int right, int bottom) {
        e0(left);
        g0(top);
        f0(right);
        d0(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.o0
    public void C(float f10) {
        this.renderNode.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void D() {
        a0();
    }

    @Override // androidx.compose.ui.platform.o0
    /* JADX INFO: renamed from: E, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.o0
    /* JADX INFO: renamed from: F, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.o0
    public float G() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.o0
    public float H() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.o0
    public int I() {
        return Build.VERSION.SDK_INT >= 28 ? p1.f15962a.a(this.renderNode) : androidx.core.view.j1.f21601t;
    }

    @Override // androidx.compose.ui.platform.o0
    /* JADX INFO: renamed from: J, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.o0
    /* JADX INFO: renamed from: K, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.o0
    public void L(@dl.d androidx.compose.ui.graphics.e0 canvasHolder, @dl.e androidx.compose.ui.graphics.l1 l1Var, @dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock) {
        kotlin.jvm.internal.f0.p(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(getWidth(), getHeight());
        kotlin.jvm.internal.f0.o(displayListCanvasStart, "renderNode.start(width, height)");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().K((Canvas) displayListCanvasStart);
        androidx.compose.ui.graphics.b androidCanvas = canvasHolder.getAndroidCanvas();
        if (l1Var != null) {
            androidCanvas.f();
            androidx.compose.ui.graphics.c0.m(androidCanvas, l1Var, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (l1Var != null) {
            androidCanvas.u();
        }
        canvasHolder.getAndroidCanvas().K(internalCanvas);
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.o0
    public int M() {
        return Build.VERSION.SDK_INT >= 28 ? p1.f15962a.b(this.renderNode) : androidx.core.view.j1.f21601t;
    }

    @Override // androidx.compose.ui.platform.o0
    public float N() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.o0
    public float O() {
        return this.renderNode.getRotation();
    }

    @Override // androidx.compose.ui.platform.o0
    public void P(float f10) {
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void Q(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            p1.f15962a.c(this.renderNode, i10);
        }
    }

    @Override // androidx.compose.ui.platform.o0
    public void R(@dl.e androidx.compose.ui.graphics.y1 y1Var) {
        this.renderEffect = y1Var;
    }

    @Override // androidx.compose.ui.platform.o0
    public float S() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.o0
    public void T(float f10) {
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void U(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            p1.f15962a.d(this.renderNode, i10);
        }
    }

    @Override // androidx.compose.ui.platform.o0
    public float V() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.o0
    public float X() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.o0
    public void Z(float f10) {
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public long a() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.o0
    public void b(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.o0
    public float b0() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.o0
    public void c(boolean z10) {
        this.clipToBounds = z10;
        this.renderNode.setClipToBounds(z10);
    }

    @dl.d
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.o0
    public float d() {
        return this.renderNode.getAlpha();
    }

    public void d0(int i10) {
        this.bottom = i10;
    }

    @Override // androidx.compose.ui.platform.o0
    public void e(float f10) {
        this.renderNode.setElevation(f10);
    }

    public void e0(int i10) {
        this.left = i10;
    }

    @Override // androidx.compose.ui.platform.o0
    public void f(float f10) {
        this.renderNode.setAlpha(f10);
    }

    public void f0(int i10) {
        this.right = i10;
    }

    @Override // androidx.compose.ui.platform.o0
    public void g(int i10) {
        g0(getTop() + i10);
        d0(getBottom() + i10);
        this.renderNode.offsetTopAndBottom(i10);
    }

    public void g0(int i10) {
        this.top = i10;
    }

    @Override // androidx.compose.ui.platform.o0
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.o0
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean h() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.o0
    public float i() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.o0
    public float j() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.o0
    @dl.d
    public DeviceRenderNodeData k() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), I(), M(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), getClipToBounds(), this.renderNode.getAlpha(), getRenderEffect());
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean l() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.o0
    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public androidx.compose.ui.graphics.y1 getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean n(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.o0
    public void o(float f10) {
        this.renderNode.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void p(@dl.d Matrix matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.o0
    public void q(int i10) {
        e0(getLeft() + i10);
        f0(getRight() + i10);
        this.renderNode.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.o0
    /* JADX INFO: renamed from: r, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.o0
    public void s(float f10) {
        this.renderNode.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void t(float f10) {
        this.renderNode.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public float u() {
        return -this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.o0
    public void v(@dl.e Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.o0
    public void w(boolean z10) {
        this.renderNode.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void x(@dl.d Matrix matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        this.renderNode.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.o0
    public void y(float f10) {
        this.renderNode.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void z(float f10) {
        this.renderNode.setRotationX(f10);
    }
}
