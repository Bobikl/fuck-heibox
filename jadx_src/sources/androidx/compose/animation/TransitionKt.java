package androidx.compose.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.f0;
import androidx.compose.animation.core.f1;
import androidx.compose.animation.core.n0;
import androidx.compose.animation.core.z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.l0;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008a\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012*\b\n\u0010\b\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2&\u0010\u000e\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0007ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {androidx.exifinterface.media.a.R4, "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/core/f0;", "Landroidx/compose/ui/graphics/l0;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "transitionSpec", "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/m0;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/m2;", ak.av, "(Landroidx/compose/animation/core/Transition;Lyh/q;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "Landroidx/compose/animation/core/n0;", "animationSpec", "b", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/n0;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class TransitionKt {
    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<l0> a(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<l0>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, l0> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(-1939694975);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<l0>>() { // from class: androidx.compose.animation.TransitionKt$animateColor$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<l0> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-1457805428);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1457805428, i12, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                    }
                    z0<l0> z0VarO = androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<l0> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        androidx.compose.ui.graphics.colorspace.c cVarE = l0.E(targetValueByState.invoke(transition.o(), pVar, Integer.valueOf((i10 >> 6) & 112)).M());
        pVar.T(1157296644);
        boolean zS = pVar.s(cVarE);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = (f1) ColorVectorConverterKt.d(l0.INSTANCE).invoke(cVarE);
            pVar.N(objU);
        }
        pVar.c0();
        f1 f1Var = (f1) objU;
        int i12 = (i10 & 14) | 64;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<l0> m2VarM = androidx.compose.animation.core.TransitionKt.m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1Var, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<l0> b(@dl.d InfiniteTransition animateColor, long j10, long j11, @dl.d n0<l0> animationSpec, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(animateColor, "$this$animateColor");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        pVar.T(1400583834);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1400583834, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:94)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = (f1) ColorVectorConverterKt.d(l0.INSTANCE).invoke(l0.E(j11));
            pVar.N(objU);
        }
        pVar.c0();
        m2<l0> m2VarB = InfiniteTransitionKt.b(animateColor, l0.n(j10), l0.n(j11), (f1) objU, animationSpec, pVar, InfiniteTransition.f4159e | 4096 | (i10 & 14) | (i10 & 112) | (i10 & bb.c.b.f30796me) | (n0.f4468d << 12) | (57344 & (i10 << 3)));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarB;
    }
}
