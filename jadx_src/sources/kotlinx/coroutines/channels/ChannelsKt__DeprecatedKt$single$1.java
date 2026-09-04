package kotlinx.coroutines.channels;

import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = FilterGroup.TYPE_SINGLE, n = {"$this$consume$iv", "iterator", "$this$consume$iv", FilterGroup.TYPE_SINGLE}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class ChannelsKt__DeprecatedKt$single$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f128945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128946e;

    ChannelsKt__DeprecatedKt$single$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$single$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128945d = obj;
        this.f128946e |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.Q(null, this);
    }
}
