package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/f;", "", "", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combine$1$1<R> extends SuspendLambda implements yh.q<f<? super R>, Object[], kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<T1, T2, kotlin.coroutines.c<? super R>, Object> f129785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ZipKt$combine$1$1(yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combine$1$1> cVar) {
        super(3, cVar);
        this.f129785e = qVar;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d f<? super R> fVar, @dl.d Object[] objArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f129785e, cVar);
        flowKt__ZipKt$combine$1$1.f129783c = fVar;
        flowKt__ZipKt$combine$1$1.f129784d = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> for r6v1 'this'  java.lang.Object
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
            int r1 = r6.f129782b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.t0.n(r7)
            goto L4c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f129783c
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            kotlin.t0.n(r7)
            goto L40
        L22:
            kotlin.t0.n(r7)
            java.lang.Object r7 = r6.f129783c
            r1 = r7
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            java.lang.Object r7 = r6.f129784d
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            yh.q<T1, T2, kotlin.coroutines.c<? super R>, java.lang.Object> r4 = r6.f129785e
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.f129783c = r1
            r6.f129782b = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L40
            return r0
        L40:
            r3 = 0
            r6.f129783c = r3
            r6.f129782b = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            kotlin.b2 r7 = kotlin.b2.f124493a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
