package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/n;", "b", "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;"}, k = 3, mv = {1, 7, 1})
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<b1.f> f8203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.l<yh.a<b1.f>, androidx.compose.ui.n> f8204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectionMagnifierKt$animatedSelectionMagnifier$1(yh.a<b1.f> aVar, yh.l<? super yh.a<b1.f>, ? extends androidx.compose.ui.n> lVar) {
        super(3);
        this.f8203b = aVar;
        this.f8204c = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(m2<b1.f> m2Var) {
        return m2Var.getValue().getF30368a();
    }

    @dl.d
    @androidx.compose.runtime.h
    public final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(composed, "$this$composed");
        pVar.T(759876635);
        if (ComposerKt.g0()) {
            ComposerKt.w0(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:66)");
        }
        final m2 m2VarH = SelectionMagnifierKt.h(this.f8203b, pVar, 0);
        yh.l<yh.a<b1.f>, androidx.compose.ui.n> lVar = this.f8204c;
        pVar.T(1157296644);
        boolean zS = pVar.s(m2VarH);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.a<b1.f>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final long a() {
                    return SelectionMagnifierKt$animatedSelectionMagnifier$1.c(m2VarH);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b1.f invoke() {
                    return b1.f.d(a());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        androidx.compose.ui.n nVarInvoke = lVar.invoke((yh.a<b1.f>) objU);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarInvoke;
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
        return b(nVar, pVar, num.intValue());
    }
}
