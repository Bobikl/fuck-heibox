package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.j1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/foundation/x;", "indication", "b", "Landroidx/compose/runtime/j1;", ak.av, "Landroidx/compose/runtime/j1;", "()Landroidx/compose/runtime/j1;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class IndicationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<x> f4957a = CompositionLocalKt.e(new yh.a<x>() { // from class: androidx.compose.foundation.IndicationKt$LocalIndication$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return m.f7442a;
        }
    });

    @dl.d
    public static final j1<x> a() {
        return f4957a;
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final androidx.compose.foundation.interaction.e interactionSource, @dl.e final x xVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("indication");
                x0Var.getProperties().c("indication", xVar);
                x0Var.getProperties().c("interactionSource", interactionSource);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.IndicationKt$indication$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-353972293);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
                }
                x xVar2 = xVar;
                if (xVar2 == null) {
                    xVar2 = d0.f5094a;
                }
                y yVarA = xVar2.a(interactionSource, pVar, 0);
                pVar.T(1157296644);
                boolean zS = pVar.s(yVarA);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new z(yVarA);
                    pVar.N(objU);
                }
                pVar.c0();
                z zVar = (z) objU;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return zVar;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
