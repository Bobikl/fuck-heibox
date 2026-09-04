package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableStateKt;
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
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001\u001aB\u001c\u0012\b\b\u0002\u0010|\u001a\u00020\t\u0012\b\b\u0002\u0010}\u001a\u00020\t¢\u0006\u0005\b\u0084\u0001\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u001a\u00106\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010<\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R+\u0010B\u001a\u00020=2\u0006\u00107\u001a\u00020=8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010/\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010H\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\bF\u0010GR\"\u0010N\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010J\u001a\u0004\bK\u0010L\"\u0004\b9\u0010MR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u000eR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010JR/\u0010\\\u001a\u0004\u0018\u00010V2\b\u00107\u001a\u0004\u0018\u00010V8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010/\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010b\u001a\u00020]8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bO\u0010fR/\u0010m\u001a\u0004\u0018\u00010h2\b\u00107\u001a\u0004\u0018\u00010h8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR4\u0010t\u001a\u00020n2\u0006\u00107\u001a\u00020n8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bo\u0010/\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010u\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010JR$\u0010v\u001a\u00020I2\u0006\u00107\u001a\u00020I8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010J\u001a\u0004\bR\u0010LR\u001a\u0010{\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bx\u0010zR\u0011\u0010|\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bW\u0010GR\u0011\u0010}\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b^\u0010GR\u0011\u0010\u007f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bo\u0010~R\u0014\u0010\u0082\u0001\u001a\u00030\u0080\u00018F¢\u0006\u0007\u001a\u0005\bd\u0010\u0081\u0001R\u0015\u0010\u0083\u0001\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010L\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/p;", "", "delta", "Lkotlin/b2;", ak.aD, "Landroidx/compose/foundation/lazy/q;", "info", "i", "", UCropPlusActivity.ARG_INDEX, "scrollOffset", "B", "(IILkotlin/coroutines/c;)Ljava/lang/Object;", "I", "(II)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/m;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.aF, "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "distance", androidx.exifinterface.media.a.W4, "(F)F", "f", "Landroidx/compose/foundation/lazy/r;", "result", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/lazy/r;)V", "Landroidx/compose/foundation/lazy/o;", "itemProvider", "J", "(Landroidx/compose/foundation/lazy/o;)V", "Landroidx/compose/foundation/lazy/x;", "Landroidx/compose/foundation/lazy/x;", "scrollPosition", "Landroidx/compose/foundation/lazy/h;", "b", "Landroidx/compose/foundation/lazy/h;", "animateScrollScope", "Landroidx/compose/runtime/a1;", "Landroidx/compose/runtime/a1;", "layoutInfoState", "Landroidx/compose/foundation/interaction/g;", "d", "Landroidx/compose/foundation/interaction/g;", "p", "()Landroidx/compose/foundation/interaction/g;", "internalInteractionSource", "<set-?>", "e", "F", "y", "()F", "scrollToBeConsumed", "Ls1/e;", "l", "()Ls1/e;", "D", "(Ls1/e;)V", "density", "g", "Landroidx/compose/foundation/gestures/p;", "scrollableState", "r", "()I", "numMeasurePasses", "", "Z", ak.aG, "()Z", "(Z)V", "prefetchingEnabled", "j", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/o$a;", "k", "Landroidx/compose/foundation/lazy/layout/o$a;", "currentPrefetchHandle", "wasScrollingForward", "Landroidx/compose/ui/layout/k1;", "m", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/layout/k1;", "H", "(Landroidx/compose/ui/layout/k1;)V", "remeasurement", "Landroidx/compose/ui/layout/m1;", "n", "Landroidx/compose/ui/layout/m1;", "x", "()Landroidx/compose/ui/layout/m1;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "o", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", ak.aB, "()Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", androidx.exifinterface.media.a.S4, "(Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;)V", "placementAnimator", "Ls1/b;", "q", "v", "()J", "G", "(J)V", "premeasureConstraints", "canScrollBackward", "canScrollForward", "Landroidx/compose/foundation/lazy/layout/o;", "t", "Landroidx/compose/foundation/lazy/layout/o;", "()Landroidx/compose/foundation/lazy/layout/o;", "prefetchState", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "()Landroidx/compose/foundation/lazy/q;", "layoutInfo", "Landroidx/compose/foundation/interaction/e;", "()Landroidx/compose/foundation/interaction/e;", "interactionSource", "isScrollInProgress", "<init>", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyListState implements androidx.compose.foundation.gestures.p {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<LazyListState, ?> f6585v = ListSaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(@dl.d androidx.compose.runtime.saveable.f listSaver, @dl.d LazyListState it) {
            f0.p(listSaver, "$this$listSaver");
            f0.p(it, "it");
            return CollectionsKt__CollectionsKt.L(Integer.valueOf(it.m()), Integer.valueOf(it.n()));
        }
    }, new yh.l<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LazyListState invoke(@dl.d List<Integer> it) {
            f0.p(it, "it");
            return new LazyListState(it.get(0).intValue(), it.get(1).intValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x scrollPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h animateScrollScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<q> layoutInfoState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.interaction.g internalInteractionSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 density;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.gestures.p scrollableState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.foundation.lazy.layout.o.a currentPrefetchHandle;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 remeasurement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m1 remeasurementModifier;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 placementAnimator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 premeasureConstraints;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollBackward;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.o prefetchState;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LazyListState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/foundation/lazy/LazyListState;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<LazyListState, ?> a() {
            return LazyListState.f6585v;
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/lazy/LazyListState$b", "Landroidx/compose/ui/layout/m1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/b2;", "l1", "foundation_release"}, k = 1, mv = {1, 7, 1})
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
            LazyListState.this.H(remeasurement);
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
    public LazyListState() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public LazyListState(int i10, int i11) {
        this.scrollPosition = new x(i10, i11);
        this.animateScrollScope = new h(this);
        this.layoutInfoState = h2.g(c.f6635a, null, 2, null);
        this.internalInteractionSource = androidx.compose.foundation.interaction.f.a();
        this.density = h2.g(s1.g.a(1.0f, 1.0f), null, 2, null);
        this.scrollableState = ScrollableStateKt.a(new yh.l<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            @dl.d
            public final Float a(float f10) {
                return Float.valueOf(-this.f6619b.A(-f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.remeasurement = h2.g(null, null, 2, null);
        this.remeasurementModifier = new b();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.placementAnimator = h2.g(null, null, 2, null);
        this.premeasureConstraints = h2.g(s1.b.b(s1.c.b(0, 0, 0, 0, 15, null)), null, 2, null);
        this.prefetchState = new androidx.compose.foundation.lazy.layout.o();
    }

    public /* synthetic */ LazyListState(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public static /* synthetic */ Object C(LazyListState lazyListState, int i10, int i11, kotlin.coroutines.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyListState.B(i10, i11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(k1 k1Var) {
        this.remeasurement.setValue(k1Var);
    }

    public static /* synthetic */ Object g(LazyListState lazyListState, int i10, int i11, kotlin.coroutines.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyListState.f(i10, i11, cVar);
    }

    private final void i(q qVar) {
        if (this.indexToPrefetch == -1 || !(!qVar.f().isEmpty())) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((m) CollectionsKt___CollectionsKt.k3(qVar.f())).getIndex() + 1 : ((m) CollectionsKt___CollectionsKt.w2(qVar.f())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            androidx.compose.foundation.lazy.layout.o.a aVar = this.currentPrefetchHandle;
            if (aVar != null) {
                aVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    private final void z(float f10) {
        androidx.compose.foundation.lazy.layout.o.a aVar;
        if (this.prefetchingEnabled) {
            q qVarQ = q();
            if (!qVarQ.f().isEmpty()) {
                boolean z10 = f10 < 0.0f;
                int index = z10 ? ((m) CollectionsKt___CollectionsKt.k3(qVarQ.f())).getIndex() + 1 : ((m) CollectionsKt___CollectionsKt.w2(qVarQ.f())).getIndex() - 1;
                if (index != this.indexToPrefetch) {
                    if (index >= 0 && index < qVarQ.getTotalItemsCount()) {
                        if (this.wasScrollingForward != z10 && (aVar = this.currentPrefetchHandle) != null) {
                            aVar.cancel();
                        }
                        this.wasScrollingForward = z10;
                        this.indexToPrefetch = index;
                        this.currentPrefetchHandle = this.prefetchState.b(index, v());
                    }
                }
            }
        }
    }

    public final float A(float distance) {
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
                z(f11 - this.scrollToBeConsumed);
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
    public final Object B(int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this, null, new LazyListState$scrollToItem$2(this, i10, i11, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public final void D(@dl.d s1.e eVar) {
        f0.p(eVar, "<set-?>");
        this.density.setValue(eVar);
    }

    public final void E(@dl.e LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyListItemPlacementAnimator);
    }

    public final void F(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void G(long j10) {
        this.premeasureConstraints.setValue(s1.b.b(j10));
    }

    public final void I(int index, int scrollOffset) {
        this.scrollPosition.c(androidx.compose.foundation.lazy.b.c(index), scrollOffset);
        LazyListItemPlacementAnimator lazyListItemPlacementAnimatorS = s();
        if (lazyListItemPlacementAnimatorS != null) {
            lazyListItemPlacementAnimatorS.f();
        }
        k1 k1VarW = w();
        if (k1VarW != null) {
            k1VarW.d();
        }
    }

    public final void J(@dl.d o itemProvider) {
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
        LazyListState$scroll$1 lazyListState$scroll$1;
        LazyListState lazyListState;
        if (cVar instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) cVar;
            int i10 = lazyListState$scroll$1.f6614g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.f6614g = i10 - Integer.MIN_VALUE;
            } else {
                lazyListState$scroll$1 = new LazyListState$scroll$1(this, cVar);
            }
        } else {
            lazyListState$scroll$1 = new LazyListState$scroll$1(this, cVar);
        }
        Object obj = lazyListState$scroll$1.f6612e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = lazyListState$scroll$1.f6614g;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (yh.p) lazyListState$scroll$1.f6611d;
                mutatePriority = (MutatePriority) lazyListState$scroll$1.f6610c;
                lazyListState = (LazyListState) lazyListState$scroll$1.f6609b;
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
        lazyListState$scroll$1.f6609b = this;
        lazyListState$scroll$1.f6610c = mutatePriority;
        lazyListState$scroll$1.f6611d = pVar;
        lazyListState$scroll$1.f6614g = 1;
        if (awaitFirstLayoutModifier.a(lazyListState$scroll$1) == objH) {
            return objH;
        }
        lazyListState = this;
        androidx.compose.foundation.gestures.p pVar2 = lazyListState.scrollableState;
        lazyListState$scroll$1.f6609b = null;
        lazyListState$scroll$1.f6610c = null;
        lazyListState$scroll$1.f6611d = null;
        lazyListState$scroll$1.f6614g = 2;
        if (pVar2.c(mutatePriority, pVar, lazyListState$scroll$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    @dl.e
    public final Object f(int i10, int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = LazyAnimateScrollKt.c(this.animateScrollScope, i10, i11, cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    public final void h(@dl.d r result) {
        f0.p(result, "result");
        this.scrollPosition.g(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        this.canScrollForward = result.getCanScrollForward();
        y firstVisibleItem = result.getFirstVisibleItem();
        this.canScrollBackward = ((firstVisibleItem != null ? firstVisibleItem.getIndex() : 0) == 0 && result.getFirstVisibleItemScrollOffset() == 0) ? false : true;
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
    public final q q() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final LazyListItemPlacementAnimator s() {
        return (LazyListItemPlacementAnimator) this.placementAnimator.getValue();
    }

    @dl.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.o getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long v() {
        return ((s1.b) this.premeasureConstraints.getValue()).getF139216a();
    }

    @dl.e
    public final k1 w() {
        return (k1) this.remeasurement.getValue();
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
}
