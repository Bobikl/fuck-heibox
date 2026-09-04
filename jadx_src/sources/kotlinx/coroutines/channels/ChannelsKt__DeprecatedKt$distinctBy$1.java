package kotlinx.coroutines.channels;

import com.taobao.aranger.constant.Constants;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "K", "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {bb.c.b.f31032x4, bb.c.b.f31054y4, bb.c.b.A4}, m = "invokeSuspend", n = {"$this$produce", Constants.PARAM_KEYS, "$this$produce", Constants.PARAM_KEYS, "e", "$this$produce", Constants.PARAM_KEYS, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
public final class ChannelsKt__DeprecatedKt$distinctBy$1<E> extends SuspendLambda implements yh.p<w<? super E>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<E> f128820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.p<E, kotlin.coroutines.c<? super K>, Object> f128821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel<? extends E> receiveChannel, yh.p<? super E, ? super kotlin.coroutines.c<? super K>, ? extends Object> pVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$distinctBy$1> cVar) {
        super(2, cVar);
        this.f128820g = receiveChannel;
        this.f128821h = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super E> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.f128820g, this.f128821h, cVar);
        channelsKt__DeprecatedKt$distinctBy$1.f128819f = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.channels.b0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c5 -> B:29:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d2 -> B:13:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
