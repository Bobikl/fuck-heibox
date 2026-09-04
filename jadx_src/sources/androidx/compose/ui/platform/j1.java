package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b?\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020$¢\u0006\u0004\bz\u0010{J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u00102R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00105R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0014\u0010\n\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00105R\u0014\u0010:\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010<\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00105R$\u0010C\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010F\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR$\u0010I\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR$\u0010L\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR$\u0010O\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR$\u0010S\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u00105\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u00105\"\u0004\bU\u0010RR$\u0010Y\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010@\"\u0004\bX\u0010BR$\u0010\\\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010@\"\u0004\b[\u0010BR$\u0010_\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010@\"\u0004\b^\u0010BR$\u0010b\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010@\"\u0004\ba\u0010BR$\u0010e\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010@\"\u0004\bd\u0010BR$\u0010h\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010@\"\u0004\bg\u0010BR$\u0010m\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010o\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010j\"\u0004\b.\u0010lR$\u0010r\u001a\u00020=2\u0006\u0010>\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bp\u0010@\"\u0004\bq\u0010BR(\u0010w\u001a\u0004\u0018\u00010-2\b\u0010>\u001a\u0004\u0018\u00010-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010j¨\u0006|"}, d2 = {"Landroidx/compose/ui/platform/j1;", "Landroidx/compose/ui/platform/o0;", "Landroid/graphics/Outline;", "outline", "Lkotlin/b2;", "v", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "", "B", androidx.constraintlayout.core.motion.utils.w.c.R, "q", "g", "Landroidx/compose/ui/graphics/e0;", "canvasHolder", "Landroidx/compose/ui/graphics/l1;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "drawBlock", "L", "Landroid/graphics/Matrix;", "matrix", "p", "x", "Landroid/graphics/Canvas;", "canvas", "b", "hasOverlappingRendering", "n", "Landroidx/compose/ui/platform/p0;", "k", "D", "Landroidx/compose/ui/platform/AndroidComposeView;", ak.av, "Landroidx/compose/ui/platform/AndroidComposeView;", androidx.exifinterface.media.a.T4, "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroid/graphics/RenderNode;", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/y1;", ak.aF, "Landroidx/compose/ui/graphics/y1;", "internalRenderEffect", "", "()J", "uniqueId", "F", "()I", "K", androidx.exifinterface.media.a.S4, "r", "getWidth", "width", "getHeight", "height", "", "value", androidx.exifinterface.media.a.R4, "()F", "P", "(F)V", "scaleX", "b0", androidx.exifinterface.media.a.f23244d5, "scaleY", "H", "Z", "translationX", "G", "o", "translationY", androidx.exifinterface.media.a.X4, "e", "elevation", "I", "Q", "(I)V", "ambientShadowColor", "M", "U", "spotShadowColor", "O", "C", "rotationZ", "X", ak.aD, "rotationX", "N", androidx.exifinterface.media.a.W4, "rotationY", ak.aG, "y", "cameraDistance", "i", ak.aB, "pivotX", "j", "t", "pivotY", "l", "()Z", RXScreenCaptureService.KEY_WIDTH, "(Z)V", "clipToOutline", "J", "clipToBounds", "d", "f", "alpha", "m", "()Landroidx/compose/ui/graphics/y1;", "R", "(Landroidx/compose/ui/graphics/y1;)V", "renderEffect", RXScreenCaptureService.KEY_HEIGHT, "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class j1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.y1 internalRenderEffect;

    public j1(@dl.d AndroidComposeView ownerView) {
        kotlin.jvm.internal.f0.p(ownerView, "ownerView");
        this.ownerView = ownerView;
        this.renderNode = new RenderNode("Compose");
    }

    @Override // androidx.compose.ui.platform.o0
    public void A(float f10) {
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean B(int left, int top, int right, int bottom) {
        return this.renderNode.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.o0
    public void C(float f10) {
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void D() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.o0
    public int E() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.o0
    public int F() {
        return this.renderNode.getLeft();
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
        return this.renderNode.getAmbientShadowColor();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean J() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.o0
    public int K() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.o0
    public void L(@dl.d androidx.compose.ui.graphics.e0 canvasHolder, @dl.e androidx.compose.ui.graphics.l1 l1Var, @dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock) {
        kotlin.jvm.internal.f0.p(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        kotlin.jvm.internal.f0.o(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().K(recordingCanvasBeginRecording);
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
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.o0
    public int M() {
        return this.renderNode.getSpotShadowColor();
    }

    @Override // androidx.compose.ui.platform.o0
    public float N() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.o0
    public float O() {
        return this.renderNode.getRotationZ();
    }

    @Override // androidx.compose.ui.platform.o0
    public void P(float f10) {
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void Q(int i10) {
        this.renderNode.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void R(@dl.e androidx.compose.ui.graphics.y1 y1Var) {
        this.internalRenderEffect = y1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            l1.f15926a.a(this.renderNode, y1Var);
        }
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
        this.renderNode.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.o0
    public float V() {
        return this.renderNode.getElevation();
    }

    @dl.d
    /* JADX INFO: renamed from: W, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
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
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.platform.o0
    public void b(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.o0
    public float b0() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.o0
    public void c(boolean z10) {
        this.renderNode.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.o0
    public float d() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.o0
    public void e(float f10) {
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void f(float f10) {
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void g(int i10) {
        this.renderNode.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.o0
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.o0
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean h() {
        return this.renderNode.hasDisplayList();
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
        return new DeviceRenderNodeData(this.renderNode.getUniqueId(), this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getRight(), this.renderNode.getBottom(), this.renderNode.getWidth(), this.renderNode.getHeight(), this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getAmbientShadowColor(), this.renderNode.getSpotShadowColor(), this.renderNode.getRotationZ(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.renderNode.getClipToBounds(), this.renderNode.getAlpha(), this.internalRenderEffect);
    }

    @Override // androidx.compose.ui.platform.o0
    public boolean l() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.o0
    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public androidx.compose.ui.graphics.y1 getInternalRenderEffect() {
        return this.internalRenderEffect;
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
        this.renderNode.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.o0
    public int r() {
        return this.renderNode.getBottom();
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
        return this.renderNode.getCameraDistance();
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
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.o0
    public void z(float f10) {
        this.renderNode.setRotationX(f10);
    }
}
