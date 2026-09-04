package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__EmittersKt$transform$1<R> extends SuspendLambda implements yh.p<f<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e<T> f129403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> f129404e;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> f129405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<R> f129406c;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, f<? super R> fVar) {
            this.f129405b = qVar;
            this.f129406c = fVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @dl.e
        public final Object a(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            c0.e(4);
            new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
            c0.e(5);
            this.f129405b.invoke((f<? super R>) this.f129406c, t10, cVar);
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
            if (cVar instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) cVar;
                int i10 = flowKt__EmittersKt$transform$1$1$emit$1.f129409d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$transform$1$1$emit$1.f129409d = i10 - Integer.MIN_VALUE;
                } else {
                    flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
                }
            } else {
                flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
            }
            Object obj = flowKt__EmittersKt$transform$1$1$emit$1.f129407b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = flowKt__EmittersKt$transform$1$1$emit$1.f129409d;
            if (i11 == 0) {
                t0.n(obj);
                yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> qVar = this.f129405b;
                f<R> fVar = this.f129406c;
                flowKt__EmittersKt$transform$1$1$emit$1.f129409d = 1;
                if (qVar.invoke((f<? super R>) fVar, t10, flowKt__EmittersKt$transform$1$1$emit$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1(e<? extends T> eVar, yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__EmittersKt$transform$1> cVar) {
        super(2, cVar);
        this.f129403d = eVar;
        this.f129404e = qVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1<R> for r3v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @dl.e
    public final java.lang.Object a(@dl.d java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f129402c
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.f) r4
            kotlinx.coroutines.flow.e<T> r0 = r3.f129403d
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
            yh.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super kotlin.b2>, java.lang.Object> r2 = r3.f129404e
            r1.<init>(r2, r4)
            r4 = 0
            kotlin.jvm.internal.c0.e(r4)
            r0.a(r1, r3)
            r4 = 1
            kotlin.jvm.internal.c0.e(r4)
            kotlin.b2 r4 = kotlin.b2.f124493a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.a(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.f129403d, this.f129404e, cVar);
        flowKt__EmittersKt$transform$1.f129402c = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d f<? super R> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__EmittersKt$transform$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1<R> for r5v1 'this'  kotlin.coroutines.c
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
            int r1 = r5.f129401b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r6)
            goto L30
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.t0.n(r6)
            java.lang.Object r6 = r5.f129402c
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.f) r6
            kotlinx.coroutines.flow.e<T> r1 = r5.f129403d
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
            yh.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super kotlin.b2>, java.lang.Object> r4 = r5.f129404e
            r3.<init>(r4, r6)
            r5.f129401b = r2
            java.lang.Object r6 = r1.a(r3, r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
