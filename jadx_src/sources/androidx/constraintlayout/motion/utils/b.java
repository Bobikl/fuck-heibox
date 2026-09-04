package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends androidx.constraintlayout.core.motion.utils.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f18582i = "ViewOscillator";

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class a extends b {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class C0112b extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f18583j = new float[1];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected ConstraintAttribute f18584k;

        C0112b() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        protected void e(Object obj) {
            this.f18584k = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            this.f18583j[0] = a(f10);
            this.f18584k.o(view, this.f18583j);
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class c extends b {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class d extends b {
        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
        }

        public void n(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class e extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f18585j = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f18585j) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f18585j = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e(b.f18582i, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(b.f18582i, "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class f extends b {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class g extends b {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class h extends b {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class i extends b {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class j extends b {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class k extends b {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class l extends b {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class m extends b {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.b
        public void m(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static b l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C0112b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                return new e();
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f10);
}
