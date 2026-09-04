package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {bb.c.b.f30946t6}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$count$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128812f;

    ChannelsKt__DeprecatedKt$count$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$count$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128811e = obj;
        this.f128812f |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.d(null, this);
    }
}
