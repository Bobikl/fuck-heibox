package androidx.compose.foundation.relocation;

import androidx.compose.foundation.t;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import b1.i;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/relocation/f;", "responder", ak.aF, "Landroidx/compose/ui/layout/q;", "sourceCoordinates", "Lb1/i;", "rect", "e", "other", "", "d", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class BringIntoViewResponderKt {
    @t
    @dl.d
    public static final n c(@dl.d n nVar, @dl.d final f responder) {
        f0.p(nVar, "<this>");
        f0.p(responder, "responder");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderKt$bringIntoViewResponder$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("bringIntoViewResponder");
                x0Var.getProperties().c("responder", responder);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<n, p, Integer, n>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderKt$bringIntoViewResponder$2
            {
                super(3);
            }

            @dl.d
            @h
            public final n a(@dl.d n composed, @dl.e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-852052847);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-852052847, i10, -1, "androidx.compose.foundation.relocation.bringIntoViewResponder.<anonymous> (BringIntoViewResponder.kt:110)");
                }
                c cVarB = g.b(pVar, 0);
                pVar.T(1157296644);
                boolean zS = pVar.s(cVarB);
                Object objU = pVar.U();
                if (zS || objU == p.INSTANCE.a()) {
                    objU = new BringIntoViewResponderModifier(cVarB);
                    pVar.N(objU);
                }
                pVar.c0();
                BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) objU;
                bringIntoViewResponderModifier.s(responder);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return bringIntoViewResponderModifier;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ n invoke(n nVar2, p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(i iVar, i iVar2) {
        return iVar.t() <= iVar2.t() && iVar.getF30372b() <= iVar2.getF30372b() && iVar.x() >= iVar2.x() && iVar.j() >= iVar2.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i e(androidx.compose.ui.layout.q qVar, androidx.compose.ui.layout.q qVar2, i iVar) {
        return iVar.S(qVar.x(qVar2, false).E());
    }
}
