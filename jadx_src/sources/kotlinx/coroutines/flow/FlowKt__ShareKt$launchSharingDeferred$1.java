package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {bb.c.b.C3}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e<T> f129643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ y<u<T>> f129644e;

    /* JADX INFO: compiled from: Share.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<j<T>> f129645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f129646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y<u<T>> f129647d;

        a(Ref.ObjectRef<j<T>> objectRef, q0 q0Var, y<u<T>> yVar) {
            this.f129645b = objectRef;
            this.f129646c = q0Var;
            this.f129647d = yVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.u] */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            b2 b2Var;
            j<T> jVar = this.f129645b.f124891b;
            if (jVar != null) {
                jVar.setValue(t10);
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                q0 q0Var = this.f129646c;
                Ref.ObjectRef<j<T>> objectRef = this.f129645b;
                y<u<T>> yVar = this.f129647d;
                ?? r10 = (T) v.a(t10);
                yVar.A(new l(r10, g2.B(q0Var.getCoroutineContext())));
                objectRef.f124891b = r10;
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharingDeferred$1(e<? extends T> eVar, y<u<T>> yVar, kotlin.coroutines.c<? super FlowKt__ShareKt$launchSharingDeferred$1> cVar) {
        super(2, cVar);
        this.f129643d = eVar;
        this.f129644e = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.f129643d, this.f129644e, cVar);
        flowKt__ShareKt$launchSharingDeferred$1.f129642c = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 for r6v1 'this'  kotlin.coroutines.c
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
            int r1 = r6.f129641b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.t0.n(r7)     // Catch: java.lang.Throwable -> Lf
            goto L37
        Lf:
            r7 = move-exception
            goto L3a
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.t0.n(r7)
            java.lang.Object r7 = r6.f129642c
            kotlinx.coroutines.q0 r7 = (kotlinx.coroutines.q0) r7
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.e<T> r3 = r6.f129643d     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a r4 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.y<kotlinx.coroutines.flow.u<T>> r5 = r6.f129644e     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
            r6.f129641b = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r3.a(r4, r6)     // Catch: java.lang.Throwable -> Lf
            if (r7 != r0) goto L37
            return r0
        L37:
            kotlin.b2 r7 = kotlin.b2.f124493a
            return r7
        L3a:
            kotlinx.coroutines.y<kotlinx.coroutines.flow.u<T>> r0 = r6.f129644e
            r0.i(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
