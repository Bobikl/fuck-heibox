package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.graphics.z0;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.f, reason: from toString */
/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b+\u0010,J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÂ\u0003JF\u0010\u0014\u001a\u00020\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\bJ9\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/foundation/f;", "", "Landroidx/compose/ui/graphics/y0;", "g", "Landroidx/compose/ui/graphics/d0;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/drawscope/a;", "i", "Landroidx/compose/ui/graphics/l1;", "j", "Landroidx/compose/ui/draw/CacheDrawScope;", "Ls1/r;", "borderSize", "Landroidx/compose/ui/graphics/z0;", "config", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "Lkotlin/t;", "block", "m", "(Landroidx/compose/ui/draw/CacheDrawScope;JILyh/l;)Landroidx/compose/ui/graphics/y0;", "n", "imageBitmap", "canvas", "canvasDrawScope", "borderPath", "k", "", "toString", "", "hashCode", "other", "", "equals", ak.av, "Landroidx/compose/ui/graphics/y0;", "b", "Landroidx/compose/ui/graphics/d0;", ak.aF, "Landroidx/compose/ui/graphics/drawscope/a;", "d", "Landroidx/compose/ui/graphics/l1;", "<init>", "(Landroidx/compose/ui/graphics/y0;Landroidx/compose/ui/graphics/d0;Landroidx/compose/ui/graphics/drawscope/a;Landroidx/compose/ui/graphics/l1;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BorderCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private y0 imageBitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private androidx.compose.ui.graphics.d0 canvas;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private l1 borderPath;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    public BorderCache(@dl.e y0 y0Var, @dl.e androidx.compose.ui.graphics.d0 d0Var, @dl.e androidx.compose.ui.graphics.drawscope.a aVar, @dl.e l1 l1Var) {
        this.imageBitmap = y0Var;
        this.canvas = d0Var;
        this.canvasDrawScope = aVar;
        this.borderPath = l1Var;
    }

    public /* synthetic */ BorderCache(y0 y0Var, androidx.compose.ui.graphics.d0 d0Var, androidx.compose.ui.graphics.drawscope.a aVar, l1 l1Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : y0Var, (i10 & 2) != 0 ? null : d0Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : l1Var);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    private final y0 getImageBitmap() {
        return this.imageBitmap;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    private final androidx.compose.ui.graphics.d0 getCanvas() {
        return this.canvas;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    private final androidx.compose.ui.graphics.drawscope.a getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    private final l1 getBorderPath() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache l(BorderCache borderCache, y0 y0Var, androidx.compose.ui.graphics.d0 d0Var, androidx.compose.ui.graphics.drawscope.a aVar, l1 l1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = borderCache.imageBitmap;
        }
        if ((i10 & 2) != 0) {
            d0Var = borderCache.canvas;
        }
        if ((i10 & 4) != 0) {
            aVar = borderCache.canvasDrawScope;
        }
        if ((i10 & 8) != 0) {
            l1Var = borderCache.borderPath;
        }
        return borderCache.k(y0Var, d0Var, aVar, l1Var);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) other;
        return kotlin.jvm.internal.f0.g(this.imageBitmap, borderCache.imageBitmap) && kotlin.jvm.internal.f0.g(this.canvas, borderCache.canvas) && kotlin.jvm.internal.f0.g(this.canvasDrawScope, borderCache.canvasDrawScope) && kotlin.jvm.internal.f0.g(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        y0 y0Var = this.imageBitmap;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        androidx.compose.ui.graphics.d0 d0Var = this.canvas;
        int iHashCode2 = (iHashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l1 l1Var = this.borderPath;
        return iHashCode3 + (l1Var != null ? l1Var.hashCode() : 0);
    }

    @dl.d
    public final BorderCache k(@dl.e y0 imageBitmap, @dl.e androidx.compose.ui.graphics.d0 canvas, @dl.e androidx.compose.ui.graphics.drawscope.a canvasDrawScope, @dl.e l1 borderPath) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, borderPath);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    @dl.d
    public final y0 m(@dl.d CacheDrawScope drawBorderCache, long j10, int i10, @dl.d yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> block) {
        androidx.compose.ui.graphics.drawscope.a aVar;
        kotlin.jvm.internal.f0.p(drawBorderCache, "$this$drawBorderCache");
        kotlin.jvm.internal.f0.p(block, "block");
        y0 y0VarB = this.imageBitmap;
        androidx.compose.ui.graphics.d0 d0VarA = this.canvas;
        z0 z0VarF = y0VarB != null ? z0.f(y0VarB.d()) : null;
        boolean z10 = false;
        if (!(z0VarF == null ? false : z0.i(z0VarF.m(), z0.INSTANCE.b()))) {
            if (z0.h(i10, y0VarB != null ? z0.f(y0VarB.d()) : null)) {
            }
            if (y0VarB != null || d0VarA == null || b1.m.t(drawBorderCache.c()) > y0VarB.getWidth() || b1.m.m(drawBorderCache.c()) > y0VarB.getHeight() || !z10) {
                y0VarB = a1.b(s1.r.m(j10), s1.r.j(j10), i10, false, null, 24, null);
                this.imageBitmap = y0VarB;
                d0VarA = androidx.compose.ui.graphics.f0.a(y0VarB);
                this.canvas = d0VarA;
            }
            aVar = this.canvasDrawScope;
            if (aVar == null) {
                aVar = new androidx.compose.ui.graphics.drawscope.a();
                this.canvasDrawScope = aVar;
            }
            long jF = s1.s.f(j10);
            LayoutDirection layoutDirection = drawBorderCache.getLayoutDirection();
            androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams = aVar.getDrawParams();
            s1.e density = drawParams.getDensity();
            LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
            androidx.compose.ui.graphics.d0 canvas = drawParams.getCanvas();
            long size = drawParams.getSize();
            androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams2 = aVar.getDrawParams();
            drawParams2.l(drawBorderCache);
            drawParams2.m(layoutDirection);
            drawParams2.k(d0VarA);
            drawParams2.n(jF);
            d0VarA.f();
            androidx.compose.ui.graphics.drawscope.f.K(aVar, androidx.compose.ui.graphics.l0.INSTANCE.a(), 0L, jF, 0.0f, null, null, androidx.compose.ui.graphics.x.INSTANCE.a(), 58, null);
            block.invoke(aVar);
            d0VarA.u();
            androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams3 = aVar.getDrawParams();
            drawParams3.l(density);
            drawParams3.m(layoutDirection2);
            drawParams3.k(canvas);
            drawParams3.n(size);
            y0VarB.b();
            return y0VarB;
        }
        z10 = true;
        if (y0VarB != null) {
            y0VarB = a1.b(s1.r.m(j10), s1.r.j(j10), i10, false, null, 24, null);
            this.imageBitmap = y0VarB;
            d0VarA = androidx.compose.ui.graphics.f0.a(y0VarB);
            this.canvas = d0VarA;
        } else {
            y0VarB = a1.b(s1.r.m(j10), s1.r.j(j10), i10, false, null, 24, null);
            this.imageBitmap = y0VarB;
            d0VarA = androidx.compose.ui.graphics.f0.a(y0VarB);
            this.canvas = d0VarA;
        }
        aVar = this.canvasDrawScope;
        if (aVar == null) {
            aVar = new androidx.compose.ui.graphics.drawscope.a();
            this.canvasDrawScope = aVar;
        }
        long jF2 = s1.s.f(j10);
        LayoutDirection layoutDirection3 = drawBorderCache.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams4 = aVar.getDrawParams();
        s1.e density2 = drawParams4.getDensity();
        LayoutDirection layoutDirection4 = drawParams4.getLayoutDirection();
        androidx.compose.ui.graphics.d0 canvas2 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams5 = aVar.getDrawParams();
        drawParams5.l(drawBorderCache);
        drawParams5.m(layoutDirection3);
        drawParams5.k(d0VarA);
        drawParams5.n(jF2);
        d0VarA.f();
        androidx.compose.ui.graphics.drawscope.f.K(aVar, androidx.compose.ui.graphics.l0.INSTANCE.a(), 0L, jF2, 0.0f, null, null, androidx.compose.ui.graphics.x.INSTANCE.a(), 58, null);
        block.invoke(aVar);
        d0VarA.u();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams6 = aVar.getDrawParams();
        drawParams6.l(density2);
        drawParams6.m(layoutDirection4);
        drawParams6.k(canvas2);
        drawParams6.n(size2);
        y0VarB.b();
        return y0VarB;
    }

    @dl.d
    public final l1 n() {
        l1 l1Var = this.borderPath;
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarA = androidx.compose.ui.graphics.o.a();
        this.borderPath = l1VarA;
        return l1VarA;
    }

    @dl.d
    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }
}
