package androidx.compose.animation.core;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001ac\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a«\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001ao\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010%\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010(\u001a\u00028\u00012\u0006\u0010)\u001a\u00028\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b+\u0010,\u001a\u0087\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020-0%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020-0\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u008a\u0001\u00101\u001a\b\u0012\u0004\u0012\u0002000%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002000 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002000\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010/\u001a\u008a\u0001\u00103\u001a\b\u0012\u0004\u0012\u0002020%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002020 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002020\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010/\u001a\u008a\u0001\u00105\u001a\b\u0012\u0004\u0012\u0002040%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002040 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002040\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010/\u001a\u008a\u0001\u00107\u001a\b\u0012\u0004\u0012\u0002060%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002060 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002060\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u0010/\u001a\u0087\u0001\u00109\u001a\b\u0012\u0004\u0012\u0002080%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002080 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u0002080\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010/\u001a\u008a\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020:0%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020:0\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010/\u001a\u0087\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020<0%\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\n\u0010\"\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0 0\u0013¢\u0006\u0002\b\u0017¢\u0006\u0002\b!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022&\u0010$\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020<0\u0013¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010/\"\u0014\u0010?\u001a\u0002088\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010>\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "targetState", "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Landroidx/compose/animation/core/Transition;", "o", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/p;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/r0;", "transitionState", "n", "(Landroidx/compose/animation/core/r0;Ljava/lang/String;Landroidx/compose/runtime/p;II)Landroidx/compose/animation/core/Transition;", androidx.exifinterface.media.a.R4, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "typeConverter", "Landroidx/compose/animation/core/Transition$a;", "l", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/f1;Ljava/lang/String;Landroidx/compose/runtime/p;II)Landroidx/compose/animation/core/Transition$a;", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "parentState", "Landroidx/compose/runtime/h;", "transformToChildState", "j", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)Landroidx/compose/animation/core/Transition;", "initialState", "childLabel", "k", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/p;I)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/core/f0;", "Lkotlin/t;", "transitionSpec", "state", "targetValueByState", "Landroidx/compose/runtime/m2;", "i", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/f1;Lyh/q;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "initialValue", "targetValue", "animationSpec", "m", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/f0;Landroidx/compose/animation/core/f1;Ljava/lang/String;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "", "b", "(Landroidx/compose/animation/core/Transition;Lyh/q;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Ls1/h;", ak.av, "Lb1/f;", "f", "Lb1/m;", RXScreenCaptureService.KEY_HEIGHT, "Ls1/n;", "d", "", ak.aF, "Ls1/r;", "e", "Lb1/i;", "g", "I", "AnimationDebugDurationScale", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class TransitionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4305a = 1;

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<s1.h> a(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<s1.h>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, s1.h> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(184732935);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<s1.h>>() { // from class: androidx.compose.animation.core.TransitionKt$animateDp$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<s1.h> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-575880366);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-575880366, i12, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:963)");
                    }
                    z0<s1.h> z0VarO = i.o(0.0f, 0.0f, s1.h.d(x1.a(s1.h.f139219c)), 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<s1.h> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        f1<s1.h, l> f1VarG = VectorConvertersKt.g(s1.h.f139219c);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<s1.h> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarG, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<Float> b(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<Float>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, Float> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(-1338768149);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<Float>>() { // from class: androidx.compose.animation.core.TransitionKt$animateFloat$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<Float> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-522164544);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-522164544, i12, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:934)");
                    }
                    z0<Float> z0VarO = i.o(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<Float> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        f1<Float, l> f1VarE = VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<Float> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarE, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<Integer> c(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<Integer>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, Integer> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(1318902782);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt$animateInt$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<Integer> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-785273069);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-785273069, i12, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1087)");
                    }
                    z0<Integer> z0VarO = i.o(0.0f, 0.0f, 1, 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<Integer> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        f1<Integer, l> f1VarF = VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<Integer> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarF, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<s1.n> d(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<s1.n>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, s1.n> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(776131825);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<s1.n>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntOffset$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<s1.n> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-1953479610);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1953479610, i12, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1058)");
                    }
                    z0<s1.n> z0VarO = i.o(0.0f, 0.0f, s1.n.b(s1.o.a(1, 1)), 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<s1.n> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        f1<s1.n, m> f1VarI = VectorConvertersKt.i(s1.n.f139237b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<s1.n> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarI, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<s1.r> e(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<s1.r>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, s1.r> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(-2104123233);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<s1.r>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntSize$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<s1.r> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(967893300);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(967893300, i12, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1119)");
                    }
                    z0<s1.r> z0VarO = i.o(0.0f, 0.0f, s1.r.b(s1.s.a(1, 1)), 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<s1.r> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        f1<s1.r, m> f1VarJ = VectorConvertersKt.j(s1.r.f139246b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<s1.r> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarJ, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<b1.f> f(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<b1.f>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, b1.f> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(2078477582);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<b1.f>>() { // from class: androidx.compose.animation.core.TransitionKt$animateOffset$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<b1.f> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(1623385561);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1623385561, i12, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:994)");
                    }
                    z0<b1.f> z0VarO = i.o(0.0f, 0.0f, b1.f.d(x1.c(b1.f.f30364b)), 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<b1.f> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        f1<b1.f, m> f1VarB = VectorConvertersKt.b(b1.f.f30364b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<b1.f> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarB, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<b1.i> g(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<b1.i>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, b1.i> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(1496278239);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<b1.i>>() { // from class: androidx.compose.animation.core.TransitionKt$animateRect$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<b1.i> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(691336298);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(691336298, i12, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1149)");
                    }
                    z0<b1.i> z0VarO = i.o(0.0f, 0.0f, x1.h(b1.i.f30369e), 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<b1.i> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        f1<b1.i, o> f1VarC = VectorConvertersKt.c(b1.i.f30369e);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<b1.i> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarC, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S> m2<b1.m> h(@dl.d Transition<S> transition, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<b1.m>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, b1.m> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(-802210820);
        if ((i11 & 1) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<b1.m>>() { // from class: androidx.compose.animation.core.TransitionKt$animateSize$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<b1.m> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-1607152761);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1607152761, i12, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1025)");
                    }
                    z0<b1.m> z0VarO = i.o(0.0f, 0.0f, b1.m.c(x1.d(b1.m.f30386b)), 3, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<b1.m> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        f1<b1.m, m> f1VarD = VectorConvertersKt.d(b1.m.f30386b);
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc) | (i13 & 57344);
        pVar.T(-142660079);
        int i15 = (i14 >> 9) & 112;
        m2<b1.m> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i15)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i15)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarD, str2, pVar, (i14 & 14) | ((i14 << 9) & 57344) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public static final <S, T, V extends p> m2<T> i(@dl.d Transition<S> transition, @dl.d f1<T, V> typeConverter, @dl.e yh.q<? super Transition.b<S>, ? super androidx.compose.runtime.p, ? super Integer, ? extends f0<T>> qVar, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, ? extends T> targetValueByState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(targetValueByState, "targetValueByState");
        pVar.T(-142660079);
        if ((i11 & 2) != 0) {
            qVar = new yh.q<Transition.b<S>, androidx.compose.runtime.p, Integer, z0<T>>() { // from class: androidx.compose.animation.core.TransitionKt$animateValue$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<T> a(@dl.d Transition.b<S> bVar, @dl.e androidx.compose.runtime.p pVar2, int i12) {
                    kotlin.jvm.internal.f0.p(bVar, "$this$null");
                    pVar2.T(-895531546);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-895531546, i12, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:851)");
                    }
                    z0<T> z0VarO = i.o(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                    return a((Transition.b) obj, pVar2, num.intValue());
                }
            };
        }
        if ((i11 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i12 = (i10 >> 9) & 112;
        m2<T> m2VarM = m(transition, targetValueByState.invoke(transition.h(), pVar, Integer.valueOf(i12)), targetValueByState.invoke(transition.o(), pVar, Integer.valueOf(i12)), qVar.invoke(transition.m(), pVar, Integer.valueOf((i10 >> 3) & 112)), typeConverter, str, pVar, (i10 & 14) | (57344 & (i10 << 9)) | (458752 & (i10 << 6)));
        pVar.c0();
        return m2VarM;
    }

    @dl.d
    @e0
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final <S, T> Transition<T> j(@dl.d Transition<S> transition, @dl.e String str, @dl.d yh.q<? super S, ? super androidx.compose.runtime.p, ? super Integer, ? extends T> transformToChildState, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(transformToChildState, "transformToChildState");
        pVar.T(1215497572);
        if ((i11 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i12 = i10 & 14;
        pVar.T(1157296644);
        boolean zS = pVar.s(transition);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = transition.h();
            pVar.N(objU);
        }
        pVar.c0();
        if (transition.t()) {
            objU = transition.h();
        }
        int i13 = (i10 >> 3) & 112;
        Transition<T> transitionK = k(transition, transformToChildState.invoke(objU, pVar, Integer.valueOf(i13)), transformToChildState.invoke(transition.o(), pVar, Integer.valueOf(i13)), str2, pVar, i12 | ((i10 << 6) & bb.c.g.f32954lc));
        pVar.c0();
        return transitionK;
    }

    @dl.d
    @kotlin.r0
    @androidx.compose.runtime.h
    public static final <S, T> Transition<T> k(@dl.d final Transition<S> transition, T t10, T t11, @dl.d String childLabel, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(childLabel, "childLabel");
        pVar.T(-198307638);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:793)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(transition);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new Transition(new r0(t10), transition.getCom.starlightc.ucropplus.model.puzzle.BasePuzzleInfo.PUZZLE_TYPE_LABEL java.lang.String() + " > " + childLabel);
            pVar.N(objU);
        }
        pVar.c0();
        final Transition<T> transition2 = (Transition) objU;
        pVar.T(511388516);
        boolean zS2 = pVar.s(transition) | pVar.s(transition2);
        Object objU2 = pVar.U();
        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Transition f4317a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Transition f4318b;

                    public a(Transition transition, Transition transition2) {
                        this.f4317a = transition;
                        this.f4318b = transition2;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f4317a.B(this.f4318b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    transition.e(transition2);
                    return new a(transition, transition2);
                }
            };
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.c(transition2, (yh.l) objU2, pVar, 0);
        if (transition.t()) {
            transition2.C(t10, t11, transition.getLastSeekedTimeNanos());
        } else {
            transition2.L(t11, pVar, ((i10 >> 3) & 8) | ((i10 >> 6) & 14));
            transition2.G(false);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return transition2;
    }

    @dl.d
    @o0
    @androidx.compose.runtime.h
    public static final <S, T, V extends p> Transition<S>.a<T, V> l(@dl.d final Transition<S> transition, @dl.d f1<T, V> typeConverter, @dl.e String str, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        pVar.T(-1714122528);
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:748)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(transition);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new Transition.a(transition, typeConverter, str);
            pVar.N(objU);
        }
        pVar.c0();
        final Transition<S>.a<T, V> aVar = (Transition.a) objU;
        EffectsKt.c(aVar, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Transition f4321a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Transition.a f4322b;

                public a(Transition transition, Transition.a aVar) {
                    this.f4321a = transition;
                    this.f4322b = aVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f4321a.z(this.f4322b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                return new a(transition, aVar);
            }
        }, pVar, 0);
        if (transition.t()) {
            aVar.f();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }

    @dl.d
    @kotlin.r0
    @androidx.compose.runtime.h
    public static final <S, T, V extends p> m2<T> m(@dl.d final Transition<S> transition, T t10, T t11, @dl.d f0<T> animationSpec, @dl.d f1<T, V> typeConverter, @dl.d String label, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(label, "label");
        pVar.T(-304821198);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:865)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(transition);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new Transition.d(transition, t10, k.i(typeConverter, t11), typeConverter, label);
            pVar.N(objU);
        }
        pVar.c0();
        final Transition.d dVar = (Transition.d) objU;
        if (transition.t()) {
            dVar.C(t10, t11, animationSpec);
        } else {
            dVar.D(t11, animationSpec);
        }
        pVar.T(511388516);
        boolean zS2 = pVar.s(transition) | pVar.s(dVar);
        Object objU2 = pVar.U();
        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Transition f4325a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Transition.d f4326b;

                    public a(Transition transition, Transition.d dVar) {
                        this.f4325a = transition;
                        this.f4326b = dVar;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f4325a.A(this.f4326b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    transition.d(dVar);
                    return new a(transition, dVar);
                }
            };
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.c(dVar, (yh.l) objU2, pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return dVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final <T> Transition<T> n(@dl.d r0<T> transitionState, @dl.e String str, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(transitionState, "transitionState");
        pVar.T(882913843);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:149)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(transitionState);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new Transition((r0) transitionState, str);
            pVar.N(objU);
        }
        pVar.c0();
        final Transition<T> transition = (Transition) objU;
        transition.f(transitionState.b(), pVar, 0);
        pVar.T(1157296644);
        boolean zS2 = pVar.s(transition);
        Object objU2 = pVar.U();
        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Transition f4330a;

                    public a(Transition transition) {
                        this.f4330a = transition;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f4330a.x();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    return new a(transition);
                }
            };
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.c(transition, (yh.l) objU2, pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return transition;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final <T> Transition<T> o(T t10, @dl.e String str, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:66)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = new Transition(t10, str);
            pVar.N(objU);
        }
        pVar.c0();
        final Transition<T> transition = (Transition) objU;
        transition.f(t10, pVar, (i10 & 8) | 48 | (i10 & 14));
        pVar.T(1157296644);
        boolean zS = pVar.s(transition);
        Object objU2 = pVar.U();
        if (zS || objU2 == companion.a()) {
            objU2 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Transition f4328a;

                    public a(Transition transition) {
                        this.f4328a = transition;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f4328a.x();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    return new a(transition);
                }
            };
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.c(transition, (yh.l) objU2, pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return transition;
    }
}
