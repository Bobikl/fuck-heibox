package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {bb.c.b.F5}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
public final class ChannelsKt__DeprecatedKt$none$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128939d;

    ChannelsKt__DeprecatedKt$none$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$none$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128938c = obj;
        this.f128939d |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.O(null, this);
    }
}
