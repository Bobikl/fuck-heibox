package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rB\u000f\u0012\u0006\u0010\u001c\u001a\u00020K¢\u0006\u0004\b~\u0010QJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u0012\u0010\u001d\u001a\u00020\u000e2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bJ)\u0010$\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001c\u0010*\u001a\u00020(*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010)\u001a\u00020(H\u0016J\u001c\u0010,\u001a\u00020(*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010+\u001a\u00020(H\u0016J\u001c\u0010-\u001a\u00020(*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010)\u001a\u00020(H\u0016J\u001c\u0010.\u001a\u00020(*\u00020&2\u0006\u0010 \u001a\u00020'2\u0006\u0010+\u001a\u00020(H\u0016J\f\u00100\u001a\u00020\u000e*\u00020/H\u0016J-\u00107\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\b\u00109\u001a\u00020\u000eH\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\u0010H\u0016J\u0018\u0010?\u001a\u0004\u0018\u00010=*\u00020<2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010D\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020CH\u0016J\u001d\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u000205H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@H\u0016J\b\u0010J\u001a\u00020IH\u0016R*\u0010\u001c\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u000fR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010XR:\u0010b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030[0Zj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030[`\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010cR\u0014\u0010g\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001d\u0010E\u001a\u00020l8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR$\u0010u\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR-\u0010y\u001a\u0002052\u0006\u0010L\u001a\u0002058V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\bT\u0010n\"\u0004\bx\u0010GR\u0014\u0010}\u001a\u00020z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/node/o;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/j1;", "Landroidx/compose/ui/node/f1;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/modifier/n;", "Landroidx/compose/ui/node/d1;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/c1;", "Landroidx/compose/ui/draw/c;", "Landroidx/compose/ui/n$d;", "Lkotlin/b2;", "Z", "", "duringAttach", androidx.exifinterface.media.a.f23244d5, "a0", "F", "G", "n", "U", "()V", "d0", "b0", "Landroidx/compose/ui/modifier/m;", "element", "e0", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "Landroidx/compose/ui/graphics/drawscope/d;", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Ls1/r;", "bounds", "o", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "m", ak.aB, "f", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "Landroidx/compose/ui/layout/q;", "coordinates", androidx.exifinterface.media.a.T4, "Landroidx/compose/ui/layout/a0;", "q", UiKitSpanObj.TYPE_SIZE, "L", "(J)V", "p", "", "toString", "Landroidx/compose/ui/n$c;", "value", "Landroidx/compose/ui/n$c;", "R", "()Landroidx/compose/ui/n$c;", "X", "(Landroidx/compose/ui/n$c;)V", "invalidateCache", "Landroidx/compose/ui/focus/q;", "l", "Landroidx/compose/ui/focus/q;", "focusOrderElement", "Landroidx/compose/ui/modifier/a;", "Landroidx/compose/ui/modifier/a;", "_providedValues", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/c;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", androidx.exifinterface.media.a.R4, "()Ljava/util/HashSet;", "Y", "(Ljava/util/HashSet;)V", "readValues", "Landroidx/compose/ui/layout/q;", "lastOnPlacedCoordinates", "getDensity", "()Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lb1/m;", ak.aF, "()J", "Landroidx/compose/ui/modifier/h;", "g", "()Landroidx/compose/ui/modifier/h;", "providedValues", ak.av, "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "isValid", "()Z", "D", "targetSize", "Landroidx/compose/ui/semantics/j;", "c0", "()Landroidx/compose/ui/semantics/j;", "semanticsConfiguration", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class BackwardsCompatNode extends androidx.compose.ui.n.d implements v, o, h, j1, f1, androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n, d1, t, j, c1, androidx.compose.ui.draw.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.n.c element;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean invalidateCache;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.focus.q focusOrderElement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.modifier.a _providedValues;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private HashSet<androidx.compose.ui.modifier.c<?>> readValues;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q lastOnPlacedCoordinates;

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNode$a", "Landroidx/compose/ui/node/b1$b;", "Lkotlin/b2;", "n", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements b1.b {
        a() {
        }

        @Override // androidx.compose.ui.node.b1.b
        public void n() {
            if (BackwardsCompatNode.this.lastOnPlacedCoordinates == null) {
                BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                backwardsCompatNode.p(d.j(backwardsCompatNode, x0.f15398a.f()));
            }
        }
    }

    public BackwardsCompatNode(@dl.d androidx.compose.ui.n.c element) {
        kotlin.jvm.internal.f0.p(element, "element");
        K(w0.a(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void T(boolean z10) {
        if (!getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.c cVar = this.element;
        x0 x0Var = x0.f15398a;
        if ((x0Var.g() & getKindSet()) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.m) {
                e0((androidx.compose.ui.modifier.m) cVar);
            }
            if (cVar instanceof androidx.compose.ui.modifier.e) {
                if (z10) {
                    d0();
                } else {
                    N(new yh.a<b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.f15098b.d0();
                        }
                    });
                }
            }
            if (cVar instanceof androidx.compose.ui.focus.k) {
                final androidx.compose.ui.focus.m mVar = new androidx.compose.ui.focus.m((androidx.compose.ui.focus.k) cVar);
                androidx.compose.ui.focus.q qVar = new androidx.compose.ui.focus.q(mVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$$inlined$debugInspectorInfo$1
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var2) {
                        kotlin.jvm.internal.f0.p(x0Var2, "$this$null");
                        x0Var2.d("focusProperties");
                        x0Var2.getProperties().c("scope", mVar);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var2) {
                        a(x0Var2);
                        return b2.f124493a;
                    }
                } : InspectableValueKt.b());
                this.focusOrderElement = qVar;
                kotlin.jvm.internal.f0.m(qVar);
                e0(qVar);
                if (z10) {
                    b0();
                } else {
                    N(new yh.a<b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.f15099b.b0();
                        }
                    });
                }
            }
        }
        if ((x0Var.b() & getKindSet()) != 0) {
            if (cVar instanceof androidx.compose.ui.draw.g) {
                this.invalidateCache = true;
            }
            y.a(this);
        }
        if ((x0Var.e() & getKindSet()) != 0) {
            if (d.k(this).getNodes().getTail().getIsAttached()) {
                NodeCoordinator coordinator = getCoordinator();
                kotlin.jvm.internal.f0.m(coordinator);
                ((w) coordinator).S3(this);
                coordinator.m3();
            }
            y.a(this);
            d.k(this).K0();
        }
        if (cVar instanceof androidx.compose.ui.layout.m1) {
            ((androidx.compose.ui.layout.m1) cVar).l1(this);
        }
        if ((x0Var.f() & getKindSet()) != 0) {
            if ((cVar instanceof androidx.compose.ui.layout.a1) && d.k(this).getNodes().getTail().getIsAttached()) {
                d.k(this).K0();
            }
            if (cVar instanceof androidx.compose.ui.layout.x0) {
                this.lastOnPlacedCoordinates = null;
                if (d.k(this).getNodes().getTail().getIsAttached()) {
                    d.l(this).f(new a());
                }
            }
        }
        if (((x0Var.c() & getKindSet()) != 0) && (cVar instanceof androidx.compose.ui.layout.u0) && d.k(this).getNodes().getTail().getIsAttached()) {
            d.k(this).K0();
        }
        if (((x0Var.i() & getKindSet()) != 0) && (cVar instanceof androidx.compose.ui.input.pointer.g0)) {
            ((androidx.compose.ui.input.pointer.g0) cVar).getPointerInputFilter().l0(getCoordinator());
        }
        if ((x0Var.j() & getKindSet()) != 0) {
            d.l(this).A();
        }
    }

    private final void Z() {
        androidx.compose.ui.focus.q qVar;
        if (!getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.c cVar = this.element;
        x0 x0Var = x0.f15398a;
        if ((x0Var.g() & getKindSet()) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.m) {
                d.l(this).getModifierLocalManager().e(this, ((androidx.compose.ui.modifier.m) cVar).getKey());
            }
            if (cVar instanceof androidx.compose.ui.modifier.e) {
                ((androidx.compose.ui.modifier.e) cVar).w1(BackwardsCompatNodeKt.f15104a);
            }
            if ((cVar instanceof androidx.compose.ui.focus.k) && (qVar = this.focusOrderElement) != null) {
                d.l(this).getModifierLocalManager().e(this, qVar.getKey());
            }
        }
        if ((x0Var.j() & getKindSet()) != 0) {
            d.l(this).A();
        }
    }

    private final void a0() {
        final androidx.compose.ui.n.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.draw.g) {
            d.l(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.f15105b, new yh.a<b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((androidx.compose.ui.draw.g) cVar).F0(this);
                }
            });
        }
        this.invalidateCache = false;
    }

    @Override // androidx.compose.ui.node.o
    public void D(long j10) {
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((androidx.compose.ui.layout.l) cVar).D(j10);
    }

    @Override // androidx.compose.ui.n.d
    public void F() {
        T(true);
    }

    @Override // androidx.compose.ui.n.d
    public void G() {
        Z();
    }

    @Override // androidx.compose.ui.node.t
    public void L(long size) {
        androidx.compose.ui.n.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.layout.a1) {
            ((androidx.compose.ui.layout.a1) cVar).L(size);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: R, reason: from getter */
    public final androidx.compose.ui.n.c getElement() {
        return this.element;
    }

    @dl.d
    public final HashSet<androidx.compose.ui.modifier.c<?>> S() {
        return this.readValues;
    }

    public final void U() {
        this.invalidateCache = true;
        i.a(this);
    }

    @Override // androidx.compose.ui.node.d1
    @dl.e
    public Object V(@dl.d s1.e eVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.d1) cVar).V(eVar, obj);
    }

    @Override // androidx.compose.ui.node.j
    public void W(@dl.d androidx.compose.ui.layout.q coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.u0) cVar).W(coordinates);
    }

    public final void X(@dl.d androidx.compose.ui.n.c value) {
        kotlin.jvm.internal.f0.p(value, "value");
        if (getIsAttached()) {
            Z();
        }
        this.element = value;
        K(w0.a(value));
        if (getIsAttached()) {
            T(false);
        }
    }

    public final void Y(@dl.d HashSet<androidx.compose.ui.modifier.c<?>> hashSet) {
        kotlin.jvm.internal.f0.p(hashSet, "<set-?>");
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n
    public <T> T a(@dl.d androidx.compose.ui.modifier.c<T> cVar) {
        t0 nodes;
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        this.readValues.add(cVar);
        int iG = x0.f15398a.g();
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d parent = getNode().getParent();
        LayoutNode layoutNodeK = d.k(this);
        while (layoutNodeK != null) {
            if ((layoutNodeK.getNodes().getHead().getAggregateChildKindSet() & iG) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iG) != 0 && (parent instanceof androidx.compose.ui.modifier.j)) {
                        androidx.compose.ui.modifier.j jVar = (androidx.compose.ui.modifier.j) parent;
                        if (jVar.g().a(cVar)) {
                            return (T) jVar.g().b(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeK = layoutNodeK.v0();
            parent = (layoutNodeK == null || (nodes = layoutNodeK.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    @Override // androidx.compose.ui.node.v
    public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.w) cVar).b(nVar, measurable, i10);
    }

    public final void b0() {
        if (getIsAttached()) {
            d.l(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.f15107d, new yh.a<b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateFocusOrderModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.focus.q qVar = this.f15102b.focusOrderElement;
                    kotlin.jvm.internal.f0.m(qVar);
                    qVar.w1(this.f15102b);
                }
            });
        }
    }

    @Override // androidx.compose.ui.draw.c
    public long c() {
        return s1.s.f(d.j(this, x0.f15398a.f()).a());
    }

    @Override // androidx.compose.ui.node.j1
    @dl.d
    /* JADX INFO: renamed from: c0 */
    public androidx.compose.ui.semantics.j getSemanticsConfiguration() {
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((androidx.compose.ui.semantics.l) cVar).getSemanticsConfiguration();
    }

    @Override // androidx.compose.ui.node.v, androidx.compose.ui.layout.k1
    public /* synthetic */ void d() {
        u.a(this);
    }

    public final void d0() {
        if (getIsAttached()) {
            this.readValues.clear();
            d.l(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.f15106c, new yh.a<b2>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.n.c element = this.f15103b.getElement();
                    kotlin.jvm.internal.f0.n(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((androidx.compose.ui.modifier.e) element).w1(this.f15103b);
                }
            });
        }
    }

    public final void e0(@dl.d androidx.compose.ui.modifier.m<?> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        androidx.compose.ui.modifier.a aVar = this._providedValues;
        if (aVar != null && aVar.a(element.getKey())) {
            aVar.e(element);
            d.l(this).getModifierLocalManager().g(this, element.getKey());
        } else {
            this._providedValues = new androidx.compose.ui.modifier.a(element);
            if (d.k(this).getNodes().getTail().getIsAttached()) {
                d.l(this).getModifierLocalManager().b(this, element.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.node.f1
    public boolean f() {
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.g0) cVar).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.modifier.j
    @dl.d
    public androidx.compose.ui.modifier.h g() {
        androidx.compose.ui.modifier.a aVar = this._providedValues;
        return aVar != null ? aVar : androidx.compose.ui.modifier.k.a();
    }

    @Override // androidx.compose.ui.draw.c
    @dl.d
    public s1.e getDensity() {
        return d.k(this).getF15149p();
    }

    @Override // androidx.compose.ui.draw.c
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return d.k(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.v
    public int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.w) cVar).h(nVar, measurable, i10);
    }

    @Override // androidx.compose.ui.node.v
    public int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.w) cVar).i(nVar, measurable, i10);
    }

    @Override // androidx.compose.ui.node.c1
    public boolean isValid() {
        return getIsAttached();
    }

    @Override // androidx.compose.ui.node.v
    public int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.w) cVar).j(nVar, measurable, i10);
    }

    @Override // androidx.compose.ui.node.v
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.w) cVar).k(measure, measurable, j10);
    }

    @Override // androidx.compose.ui.node.o
    public long l() {
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        return ((androidx.compose.ui.layout.l) cVar).getTargetSize();
    }

    @Override // androidx.compose.ui.node.f1
    public void m() {
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.g0) cVar).getPointerInputFilter().Y();
    }

    @Override // androidx.compose.ui.node.h
    public void n() {
        this.invalidateCache = true;
        i.a(this);
    }

    @Override // androidx.compose.ui.node.f1
    public void o(@dl.d androidx.compose.ui.input.pointer.p pointerEvent, @dl.d PointerEventPass pass, long bounds) {
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(pass, "pass");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.g0) cVar).getPointerInputFilter().d0(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.t
    public void p(@dl.d androidx.compose.ui.layout.q coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        this.lastOnPlacedCoordinates = coordinates;
        androidx.compose.ui.n.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.layout.x0) {
            ((androidx.compose.ui.layout.x0) cVar).p(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.t
    public void q(@dl.d androidx.compose.ui.layout.a0 coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        androidx.compose.ui.n.c cVar = this.element;
        if (cVar instanceof androidx.compose.ui.layout.e0) {
            ((androidx.compose.ui.layout.e0) cVar).d(coordinates);
        }
    }

    @Override // androidx.compose.ui.modifier.j
    public /* synthetic */ void r(androidx.compose.ui.modifier.c cVar, Object obj) {
        androidx.compose.ui.modifier.i.c(this, cVar, obj);
    }

    @Override // androidx.compose.ui.node.f1
    public boolean s() {
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.g0) cVar).getPointerInputFilter().B();
    }

    @dl.d
    public String toString() {
        return this.element.toString();
    }

    @Override // androidx.compose.ui.node.h
    public void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        androidx.compose.ui.n.c cVar = this.element;
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        androidx.compose.ui.draw.j jVar = (androidx.compose.ui.draw.j) cVar;
        if (this.invalidateCache && (cVar instanceof androidx.compose.ui.draw.g)) {
            a0();
        }
        jVar.w(dVar);
    }
}
