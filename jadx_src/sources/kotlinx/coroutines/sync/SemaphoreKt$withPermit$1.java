package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
public final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f130481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f130482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f130483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f130484e;

    SemaphoreKt$withPermit$1(kotlin.coroutines.c<? super SemaphoreKt$withPermit$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f130483d = obj;
        this.f130484e |= Integer.MIN_VALUE;
        return SemaphoreKt.q(null, null, this);
    }
}
