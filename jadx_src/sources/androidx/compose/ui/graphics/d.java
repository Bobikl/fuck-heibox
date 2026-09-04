package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidColorFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a%\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011*\f\b\u0000\u0010\u0012\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/m0;", "Landroid/graphics/ColorFilter;", "d", "e", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/x;", "blendMode", ak.aF, "(JI)Landroidx/compose/ui/graphics/m0;", "Landroidx/compose/ui/graphics/o0;", "colorMatrix", ak.av, "([F)Landroidx/compose/ui/graphics/m0;", "multiply", "add", "b", "(JJ)Landroidx/compose/ui/graphics/m0;", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @dl.d
    public static final m0 a(@dl.d float[] colorMatrix) {
        kotlin.jvm.internal.f0.p(colorMatrix, "colorMatrix");
        return new m0(new ColorMatrixColorFilter(colorMatrix));
    }

    @dl.d
    public static final m0 b(long j10, long j11) {
        return new m0(new LightingColorFilter(n0.s(j10), n0.s(j11)));
    }

    @dl.d
    public static final m0 c(long j10, int i10) {
        return new m0(Build.VERSION.SDK_INT >= 29 ? y.f14435a.a(j10, i10) : new PorterDuffColorFilter(n0.s(j10), a.c(i10)));
    }

    @dl.d
    public static final ColorFilter d(@dl.d m0 m0Var) {
        kotlin.jvm.internal.f0.p(m0Var, "<this>");
        return m0Var.getNativeColorFilter();
    }

    @dl.d
    public static final m0 e(@dl.d ColorFilter colorFilter) {
        kotlin.jvm.internal.f0.p(colorFilter, "<this>");
        return new m0(colorFilter);
    }
}
