package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: CheckedTextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21921a = "CheckedTextViewCompat";

    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f21922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static boolean f21923b;

        private a() {
        }

        @p0
        static Drawable a(@n0 CheckedTextView checkedTextView) {
            if (!f21923b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f21922a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i(c.f21921a, "Failed to retrieve mCheckMarkDrawable field", e10);
                }
                f21923b = true;
            }
            Field field = f21922a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e11) {
                    Log.i(c.f21921a, "Failed to get check mark drawable via reflection", e11);
                    f21922a = null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    @w0(16)
    public static class b {
        private b() {
        }

        @p0
        static Drawable a(@n0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CheckedTextViewCompat.java */
    @w0(21)
    public static class C0152c {
        private C0152c() {
        }

        @p0
        static ColorStateList a(@n0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @p0
        static PorterDuff.Mode b(@n0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        static void c(@n0 CheckedTextView checkedTextView, @p0 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void d(@n0 CheckedTextView checkedTextView, @p0 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private c() {
    }

    @p0
    public static Drawable a(@n0 CheckedTextView checkedTextView) {
        return b.a(checkedTextView);
    }

    @p0
    public static ColorStateList b(@n0 CheckedTextView checkedTextView) {
        return C0152c.a(checkedTextView);
    }

    @p0
    public static PorterDuff.Mode c(@n0 CheckedTextView checkedTextView) {
        return C0152c.b(checkedTextView);
    }

    public static void d(@n0 CheckedTextView checkedTextView, @p0 ColorStateList colorStateList) {
        C0152c.c(checkedTextView, colorStateList);
    }

    public static void e(@n0 CheckedTextView checkedTextView, @p0 PorterDuff.Mode mode) {
        C0152c.d(checkedTextView, mode);
    }
}
