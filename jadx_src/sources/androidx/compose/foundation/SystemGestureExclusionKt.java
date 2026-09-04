package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.annotation.w0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u001a(\u0010\u0007\u001a\u00020\u00002\u0016\b\b\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0083\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/n;", "b", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/q;", "Lb1/i;", "exclusion", ak.aF, ak.av, "(Lyh/l;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SystemGestureExclusionKt {
    @w0(29)
    @androidx.compose.runtime.h
    private static final androidx.compose.ui.n a(yh.l<? super androidx.compose.ui.layout.q, b1.i> lVar, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1687674107);
        View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
        pVar.T(511388516);
        boolean zS = pVar.s(view) | pVar.s(lVar);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new r(view, lVar);
            pVar.N(objU);
        }
        pVar.c0();
        r rVar = (r) objU;
        EffectsKt.c(rVar, new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(rVar), pVar, 0);
        pVar.c0();
        return rVar;
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            return nVar;
        }
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$systemGestureExclusion$$inlined$debugInspectorInfo$1
            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("systemGestureExclusion");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$systemGestureExclusion$2
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1120057036);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1120057036, i10, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:47)");
                }
                pVar.T(1687674107);
                View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
                pVar.T(511388516);
                boolean zS = pVar.s(view) | pVar.s(null);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new r(view, null);
                    pVar.N(objU);
                }
                pVar.c0();
                r rVar = (r) objU;
                EffectsKt.c(rVar, new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(rVar), pVar, 0);
                pVar.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return rVar;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super androidx.compose.ui.layout.q, b1.i> exclusion) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(exclusion, "exclusion");
        if (Build.VERSION.SDK_INT < 29) {
            return nVar;
        }
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$systemGestureExclusion$$inlined$debugInspectorInfo$2
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("systemGestureExclusion");
                x0Var.getProperties().c("exclusion", exclusion);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$systemGestureExclusion$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(108999);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(108999, i10, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:69)");
                }
                yh.l<androidx.compose.ui.layout.q, b1.i> lVar = exclusion;
                pVar.T(1687674107);
                View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
                pVar.T(511388516);
                boolean zS = pVar.s(view) | pVar.s(lVar);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new r(view, lVar);
                    pVar.N(objU);
                }
                pVar.c0();
                r rVar = (r) objU;
                EffectsKt.c(rVar, new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(rVar), pVar, 0);
                pVar.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return rVar;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
