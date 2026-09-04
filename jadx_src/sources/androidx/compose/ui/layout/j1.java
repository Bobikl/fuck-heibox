package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: RelocationRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/n;", "", "relocationRequester", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class j1 {
    @androidx.compose.ui.g
    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Please use bringIntoViewRequester instead.", replaceWith = @kotlin.s0(expression = "bringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.bringIntoViewRequester"}))
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d Object relocationRequester) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(relocationRequester, "relocationRequester");
        return nVar;
    }
}
