package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$firstOrNull$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f128880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128881e;

    ChannelsKt__DeprecatedKt$firstOrNull$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$firstOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128880d = obj;
        this.f128881e |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.x(null, this);
    }
}
