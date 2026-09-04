package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewSpline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends androidx.constraintlayout.core.motion.utils.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f18586g = "ViewSpline";

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class a extends c {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f18587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        SparseArray<ConstraintAttribute> f18588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f18589j;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f18587h = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f18588i = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i10) {
            int size = this.f18588i.size();
            int i11 = this.f18588i.valueAt(0).i();
            double[] dArr = new double[size];
            this.f18589j = new float[i11];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.f18588i.keyAt(i12);
                ConstraintAttribute constraintAttributeValueAt = this.f18588i.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.g(this.f18589j);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f18589j;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
            }
            this.f17774a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            this.f17774a.e(f10, this.f18589j);
            this.f18588i.valueAt(0).o(view, this.f18589j);
        }

        public void n(int i10, ConstraintAttribute constraintAttribute) {
            this.f18588i.append(i10, constraintAttribute);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewSpline.java */
    public static class C0113c extends c {
        C0113c() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class d extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
        }

        public void n(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class e extends c {
        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class f extends c {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class g extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f18590h = false;

        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f18590h) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f18590h = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e(c.f18586g, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(c.f18586g, "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class h extends c {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class i extends c {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class j extends c {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class k extends c {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class l extends c {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class m extends c {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class n extends c {
        n() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class o extends c {
        o() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static c k(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static c l(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return new i();
            case "rotationY":
                return new j();
            case "translationX":
                return new m();
            case "translationY":
                return new n();
            case "translationZ":
                return new o();
            case "progress":
                return new g();
            case "scaleX":
                return new k();
            case "scaleY":
                return new l();
            case "waveVariesBy":
                return new a();
            case "transformPivotX":
                return new e();
            case "transformPivotY":
                return new f();
            case "rotation":
                return new h();
            case "elevation":
                return new C0113c();
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
