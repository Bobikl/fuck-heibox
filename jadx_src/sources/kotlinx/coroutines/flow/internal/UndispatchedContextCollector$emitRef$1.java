package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
public final class UndispatchedContextCollector$emitRef$1<T> extends SuspendLambda implements p<T, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f130069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f130070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<T> f130071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UndispatchedContextCollector$emitRef$1(kotlinx.coroutines.flow.f<? super T> fVar, kotlin.coroutines.c<? super UndispatchedContextCollector$emitRef$1> cVar) {
        super(2, cVar);
        this.f130071d = fVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(T t10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(t10, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f130071d, cVar);
        undispatchedContextCollector$emitRef$1.f130070c = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1<T> for r3v1 'this'  kotlin.coroutines.c
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
            int r1 = r3.f130069b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r4)
            goto L27
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.t0.n(r4)
            java.lang.Object r4 = r3.f130070c
            kotlinx.coroutines.flow.f<T> r1 = r3.f130071d
            r3.f130069b = r2
            java.lang.Object r4 = r1.emit(r4, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            kotlin.b2 r4 = kotlin.b2.f124493a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
