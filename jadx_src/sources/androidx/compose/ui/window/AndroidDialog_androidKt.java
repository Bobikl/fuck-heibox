package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.r;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
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
import com.ss.android.ttvecamera.o;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "onDismissRequest", "Landroidx/compose/ui/window/b;", "properties", "Landroidx/compose/runtime/h;", "content", ak.av, "(Lyh/a;Landroidx/compose/ui/window/b;Lyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/n;", "modifier", ak.aF, "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;II)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidDialog_androidKt {
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.a<b2> onDismissRequest, @dl.e b bVar, @dl.d final p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        final b bVar2;
        final LayoutDirection layoutDirection;
        androidx.compose.runtime.p pVar2;
        Object obj;
        androidx.compose.runtime.p pVar3;
        f0.p(onDismissRequest, "onDismissRequest");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-2032877254);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                bVar2 = bVar;
                int i13 = pVarF.s(bVar2) ? 32 : 16;
                i12 |= i13;
            } else {
                bVar2 = bVar;
            }
            i12 |= i13;
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(content) ? 256 : 128;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
            pVar3 = pVarF;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0 && !pVarF.o()) {
                pVarF.l();
                if ((i11 & 2) != 0) {
                    i12 &= o.f97695q;
                }
            } else if ((i11 & 2) != 0) {
                bVar2 = new b(false, false, (SecureFlagPolicy) null, 7, (u) null);
                i12 &= o.f97695q;
            }
            final b bVar3 = bVar2;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-2032877254, i12, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:154)");
            }
            View view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            r rVarU = ComposablesKt.u(pVarF, 0);
            final m2 m2VarT = e2.t(content, pVarF, (i12 >> 6) & 14);
            UUID dialogId = (UUID) RememberSaveableKt.d(new Object[0], null, null, new yh.a<UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1
                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, pVarF, bb.c.d.f31377lj, 6);
            pVarF.T(511388516);
            boolean zS = pVarF.s(view) | pVarF.s(eVar);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                f0.o(dialogId, "dialogId");
                layoutDirection = layoutDirection2;
                androidx.compose.runtime.p pVar4 = pVarF;
                DialogWrapper dialogWrapper = new DialogWrapper(onDismissRequest, bVar3, view, layoutDirection, eVar, dialogId);
                dialogWrapper.j(rVarU, androidx.compose.runtime.internal.b.c(488261145, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar5, int i14) {
                        if ((i14 & 11) == 2 && pVar5.b()) {
                            pVar5.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(488261145, i14, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:174)");
                        }
                        n nVarC = SemanticsModifierKt.c(n.INSTANCE, false, new l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.1
                            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                                f0.p(semantics, "$this$semantics");
                                SemanticsPropertiesKt.i(semantics);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                a(rVar);
                                return b2.f124493a;
                            }
                        }, 1, null);
                        final m2<p<androidx.compose.runtime.p, Integer, b2>> m2Var = m2VarT;
                        AndroidDialog_androidKt.c(nVarC, androidx.compose.runtime.internal.b.b(pVar5, -533674951, true, new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i15) {
                                if ((i15 & 11) == 2 && pVar6.b()) {
                                    pVar6.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-533674951, i15, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:179)");
                                }
                                AndroidDialog_androidKt.b(m2Var).invoke(pVar6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                a(pVar6, num.intValue());
                                return b2.f124493a;
                            }
                        }), pVar5, 48, 0);
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
                pVar4.N(dialogWrapper);
                obj = dialogWrapper;
                pVar2 = pVar4;
            } else {
                layoutDirection = layoutDirection2;
                pVar2 = pVarF;
                obj = objU;
            }
            pVar2.c0();
            final DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
            EffectsKt.c(dialogWrapper2, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ DialogWrapper f17096a;

                    public a(DialogWrapper dialogWrapper) {
                        this.f17096a = dialogWrapper;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f17096a.dismiss();
                        this.f17096a.i();
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
                    dialogWrapper2.show();
                    return new a(dialogWrapper2);
                }
            }, pVar2, 8);
            EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2
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
                    dialogWrapper2.m(onDismissRequest, bVar3, layoutDirection);
                }
            }, pVar2, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            bVar2 = bVar3;
            pVar3 = pVar2;
        }
        u1 u1VarH = pVar3.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i14) {
                AndroidDialog_androidKt.a(onDismissRequest, bVar2, content, pVar5, i10 | 1, i11);
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

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(final n nVar, final p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar, androidx.compose.runtime.p pVar2, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.p pVarF = pVar2.F(-1177876616);
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
            i12 |= pVarF.s(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = n.INSTANCE;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:442)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = new i0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> measurables, long j10) {
                    Object obj;
                    f0.p(Layout, "$this$Layout");
                    f0.p(measurables, "measurables");
                    final ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        arrayList.add(measurables.get(i14).z1(j10));
                    }
                    Object obj2 = null;
                    int i15 = 1;
                    if (!arrayList.isEmpty()) {
                        obj = arrayList.get(0);
                        int width = ((e1) obj).getWidth();
                        int iG = CollectionsKt__CollectionsKt.G(arrayList);
                        if (1 <= iG) {
                            int i16 = 1;
                            while (true) {
                                Object obj3 = arrayList.get(i16);
                                int width2 = ((e1) obj3).getWidth();
                                if (width < width2) {
                                    obj = obj3;
                                    width = width2;
                                }
                                if (i16 == iG) {
                                    break;
                                }
                                i16++;
                            }
                        }
                    } else {
                        obj = null;
                    }
                    e1 e1Var = (e1) obj;
                    int width3 = e1Var != null ? e1Var.getWidth() : s1.b.r(j10);
                    if (!arrayList.isEmpty()) {
                        Object obj4 = arrayList.get(0);
                        int height = ((e1) obj4).getHeight();
                        int iG2 = CollectionsKt__CollectionsKt.G(arrayList);
                        if (1 <= iG2) {
                            while (true) {
                                Object obj5 = arrayList.get(i15);
                                int height2 = ((e1) obj5).getHeight();
                                if (height < height2) {
                                    obj4 = obj5;
                                    height = height2;
                                }
                                if (i15 == iG2) {
                                    break;
                                }
                                i15++;
                            }
                        }
                        obj2 = obj4;
                    }
                    e1 e1Var2 = (e1) obj2;
                    return k0.p(Layout, width3, e1Var2 != null ? e1Var2.getHeight() : s1.b.q(j10), null, new l<e1.a, b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d e1.a layout) {
                            f0.p(layout, "$this$layout");
                            List<e1> list = arrayList;
                            int size2 = list.size();
                            for (int i17 = 0; i17 < size2; i17++) {
                                e1.a.v(layout, list.get(i17), 0, 0, 0.0f, 4, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                            a(aVar);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar2, List list, int i14) {
                    return h0.c(this, nVar2, list, i14);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar2, List list, int i14) {
                    return h0.d(this, nVar2, list, i14);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar2, List list, int i14) {
                    return h0.a(this, nVar2, list, i14);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar2, List list, int i14) {
                    return h0.b(this, nVar2, list, i14);
                }
            };
            int i14 = ((i12 >> 3) & 14) | ((i12 << 3) & 112);
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion.a();
            q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVar);
            int i15 = ((i14 << 9) & bb.c.g.f32954lc) | 6;
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
            Updater.j(pVarB, androidDialog_androidKt$DialogLayout$1, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVarF.x();
            qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i15 >> 3) & 112));
            pVarF.T(2058660585);
            pVar.invoke(pVarF, Integer.valueOf((i15 >> 9) & 14));
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i16) {
                AndroidDialog_androidKt.c(nVar, pVar, pVar3, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
