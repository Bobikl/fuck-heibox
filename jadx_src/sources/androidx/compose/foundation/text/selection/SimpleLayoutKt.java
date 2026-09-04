package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SimpleLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;II)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SimpleLayoutKt {
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e final androidx.compose.ui.n nVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-2105228848);
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
                ComposerKt.w0(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            SimpleLayoutKt$SimpleLayout$1 simpleLayoutKt$SimpleLayout$1 = new i0() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> measurables, long j10) {
                    f0.p(Layout, "$this$Layout");
                    f0.p(measurables, "measurables");
                    final ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    Integer numValueOf = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        arrayList.add(measurables.get(i14).z1(j10));
                    }
                    int size2 = arrayList.size();
                    Integer numValueOf2 = numValueOf;
                    for (int i15 = 0; i15 < size2; i15++) {
                        numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((e1) arrayList.get(i15)).getWidth()));
                    }
                    int iIntValue = numValueOf2.intValue();
                    int size3 = arrayList.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((e1) arrayList.get(i16)).getHeight()));
                    }
                    return k0.p(Layout, iIntValue, numValueOf.intValue(), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d e1.a layout) {
                            f0.p(layout, "$this$layout");
                            List<e1> list = arrayList;
                            int size4 = list.size();
                            for (int i17 = 0; i17 < size4; i17++) {
                                e1.a.p(layout, list.get(i17), 0, 0, 0.0f, 4, null);
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
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVar);
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
            Updater.j(pVarB, simpleLayoutKt$SimpleLayout$1, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVarF.x();
            qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i15 >> 3) & 112));
            pVarF.T(2058660585);
            content.invoke(pVarF, Integer.valueOf((i15 >> 9) & 14));
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
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                SimpleLayoutKt.a(nVar, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
