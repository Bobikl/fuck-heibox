package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "R", "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {bb.c.b.f30946t6, bb.c.b.f30987v3, bb.c.b.f30987v3}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
public final class ChannelsKt__DeprecatedKt$map$1<R> extends SuspendLambda implements yh.p<w<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f128915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<E> f128916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.p<E, kotlin.coroutines.c<? super R>, Object> f128917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$map$1(ReceiveChannel<? extends E> receiveChannel, yh.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$map$1> cVar) {
        super(2, cVar);
        this.f128916h = receiveChannel;
        this.f128917i = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super R> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.f128916h, this.f128917i, cVar);
        channelsKt__DeprecatedKt$map$1.f128915g = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:8:0x0022, B:22:0x0076, B:26:0x008b, B:28:0x0093, B:36:0x00c9, B:18:0x005e, B:21:0x006e), top: B:48:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c3 -> B:22:0x0076). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
