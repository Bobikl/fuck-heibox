package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001\u001aA\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "", "startX", "startY", "width", "height", "", "buffer", "bufferOffset", "stride", "Landroidx/compose/ui/graphics/s1;", ak.aF, "Landroidx/compose/ui/graphics/z0;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", ak.av, "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/y0;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class a1 {
    @dl.d
    public static final y0 a(int i10, int i11, int i12, boolean z10, @dl.d androidx.compose.ui.graphics.colorspace.c colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        return f.a(i10, i11, i12, z10, colorSpace);
    }

    public static /* synthetic */ y0 b(int i10, int i11, int i12, boolean z10, androidx.compose.ui.graphics.colorspace.c cVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = z0.INSTANCE.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            cVar = ColorSpaces.f13697a.t();
        }
        return a(i10, i11, i12, z10, cVar);
    }

    @dl.d
    public static final s1 c(@dl.d y0 y0Var, int i10, int i11, int i12, int i13, @dl.d int[] buffer, int i14, int i15) {
        kotlin.jvm.internal.f0.p(y0Var, "<this>");
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        y0Var.a(buffer, i10, i11, i12, i13, i14, i15);
        return new s1(buffer, i12, i13, i14, i15);
    }

    public static /* synthetic */ s1 d(y0 y0Var, int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = 0;
        }
        if ((i16 & 2) != 0) {
            i11 = 0;
        }
        if ((i16 & 4) != 0) {
            i12 = y0Var.getWidth();
        }
        if ((i16 & 8) != 0) {
            i13 = y0Var.getHeight();
        }
        if ((i16 & 16) != 0) {
            iArr = new int[i12 * i13];
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        return c(y0Var, i10, i11, i12, i13, iArr, i14, i15);
    }
}
