package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "R", "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, bb.c.b.f30739k3, bb.c.b.f30739k3}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
public final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements yh.p<w<Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f128884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.p<Object, kotlin.coroutines.c<? super ReceiveChannel<Object>>, Object> f128886f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel<Object> receiveChannel, yh.p<Object, ? super kotlin.coroutines.c<? super ReceiveChannel<Object>>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$flatMap$1> cVar) {
        super(2, cVar);
        this.f128885e = receiveChannel;
        this.f128886f = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.f128885e, this.f128886f, cVar);
        channelsKt__DeprecatedKt$flatMap$1.f128884d = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0091 -> B:14:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r9.f128883c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L45
            if (r1 == r4) goto L35
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r9.f128882b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f128884d
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r10)
            goto L53
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            java.lang.Object r1 = r9.f128882b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f128884d
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L82
        L35:
            java.lang.Object r1 = r9.f128882b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f128884d
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L67
        L45:
            kotlin.t0.n(r10)
            java.lang.Object r10 = r9.f128884d
            kotlinx.coroutines.channels.w r10 = (kotlinx.coroutines.channels.w) r10
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r9.f128885e
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r10
        L53:
            r10 = r9
        L54:
            r10.f128884d = r5
            r10.f128882b = r1
            r10.f128883c = r4
            java.lang.Object r6 = r1.b(r10)
            if (r6 != r0) goto L61
            return r0
        L61:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            java.lang.Object r10 = r5.next()
            yh.p<java.lang.Object, kotlin.coroutines.c<? super kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object>>, java.lang.Object> r7 = r0.f128886f
            r0.f128884d = r6
            r0.f128882b = r5
            r0.f128883c = r3
            java.lang.Object r10 = r7.invoke(r10, r0)
            if (r10 != r1) goto L82
            return r1
        L82:
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            r0.f128884d = r6
            r0.f128882b = r5
            r0.f128883c = r2
            java.lang.Object r10 = kotlinx.coroutines.channels.o.e0(r10, r6, r0)
            if (r10 != r1) goto L91
            return r1
        L91:
            r10 = r0
            r0 = r1
            r1 = r5
            r5 = r6
            goto L54
        L96:
            kotlin.b2 r10 = kotlin.b2.f124493a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
