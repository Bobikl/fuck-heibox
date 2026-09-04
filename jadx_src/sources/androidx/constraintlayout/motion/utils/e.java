package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f18596p = "ViewTimeCycle";

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class a extends e {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setAlpha(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class b extends e {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f18597q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        SparseArray<ConstraintAttribute> f18598r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        SparseArray<float[]> f18599s = new SparseArray<>();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f18600t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        float[] f18601u;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f18597q = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f18598r = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i10) {
            int size = this.f18598r.size();
            int i11 = this.f18598r.valueAt(0).i();
            double[] dArr = new double[size];
            int i12 = i11 + 2;
            this.f18600t = new float[i12];
            this.f18601u = new float[i11];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = this.f18598r.keyAt(i13);
                ConstraintAttribute constraintAttributeValueAt = this.f18598r.valueAt(i13);
                float[] fArrValueAt = this.f18599s.valueAt(i13);
                dArr[i13] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.g(this.f18600t);
                int i14 = 0;
                while (true) {
                    float[] fArr = this.f18600t;
                    if (i14 < fArr.length) {
                        dArr2[i13][i14] = fArr[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[i11] = fArrValueAt[0];
                dArr3[i11 + 1] = fArrValueAt[1];
            }
            this.f17822a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            this.f17822a.e(f10, this.f18600t);
            float[] fArr = this.f18600t;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f17830i;
            if (Float.isNaN(this.f17831j)) {
                float fA = gVar.a(view, this.f18597q, 0);
                this.f17831j = fA;
                if (Float.isNaN(fA)) {
                    this.f17831j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f17831j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f17831j = f13;
            this.f17830i = j10;
            float fA2 = a(f13);
            this.f17829h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f18601u;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f17829h;
                float f14 = this.f18600t[i10];
                this.f17829h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            this.f18598r.valueAt(0).o(view, this.f18601u);
            if (f11 != 0.0f) {
                this.f17829h = true;
            }
            return this.f17829h;
        }

        public void k(int i10, ConstraintAttribute constraintAttribute, float f10, int i11, float f11) {
            this.f18598r.append(i10, constraintAttribute);
            this.f18599s.append(i10, new float[]{f10, f11});
            this.f17823b = Math.max(this.f17823b, i11);
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class c extends e {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setElevation(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class d extends e {
        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            return this.f17829h;
        }

        public boolean k(View view, androidx.constraintlayout.core.motion.utils.g gVar, float f10, long j10, double d10, double d11) {
            view.setRotation(g(f10, j10, view, gVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f17829h;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class C0114e extends e {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f18602q = false;

        C0114e() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(g(f10, j10, view, gVar));
            } else {
                if (this.f18602q) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f18602q = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(g(f10, j10, view, gVar)));
                    } catch (IllegalAccessException e10) {
                        Log.e(e.f18596p, "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e(e.f18596p, "unable to setProgress", e11);
                    }
                }
            }
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class f extends e {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotation(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class g extends e {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationX(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class h extends e {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationY(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class i extends e {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleX(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class j extends e {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleY(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class k extends e {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationX(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class l extends e {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationY(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class m extends e {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.e
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationZ(g(f10, j10, view, gVar));
            return this.f17829h;
        }
    }

    public static e h(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static e i(String str, long j10) {
        e gVar;
        str.hashCode();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new C0114e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(j10);
        return gVar;
    }

    public float g(float f10, long j10, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
        this.f17822a.e(f10, this.f17828g);
        float[] fArr = this.f17828g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f17829h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f17831j)) {
            float fA = gVar.a(view, this.f17827f, 0);
            this.f17831j = fA;
            if (Float.isNaN(fA)) {
                this.f17831j = 0.0f;
            }
        }
        float f12 = (float) ((((double) this.f17831j) + (((j10 - this.f17830i) * 1.0E-9d) * ((double) f11))) % 1.0d);
        this.f17831j = f12;
        gVar.b(view, this.f17827f, 0, f12);
        this.f17830i = j10;
        float f13 = this.f17828g[0];
        float fA2 = (a(this.f17831j) * f13) + this.f17828g[2];
        this.f17829h = (f13 == 0.0f && f11 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar);
}
