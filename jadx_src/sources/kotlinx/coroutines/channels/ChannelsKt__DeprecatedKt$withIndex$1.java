package kotlinx.coroutines.channels;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.h0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/collections/h0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {bb.c.b.f30648g4, bb.c.b.f30671h4}, m = "invokeSuspend", n = {"$this$produce", UCropPlusActivity.ARG_INDEX, "$this$produce", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "I$0", "L$0", "I$0"})
public final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements yh.p<w<? super h0<Object>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f128981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel<Object> receiveChannel, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$withIndex$1> cVar) {
        super(2, cVar);
        this.f128982f = receiveChannel;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super h0<Object>> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.f128982f, cVar);
        channelsKt__DeprecatedKt$withIndex$1.f128981e = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:12:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r10.f128980d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            int r1 = r10.f128979c
            java.lang.Object r4 = r10.f128978b
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.f128981e
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r11)
            r11 = r5
            goto L42
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            int r1 = r10.f128979c
            java.lang.Object r4 = r10.f128978b
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.f128981e
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlin.t0.n(r11)
            r6 = r10
            goto L56
        L34:
            kotlin.t0.n(r11)
            java.lang.Object r11 = r10.f128981e
            kotlinx.coroutines.channels.w r11 = (kotlinx.coroutines.channels.w) r11
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r10.f128982f
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
        L42:
            r5 = r10
        L43:
            r5.f128981e = r11
            r5.f128978b = r4
            r5.f128979c = r1
            r5.f128980d = r3
            java.lang.Object r6 = r4.b(r5)
            if (r6 != r0) goto L52
            return r0
        L52:
            r9 = r5
            r5 = r11
            r11 = r6
            r6 = r9
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L7c
            java.lang.Object r11 = r4.next()
            kotlin.collections.h0 r7 = new kotlin.collections.h0
            int r8 = r1 + 1
            r7.<init>(r1, r11)
            r6.f128981e = r5
            r6.f128978b = r4
            r6.f128979c = r8
            r6.f128980d = r2
            java.lang.Object r11 = r5.X(r7, r6)
            if (r11 != r0) goto L78
            return r0
        L78:
            r11 = r5
            r5 = r6
            r1 = r8
            goto L43
        L7c:
            kotlin.b2 r11 = kotlin.b2.f124493a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
