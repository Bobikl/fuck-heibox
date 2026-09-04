package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: BoringLayoutConstructor33.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(33)
public class a {
    private a() {
    }

    @androidx.annotation.n0
    public static BoringLayout a(@androidx.annotation.n0 CharSequence charSequence, @androidx.annotation.n0 TextPaint textPaint, @androidx.annotation.f0(from = 0) int i10, @androidx.annotation.n0 Layout.Alignment alignment, float f10, float f11, @androidx.annotation.n0 BoringLayout.Metrics metrics, boolean z10, @androidx.annotation.p0 TextUtils.TruncateAt truncateAt, @androidx.annotation.f0(from = 0) int i11, boolean z11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }
}
