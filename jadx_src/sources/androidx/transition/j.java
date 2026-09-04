package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ImageViewUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f27878a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f27879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27880c;

    private j() {
    }

    static void a(@androidx.annotation.n0 ImageView imageView, @androidx.annotation.p0 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            c(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void b() {
        if (f27880c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f27879b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f27880c = true;
    }

    @androidx.annotation.w0(21)
    @SuppressLint({"NewApi"})
    private static void c(@androidx.annotation.n0 ImageView imageView, @androidx.annotation.p0 Matrix matrix) {
        if (f27878a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f27878a = false;
            }
        }
    }
}
