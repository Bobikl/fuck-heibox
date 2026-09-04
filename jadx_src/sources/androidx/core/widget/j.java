package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ImageViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: compiled from: ImageViewCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @androidx.annotation.u
        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @androidx.annotation.u
        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private j() {
    }

    @p0
    public static ColorStateList a(@n0 ImageView imageView) {
        return a.a(imageView);
    }

    @p0
    public static PorterDuff.Mode b(@n0 ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@n0 ImageView imageView, @p0 ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(@n0 ImageView imageView, @p0 PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}
