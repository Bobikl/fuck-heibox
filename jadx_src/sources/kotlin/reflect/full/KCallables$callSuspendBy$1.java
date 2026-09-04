package kotlin.reflect.full;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: KCallables.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0, 0}, l = {74}, m = "callSuspendBy", n = {"$this$callSuspendBy", "args", "kCallable"}, s = {"L$0", "L$1", "L$2"})
public final class KCallables$callSuspendBy$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f125055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f125056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f125057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f125058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f125059f;

    KCallables$callSuspendBy$1(kotlin.coroutines.c<? super KCallables$callSuspendBy$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f125058e = obj;
        this.f125059f |= Integer.MIN_VALUE;
        return KCallables.b(null, null, this);
    }
}
