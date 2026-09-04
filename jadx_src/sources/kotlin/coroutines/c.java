package kotlin.coroutines;

import kotlin.u0;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public interface c<T> {
    @dl.d
    CoroutineContext getContext();

    void resumeWith(@dl.d Object obj);
}
