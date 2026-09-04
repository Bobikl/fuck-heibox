package androidx.compose.ui.focus;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a=\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0016\u001a\f\u0010\u001b\u001a\u00020\u000e*\u00020\u000eH\u0002\u001a\f\u0010\u001c\u001a\u00020\u000e*\u00020\u000eH\u0002\u001a\f\u0010\u001d\u001a\u00020\u0000*\u00020\u0000H\u0002\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", "onFound", ak.aB, "(Landroidx/compose/ui/focus/FocusModifier;ILyh/l;)Z", "j", "focusedItem", "k", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILyh/l;)Z", "q", "Landroidx/compose/runtime/collection/e;", "Lb1/i;", "focusRect", "i", "(Landroidx/compose/runtime/collection/e;Lb1/i;I)Landroidx/compose/ui/focus/FocusModifier;", "proposedCandidate", "currentCandidate", "focusedRect", "l", "(Lb1/i;Lb1/i;Lb1/i;I)Z", "source", "rect1", "rect2", ak.aF, "r", RXScreenCaptureService.KEY_HEIGHT, "b", "", ak.av, "Ljava/lang/String;", "InvalidFocusDirection", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class TwoDimensionalFocusSearchKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f13565a = "This function should only be used for 2-D focus search";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f13566b = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13567a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13567a = iArr;
        }
    }

    private static final FocusModifier b(FocusModifier focusModifier) {
        if (!(focusModifier.getFocusState() == FocusStateImpl.ActiveParent || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        FocusModifier focusModifierB = w.b(focusModifier);
        if (focusModifierB != null) {
            return focusModifierB;
        }
        throw new IllegalStateException(f13566b.toString());
    }

    private static final boolean c(b1.i iVar, b1.i iVar2, b1.i iVar3, int i10) {
        if (d(iVar3, i10, iVar) || !d(iVar2, i10, iVar)) {
            return false;
        }
        if (e(iVar3, i10, iVar)) {
            b.Companion companion = b.INSTANCE;
            if (!b.n(i10, companion.h()) && !b.n(i10, companion.m()) && f(iVar2, i10, iVar) >= g(iVar3, i10, iVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(b1.i iVar, int i10, b1.i iVar2) {
        b.Companion companion = b.INSTANCE;
        if (!(b.n(i10, companion.h()) ? true : b.n(i10, companion.m()))) {
            if (!(b.n(i10, companion.n()) ? true : b.n(i10, companion.a()))) {
                throw new IllegalStateException(f13565a.toString());
            }
            if (iVar.x() > iVar2.t() && iVar.t() < iVar2.x()) {
                return true;
            }
        } else if (iVar.j() > iVar2.getF30372b() && iVar.getF30372b() < iVar2.j()) {
            return true;
        }
        return false;
    }

    private static final boolean e(b1.i iVar, int i10, b1.i iVar2) {
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.h())) {
            if (iVar2.t() >= iVar.x()) {
                return true;
            }
        } else if (b.n(i10, companion.m())) {
            if (iVar2.x() <= iVar.t()) {
                return true;
            }
        } else if (b.n(i10, companion.n())) {
            if (iVar2.getF30372b() >= iVar.j()) {
                return true;
            }
        } else {
            if (!b.n(i10, companion.a())) {
                throw new IllegalStateException(f13565a.toString());
            }
            if (iVar2.j() <= iVar.getF30372b()) {
                return true;
            }
        }
        return false;
    }

    private static final float f(b1.i iVar, int i10, b1.i iVar2) {
        float f30372b;
        float fJ;
        float f30372b2;
        float fJ2;
        float f10;
        b.Companion companion = b.INSTANCE;
        if (!b.n(i10, companion.h())) {
            if (b.n(i10, companion.m())) {
                f30372b = iVar.t();
                fJ = iVar2.x();
            } else if (b.n(i10, companion.n())) {
                f30372b2 = iVar2.getF30372b();
                fJ2 = iVar.j();
            } else {
                if (!b.n(i10, companion.a())) {
                    throw new IllegalStateException(f13565a.toString());
                }
                f30372b = iVar.getF30372b();
                fJ = iVar2.j();
            }
            f10 = f30372b - fJ;
            return Math.max(0.0f, f10);
        }
        f30372b2 = iVar2.t();
        fJ2 = iVar.x();
        f10 = f30372b2 - fJ2;
        return Math.max(0.0f, f10);
    }

    private static final float g(b1.i iVar, int i10, b1.i iVar2) {
        float fJ;
        float fJ2;
        float f30372b;
        float f30372b2;
        float f10;
        b.Companion companion = b.INSTANCE;
        if (!b.n(i10, companion.h())) {
            if (b.n(i10, companion.m())) {
                fJ = iVar.x();
                fJ2 = iVar2.x();
            } else if (b.n(i10, companion.n())) {
                f30372b = iVar2.getF30372b();
                f30372b2 = iVar.getF30372b();
            } else {
                if (!b.n(i10, companion.a())) {
                    throw new IllegalStateException(f13565a.toString());
                }
                fJ = iVar.j();
                fJ2 = iVar2.j();
            }
            f10 = fJ - fJ2;
            return Math.max(1.0f, f10);
        }
        f30372b = iVar2.t();
        f30372b2 = iVar.t();
        f10 = f30372b - f30372b2;
        return Math.max(1.0f, f10);
    }

    private static final b1.i h(b1.i iVar) {
        return new b1.i(iVar.x(), iVar.j(), iVar.x(), iVar.j());
    }

    private static final FocusModifier i(androidx.compose.runtime.collection.e<FocusModifier> eVar, b1.i iVar, int i10) {
        b1.i iVarR;
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.h())) {
            iVarR = iVar.R(iVar.G() + 1, 0.0f);
        } else if (b.n(i10, companion.m())) {
            iVarR = iVar.R(-(iVar.G() + 1), 0.0f);
        } else if (b.n(i10, companion.n())) {
            iVarR = iVar.R(0.0f, iVar.r() + 1);
        } else {
            if (!b.n(i10, companion.a())) {
                throw new IllegalStateException(f13565a.toString());
            }
            iVarR = iVar.R(0.0f, -(iVar.r() + 1));
        }
        FocusModifier focusModifier = null;
        int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i11 > 0) {
            int i12 = 0;
            FocusModifier[] focusModifierArrG = eVar.G();
            f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                FocusModifier focusModifier2 = focusModifierArrG[i12];
                if (w.g(focusModifier2)) {
                    b1.i iVarE = w.e(focusModifier2);
                    if (l(iVarE, iVarR, iVar, i10)) {
                        focusModifier = focusModifier2;
                        iVarR = iVarE;
                    }
                }
                i12++;
            } while (i12 < i11);
        }
        return focusModifier;
    }

    public static final boolean j(@dl.d FocusModifier findChildCorrespondingToFocusEnter, int i10, @dl.d yh.l<? super FocusModifier, Boolean> onFound) {
        b1.i iVarH;
        f0.p(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        f0.p(onFound, "onFound");
        Boolean boolF = findChildCorrespondingToFocusEnter.getFocusProperties().S().invoke(b.k(i10)).f(onFound);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        androidx.compose.runtime.collection.e<FocusModifier> eVarA = w.a(findChildCorrespondingToFocusEnter);
        if (eVarA.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() <= 1) {
            FocusModifier focusModifier = eVarA.P() ? null : eVarA.G()[0];
            if (focusModifier != null) {
                return onFound.invoke(focusModifier).booleanValue();
            }
            return false;
        }
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.b())) {
            i10 = companion.h();
        }
        if (b.n(i10, companion.m()) ? true : b.n(i10, companion.a())) {
            iVarH = r(w.e(findChildCorrespondingToFocusEnter));
        } else {
            if (!(b.n(i10, companion.h()) ? true : b.n(i10, companion.n()))) {
                throw new IllegalStateException(f13565a.toString());
            }
            iVarH = h(w.e(findChildCorrespondingToFocusEnter));
        }
        FocusModifier focusModifierI = i(eVarA, iVarH, i10);
        if (focusModifierI != null) {
            return onFound.invoke(focusModifierI).booleanValue();
        }
        return false;
    }

    private static final boolean k(final FocusModifier focusModifier, final FocusModifier focusModifier2, final int i10, final yh.l<? super FocusModifier, Boolean> lVar) {
        if (q(focusModifier, focusModifier2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusModifier, i10, new yh.l<androidx.compose.ui.layout.b.a, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d androidx.compose.ui.layout.b.a searchBeyondBounds) {
                f0.p(searchBeyondBounds, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.q(focusModifier, focusModifier2, i10, lVar));
                if (boolValueOf.booleanValue() || !searchBeyondBounds.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean l(b1.i iVar, b1.i iVar2, b1.i iVar3, int i10) {
        if (m(iVar, i10, iVar3)) {
            if (!m(iVar2, i10, iVar3) || c(iVar3, iVar, iVar2, i10)) {
                return true;
            }
            if (!c(iVar3, iVar2, iVar, i10) && p(i10, iVar3, iVar) < p(i10, iVar3, iVar2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean m(b1.i iVar, int i10, b1.i iVar2) {
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.h())) {
            if ((iVar2.x() > iVar.x() || iVar2.t() >= iVar.x()) && iVar2.t() > iVar.t()) {
                return true;
            }
        } else if (b.n(i10, companion.m())) {
            if ((iVar2.t() < iVar.t() || iVar2.x() <= iVar.t()) && iVar2.x() < iVar.x()) {
                return true;
            }
        } else if (b.n(i10, companion.n())) {
            if ((iVar2.j() > iVar.j() || iVar2.getF30372b() >= iVar.j()) && iVar2.getF30372b() > iVar.getF30372b()) {
                return true;
            }
        } else {
            if (!b.n(i10, companion.a())) {
                throw new IllegalStateException(f13565a.toString());
            }
            if ((iVar2.getF30372b() < iVar.getF30372b() || iVar2.j() <= iVar.getF30372b()) && iVar2.j() < iVar.j()) {
                return true;
            }
        }
        return false;
    }

    private static final float n(b1.i iVar, int i10, b1.i iVar2) {
        float f30372b;
        float fJ;
        float f30372b2;
        float fJ2;
        float f10;
        b.Companion companion = b.INSTANCE;
        if (!b.n(i10, companion.h())) {
            if (b.n(i10, companion.m())) {
                f30372b = iVar.t();
                fJ = iVar2.x();
            } else if (b.n(i10, companion.n())) {
                f30372b2 = iVar2.getF30372b();
                fJ2 = iVar.j();
            } else {
                if (!b.n(i10, companion.a())) {
                    throw new IllegalStateException(f13565a.toString());
                }
                f30372b = iVar.getF30372b();
                fJ = iVar2.j();
            }
            f10 = f30372b - fJ;
            return Math.max(0.0f, f10);
        }
        f30372b2 = iVar2.t();
        fJ2 = iVar.x();
        f10 = f30372b2 - fJ2;
        return Math.max(0.0f, f10);
    }

    private static final float o(b1.i iVar, int i10, b1.i iVar2) {
        float f10;
        float fT;
        float fT2;
        float fG;
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.h()) ? true : b.n(i10, companion.m())) {
            f10 = 2;
            fT = iVar2.getF30372b() + (iVar2.r() / f10);
            fT2 = iVar.getF30372b();
            fG = iVar.r();
        } else {
            if (!(b.n(i10, companion.n()) ? true : b.n(i10, companion.a()))) {
                throw new IllegalStateException(f13565a.toString());
            }
            f10 = 2;
            fT = iVar2.t() + (iVar2.G() / f10);
            fT2 = iVar.t();
            fG = iVar.G();
        }
        return fT - (fT2 + (fG / f10));
    }

    private static final long p(int i10, b1.i iVar, b1.i iVar2) {
        long jAbs = (long) Math.abs(n(iVar2, i10, iVar));
        long jAbs2 = (long) Math.abs(o(iVar2, i10, iVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, yh.l<? super FocusModifier, Boolean> lVar) {
        FocusModifier focusModifierI;
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new FocusModifier[focusModifier.m().getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()], 0);
        eVar.c(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), focusModifier.m());
        while (eVar.Q() && (focusModifierI = i(eVar, w.e(focusModifier2), i10)) != null) {
            if (!focusModifierI.getFocusState().isDeactivated()) {
                return lVar.invoke(focusModifierI).booleanValue();
            }
            Boolean boolF = focusModifierI.getFocusProperties().S().invoke(b.k(i10)).f(lVar);
            if (boolF != null) {
                return boolF.booleanValue();
            }
            if (k(focusModifierI, focusModifier2, i10, lVar)) {
                return true;
            }
            eVar.c0(focusModifierI);
        }
        return false;
    }

    private static final b1.i r(b1.i iVar) {
        return new b1.i(iVar.t(), iVar.getF30372b(), iVar.t(), iVar.getF30372b());
    }

    public static final boolean s(@dl.d FocusModifier twoDimensionalFocusSearch, int i10, @dl.d yh.l<? super FocusModifier, Boolean> onFound) {
        f0.p(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        f0.p(onFound, "onFound");
        FocusStateImpl focusState = twoDimensionalFocusSearch.getFocusState();
        int[] iArr = a.f13567a;
        switch (iArr[focusState.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = twoDimensionalFocusSearch.getFocusedChild();
                if (focusedChild == null) {
                    throw new IllegalStateException(f13566b.toString());
                }
                switch (iArr[focusedChild.getFocusState().ordinal()]) {
                    case 1:
                    case 2:
                        if (s(focusedChild, i10, onFound)) {
                            return true;
                        }
                        Boolean boolF = focusedChild.getFocusProperties().I().invoke(b.k(i10)).f(onFound);
                        return boolF != null ? boolF.booleanValue() : k(twoDimensionalFocusSearch, b(focusedChild), i10, onFound);
                    case 3:
                    case 4:
                        return k(twoDimensionalFocusSearch, focusedChild, i10, onFound);
                    case 5:
                    case 6:
                        throw new IllegalStateException(f13566b.toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
            case 4:
                return j(twoDimensionalFocusSearch, i10, onFound);
            case 5:
                return false;
            case 6:
                return onFound.invoke(twoDimensionalFocusSearch).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
