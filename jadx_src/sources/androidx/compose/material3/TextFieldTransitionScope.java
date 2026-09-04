package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jµ\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000b\u001a\u00020\n2e\u0010\u0015\u001aa\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\f¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "Landroidx/compose/material3/InputPhase;", "inputState", "Landroidx/compose/ui/graphics/l0;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/h;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Lkotlin/m0;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Lkotlin/b2;", "content", ak.av, "(Landroidx/compose/material3/InputPhase;JJLyh/q;ZLyh/t;Landroidx/compose/runtime/p;I)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldTransitionScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TextFieldTransitionScope f11670a = new TextFieldTransitionScope();

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11683a;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            f11683a = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float b(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    private static final float c(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    private static final long d(m2<androidx.compose.ui.graphics.l0> m2Var) {
        return m2Var.getValue().M();
    }

    private static final long e(m2<androidx.compose.ui.graphics.l0> m2Var) {
        return m2Var.getValue().M();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:124:0x0208  */
    /* JADX WARN: Code duplicated, block: B:127:0x024d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0259  */
    /* JADX WARN: Code duplicated, block: B:131:0x025c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0264  */
    /* JADX WARN: Code duplicated, block: B:139:0x0286  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:164:0x0361  */
    /* JADX WARN: Code duplicated, block: B:167:0x040b  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ba  */
    @androidx.compose.runtime.i(scheme = "[0[0][0]]")
    @androidx.compose.runtime.h
    public final void a(@dl.d final InputPhase inputState, final long j10, final long j11, @dl.d final yh.q<? super InputPhase, ? super androidx.compose.runtime.p, ? super Integer, androidx.compose.ui.graphics.l0> contentColor, final boolean z10, @dl.d final yh.t<? super Float, ? super androidx.compose.ui.graphics.l0, ? super androidx.compose.ui.graphics.l0, ? super Float, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        int i14;
        InputPhase inputPhase;
        long j12;
        androidx.compose.ui.graphics.colorspace.c cVarE;
        boolean zS;
        Object objU;
        InputPhase inputPhase2;
        long j13;
        InputPhase inputPhase3;
        long j14;
        androidx.compose.ui.graphics.colorspace.c cVarE2;
        boolean zS2;
        Object objU2;
        kotlin.jvm.internal.f0.p(inputState, "inputState");
        kotlin.jvm.internal.f0.p(contentColor, "contentColor");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1933643487);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(inputState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.z(j10) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.z(j11) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(contentColor) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= pVarF.u(z10) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            i11 |= pVarF.s(content) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1933643487, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:255)");
            }
            Transition transitionO = TransitionKt.o(inputState, "TextFieldInputState", pVarF, (i11 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelProgress$2
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<InputPhase> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i15) {
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(-943297137);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-943297137, i15, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:275)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = androidx.compose.animation.core.i.q(150, 0, null, 6, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE = VectorConvertersKt.e(yVar);
            pVarF.T(1847725064);
            InputPhase inputPhase4 = (InputPhase) transitionO.h();
            pVarF.T(-698152717);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-698152717, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
            }
            int[] iArr = a.f11683a;
            int i15 = iArr[inputPhase4.ordinal()];
            float f13 = 0.0f;
            if (i15 == 1) {
                f10 = 1.0f;
            } else if (i15 != 2) {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf = Float.valueOf(f10);
            InputPhase inputPhase5 = (InputPhase) transitionO.o();
            pVarF.T(-698152717);
            if (ComposerKt.g0()) {
                i12 = -1;
                ComposerKt.w0(-698152717, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
            } else {
                i12 = -1;
            }
            int i16 = iArr[inputPhase5.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    f11 = 0.0f;
                } else if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                m2 m2VarM = TransitionKt.m(transitionO, fValueOf, Float.valueOf(f11), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionO.m(), pVarF, 0), f1VarE, "LabelProgress", pVarF, androidx.profileinstaller.o.c.f26824k);
                pVarF.c0();
                pVarF.c0();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @dl.d
                    @androidx.compose.runtime.h
                    public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<InputPhase> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i17) {
                        androidx.compose.animation.core.f0<Float> f0VarP;
                        kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                        pVar2.T(1721367864);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1721367864, i17, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
                        }
                        InputPhase inputPhase6 = InputPhase.Focused;
                        InputPhase inputPhase7 = InputPhase.UnfocusedEmpty;
                        if (animateFloat.b(inputPhase6, inputPhase7)) {
                            f0VarP = androidx.compose.animation.core.i.q(67, 0, androidx.compose.animation.core.d0.c(), 2, null);
                        } else {
                            f0VarP = (animateFloat.b(inputPhase7, inputPhase6) || animateFloat.b(InputPhase.UnfocusedNotEmpty, inputPhase7)) ? androidx.compose.animation.core.i.p(83, 67, androidx.compose.animation.core.d0.c()) : androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar2.c0();
                        return f0VarP;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        return a(bVar, pVar2, num.intValue());
                    }
                };
                pVarF.T(1399891485);
                androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE2 = VectorConvertersKt.e(yVar);
                pVarF.T(1847725064);
                InputPhase inputPhase6 = (InputPhase) transitionO.h();
                pVarF.T(1128980564);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1128980564, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
                }
                i13 = iArr[inputPhase6.ordinal()];
                if (i13 == 1) {
                    f12 = 1.0f;
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z10) {
                        f12 = 1.0f;
                    }
                    f12 = 0.0f;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                Float fValueOf2 = Float.valueOf(f12);
                InputPhase inputPhase7 = (InputPhase) transitionO.o();
                pVarF.T(1128980564);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1128980564, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
                }
                i14 = iArr[inputPhase7.ordinal()];
                if (i14 == 1) {
                    f13 = 1.0f;
                } else if (i14 != 2) {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z10) {
                    f13 = 1.0f;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                m2 m2VarM2 = TransitionKt.m(transitionO, fValueOf2, Float.valueOf(f13), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionO.m(), pVarF, 0), f1VarE2, "PlaceholderOpacity", pVarF, androidx.profileinstaller.o.c.f26824k);
                pVarF.c0();
                pVarF.c0();
                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                    @dl.d
                    @androidx.compose.runtime.h
                    public final androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> a(@dl.d Transition.b<InputPhase> animateColor, @dl.e androidx.compose.runtime.p pVar2, int i17) {
                        kotlin.jvm.internal.f0.p(animateColor, "$this$animateColor");
                        pVar2.T(1103405032);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1103405032, i17, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:313)");
                        }
                        androidx.compose.animation.core.e1 e1VarQ = androidx.compose.animation.core.i.q(150, 0, null, 6, null);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar2.c0();
                        return e1VarQ;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        return a(bVar, pVar2, num.intValue());
                    }
                };
                pVarF.T(-1462136984);
                inputPhase = (InputPhase) transitionO.o();
                pVarF.T(1888369619);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1888369619, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                }
                if (iArr[inputPhase.ordinal()] == 1) {
                    j12 = j10;
                } else {
                    j12 = j11;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                cVarE = androidx.compose.ui.graphics.l0.E(j12);
                pVarF.T(-3686930);
                zS = pVarF.s(cVarE);
                objU = pVarF.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE);
                    pVarF.N(objU);
                }
                pVarF.c0();
                androidx.compose.animation.core.f1 f1Var = (androidx.compose.animation.core.f1) objU;
                pVarF.T(1847725064);
                inputPhase2 = (InputPhase) transitionO.h();
                pVarF.T(1888369619);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1888369619, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                }
                if (iArr[inputPhase2.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = j11;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(j13);
                inputPhase3 = (InputPhase) transitionO.o();
                pVarF.T(1888369619);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1888369619, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                }
                if (iArr[inputPhase3.ordinal()] == 1) {
                    j14 = j10;
                } else {
                    j14 = j11;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                m2 m2VarM3 = TransitionKt.m(transitionO, l0VarN, androidx.compose.ui.graphics.l0.n(j14), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke(transitionO.m(), pVarF, 0), f1Var, "LabelTextStyleColor", pVarF, 229376);
                pVarF.c0();
                pVarF.c0();
                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                    @dl.d
                    @androidx.compose.runtime.h
                    public final androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> a(@dl.d Transition.b<InputPhase> animateColor, @dl.e androidx.compose.runtime.p pVar2, int i17) {
                        kotlin.jvm.internal.f0.p(animateColor, "$this$animateColor");
                        pVar2.T(-172466157);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-172466157, i17, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:323)");
                        }
                        androidx.compose.animation.core.e1 e1VarQ = androidx.compose.animation.core.i.q(150, 0, null, 6, null);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar2.c0();
                        return e1VarQ;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        return a(bVar, pVar2, num.intValue());
                    }
                };
                int i17 = (i11 & bb.c.g.f32954lc) | bb.c.b.f30966u4;
                pVarF.T(-1462136984);
                cVarE2 = androidx.compose.ui.graphics.l0.E(contentColor.invoke(transitionO.o(), pVarF, Integer.valueOf((i17 >> 6) & 112)).M());
                pVarF.T(-3686930);
                zS2 = pVarF.s(cVarE2);
                objU2 = pVarF.U();
                if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU2 = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE2);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i18 = (i17 & 14) | 64;
                int i19 = i17 << 3;
                int i20 = (i19 & 57344) | i18 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc);
                pVarF.T(1847725064);
                int i21 = (i20 >> 9) & 112;
                m2 m2VarM4 = TransitionKt.m(transitionO, contentColor.invoke(transitionO.h(), pVarF, Integer.valueOf(i21)), contentColor.invoke(transitionO.o(), pVarF, Integer.valueOf(i21)), textFieldTransitionScope$Transition$labelContentColor$2.invoke(transitionO.m(), pVarF, Integer.valueOf((i20 >> 3) & 112)), (androidx.compose.animation.core.f1) objU2, "LabelContentColor", pVarF, (i20 & 14) | ((i20 << 9) & 57344) | ((i20 << 6) & 458752));
                pVarF.c0();
                pVarF.c0();
                content.Z0(Float.valueOf(b(m2VarM)), androidx.compose.ui.graphics.l0.n(d(m2VarM3)), androidx.compose.ui.graphics.l0.n(e(m2VarM4)), Float.valueOf(c(m2VarM2)), pVarF, Integer.valueOf((i11 >> 3) & 57344));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
            f11 = 1.0f;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2 m2VarM5 = TransitionKt.m(transitionO, fValueOf, Float.valueOf(f11), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionO.m(), pVarF, 0), f1VarE, "LabelProgress", pVarF, androidx.profileinstaller.o.c.f26824k);
            pVarF.c0();
            pVarF.c0();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$3 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<InputPhase> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i110) {
                    androidx.compose.animation.core.f0<Float> f0VarP;
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(1721367864);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1721367864, i110, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
                    }
                    InputPhase inputPhase8 = InputPhase.Focused;
                    InputPhase inputPhase9 = InputPhase.UnfocusedEmpty;
                    if (animateFloat.b(inputPhase8, inputPhase9)) {
                        f0VarP = androidx.compose.animation.core.i.q(67, 0, androidx.compose.animation.core.d0.c(), 2, null);
                    } else {
                        f0VarP = (animateFloat.b(inputPhase9, inputPhase8) || animateFloat.b(InputPhase.UnfocusedNotEmpty, inputPhase9)) ? androidx.compose.animation.core.i.p(83, 67, androidx.compose.animation.core.d0.c()) : androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return f0VarP;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE3 = VectorConvertersKt.e(yVar);
            pVarF.T(1847725064);
            InputPhase inputPhase8 = (InputPhase) transitionO.h();
            pVarF.T(1128980564);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1128980564, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
            }
            i13 = iArr[inputPhase8.ordinal()];
            if (i13 == 1) {
                f12 = 1.0f;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z10) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf3 = Float.valueOf(f12);
            InputPhase inputPhase9 = (InputPhase) transitionO.o();
            pVarF.T(1128980564);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1128980564, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
            }
            i14 = iArr[inputPhase9.ordinal()];
            if (i14 == 1) {
                f13 = 1.0f;
            } else if (i14 != 2) {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z10) {
                f13 = 1.0f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2 m2VarM6 = TransitionKt.m(transitionO, fValueOf3, Float.valueOf(f13), textFieldTransitionScope$Transition$placeholderOpacity$3.invoke(transitionO.m(), pVarF, 0), f1VarE3, "PlaceholderOpacity", pVarF, androidx.profileinstaller.o.c.f26824k);
            pVarF.c0();
            pVarF.c0();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$3 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> a(@dl.d Transition.b<InputPhase> animateColor, @dl.e androidx.compose.runtime.p pVar2, int i110) {
                    kotlin.jvm.internal.f0.p(animateColor, "$this$animateColor");
                    pVar2.T(1103405032);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1103405032, i110, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:313)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = androidx.compose.animation.core.i.q(150, 0, null, 6, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(-1462136984);
            inputPhase = (InputPhase) transitionO.o();
            pVarF.T(1888369619);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1888369619, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            if (iArr[inputPhase.ordinal()] == 1) {
                j12 = j10;
            } else {
                j12 = j11;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            cVarE = androidx.compose.ui.graphics.l0.E(j12);
            pVarF.T(-3686930);
            zS = pVarF.s(cVarE);
            objU = pVarF.U();
            if (zS) {
                objU = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE);
                pVarF.N(objU);
            } else {
                objU = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE);
                pVarF.N(objU);
            }
            pVarF.c0();
            androidx.compose.animation.core.f1 f1Var2 = (androidx.compose.animation.core.f1) objU;
            pVarF.T(1847725064);
            inputPhase2 = (InputPhase) transitionO.h();
            pVarF.T(1888369619);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1888369619, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            if (iArr[inputPhase2.ordinal()] == 1) {
                j13 = j10;
            } else {
                j13 = j11;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            androidx.compose.ui.graphics.l0 l0VarN2 = androidx.compose.ui.graphics.l0.n(j13);
            inputPhase3 = (InputPhase) transitionO.o();
            pVarF.T(1888369619);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1888369619, 0, i12, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            if (iArr[inputPhase3.ordinal()] == 1) {
                j14 = j10;
            } else {
                j14 = j11;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2 m2VarM7 = TransitionKt.m(transitionO, l0VarN2, androidx.compose.ui.graphics.l0.n(j14), textFieldTransitionScope$Transition$labelTextStyleColor$3.invoke(transitionO.m(), pVarF, 0), f1Var2, "LabelTextStyleColor", pVarF, 229376);
            pVarF.c0();
            pVarF.c0();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$3 = new yh.q<Transition.b<InputPhase>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> a(@dl.d Transition.b<InputPhase> animateColor, @dl.e androidx.compose.runtime.p pVar2, int i110) {
                    kotlin.jvm.internal.f0.p(animateColor, "$this$animateColor");
                    pVar2.T(-172466157);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-172466157, i110, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:323)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = androidx.compose.animation.core.i.q(150, 0, null, 6, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<androidx.compose.ui.graphics.l0> invoke(Transition.b<InputPhase> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            int i110 = (i11 & bb.c.g.f32954lc) | bb.c.b.f30966u4;
            pVarF.T(-1462136984);
            cVarE2 = androidx.compose.ui.graphics.l0.E(contentColor.invoke(transitionO.o(), pVarF, Integer.valueOf((i110 >> 6) & 112)).M());
            pVarF.T(-3686930);
            zS2 = pVarF.s(cVarE2);
            objU2 = pVarF.U();
            if (zS2) {
                objU2 = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE2);
                pVarF.N(objU2);
            } else {
                objU2 = (androidx.compose.animation.core.f1) ColorVectorConverterKt.d(androidx.compose.ui.graphics.l0.INSTANCE).invoke(cVarE2);
                pVarF.N(objU2);
            }
            pVarF.c0();
            int i111 = (i110 & 14) | 64;
            int i112 = i110 << 3;
            int i22 = (i112 & 57344) | i111 | (i112 & bb.c.b.f30796me) | (i112 & bb.c.g.f32954lc);
            pVarF.T(1847725064);
            int i23 = (i22 >> 9) & 112;
            m2 m2VarM8 = TransitionKt.m(transitionO, contentColor.invoke(transitionO.h(), pVarF, Integer.valueOf(i23)), contentColor.invoke(transitionO.o(), pVarF, Integer.valueOf(i23)), textFieldTransitionScope$Transition$labelContentColor$3.invoke(transitionO.m(), pVarF, Integer.valueOf((i22 >> 3) & 112)), (androidx.compose.animation.core.f1) objU2, "LabelContentColor", pVarF, (i22 & 14) | ((i22 << 9) & 57344) | ((i22 << 6) & 458752));
            pVarF.c0();
            pVarF.c0();
            content.Z0(Float.valueOf(b(m2VarM5)), androidx.compose.ui.graphics.l0.n(d(m2VarM7)), androidx.compose.ui.graphics.l0.n(e(m2VarM8)), Float.valueOf(c(m2VarM6)), pVarF, Integer.valueOf((i11 >> 3) & 57344));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                this.f11671b.a(inputState, j10, j11, contentColor, z10, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
