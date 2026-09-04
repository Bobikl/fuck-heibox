package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/channels/n;", "", "value", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {bb.c.b.J1}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.channels.n<? extends Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f129330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f<T> f129333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, f<? super T> fVar, kotlin.coroutines.c<? super FlowKt__DelayKt$debounceInternal$1$3$2> cVar) {
        super(2, cVar);
        this.f129332e = objectRef;
        this.f129333f = fVar;
    }

    @dl.e
    public final Object a(@dl.d Object obj, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(kotlinx.coroutines.channels.n.b(obj), cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f129332e, this.f129333f, cVar);
        flowKt__DelayKt$debounceInternal$1$3$2.f129331d = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.n<? extends Object> nVar, kotlin.coroutines.c<? super b2> cVar) {
        return a(nVar.getHolder(), cVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 for r6v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r6.f129330c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r6.f129329b
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.t0.n(r7)
            goto L4f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.t0.n(r7)
            java.lang.Object r7 = r6.f129331d
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r7 = r7.getHolder()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.f129332e
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.n.c
            if (r3 != 0) goto L2e
            r1.f124891b = r7
        L2e:
            kotlinx.coroutines.flow.f<T> r4 = r6.f129333f
            if (r3 == 0) goto L56
            java.lang.Throwable r3 = kotlinx.coroutines.channels.n.f(r7)
            if (r3 != 0) goto L55
            T r3 = r1.f124891b
            if (r3 == 0) goto L50
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.flow.internal.l.f130082a
            if (r3 != r5) goto L41
            r3 = 0
        L41:
            r6.f129331d = r7
            r6.f129329b = r1
            r6.f129330c = r2
            java.lang.Object r7 = r4.emit(r3, r6)
            if (r7 != r0) goto L4e
            return r0
        L4e:
            r0 = r1
        L4f:
            r1 = r0
        L50:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.flow.internal.l.f130084c
            r1.f124891b = r7
            goto L56
        L55:
            throw r3
        L56:
            kotlin.b2 r7 = kotlin.b2.f124493a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
