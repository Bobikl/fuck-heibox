package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/c;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/m0;", "colorFilter", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class PainterModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final Painter painter, final boolean z10, @dl.d final androidx.compose.ui.c alignment, @dl.d final androidx.compose.ui.layout.c contentScale, final float f10, @dl.e final m0 m0Var) {
        f0.p(nVar, "<this>");
        f0.p(painter, "painter");
        f0.p(alignment, "alignment");
        f0.p(contentScale, "contentScale");
        return nVar.s0(new PainterModifier(painter, z10, alignment, contentScale, f10, m0Var, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("paint");
                x0Var.getProperties().c("painter", painter);
                x0Var.getProperties().c("sizeToIntrinsics", Boolean.valueOf(z10));
                x0Var.getProperties().c("alignment", alignment);
                x0Var.getProperties().c("contentScale", contentScale);
                x0Var.getProperties().c("alpha", Float.valueOf(f10));
                x0Var.getProperties().c("colorFilter", m0Var);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, Painter painter, boolean z10, androidx.compose.ui.c cVar, androidx.compose.ui.layout.c cVar2, float f10, m0 m0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.i();
        }
        androidx.compose.ui.c cVar3 = cVar;
        if ((i10 & 8) != 0) {
            cVar2 = androidx.compose.ui.layout.c.INSTANCE.k();
        }
        androidx.compose.ui.layout.c cVar4 = cVar2;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            m0Var = null;
        }
        return a(nVar, painter, z11, cVar3, cVar4, f11, m0Var);
    }
}
