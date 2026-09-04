package com.github.chrisbanes.photoview;

import android.widget.ImageView;
import androidx.core.view.q0;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: compiled from: Util.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43135a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f43135a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    m() {
    }

    static void a(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    static int b(int i10) {
        return (i10 & q0.f21790f) >> 8;
    }

    static boolean c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static boolean d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (a.f43135a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
