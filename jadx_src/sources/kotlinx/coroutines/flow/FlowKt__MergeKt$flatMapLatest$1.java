package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {bb.c.b.I0, bb.c.b.I0}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__MergeKt$flatMapLatest$1<R, T> extends SuspendLambda implements yh.q<f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<T, kotlin.coroutines.c<? super e<? extends R>>, Object> f129529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flatMapLatest$1(yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar, kotlin.coroutines.c<? super FlowKt__MergeKt$flatMapLatest$1> cVar) {
        super(3, cVar);
        this.f129529e = pVar;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d f<? super R> fVar, T t10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__MergeKt$flatMapLatest$1 flowKt__MergeKt$flatMapLatest$1 = new FlowKt__MergeKt$flatMapLatest$1(this.f129529e, cVar);
        flowKt__MergeKt$flatMapLatest$1.f129527c = fVar;
        flowKt__MergeKt$flatMapLatest$1.f129528d = t10;
        return flowKt__MergeKt$flatMapLatest$1.invokeSuspend(b2.f124493a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1<R, T> for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @dl.e
    public final java.lang.Object f(@dl.d java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object r3 = r2.f129527c
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.f) r3
            java.lang.Object r0 = r2.f129528d
            yh.p<T, kotlin.coroutines.c<? super kotlinx.coroutines.flow.e<? extends R>>, java.lang.Object> r1 = r2.f129529e
            java.lang.Object r0 = r1.invoke(r0, r2)
            kotlinx.coroutines.flow.e r0 = (kotlinx.coroutines.flow.e) r0
            r1 = 0
            kotlin.jvm.internal.c0.e(r1)
            kotlinx.coroutines.flow.g.m0(r3, r0, r2)
            r3 = 1
            kotlin.jvm.internal.c0.e(r3)
            kotlin.b2 r3 = kotlin.b2.f124493a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1.f(java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1<R, T> for r5v1 'this'  java.lang.Object
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
            int r1 = r5.f129526b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.t0.n(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f129527c
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            kotlin.t0.n(r6)
            goto L39
        L22:
            kotlin.t0.n(r6)
            java.lang.Object r6 = r5.f129527c
            r1 = r6
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            java.lang.Object r6 = r5.f129528d
            yh.p<T, kotlin.coroutines.c<? super kotlinx.coroutines.flow.e<? extends R>>, java.lang.Object> r4 = r5.f129529e
            r5.f129527c = r1
            r5.f129526b = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L39
            return r0
        L39:
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.e) r6
            r3 = 0
            r5.f129527c = r3
            r5.f129526b = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.g.m0(r1, r6, r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
