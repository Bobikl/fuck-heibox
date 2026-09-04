package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u001b\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u001b\u0010&\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001f\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00101R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u00109\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00108R\u001f\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b:\u00100R\u001f\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b<\u00100R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010)R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00102R\u0018\u0010E\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0013\u0010K\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010JR\u0011\u0010M\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b/\u0010LR\u0013\u0010O\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b(\u0010N\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/ui/platform/g1;", "", "Lkotlin/b2;", "i", "Lb1/i;", "rect", "k", "Lb1/k;", "roundRect", "l", "Landroidx/compose/ui/graphics/l1;", "composePath", "j", "Lb1/f;", androidx.constraintlayout.core.motion.utils.w.c.R, "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "", "radius", "", "f", "(Lb1/k;JJF)Z", "Landroidx/compose/ui/graphics/g2;", "shape", "alpha", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "g", CommonNetImpl.POSITION, "e", "(J)Z", "Landroidx/compose/ui/graphics/d0;", "canvas", ak.av, RXScreenCaptureService.KEY_HEIGHT, "(J)V", "b", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", ak.aF, "Landroid/graphics/Outline;", "cachedOutline", "d", "J", "Landroidx/compose/ui/graphics/g2;", "Landroidx/compose/ui/graphics/l1;", "cachedRrectPath", "outlinePath", "cacheIsDirty", "usePathForClip", "tmpPath", "F", "roundedCornerRadius", "m", "rectTopLeft", "n", "rectSize", "o", "outlineNeeded", "p", "Landroidx/compose/ui/unit/LayoutDirection;", "q", "tmpTouchPointPath", "r", "tmpOpPath", "Landroidx/compose/ui/graphics/f1;", ak.aB, "Landroidx/compose/ui/graphics/f1;", "calculatedOutline", "()Landroid/graphics/Outline;", "outline", "()Z", "outlineClipSupported", "()Landroidx/compose/ui/graphics/l1;", "clipPath", "<init>", "(Ls1/e;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private s1.e f15857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isSupportedOutline;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Outline cachedOutline;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.graphics.g2 shape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.l1 cachedRrectPath;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.l1 outlinePath;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean cacheIsDirty;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.l1 tmpPath;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private b1.k f15867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float roundedCornerRadius;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long rectTopLeft;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long rectSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean outlineNeeded;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.l1 tmpTouchPointPath;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.l1 tmpOpPath;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.graphics.f1 calculatedOutline;

    public g1(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        this.f15857a = density;
        this.isSupportedOutline = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        b1.m.a aVar = b1.m.f30386b;
        this.size = aVar.c();
        this.shape = androidx.compose.ui.graphics.x1.a();
        this.rectTopLeft = b1.f.f30364b.e();
        this.rectSize = aVar.c();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    private final boolean f(b1.k kVar, long j10, long j11, float f10) {
        if (kVar == null || !b1.l.q(kVar)) {
            return false;
        }
        if (!(kVar.q() == b1.f.p(j10))) {
            return false;
        }
        if (!(kVar.s() == b1.f.r(j10))) {
            return false;
        }
        if (!(kVar.r() == b1.f.p(j10) + b1.m.t(j11))) {
            return false;
        }
        if (kVar.m() == b1.f.r(j10) + b1.m.m(j11)) {
            return (b1.a.m(kVar.t()) > f10 ? 1 : (b1.a.m(kVar.t()) == f10 ? 0 : -1)) == 0;
        }
        return false;
    }

    private final void i() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = b1.f.f30364b.e();
            long j10 = this.size;
            this.rectSize = j10;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || b1.m.t(j10) <= 0.0f || b1.m.m(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.ui.graphics.f1 f1VarA = this.shape.a(this.size, this.layoutDirection, this.f15857a);
            this.calculatedOutline = f1VarA;
            if (f1VarA instanceof androidx.compose.ui.graphics.f1.b) {
                k(((androidx.compose.ui.graphics.f1.b) f1VarA).b());
            } else if (f1VarA instanceof androidx.compose.ui.graphics.f1.c) {
                l(((androidx.compose.ui.graphics.f1.c) f1VarA).getF13848a());
            } else if (f1VarA instanceof androidx.compose.ui.graphics.f1.a) {
                j(((androidx.compose.ui.graphics.f1.a) f1VarA).getPath());
            }
        }
    }

    private final void j(androidx.compose.ui.graphics.l1 l1Var) {
        if (Build.VERSION.SDK_INT > 28 || l1Var.j()) {
            Outline outline = this.cachedOutline;
            if (!(l1Var instanceof androidx.compose.ui.graphics.j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((androidx.compose.ui.graphics.j) l1Var).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = l1Var;
    }

    private final void k(b1.i iVar) {
        this.rectTopLeft = b1.g.a(iVar.t(), iVar.getF30372b());
        this.rectSize = b1.n.a(iVar.G(), iVar.r());
        this.cachedOutline.setRect(di.d.L0(iVar.t()), di.d.L0(iVar.getF30372b()), di.d.L0(iVar.x()), di.d.L0(iVar.j()));
    }

    private final void l(b1.k kVar) {
        float fM = b1.a.m(kVar.t());
        this.rectTopLeft = b1.g.a(kVar.q(), kVar.s());
        this.rectSize = b1.n.a(kVar.v(), kVar.p());
        if (b1.l.q(kVar)) {
            this.cachedOutline.setRoundRect(di.d.L0(kVar.q()), di.d.L0(kVar.s()), di.d.L0(kVar.r()), di.d.L0(kVar.m()), fM);
            this.roundedCornerRadius = fM;
            return;
        }
        androidx.compose.ui.graphics.l1 l1VarA = this.cachedRrectPath;
        if (l1VarA == null) {
            l1VarA = androidx.compose.ui.graphics.o.a();
            this.cachedRrectPath = l1VarA;
        }
        l1VarA.reset();
        l1VarA.p(kVar);
        j(l1VarA);
    }

    public final void a(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        androidx.compose.ui.graphics.l1 l1VarB = b();
        if (l1VarB != null) {
            androidx.compose.ui.graphics.c0.m(canvas, l1VarB, 0, 2, null);
            return;
        }
        float f10 = this.roundedCornerRadius;
        if (f10 <= 0.0f) {
            androidx.compose.ui.graphics.c0.n(canvas, b1.f.p(this.rectTopLeft), b1.f.r(this.rectTopLeft), b1.f.p(this.rectTopLeft) + b1.m.t(this.rectSize), b1.f.r(this.rectTopLeft) + b1.m.m(this.rectSize), 0, 16, null);
            return;
        }
        androidx.compose.ui.graphics.l1 l1VarA = this.tmpPath;
        b1.k kVar = this.f15867k;
        if (l1VarA == null || !f(kVar, this.rectTopLeft, this.rectSize, f10)) {
            b1.k kVarE = b1.l.e(b1.f.p(this.rectTopLeft), b1.f.r(this.rectTopLeft), b1.f.p(this.rectTopLeft) + b1.m.t(this.rectSize), b1.f.r(this.rectTopLeft) + b1.m.m(this.rectSize), b1.b.b(this.roundedCornerRadius, 0.0f, 2, null));
            if (l1VarA == null) {
                l1VarA = androidx.compose.ui.graphics.o.a();
            } else {
                l1VarA.reset();
            }
            l1VarA.p(kVarE);
            this.f15867k = kVarE;
            this.tmpPath = l1VarA;
        }
        androidx.compose.ui.graphics.c0.m(canvas, l1VarA, 0, 2, null);
    }

    @dl.e
    public final androidx.compose.ui.graphics.l1 b() {
        i();
        return this.outlinePath;
    }

    @dl.e
    public final Outline c() {
        i();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean d() {
        return !this.usePathForClip;
    }

    public final boolean e(long position) {
        androidx.compose.ui.graphics.f1 f1Var;
        if (this.outlineNeeded && (f1Var = this.calculatedOutline) != null) {
            return s1.b(f1Var, b1.f.p(position), b1.f.r(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean g(@dl.d androidx.compose.ui.graphics.g2 shape, float alpha, boolean clipToOutline, float elevation, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(shape, "shape");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.f0.p(density, "density");
        this.cachedOutline.setAlpha(alpha);
        boolean z10 = !kotlin.jvm.internal.f0.g(this.shape, shape);
        if (z10) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z11 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z11) {
            this.outlineNeeded = z11;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!kotlin.jvm.internal.f0.g(this.f15857a, density)) {
            this.f15857a = density;
            this.cacheIsDirty = true;
        }
        return z10;
    }

    public final void h(long size) {
        if (b1.m.k(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }
}
