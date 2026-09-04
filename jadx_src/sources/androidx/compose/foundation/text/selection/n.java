package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.text.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000\u001a%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000\u001a!\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/selection/j;", "lhs", "rhs", "e", "Landroidx/compose/foundation/text/selection/SelectionManager;", "manager", "Ls1/r;", "magnifierSize", "Lb1/f;", ak.av, "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "Landroidx/compose/foundation/text/selection/i;", "selectable", "selection", "Landroidx/compose/ui/text/d;", "d", "Landroidx/compose/ui/layout/q;", "Lb1/i;", "f", androidx.constraintlayout.core.motion.utils.w.c.R, "", ak.aF, "(Lb1/i;J)Z", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8374a;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.SelectionStart.ordinal()] = 1;
            iArr[Handle.SelectionEnd.ordinal()] = 2;
            iArr[Handle.Cursor.ordinal()] = 3;
            f8374a = iArr;
        }
    }

    public static final long a(@dl.d SelectionManager manager, long j10) {
        f0.p(manager, "manager");
        Selection selectionF = manager.F();
        if (selectionF == null) {
            return b1.f.f30364b.c();
        }
        Handle handleX = manager.x();
        int i10 = handleX == null ? -1 : a.f8374a[handleX.ordinal()];
        if (i10 == -1) {
            return b1.f.f30364b.c();
        }
        if (i10 == 1) {
            return b(manager, j10, selectionF.h(), true);
        }
        if (i10 == 2) {
            return b(manager, j10, selectionF.f(), false);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    private static final long b(SelectionManager selectionManager, long j10, Selection.AnchorInfo anchorInfo, boolean z10) {
        androidx.compose.ui.layout.q qVarS;
        androidx.compose.ui.layout.q qVarD;
        i iVarQ = selectionManager.q(anchorInfo);
        if (iVarQ != null && (qVarS = selectionManager.getContainerLayoutCoordinates()) != null && (qVarD = iVarQ.d()) != null) {
            int iG = anchorInfo.g();
            if (!z10) {
                iG--;
            }
            b1.f fVarU = selectionManager.u();
            f0.m(fVarU);
            float fP = b1.f.p(qVarD.a0(qVarS, fVarU.getF30368a()));
            long jH = iVarQ.h(iG);
            b1.i iVarC = iVarQ.c(o0.l(jH));
            b1.i iVarC2 = iVarQ.c(fi.u.u(o0.k(jH) - 1, o0.l(jH)));
            float fH = fi.u.H(fP, Math.min(iVarC.t(), iVarC2.t()), Math.max(iVarC.x(), iVarC2.x()));
            return Math.abs(fP - fH) > ((float) (s1.r.m(j10) / 2)) ? b1.f.f30364b.c() : qVarS.a0(qVarD, b1.g.a(fH, b1.f.r(iVarQ.c(iG).o())));
        }
        return b1.f.f30364b.c();
    }

    public static final boolean c(@dl.d b1.i containsInclusive, long j10) {
        f0.p(containsInclusive, "$this$containsInclusive");
        float fT = containsInclusive.t();
        float fX = containsInclusive.x();
        float fP = b1.f.p(j10);
        if (fT <= fP && fP <= fX) {
            float f30372b = containsInclusive.getF30372b();
            float fJ = containsInclusive.j();
            float fR = b1.f.r(j10);
            if (f30372b <= fR && fR <= fJ) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final androidx.compose.ui.text.d d(@dl.d i selectable, @dl.d Selection selection) {
        f0.p(selectable, "selectable");
        f0.p(selection, "selection");
        androidx.compose.ui.text.d text = selectable.getText();
        if (selectable.getSelectableId() != selection.h().h() && selectable.getSelectableId() != selection.f().h()) {
            return text;
        }
        if (selectable.getSelectableId() == selection.h().h() && selectable.getSelectableId() == selection.f().h()) {
            return selection.g() ? text.subSequence(selection.f().g(), selection.h().g()) : text.subSequence(selection.h().g(), selection.f().g());
        }
        if (selectable.getSelectableId() == selection.h().h()) {
            return selection.g() ? text.subSequence(0, selection.h().g()) : text.subSequence(selection.h().g(), text.length());
        }
        return selection.g() ? text.subSequence(selection.f().g(), text.length()) : text.subSequence(0, selection.f().g());
    }

    @dl.e
    public static final Selection e(@dl.e Selection selection, @dl.e Selection selection2) {
        Selection selectionI;
        return (selection == null || (selectionI = selection.i(selection2)) == null) ? selection2 : selectionI;
    }

    @dl.d
    public static final b1.i f(@dl.d androidx.compose.ui.layout.q qVar) {
        f0.p(qVar, "<this>");
        b1.i iVarC = androidx.compose.ui.layout.r.c(qVar);
        return b1.j.a(qVar.i0(iVarC.E()), qVar.i0(iVarC.n()));
    }
}
