package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "androidx.work.OperationKt", f = "Operation.kt", i = {0}, l = {39}, m = "await", n = {"$this$await$iv"}, s = {"L$0"})
public final class OperationKt$await$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f28694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f28695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f28696d;

    OperationKt$await$1(kotlin.coroutines.c<? super OperationKt$await$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f28695c = obj;
        this.f28696d |= Integer.MIN_VALUE;
        return OperationKt.a(null, this);
    }
}
