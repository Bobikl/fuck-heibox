package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: DrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20674a = "DrawableCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f20675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f20676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f20677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f20678e;

    /* JADX INFO: compiled from: DrawableCompat.java */
    @w0(19)
    public static class a {
        private a() {
        }

        @u
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @u
        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        @u
        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @u
        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @u
        static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* JADX INFO: compiled from: DrawableCompat.java */
    @w0(21)
    public static class b {
        private b() {
        }

        @u
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @u
        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @u
        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @u
        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @u
        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        @u
        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        @u
        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        @u
        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @u
        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: compiled from: DrawableCompat.java */
    @w0(23)
    public static class c {
        private c() {
        }

        @u
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @u
        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    private d() {
    }

    public static void a(@n0 Drawable drawable, @n0 Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(@n0 Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(@n0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@n0 Drawable drawable) {
        return a.a(drawable);
    }

    @p0
    public static ColorFilter e(@n0 Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(@n0 Drawable drawable) {
        return c.a(drawable);
    }

    public static void g(@n0 Drawable drawable, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@n0 Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void i(@n0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@n0 Drawable drawable, boolean z10) {
        a.e(drawable, z10);
    }

    public static void k(@n0 Drawable drawable, float f10, float f11) {
        b.e(drawable, f10, f11);
    }

    public static void l(@n0 Drawable drawable, int i10, int i11, int i12, int i13) {
        b.f(drawable, i10, i11, i12, i13);
    }

    public static boolean m(@n0 Drawable drawable, int i10) {
        return c.b(drawable, i10);
    }

    public static void n(@n0 Drawable drawable, @androidx.annotation.l int i10) {
        b.g(drawable, i10);
    }

    public static void o(@n0 Drawable drawable, @p0 ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(@n0 Drawable drawable, @p0 PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@n0 Drawable drawable) {
        return drawable instanceof q ? (T) ((q) drawable).b() : drawable;
    }

    @n0
    public static Drawable r(@n0 Drawable drawable) {
        return drawable;
    }
}
