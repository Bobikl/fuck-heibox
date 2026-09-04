package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements yh.p<SharingCommand, kotlin.coroutines.c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129908c;

    StartedWhileSubscribed$command$2(kotlin.coroutines.c<? super StartedWhileSubscribed$command$2> cVar) {
        super(2, cVar);
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d SharingCommand sharingCommand, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(cVar);
        startedWhileSubscribed$command$2.f129908c = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f129907b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return kotlin.coroutines.jvm.internal.a.a(((SharingCommand) this.f129908c) != SharingCommand.START);
    }
}
