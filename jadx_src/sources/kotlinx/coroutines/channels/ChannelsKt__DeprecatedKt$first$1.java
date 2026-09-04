package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$first$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f128876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128877e;

    ChannelsKt__DeprecatedKt$first$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$first$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128876d = obj;
        this.f128877e |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.w(null, this);
    }
}
