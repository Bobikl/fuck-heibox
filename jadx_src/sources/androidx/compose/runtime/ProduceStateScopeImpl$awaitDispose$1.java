package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {bb.c.b.f30941t1}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
public final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f12427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ProduceStateScopeImpl<T> f12428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f12429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProduceStateScopeImpl$awaitDispose$1(ProduceStateScopeImpl<T> produceStateScopeImpl, kotlin.coroutines.c<? super ProduceStateScopeImpl$awaitDispose$1> cVar) {
        super(cVar);
        this.f12428d = produceStateScopeImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 for r1v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r2) {
        /*
            r1 = this;
            r1.f12427c = r2
            int r2 = r1.f12429e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f12429e = r2
            androidx.compose.runtime.ProduceStateScopeImpl<T> r2 = r1.f12428d
            r0 = 0
            java.lang.Object r2 = r2.o(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
