package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
public final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f129490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ FlowKt__LimitKt$take$2$1<T> f129491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1<? super T> flowKt__LimitKt$take$2$1, kotlin.coroutines.c<? super FlowKt__LimitKt$take$2$1$emit$1> cVar) {
        super(cVar);
        this.f129491c = flowKt__LimitKt$take$2$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 for r1v1 'this'  kotlin.coroutines.c
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
            r1.f129490b = r2
            int r2 = r1.f129492d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f129492d = r2
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1<T> r2 = r1.f129491c
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
