package androidx.p001datastore.core;

import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {c.b.f30900r4}, m = "readData", n = {"this"}, s = {"L$0"})
public final class SingleProcessDataStore$readData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f22149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f22151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readData$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$readData$1> cVar) {
        super(cVar);
        this.f22150f = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22149e = obj;
        this.f22151g |= Integer.MIN_VALUE;
        return this.f22150f.x(this);
    }
}
