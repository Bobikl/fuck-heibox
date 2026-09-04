package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a&\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000\"%\u0010\u0010\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"", "Landroidx/compose/ui/node/v0;", "other", "e", "(II)I", "Landroidx/compose/ui/n$c;", "element", ak.av, "Landroidx/compose/ui/n$d;", "node", "b", "", ak.aF, "(I)Z", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class w0 {
    public static final int a(@dl.d androidx.compose.ui.n.c element) {
        kotlin.jvm.internal.f0.p(element, "element");
        x0 x0Var = x0.f15398a;
        int iA = x0Var.a();
        if (element instanceof androidx.compose.ui.layout.w) {
            iA = e(iA, x0Var.e());
        }
        if (element instanceof androidx.compose.ui.layout.l) {
            iA = e(iA, x0Var.d());
        }
        if (element instanceof androidx.compose.ui.draw.j) {
            iA = e(iA, x0Var.b());
        }
        if (element instanceof androidx.compose.ui.semantics.l) {
            iA = e(iA, x0Var.j());
        }
        if (element instanceof androidx.compose.ui.input.pointer.g0) {
            iA = e(iA, x0Var.i());
        }
        if ((element instanceof androidx.compose.ui.modifier.e) || (element instanceof androidx.compose.ui.modifier.m) || (element instanceof androidx.compose.ui.focus.k)) {
            iA = e(iA, x0Var.g());
        }
        if (element instanceof androidx.compose.ui.layout.u0) {
            iA = e(iA, x0Var.c());
        }
        if (element instanceof androidx.compose.ui.layout.d1) {
            iA = e(iA, x0Var.h());
        }
        return ((element instanceof androidx.compose.ui.layout.x0) || (element instanceof androidx.compose.ui.layout.a1) || (element instanceof androidx.compose.ui.layout.e0)) ? e(iA, x0Var.f()) : iA;
    }

    public static final int b(@dl.d androidx.compose.ui.n.d node) {
        kotlin.jvm.internal.f0.p(node, "node");
        x0 x0Var = x0.f15398a;
        int iA = x0Var.a();
        if (node instanceof v) {
            iA = e(iA, x0Var.e());
        }
        if (node instanceof h) {
            iA = e(iA, x0Var.b());
        }
        if (node instanceof j1) {
            iA = e(iA, x0Var.j());
        }
        if (node instanceof f1) {
            iA = e(iA, x0Var.i());
        }
        if (node instanceof androidx.compose.ui.modifier.j) {
            iA = e(iA, x0Var.g());
        }
        if (node instanceof d1) {
            iA = e(iA, x0Var.h());
        }
        if (node instanceof t) {
            iA = e(iA, x0Var.f());
        }
        if (node instanceof j) {
            iA = e(iA, x0Var.c());
        }
        return node instanceof o ? e(iA, x0Var.d()) : iA;
    }

    public static final boolean c(int i10) {
        return (i10 & x0.f15398a.f()) != 0;
    }

    public static /* synthetic */ void d(int i10) {
    }

    public static final int e(int i10, int i11) {
        return i10 | i11;
    }
}
