package kotlinx.coroutines.channels;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {bb.c.b.f30946t6}, m = "lastIndexOf", n = {"element", "lastIndex", UCropPlusActivity.ARG_INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f128902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f128903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f128904h;

    ChannelsKt__DeprecatedKt$lastIndexOf$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$lastIndexOf$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128903g = obj;
        this.f128904h |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.C(null, null, this);
    }
}
