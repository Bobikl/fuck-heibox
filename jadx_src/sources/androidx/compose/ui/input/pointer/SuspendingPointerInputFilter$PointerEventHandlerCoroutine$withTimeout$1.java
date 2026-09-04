package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {bb.c.b.f30607e9}, m = "withTimeout", n = {"job"}, s = {"L$0"})
public final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f14711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f14712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f14713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f14714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, kotlin.coroutines.c<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1> cVar) {
        super(cVar);
        this.f14713d = pointerEventHandlerCoroutine;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1<T> for r3v1 'this'  kotlin.coroutines.c
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
            r3.f14712c = r4
            int r4 = r3.f14714e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r0
            r3.f14714e = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r4 = r3.f14713d
            r0 = 0
            r2 = 0
            java.lang.Object r4 = r4.f0(r0, r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
