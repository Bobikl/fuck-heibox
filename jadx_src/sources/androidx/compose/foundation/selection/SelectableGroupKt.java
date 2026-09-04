package androidx.compose.foundation.selection;

import androidx.compose.ui.n;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.r;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SelectableGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/n;", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SelectableGroupKt {
    @d
    public static final n a(@d n nVar) {
        f0.p(nVar, "<this>");
        return SemanticsModifierKt.c(nVar, false, new l<r, b2>() { // from class: androidx.compose.foundation.selection.SelectableGroupKt$selectableGroup$1
            public final void a(@d r semantics) {
                f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.b0(semantics);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        }, 1, null);
    }
}
