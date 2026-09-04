package androidx.compose.ui.focus;

import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.x0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.y0;
import androidx.core.app.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 v2\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001wB*\u0012\u0006\u0010o\u001a\u00020\u001e\u0012\u0019\b\u0002\u0010s\u001a\u0013\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\b0p¢\u0006\u0002\br¢\u0006\u0004\bt\u0010uJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010*\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b \u0010=\"\u0004\b>\u0010?R$\u0010G\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010T\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010Z\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010V\u001a\u0004\bI\u0010W\"\u0004\bX\u0010YR\"\u0010`\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010f\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010c\u001a\u0004\bd\u0010eR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020a0\u00188\u0006¢\u0006\f\n\u0004\b\\\u0010\u001a\u001a\u0004\bg\u0010\u001cR\u0014\u0010i\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010]R\u001c\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010\u001f\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0014¨\u0006x"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/node/c1;", "Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "Landroidx/compose/ui/input/rotary/a;", o0.I0, "", "H", "Landroidx/compose/ui/layout/q;", "coordinates", "p", "e", "Landroidx/compose/ui/focus/FocusModifier;", androidx.exifinterface.media.a.S4, "()Landroidx/compose/ui/focus/FocusModifier;", androidx.exifinterface.media.a.R4, "(Landroidx/compose/ui/focus/FocusModifier;)V", "parent", "Landroidx/compose/runtime/collection/e;", "f", "Landroidx/compose/runtime/collection/e;", "m", "()Landroidx/compose/runtime/collection/e;", "children", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "g", "Landroidx/compose/ui/focus/FocusStateImpl;", "y", "()Landroidx/compose/ui/focus/FocusStateImpl;", "P", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusState", RXScreenCaptureService.KEY_HEIGHT, ak.aD, "Q", "focusedChild", "Landroidx/compose/ui/focus/e;", "i", "Landroidx/compose/ui/focus/e;", "o", "()Landroidx/compose/ui/focus/e;", "K", "(Landroidx/compose/ui/focus/e;)V", "focusEventListener", "k", "Landroidx/compose/ui/modifier/n;", "C", "()Landroidx/compose/ui/modifier/n;", "R", "(Landroidx/compose/ui/modifier/n;)V", "modifierLocalReadScope", "Landroidx/compose/ui/layout/b;", "l", "Landroidx/compose/ui/layout/b;", "()Landroidx/compose/ui/layout/b;", "I", "(Landroidx/compose/ui/layout/b;)V", "beyondBoundsLayoutParent", "Landroidx/compose/ui/focus/q;", "Landroidx/compose/ui/focus/q;", "r", "()Landroidx/compose/ui/focus/q;", "M", "(Landroidx/compose/ui/focus/q;)V", "focusPropertiesModifier", "Landroidx/compose/ui/focus/p;", "n", "Landroidx/compose/ui/focus/p;", "q", "()Landroidx/compose/ui/focus/p;", "focusProperties", "Landroidx/compose/ui/focus/u;", "Landroidx/compose/ui/focus/u;", ak.aG, "()Landroidx/compose/ui/focus/u;", "O", "(Landroidx/compose/ui/focus/u;)V", "focusRequester", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "J", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "coordinator", "Z", ak.aB, "()Z", "N", "(Z)V", "focusRequestedOnPlaced", "Landroidx/compose/ui/input/key/e;", "<set-?>", "Landroidx/compose/ui/input/key/e;", "B", "()Landroidx/compose/ui/input/key/e;", "keyInputModifier", androidx.exifinterface.media.a.W4, "keyInputChildren", "isValid", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "G", "initialFocus", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/focus/FocusStateImpl;Lyh/l;)V", "t", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public final class FocusModifier extends y0 implements androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<FocusModifier>, c1, x0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final yh.l<FocusModifier, b2> f13497u = new yh.l<FocusModifier, b2>() { // from class: androidx.compose.ui.focus.FocusModifier$Companion$RefreshFocusProperties$1
        public final void a(@dl.d FocusModifier focusModifier) {
            f0.p(focusModifier, "focusModifier");
            FocusPropertiesKt.d(focusModifier);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(FocusModifier focusModifier) {
            a(focusModifier);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private FocusModifier parent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<FocusModifier> children;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusStateImpl focusState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private FocusModifier focusedChild;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private e focusEventListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private f1.a<RotaryScrollEvent> f13503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.modifier.n modifierLocalReadScope;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.b beyondBoundsLayoutParent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private q focusPropertiesModifier;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p focusProperties;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private u focusRequester;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private NodeCoordinator coordinator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean focusRequestedOnPlaced;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.input.key.e keyInputModifier;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<androidx.compose.ui.input.key.e> keyInputChildren;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusModifier$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier$a;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusModifier;", "Lkotlin/b2;", "RefreshFocusProperties", "Lyh/l;", ak.av, "()Lyh/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final yh.l<FocusModifier, b2> a() {
            return FocusModifier.f13497u;
        }
    }

    /* JADX INFO: compiled from: FocusModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13514a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13514a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusModifier(@dl.d FocusStateImpl initialFocus, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        f0.p(initialFocus, "initialFocus");
        f0.p(inspectorInfo, "inspectorInfo");
        this.children = new androidx.compose.runtime.collection.e<>(new FocusModifier[16], 0);
        this.focusState = initialFocus;
        this.focusProperties = new FocusPropertiesImpl();
        this.keyInputChildren = new androidx.compose.runtime.collection.e<>(new androidx.compose.ui.input.key.e[16], 0);
    }

    public /* synthetic */ FocusModifier(FocusStateImpl focusStateImpl, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(focusStateImpl, (i10 & 2) != 0 ? InspectableValueKt.b() : lVar);
    }

    private static /* synthetic */ void F() {
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<androidx.compose.ui.input.key.e> A() {
        return this.keyInputChildren;
    }

    @dl.e
    /* JADX INFO: renamed from: B, reason: from getter */
    public final androidx.compose.ui.input.key.e getKeyInputModifier() {
        return this.keyInputModifier;
    }

    @dl.d
    public final androidx.compose.ui.modifier.n C() {
        androidx.compose.ui.modifier.n nVar = this.modifierLocalReadScope;
        if (nVar != null) {
            return nVar;
        }
        f0.S("modifierLocalReadScope");
        return null;
    }

    @dl.e
    /* JADX INFO: renamed from: E, reason: from getter */
    public final FocusModifier getParent() {
        return this.parent;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public FocusModifier getValue() {
        return this;
    }

    @androidx.compose.ui.g
    public final boolean H(@dl.d RotaryScrollEvent event) {
        f0.p(event, "event");
        f1.a<RotaryScrollEvent> aVar = this.f13503j;
        if (aVar != null) {
            return aVar.f(event);
        }
        return false;
    }

    public final void I(@dl.e androidx.compose.ui.layout.b bVar) {
        this.beyondBoundsLayoutParent = bVar;
    }

    public final void J(@dl.e NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    public final void K(@dl.e e eVar) {
        this.focusEventListener = eVar;
    }

    public final void M(@dl.e q qVar) {
        this.focusPropertiesModifier = qVar;
    }

    public final void N(boolean z10) {
        this.focusRequestedOnPlaced = z10;
    }

    public final void O(@dl.e u uVar) {
        this.focusRequester = uVar;
    }

    public final void P(@dl.d FocusStateImpl value) {
        f0.p(value, "value");
        this.focusState = value;
        FocusTransactionsKt.m(this);
    }

    public final void Q(@dl.e FocusModifier focusModifier) {
        this.focusedChild = focusModifier;
    }

    public final void R(@dl.d androidx.compose.ui.modifier.n nVar) {
        f0.p(nVar, "<set-?>");
        this.modifierLocalReadScope = nVar;
    }

    public final void S(@dl.e FocusModifier focusModifier) {
        this.parent = focusModifier;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.layout.b getBeyondBoundsLayoutParent() {
        return this.beyondBoundsLayoutParent;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<FocusModifier> getKey() {
        return FocusModifierKt.d();
    }

    @Override // androidx.compose.ui.node.c1
    public boolean isValid() {
        return this.parent != null;
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<FocusModifier> m() {
        return this.children;
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @dl.e
    /* JADX INFO: renamed from: o, reason: from getter */
    public final e getFocusEventListener() {
        return this.focusEventListener;
    }

    @Override // androidx.compose.ui.layout.x0
    public void p(@dl.d androidx.compose.ui.layout.q coordinates) {
        f0.p(coordinates, "coordinates");
        boolean z10 = this.coordinator == null;
        this.coordinator = (NodeCoordinator) coordinates;
        if (z10) {
            FocusPropertiesKt.d(this);
        }
        if (this.focusRequestedOnPlaced) {
            this.focusRequestedOnPlaced = false;
            FocusTransactionsKt.j(this);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final p getFocusProperties() {
        return this.focusProperties;
    }

    @dl.e
    /* JADX INFO: renamed from: r, reason: from getter */
    public final q getFocusPropertiesModifier() {
        return this.focusPropertiesModifier;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getFocusRequestedOnPlaced() {
        return this.focusRequestedOnPlaced;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.e
    /* JADX INFO: renamed from: u, reason: from getter */
    public final u getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        androidx.compose.runtime.collection.e<FocusModifier> eVar;
        androidx.compose.runtime.collection.e<FocusModifier> eVar2;
        NodeCoordinator nodeCoordinator;
        LayoutNode layoutNode;
        b1 owner;
        g focusManager;
        f0.p(scope, "scope");
        R(scope);
        FocusModifier focusModifier = (FocusModifier) scope.a(FocusModifierKt.d());
        if (!f0.g(focusModifier, this.parent)) {
            if (focusModifier == null) {
                int i10 = b.f13514a[this.focusState.ordinal()];
                if ((i10 == 1 || i10 == 2) && (nodeCoordinator = this.coordinator) != null && (layoutNode = nodeCoordinator.getLayoutNode()) != null && (owner = layoutNode.getOwner()) != null && (focusManager = owner.getFocusManager()) != null) {
                    focusManager.b(true);
                }
            }
            FocusModifier focusModifier2 = this.parent;
            if (focusModifier2 != null && (eVar2 = focusModifier2.children) != null) {
                eVar2.c0(this);
            }
            if (focusModifier != null && (eVar = focusModifier.children) != null) {
                eVar.b(this);
            }
        }
        this.parent = focusModifier;
        e eVar3 = (e) scope.a(FocusEventModifierKt.a());
        if (!f0.g(eVar3, this.focusEventListener)) {
            e eVar4 = this.focusEventListener;
            if (eVar4 != null) {
                eVar4.m(this);
            }
            if (eVar3 != null) {
                eVar3.a(this);
            }
        }
        this.focusEventListener = eVar3;
        u uVar = (u) scope.a(FocusRequesterModifierKt.b());
        if (!f0.g(uVar, this.focusRequester)) {
            u uVar2 = this.focusRequester;
            if (uVar2 != null) {
                uVar2.f(this);
            }
            if (uVar != null) {
                uVar.a(this);
            }
        }
        this.focusRequester = uVar;
        this.f13503j = (f1.a) scope.a(RotaryInputModifierKt.b());
        this.beyondBoundsLayoutParent = (androidx.compose.ui.layout.b) scope.a(BeyondBoundsLayoutKt.a());
        this.keyInputModifier = (androidx.compose.ui.input.key.e) scope.a(KeyInputModifierKt.a());
        this.focusPropertiesModifier = (q) scope.a(FocusPropertiesKt.c());
        FocusPropertiesKt.d(this);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }

    @dl.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public final FocusStateImpl getFocusState() {
        return this.focusState;
    }

    @dl.e
    /* JADX INFO: renamed from: z, reason: from getter */
    public final FocusModifier getFocusedChild() {
        return this.focusedChild;
    }
}
