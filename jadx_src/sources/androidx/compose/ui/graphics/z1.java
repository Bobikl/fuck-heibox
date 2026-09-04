package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderEffect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/m2;", "edgeTreatment", "Landroidx/compose/ui/graphics/z;", ak.av, "(FFI)Landroidx/compose/ui/graphics/z;", com.max.mediaselector.lib.config.b.f75077e, com.max.mediaselector.lib.config.b.f75078f, "Landroidx/compose/ui/graphics/e1;", ak.aF, "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class z1 {
    @androidx.compose.runtime.j2
    @dl.d
    public static final BlurEffect a(float f10, float f11, int i10) {
        return new BlurEffect(null, f10, f11, i10, null);
    }

    public static /* synthetic */ BlurEffect b(float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = m2.INSTANCE.a();
        }
        return a(f10, f11, i10);
    }

    @androidx.compose.runtime.j2
    @dl.d
    public static final OffsetEffect c(float f10, float f11) {
        return new OffsetEffect(null, b1.g.a(f10, f11), null);
    }
}
