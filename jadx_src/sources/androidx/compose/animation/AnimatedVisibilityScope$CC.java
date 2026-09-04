package androidx.compose.animation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC, reason: invalid class name */
/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AnimatedVisibilityScope$CC {
    @j
    @dl.d
    public static androidx.compose.ui.n a(final c cVar, @dl.d androidx.compose.ui.n nVar, @dl.d final f enter, @dl.d final h exit, @dl.d final String label) {
        f0.p(nVar, "<this>");
        f0.p(enter, "enter");
        f0.p(exit, "exit");
        f0.p(label, "label");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("animateEnterExit");
                x0Var.getProperties().c("enter", enter);
                x0Var.getProperties().c(com.alipay.sdk.m.x.d.A, exit);
                x0Var.getProperties().c(BasePuzzleInfo.PUZZLE_TYPE_LABEL, label);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(1840112047);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1840112047, i10, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:671)");
                }
                androidx.compose.ui.n nVarS0 = composed.s0(EnterExitTransitionKt.g(cVar.b(), enter, exit, label, pVar, 0));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n c(c cVar, androidx.compose.ui.n nVar, f fVar, h hVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i10 & 1) != 0) {
            fVar = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
        }
        if ((i10 & 2) != 0) {
            hVar = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
        }
        if ((i10 & 4) != 0) {
            str = "animateEnterExit";
        }
        return cVar.a(nVar, fVar, hVar, str);
    }
}
