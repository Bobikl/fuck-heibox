package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {bb.c.b.f30715j2, 270, bb.c.b.f30761l2}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
public final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements yh.p<w<Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f128960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.p<Object, kotlin.coroutines.c<? super Boolean>, Object> f128962g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel<Object> receiveChannel, yh.p<Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$takeWhile$1> cVar) {
        super(2, cVar);
        this.f128961f = receiveChannel;
        this.f128962g = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.f128961f, this.f128962g, cVar);
        channelsKt__DeprecatedKt$takeWhile$1.f128960e = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a7 -> B:14:0x0057). Please report as a decompilation issue!!! */
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
            int r1 = r9.f128959d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L48
            if (r1 == r4) goto L38
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r9.f128957b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f128960e
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r10)
            goto L56
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            java.lang.Object r1 = r9.f128958c
            java.lang.Object r5 = r9.f128957b
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r9.f128960e
            kotlinx.coroutines.channels.w r6 = (kotlinx.coroutines.channels.w) r6
            kotlin.t0.n(r10)
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L8c
        L38:
            java.lang.Object r1 = r9.f128957b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.f128960e
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L6a
        L48:
            kotlin.t0.n(r10)
            java.lang.Object r10 = r9.f128960e
            kotlinx.coroutines.channels.w r10 = (kotlinx.coroutines.channels.w) r10
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r9.f128961f
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r10
        L56:
            r10 = r9
        L57:
            r10.f128960e = r5
            r10.f128957b = r1
            r10.f128959d = r4
            java.lang.Object r6 = r1.b(r10)
            if (r6 != r0) goto L64
            return r0
        L64:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lac
            java.lang.Object r10 = r5.next()
            yh.p<java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r7 = r0.f128962g
            r0.f128960e = r6
            r0.f128957b = r5
            r0.f128958c = r10
            r0.f128959d = r3
            java.lang.Object r7 = r7.invoke(r10, r0)
            if (r7 != r1) goto L87
            return r1
        L87:
            r8 = r5
            r5 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L97
            kotlin.b2 r10 = kotlin.b2.f124493a
            return r10
        L97:
            r0.f128960e = r7
            r0.f128957b = r6
            r10 = 0
            r0.f128958c = r10
            r0.f128959d = r2
            java.lang.Object r10 = r7.X(r5, r0)
            if (r10 != r1) goto La7
            return r1
        La7:
            r10 = r0
            r0 = r1
            r1 = r6
            r5 = r7
            goto L57
        Lac:
            kotlin.b2 r10 = kotlin.b2.f124493a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
