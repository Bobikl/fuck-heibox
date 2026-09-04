package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a=\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0001\u001a\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u0006*\u00020\u000fH\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroid/graphics/Bitmap;", "Landroidx/compose/ui/graphics/y0;", ak.aF, "", "width", "height", "Landroidx/compose/ui/graphics/z0;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", ak.av, "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/y0;", "b", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class f {
    @dl.d
    public static final y0 a(int i10, int i11, int i12, boolean z10, @dl.d androidx.compose.ui.graphics.colorspace.c colorSpace) {
        Bitmap bitmapCreateBitmap;
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        Bitmap.Config configD = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = w.c(i10, i11, i12, z10, colorSpace);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD);
            kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new e(bitmapCreateBitmap);
    }

    @dl.d
    public static final Bitmap b(@dl.d y0 y0Var) {
        kotlin.jvm.internal.f0.p(y0Var, "<this>");
        if (y0Var instanceof e) {
            return ((e) y0Var).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @dl.d
    public static final y0 c(@dl.d Bitmap bitmap) {
        kotlin.jvm.internal.f0.p(bitmap, "<this>");
        return new e(bitmap);
    }

    @dl.d
    public static final Bitmap.Config d(int i10) {
        z0.Companion companion = z0.INSTANCE;
        if (z0.i(i10, companion.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (z0.i(i10, companion.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (z0.i(i10, companion.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || !z0.i(i10, companion.c())) {
            return (i11 < 26 || !z0.i(i10, companion.d())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final int e(@dl.d Bitmap.Config config) {
        kotlin.jvm.internal.f0.p(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return z0.INSTANCE.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return z0.INSTANCE.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return z0.INSTANCE.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i10 < 26 || config != Bitmap.Config.HARDWARE) ? z0.INSTANCE.b() : z0.INSTANCE.d();
        }
        return z0.INSTANCE.c();
    }
}
