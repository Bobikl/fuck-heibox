package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.x;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.r0;

/* JADX INFO: compiled from: DrawCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010\u001dJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002JD\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013R*\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001f\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/vector/a;", "", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", ak.av, "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/t;", "block", "b", "(JLs1/e;Landroidx/compose/ui/unit/LayoutDirection;Lyh/l;)V", "target", "", "alpha", "Landroidx/compose/ui/graphics/m0;", "colorFilter", ak.aF, "Landroidx/compose/ui/graphics/y0;", "Landroidx/compose/ui/graphics/y0;", "e", "()Landroidx/compose/ui/graphics/y0;", "g", "(Landroidx/compose/ui/graphics/y0;)V", "getMCachedImage$annotations", "()V", "mCachedImage", "Landroidx/compose/ui/graphics/d0;", "Landroidx/compose/ui/graphics/d0;", "cachedCanvas", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "J", "Landroidx/compose/ui/graphics/drawscope/a;", "f", "Landroidx/compose/ui/graphics/drawscope/a;", "cacheScope", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private y0 mCachedImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private d0 cachedCanvas;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private s1.e f14135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long size = s1.r.f139246b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.drawscope.a cacheScope = new androidx.compose.ui.graphics.drawscope.a();

    private final void a(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.f.K(gVar, l0.INSTANCE.a(), 0L, 0L, 0.0f, null, null, x.INSTANCE.a(), 62, null);
    }

    public static /* synthetic */ void d(a aVar, androidx.compose.ui.graphics.drawscope.g gVar, float f10, m0 m0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            m0Var = null;
        }
        aVar.c(gVar, f10, m0Var);
    }

    @r0
    public static /* synthetic */ void f() {
    }

    public final void b(long size, @dl.d s1.e density, @dl.d LayoutDirection layoutDirection, @dl.d yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> block) {
        f0.p(density, "density");
        f0.p(layoutDirection, "layoutDirection");
        f0.p(block, "block");
        this.f14135c = density;
        this.layoutDirection = layoutDirection;
        y0 y0VarB = this.mCachedImage;
        d0 d0VarA = this.cachedCanvas;
        if (y0VarB == null || d0VarA == null || s1.r.m(size) > y0VarB.getWidth() || s1.r.j(size) > y0VarB.getHeight()) {
            y0VarB = a1.b(s1.r.m(size), s1.r.j(size), 0, false, null, 28, null);
            d0VarA = androidx.compose.ui.graphics.f0.a(y0VarB);
            this.mCachedImage = y0VarB;
            this.cachedCanvas = d0VarA;
        }
        this.size = size;
        androidx.compose.ui.graphics.drawscope.a aVar = this.cacheScope;
        long jF = s1.s.f(size);
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams = aVar.getDrawParams();
        s1.e density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        d0 canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.l(density);
        drawParams2.m(layoutDirection);
        drawParams2.k(d0VarA);
        drawParams2.n(jF);
        d0VarA.f();
        a(aVar);
        block.invoke(aVar);
        d0VarA.u();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.l(density2);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas);
        drawParams3.n(size2);
        y0VarB.b();
    }

    public final void c(@dl.d androidx.compose.ui.graphics.drawscope.g target, float f10, @dl.e m0 m0Var) {
        f0.p(target, "target");
        y0 y0Var = this.mCachedImage;
        if (!(y0Var != null)) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        androidx.compose.ui.graphics.drawscope.f.z(target, y0Var, 0L, this.size, 0L, 0L, f10, null, m0Var, 0, 0, bb.c.b.Ad, null);
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final y0 getMCachedImage() {
        return this.mCachedImage;
    }

    public final void g(@dl.e y0 y0Var) {
        this.mCachedImage = y0Var;
    }
}
