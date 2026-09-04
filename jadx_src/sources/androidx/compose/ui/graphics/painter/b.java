package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.y0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import s1.n;
import s1.s;

/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "image", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "Landroidx/compose/ui/graphics/r0;", "filterQuality", "Landroidx/compose/ui/graphics/painter/a;", ak.av, "(Landroidx/compose/ui/graphics/y0;JJI)Landroidx/compose/ui/graphics/painter/a;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    @dl.d
    public static final BitmapPainter a(@dl.d y0 image, long j10, long j11, int i10) {
        f0.p(image, "image");
        BitmapPainter bitmapPainter = new BitmapPainter(image, j10, j11, null);
        bitmapPainter.m(i10);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(y0 y0Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = n.f139237b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = s.a(y0Var.getWidth(), y0Var.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = r0.INSTANCE.b();
        }
        return a(y0Var, j12, j13, i10);
    }
}
