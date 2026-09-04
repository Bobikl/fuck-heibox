package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/w;", "", "", "width", "height", "Landroidx/compose/ui/graphics/z0;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroid/graphics/Bitmap;", ak.aF, "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/Bitmap;", ak.av, "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/colorspace/c;", "Landroid/graphics/ColorSpace;", "d", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroid/graphics/ColorSpace;", "b", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/c;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w f14405a = new w();

    private w() {
    }

    @androidx.annotation.u
    @dl.d
    @xh.m
    public static final androidx.compose.ui.graphics.colorspace.c a(@dl.d Bitmap bitmap) {
        androidx.compose.ui.graphics.colorspace.c cVarB;
        kotlin.jvm.internal.f0.p(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (cVarB = b(colorSpace)) == null) ? ColorSpaces.f13697a.t() : cVarB;
    }

    @androidx.annotation.u
    @dl.d
    @xh.m
    public static final androidx.compose.ui.graphics.colorspace.c b(@dl.d ColorSpace colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "<this>");
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            return ColorSpaces.f13697a.t();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            return ColorSpaces.f13697a.a();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return ColorSpaces.f13697a.b();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return ColorSpaces.f13697a.c();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            return ColorSpaces.f13697a.d();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            return ColorSpaces.f13697a.e();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return ColorSpaces.f13697a.f();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return ColorSpaces.f13697a.g();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return ColorSpaces.f13697a.j();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return ColorSpaces.f13697a.k();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return ColorSpaces.f13697a.l();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return ColorSpaces.f13697a.m();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return ColorSpaces.f13697a.n();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return ColorSpaces.f13697a.o();
        }
        if (kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return ColorSpaces.f13697a.r();
        }
        return kotlin.jvm.internal.f0.g(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? ColorSpaces.f13697a.s() : ColorSpaces.f13697a.t();
    }

    @androidx.annotation.u
    @dl.d
    @xh.m
    public static final Bitmap c(int width, int height, int bitmapConfig, boolean hasAlpha, @dl.d androidx.compose.ui.graphics.colorspace.c colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, f.d(bitmapConfig), hasAlpha, d(colorSpace));
        kotlin.jvm.internal.f0.o(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    @androidx.annotation.u
    @dl.d
    @xh.m
    public static final ColorSpace d(@dl.d androidx.compose.ui.graphics.colorspace.c cVar) {
        ColorSpace.Named named;
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.f13697a;
        if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.t())) {
            named = ColorSpace.Named.SRGB;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.a())) {
            named = ColorSpace.Named.ACES;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.b())) {
            named = ColorSpace.Named.ACESCG;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.c())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.d())) {
            named = ColorSpace.Named.BT2020;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.e())) {
            named = ColorSpace.Named.BT709;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.f())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.g())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.j())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.k())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.l())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.m())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.n())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.o())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (kotlin.jvm.internal.f0.g(cVar, colorSpaces.r())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = kotlin.jvm.internal.f0.g(cVar, colorSpaces.s()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        ColorSpace colorSpace = ColorSpace.get(named);
        kotlin.jvm.internal.f0.o(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
