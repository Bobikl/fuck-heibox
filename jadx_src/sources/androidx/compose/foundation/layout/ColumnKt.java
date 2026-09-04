package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aO\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/ui/c$b;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/layout/i0;", "b", "(Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/ui/c$b;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/i0;", ak.aF, "()Landroidx/compose/ui/layout/i0;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class ColumnKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.layout.i0 f5968a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float fA = Arrangement.f5896a.r().a();
        q qVarI = q.INSTANCE.i(androidx.compose.ui.c.INSTANCE.u());
        f5968a = RowColumnImplKt.y(layoutOrientation, new yh.s<Integer, int[], LayoutDirection, s1.e, int[], b2>() { // from class: androidx.compose.foundation.layout.ColumnKt$DefaultColumnMeasurePolicy$1
            @Override // yh.s
            public /* bridge */ /* synthetic */ b2 N0(Integer num, int[] iArr, LayoutDirection layoutDirection, s1.e eVar, int[] iArr2) {
                a(num.intValue(), iArr, layoutDirection, eVar, iArr2);
                return b2.f124493a;
            }

            public final void a(int i10, @dl.d int[] size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density, @dl.d int[] outPosition) {
                kotlin.jvm.internal.f0.p(size, "size");
                kotlin.jvm.internal.f0.p(layoutDirection, "<anonymous parameter 2>");
                kotlin.jvm.internal.f0.p(density, "density");
                kotlin.jvm.internal.f0.p(outPosition, "outPosition");
                Arrangement.f5896a.r().c(density, i10, size, outPosition);
            }
        }, fA, SizeMode.Wrap, qVarI);
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.e Arrangement.l lVar, @dl.e androidx.compose.ui.c.b bVar, @dl.d yh.q<? super o, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(-483455358);
        if ((i11 & 1) != 0) {
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            lVar = Arrangement.f5896a.r();
        }
        if ((i11 & 4) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.u();
        }
        int i12 = i10 >> 3;
        androidx.compose.ui.layout.i0 i0VarB = b(lVar, bVar, pVar, (i12 & 112) | (i12 & 14));
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
        Updater.j(pVarB, i0VarB, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar.x();
        qVarF.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i13 >> 3) & 112));
        pVar.T(2058660585);
        pVar.T(-1163856341);
        if (((i13 >> 9) & 14 & 11) == 2 && pVar.b()) {
            pVar.l();
        } else {
            content.invoke(ColumnScopeInstance.f5971a, pVar, Integer.valueOf(((i10 >> 6) & 112) | 6));
        }
        pVar.c0();
        pVar.c0();
        pVar.f();
        pVar.c0();
        pVar.c0();
    }

    @dl.d
    @kotlin.r0
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.layout.i0 b(@dl.d final Arrangement.l verticalArrangement, @dl.d androidx.compose.ui.c.b horizontalAlignment, @dl.e androidx.compose.runtime.p pVar, int i10) {
        androidx.compose.ui.layout.i0 i0VarY;
        kotlin.jvm.internal.f0.p(verticalArrangement, "verticalArrangement");
        kotlin.jvm.internal.f0.p(horizontalAlignment, "horizontalAlignment");
        pVar.T(1089876336);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:98)");
        }
        pVar.T(511388516);
        boolean zS = pVar.s(verticalArrangement) | pVar.s(horizontalAlignment);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            if (kotlin.jvm.internal.f0.g(verticalArrangement, Arrangement.f5896a.r()) && kotlin.jvm.internal.f0.g(horizontalAlignment, androidx.compose.ui.c.INSTANCE.u())) {
                i0VarY = f5968a;
            } else {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float fA = verticalArrangement.a();
                q qVarI = q.INSTANCE.i(horizontalAlignment);
                i0VarY = RowColumnImplKt.y(layoutOrientation, new yh.s<Integer, int[], LayoutDirection, s1.e, int[], b2>() { // from class: androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1
                    {
                        super(5);
                    }

                    @Override // yh.s
                    public /* bridge */ /* synthetic */ b2 N0(Integer num, int[] iArr, LayoutDirection layoutDirection, s1.e eVar, int[] iArr2) {
                        a(num.intValue(), iArr, layoutDirection, eVar, iArr2);
                        return b2.f124493a;
                    }

                    public final void a(int i11, @dl.d int[] size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density, @dl.d int[] outPosition) {
                        kotlin.jvm.internal.f0.p(size, "size");
                        kotlin.jvm.internal.f0.p(layoutDirection, "<anonymous parameter 2>");
                        kotlin.jvm.internal.f0.p(density, "density");
                        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
                        verticalArrangement.c(density, i11, size, outPosition);
                    }
                }, fA, SizeMode.Wrap, qVarI);
            }
            objU = i0VarY;
            pVar.N(objU);
        }
        pVar.c0();
        androidx.compose.ui.layout.i0 i0Var = (androidx.compose.ui.layout.i0) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return i0Var;
    }

    @dl.d
    public static final androidx.compose.ui.layout.i0 c() {
        return f5968a;
    }

    @kotlin.r0
    public static /* synthetic */ void d() {
    }
}
