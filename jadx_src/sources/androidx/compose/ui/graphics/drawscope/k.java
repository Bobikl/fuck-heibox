package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.l1;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    public static long a(l lVar) {
        float f10 = 2;
        return b1.g.a(b1.m.t(lVar.c()) / f10, b1.m.m(lVar.c()) / f10);
    }

    public static /* synthetic */ void c(l lVar, l1 l1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = k0.INSTANCE.b();
        }
        lVar.e(l1Var, i10);
    }

    public static /* synthetic */ void d(l lVar, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = b1.m.t(lVar.c());
        }
        if ((i11 & 8) != 0) {
            f13 = b1.m.m(lVar.c());
        }
        if ((i11 & 16) != 0) {
            i10 = k0.INSTANCE.b();
        }
        lVar.a(f10, f11, f12, f13, i10);
    }

    public static /* synthetic */ void e(l lVar, float f10, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = lVar.I();
        }
        lVar.g(f10, j10);
    }

    public static /* synthetic */ void f(l lVar, float f10, float f11, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i10 & 4) != 0) {
            j10 = lVar.I();
        }
        lVar.f(f10, f11, j10);
    }

    public static /* synthetic */ void g(l lVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        lVar.b(f10, f11);
    }
}
