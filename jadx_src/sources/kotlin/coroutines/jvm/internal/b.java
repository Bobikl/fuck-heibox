package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements kotlin.coroutines.c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final b f124720b = new b();

    private b() {
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @dl.d
    public String toString() {
        return "This continuation is already complete";
    }
}
