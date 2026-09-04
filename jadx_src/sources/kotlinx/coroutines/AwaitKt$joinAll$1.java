package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
public final class AwaitKt$joinAll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128672f;

    AwaitKt$joinAll$1(kotlin.coroutines.c<? super AwaitKt$joinAll$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128671e = obj;
        this.f128672f |= Integer.MIN_VALUE;
        return AwaitKt.d(null, this);
    }
}
