package androidx.compose.ui.graphics;

import android.graphics.Path;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\r\u0010\u0004\u001a\u00020\u0002*\u00020\u0000H\u0086\b¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/l1;", ak.av, "Landroid/graphics/Path;", ak.aF, "b", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class o {
    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final l1 a() {
        return new j(null, 1, 0 == true ? 1 : 0);
    }

    @dl.d
    public static final Path b(@dl.d l1 l1Var) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        if (l1Var instanceof j) {
            return ((j) l1Var).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @dl.d
    public static final l1 c(@dl.d Path path) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        return new j(path);
    }
}
