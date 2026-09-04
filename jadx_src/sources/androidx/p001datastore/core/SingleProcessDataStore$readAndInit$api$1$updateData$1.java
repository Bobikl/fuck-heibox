package androidx.p001datastore.core;

import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {503, c.b.f31075z3, c.b.B3}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f22133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f22134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f22135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 f22136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f22137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, kotlin.coroutines.c<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> cVar) {
        super(cVar);
        this.f22136h = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22135g = obj;
        this.f22137i |= Integer.MIN_VALUE;
        return this.f22136h.a(null, this);
    }
}
