package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: BlendModeColorFilterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: compiled from: BlendModeColorFilterCompat.java */
    @androidx.annotation.w0(29)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    private e() {
    }

    @androidx.annotation.p0
    public static ColorFilter a(int i10, @androidx.annotation.n0 BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = f.b.a(blendModeCompat);
            if (objA != null) {
                return a.a(i10, objA);
            }
            return null;
        }
        PorterDuff.Mode modeA = f.a(blendModeCompat);
        if (modeA != null) {
            return new PorterDuffColorFilter(i10, modeA);
        }
        return null;
    }
}
