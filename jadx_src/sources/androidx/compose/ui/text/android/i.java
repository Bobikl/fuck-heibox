package androidx.compose.ui.text.android;

import android.text.Layout;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"Landroid/text/Layout;", "", androidx.constraintlayout.core.motion.utils.w.c.R, "", "upstream", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class i {
    @g
    public static final int a(@dl.d Layout layout, @androidx.annotation.f0(from = 0) int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(layout, "<this>");
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i10 && lineEnd != i10) {
            return lineForOffset;
        }
        if (lineStart == i10) {
            return z10 ? lineForOffset - 1 : lineForOffset;
        }
        return z10 ? lineForOffset : lineForOffset + 1;
    }
}
