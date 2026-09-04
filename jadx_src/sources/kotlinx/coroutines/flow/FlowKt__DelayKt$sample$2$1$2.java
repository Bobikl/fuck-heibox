package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements yh.p<b2, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f<T> f129358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$sample$2$1$2(Ref.ObjectRef<Object> objectRef, f<? super T> fVar, kotlin.coroutines.c<? super FlowKt__DelayKt$sample$2$1$2> cVar) {
        super(2, cVar);
        this.f129357c = objectRef;
        this.f129358d = fVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d b2 b2Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(b2Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.f129357c, this.f129358d, cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 for r5v1 'this'  kotlin.coroutines.c
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
            int r1 = r5.f129356b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r6)
            goto L36
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.t0.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.f129357c
            T r1 = r6.f124891b
            if (r1 != 0) goto L23
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        L23:
            r3 = 0
            r6.f124891b = r3
            kotlinx.coroutines.flow.f<T> r6 = r5.f129358d
            kotlinx.coroutines.internal.o0 r4 = kotlinx.coroutines.flow.internal.l.f130082a
            if (r1 != r4) goto L2d
            r1 = r3
        L2d:
            r5.f129356b = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L36
            return r0
        L36:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
