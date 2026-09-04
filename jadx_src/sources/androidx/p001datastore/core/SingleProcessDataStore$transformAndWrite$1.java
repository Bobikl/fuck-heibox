package androidx.p001datastore.core;

import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, c.b.U4}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
public final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f22160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f22162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$transformAndWrite$1> cVar) {
        super(cVar);
        this.f22161f = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22160e = obj;
        this.f22162g |= Integer.MIN_VALUE;
        return this.f22161f.z(null, null, this);
    }
}
