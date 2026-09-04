package androidx.compose.foundation;

import androidx.compose.runtime.j2;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: ProgressSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a.\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/n;", "", "value", "Lfi/f;", "valueRange", "", "steps", "b", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ProgressSemanticsKt {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return SemanticsModifierKt.b(nVar, true, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.o0(semantics, ProgressBarRangeInfo.INSTANCE.a());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        });
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, final float f10, @dl.d final fi.f<Float> valueRange, final int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(valueRange, "valueRange");
        return SemanticsModifierKt.b(nVar, true, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.o0(semantics, new ProgressBarRangeInfo(((Number) fi.u.M(Float.valueOf(f10), valueRange)).floatValue(), valueRange, i10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n c(androidx.compose.ui.n nVar, float f10, fi.f fVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = fi.t.e(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b(nVar, f10, fVar, i10);
    }
}
