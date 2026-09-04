package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b'\u0010(B\t\b\u0016¢\u0006\u0004\b'\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+J*\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R1\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0002\b\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR1\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0002\b\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eRK\u0010%\u001a0\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0018¢\u0006\u0002\b\u001a\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0002\b\u001a8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "slotId", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "j", "(Ljava/lang/Object;Lyh/p;)Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "e", "()V", "d", "Landroidx/compose/ui/layout/r1;", ak.av, "Landroidx/compose/ui/layout/r1;", "slotReusePolicy", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "b", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "_state", "i", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/t;", "setRoot", "Lyh/p;", RXScreenCaptureService.KEY_HEIGHT, "()Lyh/p;", "Landroidx/compose/runtime/r;", "setCompositionContext", "f", "Landroidx/compose/ui/layout/q1;", "Ls1/b;", "Landroidx/compose/ui/layout/j0;", "setMeasurePolicy", "g", "<init>", "(Landroidx/compose/ui/layout/r1;)V", "", "maxSlotsToRetainForReuse", "(I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SubcomposeLayoutState {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14963f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r1 slotReusePolicy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private LayoutNodeSubcompositionsState _state;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.p<LayoutNode, SubcomposeLayoutState, b2> f14966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.p<LayoutNode, androidx.compose.runtime.r, b2> f14967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.p<LayoutNode, yh.p<? super q1, ? super s1.b, ? extends j0>, b2> f14968e;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "", "Lkotlin/b2;", "dispose", "", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "constraints", "b", "(IJ)V", ak.av, "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        int a();

        void b(int index, long constraints);

        void dispose();
    }

    public SubcomposeLayoutState() {
        this(s0.f15042a);
    }

    @kotlin.k(message = "This constructor is deprecated", replaceWith = @kotlin.s0(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i10) {
        this(SubcomposeLayoutKt.c(i10));
    }

    public SubcomposeLayoutState(@dl.d r1 slotReusePolicy) {
        kotlin.jvm.internal.f0.p(slotReusePolicy, "slotReusePolicy");
        this.slotReusePolicy = slotReusePolicy;
        this.f14966c = new yh.p<LayoutNode, SubcomposeLayoutState, b2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            public final void a(@dl.d LayoutNode layoutNode, @dl.d SubcomposeLayoutState it) {
                kotlin.jvm.internal.f0.p(layoutNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                SubcomposeLayoutState subcomposeLayoutState = this.f14971b;
                LayoutNodeSubcompositionsState subcompositionsState = layoutNode.getSubcompositionsState();
                if (subcompositionsState == null) {
                    subcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, this.f14971b.slotReusePolicy);
                    layoutNode.E1(subcompositionsState);
                }
                subcomposeLayoutState._state = subcompositionsState;
                this.f14971b.i().t();
                this.f14971b.i().y(this.f14971b.slotReusePolicy);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                a(layoutNode, subcomposeLayoutState);
                return b2.f124493a;
            }
        };
        this.f14967d = new yh.p<LayoutNode, androidx.compose.runtime.r, b2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            public final void a(@dl.d LayoutNode layoutNode, @dl.d androidx.compose.runtime.r it) {
                kotlin.jvm.internal.f0.p(layoutNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                this.f14969b.i().x(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, androidx.compose.runtime.r rVar) {
                a(layoutNode, rVar);
                return b2.f124493a;
            }
        };
        this.f14968e = new yh.p<LayoutNode, yh.p<? super q1, ? super s1.b, ? extends j0>, b2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            public final void a(@dl.d LayoutNode layoutNode, @dl.d yh.p<? super q1, ? super s1.b, ? extends j0> it) {
                kotlin.jvm.internal.f0.p(layoutNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                layoutNode.c(this.f14970b.i().k(it));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, yh.p<? super q1, ? super s1.b, ? extends j0> pVar) {
                a(layoutNode, pVar);
                return b2.f124493a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState i() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void d() {
        i().m();
    }

    public final void e() {
        i().o();
    }

    @dl.d
    public final yh.p<LayoutNode, androidx.compose.runtime.r, b2> f() {
        return this.f14967d;
    }

    @dl.d
    public final yh.p<LayoutNode, yh.p<? super q1, ? super s1.b, ? extends j0>, b2> g() {
        return this.f14968e;
    }

    @dl.d
    public final yh.p<LayoutNode, SubcomposeLayoutState, b2> h() {
        return this.f14966c;
    }

    @dl.d
    public final a j(@dl.e Object slotId, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        return i().w(slotId, content);
    }
}
