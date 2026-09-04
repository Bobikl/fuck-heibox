package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {bb.c.b.f30722j9}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f128769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractChannel<E> f128770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, kotlin.coroutines.c<? super AbstractChannel$receiveCatching$1> cVar) {
        super(cVar);
        this.f128770c = abstractChannel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f128769b = r2
            int r2 = r1.f128771d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f128771d = r2
            kotlinx.coroutines.channels.AbstractChannel<E> r2 = r1.f128770c
            java.lang.Object r2 = r2.H(r1)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            if (r2 != r0) goto L16
            return r2
        L16:
            kotlinx.coroutines.channels.n r2 = kotlinx.coroutines.channels.n.b(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
