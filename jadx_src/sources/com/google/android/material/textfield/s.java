package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.j1;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: compiled from: IconHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class s {
    private s() {
    }

    static void a(@n0 TextInputLayout textInputLayout, @n0 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.d.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.d.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static ImageView.ScaleType b(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    private static int[] c(@n0 TextInputLayout textInputLayout, @n0 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void d(@n0 TextInputLayout textInputLayout, @n0 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
        androidx.core.graphics.drawable.d.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    static void e(@n0 CheckableImageButton checkableImageButton) {
    }

    private static void f(@n0 CheckableImageButton checkableImageButton, @p0 View.OnLongClickListener onLongClickListener) {
        boolean zK0 = j1.K0(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = zK0 || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zK0);
        checkableImageButton.setPressable(zK0);
        checkableImageButton.setLongClickable(z10);
        j1.R1(checkableImageButton, z11 ? 1 : 2);
    }

    static void g(@n0 CheckableImageButton checkableImageButton, @t0 int i10) {
        checkableImageButton.setMinimumWidth(i10);
        checkableImageButton.setMinimumHeight(i10);
    }

    static void h(@n0 CheckableImageButton checkableImageButton, @p0 View.OnClickListener onClickListener, @p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(@n0 CheckableImageButton checkableImageButton, @p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(@n0 CheckableImageButton checkableImageButton, @n0 ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
