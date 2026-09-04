package androidx.core.util;

import kotlin.b2;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    @dl.d
    public static final Runnable a(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return new ContinuationRunnable(cVar);
    }
}
