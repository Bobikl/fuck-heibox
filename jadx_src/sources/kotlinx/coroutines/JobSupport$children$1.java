package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Lkotlinx/coroutines/d2;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {bb.c.b.f30889qf, bb.c.b.f30933sf}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super d2>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ JobSupport f128708g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JobSupport$children$1(JobSupport jobSupport, kotlin.coroutines.c<? super JobSupport$children$1> cVar) {
        super(2, cVar);
        this.f128708g = jobSupport;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super d2> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((JobSupport$children$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.f128708g, cVar);
        jobSupport$children$1.f128707f = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r7.f128706e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r7.f128705d
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.f128704c
            kotlinx.coroutines.internal.v r3 = (kotlinx.coroutines.internal.v) r3
            java.lang.Object r4 = r7.f128707f
            kotlin.sequences.o r4 = (kotlin.sequences.o) r4
            kotlin.t0.n(r8)
            r8 = r7
            goto L7e
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            kotlin.t0.n(r8)
            goto L83
        L2b:
            kotlin.t0.n(r8)
            java.lang.Object r8 = r7.f128707f
            kotlin.sequences.o r8 = (kotlin.sequences.o) r8
            kotlinx.coroutines.JobSupport r1 = r7.f128708g
            java.lang.Object r1 = r1.T0()
            boolean r4 = r1 instanceof kotlinx.coroutines.w
            if (r4 == 0) goto L49
            kotlinx.coroutines.w r1 = (kotlinx.coroutines.w) r1
            kotlinx.coroutines.x r1 = r1.childJob
            r7.f128706e = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L83
            return r0
        L49:
            boolean r3 = r1 instanceof kotlinx.coroutines.x1
            if (r3 == 0) goto L83
            kotlinx.coroutines.x1 r1 = (kotlinx.coroutines.x1) r1
            kotlinx.coroutines.o2 r1 = r1.getList()
            if (r1 == 0) goto L83
            java.lang.Object r3 = r1.N()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L60:
            boolean r5 = kotlin.jvm.internal.f0.g(r1, r3)
            if (r5 != 0) goto L83
            boolean r5 = r1 instanceof kotlinx.coroutines.w
            if (r5 == 0) goto L7e
            r5 = r1
            kotlinx.coroutines.w r5 = (kotlinx.coroutines.w) r5
            kotlinx.coroutines.x r5 = r5.childJob
            r8.f128707f = r4
            r8.f128704c = r3
            r8.f128705d = r1
            r8.f128706e = r2
            java.lang.Object r5 = r4.a(r5, r8)
            if (r5 != r0) goto L7e
            return r0
        L7e:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.O()
            goto L60
        L83:
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
