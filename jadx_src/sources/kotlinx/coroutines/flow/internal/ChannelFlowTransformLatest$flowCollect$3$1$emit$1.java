package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f129981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f129982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1<T> f129983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f129984g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.c<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> cVar) {
        super(cVar);
        this.f129983f = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f129982e = r2
            int r2 = r1.f129984g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f129984g = r2
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1<T> r2 = r1.f129983f
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
