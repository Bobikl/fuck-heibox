package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.m1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u0085\u00012\u00020\u0001:\u0001(B\u001d\b\u0002\u0012\u0007\u0010\u008a\u0001\u001a\u00020\u0011\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u0011¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001B!\b\u0016\u0012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\t\u0012\t\b\u0002\u0010\u008f\u0001\u001a\u00020\t¢\u0006\u0006\b\u008c\u0001\u0010\u0090\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002JD\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010 J#\u0010\"\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010:\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010Q\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010XR$\u0010]\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b[\u0010\\R\"\u0010c\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010f\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\bd\u0010?\"\u0004\be\u0010AR\"\u0010l\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010^R \u0010s\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020p0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010y\u001a\u00020t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0011\u0010z\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bq\u0010`R\u0011\u0010|\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b{\u0010`R\u0011\u0010\u007f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b}\u0010~R(\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\bm\u0010\u0083\u0001\"\u0005\b^\u0010\u0084\u0001R\u0015\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010`R\u0014\u0010\u0088\u0001\u001a\u00030\u0086\u00018F¢\u0006\u0007\u001a\u0005\bu\u0010\u0087\u0001R\u0015\u0010\u0089\u0001\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0091\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/p;", "", "distance", androidx.exifinterface.media.a.S4, "delta", "Lkotlin/b2;", "D", "", "", "prefetchHandlesUsed", "l", "Landroidx/compose/foundation/lazy/staggeredgrid/h;", "info", "k", "itemIndex", "laneCount", "", "m", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/m;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.aF, "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", UCropPlusActivity.ARG_INDEX, "scrollOffset", "F", "(IILkotlin/coroutines/c;)Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "M", "(Landroidx/compose/foundation/gestures/m;II)V", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "N", "(Landroidx/compose/foundation/lazy/layout/i;)V", ak.av, "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "result", "j", "(Landroidx/compose/foundation/lazy/staggeredgrid/k;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/q;", "Landroidx/compose/foundation/lazy/staggeredgrid/q;", ak.aD, "()Landroidx/compose/foundation/lazy/staggeredgrid/q;", "scrollPosition", "Landroidx/compose/runtime/a1;", "b", "Landroidx/compose/runtime/a1;", "layoutInfoState", "Landroidx/compose/foundation/lazy/staggeredgrid/r;", "Landroidx/compose/foundation/lazy/staggeredgrid/r;", "B", "()Landroidx/compose/foundation/lazy/staggeredgrid/r;", "spans", "", "d", "Z", "n", "()Z", "H", "(Z)V", "canScrollForward", "e", "canScrollBackward", "Landroidx/compose/foundation/lazy/staggeredgrid/b;", "f", "Landroidx/compose/foundation/lazy/staggeredgrid/b;", "animateScrollScope", "Landroidx/compose/ui/layout/k1;", "g", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Landroidx/compose/ui/layout/m1;", "Landroidx/compose/ui/layout/m1;", "y", "()Landroidx/compose/ui/layout/m1;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/o;", "i", "Landroidx/compose/foundation/lazy/layout/o;", "x", "()Landroidx/compose/foundation/lazy/layout/o;", "prefetchState", "Landroidx/compose/foundation/gestures/p;", "scrollableState", "<set-?>", androidx.exifinterface.media.a.W4, "()F", "scrollToBeConsumed", "I", "v", "()I", "K", "(I)V", "measurePassCount", "C", "L", "isVertical", "[I", "t", "()[I", "J", "([I)V", "laneWidthsPrefixSum", "o", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/o$a;", "p", "Ljava/util/Map;", "currentItemPrefetchHandles", "Landroidx/compose/foundation/interaction/g;", "r", "Landroidx/compose/foundation/interaction/g;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/foundation/interaction/g;", "mutableInteractionSource", "firstVisibleItemIndex", "q", "firstVisibleItemScrollOffset", ak.aG, "()Landroidx/compose/foundation/lazy/staggeredgrid/h;", "layoutInfo", "Ls1/e;", "density", "Ls1/e;", "()Ls1/e;", "(Ls1/e;)V", ak.aB, "Landroidx/compose/foundation/interaction/e;", "()Landroidx/compose/foundation/interaction/e;", "interactionSource", "isScrollInProgress", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "<init>", "([I[I)V", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class LazyStaggeredGridState implements androidx.compose.foundation.gestures.p {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f7295t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<LazyStaggeredGridState, Object> f7296u = ListSaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<int[]> invoke(@dl.d androidx.compose.runtime.saveable.f listSaver, @dl.d LazyStaggeredGridState state) {
            f0.p(listSaver, "$this$listSaver");
            f0.p(state, "state");
            return CollectionsKt__CollectionsKt.L(state.getScrollPosition().a(), state.getScrollPosition().b());
        }
    }, new yh.l<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LazyStaggeredGridState invoke(@dl.d List<int[]> it) {
            f0.p(it, "it");
            return new LazyStaggeredGridState(it.get(0), it.get(1), null);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q scrollPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<h> layoutInfoState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r spans;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollBackward;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.staggeredgrid.b animateScrollScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k1 remeasurement;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m1 remeasurementModifier;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.o prefetchState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.gestures.p scrollableState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int measurePassCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] laneWidthsPrefixSum;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int prefetchBaseIndex;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Integer, androidx.compose.foundation.lazy.layout.o.a> currentItemPrefetchHandles;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private s1.e f7313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.interaction.g mutableInteractionSource;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<LazyStaggeredGridState, Object> a() {
            return LazyStaggeredGridState.f7296u;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$b", "Landroidx/compose/ui/layout/m1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/b2;", "l1", "foundation_release"}, k = 1, mv = {1, 7, 1})
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
            LazyStaggeredGridState.this.remeasurement = remeasurement;
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

    public LazyStaggeredGridState(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11});
    }

    public /* synthetic */ LazyStaggeredGridState(int i10, int i11, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.scrollPosition = new q(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.layoutInfoState = h2.g(a.f7326a, null, 2, null);
        this.spans = new r();
        this.canScrollForward = true;
        this.canScrollBackward = true;
        this.animateScrollScope = new androidx.compose.foundation.lazy.staggeredgrid.b(this);
        this.remeasurementModifier = new b();
        this.prefetchState = new androidx.compose.foundation.lazy.layout.o();
        this.scrollableState = ScrollableStateKt.a(new yh.l<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            @dl.d
            public final Float a(float f10) {
                return Float.valueOf(-this.f7323b.E(-f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        });
        this.laneWidthsPrefixSum = new int[0];
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.f7313q = s1.g.a(1.0f, 1.0f);
        this.mutableInteractionSource = androidx.compose.foundation.interaction.f.a();
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, u uVar) {
        this(iArr, iArr2);
    }

    private final void D(float f10) {
        h value = this.layoutInfoState.getValue();
        if (!value.f().isEmpty()) {
            boolean z10 = f10 < 0.0f;
            int index = z10 ? ((e) CollectionsKt___CollectionsKt.k3(value.f())).getIndex() : ((e) CollectionsKt___CollectionsKt.w2(value.f())).getIndex();
            if (index == this.prefetchBaseIndex) {
                return;
            }
            this.prefetchBaseIndex = index;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = this.laneWidthsPrefixSum.length;
            int i10 = 0;
            while (i10 < length) {
                int iD = z10 ? this.spans.d(index, i10) : this.spans.e(index, i10);
                if (!(iD >= 0 && iD < value.getTotalItemsCount()) || index == iD) {
                    return;
                }
                linkedHashSet.add(Integer.valueOf(iD));
                if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(iD))) {
                    int[] iArr = this.laneWidthsPrefixSum;
                    int i11 = iArr[i10] - (i10 == 0 ? 0 : iArr[i10 - 1]);
                    this.currentItemPrefetchHandles.put(Integer.valueOf(iD), this.prefetchState.b(iD, this.isVertical ? s1.b.f139198b.e(i11) : s1.b.f139198b.d(i11)));
                }
                i10++;
                index = iD;
            }
            l(linkedHashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float E(float distance) {
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
            k1 k1Var = this.remeasurement;
            if (k1Var != null) {
                k1Var.d();
            }
            D(f11 - this.scrollToBeConsumed);
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    public static /* synthetic */ Object G(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, kotlin.coroutines.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.F(i10, i11, cVar);
    }

    public static /* synthetic */ Object i(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, kotlin.coroutines.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.h(i10, i11, cVar);
    }

    private final void k(h hVar) {
        List<e> listF = hVar.f();
        if (this.prefetchBaseIndex != -1) {
            if (!listF.isEmpty()) {
                int index = ((e) CollectionsKt___CollectionsKt.w2(listF)).getIndex();
                int index2 = ((e) CollectionsKt___CollectionsKt.k3(listF)).getIndex();
                int i10 = this.prefetchBaseIndex;
                if (index <= i10 && i10 <= index2) {
                    return;
                }
                this.prefetchBaseIndex = -1;
                Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
                while (it.hasNext()) {
                    ((androidx.compose.foundation.lazy.layout.o.a) it.next()).cancel();
                }
                this.currentItemPrefetchHandles.clear();
            }
        }
    }

    private final void l(Set<Integer> set) {
        Iterator<Map.Entry<Integer, androidx.compose.foundation.lazy.layout.o.a>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, androidx.compose.foundation.lazy.layout.o.a> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] m(int itemIndex, int laneCount) {
        this.spans.c(itemIndex + laneCount);
        int iF = this.spans.f(itemIndex);
        int iMin = iF == -1 ? 0 : Math.min(iF, laneCount);
        int[] iArr = new int[laneCount];
        int iE = itemIndex;
        for (int i10 = iMin - 1; -1 < i10; i10--) {
            iE = this.spans.e(iE, i10);
            iArr[i10] = iE;
            if (iE == -1) {
                kotlin.collections.m.u2(iArr, -1, 0, i10, 2, null);
                break;
            }
        }
        iArr[iMin] = itemIndex;
        while (true) {
            iMin++;
            if (iMin >= laneCount) {
                return iArr;
            }
            itemIndex = this.spans.d(itemIndex, iMin);
            iArr[iMin] = itemIndex;
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    @dl.d
    /* JADX INFO: renamed from: B, reason: from getter */
    public final r getSpans() {
        return this.spans;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @dl.e
    public final Object F(int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i10, i11, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public final void H(boolean z10) {
        this.canScrollForward = z10;
    }

    public final void I(@dl.d s1.e eVar) {
        f0.p(eVar, "<set-?>");
        this.f7313q = eVar;
    }

    public final void J(@dl.d int[] iArr) {
        f0.p(iArr, "<set-?>");
        this.laneWidthsPrefixSum = iArr;
    }

    public final void K(int i10) {
        this.measurePassCount = i10;
    }

    public final void L(boolean z10) {
        this.isVertical = z10;
    }

    public final void M(@dl.d androidx.compose.foundation.gestures.m mVar, int i10, int i11) {
        f0.p(mVar, "<this>");
        e eVarA = LazyStaggeredGridMeasureResultKt.a(u(), i10);
        if (eVarA != null) {
            boolean z10 = this.isVertical;
            long offset = eVarA.getOffset();
            mVar.a((z10 ? s1.n.o(offset) : s1.n.m(offset)) + i11);
        } else {
            this.scrollPosition.c(i10, i11);
            k1 k1Var = this.remeasurement;
            if (k1Var != null) {
                k1Var.d();
            }
        }
    }

    public final void N(@dl.d androidx.compose.foundation.lazy.layout.i itemProvider) {
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

    @Override // androidx.compose.foundation.gestures.p
    @dl.e
    public Object c(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super androidx.compose.foundation.gestures.m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = this.scrollableState.c(mutatePriority, pVar, cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    @dl.e
    public final Object h(int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = LazyAnimateScrollKt.c(this.animateScrollScope, i10, i11, cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    public final void j(@dl.d k result) {
        f0.p(result, "result");
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.canScrollBackward = result.getCanScrollBackward();
        this.canScrollForward = result.getCanScrollForward();
        this.layoutInfoState.setValue(result);
        k(result);
        this.scrollPosition.g(result);
        this.measurePassCount++;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final s1.e getF7313q() {
        return this.f7313q;
    }

    public final int p() {
        Integer numNn = ArraysKt___ArraysKt.Nn(this.scrollPosition.a());
        if (numNn != null) {
            return numNn.intValue();
        }
        return 0;
    }

    public final int q() {
        int[] iArrB = this.scrollPosition.b();
        if (iArrB.length == 0) {
            return 0;
        }
        return iArrB[LazyStaggeredGridMeasureKt.f(this.scrollPosition.a())];
    }

    @dl.d
    public final androidx.compose.foundation.interaction.e r() {
        return this.mutableInteractionSource;
    }

    public final int s() {
        return this.laneWidthsPrefixSum.length;
    }

    @dl.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public final int[] getLaneWidthsPrefixSum() {
        return this.laneWidthsPrefixSum;
    }

    @dl.d
    public final h u() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    @dl.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public final androidx.compose.foundation.interaction.g getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    @dl.d
    /* JADX INFO: renamed from: x, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.o getPrefetchState() {
        return this.prefetchState;
    }

    @dl.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public final m1 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    @dl.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public final q getScrollPosition() {
        return this.scrollPosition;
    }
}
