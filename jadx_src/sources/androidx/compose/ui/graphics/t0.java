package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/s0;", "x", "y", "b", "(SS)S", ak.av, "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class t0 {
    public static final short a(short s10, short s11) {
        if (s0.K(s10) || s0.K(s11)) {
            return s0.INSTANCE.i();
        }
        return s0.o(s10, s11) >= 0 ? s10 : s11;
    }

    public static final short b(short s10, short s11) {
        if (s0.K(s10) || s0.K(s11)) {
            return s0.INSTANCE.i();
        }
        return s0.o(s10, s11) <= 0 ? s10 : s11;
    }
}
