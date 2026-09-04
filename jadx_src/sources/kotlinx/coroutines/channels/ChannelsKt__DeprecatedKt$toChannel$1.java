package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.b0;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {bb.c.b.f30946t6, bb.c.b.f30920s2}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends b0<? super E>> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128967f;

    ChannelsKt__DeprecatedKt$toChannel$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$toChannel$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128966e = obj;
        this.f128967f |= Integer.MIN_VALUE;
        return o.e0(null, null, this);
    }
}
