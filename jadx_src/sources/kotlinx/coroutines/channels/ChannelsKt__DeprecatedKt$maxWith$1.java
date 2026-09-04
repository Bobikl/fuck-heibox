package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", org.apache.tools.ant.types.selectors.o.f136589m}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class ChannelsKt__DeprecatedKt$maxWith$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f128929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f128930g;

    ChannelsKt__DeprecatedKt$maxWith$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$maxWith$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128929f = obj;
        this.f128930g |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.M(null, null, this);
    }
}
