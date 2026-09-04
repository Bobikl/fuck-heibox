package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.z;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.u1;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.k0;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.aF, "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;II)V", ak.av, "(Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/text/selection/j;", "selection", "Lkotlin/Function1;", "onSelectionChange", "children", "b", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/text/selection/j;Lyh/l;Lyh/p;Landroidx/compose/runtime/p;II)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SelectionContainerKt {
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(336063542);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(336063542, i11, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:60)");
            }
            CompositionLocalKt.b(new k1[]{SelectionRegistrarKt.a().f(null)}, content, pVarF, ((i11 << 3) & 112) | 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                SelectionContainerKt.a(content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.e androidx.compose.ui.n nVar, @dl.e final Selection selection, @dl.d final yh.l<? super Selection, b2> onSelectionChange, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> children, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        f0.p(onSelectionChange, "onSelectionChange");
        f0.p(children, "children");
        androidx.compose.runtime.p pVarF = pVar.F(2078139907);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(selection) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(onSelectionChange) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(children) ? 2048 : 1024;
        }
        final int i14 = i12;
        if ((i14 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(2078139907, i14, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:75)");
            }
            pVarF.T(-492369756);
            Object objU = pVarF.U();
            androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new q();
                pVarF.N(objU);
            }
            pVarF.c0();
            final q qVar = (q) objU;
            pVarF.T(-492369756);
            Object objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = new SelectionManager(qVar);
                pVarF.N(objU2);
            }
            pVarF.c0();
            final SelectionManager selectionManager = (SelectionManager) objU2;
            selectionManager.Y((d1.a) pVarF.K(CompositionLocalsKt.n()));
            selectionManager.Q((k0) pVarF.K(CompositionLocalsKt.h()));
            selectionManager.d0((w1) pVarF.K(CompositionLocalsKt.s()));
            selectionManager.a0(onSelectionChange);
            selectionManager.b0(selection);
            selectionManager.e0(z.a());
            final androidx.compose.ui.n nVar2 = nVar;
            ContextMenu_androidKt.a(selectionManager, androidx.compose.runtime.internal.b.b(pVarF, -123806316, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                    if ((i15 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-123806316, i15, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:94)");
                    }
                    k1[] k1VarArr = {SelectionRegistrarKt.a().f(qVar)};
                    final androidx.compose.ui.n nVar3 = nVar2;
                    final SelectionManager selectionManager2 = selectionManager;
                    final yh.p<androidx.compose.runtime.p, Integer, b2> pVar3 = children;
                    final int i16 = i14;
                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar2, 935424596, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar4, int i17) {
                            if ((i17 & 11) == 2 && pVar4.b()) {
                                pVar4.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(935424596, i17, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
                            }
                            androidx.compose.ui.n nVarS0 = nVar3.s0(selectionManager2.C());
                            final yh.p<androidx.compose.runtime.p, Integer, b2> pVar5 = pVar3;
                            final int i18 = i16;
                            final SelectionManager selectionManager3 = selectionManager2;
                            SimpleLayoutKt.a(nVarS0, androidx.compose.runtime.internal.b.b(pVar4, 1375295262, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer.3.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar6, int i19) {
                                    Selection selectionF;
                                    if ((i19 & 11) == 2 && pVar6.b()) {
                                        pVar6.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1375295262, i19, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
                                    }
                                    pVar5.invoke(pVar6, Integer.valueOf((i18 >> 9) & 14));
                                    if (z.a() && selectionManager3.B() && (selectionF = selectionManager3.F()) != null) {
                                        SelectionManager selectionManager4 = selectionManager3;
                                        List listL = CollectionsKt__CollectionsKt.L(Boolean.TRUE, Boolean.FALSE);
                                        int size = listL.size();
                                        for (int i20 = 0; i20 < size; i20++) {
                                            boolean zBooleanValue = ((Boolean) listL.get(i20)).booleanValue();
                                            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                            pVar6.T(1157296644);
                                            boolean zS = pVar6.s(boolValueOf);
                                            Object objU3 = pVar6.U();
                                            if (zS || objU3 == androidx.compose.runtime.p.INSTANCE.a()) {
                                                objU3 = selectionManager4.K(zBooleanValue);
                                                pVar6.N(objU3);
                                            }
                                            pVar6.c0();
                                            androidx.compose.foundation.text.r rVar = (androidx.compose.foundation.text.r) objU3;
                                            b1.f fVarH = zBooleanValue ? selectionManager4.H() : selectionManager4.y();
                                            ResolvedTextDirection resolvedTextDirectionF = zBooleanValue ? selectionF.h().f() : selectionF.f().f();
                                            if (fVarH != null) {
                                                AndroidSelectionHandles_androidKt.c(fVarH.getF30368a(), zBooleanValue, resolvedTextDirectionF, selectionF.g(), SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE, rVar, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(rVar, null)), null, pVar6, androidx.profileinstaller.o.c.f26824k);
                                            }
                                        }
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                    a(pVar6, num.intValue());
                                    return b2.f124493a;
                                }
                            }), pVar4, 48, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                            a(pVar4, num.intValue());
                            return b2.f124493a;
                        }
                    }), pVar2, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, 56);
            EffectsKt.c(selectionManager, new yh.l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SelectionManager f8190a;

                    public a(SelectionManager selectionManager) {
                        this.f8190a = selectionManager;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f8190a.L();
                    }
                }

                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    f0.p(DisposableEffect, "$this$DisposableEffect");
                    return new a(selectionManager);
                }
            }, pVarF, 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final androidx.compose.ui.n nVar3 = nVar;
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                SelectionContainerKt.b(nVar3, selection, onSelectionChange, children, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.e final androidx.compose.ui.n nVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1075498320);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(content) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1075498320, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:41)");
            }
            pVarF.T(-492369756);
            Object objU = pVarF.U();
            androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = h2.g(null, null, 2, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            final a1 a1Var = (a1) objU;
            Selection selectionD = d(a1Var);
            pVarF.T(1157296644);
            boolean zS = pVarF.s(a1Var);
            Object objU2 = pVarF.U();
            if (zS || objU2 == companion.a()) {
                objU2 = new yh.l<Selection, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.e Selection selection) {
                        SelectionContainerKt.e(a1Var, selection);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Selection selection) {
                        a(selection);
                        return b2.f124493a;
                    }
                };
                pVarF.N(objU2);
            }
            pVarF.c0();
            b(nVar, selectionD, (yh.l) objU2, content, pVarF, (i12 & 14) | ((i12 << 6) & bb.c.g.f32954lc), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i14) {
                SelectionContainerKt.c(nVar, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    private static final Selection d(a1<Selection> a1Var) {
        return a1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a1<Selection> a1Var, Selection selection) {
        a1Var.setValue(selection);
    }
}
