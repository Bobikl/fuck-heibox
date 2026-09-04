package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
public final class ChannelsKt__DeprecatedKt$filter$1<E> extends SuspendLambda implements yh.p<w<? super E>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f128849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<E> f128850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.p<E, kotlin.coroutines.c<? super Boolean>, Object> f128851g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel<? extends E> receiveChannel, yh.p<? super E, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$filter$1> cVar) {
        super(2, cVar);
        this.f128850f = receiveChannel;
        this.f128851g = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super E> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.f128850f, this.f128851g, cVar);
        channelsKt__DeprecatedKt$filter$1.f128849e = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.channels.b0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
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
            int r1 = r10.f128848d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L48
            if (r1 == r5) goto L38
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r10.f128846b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.f128849e
            kotlinx.coroutines.channels.w r6 = (kotlinx.coroutines.channels.w) r6
            kotlin.t0.n(r11)
            goto L56
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            java.lang.Object r1 = r10.f128847c
            java.lang.Object r6 = r10.f128846b
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r10.f128849e
            kotlinx.coroutines.channels.w r7 = (kotlinx.coroutines.channels.w) r7
            kotlin.t0.n(r11)
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r10
            goto L8d
        L38:
            java.lang.Object r1 = r10.f128846b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.f128849e
            kotlinx.coroutines.channels.w r6 = (kotlinx.coroutines.channels.w) r6
            kotlin.t0.n(r11)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            goto L6c
        L48:
            kotlin.t0.n(r11)
            java.lang.Object r11 = r10.f128849e
            kotlinx.coroutines.channels.w r11 = (kotlinx.coroutines.channels.w) r11
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.f128850f
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r11
        L56:
            r11 = r10
        L57:
            r11.f128849e = r6
            r11.f128846b = r1
            r11.f128847c = r2
            r11.f128848d = r5
            java.lang.Object r7 = r1.b(r11)
            if (r7 != r0) goto L66
            return r0
        L66:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L6c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La9
            java.lang.Object r11 = r6.next()
            yh.p<E, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r8 = r0.f128851g
            r0.f128849e = r7
            r0.f128846b = r6
            r0.f128847c = r11
            r0.f128848d = r4
            java.lang.Object r8 = r8.invoke(r11, r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            r9 = r7
            r7 = r11
            r11 = r8
            r8 = r9
        L8d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La4
            r0.f128849e = r8
            r0.f128846b = r6
            r0.f128847c = r2
            r0.f128848d = r3
            java.lang.Object r11 = r8.X(r7, r0)
            if (r11 != r1) goto La4
            return r1
        La4:
            r11 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            goto L57
        La9:
            kotlin.b2 r11 = kotlin.b2.f124493a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
