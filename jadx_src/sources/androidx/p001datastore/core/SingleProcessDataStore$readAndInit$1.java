package androidx.p001datastore.core;

import bb.c;
import com.umeng.socialize.tracker.a;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {c.b.f30739k3, c.b.K3, 505}, m = "readAndInit", n = {"updateLock", a.f106350c, "updateLock", a.f106350c, "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
public final class SingleProcessDataStore$readAndInit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f22120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f22121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f22122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f22123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f22125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInit$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$readAndInit$1> cVar) {
        super(cVar);
        this.f22124i = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22123h = obj;
        this.f22125j |= Integer.MIN_VALUE;
        return this.f22124i.u(this);
    }
}
