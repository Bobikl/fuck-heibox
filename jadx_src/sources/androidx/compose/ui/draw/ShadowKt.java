package androidx.compose.ui.draw;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.v0;
import androidx.compose.ui.graphics.w0;
import androidx.compose.ui.graphics.x1;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.s0;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/n;", "Ls1/h;", "elevation", "Landroidx/compose/ui/graphics/g2;", "shape", "", "clip", ak.aF, "(Landroidx/compose/ui/n;FLandroidx/compose/ui/graphics/g2;Z)Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/l0;", "ambientColor", "spotColor", ak.av, "(Landroidx/compose/ui/n;FLandroidx/compose/ui/graphics/g2;ZJJ)Landroidx/compose/ui/n;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class ShadowKt {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n shadow, final float f10, @dl.d final g2 shape, final boolean z10, final long j10, final long j11) {
        f0.p(shadow, "$this$shadow");
        f0.p(shape, "shape");
        if (s1.h.f(f10, s1.h.g(0)) > 0 || z10) {
            return InspectableValueKt.d(shadow, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d x0 x0Var) {
                    f0.p(x0Var, "$this$null");
                    x0Var.d("shadow");
                    x0Var.getProperties().c("elevation", s1.h.d(f10));
                    x0Var.getProperties().c("shape", shape);
                    x0Var.getProperties().c("clip", Boolean.valueOf(z10));
                    x0Var.getProperties().c("ambientColor", l0.n(j10));
                    x0Var.getProperties().c("spotColor", l0.n(j11));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                    a(x0Var);
                    return b2.f124493a;
                }
            } : InspectableValueKt.b(), GraphicsLayerModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<v0, b2>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d v0 graphicsLayer) {
                    f0.p(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.r0(graphicsLayer.E1(f10));
                    graphicsLayer.K0(shape);
                    graphicsLayer.p0(z10);
                    graphicsLayer.c1(j10);
                    graphicsLayer.f1(j11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(v0 v0Var) {
                    a(v0Var);
                    return b2.f124493a;
                }
            }));
        }
        return shadow;
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, float f10, g2 g2Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        g2 g2VarA = (i10 & 2) != 0 ? x1.a() : g2Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (s1.h.f(f10, s1.h.g(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(nVar, f10, g2VarA, z11, (i10 & 8) != 0 ? w0.b() : j10, (i10 & 16) != 0 ? w0.b() : j11);
    }

    @j2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @s0(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    public static final /* synthetic */ androidx.compose.ui.n c(androidx.compose.ui.n shadow, float f10, g2 shape, boolean z10) {
        f0.p(shadow, "$this$shadow");
        f0.p(shape, "shape");
        return a(shadow, f10, shape, z10, w0.b(), w0.b());
    }

    public static /* synthetic */ androidx.compose.ui.n d(androidx.compose.ui.n nVar, float f10, g2 g2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g2Var = x1.a();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (s1.h.f(f10, s1.h.g(0)) > 0) {
                z10 = true;
            }
        }
        return c(nVar, f10, g2Var, z10);
    }
}
