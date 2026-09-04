package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Drawable.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n38#2:119\n49#2:120\n60#2:121\n71#2:122\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119\n66#1:120\n66#1:121\n66#1:122\n*E\n"})
public final class e {
    @dl.d
    public static final Bitmap a(@dl.d Drawable drawable, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @dl.e Bitmap.Config config) {
        f0.p(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                if (i10 == bitmapDrawable.getBitmap().getWidth() && i11 == bitmapDrawable.getBitmap().getHeight()) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    f0.o(bitmap, "bitmap");
                    return bitmap;
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i10, i11, true);
                f0.o(bitmapCreateScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                return bitmapCreateScaledBitmap;
            }
        }
        Rect bounds = drawable.getBounds();
        f0.o(bounds, "bounds");
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap2 = Bitmap.createBitmap(i10, i11, config);
        drawable.setBounds(0, 0, i10, i11);
        drawable.draw(new Canvas(bitmap2));
        drawable.setBounds(i12, i13, i14, i15);
        f0.o(bitmap2, "bitmap");
        return bitmap2;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        if ((i12 & 4) != 0) {
            config = null;
        }
        return a(drawable, i10, i11, config);
    }

    @dl.e
    public static final Bitmap c(@dl.d Drawable drawable, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @dl.e Bitmap.Config config) {
        f0.p(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return a(drawable, i10, i11, config);
    }

    public static /* synthetic */ Bitmap d(Drawable drawable, int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        if ((i12 & 4) != 0) {
            config = null;
        }
        return c(drawable, i10, i11, config);
    }

    public static final void e(@dl.d Drawable drawable, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        f0.p(drawable, "<this>");
        drawable.setBounds(i10, i11, i12, i13);
    }

    public static /* synthetic */ void f(Drawable drawable, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = drawable.getBounds().left;
        }
        if ((i14 & 2) != 0) {
            i11 = drawable.getBounds().top;
        }
        if ((i14 & 4) != 0) {
            i12 = drawable.getBounds().right;
        }
        if ((i14 & 8) != 0) {
            i13 = drawable.getBounds().bottom;
        }
        e(drawable, i10, i11, i12, i13);
    }
}
