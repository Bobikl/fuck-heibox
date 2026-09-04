package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;

/* JADX INFO: compiled from: Paragraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    public static /* synthetic */ int a(n nVar, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return nVar.k(i10, z10);
    }

    public static /* synthetic */ void b(n nVar, androidx.compose.ui.graphics.d0 d0Var, androidx.compose.ui.graphics.a0 a0Var, float f10, Shadow shadow, androidx.compose.ui.text.style.i iVar, androidx.compose.ui.graphics.drawscope.j jVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint");
        }
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        nVar.d(d0Var, a0Var, f10, (i10 & 8) != 0 ? null : shadow, (i10 & 16) != 0 ? null : iVar, (i10 & 32) != 0 ? null : jVar);
    }

    public static /* synthetic */ void c(n nVar, androidx.compose.ui.graphics.d0 d0Var, long j10, Shadow shadow, androidx.compose.ui.text.style.i iVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.graphics.l0.INSTANCE.u();
        }
        nVar.C(d0Var, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : iVar);
    }

    public static /* synthetic */ void d(n nVar, androidx.compose.ui.graphics.d0 d0Var, long j10, Shadow shadow, androidx.compose.ui.text.style.i iVar, androidx.compose.ui.graphics.drawscope.j jVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-iJQMabo");
        }
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.graphics.l0.INSTANCE.u();
        }
        nVar.w(d0Var, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : iVar, (i10 & 16) != 0 ? null : jVar);
    }
}
