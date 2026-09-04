package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0001\u001a!\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001aH\u0001ø\u0001\u0001\u001a3\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001aH\u0001ø\u0001\u0001\u001a)\u0010#\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002ø\u0001\u0001*\n\u0010$\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lb1/f;", "from", "to", "", "Landroidx/compose/ui/graphics/l0;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/m2;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", com.google.android.exoplayer2.text.ttml.d.f49794m0, "radius", ak.aF, "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "d", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/y0;", "image", "tileModeX", "tileModeY", ak.av, "(Landroidx/compose/ui/graphics/y0;II)Landroid/graphics/Shader;", "", "e", "numTransparentColors", "", "f", "stops", "", "g", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "Shader", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class r {
    @dl.d
    public static final Shader a(@dl.d y0 image, int i10, int i11) {
        kotlin.jvm.internal.f0.p(image, "image");
        return new BitmapShader(f.b(image), s.b(i10), s.b(i11));
    }

    @dl.d
    public static final Shader b(long j10, long j11, @dl.d List<l0> colors, @dl.e List<Float> list, int i10) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        h(colors, list);
        int iE = e(colors);
        return new LinearGradient(b1.f.p(j10), b1.f.r(j10), b1.f.p(j11), b1.f.r(j11), f(colors, iE), g(list, colors, iE), s.b(i10));
    }

    @dl.d
    public static final Shader c(long j10, float f10, @dl.d List<l0> colors, @dl.e List<Float> list, int i10) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        h(colors, list);
        int iE = e(colors);
        return new RadialGradient(b1.f.p(j10), b1.f.r(j10), f10, f(colors, iE), g(list, colors, iE), s.b(i10));
    }

    @dl.d
    public static final Shader d(long j10, @dl.d List<l0> colors, @dl.e List<Float> list) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        h(colors, list);
        int iE = e(colors);
        return new SweepGradient(b1.f.p(j10), b1.f.r(j10), f(colors, iE), g(list, colors, iE));
    }

    @androidx.annotation.j1
    public static final int e(@dl.d List<l0> colors) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iG = CollectionsKt__CollectionsKt.G(colors);
        int i10 = 0;
        for (int i11 = 1; i11 < iG; i11++) {
            if (l0.A(colors.get(i11).M()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    @androidx.annotation.j1
    @dl.d
    public static final int[] f(@dl.d List<l0> colors, int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = n0.s(colors.get(i12).M());
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i10];
        int iG = CollectionsKt__CollectionsKt.G(colors);
        int size2 = colors.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            long jM = colors.get(i14).M();
            if (l0.A(jM) == 0.0f) {
                if (i14 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = n0.s(l0.w(colors.get(1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i14 == iG) {
                    i11 = i13 + 1;
                    iArr2[i13] = n0.s(l0.w(colors.get(i14 - 1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i15 = i13 + 1;
                    iArr2[i13] = n0.s(l0.w(colors.get(i14 - 1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 = i15 + 1;
                    iArr2[i15] = n0.s(l0.w(colors.get(i14 + 1).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = n0.s(jM);
                i13++;
            }
        }
        return iArr2;
    }

    @androidx.annotation.j1
    @dl.e
    public static final float[] g(@dl.e List<Float> list, @dl.d List<l0> colors, int i10) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        if (i10 == 0) {
            if (list != null) {
                return CollectionsKt___CollectionsKt.N5(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iG = CollectionsKt__CollectionsKt.G(colors);
        int i11 = 1;
        for (int i12 = 1; i12 < iG; i12++) {
            long jM = colors.get(i12).M();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / CollectionsKt__CollectionsKt.G(colors);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (l0.A(jM) == 0.0f) {
                i11 = i13 + 1;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(CollectionsKt__CollectionsKt.G(colors)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void h(List<l0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
