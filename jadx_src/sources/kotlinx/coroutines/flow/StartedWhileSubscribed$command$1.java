package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements yh.q<f<? super SharingCommand>, Integer, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ int f129905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ StartedWhileSubscribed f129906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, kotlin.coroutines.c<? super StartedWhileSubscribed$command$1> cVar) {
        super(3, cVar);
        this.f129906e = startedWhileSubscribed;
    }

    @dl.e
    public final Object a(@dl.d f<? super SharingCommand> fVar, int i10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f129906e, cVar);
        startedWhileSubscribed$command$1.f129904c = fVar;
        startedWhileSubscribed$command$1.f129905d = i10;
        return startedWhileSubscribed$command$1.invokeSuspend(b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(f<? super SharingCommand> fVar, Integer num, kotlin.coroutines.c<? super b2> cVar) {
        return a(fVar, num.intValue(), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        f fVar;
        SharingCommand sharingCommand;
        long j10;
        SharingCommand sharingCommand2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129903b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    fVar = (f) this.f129904c;
                    t0.n(obj);
                    if (this.f129906e.replayExpiration > 0) {
                        sharingCommand = SharingCommand.STOP;
                        this.f129904c = fVar;
                        this.f129903b = 3;
                        if (fVar.emit(sharingCommand, this) == objH) {
                            return objH;
                        }
                        j10 = this.f129906e.replayExpiration;
                        this.f129904c = fVar;
                        this.f129903b = 4;
                        if (DelayKt.b(j10, this) == objH) {
                            return objH;
                        }
                    }
                } else if (i10 == 3) {
                    fVar = (f) this.f129904c;
                    t0.n(obj);
                    j10 = this.f129906e.replayExpiration;
                    this.f129904c = fVar;
                    this.f129903b = 4;
                    if (DelayKt.b(j10, this) == objH) {
                        return objH;
                    }
                } else if (i10 == 4) {
                    fVar = (f) this.f129904c;
                    t0.n(obj);
                } else if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sharingCommand2 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.f129904c = null;
                this.f129903b = 5;
                if (fVar.emit(sharingCommand2, this) == objH) {
                    return objH;
                }
            }
            t0.n(obj);
        } else {
            t0.n(obj);
            fVar = (f) this.f129904c;
            if (this.f129905d > 0) {
                SharingCommand sharingCommand3 = SharingCommand.START;
                this.f129903b = 1;
                if (fVar.emit(sharingCommand3, this) == objH) {
                    return objH;
                }
            } else {
                long j11 = this.f129906e.stopTimeout;
                this.f129904c = fVar;
                this.f129903b = 2;
                if (DelayKt.b(j11, this) == objH) {
                    return objH;
                }
                if (this.f129906e.replayExpiration > 0) {
                    sharingCommand = SharingCommand.STOP;
                    this.f129904c = fVar;
                    this.f129903b = 3;
                    if (fVar.emit(sharingCommand, this) == objH) {
                        return objH;
                    }
                    j10 = this.f129906e.replayExpiration;
                    this.f129904c = fVar;
                    this.f129903b = 4;
                    if (DelayKt.b(j10, this) == objH) {
                        return objH;
                    }
                }
                sharingCommand2 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.f129904c = null;
                this.f129903b = 5;
                if (fVar.emit(sharingCommand2, this) == objH) {
                    return objH;
                }
            }
        }
        return b2.f124493a;
    }
}
