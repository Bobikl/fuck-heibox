package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
public final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f128684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128685c;

    DelayKt$awaitCancellation$1(kotlin.coroutines.c<? super DelayKt$awaitCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128684b = obj;
        this.f128685c |= Integer.MIN_VALUE;
        return DelayKt.a(this);
    }
}
