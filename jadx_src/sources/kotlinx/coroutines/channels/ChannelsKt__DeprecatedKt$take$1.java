package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
public final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements yh.p<w<Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f128954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f128955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$take$1(int i10, ReceiveChannel<Object> receiveChannel, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$take$1> cVar) {
        super(2, cVar);
        this.f128955f = i10;
        this.f128956g = receiveChannel;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f128955f, this.f128956g, cVar);
        channelsKt__DeprecatedKt$take$1.f128954e = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:29:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r8.f128953d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            int r1 = r8.f128952c
            java.lang.Object r4 = r8.f128951b
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r8.f128954e
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r9)
            r9 = r5
            r5 = r8
            goto L82
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            int r1 = r8.f128952c
            java.lang.Object r4 = r8.f128951b
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r8.f128954e
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r9)
            r6 = r8
            goto L65
        L36:
            kotlin.t0.n(r9)
            java.lang.Object r9 = r8.f128954e
            kotlinx.coroutines.channels.w r9 = (kotlinx.coroutines.channels.w) r9
            int r1 = r8.f128955f
            if (r1 != 0) goto L44
            kotlin.b2 r9 = kotlin.b2.f124493a
            return r9
        L44:
            if (r1 < 0) goto L48
            r4 = r3
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 == 0) goto L8c
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r8.f128956g
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            r5 = r8
        L52:
            r5.f128954e = r9
            r5.f128951b = r4
            r5.f128952c = r1
            r5.f128953d = r3
            java.lang.Object r6 = r4.b(r5)
            if (r6 != r0) goto L61
            return r0
        L61:
            r7 = r5
            r5 = r9
            r9 = r6
            r6 = r7
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            java.lang.Object r9 = r4.next()
            r6.f128954e = r5
            r6.f128951b = r4
            r6.f128952c = r1
            r6.f128953d = r2
            java.lang.Object r9 = r5.X(r9, r6)
            if (r9 != r0) goto L80
            return r0
        L80:
            r9 = r5
            r5 = r6
        L82:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L52
            kotlin.b2 r9 = kotlin.b2.f124493a
            return r9
        L89:
            kotlin.b2 r9 = kotlin.b2.f124493a
            return r9
        L8c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Requested element count "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = " is less than zero."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
