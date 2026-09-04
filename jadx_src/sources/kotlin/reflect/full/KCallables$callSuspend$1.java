package kotlin.reflect.full;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: KCallables.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0}, l = {56}, m = "callSuspend", n = {"$this$callSuspend", "args"}, s = {"L$0", "L$1"})
public final class KCallables$callSuspend$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f125051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f125052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f125053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f125054e;

    KCallables$callSuspend$1(kotlin.coroutines.c<? super KCallables$callSuspend$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f125053d = obj;
        this.f125054e |= Integer.MIN_VALUE;
        return KCallables.a(null, null, this);
    }
}
