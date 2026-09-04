package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidBlendMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/x;", "", ak.av, "(I)Z", "Landroid/graphics/PorterDuff$Mode;", ak.aF, "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "b", "(I)Landroid/graphics/BlendMode;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    public static final boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 29 || x.G(i10, x.INSTANCE.B()) || c(i10) != PorterDuff.Mode.SRC_OVER;
    }

    @dl.d
    @androidx.annotation.w0(29)
    public static final BlendMode b(int i10) {
        x.Companion companion = x.INSTANCE;
        if (x.G(i10, companion.a())) {
            return BlendMode.CLEAR;
        }
        if (x.G(i10, companion.x())) {
            return BlendMode.SRC;
        }
        if (x.G(i10, companion.g())) {
            return BlendMode.DST;
        }
        if (x.G(i10, companion.B())) {
            return BlendMode.SRC_OVER;
        }
        if (x.G(i10, companion.k())) {
            return BlendMode.DST_OVER;
        }
        if (x.G(i10, companion.z())) {
            return BlendMode.SRC_IN;
        }
        if (x.G(i10, companion.i())) {
            return BlendMode.DST_IN;
        }
        if (x.G(i10, companion.A())) {
            return BlendMode.SRC_OUT;
        }
        if (x.G(i10, companion.j())) {
            return BlendMode.DST_OUT;
        }
        if (x.G(i10, companion.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (x.G(i10, companion.h())) {
            return BlendMode.DST_ATOP;
        }
        if (x.G(i10, companion.C())) {
            return BlendMode.XOR;
        }
        if (x.G(i10, companion.t())) {
            return BlendMode.PLUS;
        }
        if (x.G(i10, companion.q())) {
            return BlendMode.MODULATE;
        }
        if (x.G(i10, companion.v())) {
            return BlendMode.SCREEN;
        }
        if (x.G(i10, companion.s())) {
            return BlendMode.OVERLAY;
        }
        if (x.G(i10, companion.e())) {
            return BlendMode.DARKEN;
        }
        if (x.G(i10, companion.o())) {
            return BlendMode.LIGHTEN;
        }
        if (x.G(i10, companion.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (x.G(i10, companion.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (x.G(i10, companion.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (x.G(i10, companion.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (x.G(i10, companion.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (x.G(i10, companion.l())) {
            return BlendMode.EXCLUSION;
        }
        if (x.G(i10, companion.r())) {
            return BlendMode.MULTIPLY;
        }
        if (x.G(i10, companion.n())) {
            return BlendMode.HUE;
        }
        if (x.G(i10, companion.u())) {
            return BlendMode.SATURATION;
        }
        if (x.G(i10, companion.b())) {
            return BlendMode.COLOR;
        }
        return x.G(i10, companion.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    @dl.d
    public static final PorterDuff.Mode c(int i10) {
        x.Companion companion = x.INSTANCE;
        if (x.G(i10, companion.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (x.G(i10, companion.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (x.G(i10, companion.g())) {
            return PorterDuff.Mode.DST;
        }
        if (x.G(i10, companion.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (x.G(i10, companion.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (x.G(i10, companion.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (x.G(i10, companion.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (x.G(i10, companion.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (x.G(i10, companion.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (x.G(i10, companion.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (x.G(i10, companion.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (x.G(i10, companion.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (x.G(i10, companion.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (x.G(i10, companion.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (x.G(i10, companion.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (x.G(i10, companion.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (x.G(i10, companion.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return x.G(i10, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
