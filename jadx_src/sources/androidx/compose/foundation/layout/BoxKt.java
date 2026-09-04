package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a<\u0010\u001d\u001a\u00020\b*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002\u001a\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"\"\u001a\u0010%\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b$\u0010\"\"\u001a\u0010)\u001a\u0004\u0018\u00010&*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0018\u0010,\u001a\u00020\u0004*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/k;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", "b", "(Landroidx/compose/ui/n;Landroidx/compose/ui/c;ZLyh/q;Landroidx/compose/runtime/p;II)V", "alignment", "Landroidx/compose/ui/layout/i0;", "k", "(Landroidx/compose/ui/c;ZLandroidx/compose/runtime/p;I)Landroidx/compose/ui/layout/i0;", "e", "Landroidx/compose/ui/layout/e1$a;", "Landroidx/compose/ui/layout/e1;", "placeable", "Landroidx/compose/ui/layout/g0;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", "j", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/layout/i0;", "g", "()Landroidx/compose/ui/layout/i0;", "DefaultBoxMeasurePolicy", RXScreenCaptureService.KEY_HEIGHT, "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/j;", "f", "(Landroidx/compose/ui/layout/g0;)Landroidx/compose/foundation/layout/j;", "boxChildData", "i", "(Landroidx/compose/ui/layout/g0;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class BoxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.layout.i0 f5933a = e(androidx.compose.ui.c.INSTANCE.C(), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.layout.i0 f5934b = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.i0
        @dl.d
        public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 MeasurePolicy, @dl.d List<? extends androidx.compose.ui.layout.g0> list, long j10) {
            kotlin.jvm.internal.f0.p(MeasurePolicy, "$this$MeasurePolicy");
            kotlin.jvm.internal.f0.p(list, "<anonymous parameter 0>");
            return androidx.compose.ui.layout.k0.p(MeasurePolicy, s1.b.r(j10), s1.b.q(j10), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$measure$1
                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.c(this, nVar, list, i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.d(this, nVar, list, i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.a(this, nVar, list, i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.b(this, nVar, list, i10);
        }
    };

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.n modifier, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        androidx.compose.runtime.p pVarF = pVar.F(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            androidx.compose.ui.layout.i0 i0Var = f5934b;
            int i12 = ((i11 << 3) & 112) | bb.c.b.f30966u4;
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(modifier);
            int i13 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
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
            Updater.j(pVarB, i0Var, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVarF.x();
            qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i13 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(1021196736);
            if (((i13 >> 9) & 14 & 11) == 2 && pVarF.b()) {
                pVarF.l();
            }
            pVarF.c0();
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
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.layout.BoxKt$Box$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i14) {
                BoxKt.a(modifier, pVar2, i10 | 1);
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
    public static final void b(@dl.e androidx.compose.ui.n nVar, @dl.e androidx.compose.ui.c cVar, boolean z10, @dl.d yh.q<? super k, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(733328855);
        if ((i11 & 1) != 0) {
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.C();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        int i12 = i10 >> 3;
        androidx.compose.ui.layout.i0 i0VarK = k(cVar, z10, pVar, (i12 & 112) | (i12 & 14));
        pVar.T(-1323940314);
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion.a();
        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVar);
        int i13 = ((((i10 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
        if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(aVarA);
        } else {
            pVar.d();
        }
        pVar.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar);
        Updater.j(pVarB, i0VarK, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar.x();
        qVarF.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i13 >> 3) & 112));
        pVar.T(2058660585);
        pVar.T(-2137368960);
        if (((i13 >> 9) & 14 & 11) == 2 && pVar.b()) {
            pVar.l();
        } else {
            content.invoke(BoxScopeInstance.f5954a, pVar, Integer.valueOf(((i10 >> 6) & 112) | 6));
        }
        pVar.c0();
        pVar.c0();
        pVar.f();
        pVar.c0();
        pVar.c0();
    }

    @dl.d
    public static final androidx.compose.ui.layout.i0 e(@dl.d final androidx.compose.ui.c alignment, final boolean z10) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return new androidx.compose.ui.layout.i0() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1
            @Override // androidx.compose.ui.layout.i0
            @dl.d
            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 MeasurePolicy, @dl.d final List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
                int iR;
                final androidx.compose.ui.layout.e1 e1VarZ1;
                int iMax;
                kotlin.jvm.internal.f0.p(MeasurePolicy, "$this$MeasurePolicy");
                kotlin.jvm.internal.f0.p(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return androidx.compose.ui.layout.k0.p(MeasurePolicy, s1.b.r(j10), s1.b.q(j10), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                            a(aVar);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }
                long jE = z10 ? j10 : s1.b.e(j10, 0, 0, 0, 0, 10, null);
                if (measurables.size() == 1) {
                    final androidx.compose.ui.layout.g0 g0Var = measurables.get(0);
                    if (BoxKt.i(g0Var)) {
                        iR = s1.b.r(j10);
                        int iQ = s1.b.q(j10);
                        e1VarZ1 = g0Var.z1(s1.b.f139198b.c(s1.b.r(j10), s1.b.q(j10)));
                        iMax = iQ;
                    } else {
                        androidx.compose.ui.layout.e1 e1VarZ2 = g0Var.z1(jE);
                        int iMax2 = Math.max(s1.b.r(j10), e1VarZ2.getWidth());
                        iMax = Math.max(s1.b.q(j10), e1VarZ2.getHeight());
                        e1VarZ1 = e1VarZ2;
                        iR = iMax2;
                    }
                    final androidx.compose.ui.c cVar = alignment;
                    final int i10 = iR;
                    final int i11 = iMax;
                    return androidx.compose.ui.layout.k0.p(MeasurePolicy, iR, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                            BoxKt.j(layout, e1VarZ1, g0Var, MeasurePolicy.getLayoutDirection(), i10, i11, cVar);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                            a(aVar);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }
                final androidx.compose.ui.layout.e1[] e1VarArr = new androidx.compose.ui.layout.e1[measurables.size()];
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.f124889b = s1.b.r(j10);
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.f124889b = s1.b.q(j10);
                int size = measurables.size();
                boolean z11 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    androidx.compose.ui.layout.g0 g0Var2 = measurables.get(i12);
                    if (BoxKt.i(g0Var2)) {
                        z11 = true;
                    } else {
                        androidx.compose.ui.layout.e1 e1VarZ3 = g0Var2.z1(jE);
                        e1VarArr[i12] = e1VarZ3;
                        intRef.f124889b = Math.max(intRef.f124889b, e1VarZ3.getWidth());
                        intRef2.f124889b = Math.max(intRef2.f124889b, e1VarZ3.getHeight());
                    }
                }
                if (z11) {
                    int i13 = intRef.f124889b;
                    int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
                    int i15 = intRef2.f124889b;
                    long jA = s1.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
                    int size2 = measurables.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        androidx.compose.ui.layout.g0 g0Var3 = measurables.get(i16);
                        if (BoxKt.i(g0Var3)) {
                            e1VarArr[i16] = g0Var3.z1(jA);
                        }
                    }
                }
                int i17 = intRef.f124889b;
                int i18 = intRef2.f124889b;
                final androidx.compose.ui.c cVar2 = alignment;
                return androidx.compose.ui.layout.k0.p(MeasurePolicy, i17, i18, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                        androidx.compose.ui.layout.e1[] e1VarArr2 = e1VarArr;
                        List<androidx.compose.ui.layout.g0> list = measurables;
                        androidx.compose.ui.layout.l0 l0Var = MeasurePolicy;
                        Ref.IntRef intRef3 = intRef;
                        Ref.IntRef intRef4 = intRef2;
                        androidx.compose.ui.c cVar3 = cVar2;
                        int length = e1VarArr2.length;
                        int i19 = 0;
                        int i20 = 0;
                        while (i20 < length) {
                            androidx.compose.ui.layout.e1 e1Var = e1VarArr2[i20];
                            kotlin.jvm.internal.f0.n(e1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            BoxKt.j(layout, e1Var, list.get(i19), l0Var.getLayoutDirection(), intRef3.f124889b, intRef4.f124889b, cVar3);
                            i20++;
                            i19++;
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i10) {
                return androidx.compose.ui.layout.h0.c(this, nVar, list, i10);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i10) {
                return androidx.compose.ui.layout.h0.d(this, nVar, list, i10);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i10) {
                return androidx.compose.ui.layout.h0.a(this, nVar, list, i10);
            }

            @Override // androidx.compose.ui.layout.i0
            public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i10) {
                return androidx.compose.ui.layout.h0.b(this, nVar, list, i10);
            }
        };
    }

    private static final BoxChildData f(androidx.compose.ui.layout.g0 g0Var) {
        Object objB = g0Var.b();
        if (objB instanceof BoxChildData) {
            return (BoxChildData) objB;
        }
        return null;
    }

    @dl.d
    public static final androidx.compose.ui.layout.i0 g() {
        return f5933a;
    }

    @dl.d
    public static final androidx.compose.ui.layout.i0 h() {
        return f5934b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(androidx.compose.ui.layout.g0 g0Var) {
        BoxChildData boxChildDataF = f(g0Var);
        if (boxChildDataF != null) {
            return boxChildDataF.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(androidx.compose.ui.layout.e1.a aVar, androidx.compose.ui.layout.e1 e1Var, androidx.compose.ui.layout.g0 g0Var, LayoutDirection layoutDirection, int i10, int i11, androidx.compose.ui.c cVar) {
        androidx.compose.ui.c alignment;
        BoxChildData boxChildDataF = f(g0Var);
        androidx.compose.ui.layout.e1.a.r(aVar, e1Var, ((boxChildDataF == null || (alignment = boxChildDataF.getAlignment()) == null) ? cVar : alignment).a(s1.s.a(e1Var.getWidth(), e1Var.getHeight()), s1.s.a(i10, i11), layoutDirection), 0.0f, 2, null);
    }

    @dl.d
    @kotlin.r0
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.layout.i0 k(@dl.d androidx.compose.ui.c alignment, boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        androidx.compose.ui.layout.i0 i0Var;
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        pVar.T(56522820);
        if (ComposerKt.g0()) {
            ComposerKt.w0(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)");
        }
        if (!kotlin.jvm.internal.f0.g(alignment, androidx.compose.ui.c.INSTANCE.C()) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            pVar.T(511388516);
            boolean zS = pVar.s(boolValueOf) | pVar.s(alignment);
            Object objU = pVar.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = e(alignment, z10);
                pVar.N(objU);
            }
            pVar.c0();
            i0Var = (androidx.compose.ui.layout.i0) objU;
        } else {
            i0Var = f5933a;
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return i0Var;
    }
}
