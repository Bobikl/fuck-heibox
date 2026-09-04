package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Spacer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)V", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class b1 {
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d androidx.compose.ui.n modifier, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        pVar.T(-72882467);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f6152a;
        int i11 = ((i10 << 3) & 112) | bb.c.b.f30966u4;
        pVar.T(-1323940314);
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion.a();
        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(modifier);
        int i12 = ((i11 << 9) & bb.c.g.f32954lc) | 6;
        if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(aVarA);
        } else {
            pVar.d();
        }
        pVar.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar);
        Updater.j(pVarB, spacerMeasurePolicy, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar.x();
        qVarF.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i12 >> 3) & 112));
        pVar.T(2058660585);
        pVar.T(1142320198);
        if (((i12 >> 9) & 14 & 11) == 2 && pVar.b()) {
            pVar.l();
        }
        pVar.c0();
        pVar.c0();
        pVar.f();
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
    }
}
