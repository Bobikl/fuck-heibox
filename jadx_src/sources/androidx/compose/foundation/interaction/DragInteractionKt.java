package androidx.compose.foundation.interaction;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DragInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/interaction/e;", "Landroidx/compose/runtime/m2;", "", ak.av, "(Landroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class DragInteractionKt {
    @dl.d
    @androidx.compose.runtime.h
    public static final m2<Boolean> a(@dl.d e eVar, @dl.e p pVar, int i10) {
        f0.p(eVar, "<this>");
        pVar.T(101276833);
        if (ComposerKt.g0()) {
            ComposerKt.w0(101276833, i10, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:79)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        p.Companion companion = p.INSTANCE;
        if (objU == companion.a()) {
            objU = h2.g(Boolean.FALSE, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        int i11 = i10 & 14;
        pVar.T(511388516);
        boolean zS = pVar.s(eVar) | pVar.s(a1Var);
        Object objU2 = pVar.U();
        if (zS || objU2 == companion.a()) {
            objU2 = new DragInteractionKt$collectIsDraggedAsState$1$1(eVar, a1Var, null);
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.h(eVar, (yh.p) objU2, pVar, i11 | 64);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }
}
