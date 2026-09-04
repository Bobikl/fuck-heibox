package androidx.compose.ui.focus;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lkotlin/b2;", "d", ak.aF, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class h {

    /* JADX INFO: compiled from: FocusManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13589a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13589a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FocusModifier c(FocusModifier focusModifier) {
        FocusModifier focusModifierC;
        switch (a.f13589a[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild == null || (focusModifierC = c(focusedChild)) == null) {
                    throw new IllegalStateException("no child".toString());
                }
                return focusModifierC;
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FocusModifier focusModifier) {
        FocusPropertiesKt.d(focusModifier);
        androidx.compose.runtime.collection.e<FocusModifier> eVarM = focusModifier.m();
        int i10 = eVarM.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            FocusModifier[] focusModifierArrG = eVarM.G();
            f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                d(focusModifierArrG[i11]);
                i11++;
            } while (i11 < i10);
        }
    }
}
