package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Flow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {bb.c.b.f31007w1}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
public final class AbstractFlow$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractFlow<T> f129193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f129194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, kotlin.coroutines.c<? super AbstractFlow$collect$1> cVar) {
        super(cVar);
        this.f129193d = abstractFlow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.AbstractFlow$collect$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f129192c = r2
            int r2 = r1.f129194e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f129194e = r2
            kotlinx.coroutines.flow.AbstractFlow<T> r2 = r1.f129193d
            r0 = 0
            java.lang.Object r2 = r2.a(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow$collect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
