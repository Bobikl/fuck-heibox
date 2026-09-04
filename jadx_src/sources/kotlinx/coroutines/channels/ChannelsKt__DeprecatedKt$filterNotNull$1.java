package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", androidx.exifinterface.media.a.S4, "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__DeprecatedKt$filterNotNull$1<E> extends SuspendLambda implements yh.p<E, kotlin.coroutines.c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f128862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128863c;

    ChannelsKt__DeprecatedKt$filterNotNull$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$filterNotNull$1> cVar) {
        super(2, cVar);
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.e E e10, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        return ((ChannelsKt__DeprecatedKt$filterNotNull$1) create(e10, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$filterNotNull$1 channelsKt__DeprecatedKt$filterNotNull$1 = new ChannelsKt__DeprecatedKt$filterNotNull$1(cVar);
        channelsKt__DeprecatedKt$filterNotNull$1.f128863c = obj;
        return channelsKt__DeprecatedKt$filterNotNull$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f128862b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return kotlin.coroutines.jvm.internal.a.a(this.f128863c != null);
    }
}
