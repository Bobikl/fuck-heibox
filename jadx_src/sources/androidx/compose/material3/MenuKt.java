package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.o2;
import androidx.compose.ui.graphics.p2;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\u001aV\u0010\u000e\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0082\u0001\u0010\u001c\u001a\u00020\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u000b2\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u000b2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\"\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u001d\u0010'\u001a\u00020#8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\"\u0017\u0010)\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010$\"\u001d\u0010,\u001a\u00020#8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0017\u0010-\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010$\"\u0017\u0010/\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010$\"\u0014\u00103\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00105\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/animation/core/r0;", "", "expandedStates", "Landroidx/compose/runtime/a1;", "Landroidx/compose/ui/graphics/o2;", "transformOriginState", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Landroidx/compose/animation/core/r0;Landroidx/compose/runtime/a1;Landroidx/compose/ui/n;Lyh/q;Landroidx/compose/runtime/p;II)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/q0;", "colors", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "d", "(Lyh/p;Lyh/a;Landroidx/compose/ui/n;Lyh/p;Lyh/p;ZLandroidx/compose/material3/q0;Landroidx/compose/foundation/layout/m0;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;I)V", "Ls1/p;", "parentBounds", "menuBounds", RXScreenCaptureService.KEY_HEIGHT, "(Ls1/p;Ls1/p;)J", "Ls1/h;", "F", "j", "()F", "MenuVerticalMargin", "b", "DropdownMenuItemHorizontalPadding", ak.aF, "i", "DropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "e", "DropdownMenuItemDefaultMaxWidth", "", "f", "I", "InTransitionDuration", "g", "OutTransitionDuration", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class MenuKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9769a = s1.h.g(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f9770b = s1.h.g(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f9771c = s1.h.g(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f9772d = s1.h.g(112);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f9773e = s1.h.g(bb.c.b.f30964u2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9774f = 120;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9775g = 75;

    /* JADX WARN: Code duplicated, block: B:100:0x0255  */
    /* JADX WARN: Code duplicated, block: B:105:0x0260  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.animation.core.r0<Boolean> expandedStates, @dl.d final androidx.compose.runtime.a1<o2> transformOriginState, @dl.e androidx.compose.ui.n nVar, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        final int i14;
        final androidx.compose.ui.n nVar3;
        boolean zBooleanValue;
        float f10;
        final m2 m2VarM;
        boolean zBooleanValue2;
        float f11;
        final m2 m2VarM2;
        boolean zS;
        Object objU;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(expandedStates, "expandedStates");
        kotlin.jvm.internal.f0.p(transformOriginState, "transformOriginState");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-159754260);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(expandedStates) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(transformOriginState) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= bb.c.d.f31193dj;
            } else if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(content)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & bb.c.f.br) == 1170 || !pVarF.b()) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-159754260, i14, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
                }
                Transition transitionN = TransitionKt.n(expandedStates, "DropDownMenu", pVarF, androidx.compose.animation.core.r0.f4499d | 48 | (i14 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @dl.d
                    @androidx.compose.runtime.h
                    public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<Boolean> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i16) {
                        kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                        pVar2.T(839979861);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(839979861, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:75)");
                        }
                        androidx.compose.animation.core.e1 e1VarQ = animateFloat.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.q(120, 0, androidx.compose.animation.core.d0.d(), 2, null) : androidx.compose.animation.core.i.q(1, 74, null, 4, null);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar2.c0();
                        return e1VarQ;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        return a(bVar, pVar2, num.intValue());
                    }
                };
                pVarF.T(1399891485);
                kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
                androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE = VectorConvertersKt.e(yVar);
                pVarF.T(1847725064);
                zBooleanValue = ((Boolean) transitionN.h()).booleanValue();
                pVarF.T(1808111696);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
                }
                if (zBooleanValue) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                Float fValueOf = Float.valueOf(f10);
                boolean zBooleanValue3 = ((Boolean) transitionN.o()).booleanValue();
                pVarF.T(1808111696);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
                }
                float f12 = zBooleanValue3 ? 1.0f : 0.8f;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                m2VarM = TransitionKt.m(transitionN, fValueOf, Float.valueOf(f12), menuKt$DropdownMenuContent$scale$2.invoke(transitionN.m(), pVarF, 0), f1VarE, "FloatAnimation", pVarF, 0);
                pVarF.c0();
                pVarF.c0();
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @dl.d
                    @androidx.compose.runtime.h
                    public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<Boolean> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i16) {
                        kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                        pVar2.T(896631233);
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(896631233, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:101)");
                        }
                        androidx.compose.animation.core.e1 e1VarQ = animateFloat.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.q(30, 0, null, 6, null) : androidx.compose.animation.core.i.q(75, 0, null, 6, null);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar2.c0();
                        return e1VarQ;
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                        return a(bVar, pVar2, num.intValue());
                    }
                };
                pVarF.T(1399891485);
                androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE2 = VectorConvertersKt.e(yVar);
                pVarF.T(1847725064);
                zBooleanValue2 = ((Boolean) transitionN.h()).booleanValue();
                pVarF.T(1864763068);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
                }
                if (zBooleanValue2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                Float fValueOf2 = Float.valueOf(f11);
                boolean zBooleanValue4 = ((Boolean) transitionN.o()).booleanValue();
                pVarF.T(1864763068);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
                }
                float f13 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                m2VarM2 = TransitionKt.m(transitionN, fValueOf2, Float.valueOf(f13), menuKt$DropdownMenuContent$alpha$2.invoke(transitionN.m(), pVarF, 0), f1VarE2, "FloatAnimation", pVarF, 0);
                pVarF.c0();
                pVarF.c0();
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                pVarF.T(1618982084);
                zS = pVarF.s(m2VarM) | pVarF.s(m2VarM2) | pVarF.s(transformOriginState);
                objU = pVarF.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new yh.l<androidx.compose.ui.graphics.v0, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.v0 graphicsLayer) {
                            kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.P(MenuKt.b(m2VarM));
                            graphicsLayer.T(MenuKt.b(m2VarM));
                            graphicsLayer.f(MenuKt.c(m2VarM2));
                            graphicsLayer.q0(transformOriginState.getValue().getPackedValue());
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.v0 v0Var) {
                            a(v0Var);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA = GraphicsLayerModifierKt.a(companion, (yh.l) objU);
                t0.d0 d0Var = t0.d0.f139617a;
                androidx.compose.ui.n nVar4 = nVar3;
                SurfaceKt.a(nVarA, ShapesKt.d(d0Var.c(), pVarF, 6), ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), d0Var.a()), 0L, d0Var.b(), d0Var.b(), null, androidx.compose.runtime.internal.b.b(pVarF, -1651673913, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                        if ((i16 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1651673913, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:130)");
                        }
                        androidx.compose.ui.n nVarF = ScrollKt.f(androidx.compose.foundation.layout.b0.d(PaddingKt.m(nVar3, 0.0f, MenuKt.i(), 1, null), IntrinsicSize.Max), ScrollKt.c(0, pVar2, 0, 1), false, null, false, 14, null);
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i17 = i14 & bb.c.g.f32954lc;
                        pVar2.T(-483455358);
                        int i18 = i17 >> 3;
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar2, (i18 & 112) | (i18 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarF);
                        int i19 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.D()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i19 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        if (((i19 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        }
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12804096, 72);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar4;
            } else {
                pVarF.l();
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar5 = nVar2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    MenuKt.a(expandedStates, transformOriginState, nVar5, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            if (pVarF.s(content)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & bb.c.f.br) == 1170) {
            if (i15 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-159754260, i14, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
            }
            Transition transitionN2 = TransitionKt.n(expandedStates, "DropDownMenu", pVarF, androidx.compose.animation.core.r0.f4499d | 48 | (i14 & 14), 0);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$3 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<Boolean> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i16) {
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(839979861);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(839979861, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:75)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = animateFloat.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.q(120, 0, androidx.compose.animation.core.d0.d(), 2, null) : androidx.compose.animation.core.i.q(1, 74, null, 4, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            kotlin.jvm.internal.y yVar2 = kotlin.jvm.internal.y.f124996a;
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE3 = VectorConvertersKt.e(yVar2);
            pVarF.T(1847725064);
            zBooleanValue = ((Boolean) transitionN2.h()).booleanValue();
            pVarF.T(1808111696);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf3 = Float.valueOf(f10);
            boolean zBooleanValue5 = ((Boolean) transitionN2.o()).booleanValue();
            pVarF.T(1808111696);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue5) {
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2VarM = TransitionKt.m(transitionN2, fValueOf3, Float.valueOf(f12), menuKt$DropdownMenuContent$scale$3.invoke(transitionN2.m(), pVarF, 0), f1VarE3, "FloatAnimation", pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$3 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<Boolean> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i16) {
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(896631233);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(896631233, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:101)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = animateFloat.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.q(30, 0, null, 6, null) : androidx.compose.animation.core.i.q(75, 0, null, 6, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE4 = VectorConvertersKt.e(yVar2);
            pVarF.T(1847725064);
            zBooleanValue2 = ((Boolean) transitionN2.h()).booleanValue();
            pVarF.T(1864763068);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf4 = Float.valueOf(f11);
            boolean zBooleanValue6 = ((Boolean) transitionN2.o()).booleanValue();
            pVarF.T(1864763068);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue6) {
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2VarM2 = TransitionKt.m(transitionN2, fValueOf4, Float.valueOf(f13), menuKt$DropdownMenuContent$alpha$3.invoke(transitionN2.m(), pVarF, 0), f1VarE4, "FloatAnimation", pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
            pVarF.T(1618982084);
            zS = pVarF.s(m2VarM) | pVarF.s(m2VarM2) | pVarF.s(transformOriginState);
            objU = pVarF.U();
            if (zS) {
                objU = new yh.l<androidx.compose.ui.graphics.v0, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.v0 graphicsLayer) {
                        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.P(MenuKt.b(m2VarM));
                        graphicsLayer.T(MenuKt.b(m2VarM));
                        graphicsLayer.f(MenuKt.c(m2VarM2));
                        graphicsLayer.q0(transformOriginState.getValue().getPackedValue());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.v0 v0Var) {
                        a(v0Var);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            } else {
                objU = new yh.l<androidx.compose.ui.graphics.v0, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.v0 graphicsLayer) {
                        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.P(MenuKt.b(m2VarM));
                        graphicsLayer.T(MenuKt.b(m2VarM));
                        graphicsLayer.f(MenuKt.c(m2VarM2));
                        graphicsLayer.q0(transformOriginState.getValue().getPackedValue());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.v0 v0Var) {
                        a(v0Var);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarA2 = GraphicsLayerModifierKt.a(companion2, (yh.l) objU);
            t0.d0 d0Var2 = t0.d0.f139617a;
            androidx.compose.ui.n nVar6 = nVar3;
            SurfaceKt.a(nVarA2, ShapesKt.d(d0Var2.c(), pVarF, 6), ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), d0Var2.a()), 0L, d0Var2.b(), d0Var2.b(), null, androidx.compose.runtime.internal.b.b(pVarF, -1651673913, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    if ((i16 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1651673913, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:130)");
                    }
                    androidx.compose.ui.n nVarF = ScrollKt.f(androidx.compose.foundation.layout.b0.d(PaddingKt.m(nVar3, 0.0f, MenuKt.i(), 1, null), IntrinsicSize.Max), ScrollKt.c(0, pVar2, 0, 1), false, null, false, 14, null);
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i17 = i14 & bb.c.g.f32954lc;
                    pVar2.T(-483455358);
                    int i18 = i17 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar2, (i18 & 112) | (i18 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion3.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarF);
                    int i19 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.D()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarB, companion3.d());
                    Updater.j(pVarB, eVar, companion3.b());
                    Updater.j(pVarB, layoutDirection, companion3.c());
                    Updater.j(pVarB, d2Var, companion3.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i19 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    if (((i19 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    }
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 12804096, 72);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar6;
        } else {
            if (i15 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-159754260, i14, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
            }
            Transition transitionN3 = TransitionKt.n(expandedStates, "DropDownMenu", pVarF, androidx.compose.animation.core.r0.f4499d | 48 | (i14 & 14), 0);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$4 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<Boolean> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i16) {
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(839979861);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(839979861, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:75)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = animateFloat.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.q(120, 0, androidx.compose.animation.core.d0.d(), 2, null) : androidx.compose.animation.core.i.q(1, 74, null, 4, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            kotlin.jvm.internal.y yVar3 = kotlin.jvm.internal.y.f124996a;
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE5 = VectorConvertersKt.e(yVar3);
            pVarF.T(1847725064);
            zBooleanValue = ((Boolean) transitionN3.h()).booleanValue();
            pVarF.T(1808111696);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf5 = Float.valueOf(f10);
            boolean zBooleanValue7 = ((Boolean) transitionN3.o()).booleanValue();
            pVarF.T(1808111696);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue7) {
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2VarM = TransitionKt.m(transitionN3, fValueOf5, Float.valueOf(f12), menuKt$DropdownMenuContent$scale$4.invoke(transitionN3.m(), pVarF, 0), f1VarE5, "FloatAnimation", pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$4 = new yh.q<Transition.b<Boolean>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<Boolean> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i16) {
                    kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(896631233);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(896631233, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:101)");
                    }
                    androidx.compose.animation.core.e1 e1VarQ = animateFloat.b(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.i.q(30, 0, null, 6, null) : androidx.compose.animation.core.i.q(75, 0, null, 6, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return e1VarQ;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<Boolean> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVarF.T(1399891485);
            androidx.compose.animation.core.f1<Float, androidx.compose.animation.core.l> f1VarE6 = VectorConvertersKt.e(yVar3);
            pVarF.T(1847725064);
            zBooleanValue2 = ((Boolean) transitionN3.h()).booleanValue();
            pVarF.T(1864763068);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            Float fValueOf6 = Float.valueOf(f11);
            boolean zBooleanValue8 = ((Boolean) transitionN3.o()).booleanValue();
            pVarF.T(1864763068);
            if (ComposerKt.g0()) {
                ComposerKt.w0(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue8) {
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVarF.c0();
            m2VarM2 = TransitionKt.m(transitionN3, fValueOf6, Float.valueOf(f13), menuKt$DropdownMenuContent$alpha$4.invoke(transitionN3.m(), pVarF, 0), f1VarE6, "FloatAnimation", pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            androidx.compose.ui.n.Companion companion3 = androidx.compose.ui.n.INSTANCE;
            pVarF.T(1618982084);
            zS = pVarF.s(m2VarM) | pVarF.s(m2VarM2) | pVarF.s(transformOriginState);
            objU = pVarF.U();
            if (zS) {
                objU = new yh.l<androidx.compose.ui.graphics.v0, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.v0 graphicsLayer) {
                        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.P(MenuKt.b(m2VarM));
                        graphicsLayer.T(MenuKt.b(m2VarM));
                        graphicsLayer.f(MenuKt.c(m2VarM2));
                        graphicsLayer.q0(transformOriginState.getValue().getPackedValue());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.v0 v0Var) {
                        a(v0Var);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            } else {
                objU = new yh.l<androidx.compose.ui.graphics.v0, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.v0 graphicsLayer) {
                        kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.P(MenuKt.b(m2VarM));
                        graphicsLayer.T(MenuKt.b(m2VarM));
                        graphicsLayer.f(MenuKt.c(m2VarM2));
                        graphicsLayer.q0(transformOriginState.getValue().getPackedValue());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.v0 v0Var) {
                        a(v0Var);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarA3 = GraphicsLayerModifierKt.a(companion3, (yh.l) objU);
            t0.d0 d0Var3 = t0.d0.f139617a;
            androidx.compose.ui.n nVar7 = nVar3;
            SurfaceKt.a(nVarA3, ShapesKt.d(d0Var3.c(), pVarF, 6), ColorSchemeKt.f(o0.f12059a.a(pVarF, 6), d0Var3.a()), 0L, d0Var3.b(), d0Var3.b(), null, androidx.compose.runtime.internal.b.b(pVarF, -1651673913, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    if ((i16 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1651673913, i16, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:130)");
                    }
                    androidx.compose.ui.n nVarF = ScrollKt.f(androidx.compose.foundation.layout.b0.d(PaddingKt.m(nVar3, 0.0f, MenuKt.i(), 1, null), IntrinsicSize.Max), ScrollKt.c(0, pVar2, 0, 1), false, null, false, 14, null);
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i17 = i14 & bb.c.g.f32954lc;
                    pVar2.T(-483455358);
                    int i18 = i17 >> 3;
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(Arrangement.f5896a.r(), androidx.compose.ui.c.INSTANCE.u(), pVar2, (i18 & 112) | (i18 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion4.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarF);
                    int i19 = ((((i17 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.D()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarB, companion4.d());
                    Updater.j(pVarB, eVar, companion4.b());
                    Updater.j(pVarB, layoutDirection, companion4.c());
                    Updater.j(pVarB, d2Var, companion4.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i19 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    if (((i19 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(ColumnScopeInstance.f5971a, pVar2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    }
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 12804096, 72);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar7;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar8 = nVar2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                MenuKt.a(expandedStates, transformOriginState, nVar8, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(@dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> text, @dl.d final yh.a<kotlin.b2> onClick, @dl.d final androidx.compose.ui.n modifier, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, final boolean z10, @dl.d final q0 colors, @dl.d final androidx.compose.foundation.layout.m0 contentPadding, @dl.d final androidx.compose.foundation.interaction.g interactionSource, @dl.e androidx.compose.runtime.p pVar3, final int i10) {
        int i11;
        androidx.compose.runtime.p pVar4;
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        kotlin.jvm.internal.f0.p(colors, "colors");
        kotlin.jvm.internal.f0.p(contentPadding, "contentPadding");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        androidx.compose.runtime.p pVarF = pVar3.F(-1564716777);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(onClick) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(modifier) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(pVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= pVarF.s(pVar2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= pVarF.u(z10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= pVarF.s(colors) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= pVarF.s(contentPadding) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= pVarF.s(interactionSource) ? 67108864 : 33554432;
        }
        final int i12 = i11;
        if ((191739611 & i12) == 38347922 && pVarF.b()) {
            pVarF.l();
            pVar4 = pVarF;
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1564716777, i12, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            androidx.compose.ui.n nVarN = SizeKt.n(ClickableKt.c(modifier, interactionSource, androidx.compose.material.ripple.j.e(true, 0.0f, 0L, pVarF, 6, 6), z10, null, null, onClick, 24, null), 0.0f, 1, null);
            float f10 = f9772d;
            float f11 = f9773e;
            t0.d0 d0Var = t0.d0.f139617a;
            androidx.compose.ui.n nVarJ = PaddingKt.j(SizeKt.G(nVarN, f10, d0Var.e(), f11, 0.0f, 8, null), contentPadding);
            androidx.compose.ui.c.InterfaceC0079c interfaceC0079cQ = androidx.compose.ui.c.INSTANCE.q();
            pVarF.T(693286680);
            androidx.compose.ui.layout.i0 i0VarD = RowKt.d(Arrangement.f5896a.p(), interfaceC0079cQ, pVarF, 48);
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarJ);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, i0VarD, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-678309503);
            final RowScopeInstance rowScopeInstance = RowScopeInstance.f6091a;
            pVarF.T(-837672837);
            pVar4 = pVarF;
            TextKt.a(TypographyKt.a(o0.f12059a.c(pVarF, 6), d0Var.l()), androidx.compose.runtime.internal.b.b(pVar4, 1065051884, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar5, int i13) {
                    if ((i13 & 11) == 2 && pVar5.b()) {
                        pVar5.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1065051884, i13, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:171)");
                    }
                    pVar5.T(1426254055);
                    if (pVar != null) {
                        androidx.compose.runtime.j1<androidx.compose.ui.graphics.l0> j1VarA = ContentColorKt.a();
                        q0 q0Var = colors;
                        boolean z11 = z10;
                        int i14 = i12;
                        androidx.compose.runtime.k1[] k1VarArr = {j1VarA.f(q0Var.a(z11, pVar5, ((i14 >> 15) & 112) | ((i14 >> 15) & 14)).getValue())};
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVar;
                        final int i15 = i12;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar5, 2035552199, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar7, int i16) {
                                if ((i16 & 11) == 2 && pVar7.b()) {
                                    pVar7.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(2035552199, i16, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:175)");
                                }
                                androidx.compose.ui.n nVarH = SizeKt.h(androidx.compose.ui.n.INSTANCE, t0.d0.f139617a.p(), 0.0f, 2, null);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar8 = pVar6;
                                int i17 = i15;
                                pVar7.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar7, 0);
                                pVar7.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar7.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar7.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar7.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion2.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarH);
                                if (!(pVar7.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar7.h();
                                if (pVar7.D()) {
                                    pVar7.L(aVarA2);
                                } else {
                                    pVar7.d();
                                }
                                pVar7.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar7);
                                Updater.j(pVarB2, i0VarK, companion2.d());
                                Updater.j(pVarB2, eVar2, companion2.b());
                                Updater.j(pVarB2, layoutDirection2, companion2.c());
                                Updater.j(pVarB2, d2Var2, companion2.f());
                                pVar7.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar7)), pVar7, 0);
                                pVar7.T(2058660585);
                                pVar7.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar7.T(1667854413);
                                pVar8.invoke(pVar7, Integer.valueOf((i17 >> 9) & 14));
                                pVar7.c0();
                                pVar7.c0();
                                pVar7.c0();
                                pVar7.f();
                                pVar7.c0();
                                pVar7.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                a(pVar7, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar5, 56);
                    }
                    pVar5.c0();
                    androidx.compose.runtime.j1<androidx.compose.ui.graphics.l0> j1VarA2 = ContentColorKt.a();
                    q0 q0Var2 = colors;
                    boolean z12 = z10;
                    int i16 = i12;
                    androidx.compose.runtime.k1[] k1VarArr2 = {j1VarA2.f(q0Var2.b(z12, pVar5, ((i16 >> 15) & 112) | ((i16 >> 15) & 14)).getValue())};
                    final androidx.compose.foundation.layout.x0 x0Var = rowScopeInstance;
                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = pVar;
                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar8 = pVar2;
                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = text;
                    final int i17 = i12;
                    CompositionLocalKt.b(k1VarArr2, androidx.compose.runtime.internal.b.b(pVar5, -1728894036, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i18) {
                            if ((i18 & 11) == 2 && pVar10.b()) {
                                pVar10.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1728894036, i18, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:181)");
                            }
                            androidx.compose.ui.n nVarO = PaddingKt.o(androidx.compose.foundation.layout.w0.a(x0Var, androidx.compose.ui.n.INSTANCE, 1.0f, false, 2, null), pVar7 != null ? MenuKt.f9770b : s1.h.g(0), 0.0f, pVar8 != null ? MenuKt.f9770b : s1.h.g(0), 0.0f, 10, null);
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11 = pVar9;
                            int i19 = i17;
                            pVar10.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar10, 0);
                            pVar10.T(-1323940314);
                            s1.e eVar2 = (s1.e) pVar10.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVar10.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar10.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarO);
                            if (!(pVar10.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar10.h();
                            if (pVar10.D()) {
                                pVar10.L(aVarA2);
                            } else {
                                pVar10.d();
                            }
                            pVar10.Y();
                            androidx.compose.runtime.p pVarB2 = Updater.b(pVar10);
                            Updater.j(pVarB2, i0VarK, companion2.d());
                            Updater.j(pVarB2, eVar2, companion2.b());
                            Updater.j(pVarB2, layoutDirection2, companion2.c());
                            Updater.j(pVarB2, d2Var2, companion2.f());
                            pVar10.x();
                            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar10)), pVar10, 0);
                            pVar10.T(2058660585);
                            pVar10.T(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                            pVar10.T(-1301783630);
                            pVar11.invoke(pVar10, Integer.valueOf(i19 & 14));
                            pVar10.c0();
                            pVar10.c0();
                            pVar10.c0();
                            pVar10.f();
                            pVar10.c0();
                            pVar10.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                            a(pVar10, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar5, 56);
                    if (pVar2 != null) {
                        androidx.compose.runtime.j1<androidx.compose.ui.graphics.l0> j1VarA3 = ContentColorKt.a();
                        q0 q0Var3 = colors;
                        boolean z13 = z10;
                        int i18 = i12;
                        androidx.compose.runtime.k1[] k1VarArr3 = {j1VarA3.f(q0Var3.c(z13, pVar5, ((i18 >> 15) & 112) | ((i18 >> 15) & 14)).getValue())};
                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar10 = pVar2;
                        final int i19 = i12;
                        CompositionLocalKt.b(k1VarArr3, androidx.compose.runtime.internal.b.b(pVar5, 580312062, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11, int i20) {
                                if ((i20 & 11) == 2 && pVar11.b()) {
                                    pVar11.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(580312062, i20, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:204)");
                                }
                                androidx.compose.ui.n nVarH = SizeKt.h(androidx.compose.ui.n.INSTANCE, t0.d0.f139617a.w(), 0.0f, 2, null);
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar12 = pVar10;
                                int i21 = i19;
                                pVar11.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar11, 0);
                                pVar11.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVar11.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar11.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar11.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion2.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarH);
                                if (!(pVar11.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar11.h();
                                if (pVar11.D()) {
                                    pVar11.L(aVarA2);
                                } else {
                                    pVar11.d();
                                }
                                pVar11.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar11);
                                Updater.j(pVarB2, i0VarK, companion2.d());
                                Updater.j(pVarB2, eVar2, companion2.b());
                                Updater.j(pVarB2, layoutDirection2, companion2.c());
                                Updater.j(pVarB2, d2Var2, companion2.f());
                                pVar11.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar11)), pVar11, 0);
                                pVar11.T(2058660585);
                                pVar11.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar11.T(-589942012);
                                pVar12.invoke(pVar11, Integer.valueOf((i21 >> 12) & 14));
                                pVar11.c0();
                                pVar11.c0();
                                pVar11.c0();
                                pVar11.f();
                                pVar11.c0();
                                pVar11.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                                a(pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar5, 56);
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                    a(pVar5, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar4, 48);
            pVar4.c0();
            pVar4.c0();
            pVar4.c0();
            pVar4.f();
            pVar4.c0();
            pVar4.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVar4.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i13) {
                MenuKt.d(text, onClick, modifier, pVar, pVar2, z10, colors, contentPadding, interactionSource, pVar5, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                a(pVar5, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long h(@dl.d s1.p parentBounds, @dl.d s1.p menuBounds) {
        float fMax;
        kotlin.jvm.internal.f0.p(parentBounds, "parentBounds");
        kotlin.jvm.internal.f0.p(menuBounds, "menuBounds");
        float fMax2 = 1.0f;
        if (menuBounds.t() >= parentBounds.x()) {
            fMax = 0.0f;
        } else if (menuBounds.x() <= parentBounds.t()) {
            fMax = 1.0f;
        } else if (menuBounds.G() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((Math.max(parentBounds.t(), menuBounds.t()) + Math.min(parentBounds.x(), menuBounds.x())) / 2) - menuBounds.t()) / menuBounds.G();
        }
        if (menuBounds.getF139243b() >= parentBounds.j()) {
            fMax2 = 0.0f;
        } else if (menuBounds.j() > parentBounds.getF139243b()) {
            if (menuBounds.r() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(parentBounds.getF139243b(), menuBounds.getF139243b()) + Math.min(parentBounds.j(), menuBounds.j())) / 2) - menuBounds.getF139243b()) / menuBounds.r();
            }
        }
        return p2.a(fMax, fMax2);
    }

    public static final float i() {
        return f9771c;
    }

    public static final float j() {
        return f9769a;
    }
}
