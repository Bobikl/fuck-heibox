package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.h2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import s1.r;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\"\u0017\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "expanded", "Lkotlin/Function1;", "Lkotlin/b2;", "onExpandedChange", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/material3/x;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(ZLyh/l;Landroidx/compose/ui/n;Lyh/q;Landroidx/compose/runtime/p;II)V", "Lkotlin/Function0;", "", "menuDescription", "expandedDescription", "collapsedDescription", "m", "(Landroidx/compose/ui/n;ZLyh/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/p;II)Landroidx/compose/ui/n;", "Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/ui/layout/q;", "coordinates", "", "verticalMarginInPx", "onHeightUpdate", "n", "Ls1/h;", "F", "ExposedDropdownMenuItemHorizontalPadding", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ExposedDropdownMenuKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9408a = s1.h.g(16);

    /* JADX WARN: Code duplicated, block: B:101:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170 A[LOOP:0: B:69:0x016e->B:70:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223  */
    /* JADX WARN: Code duplicated, block: B:83:0x022f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0233  */
    /* JADX WARN: Code duplicated, block: B:87:0x0284  */
    /* JADX WARN: Code duplicated, block: B:91:0x028f  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ae  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(final boolean z10, @dl.d final yh.l<? super Boolean, kotlin.b2> onExpandedChange, @dl.e androidx.compose.ui.n nVar, @dl.d final yh.q<? super x, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        final int i14;
        androidx.compose.ui.n nVar3;
        final s1.e eVar;
        final View view;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        final androidx.compose.runtime.a1 a1Var;
        Object objU2;
        androidx.compose.runtime.a1 a1Var2;
        int iE1;
        Object objU3;
        final androidx.compose.ui.node.h1 h1Var;
        Object objU4;
        FocusRequester focusRequester;
        int i15;
        Object[] objArr;
        int i16;
        boolean zS;
        Object objU5;
        ?? r14;
        final FocusRequester focusRequester2;
        final int i17;
        final androidx.compose.runtime.a1 a1Var3;
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
        int i18;
        int i19;
        yh.a<ComposeUiNode> aVarA;
        int i20;
        final androidx.compose.ui.n nVar4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onExpandedChange, "onExpandedChange");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1990697039);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(onExpandedChange) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
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
                if (i21 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1990697039, i14, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:102)");
                }
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(0, null, 2, null);
                    pVarF.N(objU);
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = h2.g(0, null, 2, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                a1Var2 = (androidx.compose.runtime.a1) objU2;
                iE1 = eVar.e1(MenuKt.j());
                pVarF.T(-492369756);
                objU3 = pVarF.U();
                if (objU3 == companion.a()) {
                    objU3 = new androidx.compose.ui.node.h1();
                    pVarF.N(objU3);
                }
                pVarF.c0();
                h1Var = (androidx.compose.ui.node.h1) objU3;
                pVarF.T(-492369756);
                objU4 = pVarF.U();
                if (objU4 == companion.a()) {
                    objU4 = new FocusRequester();
                    pVarF.N(objU4);
                }
                pVarF.c0();
                focusRequester = (FocusRequester) objU4;
                objArr = new Object[]{Boolean.valueOf(z10), onExpandedChange, eVar, Integer.valueOf(d(a1Var2)), Integer.valueOf(b(a1Var))};
                pVarF.T(-568225417);
                i16 = 0;
                zS = false;
                for (i15 = 5; i16 < i15; i15 = 5) {
                    zS |= pVarF.s(objArr[i16]);
                    i16++;
                }
                objU5 = pVarF.U();
                if (!zS || objU5 == androidx.compose.runtime.p.INSTANCE.a()) {
                    r14 = 0;
                    focusRequester2 = focusRequester;
                    i17 = iE1;
                    a1Var3 = a1Var2;
                    x xVar = new x() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material3.x
                        public /* synthetic */ void a(boolean z11, yh.a aVar, androidx.compose.ui.n nVar5, yh.q qVar, androidx.compose.runtime.p pVar2, int i22, int i23) {
                            ExposedDropdownMenuBoxScope$CC.a(this, z11, aVar, nVar5, qVar, pVar2, i22, i23);
                        }

                        @Override // androidx.compose.material3.x
                        @dl.d
                        public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar5, boolean z11) {
                            kotlin.jvm.internal.f0.p(nVar5, "<this>");
                            s1.e eVar2 = eVar;
                            androidx.compose.runtime.a1<Integer> a1Var4 = a1Var3;
                            androidx.compose.runtime.a1<Integer> a1Var5 = a1Var;
                            androidx.compose.ui.n nVarQ = SizeKt.q(nVar5, 0.0f, eVar2.E(ExposedDropdownMenuKt.d(a1Var4)), 1, null);
                            return z11 ? SizeKt.H(nVarQ, eVar2.E(ExposedDropdownMenuKt.b(a1Var5))) : nVarQ;
                        }

                        @Override // androidx.compose.material3.x
                        @dl.d
                        public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar5) {
                            kotlin.jvm.internal.f0.p(nVar5, "<this>");
                            yh.l<androidx.compose.ui.platform.x0, kotlin.b2> lVarB = InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                                public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                                    kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                                    x0Var.d("menuAnchor");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                                    a(x0Var);
                                    return kotlin.b2.f124493a;
                                }
                            } : InspectableValueKt.b();
                            final boolean z11 = z10;
                            final yh.l<Boolean, kotlin.b2> lVar = onExpandedChange;
                            final int i22 = i14;
                            final FocusRequester focusRequester3 = focusRequester2;
                            final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                            final View view2 = view;
                            final int i23 = i17;
                            final androidx.compose.runtime.a1<Integer> a1Var4 = a1Var;
                            final androidx.compose.runtime.a1<Integer> a1Var5 = a1Var3;
                            return ComposedModifierKt.g(nVar5, lVarB, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @dl.d
                                @androidx.compose.runtime.h
                                public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar2, int i24) {
                                    kotlin.jvm.internal.f0.p(composed, "$this$composed");
                                    pVar2.T(1714866713);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1714866713, i24, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)");
                                    }
                                    final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var3 = h1Var2;
                                    final View view3 = view2;
                                    final int i25 = i23;
                                    final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var4;
                                    final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var5;
                                    androidx.compose.ui.n nVarA = OnGloballyPositionedModifierKt.a(composed, new yh.l<androidx.compose.ui.layout.q, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.q it) {
                                            kotlin.jvm.internal.f0.p(it, "it");
                                            ExposedDropdownMenuKt.c(a1Var6, r.m(it.a()));
                                            h1Var3.b(it);
                                            View rootView = view3.getRootView();
                                            kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                                            androidx.compose.ui.layout.q qVarA = h1Var3.a();
                                            int i26 = i25;
                                            final androidx.compose.runtime.a1<Integer> a1Var8 = a1Var7;
                                            ExposedDropdownMenuKt.n(rootView, qVarA, i26, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox.scope.1.1.menuAnchor.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final void a(int i27) {
                                                    ExposedDropdownMenuKt.e(a1Var8, i27);
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                                    a(num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            });
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.q qVar) {
                                            a(qVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    boolean z12 = z11;
                                    yh.l<Boolean, kotlin.b2> lVar2 = lVar;
                                    Boolean boolValueOf = Boolean.valueOf(z12);
                                    final yh.l<Boolean, kotlin.b2> lVar3 = lVar;
                                    final boolean z13 = z11;
                                    pVar2.T(511388516);
                                    boolean zS2 = pVar2.s(lVar2) | pVar2.s(boolValueOf);
                                    Object objU6 = pVar2.U();
                                    if (zS2 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                                        objU6 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // yh.a
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                                invoke2();
                                                return kotlin.b2.f124493a;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                lVar3.invoke(Boolean.valueOf(!z13));
                                            }
                                        };
                                        pVar2.N(objU6);
                                    }
                                    pVar2.c0();
                                    androidx.compose.ui.n nVarA2 = FocusRequesterModifierKt.a(ExposedDropdownMenuKt.m(nVarA, z12, (yh.a) objU6, null, null, null, pVar2, (i22 << 3) & 112, 28), focusRequester3);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                    pVar2.c0();
                                    return nVarA2;
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar6, androidx.compose.runtime.p pVar2, Integer num) {
                                    return a(nVar6, pVar2, num.intValue());
                                }
                            });
                        }
                    };
                    pVarF.N(xVar);
                    objU5 = xVar;
                } else {
                    focusRequester2 = focusRequester;
                    i17 = iE1;
                    a1Var3 = a1Var2;
                    r14 = 0;
                }
                pVarF.c0();
                exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objU5;
                i18 = i14 >> 6;
                i19 = i18 & 14;
                pVarF.T(733328855);
                int i22 = i19 >> 3;
                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), r14, pVarF, (i22 & 112) | (i22 & 14));
                pVarF.T(-1323940314);
                s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                aVarA = companion2.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVar3);
                i20 = ((((i19 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                Updater.j(pVarB, i0VarK, companion2.d());
                Updater.j(pVarB, eVar2, companion2.b());
                Updater.j(pVarB, layoutDirection, companion2.c());
                Updater.j(pVarB, d2Var, companion2.f());
                pVarF.x();
                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i20 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                if (((i20 >> 9) & 14 & 11) == 2 || !pVarF.b()) {
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                    pVarF.T(-738793417);
                    if (((((i19 >> 6) & 112) | 6) & 81) == 16 || !pVarF.b()) {
                        content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                    } else {
                        pVarF.l();
                    }
                    pVarF.c0();
                } else {
                    pVarF.l();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                final FocusRequester focusRequester3 = focusRequester2;
                EffectsKt.k(new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                        invoke2();
                        return kotlin.b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (z10) {
                            focusRequester3.g();
                        }
                    }
                }, pVarF, r14);
                final int i23 = i17;
                final androidx.compose.runtime.a1 a1Var4 = a1Var3;
                EffectsKt.c(view, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3

                    /* JADX INFO: compiled from: Effects.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                    public static final class a implements androidx.compose.runtime.e0 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        final /* synthetic */ z0 f9415a;

                        public a(z0 z0Var) {
                            this.f9415a = z0Var;
                        }

                        @Override // androidx.compose.runtime.e0
                        public void dispose() {
                            this.f9415a.a();
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
                        final View view2 = view;
                        final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                        final int i24 = i23;
                        final androidx.compose.runtime.a1<Integer> a1Var5 = a1Var4;
                        return new a(new z0(view2, new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                invoke2();
                                return kotlin.b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                View rootView = view2.getRootView();
                                kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                                androidx.compose.ui.layout.q qVarA = h1Var2.a();
                                int i25 = i24;
                                final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var5;
                                ExposedDropdownMenuKt.n(rootView, qVarA, i25, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void a(int i26) {
                                        ExposedDropdownMenuKt.e(a1Var6, i26);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                        a(num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            }
                        }));
                    }
                }, pVarF, 8);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
            } else {
                pVarF.l();
                nVar4 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                    ExposedDropdownMenuKt.a(z10, onExpandedChange, nVar4, content, pVar2, i10 | 1, i11);
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
            if (i21 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1990697039, i14, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:102)");
            }
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = h2.g(0, null, 2, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a1Var = (androidx.compose.runtime.a1) objU;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = h2.g(0, null, 2, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            a1Var2 = (androidx.compose.runtime.a1) objU2;
            iE1 = eVar.e1(MenuKt.j());
            pVarF.T(-492369756);
            objU3 = pVarF.U();
            if (objU3 == companion.a()) {
                objU3 = new androidx.compose.ui.node.h1();
                pVarF.N(objU3);
            }
            pVarF.c0();
            h1Var = (androidx.compose.ui.node.h1) objU3;
            pVarF.T(-492369756);
            objU4 = pVarF.U();
            if (objU4 == companion.a()) {
                objU4 = new FocusRequester();
                pVarF.N(objU4);
            }
            pVarF.c0();
            focusRequester = (FocusRequester) objU4;
            objArr = new Object[]{Boolean.valueOf(z10), onExpandedChange, eVar, Integer.valueOf(d(a1Var2)), Integer.valueOf(b(a1Var))};
            pVarF.T(-568225417);
            i16 = 0;
            zS = false;
            while (i16 < i15) {
                zS |= pVarF.s(objArr[i16]);
                i16++;
            }
            objU5 = pVarF.U();
            if (zS) {
                r14 = 0;
                focusRequester2 = focusRequester;
                i17 = iE1;
                a1Var3 = a1Var2;
                x xVar2 = new x() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.x
                    public /* synthetic */ void a(boolean z11, yh.a aVar, androidx.compose.ui.n nVar5, yh.q qVar, androidx.compose.runtime.p pVar2, int i24, int i25) {
                        ExposedDropdownMenuBoxScope$CC.a(this, z11, aVar, nVar5, qVar, pVar2, i24, i25);
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar5, boolean z11) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        s1.e eVar3 = eVar;
                        androidx.compose.runtime.a1<Integer> a1Var5 = a1Var3;
                        androidx.compose.runtime.a1<Integer> a1Var6 = a1Var;
                        androidx.compose.ui.n nVarQ = SizeKt.q(nVar5, 0.0f, eVar3.E(ExposedDropdownMenuKt.d(a1Var5)), 1, null);
                        return z11 ? SizeKt.H(nVarQ, eVar3.E(ExposedDropdownMenuKt.b(a1Var6))) : nVarQ;
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar5) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        yh.l<androidx.compose.ui.platform.x0, kotlin.b2> lVarB = InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                                x0Var.d("menuAnchor");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                                a(x0Var);
                                return kotlin.b2.f124493a;
                            }
                        } : InspectableValueKt.b();
                        final boolean z11 = z10;
                        final yh.l<? super Boolean, kotlin.b2> lVar = onExpandedChange;
                        final int i24 = i14;
                        final FocusRequester focusRequester4 = focusRequester2;
                        final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                        final View view2 = view;
                        final int i25 = i17;
                        final androidx.compose.runtime.a1<Integer> a1Var5 = a1Var;
                        final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var3;
                        return ComposedModifierKt.g(nVar5, lVarB, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @dl.d
                            @androidx.compose.runtime.h
                            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar2, int i26) {
                                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                                pVar2.T(1714866713);
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1714866713, i26, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)");
                                }
                                final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var3 = h1Var2;
                                final View view3 = view2;
                                final int i27 = i25;
                                final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var5;
                                final androidx.compose.runtime.a1<Integer> a1Var8 = a1Var6;
                                androidx.compose.ui.n nVarA = OnGloballyPositionedModifierKt.a(composed, new yh.l<androidx.compose.ui.layout.q, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.q it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                        ExposedDropdownMenuKt.c(a1Var7, r.m(it.a()));
                                        h1Var3.b(it);
                                        View rootView = view3.getRootView();
                                        kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                                        androidx.compose.ui.layout.q qVarA = h1Var3.a();
                                        int i28 = i27;
                                        final androidx.compose.runtime.a1<Integer> a1Var9 = a1Var8;
                                        ExposedDropdownMenuKt.n(rootView, qVarA, i28, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox.scope.1.1.menuAnchor.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void a(int i29) {
                                                ExposedDropdownMenuKt.e(a1Var9, i29);
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                                a(num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.q qVar) {
                                        a(qVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                boolean z12 = z11;
                                yh.l<Boolean, kotlin.b2> lVar2 = lVar;
                                Boolean boolValueOf = Boolean.valueOf(z12);
                                final yh.l<? super Boolean, kotlin.b2> lVar3 = lVar;
                                final boolean z13 = z11;
                                pVar2.T(511388516);
                                boolean zS2 = pVar2.s(lVar2) | pVar2.s(boolValueOf);
                                Object objU6 = pVar2.U();
                                if (zS2 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU6 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                            invoke2();
                                            return kotlin.b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            lVar3.invoke(Boolean.valueOf(!z13));
                                        }
                                    };
                                    pVar2.N(objU6);
                                }
                                pVar2.c0();
                                androidx.compose.ui.n nVarA2 = FocusRequesterModifierKt.a(ExposedDropdownMenuKt.m(nVarA, z12, (yh.a) objU6, null, null, null, pVar2, (i24 << 3) & 112, 28), focusRequester4);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                pVar2.c0();
                                return nVarA2;
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar6, androidx.compose.runtime.p pVar2, Integer num) {
                                return a(nVar6, pVar2, num.intValue());
                            }
                        });
                    }
                };
                pVarF.N(xVar2);
                objU5 = xVar2;
            } else {
                r14 = 0;
                focusRequester2 = focusRequester;
                i17 = iE1;
                a1Var3 = a1Var2;
                x xVar3 = new x() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.x
                    public /* synthetic */ void a(boolean z11, yh.a aVar, androidx.compose.ui.n nVar5, yh.q qVar, androidx.compose.runtime.p pVar2, int i24, int i25) {
                        ExposedDropdownMenuBoxScope$CC.a(this, z11, aVar, nVar5, qVar, pVar2, i24, i25);
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar5, boolean z11) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        s1.e eVar3 = eVar;
                        androidx.compose.runtime.a1<Integer> a1Var5 = a1Var3;
                        androidx.compose.runtime.a1<Integer> a1Var6 = a1Var;
                        androidx.compose.ui.n nVarQ = SizeKt.q(nVar5, 0.0f, eVar3.E(ExposedDropdownMenuKt.d(a1Var5)), 1, null);
                        return z11 ? SizeKt.H(nVarQ, eVar3.E(ExposedDropdownMenuKt.b(a1Var6))) : nVarQ;
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar5) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        yh.l<androidx.compose.ui.platform.x0, kotlin.b2> lVarB = InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                                x0Var.d("menuAnchor");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                                a(x0Var);
                                return kotlin.b2.f124493a;
                            }
                        } : InspectableValueKt.b();
                        final boolean z11 = z10;
                        final yh.l<? super Boolean, kotlin.b2> lVar = onExpandedChange;
                        final int i24 = i14;
                        final FocusRequester focusRequester4 = focusRequester2;
                        final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                        final View view2 = view;
                        final int i25 = i17;
                        final androidx.compose.runtime.a1<Integer> a1Var5 = a1Var;
                        final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var3;
                        return ComposedModifierKt.g(nVar5, lVarB, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @dl.d
                            @androidx.compose.runtime.h
                            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar2, int i26) {
                                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                                pVar2.T(1714866713);
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1714866713, i26, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)");
                                }
                                final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var3 = h1Var2;
                                final View view3 = view2;
                                final int i27 = i25;
                                final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var5;
                                final androidx.compose.runtime.a1<Integer> a1Var8 = a1Var6;
                                androidx.compose.ui.n nVarA = OnGloballyPositionedModifierKt.a(composed, new yh.l<androidx.compose.ui.layout.q, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.q it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                        ExposedDropdownMenuKt.c(a1Var7, r.m(it.a()));
                                        h1Var3.b(it);
                                        View rootView = view3.getRootView();
                                        kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                                        androidx.compose.ui.layout.q qVarA = h1Var3.a();
                                        int i28 = i27;
                                        final androidx.compose.runtime.a1<Integer> a1Var9 = a1Var8;
                                        ExposedDropdownMenuKt.n(rootView, qVarA, i28, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox.scope.1.1.menuAnchor.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void a(int i29) {
                                                ExposedDropdownMenuKt.e(a1Var9, i29);
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                                a(num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.q qVar) {
                                        a(qVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                boolean z12 = z11;
                                yh.l<Boolean, kotlin.b2> lVar2 = lVar;
                                Boolean boolValueOf = Boolean.valueOf(z12);
                                final yh.l<? super Boolean, kotlin.b2> lVar3 = lVar;
                                final boolean z13 = z11;
                                pVar2.T(511388516);
                                boolean zS2 = pVar2.s(lVar2) | pVar2.s(boolValueOf);
                                Object objU6 = pVar2.U();
                                if (zS2 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU6 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                            invoke2();
                                            return kotlin.b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            lVar3.invoke(Boolean.valueOf(!z13));
                                        }
                                    };
                                    pVar2.N(objU6);
                                }
                                pVar2.c0();
                                androidx.compose.ui.n nVarA2 = FocusRequesterModifierKt.a(ExposedDropdownMenuKt.m(nVarA, z12, (yh.a) objU6, null, null, null, pVar2, (i24 << 3) & 112, 28), focusRequester4);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                pVar2.c0();
                                return nVarA2;
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar6, androidx.compose.runtime.p pVar2, Integer num) {
                                return a(nVar6, pVar2, num.intValue());
                            }
                        });
                    }
                };
                pVarF.N(xVar3);
                objU5 = xVar3;
            }
            pVarF.c0();
            exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objU5;
            i18 = i14 >> 6;
            i19 = i18 & 14;
            pVarF.T(733328855);
            int i24 = i19 >> 3;
            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), r14, pVarF, (i24 & 112) | (i24 & 14));
            pVarF.T(-1323940314);
            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            aVarA = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVar3);
            i20 = ((((i19 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
            Updater.j(pVarB2, i0VarK2, companion3.d());
            Updater.j(pVarB2, eVar3, companion3.b());
            Updater.j(pVarB2, layoutDirection2, companion3.c());
            Updater.j(pVarB2, d2Var2, companion3.f());
            pVarF.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i20 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            if (((i20 >> 9) & 14 & 11) == 2) {
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                pVarF.T(-738793417);
                if (((((i19 >> 6) & 112) | 6) & 81) == 16) {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                } else {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                }
                pVarF.c0();
            } else {
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                pVarF.T(-738793417);
                if (((((i19 >> 6) & 112) | 6) & 81) == 16) {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                } else {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                }
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            final FocusRequester focusRequester4 = focusRequester2;
            EffectsKt.k(new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (z10) {
                        focusRequester4.g();
                    }
                }
            }, pVarF, r14);
            final int i25 = i17;
            final androidx.compose.runtime.a1<Integer> a1Var5 = a1Var3;
            EffectsKt.c(view, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ z0 f9415a;

                    public a(z0 z0Var) {
                        this.f9415a = z0Var;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f9415a.a();
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
                    final View view2 = view;
                    final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                    final int i26 = i25;
                    final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var5;
                    return new a(new z0(view2, new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            View rootView = view2.getRootView();
                            kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                            androidx.compose.ui.layout.q qVarA = h1Var2.a();
                            int i27 = i26;
                            final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var6;
                            ExposedDropdownMenuKt.n(rootView, qVarA, i27, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(int i28) {
                                    ExposedDropdownMenuKt.e(a1Var7, i28);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                    a(num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        }
                    }));
                }
            }, pVarF, 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
        } else {
            if (i21 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1990697039, i14, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:102)");
            }
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = h2.g(0, null, 2, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a1Var = (androidx.compose.runtime.a1) objU;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = h2.g(0, null, 2, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            a1Var2 = (androidx.compose.runtime.a1) objU2;
            iE1 = eVar.e1(MenuKt.j());
            pVarF.T(-492369756);
            objU3 = pVarF.U();
            if (objU3 == companion.a()) {
                objU3 = new androidx.compose.ui.node.h1();
                pVarF.N(objU3);
            }
            pVarF.c0();
            h1Var = (androidx.compose.ui.node.h1) objU3;
            pVarF.T(-492369756);
            objU4 = pVarF.U();
            if (objU4 == companion.a()) {
                objU4 = new FocusRequester();
                pVarF.N(objU4);
            }
            pVarF.c0();
            focusRequester = (FocusRequester) objU4;
            objArr = new Object[]{Boolean.valueOf(z10), onExpandedChange, eVar, Integer.valueOf(d(a1Var2)), Integer.valueOf(b(a1Var))};
            pVarF.T(-568225417);
            i16 = 0;
            zS = false;
            while (i16 < i15) {
                zS |= pVarF.s(objArr[i16]);
                i16++;
            }
            objU5 = pVarF.U();
            if (zS) {
                r14 = 0;
                focusRequester2 = focusRequester;
                i17 = iE1;
                a1Var3 = a1Var2;
                x xVar4 = new x() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.x
                    public /* synthetic */ void a(boolean z11, yh.a aVar, androidx.compose.ui.n nVar5, yh.q qVar, androidx.compose.runtime.p pVar2, int i26, int i27) {
                        ExposedDropdownMenuBoxScope$CC.a(this, z11, aVar, nVar5, qVar, pVar2, i26, i27);
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar5, boolean z11) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        s1.e eVar4 = eVar;
                        androidx.compose.runtime.a1<Integer> a1Var6 = a1Var3;
                        androidx.compose.runtime.a1<Integer> a1Var7 = a1Var;
                        androidx.compose.ui.n nVarQ = SizeKt.q(nVar5, 0.0f, eVar4.E(ExposedDropdownMenuKt.d(a1Var6)), 1, null);
                        return z11 ? SizeKt.H(nVarQ, eVar4.E(ExposedDropdownMenuKt.b(a1Var7))) : nVarQ;
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar5) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        yh.l<androidx.compose.ui.platform.x0, kotlin.b2> lVarB = InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                                x0Var.d("menuAnchor");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                                a(x0Var);
                                return kotlin.b2.f124493a;
                            }
                        } : InspectableValueKt.b();
                        final boolean z11 = z10;
                        final yh.l<? super Boolean, kotlin.b2> lVar = onExpandedChange;
                        final int i26 = i14;
                        final FocusRequester focusRequester5 = focusRequester2;
                        final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                        final View view2 = view;
                        final int i27 = i17;
                        final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var;
                        final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var3;
                        return ComposedModifierKt.g(nVar5, lVarB, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @dl.d
                            @androidx.compose.runtime.h
                            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar2, int i28) {
                                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                                pVar2.T(1714866713);
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1714866713, i28, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)");
                                }
                                final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var3 = h1Var2;
                                final View view3 = view2;
                                final int i29 = i27;
                                final androidx.compose.runtime.a1<Integer> a1Var8 = a1Var6;
                                final androidx.compose.runtime.a1<Integer> a1Var9 = a1Var7;
                                androidx.compose.ui.n nVarA = OnGloballyPositionedModifierKt.a(composed, new yh.l<androidx.compose.ui.layout.q, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.q it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                        ExposedDropdownMenuKt.c(a1Var8, r.m(it.a()));
                                        h1Var3.b(it);
                                        View rootView = view3.getRootView();
                                        kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                                        androidx.compose.ui.layout.q qVarA = h1Var3.a();
                                        int i210 = i29;
                                        final androidx.compose.runtime.a1<Integer> a1Var10 = a1Var9;
                                        ExposedDropdownMenuKt.n(rootView, qVarA, i210, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox.scope.1.1.menuAnchor.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void a(int i211) {
                                                ExposedDropdownMenuKt.e(a1Var10, i211);
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                                a(num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.q qVar) {
                                        a(qVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                boolean z12 = z11;
                                yh.l<Boolean, kotlin.b2> lVar2 = lVar;
                                Boolean boolValueOf = Boolean.valueOf(z12);
                                final yh.l<? super Boolean, kotlin.b2> lVar3 = lVar;
                                final boolean z13 = z11;
                                pVar2.T(511388516);
                                boolean zS2 = pVar2.s(lVar2) | pVar2.s(boolValueOf);
                                Object objU6 = pVar2.U();
                                if (zS2 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU6 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                            invoke2();
                                            return kotlin.b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            lVar3.invoke(Boolean.valueOf(!z13));
                                        }
                                    };
                                    pVar2.N(objU6);
                                }
                                pVar2.c0();
                                androidx.compose.ui.n nVarA2 = FocusRequesterModifierKt.a(ExposedDropdownMenuKt.m(nVarA, z12, (yh.a) objU6, null, null, null, pVar2, (i26 << 3) & 112, 28), focusRequester5);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                pVar2.c0();
                                return nVarA2;
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar6, androidx.compose.runtime.p pVar2, Integer num) {
                                return a(nVar6, pVar2, num.intValue());
                            }
                        });
                    }
                };
                pVarF.N(xVar4);
                objU5 = xVar4;
            } else {
                r14 = 0;
                focusRequester2 = focusRequester;
                i17 = iE1;
                a1Var3 = a1Var2;
                x xVar5 = new x() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.x
                    public /* synthetic */ void a(boolean z11, yh.a aVar, androidx.compose.ui.n nVar5, yh.q qVar, androidx.compose.runtime.p pVar2, int i26, int i27) {
                        ExposedDropdownMenuBoxScope$CC.a(this, z11, aVar, nVar5, qVar, pVar2, i26, i27);
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar5, boolean z11) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        s1.e eVar4 = eVar;
                        androidx.compose.runtime.a1<Integer> a1Var6 = a1Var3;
                        androidx.compose.runtime.a1<Integer> a1Var7 = a1Var;
                        androidx.compose.ui.n nVarQ = SizeKt.q(nVar5, 0.0f, eVar4.E(ExposedDropdownMenuKt.d(a1Var6)), 1, null);
                        return z11 ? SizeKt.H(nVarQ, eVar4.E(ExposedDropdownMenuKt.b(a1Var7))) : nVarQ;
                    }

                    @Override // androidx.compose.material3.x
                    @dl.d
                    public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar5) {
                        kotlin.jvm.internal.f0.p(nVar5, "<this>");
                        yh.l<androidx.compose.ui.platform.x0, kotlin.b2> lVarB = InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1
                            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                                x0Var.d("menuAnchor");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                                a(x0Var);
                                return kotlin.b2.f124493a;
                            }
                        } : InspectableValueKt.b();
                        final boolean z11 = z10;
                        final yh.l<? super Boolean, kotlin.b2> lVar = onExpandedChange;
                        final int i26 = i14;
                        final FocusRequester focusRequester5 = focusRequester2;
                        final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                        final View view2 = view;
                        final int i27 = i17;
                        final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var;
                        final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var3;
                        return ComposedModifierKt.g(nVar5, lVarB, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @dl.d
                            @androidx.compose.runtime.h
                            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar2, int i28) {
                                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                                pVar2.T(1714866713);
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1714866713, i28, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)");
                                }
                                final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var3 = h1Var2;
                                final View view3 = view2;
                                final int i29 = i27;
                                final androidx.compose.runtime.a1<Integer> a1Var8 = a1Var6;
                                final androidx.compose.runtime.a1<Integer> a1Var9 = a1Var7;
                                androidx.compose.ui.n nVarA = OnGloballyPositionedModifierKt.a(composed, new yh.l<androidx.compose.ui.layout.q, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.q it) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                        ExposedDropdownMenuKt.c(a1Var8, r.m(it.a()));
                                        h1Var3.b(it);
                                        View rootView = view3.getRootView();
                                        kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                                        androidx.compose.ui.layout.q qVarA = h1Var3.a();
                                        int i210 = i29;
                                        final androidx.compose.runtime.a1<Integer> a1Var10 = a1Var9;
                                        ExposedDropdownMenuKt.n(rootView, qVarA, i210, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox.scope.1.1.menuAnchor.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void a(int i211) {
                                                ExposedDropdownMenuKt.e(a1Var10, i211);
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                                a(num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.q qVar) {
                                        a(qVar);
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                boolean z12 = z11;
                                yh.l<Boolean, kotlin.b2> lVar2 = lVar;
                                Boolean boolValueOf = Boolean.valueOf(z12);
                                final yh.l<? super Boolean, kotlin.b2> lVar3 = lVar;
                                final boolean z13 = z11;
                                pVar2.T(511388516);
                                boolean zS2 = pVar2.s(lVar2) | pVar2.s(boolValueOf);
                                Object objU6 = pVar2.U();
                                if (zS2 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU6 = new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                                            invoke2();
                                            return kotlin.b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            lVar3.invoke(Boolean.valueOf(!z13));
                                        }
                                    };
                                    pVar2.N(objU6);
                                }
                                pVar2.c0();
                                androidx.compose.ui.n nVarA2 = FocusRequesterModifierKt.a(ExposedDropdownMenuKt.m(nVarA, z12, (yh.a) objU6, null, null, null, pVar2, (i26 << 3) & 112, 28), focusRequester5);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                pVar2.c0();
                                return nVarA2;
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar6, androidx.compose.runtime.p pVar2, Integer num) {
                                return a(nVar6, pVar2, num.intValue());
                            }
                        });
                    }
                };
                pVarF.N(xVar5);
                objU5 = xVar5;
            }
            pVarF.c0();
            exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objU5;
            i18 = i14 >> 6;
            i19 = i18 & 14;
            pVarF.T(733328855);
            int i26 = i19 >> 3;
            androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), r14, pVarF, (i26 & 112) | (i26 & 14));
            pVarF.T(-1323940314);
            s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            aVarA = companion4.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVar3);
            i20 = ((((i19 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
            androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
            Updater.j(pVarB3, i0VarK3, companion4.d());
            Updater.j(pVarB3, eVar4, companion4.b());
            Updater.j(pVarB3, layoutDirection3, companion4.c());
            Updater.j(pVarB3, d2Var3, companion4.f());
            pVarF.x();
            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i20 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            if (((i20 >> 9) & 14 & 11) == 2) {
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                pVarF.T(-738793417);
                if (((((i19 >> 6) & 112) | 6) & 81) == 16) {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                } else {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                }
                pVarF.c0();
            } else {
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                pVarF.T(-738793417);
                if (((((i19 >> 6) & 112) | 6) & 81) == 16) {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                } else {
                    content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, pVarF, Integer.valueOf(i18 & 112));
                }
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            final FocusRequester focusRequester5 = focusRequester2;
            EffectsKt.k(new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (z10) {
                        focusRequester5.g();
                    }
                }
            }, pVarF, r14);
            final int i27 = i17;
            final androidx.compose.runtime.a1<Integer> a1Var6 = a1Var3;
            EffectsKt.c(view, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ z0 f9415a;

                    public a(z0 z0Var) {
                        this.f9415a = z0Var;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f9415a.a();
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
                    final View view2 = view;
                    final androidx.compose.ui.node.h1<androidx.compose.ui.layout.q> h1Var2 = h1Var;
                    final int i28 = i27;
                    final androidx.compose.runtime.a1<Integer> a1Var7 = a1Var6;
                    return new a(new z0(view2, new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            View rootView = view2.getRootView();
                            kotlin.jvm.internal.f0.o(rootView, "view.rootView");
                            androidx.compose.ui.layout.q qVarA = h1Var2.a();
                            int i29 = i28;
                            final androidx.compose.runtime.a1<Integer> a1Var8 = a1Var7;
                            ExposedDropdownMenuKt.n(rootView, qVarA, i29, new yh.l<Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(int i210) {
                                    ExposedDropdownMenuKt.e(a1Var8, i210);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num) {
                                    a(num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        }
                    }));
                }
            }, pVarF, 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                ExposedDropdownMenuKt.a(z10, onExpandedChange, nVar4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(androidx.compose.runtime.a1<Integer> a1Var) {
        return a1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.runtime.a1<Integer> a1Var, int i10) {
        a1Var.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(androidx.compose.runtime.a1<Integer> a1Var) {
        return a1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.a1<Integer> a1Var, int i10) {
        a1Var.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v2 ??, still in use, count: 1, list:
          (r12v2 ?? I:java.lang.Object) from 0x00bf: INVOKE (r20v0 ?? I:androidx.compose.runtime.p), (r12v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.n m(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v2 ??, still in use, count: 1, list:
          (r12v2 ?? I:java.lang.Object) from 0x00bf: INVOKE (r20v0 ?? I:androidx.compose.runtime.p), (r12v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(View view, androidx.compose.ui.layout.q qVar, int i10, yh.l<? super Integer, kotlin.b2> lVar) {
        if (qVar == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float f30372b = androidx.compose.ui.layout.r.c(qVar).getF30372b();
        int i11 = rect.top;
        lVar.invoke(Integer.valueOf(((int) Math.max(f30372b - i11, (rect.bottom - i11) - androidx.compose.ui.layout.r.c(qVar).j())) - i10));
    }
}
