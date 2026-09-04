package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {
    public static /* synthetic */ Object a(t tVar, MutatePriority mutatePriority, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return tVar.a(mutatePriority, pVar, cVar);
    }
}
