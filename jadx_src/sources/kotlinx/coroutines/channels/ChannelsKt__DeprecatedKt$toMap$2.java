package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {bb.c.b.f30946t6}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128977f;

    ChannelsKt__DeprecatedKt$toMap$2(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$toMap$2> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128976e = obj;
        this.f128977f |= Integer.MIN_VALUE;
        return o.h0(null, null, this);
    }
}
