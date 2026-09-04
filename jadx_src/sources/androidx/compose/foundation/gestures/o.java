package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {
    public static /* synthetic */ Object a(p pVar, MutatePriority mutatePriority, yh.p pVar2, kotlin.coroutines.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return pVar.c(mutatePriority, pVar2, cVar);
    }
}
