package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: EdgeEffectCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EdgeEffect f21931a;

    /* JADX INFO: compiled from: EdgeEffectCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(EdgeEffect edgeEffect, float f10, float f11) {
            edgeEffect.onPull(f10, f11);
        }
    }

    /* JADX INFO: compiled from: EdgeEffectCompat.java */
    @w0(31)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @androidx.annotation.u
        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @androidx.annotation.u
        public static float c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public i(Context context) {
        this.f21931a = new EdgeEffect(context);
    }

    @n0
    public static EdgeEffect a(@n0 Context context, @p0 AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float d(@n0 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@n0 EdgeEffect edgeEffect, float f10, float f11) {
        a.a(edgeEffect, f10, f11);
    }

    public static float j(@n0 EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f10, f11);
        }
        g(edgeEffect, f10, f11);
        return f10;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f21931a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f21931a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f21931a.isFinished();
    }

    @Deprecated
    public boolean f(int i10) {
        this.f21931a.onAbsorb(i10);
        return true;
    }

    @Deprecated
    public boolean h(float f10) {
        this.f21931a.onPull(f10);
        return true;
    }

    @Deprecated
    public boolean i(float f10, float f11) {
        g(this.f21931a, f10, f11);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f21931a.onRelease();
        return this.f21931a.isFinished();
    }

    @Deprecated
    public void l(int i10, int i11) {
        this.f21931a.setSize(i10, i11);
    }
}
