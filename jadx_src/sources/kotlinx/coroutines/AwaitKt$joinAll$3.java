package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
public final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128675d;

    AwaitKt$joinAll$3(kotlin.coroutines.c<? super AwaitKt$joinAll$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128674c = obj;
        this.f128675d |= Integer.MIN_VALUE;
        return AwaitKt.c(null, this);
    }
}
