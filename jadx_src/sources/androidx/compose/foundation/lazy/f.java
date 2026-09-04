package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.f0;
import androidx.compose.animation.core.x1;

/* JADX INFO: compiled from: LazyItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.ui.n a(g gVar, androidx.compose.ui.n nVar, f0 f0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        return gVar.a(nVar, f0Var);
    }

    public static /* synthetic */ androidx.compose.ui.n b(g gVar, androidx.compose.ui.n nVar, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return gVar.b(nVar, f10);
    }

    public static /* synthetic */ androidx.compose.ui.n c(g gVar, androidx.compose.ui.n nVar, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return gVar.d(nVar, f10);
    }

    public static /* synthetic */ androidx.compose.ui.n d(g gVar, androidx.compose.ui.n nVar, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return gVar.c(nVar, f10);
    }
}
