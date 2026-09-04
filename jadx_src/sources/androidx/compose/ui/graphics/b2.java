package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b[\u0010\\J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0012\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\"\u0010\u0016\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\"\u0010\u0019\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\"\u0010\u001c\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR+\u0010$\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010(\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010,\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\"\u00100\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR\"\u00104\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\nR\"\u00108\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR+\u0010=\u001a\u0002098\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\"\u0010D\u001a\u00020>8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010J\u001a\u00020E8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0015\u001a\u0004\b\u0013\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\b5\u0010N\"\u0004\bO\u0010PR\"\u0010S\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\b\u0005\u0010U\"\u0004\b\u001e\u0010VR\u0014\u0010X\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\bR\u0014\u0010Z\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/ui/graphics/b2;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/b2;", "g", "", "b", "F", androidx.exifinterface.media.a.R4, "()F", "P", "(F)V", "scaleX", ak.aF, "b0", androidx.exifinterface.media.a.f23244d5, "scaleY", "d", "f", "alpha", "e", "H", "Z", "translationX", "G", "o", "translationY", "S0", "r0", "shadowElevation", "Landroidx/compose/ui/graphics/l0;", RXScreenCaptureService.KEY_HEIGHT, "J", "W0", "()J", "c1", "(J)V", "ambientShadowColor", "i", "o0", "f1", "spotShadowColor", "j", "X", ak.aD, "rotationX", "k", "N", androidx.exifinterface.media.a.W4, "rotationY", "l", "O", "C", "rotationZ", "m", ak.aG, "y", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "n", "d1", "q0", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "Landroidx/compose/ui/graphics/g2;", "H0", "()Landroidx/compose/ui/graphics/g2;", "K0", "(Landroidx/compose/ui/graphics/g2;)V", "shape", "", "p", "()Z", "p0", "(Z)V", "clip", "Landroidx/compose/ui/graphics/y1;", "r", "Landroidx/compose/ui/graphics/y1;", "()Landroidx/compose/ui/graphics/y1;", "R", "(Landroidx/compose/ui/graphics/y1;)V", "renderEffect", "Ls1/e;", "graphicsDensity", "Ls1/e;", "()Ls1/e;", "(Ls1/e;)V", "getDensity", "density", "C1", "fontScale", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b2 implements v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private y1 renderEffect;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = w0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = w0.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = o2.INSTANCE.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private g2 shape = x1.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private s1.e f13679q = s1.g.b(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.v0
    public void A(float f10) {
        this.rotationY = f10;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void C(float f10) {
        this.rotationZ = f10;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.f13679q.getF139218c();
    }

    @Override // s1.e
    public /* synthetic */ float E(int i10) {
        return s1.d.e(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ float E1(float f10) {
        return s1.d.h(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ float F(float f10) {
        return s1.d.d(this, f10);
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: G, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: H, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.v0
    @dl.d
    /* JADX INFO: renamed from: H0, reason: from getter */
    public g2 getShape() {
        return this.shape;
    }

    @Override // s1.e
    public /* synthetic */ long J(long j10) {
        return s1.d.j(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ int J1(long j10) {
        return s1.d.a(this, j10);
    }

    @Override // androidx.compose.ui.graphics.v0
    public void K0(@dl.d g2 g2Var) {
        kotlin.jvm.internal.f0.p(g2Var, "<set-?>");
        this.shape = g2Var;
    }

    @Override // s1.e
    public /* synthetic */ long M(float f10) {
        return s1.d.k(this, f10);
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: N, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void P(float f10) {
        this.scaleX = f10;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void R(@dl.e y1 y1Var) {
        this.renderEffect = y1Var;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: S, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: S0, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void T(float f10) {
        this.scaleY = f10;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: W0, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: X, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void Z(float f10) {
        this.translationX = f10;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final s1.e getF13679q() {
        return this.f13679q;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: b0, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void c1(long j10) {
        this.ambientShadowColor = j10;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: d, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: d1, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // s1.e
    public /* synthetic */ int e1(float f10) {
        return s1.d.b(this, f10);
    }

    @Override // androidx.compose.ui.graphics.v0
    public void f(float f10) {
        this.alpha = f10;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void f1(long j10) {
        this.spotShadowColor = j10;
    }

    public final void g() {
        P(1.0f);
        T(1.0f);
        f(1.0f);
        Z(0.0f);
        o(0.0f);
        r0(0.0f);
        c1(w0.b());
        f1(w0.b());
        z(0.0f);
        A(0.0f);
        C(0.0f);
        y(8.0f);
        q0(o2.INSTANCE.a());
        K0(x1.a());
        p0(false);
        R(null);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.f13679q.getF139217b();
    }

    public final void h(@dl.d s1.e eVar) {
        kotlin.jvm.internal.f0.p(eVar, "<set-?>");
        this.f13679q = eVar;
    }

    @Override // s1.e
    public /* synthetic */ b1.i h0(DpRect dpRect) {
        return s1.d.i(this, dpRect);
    }

    @Override // s1.e
    public /* synthetic */ float k1(long j10) {
        return s1.d.g(this, j10);
    }

    @Override // androidx.compose.ui.graphics.v0
    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public y1 getRenderEffect() {
        return this.renderEffect;
    }

    @Override // s1.e
    public /* synthetic */ long n(long j10) {
        return s1.d.f(this, j10);
    }

    @Override // androidx.compose.ui.graphics.v0
    public void o(float f10) {
        this.translationY = f10;
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: o0, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void p0(boolean z10) {
        this.clip = z10;
    }

    @Override // s1.e
    public /* synthetic */ float q(long j10) {
        return s1.d.c(this, j10);
    }

    @Override // androidx.compose.ui.graphics.v0
    public void q0(long j10) {
        this.transformOrigin = j10;
    }

    @Override // s1.e
    public /* synthetic */ long r(int i10) {
        return s1.d.m(this, i10);
    }

    @Override // androidx.compose.ui.graphics.v0
    public void r0(float f10) {
        this.shadowElevation = f10;
    }

    @Override // s1.e
    public /* synthetic */ long s(float f10) {
        return s1.d.l(this, f10);
    }

    @Override // androidx.compose.ui.graphics.v0
    /* JADX INFO: renamed from: u, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void y(float f10) {
        this.cameraDistance = f10;
    }

    @Override // androidx.compose.ui.graphics.v0
    public void z(float f10) {
        this.rotationX = f10;
    }
}
