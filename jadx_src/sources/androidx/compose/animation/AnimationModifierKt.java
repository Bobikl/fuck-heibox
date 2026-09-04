package androidx.compose.animation;

import androidx.compose.animation.core.f0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/animation/core/f0;", "Ls1/r;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "initialValue", "targetValue", "Lkotlin/b2;", "finishedListener", ak.av, "animation_release"}, k = 2, mv = {1, 7, 1})
public final class AnimationModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final f0<s1.r> animationSpec, @dl.e final yh.p<? super s1.r, ? super s1.r, b2> pVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("animateContentSize");
                x0Var.getProperties().c("animationSpec", animationSpec);
                x0Var.getProperties().c("finishedListener", pVar);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.animation.AnimationModifierKt$animateContentSize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar2, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar2.T(-843180607);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-843180607, i10, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
                }
                pVar2.T(773894976);
                pVar2.T(-492369756);
                Object objU = pVar2.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar2));
                    pVar2.N(xVar);
                    objU = xVar;
                }
                pVar2.c0();
                q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVar2.c0();
                f0<s1.r> f0Var = animationSpec;
                pVar2.T(1157296644);
                boolean zS = pVar2.s(coroutineScope);
                Object objU2 = pVar2.U();
                if (zS || objU2 == companion.a()) {
                    objU2 = new SizeAnimationModifier(f0Var, coroutineScope);
                    pVar2.N(objU2);
                }
                pVar2.c0();
                SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) objU2;
                sizeAnimationModifier.m(pVar);
                androidx.compose.ui.n nVarS0 = androidx.compose.ui.draw.d.b(composed).s0(sizeAnimationModifier);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar2.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar2, Integer num) {
                return a(nVar2, pVar2, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, f0 f0Var, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return a(nVar, f0Var, pVar);
    }
}
