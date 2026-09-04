package androidx.compose.ui.focus;

import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0006\u0010\r\u001a\u00020\u0007J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/focus/FocusManagerImpl;", "Landroidx/compose/ui/focus/g;", "Landroidx/compose/ui/focus/b;", "focusDirection", "", "j", "(I)Z", "Lkotlin/b2;", "i", "g", "force", "b", ak.av, ak.aF, "Landroidx/compose/ui/focus/FocusModifier;", "d", "()Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "Landroidx/compose/ui/n;", "Landroidx/compose/ui/n;", "f", "()Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "e", "()Landroidx/compose/ui/unit/LayoutDirection;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "<init>", "(Landroidx/compose/ui/focus/FocusModifier;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class FocusManagerImpl implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final FocusModifier focusModifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n modifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layoutDirection;

    /* JADX INFO: compiled from: FocusManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13494a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13494a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusManagerImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public FocusManagerImpl(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "focusModifier");
        this.focusModifier = focusModifier;
        this.modifier = FocusModifierKt.c(androidx.compose.ui.n.INSTANCE, focusModifier);
    }

    public /* synthetic */ FocusManagerImpl(FocusModifier focusModifier, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new FocusModifier(FocusStateImpl.Inactive, null, 2, null) : focusModifier);
    }

    private final boolean j(int focusDirection) {
        if (this.focusModifier.getFocusState().getHasFocus() && !this.focusModifier.getFocusState().isFocused()) {
            b.Companion companion = b.INSTANCE;
            if (b.n(focusDirection, companion.i()) ? true : b.n(focusDirection, companion.l())) {
                b(false);
                if (this.focusModifier.getFocusState().isFocused()) {
                    return a(focusDirection);
                }
                return false;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.g
    public boolean a(int focusDirection) {
        final FocusModifier focusModifierB = w.b(this.focusModifier);
        if (focusModifierB == null) {
            return false;
        }
        FocusRequester focusRequesterA = l.a(focusModifierB, focusDirection, e());
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (f0.g(focusRequesterA, companion.b())) {
            return false;
        }
        if (!f0.g(focusRequesterA, companion.d())) {
            focusRequesterA.g();
        } else if (!w.f(this.focusModifier, focusDirection, e(), new yh.l<FocusModifier, Boolean>() { // from class: androidx.compose.ui.focus.FocusManagerImpl$moveFocus$foundNextItem$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d FocusModifier destination) {
                f0.p(destination, "destination");
                if (f0.g(destination, focusModifierB)) {
                    return Boolean.FALSE;
                }
                if (destination.getParent() == null) {
                    throw new IllegalStateException("Focus search landed at the root.".toString());
                }
                FocusTransactionsKt.j(destination);
                return Boolean.TRUE;
            }
        }) && !j(focusDirection)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.g
    public void b(boolean z10) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusState = this.focusModifier.getFocusState();
        if (FocusTransactionsKt.d(this.focusModifier, z10)) {
            FocusModifier focusModifier = this.focusModifier;
            switch (a.f13494a[focusState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier.P(focusStateImpl);
        }
    }

    public final void c() {
        h.d(this.focusModifier);
    }

    @dl.e
    public final FocusModifier d() {
        return h.c(this.focusModifier);
    }

    @dl.d
    public final LayoutDirection e() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        f0.S("layoutDirection");
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.ui.n getModifier() {
        return this.modifier;
    }

    public final void g() {
        FocusTransactionsKt.d(this.focusModifier, true);
    }

    public final void h(@dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void i() {
        if (this.focusModifier.getFocusState() == FocusStateImpl.Inactive) {
            this.focusModifier.P(FocusStateImpl.Active);
        }
    }
}
