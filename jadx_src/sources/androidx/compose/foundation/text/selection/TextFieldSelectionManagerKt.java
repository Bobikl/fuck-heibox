package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a%\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/b2;", ak.av, "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/p;I)V", ak.aF, "Ls1/r;", "magnifierSize", "Lb1/f;", "b", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldSelectionManagerKt {

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8314a;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.Cursor.ordinal()] = 1;
            iArr[Handle.SelectionStart.ordinal()] = 2;
            iArr[Handle.SelectionEnd.ordinal()] = 3;
            f8314a = iArr;
        }
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(final boolean z10, @dl.d final ResolvedTextDirection direction, @dl.d final TextFieldSelectionManager manager, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        f0.p(direction, "direction");
        f0.p(manager, "manager");
        androidx.compose.runtime.p pVarF = pVar.F(-1344558920);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1344558920, i10, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:806)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        pVarF.T(511388516);
        boolean zS = pVarF.s(boolValueOf) | pVarF.s(manager);
        Object objU = pVarF.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = manager.M(z10);
            pVarF.N(objU);
        }
        pVarF.c0();
        androidx.compose.foundation.text.r rVar = (androidx.compose.foundation.text.r) objU;
        long jB = manager.B(z10);
        boolean zM = o0.m(manager.K().getSelection());
        androidx.compose.ui.n nVarC = SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE, rVar, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(rVar, null));
        int i11 = i10 << 3;
        AndroidSelectionHandles_androidKt.c(jB, z10, direction, zM, nVarC, null, pVarF, 196608 | (i11 & 112) | (i11 & bb.c.b.f30796me));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                TextFieldSelectionManagerKt.a(z10, direction, manager, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    public static final long b(@dl.d TextFieldSelectionManager manager, long j10) {
        int iN;
        androidx.compose.foundation.text.w wVarG;
        TextLayoutResult value;
        androidx.compose.ui.layout.q qVarF;
        androidx.compose.foundation.text.w wVarG2;
        androidx.compose.ui.layout.q innerTextFieldCoordinates;
        f0.p(manager, "manager");
        if (manager.K().i().length() == 0) {
            return b1.f.f30364b.c();
        }
        Handle handleY = manager.y();
        int i10 = handleY == null ? -1 : a.f8314a[handleY.ordinal()];
        if (i10 == -1) {
            return b1.f.f30364b.c();
        }
        if (i10 == 1 || i10 == 2) {
            iN = o0.n(manager.K().getSelection());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iN = o0.i(manager.K().getSelection());
        }
        int iJ = fi.u.J(manager.getOffsetMapping().b(iN), StringsKt__StringsKt.i3(manager.K().i()));
        TextFieldState state = manager.getState();
        if (state == null || (wVarG = state.g()) == null || (value = wVarG.getValue()) == null) {
            return b1.f.f30364b.c();
        }
        long jO = value.d(iJ).o();
        TextFieldState state2 = manager.getState();
        if (state2 == null || (qVarF = state2.getLayoutCoordinates()) == null) {
            return b1.f.f30364b.c();
        }
        TextFieldState state3 = manager.getState();
        if (state3 == null || (wVarG2 = state3.g()) == null || (innerTextFieldCoordinates = wVarG2.getInnerTextFieldCoordinates()) == null) {
            return b1.f.f30364b.c();
        }
        b1.f fVarW = manager.w();
        if (fVarW == null) {
            return b1.f.f30364b.c();
        }
        float fP = b1.f.p(innerTextFieldCoordinates.a0(qVarF, fVarW.getF30368a()));
        int iQ = value.q(iJ);
        int iU = value.u(iQ);
        int iO = value.o(iQ, true);
        boolean z10 = o0.n(manager.K().getSelection()) > o0.i(manager.K().getSelection());
        float fA = w.a(value, iU, true, z10);
        float fA2 = w.a(value, iO, false, z10);
        float fH = fi.u.H(fP, Math.min(fA, fA2), Math.max(fA, fA2));
        return Math.abs(fP - fH) > ((float) (s1.r.m(j10) / 2)) ? b1.f.f30364b.c() : qVarF.a0(innerTextFieldCoordinates, b1.g.a(fH, b1.f.r(jO)));
    }

    public static final boolean c(@dl.d TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
        androidx.compose.ui.layout.q qVarF;
        b1.i iVarF;
        f0.p(textFieldSelectionManager, "<this>");
        TextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (qVarF = state.getLayoutCoordinates()) == null || (iVarF = n.f(qVarF)) == null) {
            return false;
        }
        return n.c(iVarF, textFieldSelectionManager.B(z10));
    }
}
