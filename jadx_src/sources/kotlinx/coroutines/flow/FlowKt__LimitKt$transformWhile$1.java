package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
public final class FlowKt__LimitKt$transformWhile$1<R> extends SuspendLambda implements yh.p<f<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e<T> f129508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<f<? super R>, T, kotlin.coroutines.c<? super Boolean>, Object> f129509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$transformWhile$1(e<? extends T> eVar, yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__LimitKt$transformWhile$1> cVar) {
        super(2, cVar);
        this.f129508d = eVar;
        this.f129509e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f129508d, this.f129509e, cVar);
        flowKt__LimitKt$transformWhile$1.f129507c = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d f<? super R> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__LimitKt$transformWhile$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1<R> for r5v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r5.f129506b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r5.f129507c
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
            kotlin.t0.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L13
            goto L3d
        L13:
            r6 = move-exception
            goto L3a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.t0.n(r6)
            java.lang.Object r6 = r5.f129507c
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.f) r6
            kotlinx.coroutines.flow.e<T> r1 = r5.f129508d
            yh.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f129509e
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
            r4.<init>(r3, r6)
            r5.f129507c = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            r5.f129506b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            java.lang.Object r6 = r1.a(r4, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            if (r6 != r0) goto L3d
            return r0
        L38:
            r6 = move-exception
            r0 = r4
        L3a:
            kotlinx.coroutines.flow.internal.h.b(r6, r0)
        L3d:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
