package androidx.paging.multicast;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Multicaster.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bb\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/paging/multicast/Multicaster;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", "g", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/multicast/ChannelManager;", ak.av, "Lkotlin/z;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/paging/multicast/ChannelManager;", "channelManager", "Lkotlinx/coroutines/flow/e;", "b", "Lkotlinx/coroutines/flow/e;", "i", "()Lkotlinx/coroutines/flow/e;", "flow", "Lkotlinx/coroutines/q0;", ak.aF, "Lkotlinx/coroutines/q0;", "scope", "d", "source", "", "e", "Z", "piggybackingDownstream", "keepUpstreamAlive", "", "bufferSize", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "onEach", "<init>", "(Lkotlinx/coroutines/q0;ILkotlinx/coroutines/flow/e;ZLyh/p;Z)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class Multicaster<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z channelManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<T> flow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e<T> source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean piggybackingDownstream;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p<T, kotlin.coroutines.c<? super b2>, Object> f26516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean keepUpstreamAlive;

    /* JADX WARN: Multi-variable type inference failed */
    public Multicaster(@dl.d q0 scope, final int i10, @dl.d e<? extends T> source, boolean z10, @dl.d p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onEach, boolean z11) {
        f0.p(scope, "scope");
        f0.p(source, "source");
        f0.p(onEach, "onEach");
        this.scope = scope;
        this.source = source;
        this.piggybackingDownstream = z10;
        this.f26516f = onEach;
        this.keepUpstreamAlive = z11;
        this.channelManager = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new yh.a<ChannelManager<T>>() { // from class: androidx.paging.multicast.Multicaster$channelManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChannelManager<T> invoke() {
                return new ChannelManager<>(this.f26518b.scope, i10, this.f26518b.piggybackingDownstream, this.f26518b.f26516f, this.f26518b.keepUpstreamAlive, this.f26518b.source);
            }
        });
        this.flow = g.I0(new Multicaster$flow$1(this, null));
    }

    public /* synthetic */ Multicaster(q0 q0Var, int i10, e eVar, boolean z10, p pVar, boolean z11, int i11, u uVar) {
        this(q0Var, (i11 & 2) != 0 ? 0 : i10, eVar, (i11 & 8) != 0 ? false : z10, pVar, (i11 & 32) != 0 ? false : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelManager<T> h() {
        return (ChannelManager) this.channelManager.getValue();
    }

    @dl.e
    public final Object g(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objH = h().h(cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @dl.d
    public final e<T> i() {
        return this.flow;
    }
}
