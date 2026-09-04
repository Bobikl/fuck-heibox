package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = org.apache.commons.codec.language.bm.c.f132926b, n = {"$this$consume$iv"}, s = {"L$0"})
public final class ChannelsKt__DeprecatedKt$any$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128805d;

    ChannelsKt__DeprecatedKt$any$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$any$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128804c = obj;
        this.f128805d |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.a(null, this);
    }
}
