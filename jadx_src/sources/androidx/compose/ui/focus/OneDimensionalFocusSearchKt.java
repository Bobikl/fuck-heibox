package androidx.compose.ui.focus;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a=\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a \u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0004*\u00020\u0000H\u0002\u001aG\u0010\u0016\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u0018\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", "onFound", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/focus/FocusModifier;ILyh/l;)Z", "e", "b", "focusedItem", "f", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILyh/l;)Z", "k", "j", "i", "g", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/collection/e;", ChannelListActivity.q.f79586f, "Lkotlin/b2;", "action", ak.aF, "(Landroidx/compose/runtime/collection/e;Ljava/lang/Object;Lyh/l;)V", "d", "", ak.av, "Ljava/lang/String;", "InvalidFocusDirection", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class OneDimensionalFocusSearchKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f13558a = "This function should only be used for 1-D focus search";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f13559b = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13560a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13560a = iArr;
        }
    }

    private static final boolean b(FocusModifier focusModifier, yh.l<? super FocusModifier, Boolean> lVar) {
        FocusStateImpl focusState = focusModifier.getFocusState();
        int[] iArr = a.f13560a;
        switch (iArr[focusState.ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild == null) {
                    throw new IllegalStateException(f13559b.toString());
                }
                switch (iArr[focusedChild.getFocusState().ordinal()]) {
                    case 1:
                        if (!b(focusedChild, lVar) && !lVar.invoke(focusedChild).booleanValue()) {
                            return false;
                        }
                        break;
                    case 2:
                        if (!b(focusedChild, lVar) && !f(focusModifier, focusedChild, b.INSTANCE.l(), lVar)) {
                            return false;
                        }
                        break;
                    case 3:
                    case 4:
                        return f(focusModifier, focusedChild, b.INSTANCE.l(), lVar);
                    case 5:
                    case 6:
                        throw new IllegalStateException(f13559b.toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 3:
            case 4:
            case 5:
                return i(focusModifier, lVar);
            case 6:
                if (!i(focusModifier, lVar) && !lVar.invoke(focusModifier).booleanValue()) {
                    return false;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    private static final <T> void c(androidx.compose.runtime.collection.e<T> eVar, T t10, yh.l<? super T, b2> lVar) {
        boolean z10 = false;
        fi.l lVar2 = new fi.l(0, eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
        int iH = lVar2.h();
        int i10 = lVar2.i();
        if (iH > i10) {
            return;
        }
        while (true) {
            if (z10) {
                lVar.invoke(eVar.G()[iH]);
            }
            if (f0.g(eVar.G()[iH], t10)) {
                z10 = true;
            }
            if (iH == i10) {
                return;
            } else {
                iH++;
            }
        }
    }

    private static final <T> void d(androidx.compose.runtime.collection.e<T> eVar, T t10, yh.l<? super T, b2> lVar) {
        boolean z10 = false;
        fi.l lVar2 = new fi.l(0, eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
        int iH = lVar2.h();
        int i10 = lVar2.i();
        if (iH > i10) {
            return;
        }
        while (true) {
            if (z10) {
                lVar.invoke(eVar.G()[i10]);
            }
            if (f0.g(eVar.G()[i10], t10)) {
                z10 = true;
            }
            if (i10 == iH) {
                return;
            } else {
                i10--;
            }
        }
    }

    private static final boolean e(FocusModifier focusModifier, yh.l<? super FocusModifier, Boolean> lVar) {
        switch (a.f13560a[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild != null) {
                    return e(focusedChild, lVar) || f(focusModifier, focusedChild, b.INSTANCE.i(), lVar);
                }
                throw new IllegalStateException(f13559b.toString());
            case 3:
            case 4:
            case 5:
                return j(focusModifier, lVar);
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean f(final FocusModifier focusModifier, final FocusModifier focusModifier2, final int i10, final yh.l<? super FocusModifier, Boolean> lVar) {
        if (k(focusModifier, focusModifier2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusModifier, i10, new yh.l<androidx.compose.ui.layout.b.a, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
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
                Boolean boolValueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.k(focusModifier, focusModifier2, i10, lVar));
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

    private static final boolean g(FocusModifier focusModifier) {
        return focusModifier.getParent() == null;
    }

    public static final boolean h(@dl.d FocusModifier oneDimensionalFocusSearch, int i10, @dl.d yh.l<? super FocusModifier, Boolean> onFound) {
        f0.p(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        f0.p(onFound, "onFound");
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.i())) {
            return e(oneDimensionalFocusSearch, onFound);
        }
        if (b.n(i10, companion.l())) {
            return b(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException(f13558a.toString());
    }

    private static final boolean i(FocusModifier focusModifier, yh.l<? super FocusModifier, Boolean> lVar) {
        focusModifier.m().n0(x.f13605b);
        androidx.compose.runtime.collection.e<FocusModifier> eVarM = focusModifier.m();
        int i10 = eVarM.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 <= 0) {
            return false;
        }
        int i11 = i10 - 1;
        FocusModifier[] focusModifierArrG = eVarM.G();
        f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        do {
            FocusModifier focusModifier2 = focusModifierArrG[i11];
            if (w.g(focusModifier2) && b(focusModifier2, lVar)) {
                return true;
            }
            i11--;
        } while (i11 >= 0);
        return false;
    }

    private static final boolean j(FocusModifier focusModifier, yh.l<? super FocusModifier, Boolean> lVar) {
        focusModifier.m().n0(x.f13605b);
        androidx.compose.runtime.collection.e<FocusModifier> eVarM = focusModifier.m();
        int i10 = eVarM.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            FocusModifier[] focusModifierArrG = eVarM.G();
            f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                FocusModifier focusModifier2 = focusModifierArrG[i11];
                if (w.g(focusModifier2) && e(focusModifier2, lVar)) {
                    return true;
                }
                i11++;
            } while (i11 < i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, yh.l<? super FocusModifier, Boolean> lVar) {
        if (!(focusModifier.getFocusState() == FocusStateImpl.ActiveParent || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        focusModifier.m().n0(x.f13605b);
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.i())) {
            androidx.compose.runtime.collection.e<FocusModifier> eVarM = focusModifier.m();
            fi.l lVar2 = new fi.l(0, eVarM.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            int iH = lVar2.h();
            int i11 = lVar2.i();
            if (iH <= i11) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusModifier focusModifier3 = eVarM.G()[iH];
                        if (w.g(focusModifier3) && e(focusModifier3, lVar)) {
                            return true;
                        }
                    }
                    if (f0.g(eVarM.G()[iH], focusModifier2)) {
                        z10 = true;
                    }
                    if (iH == i11) {
                        break;
                    }
                    iH++;
                }
            }
        } else {
            if (!b.n(i10, companion.l())) {
                throw new IllegalStateException(f13558a.toString());
            }
            androidx.compose.runtime.collection.e<FocusModifier> eVarM2 = focusModifier.m();
            fi.l lVar3 = new fi.l(0, eVarM2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            int iH2 = lVar3.h();
            int i12 = lVar3.i();
            if (iH2 <= i12) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusModifier focusModifier4 = eVarM2.G()[i12];
                        if (w.g(focusModifier4) && b(focusModifier4, lVar)) {
                            return true;
                        }
                    }
                    if (f0.g(eVarM2.G()[i12], focusModifier2)) {
                        z11 = true;
                    }
                    if (i12 == iH2) {
                        break;
                    }
                    i12--;
                }
            }
        }
        if (b.n(i10, b.INSTANCE.i()) || focusModifier.getFocusState() == FocusStateImpl.DeactivatedParent || g(focusModifier)) {
            return false;
        }
        return lVar.invoke(focusModifier).booleanValue();
    }
}
