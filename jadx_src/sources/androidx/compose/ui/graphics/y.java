package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidColorFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/y;", "", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/x;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", ak.av, "(JI)Landroid/graphics/BlendModeColorFilter;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final y f14435a = new y();

    private y() {
    }

    @androidx.annotation.u
    @dl.d
    public final BlendModeColorFilter a(long color, int blendMode) {
        return new BlendModeColorFilter(n0.s(color), a.b(blendMode));
    }
}
