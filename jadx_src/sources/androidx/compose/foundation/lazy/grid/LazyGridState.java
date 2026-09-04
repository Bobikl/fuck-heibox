package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.m1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0001\u001aB\u001e\u0012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\t\u0012\t\b\u0002\u0010\u008c\u0001\u001a\u00020\t¢\u0006\u0005\b\u0093\u0001\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u00101R$\u00108\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R+\u0010>\u001a\u00020\t2\u0006\u00103\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010C\u001a\u00020?2\u0006\u00103\u001a\u00020?8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b@\u0010A\"\u0004\b5\u0010BR+\u0010J\u001a\u00020D2\u0006\u00103\u001a\u00020D8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010KR$\u0010O\u001a\u00020\t2\u0006\u00103\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010;R\"\u0010S\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010G\"\u0004\bM\u0010IR\u0016\u0010U\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010XR\u0016\u0010[\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010QR/\u0010b\u001a\u0004\u0018\u00010\\2\b\u00103\u001a\u0004\u0018\u00010\\8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010,\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010h\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010l\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010j\u001a\u0004\bP\u0010kR\u0088\u0001\u0010z\u001a/\u0012\u0013\u0012\u00110n¢\u0006\f\bo\u0012\b\bp\u0012\u0004\b\b(q\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020t0s0r0m23\u00103\u001a/\u0012\u0013\u0012\u00110n¢\u0006\f\bo\u0012\b\bp\u0012\u0004\b\b(q\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020t0s0r0m8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bu\u0010,\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR0\u0010\u0080\u0001\u001a\u0004\u0018\u00010{2\b\u00103\u001a\u0004\u0018\u00010{8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010,\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010\u0082\u0001R\u0017\u0010\u0084\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010QR&\u0010\u0086\u0001\u001a\u00020D2\u0006\u00103\u001a\u00020D8\u0000@BX\u0080\u000e¢\u0006\r\n\u0005\b\u0085\u0001\u0010Q\u001a\u0004\bT\u0010GR\u001f\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bR\u0010\u0088\u0001\u001a\u0006\b\u0085\u0001\u0010\u0089\u0001R\u0012\u0010\u008b\u0001\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bZ\u0010;R\u0012\u0010\u008c\u0001\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b]\u0010;R\u0013\u0010\u008e\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bu\u0010\u008d\u0001R\u0014\u0010\u0091\u0001\u001a\u00030\u008f\u00018F¢\u0006\u0007\u001a\u0005\bd\u0010\u0090\u0001R\u0015\u0010\u0092\u0001\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/p;", "", "delta", "Lkotlin/b2;", "B", "Landroidx/compose/foundation/lazy/grid/n;", "info", "i", "", UCropPlusActivity.ARG_INDEX, "scrollOffset", "D", "(IILkotlin/coroutines/c;)Ljava/lang/Object;", "M", "(II)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/m;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.aF, "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "distance", "C", "(F)F", "f", "Landroidx/compose/foundation/lazy/grid/o;", "result", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/lazy/grid/o;)V", "Landroidx/compose/foundation/lazy/grid/j;", "itemProvider", "N", "(Landroidx/compose/foundation/lazy/grid/j;)V", "Landroidx/compose/foundation/lazy/grid/u;", "Landroidx/compose/foundation/lazy/grid/u;", "scrollPosition", "Landroidx/compose/runtime/a1;", "b", "Landroidx/compose/runtime/a1;", "layoutInfoState", "Landroidx/compose/foundation/interaction/g;", "Landroidx/compose/foundation/interaction/g;", "p", "()Landroidx/compose/foundation/interaction/g;", "internalInteractionSource", "<set-?>", "d", "F", "y", "()F", "scrollToBeConsumed", "e", ak.aD, "()I", "K", "(I)V", "slotsPerLine", "Ls1/e;", "l", "()Ls1/e;", "(Ls1/e;)V", "density", "", "g", androidx.exifinterface.media.a.W4, "()Z", "L", "(Z)V", "isVertical", "Landroidx/compose/foundation/gestures/p;", "scrollableState", "I", "r", "numMeasurePasses", "j", "Z", "v", "prefetchingEnabled", "k", "lineToPrefetch", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/foundation/lazy/layout/o$a;", "Landroidx/compose/runtime/collection/e;", "currentLinePrefetchHandles", "m", "wasScrollingForward", "Landroidx/compose/ui/layout/k1;", "n", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/layout/k1;", "J", "(Landroidx/compose/ui/layout/k1;)V", "remeasurement", "Landroidx/compose/ui/layout/m1;", "o", "Landroidx/compose/ui/layout/m1;", "x", "()Landroidx/compose/ui/layout/m1;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/a0;", "Lkotlin/m0;", "name", "line", "", "Lkotlin/Pair;", "Ls1/b;", "q", "t", "()Lyh/l;", "H", "(Lyh/l;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", ak.aB, "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "G", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;)V", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "animateScrollScope", "canScrollBackward", ak.aG, "canScrollForward", "Landroidx/compose/foundation/lazy/layout/o;", "Landroidx/compose/foundation/lazy/layout/o;", "()Landroidx/compose/foundation/lazy/layout/o;", "prefetchState", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "()Landroidx/compose/foundation/lazy/grid/n;", "layoutInfo", "Landroidx/compose/foundation/interaction/e;", "()Landroidx/compose/foundation/interaction/e;", "interactionSource", "isScrollInProgress", "<init>", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridState implements androidx.compose.foundation.gestures.p {

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<LazyGridState, ?> f6832x = ListSaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(@dl.d androidx.compose.runtime.saveable.f listSaver, @dl.d LazyGridState it) {
            f0.p(listSaver, "$this$listSaver");
            f0.p(it, "it");
            return CollectionsKt__CollectionsKt.L(Integer.valueOf(it.m()), Integer.valueOf(it.n()));
        }
    }, new yh.l<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LazyGridState invoke(@dl.d List<Integer> it) {
            f0.p(it, "it");
            return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final u scrollPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<n> layoutInfoState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.interaction.g internalInteractionSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 slotsPerLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 density;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 isVertical;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.gestures.p scrollableState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int lineToPrefetch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<androidx.compose.foundation.lazy.layout.o.a> currentLinePrefetchHandles;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 remeasurement;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m1 remeasurementModifier;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 prefetchInfoRetriever;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 placementAnimator;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyGridAnimateScrollScope animateScrollScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollBackward;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.o prefetchState;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LazyGridState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<LazyGridState, ?> a() {
            return LazyGridState.f6832x;
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridState$b", "Landroidx/compose/ui/layout/m1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/b2;", "l1", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements m1 {
        b() {
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @Override // androidx.compose.ui.layout.m1
        public void l1(@dl.d k1 remeasurement) {
            f0.p(remeasurement, "remeasurement");
            LazyGridState.this.J(remeasurement);
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridState() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public LazyGridState(int i10, int i11) {
        this.scrollPosition = new u(i10, i11);
        this.layoutInfoState = h2.g(androidx.compose.foundation.lazy.grid.b.f6880a, null, 2, null);
        this.internalInteractionSource = androidx.compose.foundation.interaction.f.a();
        this.slotsPerLine = h2.g(0, null, 2, null);
        this.density = h2.g(s1.g.a(1.0f, 1.0f), null, 2, null);
        this.isVertical = h2.g(Boolean.TRUE, null, 2, null);
        this.scrollableState = ScrollableStateKt.a(new yh.l<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            @dl.d
            public final Float a(float f10) {
                return Float.valueOf(-this.f6869b.C(-f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new androidx.compose.runtime.collection.e<>(new androidx.compose.foundation.lazy.layout.o.a[16], 0);
        this.remeasurement = h2.g(null, null, 2, null);
        this.remeasurementModifier = new b();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever = h2.g(new yh.l<a0, List<? extends Pair<? extends Integer, ? extends s1.b>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
            @dl.d
            public final List<Pair<Integer, s1.b>> a(int i12) {
                return CollectionsKt__CollectionsKt.E();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends s1.b>> invoke(a0 a0Var) {
                return a(a0Var.n());
            }
        }, null, 2, null);
        this.placementAnimator = h2.g(null, null, 2, null);
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.prefetchState = new androidx.compose.foundation.lazy.layout.o();
    }

    public /* synthetic */ LazyGridState(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    private final void B(float f10) {
        int row;
        int index;
        androidx.compose.runtime.collection.e<androidx.compose.foundation.lazy.layout.o.a> eVar;
        int i10;
        androidx.compose.foundation.lazy.layout.o oVar = this.prefetchState;
        if (this.prefetchingEnabled) {
            n nVarQ = q();
            if (!nVarQ.f().isEmpty()) {
                boolean z10 = f10 < 0.0f;
                if (z10) {
                    h hVar = (h) CollectionsKt___CollectionsKt.k3(nVarQ.f());
                    row = (A() ? hVar.getRow() : hVar.getColumn()) + 1;
                    index = ((h) CollectionsKt___CollectionsKt.k3(nVarQ.f())).getIndex() + 1;
                } else {
                    h hVar2 = (h) CollectionsKt___CollectionsKt.w2(nVarQ.f());
                    row = (A() ? hVar2.getRow() : hVar2.getColumn()) - 1;
                    index = ((h) CollectionsKt___CollectionsKt.w2(nVarQ.f())).getIndex() - 1;
                }
                if (row != this.lineToPrefetch) {
                    if (index >= 0 && index < nVarQ.getTotalItemsCount()) {
                        if (this.wasScrollingForward != z10 && (i10 = (eVar = this.currentLinePrefetchHandles).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) > 0) {
                            androidx.compose.foundation.lazy.layout.o.a[] aVarArrG = eVar.G();
                            f0.n(aVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int i11 = 0;
                            do {
                                aVarArrG[i11].cancel();
                                i11++;
                            } while (i11 < i10);
                        }
                        this.wasScrollingForward = z10;
                        this.lineToPrefetch = row;
                        this.currentLinePrefetchHandles.m();
                        List<Pair<Integer, s1.b>> listInvoke = t().invoke(a0.a(a0.c(row)));
                        int size = listInvoke.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Pair<Integer, s1.b> pair = listInvoke.get(i12);
                            this.currentLinePrefetchHandles.b(oVar.b(pair.e().intValue(), pair.f().getF139216a()));
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object E(LazyGridState lazyGridState, int i10, int i11, kotlin.coroutines.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.D(i10, i11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(k1 k1Var) {
        this.remeasurement.setValue(k1Var);
    }

    public static /* synthetic */ Object g(LazyGridState lazyGridState, int i10, int i11, kotlin.coroutines.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.f(i10, i11, cVar);
    }

    private final void i(n nVar) {
        int row;
        if (this.lineToPrefetch == -1 || !(!nVar.f().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            h hVar = (h) CollectionsKt___CollectionsKt.k3(nVar.f());
            row = (A() ? hVar.getRow() : hVar.getColumn()) + 1;
        } else {
            h hVar2 = (h) CollectionsKt___CollectionsKt.w2(nVar.f());
            row = (A() ? hVar2.getRow() : hVar2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            androidx.compose.runtime.collection.e<androidx.compose.foundation.lazy.layout.o.a> eVar = this.currentLinePrefetchHandles;
            int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                androidx.compose.foundation.lazy.layout.o.a[] aVarArrG = eVar.G();
                f0.n(aVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    aVarArrG[i11].cancel();
                    i11++;
                } while (i11 < i10);
            }
            this.currentLinePrefetchHandles.m();
        }
    }

    private final k1 w() {
        return (k1) this.remeasurement.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.isVertical.getValue()).booleanValue();
    }

    public final float C(float distance) {
        if ((distance < 0.0f && !this.canScrollForward) || (distance > 0.0f && !this.canScrollBackward)) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f10 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = this.scrollToBeConsumed;
            k1 k1VarW = w();
            if (k1VarW != null) {
                k1VarW.d();
            }
            if (this.prefetchingEnabled) {
                B(f11 - this.scrollToBeConsumed);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    @dl.e
    public final Object D(int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this, null, new LazyGridState$scrollToItem$2(this, i10, i11, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public final void F(@dl.d s1.e eVar) {
        f0.p(eVar, "<set-?>");
        this.density.setValue(eVar);
    }

    public final void G(@dl.e LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyGridItemPlacementAnimator);
    }

    public final void H(@dl.d yh.l<? super a0, ? extends List<Pair<Integer, s1.b>>> lVar) {
        f0.p(lVar, "<set-?>");
        this.prefetchInfoRetriever.setValue(lVar);
    }

    public final void I(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void K(int i10) {
        this.slotsPerLine.setValue(Integer.valueOf(i10));
    }

    public final void L(boolean z10) {
        this.isVertical.setValue(Boolean.valueOf(z10));
    }

    public final void M(int index, int scrollOffset) {
        this.scrollPosition.c(e.c(index), scrollOffset);
        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimatorS = s();
        if (lazyGridItemPlacementAnimatorS != null) {
            lazyGridItemPlacementAnimatorS.f();
        }
        k1 k1VarW = w();
        if (k1VarW != null) {
            k1VarW.d();
        }
    }

    public final void N(@dl.d j itemProvider) {
        f0.p(itemProvider, "itemProvider");
        this.scrollPosition.h(itemProvider);
    }

    @Override // androidx.compose.foundation.gestures.p
    public float a(float delta) {
        return this.scrollableState.a(delta);
    }

    @Override // androidx.compose.foundation.gestures.p
    public boolean b() {
        return this.scrollableState.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.p
    @dl.e
    public Object c(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super androidx.compose.foundation.gestures.m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        LazyGridState lazyGridState;
        if (cVar instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) cVar;
            int i10 = lazyGridState$scroll$1.f6864g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.f6864g = i10 - Integer.MIN_VALUE;
            } else {
                lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, cVar);
            }
        } else {
            lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, cVar);
        }
        Object obj = lazyGridState$scroll$1.f6862e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = lazyGridState$scroll$1.f6864g;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (yh.p) lazyGridState$scroll$1.f6861d;
                mutatePriority = (MutatePriority) lazyGridState$scroll$1.f6860c;
                lazyGridState = (LazyGridState) lazyGridState$scroll$1.f6859b;
                t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
        lazyGridState$scroll$1.f6859b = this;
        lazyGridState$scroll$1.f6860c = mutatePriority;
        lazyGridState$scroll$1.f6861d = pVar;
        lazyGridState$scroll$1.f6864g = 1;
        if (awaitFirstLayoutModifier.a(lazyGridState$scroll$1) == objH) {
            return objH;
        }
        lazyGridState = this;
        androidx.compose.foundation.gestures.p pVar2 = lazyGridState.scrollableState;
        lazyGridState$scroll$1.f6859b = null;
        lazyGridState$scroll$1.f6860c = null;
        lazyGridState$scroll$1.f6861d = null;
        lazyGridState$scroll$1.f6864g = 2;
        if (pVar2.c(mutatePriority, pVar, lazyGridState$scroll$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    @dl.e
    public final Object f(int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = LazyAnimateScrollKt.c(this.animateScrollScope, i10, i11, cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    public final void h(@dl.d o result) {
        f0.p(result, "result");
        this.scrollPosition.g(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        this.canScrollForward = result.getCanScrollForward();
        y firstVisibleLine = result.getFirstVisibleLine();
        this.canScrollBackward = ((firstVisibleLine != null ? firstVisibleLine.getIndex() : 0) == 0 && result.getFirstVisibleLineScrollOffset() == 0) ? false : true;
        this.numMeasurePasses++;
        i(result);
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @dl.d
    public final s1.e l() {
        return (s1.e) this.density.getValue();
    }

    public final int m() {
        return this.scrollPosition.a();
    }

    public final int n() {
        return this.scrollPosition.b();
    }

    @dl.d
    public final androidx.compose.foundation.interaction.e o() {
        return this.internalInteractionSource;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final androidx.compose.foundation.interaction.g getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @dl.d
    public final n q() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final LazyGridItemPlacementAnimator s() {
        return (LazyGridItemPlacementAnimator) this.placementAnimator.getValue();
    }

    @dl.d
    public final yh.l<a0, List<Pair<Integer, s1.b>>> t() {
        return (yh.l) this.prefetchInfoRetriever.getValue();
    }

    @dl.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.o getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    @dl.d
    /* JADX INFO: renamed from: x, reason: from getter */
    public final m1 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int z() {
        return ((Number) this.slotsPerLine.getValue()).intValue();
    }
}
