package androidx.p001datastore.core;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$readAndInitOrPropagateFailure$1> cVar) {
        super(cVar);
        this.f22144d = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22143c = obj;
        this.f22145e |= Integer.MIN_VALUE;
        return this.f22144d.w(this);
    }
}
