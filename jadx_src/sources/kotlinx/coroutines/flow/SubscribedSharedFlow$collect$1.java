package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
public final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f129927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SubscribedSharedFlow<T> f129928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribedSharedFlow$collect$1(SubscribedSharedFlow<T> subscribedSharedFlow, kotlin.coroutines.c<? super SubscribedSharedFlow$collect$1> cVar) {
        super(cVar);
        this.f129928c = subscribedSharedFlow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f129927b = r2
            int r2 = r1.f129929d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f129929d = r2
            kotlinx.coroutines.flow.SubscribedSharedFlow<T> r2 = r1.f129928c
            r0 = 0
            java.lang.Object r2 = r2.a(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
