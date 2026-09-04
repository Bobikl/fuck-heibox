package androidx.compose.ui.text.font;

import androidx.compose.runtime.m2;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w {
    public static /* synthetic */ m2 a(v.b bVar, v vVar, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if ((i12 & 1) != 0) {
            vVar = null;
        }
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i12 & 4) != 0) {
            i10 = g0.INSTANCE.b();
        }
        if ((i12 & 8) != 0) {
            i11 = h0.INSTANCE.a();
        }
        return bVar.b(vVar, fontWeight, i10, i11);
    }
}
