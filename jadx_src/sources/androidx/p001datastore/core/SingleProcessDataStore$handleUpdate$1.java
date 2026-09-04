package androidx.p001datastore.core;

import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {c.b.f30876q2, c.b.f30986v2, c.b.f31052y2}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
public final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f22114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f22116g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$handleUpdate$1> cVar) {
        super(cVar);
        this.f22115f = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22114e = obj;
        this.f22116g |= Integer.MIN_VALUE;
        return this.f22115f.t(null, this);
    }
}
