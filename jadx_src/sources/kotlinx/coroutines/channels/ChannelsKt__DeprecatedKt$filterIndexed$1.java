package kotlinx.coroutines.channels;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", UCropPlusActivity.ARG_INDEX, "$this$produce", "e", UCropPlusActivity.ARG_INDEX, "$this$produce", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
public final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements yh.p<w<Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.q<Integer, Object, kotlin.coroutines.c<? super Boolean>, Object> f128858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel<Object> receiveChannel, yh.q<? super Integer, Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$filterIndexed$1> cVar) {
        super(2, cVar);
        this.f128857g = receiveChannel;
        this.f128858h = qVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.f128857g, this.f128858h, cVar);
        channelsKt__DeprecatedKt$filterIndexed$1.f128856f = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r12.f128855e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L52
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L28
            if (r1 != r3) goto L20
            int r1 = r12.f128854d
            java.lang.Object r6 = r12.f128852b
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.f128856f
            kotlinx.coroutines.channels.w r7 = (kotlinx.coroutines.channels.w) r7
            kotlin.t0.n(r13)
            goto L61
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L28:
            int r1 = r12.f128854d
            java.lang.Object r6 = r12.f128853c
            java.lang.Object r7 = r12.f128852b
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r12.f128856f
            kotlinx.coroutines.channels.w r8 = (kotlinx.coroutines.channels.w) r8
            kotlin.t0.n(r13)
            r10 = r1
            r1 = r0
            r0 = r12
            r11 = r7
            r7 = r6
        L3c:
            r6 = r11
            goto La3
        L3f:
            int r1 = r12.f128854d
            java.lang.Object r6 = r12.f128852b
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.f128856f
            kotlinx.coroutines.channels.w r7 = (kotlinx.coroutines.channels.w) r7
            kotlin.t0.n(r13)
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r12
            goto L7a
        L52:
            kotlin.t0.n(r13)
            java.lang.Object r13 = r12.f128856f
            kotlinx.coroutines.channels.w r13 = (kotlinx.coroutines.channels.w) r13
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.f128857g
            kotlinx.coroutines.channels.ChannelIterator r6 = r6.iterator()
            r7 = r13
        L61:
            r13 = r12
        L62:
            r13.f128856f = r7
            r13.f128852b = r6
            r13.f128853c = r2
            r13.f128854d = r1
            r13.f128855e = r5
            java.lang.Object r8 = r6.b(r13)
            if (r8 != r0) goto L73
            return r0
        L73:
            r11 = r0
            r0 = r13
            r13 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r11
        L7a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lc1
            java.lang.Object r13 = r7.next()
            yh.q<java.lang.Integer, java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r9 = r0.f128858h
            int r10 = r6 + 1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r6)
            r0.f128856f = r8
            r0.f128852b = r7
            r0.f128853c = r13
            r0.f128854d = r10
            r0.f128855e = r4
            java.lang.Object r6 = r9.invoke(r6, r13, r0)
            if (r6 != r1) goto L9f
            return r1
        L9f:
            r11 = r7
            r7 = r13
            r13 = r6
            goto L3c
        La3:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lbc
            r0.f128856f = r8
            r0.f128852b = r6
            r0.f128853c = r2
            r0.f128854d = r10
            r0.f128855e = r3
            java.lang.Object r13 = r8.X(r7, r0)
            if (r13 != r1) goto Lbc
            return r1
        Lbc:
            r13 = r0
            r0 = r1
            r7 = r8
            r1 = r10
            goto L62
        Lc1:
            kotlin.b2 r13 = kotlin.b2.f124493a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
