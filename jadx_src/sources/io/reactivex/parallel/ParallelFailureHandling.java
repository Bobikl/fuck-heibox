package io.reactivex.parallel;

/* JADX INFO: loaded from: classes5.dex */
public enum ParallelFailureHandling implements kh.c<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // kh.c
    public ParallelFailureHandling apply(Long l10, Throwable th2) {
        return this;
    }
}
