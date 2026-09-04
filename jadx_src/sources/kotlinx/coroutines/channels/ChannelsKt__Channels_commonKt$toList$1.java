package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
public final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f128801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f128802g;

    ChannelsKt__Channels_commonKt$toList$1(kotlin.coroutines.c<? super ChannelsKt__Channels_commonKt$toList$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128801f = obj;
        this.f128802g |= Integer.MIN_VALUE;
        return o.g0(null, this);
    }
}
