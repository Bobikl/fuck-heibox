package androidx.p001datastore.core;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
public final class SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1> cVar) {
        super(cVar);
        this.f22140d = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22139c = obj;
        this.f22141e |= Integer.MIN_VALUE;
        return this.f22140d.v(this);
    }
}
