package kotlinx.coroutines.channels;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", UCropPlusActivity.ARG_INDEX, "count"}, s = {"L$0", "I$0", "I$1"})
public final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f128834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f128837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f128838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f128839g;

    ChannelsKt__DeprecatedKt$elementAt$1(kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$elementAt$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128838f = obj;
        this.f128839g |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.l(null, 0, this);
    }
}
