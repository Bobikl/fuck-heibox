package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.b;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.r;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.g;
import b1.f;
import bb.c;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.o;
import yh.a;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0083\b¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "onDismissRequest", "Landroidx/compose/ui/window/g;", "popupPositionProvider", "Landroidx/compose/runtime/h;", "content", ak.av, "(Lyh/a;Landroidx/compose/ui/window/g;Lyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/n;", "modifier", ak.aF, "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/runtime/j1;", "", "Landroidx/compose/runtime/j1;", "e", "()Landroidx/compose/runtime/j1;", "LocalPopupTestTag", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ExposedDropdownMenuPopupKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final j1<String> f11922a = CompositionLocalKt.d(null, new a<String>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$LocalPopupTestTag$1
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    @i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @h
    public static final void a(@e a<b2> aVar, @d final g popupPositionProvider, @d final p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        a<b2> aVar2;
        int i12;
        androidx.compose.runtime.p pVar2;
        Object obj;
        final a<b2> aVar3;
        androidx.compose.runtime.p pVar3;
        f0.p(popupPositionProvider, "popupPositionProvider");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(187306684);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            aVar2 = aVar;
        } else if ((i10 & 14) == 0) {
            aVar2 = aVar;
            i12 = (pVarF.s(aVar2) ? 4 : 2) | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(popupPositionProvider) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= c.b.f30966u4;
        } else if ((i10 & c.b.f30796me) == 0) {
            i12 |= pVarF.s(content) ? 256 : 128;
        }
        int i14 = i12;
        if ((i14 & c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
            aVar3 = aVar2;
            pVar3 = pVarF;
        } else {
            final a<b2> aVar4 = i13 != 0 ? null : aVar2;
            if (ComposerKt.g0()) {
                ComposerKt.w0(187306684, i14, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.kt:78)");
            }
            View view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            final String str = (String) pVarF.K(f11922a);
            final LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            r rVarU = ComposablesKt.u(pVarF, 0);
            final m2 m2VarT = e2.t(content, pVarF, (i14 >> 6) & 14);
            UUID popupId = (UUID) RememberSaveableKt.d(new Object[0], null, null, new a<UUID>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1
                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, pVarF, c.d.f31377lj, 6);
            pVarF.T(-492369756);
            Object objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                f0.o(popupId, "popupId");
                androidx.compose.runtime.p pVar4 = pVarF;
                final PopupLayout popupLayout = new PopupLayout(aVar4, str, view, eVar, popupPositionProvider, popupId);
                popupLayout.setContent(rVarU, b.c(686046343, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @k(applier = "androidx.compose.ui.UiComposable")
                    @h
                    public final void a(@e androidx.compose.runtime.p pVar5, int i15) {
                        if ((i15 & 11) == 2 && pVar5.b()) {
                            pVar5.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(686046343, i15, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.kt:99)");
                        }
                        n nVarC = SemanticsModifierKt.c(n.INSTANCE, false, new l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.1
                            public final void a(@d androidx.compose.ui.semantics.r semantics) {
                                f0.p(semantics, "$this$semantics");
                                SemanticsPropertiesKt.U(semantics);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                a(rVar);
                                return b2.f124493a;
                            }
                        }, 1, null);
                        final PopupLayout popupLayout2 = popupLayout;
                        n nVarA = androidx.compose.ui.draw.a.a(OnRemeasuredModifierKt.a(nVarC, new l<s1.r, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.2
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                popupLayout2.m4setPopupContentSizefhxjrPA(s1.r.b(j10));
                                popupLayout2.q();
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return b2.f124493a;
                            }
                        }), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
                        final m2<p<androidx.compose.runtime.p, Integer, b2>> m2Var = m2VarT;
                        androidx.compose.runtime.internal.a aVarB = b.b(pVar5, 588819933, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @k(applier = "androidx.compose.ui.UiComposable")
                            @h
                            public final void a(@e androidx.compose.runtime.p pVar6, int i16) {
                                if ((i16 & 11) == 2 && pVar6.b()) {
                                    pVar6.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(588819933, i16, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.kt:110)");
                                }
                                ExposedDropdownMenuPopupKt.b(m2Var).invoke(pVar6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                a(pVar6, num.intValue());
                                return b2.f124493a;
                            }
                        });
                        pVar5.T(-483170785);
                        ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = ExposedDropdownMenuPopupKt$SimpleStack$1.f11950a;
                        pVar5.T(-1323940314);
                        s1.e eVar2 = (s1.e) pVar5.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection2 = (LayoutDirection) pVar5.K(CompositionLocalsKt.p());
                        d2 d2Var = (d2) pVar5.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        a<ComposeUiNode> aVarA = companion.a();
                        q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarA);
                        if (!(pVar5.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar5.h();
                        if (pVar5.D()) {
                            pVar5.L(aVarA);
                        } else {
                            pVar5.d();
                        }
                        pVar5.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar5);
                        Updater.j(pVarB, exposedDropdownMenuPopupKt$SimpleStack$1, companion.d());
                        Updater.j(pVarB, eVar2, companion.b());
                        Updater.j(pVarB, layoutDirection2, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar5.x();
                        qVarF.invoke(v1.a(v1.b(pVar5)), pVar5, 0);
                        pVar5.T(2058660585);
                        aVarB.invoke(pVar5, 6);
                        pVar5.c0();
                        pVar5.f();
                        pVar5.c0();
                        pVar5.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                        a(pVar5, num.intValue());
                        return b2.f124493a;
                    }
                }));
                pVar4.N(popupLayout);
                obj = popupLayout;
                pVar2 = pVar4;
            } else {
                pVar2 = pVarF;
                obj = objU;
            }
            pVar2.c0();
            final PopupLayout popupLayout2 = (PopupLayout) obj;
            EffectsKt.c(popupLayout2, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PopupLayout f11927a;

                    public a(PopupLayout popupLayout) {
                        this.f11927a = popupLayout;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f11927a.e();
                        this.f11927a.l();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    popupLayout2.m();
                    popupLayout2.p(aVar4, str, layoutDirection);
                    return new a(popupLayout2);
                }
            }, pVar2, 8);
            EffectsKt.k(new a<b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    popupLayout2.p(aVar4, str, layoutDirection);
                }
            }, pVar2, 0);
            EffectsKt.c(popupPositionProvider, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {
                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    popupLayout2.setPositionProvider(popupPositionProvider);
                    popupLayout2.q();
                    return new a();
                }
            }, pVar2, (i14 >> 3) & 14);
            n nVarA = OnGloballyPositionedModifierKt.a(n.INSTANCE, new l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5
                {
                    super(1);
                }

                public final void a(@d androidx.compose.ui.layout.q childCoordinates) {
                    f0.p(childCoordinates, "childCoordinates");
                    androidx.compose.ui.layout.q qVarD = childCoordinates.D();
                    f0.m(qVarD);
                    long jA = qVarD.a();
                    long jG = androidx.compose.ui.layout.r.g(qVarD);
                    popupLayout2.setParentBounds(s1.q.b(o.a(di.d.L0(f.p(jG)), di.d.L0(f.r(jG))), jA));
                    popupLayout2.q();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                    a(qVar);
                    return b2.f124493a;
                }
            });
            i0 i0Var = new i0() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6
                @Override // androidx.compose.ui.layout.i0
                @d
                public final j0 a(@d l0 Layout, @d List<? extends g0> list, long j10) {
                    f0.p(Layout, "$this$Layout");
                    f0.p(list, "<anonymous parameter 0>");
                    popupLayout2.setParentLayoutDirection(layoutDirection);
                    return k0.p(Layout, 0, 0, null, new l<e1.a, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1
                        public final void a(@d e1.a layout) {
                            f0.p(layout, "$this$layout");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar5) {
                            a(aVar5);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i15) {
                    return h0.c(this, nVar, list, i15);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i15) {
                    return h0.d(this, nVar, list, i15);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i15) {
                    return h0.a(this, nVar, list, i15);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i15) {
                    return h0.b(this, nVar, list, i15);
                }
            };
            pVar2.T(-1323940314);
            s1.e eVar2 = (s1.e) pVar2.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVar2.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            a<ComposeUiNode> aVarA = companion.a();
            q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarA);
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
            Updater.j(pVarB, i0Var, companion.d());
            Updater.j(pVarB, eVar2, companion.b());
            Updater.j(pVarB, layoutDirection2, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVar2.x();
            qVarF.invoke(v1.a(v1.b(pVar2)), pVar2, 0);
            pVar2.T(2058660585);
            pVar2.T(975527269);
            pVar2.c0();
            pVar2.c0();
            pVar2.f();
            pVar2.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            aVar3 = aVar4;
            pVar3 = pVar2;
        }
        u1 u1VarH = pVar3.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@e androidx.compose.runtime.p pVar5, int i15) {
                ExposedDropdownMenuPopupKt.a(aVar3, popupPositionProvider, content, pVar5, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                a(pVar5, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<androidx.compose.runtime.p, Integer, b2> b(m2<? extends p<? super androidx.compose.runtime.p, ? super Integer, b2>> m2Var) {
        return (p) m2Var.getValue();
    }

    @i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @h
    private static final void c(n nVar, p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar, androidx.compose.runtime.p pVar2, int i10) {
        pVar2.T(-483170785);
        ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = ExposedDropdownMenuPopupKt$SimpleStack$1.f11950a;
        int i11 = ((i10 << 3) & 112) | ((i10 >> 3) & 14);
        pVar2.T(-1323940314);
        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar2.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        a<ComposeUiNode> aVarA = companion.a();
        q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVar);
        int i12 = ((i11 << 9) & c.g.f32954lc) | 6;
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
        Updater.j(pVarB, exposedDropdownMenuPopupKt$SimpleStack$1, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar2.x();
        qVarF.invoke(v1.a(v1.b(pVar2)), pVar2, Integer.valueOf((i12 >> 3) & 112));
        pVar2.T(2058660585);
        pVar.invoke(pVar2, Integer.valueOf((i12 >> 9) & 14));
        pVar2.c0();
        pVar2.f();
        pVar2.c0();
        pVar2.c0();
    }

    @d
    public static final j1<String> e() {
        return f11922a;
    }
}
