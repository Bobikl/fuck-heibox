package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
public final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements yh.p<w<Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f128831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.p<Object, kotlin.coroutines.c<? super Boolean>, Object> f128833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel<Object> receiveChannel, yh.p<Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$dropWhile$1> cVar) {
        super(2, cVar);
        this.f128832f = receiveChannel;
        this.f128833g = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.f128832f, this.f128833g, cVar);
        channelsKt__DeprecatedKt$dropWhile$1.f128831e = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b1 -> B:27:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0102 -> B:35:0x00d9). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
