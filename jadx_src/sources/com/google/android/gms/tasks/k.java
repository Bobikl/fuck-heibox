package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k<TResult> {
    @androidx.annotation.n0
    public k<TResult> a(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @androidx.annotation.n0
    public k<TResult> b(@androidx.annotation.n0 d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @androidx.annotation.n0
    public k<TResult> c(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @androidx.annotation.n0
    public k<TResult> d(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.n0
    public k<TResult> e(@androidx.annotation.n0 e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.n0
    public k<TResult> f(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.n0
    public abstract k<TResult> g(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 f fVar);

    @androidx.annotation.n0
    public abstract k<TResult> h(@androidx.annotation.n0 f fVar);

    @androidx.annotation.n0
    public abstract k<TResult> i(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 f fVar);

    @androidx.annotation.n0
    public abstract k<TResult> j(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 g<? super TResult> gVar);

    @androidx.annotation.n0
    public abstract k<TResult> k(@androidx.annotation.n0 g<? super TResult> gVar);

    @androidx.annotation.n0
    public abstract k<TResult> l(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 g<? super TResult> gVar);

    @androidx.annotation.n0
    public <TContinuationResult> k<TContinuationResult> m(@androidx.annotation.n0 c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @androidx.annotation.n0
    public <TContinuationResult> k<TContinuationResult> n(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @androidx.annotation.n0
    public <TContinuationResult> k<TContinuationResult> o(@androidx.annotation.n0 c<TResult, k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.n0
    public <TContinuationResult> k<TContinuationResult> p(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 c<TResult, k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.p0
    public abstract Exception q();

    public abstract TResult r();

    public abstract <X extends Throwable> TResult s(@androidx.annotation.n0 Class<X> cls) throws Throwable;

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    @androidx.annotation.n0
    public <TContinuationResult> k<TContinuationResult> w(@androidx.annotation.n0 j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @androidx.annotation.n0
    public <TContinuationResult> k<TContinuationResult> x(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
