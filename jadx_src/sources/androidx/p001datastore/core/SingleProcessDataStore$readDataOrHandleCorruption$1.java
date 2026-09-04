package androidx.p001datastore.core;

import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {c.b.V3, c.b.Y3, c.b.f30532b4}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$readDataOrHandleCorruption$1> cVar) {
        super(cVar);
        this.f22155e = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22154d = obj;
        this.f22156f |= Integer.MIN_VALUE;
        return this.f22155e.y(this);
    }
}
