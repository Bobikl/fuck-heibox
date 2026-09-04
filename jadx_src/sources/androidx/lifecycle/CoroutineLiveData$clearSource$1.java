package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {bb.c.b.B1}, m = "clearSource$lifecycle_livedata_ktx_release", n = {"this"}, s = {"L$0"})
public final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f23968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f23969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CoroutineLiveData<T> f23970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f23971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveData$clearSource$1(CoroutineLiveData<T> coroutineLiveData, kotlin.coroutines.c<? super CoroutineLiveData$clearSource$1> cVar) {
        super(cVar);
        this.f23970d = coroutineLiveData;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.lifecycle.CoroutineLiveData$clearSource$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f23969c = r2
            int r2 = r1.f23971e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f23971e = r2
            androidx.lifecycle.CoroutineLiveData<T> r2 = r1.f23970d
            java.lang.Object r2 = r2.v(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData$clearSource$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
