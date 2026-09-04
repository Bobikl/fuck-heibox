package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {bb.c.b.f31010w4, bb.c.b.I4, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class StateFlowImpl$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f129912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f129913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f129914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f129915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ StateFlowImpl<T> f129916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f129917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, kotlin.coroutines.c<? super StateFlowImpl$collect$1> cVar) {
        super(cVar);
        this.f129916h = stateFlowImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.StateFlowImpl$collect$1 for r1v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r2) {
        /*
            r1 = this;
            r1.f129915g = r2
            int r2 = r1.f129917i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f129917i = r2
            kotlinx.coroutines.flow.StateFlowImpl<T> r2 = r1.f129916h
            r0 = 0
            java.lang.Object r2 = r2.a(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl$collect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
