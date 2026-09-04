package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4", f = "ProduceState.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
public final class SnapshotStateKt__ProduceStateKt$produceState$4 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f12562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p<i1<T>, kotlin.coroutines.c<? super kotlin.b2>, Object> f12563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ a1<T> f12564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__ProduceStateKt$produceState$4(yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar, a1<T> a1Var, kotlin.coroutines.c<? super SnapshotStateKt__ProduceStateKt$produceState$4> cVar) {
        super(2, cVar);
        this.f12563d = pVar;
        this.f12564e = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SnapshotStateKt__ProduceStateKt$produceState$4 snapshotStateKt__ProduceStateKt$produceState$4 = new SnapshotStateKt__ProduceStateKt$produceState$4(this.f12563d, this.f12564e, cVar);
        snapshotStateKt__ProduceStateKt$produceState$4.f12562c = obj;
        return snapshotStateKt__ProduceStateKt$produceState$4;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$4) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4 for r5v1 'this'  java.lang.Object
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
            int r1 = r5.f12561b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r6)
            goto L34
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.t0.n(r6)
            java.lang.Object r6 = r5.f12562c
            kotlinx.coroutines.q0 r6 = (kotlinx.coroutines.q0) r6
            yh.p<androidx.compose.runtime.i1<T>, kotlin.coroutines.c<? super kotlin.b2>, java.lang.Object> r1 = r5.f12563d
            androidx.compose.runtime.ProduceStateScopeImpl r3 = new androidx.compose.runtime.ProduceStateScopeImpl
            androidx.compose.runtime.a1<T> r4 = r5.f12564e
            kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
            r3.<init>(r4, r6)
            r5.f12561b = r2
            java.lang.Object r6 = r1.invoke(r3, r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
