package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J@\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\nH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R3\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR3\u0010%\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020!8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR\u0014\u0010'\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0014\u0010)\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u001d\u0010+\u001a\u00020\u00048DX\u0084\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b*\u0010\u001d\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/b2;", "V1", "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "", "<set-?>", "b", "I", "T1", "()I", "width", ak.aF, "Q1", "height", "Ls1/r;", "value", "d", "J", "R1", "()J", "W1", "(J)V", "measuredSize", "Ls1/b;", "e", "S1", "X1", "measurementConstraints", "k", "measuredWidth", androidx.exifinterface.media.a.T4, "measuredHeight", "P1", "apparentToRealOffset", "<init>", "()V", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class e1 implements n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15006f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long measuredSize = s1.s.a(0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long measurementConstraints = PlaceableKt.f14944b;

    /* JADX INFO: compiled from: Placeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b'\u0010%J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J)\u0010\u000f\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\tJD\u0010\u0014\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\f\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012J?\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012JD\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015JJ\u0010\u0018\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001b\b\b\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015JJ\u0010\u0019\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001b\b\b\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010!8WX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/layout/e1$a;", "", "Landroidx/compose/ui/layout/e1;", "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/layout/e1;JF)V", "", "x", "y", ak.aG, "o", "q", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/t;", "layerBlock", androidx.exifinterface.media.a.W4, "(Landroidx/compose/ui/layout/e1;JFLyh/l;)V", "C", androidx.exifinterface.media.a.S4, "t", ak.aB, "n", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/q;", "k", "()Landroidx/compose/ui/layout/q;", "getCoordinates$annotations", "()V", "coordinates", "<init>", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15012b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private static q f15015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private static LayoutNodeLayoutDelegate f15016f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private static LayoutDirection f15013c = LayoutDirection.Ltr;

        /* JADX INFO: renamed from: androidx.compose.ui.layout.e1$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: Placeable.kt */
        @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002JA\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0019\b\u0004\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/e1$a$a;", "Landroidx/compose/ui/layout/e1$a;", "Landroidx/compose/ui/node/h0;", "scope", "", "J", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "lookaheadCapablePlaceable", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlin/t;", "block", "K", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "()Landroidx/compose/ui/unit/LayoutDirection;", "I", "n", "()I", "Landroidx/compose/ui/layout/q;", "k", "()Landroidx/compose/ui/layout/q;", "getCoordinates$annotations", "()V", "coordinates", "_coordinates", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion extends a {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean J(androidx.compose.ui.node.h0 scope) {
                boolean z10 = false;
                if (scope == null) {
                    a.f15015e = null;
                    a.f15016f = null;
                    return false;
                }
                boolean zH2 = scope.getIsPlacingForAlignment();
                androidx.compose.ui.node.h0 h0VarE2 = scope.e2();
                if (h0VarE2 != null && h0VarE2.getIsPlacingForAlignment()) {
                    z10 = true;
                }
                if (z10) {
                    scope.k2(true);
                }
                a.f15016f = scope.getLayoutNode().getLayoutDelegate();
                if (scope.getIsPlacingForAlignment() || scope.getIsShallowPlacing()) {
                    a.f15015e = null;
                } else {
                    a.f15015e = scope.b2();
                }
                return zH2;
            }

            @androidx.compose.ui.g
            public static /* synthetic */ void l() {
            }

            public final void K(int i10, @dl.d LayoutDirection parentLayoutDirection, @dl.e androidx.compose.ui.node.h0 h0Var, @dl.d yh.l<? super a, b2> block) {
                kotlin.jvm.internal.f0.p(parentLayoutDirection, "parentLayoutDirection");
                kotlin.jvm.internal.f0.p(block, "block");
                q qVar = a.f15015e;
                Companion companion = a.INSTANCE;
                int iN = companion.n();
                LayoutDirection layoutDirectionM = companion.m();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = a.f15016f;
                a.f15014d = i10;
                a.f15013c = parentLayoutDirection;
                boolean zJ = J(h0Var);
                block.invoke(this);
                if (h0Var != null) {
                    h0Var.k2(zJ);
                }
                a.f15014d = iN;
                a.f15013c = layoutDirectionM;
                a.f15015e = qVar;
                a.f15016f = layoutNodeLayoutDelegate;
            }

            @Override // androidx.compose.ui.layout.e1.a
            @dl.e
            public q k() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = a.f15016f;
                if (layoutNodeLayoutDelegate != null) {
                    layoutNodeLayoutDelegate.M(true);
                }
                return a.f15015e;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.ui.layout.e1.a
            @dl.d
            public LayoutDirection m() {
                return a.f15013c;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.ui.layout.e1.a
            public int n() {
                return a.f15014d;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void B(a aVar, e1 e1Var, long j10, float f10, yh.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = PlaceableKt.f14943a;
            }
            aVar.A(e1Var, j10, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void D(a aVar, e1 e1Var, int i10, int i11, float f10, yh.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.f14943a;
            }
            aVar.C(e1Var, i10, i11, f11, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void F(a aVar, e1 e1Var, long j10, float f10, yh.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = PlaceableKt.f14943a;
            }
            aVar.E(e1Var, j10, f11, lVar);
        }

        @androidx.compose.ui.g
        public static /* synthetic */ void l() {
        }

        public static /* synthetic */ void p(a aVar, e1 e1Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.o(e1Var, i10, i11, f10);
        }

        public static /* synthetic */ void r(a aVar, e1 e1Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.q(e1Var, j10, f10);
        }

        public static /* synthetic */ void v(a aVar, e1 e1Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.u(e1Var, i10, i11, f10);
        }

        public static /* synthetic */ void x(a aVar, e1 e1Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.w(e1Var, j10, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void z(a aVar, e1 e1Var, int i10, int i11, float f10, yh.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.f14943a;
            }
            aVar.y(e1Var, i10, i11, f11, lVar);
        }

        public final void A(@dl.d e1 placeRelativeWithLayer, long j10, float f10, @dl.d yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            kotlin.jvm.internal.f0.p(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            kotlin.jvm.internal.f0.p(layerBlock, "layerBlock");
            if (m() == LayoutDirection.Ltr || n() == 0) {
                long jP1 = placeRelativeWithLayer.P1();
                placeRelativeWithLayer.U1(s1.o.a(s1.n.m(j10) + s1.n.m(jP1), s1.n.o(j10) + s1.n.o(jP1)), f10, layerBlock);
            } else {
                long jA = s1.o.a((n() - placeRelativeWithLayer.getWidth()) - s1.n.m(j10), s1.n.o(j10));
                long jP2 = placeRelativeWithLayer.P1();
                placeRelativeWithLayer.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP2), s1.n.o(jA) + s1.n.o(jP2)), f10, layerBlock);
            }
        }

        public final void C(@dl.d e1 e1Var, int i10, int i11, float f10, @dl.d yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            kotlin.jvm.internal.f0.p(e1Var, "<this>");
            kotlin.jvm.internal.f0.p(layerBlock, "layerBlock");
            long jA = s1.o.a(i10, i11);
            long jP1 = e1Var.P1();
            e1Var.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP1), s1.n.o(jA) + s1.n.o(jP1)), f10, layerBlock);
        }

        public final void E(@dl.d e1 placeWithLayer, long j10, float f10, @dl.d yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            kotlin.jvm.internal.f0.p(placeWithLayer, "$this$placeWithLayer");
            kotlin.jvm.internal.f0.p(layerBlock, "layerBlock");
            long jP1 = placeWithLayer.P1();
            placeWithLayer.U1(s1.o.a(s1.n.m(j10) + s1.n.m(jP1), s1.n.o(j10) + s1.n.o(jP1)), f10, layerBlock);
        }

        @androidx.compose.ui.g
        @dl.e
        public q k() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @dl.d
        public abstract LayoutDirection m();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int n();

        public final void o(@dl.d e1 e1Var, int i10, int i11, float f10) {
            kotlin.jvm.internal.f0.p(e1Var, "<this>");
            long jA = s1.o.a(i10, i11);
            long jP1 = e1Var.P1();
            e1Var.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP1), s1.n.o(jA) + s1.n.o(jP1)), f10, null);
        }

        public final void q(@dl.d e1 place, long j10, float f10) {
            kotlin.jvm.internal.f0.p(place, "$this$place");
            long jP1 = place.P1();
            place.U1(s1.o.a(s1.n.m(j10) + s1.n.m(jP1), s1.n.o(j10) + s1.n.o(jP1)), f10, null);
        }

        public final void s(@dl.d e1 placeApparentToRealOffset, long j10, float f10, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> lVar) {
            kotlin.jvm.internal.f0.p(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long jP1 = placeApparentToRealOffset.P1();
            placeApparentToRealOffset.U1(s1.o.a(s1.n.m(j10) + s1.n.m(jP1), s1.n.o(j10) + s1.n.o(jP1)), f10, lVar);
        }

        public final void t(@dl.d e1 placeAutoMirrored, long j10, float f10, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> lVar) {
            kotlin.jvm.internal.f0.p(placeAutoMirrored, "$this$placeAutoMirrored");
            if (m() == LayoutDirection.Ltr || n() == 0) {
                long jP1 = placeAutoMirrored.P1();
                placeAutoMirrored.U1(s1.o.a(s1.n.m(j10) + s1.n.m(jP1), s1.n.o(j10) + s1.n.o(jP1)), f10, lVar);
            } else {
                long jA = s1.o.a((n() - placeAutoMirrored.getWidth()) - s1.n.m(j10), s1.n.o(j10));
                long jP2 = placeAutoMirrored.P1();
                placeAutoMirrored.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP2), s1.n.o(jA) + s1.n.o(jP2)), f10, lVar);
            }
        }

        public final void u(@dl.d e1 e1Var, int i10, int i11, float f10) {
            kotlin.jvm.internal.f0.p(e1Var, "<this>");
            long jA = s1.o.a(i10, i11);
            if (m() == LayoutDirection.Ltr || n() == 0) {
                long jP1 = e1Var.P1();
                e1Var.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP1), s1.n.o(jA) + s1.n.o(jP1)), f10, null);
            } else {
                long jA2 = s1.o.a((n() - e1Var.getWidth()) - s1.n.m(jA), s1.n.o(jA));
                long jP2 = e1Var.P1();
                e1Var.U1(s1.o.a(s1.n.m(jA2) + s1.n.m(jP2), s1.n.o(jA2) + s1.n.o(jP2)), f10, null);
            }
        }

        public final void w(@dl.d e1 placeRelative, long j10, float f10) {
            kotlin.jvm.internal.f0.p(placeRelative, "$this$placeRelative");
            if (m() == LayoutDirection.Ltr || n() == 0) {
                long jP1 = placeRelative.P1();
                placeRelative.U1(s1.o.a(s1.n.m(j10) + s1.n.m(jP1), s1.n.o(j10) + s1.n.o(jP1)), f10, null);
            } else {
                long jA = s1.o.a((n() - placeRelative.getWidth()) - s1.n.m(j10), s1.n.o(j10));
                long jP2 = placeRelative.P1();
                placeRelative.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP2), s1.n.o(jA) + s1.n.o(jP2)), f10, null);
            }
        }

        public final void y(@dl.d e1 e1Var, int i10, int i11, float f10, @dl.d yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            kotlin.jvm.internal.f0.p(e1Var, "<this>");
            kotlin.jvm.internal.f0.p(layerBlock, "layerBlock");
            long jA = s1.o.a(i10, i11);
            if (m() == LayoutDirection.Ltr || n() == 0) {
                long jP1 = e1Var.P1();
                e1Var.U1(s1.o.a(s1.n.m(jA) + s1.n.m(jP1), s1.n.o(jA) + s1.n.o(jP1)), f10, layerBlock);
            } else {
                long jA2 = s1.o.a((n() - e1Var.getWidth()) - s1.n.m(jA), s1.n.o(jA));
                long jP2 = e1Var.P1();
                e1Var.U1(s1.o.a(s1.n.m(jA2) + s1.n.m(jP2), s1.n.o(jA2) + s1.n.o(jP2)), f10, layerBlock);
            }
        }
    }

    private final void V1() {
        this.width = fi.u.I(s1.r.m(this.measuredSize), s1.b.r(this.measurementConstraints), s1.b.p(this.measurementConstraints));
        this.height = fi.u.I(s1.r.j(this.measuredSize), s1.b.q(this.measurementConstraints), s1.b.o(this.measurementConstraints));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long P1() {
        return s1.o.a((this.width - s1.r.m(this.measuredSize)) / 2, (this.height - s1.r.j(this.measuredSize)) / 2);
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: R1, reason: from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock);

    @Override // androidx.compose.ui.layout.n0
    public int W() {
        return s1.r.j(this.measuredSize);
    }

    protected final void W1(long j10) {
        if (s1.r.h(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        V1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X1(long j10) {
        if (s1.b.g(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        V1();
    }

    @Override // androidx.compose.ui.layout.n0
    public /* synthetic */ Object b() {
        return m0.a(this);
    }

    @Override // androidx.compose.ui.layout.n0
    public int k() {
        return s1.r.m(this.measuredSize);
    }
}
