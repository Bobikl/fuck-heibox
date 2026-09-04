package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {bb.c.b.f30923s5, bb.c.b.f30967u5}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", org.apache.tools.ant.types.selectors.o.f136588l}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class ChannelsKt__DeprecatedKt$minWith$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f128935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f128936g;

    ChannelsKt__DeprecatedKt$minWith$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$minWith$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128935f = obj;
        this.f128936g |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.N(null, null, this);
    }
}
