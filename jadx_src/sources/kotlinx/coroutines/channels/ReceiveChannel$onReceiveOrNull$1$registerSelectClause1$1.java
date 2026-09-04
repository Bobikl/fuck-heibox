package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, E] */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"R", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/n;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
public final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1<E, R> extends SuspendLambda implements yh.p<n<? extends E>, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p<E, kotlin.coroutines.c<? super R>, Object> f129003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(yh.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> cVar) {
        super(2, cVar);
        this.f129003d = pVar;
    }

    @dl.e
    public final Object a(@dl.d Object obj, @dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1) create(n.b(obj), cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.f129003d, cVar);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.f129002c = obj;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((n) obj).getHolder(), (kotlin.coroutines.c) obj2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1<E, R> for r3v1 'this'  java.lang.Object
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
            int r1 = r3.f129001b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r4)
            goto L37
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.t0.n(r4)
            java.lang.Object r4 = r3.f129002c
            kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
            java.lang.Object r4 = r4.getHolder()
            java.lang.Throwable r1 = kotlinx.coroutines.channels.n.f(r4)
            if (r1 != 0) goto L38
            yh.p<E, kotlin.coroutines.c<? super R>, java.lang.Object> r1 = r3.f129003d
            java.lang.Object r4 = kotlinx.coroutines.channels.n.h(r4)
            r3.f129001b = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L37
            return r0
        L37:
            return r4
        L38:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
