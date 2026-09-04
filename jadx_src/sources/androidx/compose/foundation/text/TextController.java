package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.t1;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextLayoutResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\t\u001a\u00020\b*\u00020\bH\u0003J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R$\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0011\u00102\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/t1;", "Lb1/f;", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "m", "(JJ)Z", "Landroidx/compose/ui/n;", "g", "Landroidx/compose/ui/text/d;", "text", "f", "Landroidx/compose/foundation/text/selection/o;", "selectionRegistrar", "Lkotlin/b2;", "p", "Landroidx/compose/foundation/text/p;", "textDelegate", "o", "b", "d", ak.aF, "Landroidx/compose/foundation/text/TextState;", "Landroidx/compose/foundation/text/TextState;", "l", "()Landroidx/compose/foundation/text/TextState;", "state", "Landroidx/compose/foundation/text/selection/o;", "Landroidx/compose/foundation/text/r;", "Landroidx/compose/foundation/text/r;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/text/r;", "n", "(Landroidx/compose/foundation/text/r;)V", "longPressDragObserver", "Landroidx/compose/ui/layout/i0;", "e", "Landroidx/compose/ui/layout/i0;", "i", "()Landroidx/compose/ui/layout/i0;", "measurePolicy", "Landroidx/compose/ui/n;", "coreModifiers", "<set-?>", "k", "()Landroidx/compose/ui/n;", "semanticsModifier", "selectionModifiers", "j", "modifiers", "<init>", "(Landroidx/compose/foundation/text/TextState;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextController implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextState state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.foundation.text.selection.o selectionRegistrar;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public r longPressDragObserver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i0 measurePolicy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n coreModifiers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.n semanticsModifier;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.n selectionModifiers;

    /* JADX INFO: compiled from: CoreText.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R+\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R+\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0006\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, d2 = {"androidx/compose/foundation/text/TextController$a", "Landroidx/compose/foundation/text/r;", "Lb1/f;", "point", "Lkotlin/b2;", ak.av, "(J)V", "d", "startPoint", ak.aF, "delta", "b", "onStop", "onCancel", "J", "f", "()J", RXScreenCaptureService.KEY_HEIGHT, "lastPosition", "e", "g", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long dragTotalDistance;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.o f7886d;

        a(androidx.compose.foundation.text.selection.o oVar) {
            this.f7886d = oVar;
            b1.f.a aVar = b1.f.f30364b;
            this.lastPosition = aVar.e();
            this.dragTotalDistance = aVar.e();
        }

        @Override // androidx.compose.foundation.text.r
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.r
        public void b(long delta) {
            androidx.compose.ui.layout.q layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
            if (layoutCoordinates != null) {
                androidx.compose.foundation.text.selection.o oVar = this.f7886d;
                TextController textController = TextController.this;
                if (layoutCoordinates.p() && SelectionRegistrarKt.b(oVar, textController.getState().getSelectableId())) {
                    long jV = b1.f.v(this.dragTotalDistance, delta);
                    this.dragTotalDistance = jV;
                    long jV2 = b1.f.v(this.lastPosition, jV);
                    if (textController.m(this.lastPosition, jV2) || !oVar.g(layoutCoordinates, jV2, this.lastPosition, false, SelectionAdjustment.INSTANCE.d())) {
                        return;
                    }
                    this.lastPosition = jV2;
                    this.dragTotalDistance = b1.f.f30364b.e();
                }
            }
        }

        @Override // androidx.compose.foundation.text.r
        public void c(long startPoint) {
            androidx.compose.ui.layout.q layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
            if (layoutCoordinates != null) {
                TextController textController = TextController.this;
                androidx.compose.foundation.text.selection.o oVar = this.f7886d;
                if (!layoutCoordinates.p()) {
                    return;
                }
                if (textController.m(startPoint, startPoint)) {
                    oVar.i(textController.getState().getSelectableId());
                } else {
                    oVar.a(layoutCoordinates, startPoint, SelectionAdjustment.INSTANCE.g());
                }
                this.lastPosition = startPoint;
            }
            if (SelectionRegistrarKt.b(this.f7886d, TextController.this.getState().getSelectableId())) {
                this.dragTotalDistance = b1.f.f30364b.e();
            }
        }

        @Override // androidx.compose.foundation.text.r
        public void d() {
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getDragTotalDistance() {
            return this.dragTotalDistance;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        public final void g(long j10) {
            this.dragTotalDistance = j10;
        }

        public final void h(long j10) {
            this.lastPosition = j10;
        }

        @Override // androidx.compose.foundation.text.r
        public void onCancel() {
            if (SelectionRegistrarKt.b(this.f7886d, TextController.this.getState().getSelectableId())) {
                this.f7886d.d();
            }
        }

        @Override // androidx.compose.foundation.text.r
        public void onStop() {
            if (SelectionRegistrarKt.b(this.f7886d, TextController.this.getState().getSelectableId())) {
                this.f7886d.d();
            }
        }
    }

    /* JADX INFO: compiled from: CoreText.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fR+\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/text/TextController$b", "Landroidx/compose/foundation/text/selection/e;", "Lb1/f;", "downPosition", "", "d", "(J)Z", "dragPosition", "b", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", ak.aF, "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", ak.av, "J", "e", "()J", "f", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements androidx.compose.foundation.text.selection.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = b1.f.f30364b.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.o f7889c;

        b(androidx.compose.foundation.text.selection.o oVar) {
            this.f7889c = oVar;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean a(long dragPosition, @dl.d SelectionAdjustment adjustment) {
            f0.p(adjustment, "adjustment");
            androidx.compose.ui.layout.q layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
            if (layoutCoordinates != null) {
                androidx.compose.foundation.text.selection.o oVar = this.f7889c;
                TextController textController = TextController.this;
                if (!layoutCoordinates.p() || !SelectionRegistrarKt.b(oVar, textController.getState().getSelectableId())) {
                    return false;
                }
                if (oVar.g(layoutCoordinates, dragPosition, this.lastPosition, false, adjustment)) {
                    this.lastPosition = dragPosition;
                }
            }
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean b(long dragPosition) {
            androidx.compose.ui.layout.q layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return true;
            }
            androidx.compose.foundation.text.selection.o oVar = this.f7889c;
            TextController textController = TextController.this;
            if (!layoutCoordinates.p() || !SelectionRegistrarKt.b(oVar, textController.getState().getSelectableId())) {
                return false;
            }
            if (!oVar.g(layoutCoordinates, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.e())) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean c(long downPosition, @dl.d SelectionAdjustment adjustment) {
            f0.p(adjustment, "adjustment");
            androidx.compose.ui.layout.q layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return false;
            }
            androidx.compose.foundation.text.selection.o oVar = this.f7889c;
            TextController textController = TextController.this;
            if (!layoutCoordinates.p()) {
                return false;
            }
            oVar.a(layoutCoordinates, downPosition, adjustment);
            this.lastPosition = downPosition;
            return SelectionRegistrarKt.b(oVar, textController.getState().getSelectableId());
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean d(long downPosition) {
            androidx.compose.ui.layout.q layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return false;
            }
            androidx.compose.foundation.text.selection.o oVar = this.f7889c;
            TextController textController = TextController.this;
            if (!layoutCoordinates.p()) {
                return false;
            }
            if (oVar.g(layoutCoordinates, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.e())) {
                this.lastPosition = downPosition;
            }
            return SelectionRegistrarKt.b(oVar, textController.getState().getSelectableId());
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        public final void f(long j10) {
            this.lastPosition = j10;
        }
    }

    public TextController(@dl.d TextState state) {
        f0.p(state, "state");
        this.state = state;
        this.measurePolicy = new i0() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
            @Override // androidx.compose.ui.layout.i0
            @dl.d
            public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
                androidx.compose.foundation.text.selection.o oVar;
                f0.p(measure, "$this$measure");
                f0.p(measurables, "measurables");
                TextLayoutResult layoutResult = this.f7895a.getState().getLayoutResult();
                TextLayoutResult textLayoutResultN = this.f7895a.getState().getTextDelegate().n(j10, measure.getLayoutDirection(), layoutResult);
                if (!f0.g(layoutResult, textLayoutResultN)) {
                    this.f7895a.getState().d().invoke(textLayoutResultN);
                    if (layoutResult != null) {
                        TextController textController = this.f7895a;
                        if (!f0.g(layoutResult.getLayoutInput().getText(), textLayoutResultN.getLayoutInput().getText()) && (oVar = textController.selectionRegistrar) != null) {
                            oVar.h(textController.getState().getSelectableId());
                        }
                    }
                }
                this.f7895a.getState().l(textLayoutResultN);
                if (!(measurables.size() >= textLayoutResultN.A().size())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                List<b1.i> listA = textLayoutResultN.A();
                final ArrayList arrayList = new ArrayList(listA.size());
                int i10 = 0;
                for (int size = listA.size(); i10 < size; size = size) {
                    b1.i iVar = listA.get(i10);
                    Pair pair = iVar != null ? new Pair(measurables.get(i10).z1(s1.c.b(0, (int) Math.floor(iVar.G()), 0, (int) Math.floor(iVar.r()), 5, null)), s1.n.b(s1.o.a(di.d.L0(iVar.t()), di.d.L0(iVar.getF30372b())))) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i10++;
                }
                return measure.p1(s1.r.m(textLayoutResultN.getSize()), s1.r.j(textLayoutResultN.getSize()), s0.W(c1.a(AlignmentLineKt.a(), Integer.valueOf(di.d.L0(textLayoutResultN.getFirstBaseline()))), c1.a(AlignmentLineKt.b(), Integer.valueOf(di.d.L0(textLayoutResultN.getLastBaseline())))), new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d e1.a layout) {
                        f0.p(layout, "$this$layout");
                        List<Pair<e1, s1.n>> list = arrayList;
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            Pair<e1, s1.n> pair2 = list.get(i11);
                            e1.a.r(layout, pair2.a(), pair2.b().getF139239a(), 0.0f, 2, null);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                });
            }

            @Override // androidx.compose.ui.layout.i0
            public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                return s1.r.j(p.o(this.f7895a.getState().getTextDelegate(), s1.c.a(0, i10, 0, Integer.MAX_VALUE), nVar.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.i0
            public int c(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                this.f7895a.getState().getTextDelegate().p(nVar.getLayoutDirection());
                return this.f7895a.getState().getTextDelegate().f();
            }

            @Override // androidx.compose.ui.layout.i0
            public int d(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                return s1.r.j(p.o(this.f7895a.getState().getTextDelegate(), s1.c.a(0, i10, 0, Integer.MAX_VALUE), nVar.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.i0
            public int e(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                this.f7895a.getState().getTextDelegate().p(nVar.getLayoutDirection());
                return this.f7895a.getState().getTextDelegate().d();
            }
        };
        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
        this.coreModifiers = OnGloballyPositionedModifierKt.a(g(companion), new yh.l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.q it) {
                androidx.compose.foundation.text.selection.o oVar;
                f0.p(it, "it");
                this.f7890b.getState().k(it);
                if (SelectionRegistrarKt.b(this.f7890b.selectionRegistrar, this.f7890b.getState().getSelectableId())) {
                    long jG = androidx.compose.ui.layout.r.g(it);
                    if (!b1.f.l(jG, this.f7890b.getState().getPreviousGlobalPosition()) && (oVar = this.f7890b.selectionRegistrar) != null) {
                        oVar.b(this.f7890b.getState().getSelectableId());
                    }
                    this.f7890b.getState().n(jG);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                a(qVar);
                return b2.f124493a;
            }
        });
        this.semanticsModifier = f(state.getTextDelegate().getText());
        this.selectionModifiers = companion;
    }

    private final androidx.compose.ui.n f(final androidx.compose.ui.text.d text) {
        return SemanticsModifierKt.c(androidx.compose.ui.n.INSTANCE, false, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.text.TextController$createSemanticsModifierFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.v0(semantics, text);
                final TextController textController = this;
                SemanticsPropertiesKt.G(semantics, null, new yh.l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.TextController$createSemanticsModifierFor$1.1
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(@dl.d List<TextLayoutResult> it) {
                        boolean z10;
                        f0.p(it, "it");
                        if (textController.getState().getLayoutResult() != null) {
                            TextLayoutResult layoutResult = textController.getState().getLayoutResult();
                            f0.m(layoutResult);
                            it.add(layoutResult);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                }, 1, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        }, 1, null);
    }

    @j2
    private final androidx.compose.ui.n g(androidx.compose.ui.n nVar) {
        return DrawModifierKt.a(GraphicsLayerModifierKt.e(nVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new yh.l<androidx.compose.ui.graphics.drawscope.g, b2>() { // from class: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g drawBehind) {
                Map<Long, Selection> mapF;
                f0.p(drawBehind, "$this$drawBehind");
                TextLayoutResult layoutResult = this.f7894b.getState().getLayoutResult();
                if (layoutResult != null) {
                    TextController textController = this.f7894b;
                    textController.getState().a();
                    androidx.compose.foundation.text.selection.o oVar = textController.selectionRegistrar;
                    Selection selection = (oVar == null || (mapF = oVar.f()) == null) ? null : mapF.get(Long.valueOf(textController.getState().getSelectableId()));
                    if (selection != null) {
                        int iG = !selection.g() ? selection.h().g() : selection.f().g();
                        int iG2 = !selection.g() ? selection.f().g() : selection.h().g();
                        if (iG != iG2) {
                            androidx.compose.ui.graphics.drawscope.f.G(drawBehind, layoutResult.getMultiParagraph().C(iG, iG2), textController.getState().getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
                        }
                    }
                    p.INSTANCE.a(drawBehind.getDrawContext().a(), layoutResult);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                a(gVar);
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(long start, long end) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int iX = layoutResult.x(start);
        int iX2 = layoutResult.x(end);
        int i10 = length - 1;
        return (iX >= i10 && iX2 >= i10) || (iX < 0 && iX2 < 0);
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
        androidx.compose.foundation.text.selection.o oVar = this.selectionRegistrar;
        if (oVar != null) {
            TextState textState = this.state;
            textState.o(oVar.j(new androidx.compose.foundation.text.selection.f(textState.getSelectableId(), new yh.a<androidx.compose.ui.layout.q>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.layout.q invoke() {
                    return this.f7897b.getState().getLayoutCoordinates();
                }
            }, new yh.a<TextLayoutResult>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final TextLayoutResult invoke() {
                    return this.f7898b.getState().getLayoutResult();
                }
            })));
        }
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
        androidx.compose.foundation.text.selection.o oVar;
        androidx.compose.foundation.text.selection.i selectable = this.state.getSelectable();
        if (selectable == null || (oVar = this.selectionRegistrar) == null) {
            return;
        }
        oVar.c(selectable);
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        androidx.compose.foundation.text.selection.o oVar;
        androidx.compose.foundation.text.selection.i selectable = this.state.getSelectable();
        if (selectable == null || (oVar = this.selectionRegistrar) == null) {
            return;
        }
        oVar.c(selectable);
    }

    @dl.d
    public final r h() {
        r rVar = this.longPressDragObserver;
        if (rVar != null) {
            return rVar;
        }
        f0.S("longPressDragObserver");
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final i0 getMeasurePolicy() {
        return this.measurePolicy;
    }

    @dl.d
    public final androidx.compose.ui.n j() {
        return this.coreModifiers.s0(this.semanticsModifier).s0(this.selectionModifiers);
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.n getSemanticsModifier() {
        return this.semanticsModifier;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextState getState() {
        return this.state;
    }

    public final void n(@dl.d r rVar) {
        f0.p(rVar, "<set-?>");
        this.longPressDragObserver = rVar;
    }

    public final void o(@dl.d p textDelegate) {
        f0.p(textDelegate, "textDelegate");
        if (this.state.getTextDelegate() == textDelegate) {
            return;
        }
        this.state.q(textDelegate);
        this.semanticsModifier = f(this.state.getTextDelegate().getText());
    }

    public final void p(@dl.e androidx.compose.foundation.text.selection.o oVar) {
        androidx.compose.ui.n nVarB;
        this.selectionRegistrar = oVar;
        if (oVar == null) {
            nVarB = androidx.compose.ui.n.INSTANCE;
        } else if (z.a()) {
            n(new a(oVar));
            nVarB = SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE, h(), new TextController$update$2(this, null));
        } else {
            b bVar = new b(oVar);
            nVarB = PointerIconKt.b(SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE, bVar, new TextController$update$3(bVar, null)), y.a(), false, 2, null);
        }
        this.selectionModifiers = nVarB;
    }
}
