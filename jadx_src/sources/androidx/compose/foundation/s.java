package androidx.compose.foundation;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.s0;

/* JADX INFO: compiled from: ExcludeFromSystemGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a \u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", ak.av, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/q;", "Lb1/i;", "exclusion", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class s {
    @dl.d
    @kotlin.k(message = "Use systemGestureExclusion", replaceWith = @s0(expression = "systemGestureExclusion", imports = {}))
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return SystemGestureExclusionKt.b(nVar);
    }

    @dl.d
    @kotlin.k(message = "Use systemGestureExclusion", replaceWith = @s0(expression = "systemGestureExclusion", imports = {}))
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d yh.l<? super androidx.compose.ui.layout.q, b1.i> exclusion) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(exclusion, "exclusion");
        return SystemGestureExclusionKt.c(nVar, exclusion);
    }
}
