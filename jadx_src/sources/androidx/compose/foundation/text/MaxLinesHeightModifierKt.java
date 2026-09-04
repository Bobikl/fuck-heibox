package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.r0;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MaxLinesHeightModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/n;", "", "maxLines", "Landroidx/compose/ui/text/q0;", "textStyle", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class MaxLinesHeightModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, final int i10, @dl.d final TextStyle textStyle) {
        f0.p(nVar, "<this>");
        f0.p(textStyle, "textStyle");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.text.MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("maxLinesHeight");
                x0Var.getProperties().c("maxLines", Integer.valueOf(i10));
                x0Var.getProperties().c("textStyle", textStyle);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.MaxLinesHeightModifierKt$maxLinesHeight$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final Object b(m2<? extends Object> m2Var) {
                return m2Var.getValue();
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i11) {
                f0.p(composed, "$this$composed");
                pVar.T(-1027014173);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1027014173, i11, -1, "androidx.compose.foundation.text.maxLinesHeight.<anonymous> (MaxLinesHeightModifier.kt:47)");
                }
                int i12 = i10;
                if (!(i12 > 0)) {
                    throw new IllegalArgumentException("maxLines must be greater than 0".toString());
                }
                if (i12 == Integer.MAX_VALUE) {
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar.c0();
                    return companion;
                }
                s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
                androidx.compose.ui.text.font.v.b bVar = (androidx.compose.ui.text.font.v.b) pVar.K(CompositionLocalsKt.k());
                LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
                TextStyle textStyle2 = textStyle;
                pVar.T(511388516);
                boolean zS = pVar.s(textStyle2) | pVar.s(layoutDirection);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = r0.d(textStyle2, layoutDirection);
                    pVar.N(objU);
                }
                pVar.c0();
                TextStyle textStyle3 = (TextStyle) objU;
                pVar.T(511388516);
                boolean zS2 = pVar.s(bVar) | pVar.s(textStyle3);
                Object objU2 = pVar.U();
                if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                    androidx.compose.ui.text.font.v vVarQ = textStyle3.q();
                    FontWeight fontWeightV = textStyle3.v();
                    if (fontWeightV == null) {
                        fontWeightV = FontWeight.INSTANCE.m();
                    }
                    g0 g0VarT = textStyle3.t();
                    int iJ = g0VarT != null ? g0VarT.j() : g0.INSTANCE.b();
                    h0 h0VarU = textStyle3.u();
                    objU2 = bVar.b(vVarQ, fontWeightV, iJ, h0VarU != null ? h0VarU.getValue() : h0.INSTANCE.a());
                    pVar.N(objU2);
                }
                pVar.c0();
                m2 m2Var = (m2) objU2;
                Object[] objArr = {eVar, bVar, textStyle, layoutDirection, b(m2Var)};
                pVar.T(-568225417);
                boolean zS3 = false;
                for (int i13 = 0; i13 < 5; i13++) {
                    zS3 |= pVar.s(objArr[i13]);
                }
                Object objU3 = pVar.U();
                if (zS3 || objU3 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU3 = Integer.valueOf(s1.r.j(s.a(textStyle3, eVar, bVar, s.c(), 1)));
                    pVar.N(objU3);
                }
                pVar.c0();
                int iIntValue = ((Number) objU3).intValue();
                Object[] objArr2 = {eVar, bVar, textStyle, layoutDirection, b(m2Var)};
                pVar.T(-568225417);
                boolean zS4 = false;
                for (int i14 = 0; i14 < 5; i14++) {
                    zS4 |= pVar.s(objArr2[i14]);
                }
                Object objU4 = pVar.U();
                if (zS4 || objU4 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU4 = Integer.valueOf(s1.r.j(s.a(textStyle3, eVar, bVar, s.c() + '\n' + s.c(), 2)));
                    pVar.N(objU4);
                }
                pVar.c0();
                androidx.compose.ui.n nVarQ = SizeKt.q(androidx.compose.ui.n.INSTANCE, 0.0f, eVar.E(iIntValue + ((((Number) objU4).intValue() - iIntValue) * (i10 - 1))), 1, null);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarQ;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
