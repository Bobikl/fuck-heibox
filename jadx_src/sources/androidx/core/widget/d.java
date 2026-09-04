package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: CompoundButtonCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21924a = "CompoundButtonCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f21925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21926c;

    /* JADX INFO: compiled from: CompoundButtonCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @androidx.annotation.u
        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @androidx.annotation.u
        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: compiled from: CompoundButtonCompat.java */
    @w0(23)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private d() {
    }

    @p0
    public static Drawable a(@n0 CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    @p0
    public static ColorStateList b(@n0 CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @p0
    public static PorterDuff.Mode c(@n0 CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(@n0 CompoundButton compoundButton, @p0 ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(@n0 CompoundButton compoundButton, @p0 PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}
