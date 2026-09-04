package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.b0;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {bb.c.b.f30946t6, bb.c.b.I1}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends b0<? super E>> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128873f;

    ChannelsKt__DeprecatedKt$filterNotNullTo$3(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128872e = obj;
        this.f128873f |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.v(null, null, this);
    }
}
