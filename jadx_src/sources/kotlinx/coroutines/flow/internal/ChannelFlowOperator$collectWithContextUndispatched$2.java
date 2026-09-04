package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlowOperator$collectWithContextUndispatched$2<T> extends SuspendLambda implements p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChannelFlowOperator<S, T> f129965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator<S, T> channelFlowOperator, kotlin.coroutines.c<? super ChannelFlowOperator$collectWithContextUndispatched$2> cVar) {
        super(2, cVar);
        this.f129965d = channelFlowOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f129965d, cVar);
        channelFlowOperator$collectWithContextUndispatched$2.f129964c = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2<T> for r3v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r3.f129963b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r4)
            goto L29
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.t0.n(r4)
            java.lang.Object r4 = r3.f129964c
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.f) r4
            kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r3.f129965d
            r3.f129963b = r2
            java.lang.Object r4 = r1.s(r4, r3)
            if (r4 != r0) goto L29
            return r0
        L29:
            kotlin.b2 r4 = kotlin.b2.f124493a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
