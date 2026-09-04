package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.p0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"", androidx.constraintlayout.core.motion.utils.w.c.R, "lastOffset", "", "isStartHandle", "previousHandlesCrossed", "Landroidx/compose/ui/text/o0;", ak.av, "(IIZZ)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    public static final long a(int i10, int i11, boolean z10, boolean z11) {
        if (i11 == 0) {
            return p0.b(i10, i10);
        }
        if (i10 == 0) {
            return z10 ? p0.b(1, 0) : p0.b(0, 1);
        }
        if (i10 == i11) {
            return z10 ? p0.b(i11 - 1, i11) : p0.b(i11, i11 - 1);
        }
        if (z10) {
            return !z11 ? p0.b(i10 - 1, i10) : p0.b(i10 + 1, i10);
        }
        return !z11 ? p0.b(i10, i10 + 1) : p0.b(i10, i10 - 1);
    }
}
