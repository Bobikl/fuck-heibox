package androidx.compose.foundation;

import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.x1;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a&\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/g2;", "shape", ak.aF, "(Landroidx/compose/ui/n;JLandroidx/compose/ui/graphics/g2;)Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/a0;", "brush", "", "alpha", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class BackgroundKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final androidx.compose.ui.graphics.a0 brush, @dl.d final g2 shape, final float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(brush, "brush");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return nVar.s0(new Background(null, brush, f10, shape, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(UiKitSpanObj.TYPE_BACKGROUND);
                x0Var.getProperties().c("alpha", Float.valueOf(f10));
                x0Var.getProperties().c("brush", brush);
                x0Var.getProperties().c("shape", shape);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, androidx.compose.ui.graphics.a0 a0Var, g2 g2Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g2Var = x1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(nVar, a0Var, g2Var, f10);
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n background, final long j10, @dl.d final g2 shape) {
        kotlin.jvm.internal.f0.p(background, "$this$background");
        kotlin.jvm.internal.f0.p(shape, "shape");
        return background.s0(new Background(androidx.compose.ui.graphics.l0.n(j10), null, 0.0f, shape, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(UiKitSpanObj.TYPE_BACKGROUND);
                x0Var.e(androidx.compose.ui.graphics.l0.n(j10));
                x0Var.getProperties().c("color", androidx.compose.ui.graphics.l0.n(j10));
                x0Var.getProperties().c("shape", shape);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), 6, null));
    }

    public static /* synthetic */ androidx.compose.ui.n d(androidx.compose.ui.n nVar, long j10, g2 g2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g2Var = x1.a();
        }
        return c(nVar, j10, g2Var);
    }
}
