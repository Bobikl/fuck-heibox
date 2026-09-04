package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "R", androidx.exifinterface.media.a.X4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {bb.c.b.f30946t6, bb.c.b.f30534b6, bb.c.b.f30581d6}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
public final class ChannelsKt__DeprecatedKt$zip$2<V> extends SuspendLambda implements yh.p<w<? super V>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f128988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f128989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f128990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<R> f128991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<E> f128992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ yh.p<E, R, V> f128993k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, yh.p<? super E, ? super R, ? extends V> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$zip$2> cVar) {
        super(2, cVar);
        this.f128991i = receiveChannel;
        this.f128992j = receiveChannel2;
        this.f128993k = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super V> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.f128991i, this.f128992j, this.f128993k, cVar);
        channelsKt__DeprecatedKt$zip$2.f128990h = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:26:0x00b1, B:28:0x00b9, B:40:0x0109, B:13:0x004a), top: B:52:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1 A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #1 {all -> 0x0106, blocks: (B:32:0x00d9, B:34:0x00e1), top: B:50:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
