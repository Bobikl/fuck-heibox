package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, 316, 317}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
public final class FlowKt__DelayKt$fixedPeriodTicker$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.channels.w<? super b2>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f129343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f129344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$fixedPeriodTicker$3(long j10, long j11, kotlin.coroutines.c<? super FlowKt__DelayKt$fixedPeriodTicker$3> cVar) {
        super(2, cVar);
        this.f129343d = j10;
        this.f129344e = j11;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.channels.w<? super b2> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$3) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.f129343d, this.f129344e, cVar);
        flowKt__DelayKt$fixedPeriodTicker$3.f129342c = obj;
        return flowKt__DelayKt$fixedPeriodTicker$3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:15:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:5:0x000d
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
            int r1 = r7.f129341b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L11
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
        L11:
            java.lang.Object r1 = r7.f129342c
            kotlinx.coroutines.channels.w r1 = (kotlinx.coroutines.channels.w) r1
            kotlin.t0.n(r8)
            goto L3f
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.f129342c
            kotlinx.coroutines.channels.w r1 = (kotlinx.coroutines.channels.w) r1
            kotlin.t0.n(r8)
            r8 = r7
            goto L51
        L2a:
            kotlin.t0.n(r8)
            java.lang.Object r8 = r7.f129342c
            r1 = r8
            kotlinx.coroutines.channels.w r1 = (kotlinx.coroutines.channels.w) r1
            long r5 = r7.f129343d
            r7.f129342c = r1
            r7.f129341b = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r5, r7)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            r8 = r7
        L40:
            kotlinx.coroutines.channels.b0 r4 = r1.c()
            kotlin.b2 r5 = kotlin.b2.f124493a
            r8.f129342c = r1
            r8.f129341b = r3
            java.lang.Object r4 = r4.X(r5, r8)
            if (r4 != r0) goto L51
            return r0
        L51:
            long r4 = r8.f129344e
            r8.f129342c = r1
            r8.f129341b = r2
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.b(r4, r8)
            if (r4 != r0) goto L40
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
