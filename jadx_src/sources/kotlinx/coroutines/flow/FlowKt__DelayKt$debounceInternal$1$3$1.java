package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {bb.c.b.f31073z1}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f<T> f129327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1$3$1(f<? super T> fVar, Ref.ObjectRef<Object> objectRef, kotlin.coroutines.c<? super FlowKt__DelayKt$debounceInternal$1$3$1> cVar) {
        super(1, cVar);
        this.f129327c = fVar;
        this.f129328d = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f129327c, this.f129328d, cVar);
    }

    @Override // yh.l
    @dl.e
    public final Object invoke(@dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 for r5v1 'this'  kotlin.coroutines.c
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
            int r1 = r5.f129326b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.t0.n(r6)
            goto L2f
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.t0.n(r6)
            kotlinx.coroutines.flow.f<T> r6 = r5.f129327c
            kotlinx.coroutines.internal.o0 r1 = kotlinx.coroutines.flow.internal.l.f130082a
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r5.f129328d
            T r4 = r4.f124891b
            if (r4 != r1) goto L26
            r4 = r2
        L26:
            r5.f129326b = r3
            java.lang.Object r6 = r6.emit(r4, r5)
            if (r6 != r0) goto L2f
            return r0
        L2f:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.f129328d
            r6.f124891b = r2
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
