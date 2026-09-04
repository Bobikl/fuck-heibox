package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidVertexMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/q2;", "Landroid/graphics/Canvas$VertexMode;", ak.av, "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class t {
    @dl.d
    public static final Canvas.VertexMode a(int i10) {
        q2.Companion companion = q2.INSTANCE;
        if (q2.g(i10, companion.c())) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if (q2.g(i10, companion.b())) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        return q2.g(i10, companion.a()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
