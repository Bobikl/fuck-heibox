package androidx.compose.foundation;

import androidx.compose.foundation.layout.b1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "Lkotlin/t;", "onDraw", "b", "(Landroidx/compose/ui/n;Lyh/l;Landroidx/compose/runtime/p;I)V", "", "contentDescription", ak.av, "(Landroidx/compose/ui/n;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;I)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class CanvasKt {
    @t
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.n modifier, @dl.d final String contentDescription, @dl.d final yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> onDraw, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        kotlin.jvm.internal.f0.p(contentDescription, "contentDescription");
        kotlin.jvm.internal.f0.p(onDraw, "onDraw");
        androidx.compose.runtime.p pVarF = pVar.F(-1162737955);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(contentDescription) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(onDraw) ? 256 : 128;
        }
        if ((i11 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1162737955, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            androidx.compose.ui.n nVarA = DrawModifierKt.a(modifier, onDraw);
            pVarF.T(1157296644);
            boolean zS = pVarF.s(contentDescription);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.CanvasKt$Canvas$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        SemanticsPropertiesKt.e0(semantics, contentDescription);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            b1.a(SemanticsModifierKt.c(nVarA, false, (yh.l) objU, 1, null), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.CanvasKt$Canvas$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                CanvasKt.a(modifier, contentDescription, onDraw, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final androidx.compose.ui.n modifier, @dl.d final yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> onDraw, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        kotlin.jvm.internal.f0.p(onDraw, "onDraw");
        androidx.compose.runtime.p pVarF = pVar.F(-932836462);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(onDraw) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-932836462, i10, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            b1.a(DrawModifierKt.a(modifier, onDraw), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.CanvasKt$Canvas$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                CanvasKt.b(modifier, onDraw, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
