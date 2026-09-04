package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.o;
import kotlin.t0;
import yh.p;

/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Ljava/lang/StackTraceElement;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements p<o<? super StackTraceElement>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f129118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f129119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DebugCoroutineInfo f129120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f129121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfo debugCoroutineInfo, i iVar, kotlin.coroutines.c<? super DebugCoroutineInfoImpl$creationStackTrace$1> cVar) {
        super(2, cVar);
        this.f129120e = debugCoroutineInfo;
        this.f129121f = iVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d o<? super StackTraceElement> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.f129120e, this.f129121f, cVar);
        debugCoroutineInfoImpl$creationStackTrace$1.f129119d = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129118c;
        if (i10 == 0) {
            t0.n(obj);
            o oVar = (o) this.f129119d;
            DebugCoroutineInfo debugCoroutineInfo = this.f129120e;
            kotlin.coroutines.jvm.internal.c callerFrame = this.f129121f.getCallerFrame();
            this.f129118c = 1;
            if (debugCoroutineInfo.k(oVar, callerFrame, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
