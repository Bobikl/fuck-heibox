package androidx.compose.ui.draw;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Scale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", "", "scaleX", "scaleY", "b", "scale", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class o {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, float f10) {
        f0.p(nVar, "<this>");
        return b(nVar, f10, f10);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, float f10, float f11) {
        f0.p(nVar, "<this>");
        if (f10 == 1.0f) {
            if (f11 == 1.0f) {
                return nVar;
            }
        }
        return GraphicsLayerModifierKt.e(nVar, f10, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65532, null);
    }
}
