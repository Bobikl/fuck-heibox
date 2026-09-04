package androidx.compose.ui.draw;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Alpha.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/n;", "", "alpha", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, float f10) {
        f0.p(nVar, "<this>");
        return !((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0) ? GraphicsLayerModifierKt.e(nVar, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 61435, null) : nVar;
    }
}
