package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.f0;
import androidx.compose.animation.core.x1;

/* JADX INFO: compiled from: LazyGridItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.ui.n a(l lVar, androidx.compose.ui.n nVar, f0 f0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        return lVar.a(nVar, f0Var);
    }
}
