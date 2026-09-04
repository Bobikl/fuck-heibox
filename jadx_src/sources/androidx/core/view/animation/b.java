package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: compiled from: PathInterpolatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: PathInterpolatorCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @u
        static PathInterpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        @u
        static PathInterpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        @u
        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private b() {
    }

    @n0
    public static Interpolator a(float f10, float f11) {
        return a.a(f10, f11);
    }

    @n0
    public static Interpolator b(float f10, float f11, float f12, float f13) {
        return a.b(f10, f11, f12, f13);
    }

    @n0
    public static Interpolator c(@n0 Path path) {
        return a.c(path);
    }
}
