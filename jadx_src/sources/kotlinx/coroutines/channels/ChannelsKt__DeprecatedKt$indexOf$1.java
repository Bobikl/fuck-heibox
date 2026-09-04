package kotlinx.coroutines.channels;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {bb.c.b.f30946t6}, m = "indexOf", n = {"element", UCropPlusActivity.ARG_INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
public final class ChannelsKt__DeprecatedKt$indexOf$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f128891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f128892g;

    ChannelsKt__DeprecatedKt$indexOf$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$indexOf$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128891f = obj;
        this.f128892g |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.A(null, null, this);
    }
}
