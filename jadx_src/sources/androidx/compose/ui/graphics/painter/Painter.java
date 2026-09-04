package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.graphics.i;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.unit.LayoutDirection;
import b1.f;
import b1.j;
import b1.m;
import b1.n;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: Painter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\u000f\u001a\u00020\u0006*\u00020\u000eH$J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0014J5\u0010\u0017\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001d\u0010\"\u001a\u00020\u00158&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "Landroidx/compose/ui/graphics/h1;", "j", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "Lkotlin/b2;", "e", "", "alpha", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "rtl", "f", "Landroidx/compose/ui/graphics/drawscope/g;", "k", "", ak.av, "b", "layoutDirection", ak.aF, "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "g", "(Landroidx/compose/ui/graphics/drawscope/g;JFLandroidx/compose/ui/graphics/m0;)V", "Landroidx/compose/ui/graphics/h1;", "layerPaint", "Z", "useLayer", "Landroidx/compose/ui/graphics/m0;", "F", "Landroidx/compose/ui/unit/LayoutDirection;", "i", "()J", "intrinsicSize", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class Painter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @e
    private h1 layerPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean useLayer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private m0 colorFilter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final l<g, b2> f13940f = new l<g, b2>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        public final void a(@dl.d g gVar) {
            f0.p(gVar, "$this$null");
            this.f13941b.k(gVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(g gVar) {
            a(gVar);
            return b2.f124493a;
        }
    };

    private final void d(float f10) {
        if (this.alpha == f10) {
            return;
        }
        if (!a(f10)) {
            if (f10 == 1.0f) {
                h1 h1Var = this.layerPaint;
                if (h1Var != null) {
                    h1Var.f(f10);
                }
                this.useLayer = false;
            } else {
                j().f(f10);
                this.useLayer = true;
            }
        }
        this.alpha = f10;
    }

    private final void e(m0 m0Var) {
        if (f0.g(this.colorFilter, m0Var)) {
            return;
        }
        if (!b(m0Var)) {
            if (m0Var == null) {
                h1 h1Var = this.layerPaint;
                if (h1Var != null) {
                    h1Var.z(null);
                }
                this.useLayer = false;
            } else {
                j().z(m0Var);
                this.useLayer = true;
            }
        }
        this.colorFilter = m0Var;
    }

    private final void f(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            c(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    public static /* synthetic */ void h(Painter painter, g gVar, long j10, float f10, m0 m0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            m0Var = null;
        }
        painter.g(gVar, j10, f11, m0Var);
    }

    private final h1 j() {
        h1 h1Var = this.layerPaint;
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1VarA = i.a();
        this.layerPaint = h1VarA;
        return h1VarA;
    }

    protected boolean a(float alpha) {
        return false;
    }

    protected boolean b(@e m0 colorFilter) {
        return false;
    }

    protected boolean c(@dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "layoutDirection");
        return false;
    }

    public final void g(@dl.d g draw, long j10, float f10, @e m0 m0Var) {
        f0.p(draw, "$this$draw");
        d(f10);
        e(m0Var);
        f(draw.getLayoutDirection());
        float fT = m.t(draw.c()) - m.t(j10);
        float fM = m.m(draw.c()) - m.m(j10);
        draw.getDrawContext().getTransform().h(0.0f, 0.0f, fT, fM);
        if (f10 > 0.0f && m.t(j10) > 0.0f && m.m(j10) > 0.0f) {
            if (this.useLayer) {
                b1.i iVarC = j.c(f.f30364b.e(), n.a(m.t(j10), m.m(j10)));
                d0 d0VarA = draw.getDrawContext().a();
                try {
                    d0VarA.l(iVarC, j());
                    k(draw);
                    d0VarA.u();
                } catch (Throwable th2) {
                    d0VarA.u();
                    throw th2;
                }
            } else {
                k(draw);
            }
        }
        draw.getDrawContext().getTransform().h(-0.0f, -0.0f, -fT, -fM);
    }

    public abstract long i();

    protected abstract void k(@dl.d g gVar);
}
