package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
public final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128897f;

    ChannelsKt__DeprecatedKt$last$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$last$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128896e = obj;
        this.f128897f |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.B(null, this);
    }
}
