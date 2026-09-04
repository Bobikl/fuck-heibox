package androidx.compose.ui.draw;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.m2;
import androidx.compose.ui.graphics.v0;
import androidx.compose.ui.graphics.x1;
import androidx.compose.ui.graphics.z1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/n;", "Ls1/h;", "radiusX", "radiusY", "Landroidx/compose/ui/draw/b;", "edgeTreatment", ak.av, "(Landroidx/compose/ui/n;FFLandroidx/compose/ui/graphics/g2;)Landroidx/compose/ui/n;", "radius", ak.aF, "(Landroidx/compose/ui/n;FLandroidx/compose/ui/graphics/g2;)Landroidx/compose/ui/n;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class BlurKt {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n blur, final float f10, final float f11, @dl.d final g2 g2Var) {
        int iB;
        final boolean z10;
        f0.p(blur, "$this$blur");
        if (g2Var != null) {
            iB = m2.INSTANCE.a();
            z10 = true;
        } else {
            iB = m2.INSTANCE.b();
            z10 = false;
        }
        final int i10 = iB;
        float f12 = 0;
        return ((s1.h.f(f10, s1.h.g(f12)) <= 0 || s1.h.f(f11, s1.h.g(f12)) <= 0) && !z10) ? blur : GraphicsLayerModifierKt.a(blur, new yh.l<v0, b2>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d v0 graphicsLayer) {
                f0.p(graphicsLayer, "$this$graphicsLayer");
                float fE1 = graphicsLayer.E1(f10);
                float fE2 = graphicsLayer.E1(f11);
                graphicsLayer.R((fE1 <= 0.0f || fE2 <= 0.0f) ? null : z1.a(fE1, fE2, i10));
                g2 g2VarA = g2Var;
                if (g2VarA == null) {
                    g2VarA = x1.a();
                }
                graphicsLayer.K0(g2VarA);
                graphicsLayer.p0(z10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(v0 v0Var) {
                a(v0Var);
                return b2.f124493a;
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, float f10, float f11, b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = b.c(b.INSTANCE.a());
        }
        return a(nVar, f10, f11, bVar.j());
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n blur, float f10, @dl.d g2 g2Var) {
        f0.p(blur, "$this$blur");
        return a(blur, f10, f10, g2Var);
    }

    public static /* synthetic */ androidx.compose.ui.n d(androidx.compose.ui.n nVar, float f10, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = b.c(b.INSTANCE.a());
        }
        return c(nVar, f10, bVar.j());
    }
}
