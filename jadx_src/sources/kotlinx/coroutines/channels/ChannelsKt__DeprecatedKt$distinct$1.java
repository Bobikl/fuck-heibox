package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__DeprecatedKt$distinct$1 extends SuspendLambda implements yh.p<Object, kotlin.coroutines.c<Object>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f128813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128814c;

    ChannelsKt__DeprecatedKt$distinct$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$distinct$1> cVar) {
        super(2, cVar);
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Object obj, @dl.e kotlin.coroutines.c<Object> cVar) {
        return ((ChannelsKt__DeprecatedKt$distinct$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$distinct$1 channelsKt__DeprecatedKt$distinct$1 = new ChannelsKt__DeprecatedKt$distinct$1(cVar);
        channelsKt__DeprecatedKt$distinct$1.f128814c = obj;
        return channelsKt__DeprecatedKt$distinct$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f128813b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return this.f128814c;
    }
}
