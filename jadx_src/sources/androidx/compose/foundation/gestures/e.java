package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ Object a(f fVar, MutatePriority mutatePriority, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return fVar.b(mutatePriority, pVar, cVar);
    }
}
