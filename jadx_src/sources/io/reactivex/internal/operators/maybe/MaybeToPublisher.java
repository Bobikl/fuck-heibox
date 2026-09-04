package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes12.dex */
public enum MaybeToPublisher implements kh.o<io.reactivex.w<Object>, org.reactivestreams.c<Object>> {
    INSTANCE;

    public static <T> kh.o<io.reactivex.w<T>, org.reactivestreams.c<T>> instance() {
        return INSTANCE;
    }

    @Override // kh.o
    public org.reactivestreams.c<Object> apply(io.reactivex.w<Object> wVar) throws Exception {
        return new MaybeToFlowable(wVar);
    }
}
