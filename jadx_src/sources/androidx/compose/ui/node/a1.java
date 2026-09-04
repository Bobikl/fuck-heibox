package androidx.compose.ui.node;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 {
    static {
        b1.Companion companion = b1.INSTANCE;
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void a() {
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void b() {
    }

    @kotlin.k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.s0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d(b1 b1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        b1Var.b(z10);
    }

    public static /* synthetic */ void e(b1 b1Var, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        b1Var.c(layoutNode, z10, z11);
    }

    public static /* synthetic */ void f(b1 b1Var, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        b1Var.r(layoutNode, z10, z11);
    }
}
