package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.f0;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: MotionController.java */
/* JADX INFO: loaded from: classes.dex */
public class o {
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f18899a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f18900b0 = "MotionController";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final boolean f18901c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final boolean f18902d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final int f18903e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final int f18904f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final int f18905g0 = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final int f18906h0 = 3;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final int f18907i0 = 4;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final int f18908j0 = 5;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f18909k0 = -1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f18910l0 = -2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f18911m0 = -3;
    private HashMap<String, androidx.constraintlayout.motion.utils.e> A;
    private HashMap<String, androidx.constraintlayout.motion.utils.c> B;
    private HashMap<String, androidx.constraintlayout.motion.utils.b> C;
    private m[] D;
    private int E;
    private int F;
    private View G;
    private int H;
    private float I;
    private Interpolator J;
    private boolean K;
    String[] L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f18913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f18914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f18915d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b[] f18921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f18922k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f18926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f18927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f18928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double[] f18929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double[] f18930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String[] f18931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f18932u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Rect f18912a = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18916e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f18917f = new r();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f18918g = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f18919h = new n();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f18920i = new n();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f18923l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f18924m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f18925n = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18933v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float[] f18934w = new float[4];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList<r> f18935x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float[] f18936y = new float[1];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList<f> f18937z = new ArrayList<>();

    /* JADX INFO: compiled from: MotionController.java */
    public static final class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f18938a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f18938a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f18938a.a(f10);
        }
    }

    o(View view) {
        int i10 = f.f18718f;
        this.E = i10;
        this.F = i10;
        this.G = null;
        this.H = i10;
        this.I = Float.NaN;
        this.J = null;
        this.K = false;
        Y(view);
    }

    private float D() {
        char c10;
        float fHypot;
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < 100) {
            float f12 = i10 * f10;
            double dA = f12;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f18917f.f18945b;
            float f13 = Float.NaN;
            float f14 = 0.0f;
            for (r rVar : this.f18935x) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = rVar.f18945b;
                if (dVar2 != null) {
                    float f15 = rVar.f18947d;
                    if (f15 < f12) {
                        dVar = dVar2;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = rVar.f18947d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f16 = f13 - f14;
                dA = (((float) dVar.a((f12 - f14) / f16)) * f16) + f14;
            }
            this.f18921j[0].d(dA, this.f18929r);
            float f17 = f11;
            int i11 = i10;
            this.f18917f.h(dA, this.f18928q, this.f18929r, fArr, 0);
            if (i11 > 0) {
                c10 = 0;
                fHypot = (float) (((double) f17) + Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0])));
            } else {
                c10 = 0;
                fHypot = f17;
            }
            d10 = fArr[c10];
            i10 = i11 + 1;
            f11 = fHypot;
            d11 = fArr[1];
        }
        return f11;
    }

    private void K(r rVar) {
        int iBinarySearch = Collections.binarySearch(this.f18935x, rVar);
        if (iBinarySearch == 0) {
            Log.e(f18900b0, " KeyPath position \"" + rVar.f18948e + "\" outside of range");
        }
        this.f18935x.add((-iBinarySearch) - 1, rVar);
    }

    private void O(r rVar) {
        rVar.s((int) this.f18913b.getX(), (int) this.f18913b.getY(), this.f18913b.getWidth(), this.f18913b.getHeight());
    }

    private float j(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f18925n;
            if (f12 != 1.0d) {
                float f13 = this.f18924m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f18917f.f18945b;
        float f14 = Float.NaN;
        for (r rVar : this.f18935x) {
            androidx.constraintlayout.core.motion.utils.d dVar2 = rVar.f18945b;
            if (dVar2 != null) {
                float f15 = rVar.f18947d;
                if (f15 < f10) {
                    dVar = dVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = rVar.f18947d;
                }
            }
        }
        if (dVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) dVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d10);
            }
        }
        return f10;
    }

    private static Interpolator v(Context context, int i10, String str, int i11) {
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, i11);
        }
        if (i10 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(str));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    double[] A(double d10) {
        this.f18921j[0].d(d10, this.f18929r);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f18922k;
        if (bVar != null) {
            double[] dArr = this.f18929r;
            if (dArr.length > 0) {
                bVar.d(d10, dArr);
            }
        }
        return this.f18929r;
    }

    k B(int i10, int i11, float f10, float f11) {
        RectF rectF = new RectF();
        r rVar = this.f18917f;
        float f12 = rVar.f18949f;
        rectF.left = f12;
        float f13 = rVar.f18950g;
        rectF.top = f13;
        rectF.right = f12 + rVar.f18951h;
        rectF.bottom = f13 + rVar.f18952i;
        RectF rectF2 = new RectF();
        r rVar2 = this.f18918g;
        float f14 = rVar2.f18949f;
        rectF2.left = f14;
        float f15 = rVar2.f18950g;
        rectF2.top = f15;
        rectF2.right = f14 + rVar2.f18951h;
        rectF2.bottom = f15 + rVar2.f18952i;
        for (f fVar : this.f18937z) {
            if (fVar instanceof k) {
                k kVar = (k) fVar;
                if (kVar.r(i10, i11, rectF, rectF2, f10, f11)) {
                    return kVar;
                }
            }
        }
        return null;
    }

    void C(float f10, int i10, int i11, float f11, float f12, float[] fArr) {
        float fJ = j(f10, this.f18936y);
        HashMap<String, androidx.constraintlayout.motion.utils.c> map = this.B;
        androidx.constraintlayout.motion.utils.c cVar = map == null ? null : map.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map2 = this.B;
        androidx.constraintlayout.motion.utils.c cVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map3 = this.B;
        androidx.constraintlayout.motion.utils.c cVar3 = map3 == null ? null : map3.get(f.f18721i);
        HashMap<String, androidx.constraintlayout.motion.utils.c> map4 = this.B;
        androidx.constraintlayout.motion.utils.c cVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map5 = this.B;
        androidx.constraintlayout.motion.utils.c cVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, androidx.constraintlayout.motion.utils.b> map6 = this.C;
        androidx.constraintlayout.motion.utils.b bVar = map6 == null ? null : map6.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.b> map7 = this.C;
        androidx.constraintlayout.motion.utils.b bVar2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.b> map8 = this.C;
        androidx.constraintlayout.motion.utils.b bVar3 = map8 == null ? null : map8.get(f.f18721i);
        HashMap<String, androidx.constraintlayout.motion.utils.b> map9 = this.C;
        androidx.constraintlayout.motion.utils.b bVar4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.b> map10 = this.C;
        androidx.constraintlayout.motion.utils.b bVar5 = map10 != null ? map10.get("scaleY") : null;
        f0 f0Var = new f0();
        f0Var.b();
        f0Var.d(cVar3, fJ);
        f0Var.h(cVar, cVar2, fJ);
        f0Var.f(cVar4, cVar5, fJ);
        f0Var.c(bVar3, fJ);
        f0Var.g(bVar, bVar2, fJ);
        f0Var.e(bVar4, bVar5, fJ);
        androidx.constraintlayout.core.motion.utils.b bVar6 = this.f18922k;
        if (bVar6 != null) {
            double[] dArr = this.f18929r;
            if (dArr.length > 0) {
                double d10 = fJ;
                bVar6.d(d10, dArr);
                this.f18922k.g(d10, this.f18930s);
                this.f18917f.t(f11, f12, fArr, this.f18928q, this.f18930s, this.f18929r);
            }
            f0Var.a(f11, f12, i10, i11, fArr);
            return;
        }
        int i12 = 0;
        if (this.f18921j == null) {
            r rVar = this.f18918g;
            float f13 = rVar.f18949f;
            r rVar2 = this.f18917f;
            float f14 = f13 - rVar2.f18949f;
            androidx.constraintlayout.motion.utils.b bVar7 = bVar5;
            float f15 = rVar.f18950g - rVar2.f18950g;
            androidx.constraintlayout.motion.utils.b bVar8 = bVar4;
            float f16 = (rVar.f18951h - rVar2.f18951h) + f14;
            float f17 = (rVar.f18952i - rVar2.f18952i) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            f0Var.b();
            f0Var.d(cVar3, fJ);
            f0Var.h(cVar, cVar2, fJ);
            f0Var.f(cVar4, cVar5, fJ);
            f0Var.c(bVar3, fJ);
            f0Var.g(bVar, bVar2, fJ);
            f0Var.e(bVar8, bVar7, fJ);
            f0Var.a(f11, f12, i10, i11, fArr);
            return;
        }
        double dJ = j(fJ, this.f18936y);
        this.f18921j[0].g(dJ, this.f18930s);
        this.f18921j[0].d(dJ, this.f18929r);
        float f18 = this.f18936y[0];
        while (true) {
            double[] dArr2 = this.f18930s;
            if (i12 >= dArr2.length) {
                this.f18917f.t(f11, f12, fArr, this.f18928q, dArr2, this.f18929r);
                f0Var.a(f11, f12, i10, i11, fArr);
                return;
            } else {
                dArr2[i12] = dArr2[i12] * ((double) f18);
                i12++;
            }
        }
    }

    public float E() {
        return this.f18917f.f18952i;
    }

    public float F() {
        return this.f18917f.f18951h;
    }

    public float G() {
        return this.f18917f.f18949f;
    }

    public float H() {
        return this.f18917f.f18950g;
    }

    public int I() {
        return this.F;
    }

    public View J() {
        return this.f18913b;
    }

    boolean L(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
        androidx.constraintlayout.motion.utils.e.d dVar;
        boolean zK;
        float fJ = j(f10, null);
        int i10 = this.H;
        if (i10 != f.f18718f) {
            float f11 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fJ / f11)) * f11;
            float f12 = (fJ % f11) / f11;
            if (!Float.isNaN(this.I)) {
                f12 = (f12 + this.I) % 1.0f;
            }
            Interpolator interpolator = this.J;
            fJ = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + fFloor;
        }
        float f13 = fJ;
        HashMap<String, androidx.constraintlayout.motion.utils.c> map = this.B;
        if (map != null) {
            Iterator<androidx.constraintlayout.motion.utils.c> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m(view, f13);
            }
        }
        HashMap<String, androidx.constraintlayout.motion.utils.e> map2 = this.A;
        if (map2 != null) {
            dVar = null;
            boolean zJ = false;
            for (androidx.constraintlayout.motion.utils.e eVar : map2.values()) {
                if (eVar instanceof androidx.constraintlayout.motion.utils.e.d) {
                    dVar = (androidx.constraintlayout.motion.utils.e.d) eVar;
                } else {
                    zJ |= eVar.j(view, f13, j10, gVar);
                }
            }
            zK = zJ;
        } else {
            dVar = null;
            zK = false;
        }
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f18921j;
        int i11 = 1;
        if (bVarArr != null) {
            double d10 = f13;
            bVarArr[0].d(d10, this.f18929r);
            this.f18921j[0].g(d10, this.f18930s);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f18922k;
            if (bVar != null) {
                double[] dArr = this.f18929r;
                if (dArr.length > 0) {
                    bVar.d(d10, dArr);
                    this.f18922k.g(d10, this.f18930s);
                }
            }
            if (!this.K) {
                this.f18917f.w(f13, view, this.f18928q, this.f18929r, this.f18930s, null);
            }
            if (this.F != f.f18718f) {
                if (this.G == null) {
                    this.G = ((View) view.getParent()).findViewById(this.F);
                }
                View view2 = this.G;
                if (view2 != null) {
                    float top = (view2.getTop() + this.G.getBottom()) / 2.0f;
                    float left = (this.G.getLeft() + this.G.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left2 = left - view.getLeft();
                        float top2 = top - view.getTop();
                        view.setPivotX(left2);
                        view.setPivotY(top2);
                    }
                }
            }
            HashMap<String, androidx.constraintlayout.motion.utils.c> map3 = this.B;
            if (map3 != null) {
                for (androidx.constraintlayout.motion.utils.c cVar : map3.values()) {
                    if (cVar instanceof androidx.constraintlayout.motion.utils.c.d) {
                        double[] dArr2 = this.f18930s;
                        if (dArr2.length > 1) {
                            ((androidx.constraintlayout.motion.utils.c.d) cVar).n(view, f13, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f18930s;
                zK |= dVar.k(view, gVar, f13, j10, dArr3[0], dArr3[1]);
            }
            int i12 = i11;
            while (true) {
                androidx.constraintlayout.core.motion.utils.b[] bVarArr2 = this.f18921j;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i12].e(d10, this.f18934w);
                this.f18917f.f18959p.get(this.f18931t[i12 - 1]).o(view, this.f18934w);
                i12++;
            }
            n nVar = this.f18919h;
            if (nVar.f18875c == 0) {
                if (f13 <= 0.0f) {
                    view.setVisibility(nVar.f18876d);
                } else if (f13 >= 1.0f) {
                    view.setVisibility(this.f18920i.f18876d);
                } else if (this.f18920i.f18876d != nVar.f18876d) {
                    view.setVisibility(0);
                }
            }
            if (this.D != null) {
                int i13 = 0;
                while (true) {
                    m[] mVarArr = this.D;
                    if (i13 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i13].A(f13, view);
                    i13++;
                }
            }
        } else {
            i11 = 1;
            r rVar = this.f18917f;
            float f14 = rVar.f18949f;
            r rVar2 = this.f18918g;
            float f15 = f14 + ((rVar2.f18949f - f14) * f13);
            float f16 = rVar.f18950g;
            float f17 = f16 + ((rVar2.f18950g - f16) * f13);
            float f18 = rVar.f18951h;
            float f19 = rVar2.f18951h;
            float f20 = rVar.f18952i;
            float f21 = rVar2.f18952i;
            float f22 = f15 + 0.5f;
            int i14 = (int) f22;
            float f23 = f17 + 0.5f;
            int i15 = (int) f23;
            int i16 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i17 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f19 != f18 || f21 != f20) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
            }
            view.layout(i14, i15, i16, i17);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.b> map4 = this.C;
        if (map4 != null) {
            for (androidx.constraintlayout.motion.utils.b bVar2 : map4.values()) {
                if (bVar2 instanceof androidx.constraintlayout.motion.utils.b.d) {
                    double[] dArr4 = this.f18930s;
                    ((androidx.constraintlayout.motion.utils.b.d) bVar2).n(view, f13, dArr4[0], dArr4[i11]);
                } else {
                    bVar2.m(view, f13);
                }
            }
        }
        return zK;
    }

    String M() {
        return this.f18913b.getContext().getResources().getResourceEntryName(this.f18913b.getId());
    }

    void N(View view, k kVar, float f10, float f11, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        r rVar = this.f18917f;
        float f12 = rVar.f18949f;
        rectF.left = f12;
        float f13 = rVar.f18950g;
        rectF.top = f13;
        rectF.right = f12 + rVar.f18951h;
        rectF.bottom = f13 + rVar.f18952i;
        RectF rectF2 = new RectF();
        r rVar2 = this.f18918g;
        float f14 = rVar2.f18949f;
        rectF2.left = f14;
        float f15 = rVar2.f18950g;
        rectF2.top = f15;
        rectF2.right = f14 + rVar2.f18951h;
        rectF2.bottom = f15 + rVar2.f18952i;
        kVar.s(view, rectF, rectF2, f10, f11, strArr, fArr);
    }

    void P(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((i13 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((i15 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void Q(View view) {
        r rVar = this.f18917f;
        rVar.f18947d = 0.0f;
        rVar.f18948e = 0.0f;
        this.K = true;
        rVar.s(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f18918g.s(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f18919h.o(view);
        this.f18920i.o(view);
    }

    public void R(int i10) {
        this.f18917f.f18946c = i10;
    }

    void S(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        int i12 = cVar.f19556d;
        if (i12 != 0) {
            P(rect, this.f18912a, i12, i10, i11);
            rect = this.f18912a;
        }
        r rVar = this.f18918g;
        rVar.f18947d = 1.0f;
        rVar.f18948e = 1.0f;
        O(rVar);
        this.f18918g.s(rect.left, rect.top, rect.width(), rect.height());
        this.f18918g.a(cVar.q0(this.f18914c));
        this.f18920i.n(rect, cVar, i12, this.f18914c);
    }

    public void T(int i10) {
        this.E = i10;
    }

    void U(View view) {
        r rVar = this.f18917f;
        rVar.f18947d = 0.0f;
        rVar.f18948e = 0.0f;
        rVar.s(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f18919h.o(view);
    }

    void V(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        int i12 = cVar.f19556d;
        if (i12 != 0) {
            P(rect, this.f18912a, i12, i10, i11);
        }
        r rVar = this.f18917f;
        rVar.f18947d = 0.0f;
        rVar.f18948e = 0.0f;
        O(rVar);
        this.f18917f.s(rect.left, rect.top, rect.width(), rect.height());
        androidx.constraintlayout.widget.c.a aVarQ0 = cVar.q0(this.f18914c);
        this.f18917f.a(aVarQ0);
        this.f18923l = aVarQ0.f19563d.f19674g;
        this.f18919h.n(rect, cVar, i12, this.f18914c);
        this.F = aVarQ0.f19565f.f19707i;
        androidx.constraintlayout.widget.c.C0117c c0117c = aVarQ0.f19563d;
        this.H = c0117c.f19678k;
        this.I = c0117c.f19677j;
        Context context = this.f18913b.getContext();
        androidx.constraintlayout.widget.c.C0117c c0117c2 = aVarQ0.f19563d;
        this.J = v(context, c0117c2.f19680m, c0117c2.f19679l, c0117c2.f19681n);
    }

    public void W(androidx.constraintlayout.motion.utils.d dVar, View view, int i10, int i11, int i12) {
        r rVar = this.f18917f;
        rVar.f18947d = 0.0f;
        rVar.f18948e = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1) {
            int i13 = dVar.f18592b + dVar.f18594d;
            rect.left = ((dVar.f18593c + dVar.f18595e) - dVar.c()) / 2;
            rect.top = i11 - ((i13 + dVar.b()) / 2);
            rect.right = rect.left + dVar.c();
            rect.bottom = rect.top + dVar.b();
        } else if (i10 == 2) {
            int i14 = dVar.f18592b + dVar.f18594d;
            rect.left = i12 - (((dVar.f18593c + dVar.f18595e) + dVar.c()) / 2);
            rect.top = (i14 - dVar.b()) / 2;
            rect.right = rect.left + dVar.c();
            rect.bottom = rect.top + dVar.b();
        }
        this.f18917f.s(rect.left, rect.top, rect.width(), rect.height());
        this.f18919h.m(rect, view, i10, dVar.f18591a);
    }

    public void X(int i10) {
        this.F = i10;
        this.G = null;
    }

    public void Y(View view) {
        this.f18913b = view;
        this.f18914c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f18915d = ((ConstraintLayout.LayoutParams) layoutParams).a();
        }
    }

    public void Z(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        String[] strArr;
        ConstraintAttribute constraintAttribute;
        androidx.constraintlayout.motion.utils.e eVarI;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        androidx.constraintlayout.motion.utils.c cVarL;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i12 = this.E;
        if (i12 != f.f18718f) {
            this.f18917f.f18955l = i12;
        }
        this.f18919h.f(this.f18920i, hashSet2);
        ArrayList<f> arrayList2 = this.f18937z;
        if (arrayList2 != null) {
            arrayList = null;
            for (f fVar : arrayList2) {
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    K(new r(i10, i11, jVar, this.f18917f, this.f18918g));
                    int i13 = jVar.D;
                    if (i13 != f.f18718f) {
                        this.f18916e = i13;
                    }
                } else if (fVar instanceof h) {
                    fVar.d(hashSet3);
                } else if (fVar instanceof l) {
                    fVar.d(hashSet);
                } else if (fVar instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) fVar);
                } else {
                    fVar.i(map);
                    fVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i14 = 0;
        if (arrayList != null) {
            this.D = (m[]) arrayList.toArray(new m[0]);
        }
        char c10 = 1;
        if (!hashSet2.isEmpty()) {
            this.B = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                    for (f fVar2 : this.f18937z) {
                        HashMap<String, ConstraintAttribute> map2 = fVar2.f18743e;
                        if (map2 != null && (constraintAttribute3 = map2.get(str2)) != null) {
                            sparseArray.append(fVar2.f18739a, constraintAttribute3);
                        }
                    }
                    cVarL = androidx.constraintlayout.motion.utils.c.k(str, sparseArray);
                } else {
                    cVarL = androidx.constraintlayout.motion.utils.c.l(str);
                }
                if (cVarL != null) {
                    cVarL.i(str);
                    this.B.put(str, cVarL);
                }
            }
            ArrayList<f> arrayList3 = this.f18937z;
            if (arrayList3 != null) {
                for (f fVar3 : arrayList3) {
                    if (fVar3 instanceof g) {
                        fVar3.a(this.B);
                    }
                }
            }
            this.f18919h.a(this.B, 0);
            this.f18920i.a(this.B, 100);
            for (String str3 : this.B.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.motion.utils.c cVar = this.B.get(str3);
                if (cVar != null) {
                    cVar.j(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.A.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                        for (f fVar4 : this.f18937z) {
                            HashMap<String, ConstraintAttribute> map3 = fVar4.f18743e;
                            if (map3 != null && (constraintAttribute2 = map3.get(str5)) != null) {
                                sparseArray2.append(fVar4.f18739a, constraintAttribute2);
                            }
                        }
                        eVarI = androidx.constraintlayout.motion.utils.e.h(str4, sparseArray2);
                    } else {
                        eVarI = androidx.constraintlayout.motion.utils.e.i(str4, j10);
                    }
                    if (eVarI != null) {
                        eVarI.e(str4);
                        this.A.put(str4, eVarI);
                    }
                }
            }
            ArrayList<f> arrayList4 = this.f18937z;
            if (arrayList4 != null) {
                for (f fVar5 : arrayList4) {
                    if (fVar5 instanceof l) {
                        ((l) fVar5).W(this.A);
                    }
                }
            }
            for (String str6 : this.A.keySet()) {
                this.A.get(str6).f(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int i15 = 2;
        int size = this.f18935x.size() + 2;
        r[] rVarArr = new r[size];
        rVarArr[0] = this.f18917f;
        rVarArr[size - 1] = this.f18918g;
        if (this.f18935x.size() > 0 && this.f18916e == -1) {
            this.f18916e = 0;
        }
        Iterator<r> it = this.f18935x.iterator();
        int i16 = 1;
        while (it.hasNext()) {
            rVarArr[i16] = it.next();
            i16++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f18918g.f18959p.keySet()) {
            if (this.f18917f.f18959p.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f18931t = strArr2;
        this.f18932u = new int[strArr2.length];
        int i17 = 0;
        while (true) {
            strArr = this.f18931t;
            if (i17 >= strArr.length) {
                break;
            }
            String str8 = strArr[i17];
            this.f18932u[i17] = 0;
            for (int i18 = 0; i18 < size; i18++) {
                if (rVarArr[i18].f18959p.containsKey(str8) && (constraintAttribute = rVarArr[i18].f18959p.get(str8)) != null) {
                    int[] iArr = this.f18932u;
                    iArr[i17] = iArr[i17] + constraintAttribute.i();
                    break;
                }
            }
            i17++;
        }
        boolean z10 = rVarArr[0].f18955l != f.f18718f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i19 = 1; i19 < size; i19++) {
            rVarArr[i19].e(rVarArr[i19 - 1], zArr, this.f18931t, z10);
        }
        int i20 = 0;
        for (int i21 = 1; i21 < length; i21++) {
            if (zArr[i21]) {
                i20++;
            }
        }
        this.f18928q = new int[i20];
        int iMax = Math.max(2, i20);
        this.f18929r = new double[iMax];
        this.f18930s = new double[iMax];
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                this.f18928q[i22] = i23;
                i22++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.f18928q.length);
        double[] dArr2 = new double[size];
        for (int i24 = 0; i24 < size; i24++) {
            rVarArr[i24].f(dArr[i24], this.f18928q);
            dArr2[i24] = rVarArr[i24].f18947d;
        }
        int i25 = 0;
        while (true) {
            int[] iArr2 = this.f18928q;
            if (i25 >= iArr2.length) {
                break;
            }
            if (iArr2[i25] < r.G.length) {
                String str9 = r.G[this.f18928q[i25]] + " [";
                for (int i26 = 0; i26 < size; i26++) {
                    str9 = str9 + dArr[i26][i25];
                }
            }
            i25++;
        }
        this.f18921j = new androidx.constraintlayout.core.motion.utils.b[this.f18931t.length + 1];
        int i27 = 0;
        while (true) {
            String[] strArr3 = this.f18931t;
            if (i27 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i27];
            int i28 = i14;
            int i29 = i28;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i28 < size) {
                if (rVarArr[i28].n(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i15];
                        iArr3[c10] = rVarArr[i28].l(str10);
                        iArr3[i14] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    r rVar = rVarArr[i28];
                    dArr3[i29] = rVar.f18947d;
                    rVar.k(str10, dArr4[i29], 0);
                    i29++;
                }
                i28++;
                i15 = 2;
                i14 = 0;
                c10 = 1;
            }
            i27++;
            this.f18921j[i27] = androidx.constraintlayout.core.motion.utils.b.a(this.f18916e, Arrays.copyOf(dArr3, i29), (double[][]) Arrays.copyOf(dArr4, i29));
            i15 = 2;
            i14 = 0;
            c10 = 1;
        }
        this.f18921j[0] = androidx.constraintlayout.core.motion.utils.b.a(this.f18916e, dArr2, dArr);
        if (rVarArr[0].f18955l != f.f18718f) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i30 = 0; i30 < size; i30++) {
                r rVar2 = rVarArr[i30];
                iArr4[i30] = rVar2.f18955l;
                dArr5[i30] = rVar2.f18947d;
                double[] dArr7 = dArr6[i30];
                dArr7[0] = rVar2.f18949f;
                dArr7[1] = rVar2.f18950g;
            }
            this.f18922k = androidx.constraintlayout.core.motion.utils.b.b(iArr4, dArr5, dArr6);
        }
        float fD = Float.NaN;
        this.C = new HashMap<>();
        if (this.f18937z != null) {
            for (String str11 : hashSet3) {
                androidx.constraintlayout.motion.utils.b bVarL = androidx.constraintlayout.motion.utils.b.l(str11);
                if (bVarL != null) {
                    if (bVarL.k() && Float.isNaN(fD)) {
                        fD = D();
                    }
                    bVarL.i(str11);
                    this.C.put(str11, bVarL);
                }
            }
            for (f fVar6 : this.f18937z) {
                if (fVar6 instanceof h) {
                    ((h) fVar6).a0(this.C);
                }
            }
            Iterator<androidx.constraintlayout.motion.utils.b> it2 = this.C.values().iterator();
            while (it2.hasNext()) {
                it2.next().j(fD);
            }
        }
    }

    public void a(f fVar) {
        this.f18937z.add(fVar);
    }

    public void a0(o oVar) {
        this.f18917f.x(oVar, oVar.f18917f);
        this.f18918g.x(oVar, oVar.f18918g);
    }

    void b(ArrayList<f> arrayList) {
        this.f18937z.addAll(arrayList);
    }

    void c(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.c> map = this.B;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> map2 = this.B;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.b> map3 = this.C;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.b> map4 = this.C;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            float fMin = i11 * f10;
            float f11 = this.f18925n;
            float f12 = 0.0f;
            if (f11 != 1.0f) {
                float f13 = this.f18924m;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f11, 1.0f);
                }
            }
            double dA = fMin;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f18917f.f18945b;
            float f14 = Float.NaN;
            for (r rVar : this.f18935x) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = rVar.f18945b;
                if (dVar2 != null) {
                    float f15 = rVar.f18947d;
                    if (f15 < fMin) {
                        dVar = dVar2;
                        f12 = f15;
                    } else if (Float.isNaN(f14)) {
                        f14 = rVar.f18947d;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                float f16 = f14 - f12;
                dA = (((float) dVar.a((fMin - f12) / f16)) * f16) + f12;
            }
            this.f18921j[0].d(dA, this.f18929r);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f18922k;
            if (bVar != null) {
                double[] dArr = this.f18929r;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            this.f18917f.g(this.f18928q, this.f18929r, fArr, i11 * 2);
        }
    }

    int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f18921j[0].h();
        if (iArr != null) {
            Iterator<r> it = this.f18935x.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f18960q;
                i10++;
            }
        }
        int i11 = 0;
        for (double d10 : dArrH) {
            this.f18921j[0].d(d10, this.f18929r);
            this.f18917f.g(this.f18928q, this.f18929r, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    int e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f18921j[0].h();
        if (iArr != null) {
            Iterator<r> it = this.f18935x.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f18960q;
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < dArrH.length; i12++) {
            this.f18921j[0].d(dArrH[i12], this.f18929r);
            this.f18917f.h(dArrH[i12], this.f18928q, this.f18929r, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    void f(float[] fArr, int i10) {
        double dA;
        float f10 = 1.0f;
        float f11 = 1.0f / (i10 - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.c> map = this.B;
        androidx.constraintlayout.motion.utils.c cVar = map == null ? null : map.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map2 = this.B;
        androidx.constraintlayout.motion.utils.c cVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.b> map3 = this.C;
        androidx.constraintlayout.motion.utils.b bVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.b> map4 = this.C;
        androidx.constraintlayout.motion.utils.b bVar2 = map4 != null ? map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f11;
            float f12 = this.f18925n;
            if (f12 != f10) {
                float f13 = this.f18924m;
                if (fMin < f13) {
                    fMin = 0.0f;
                }
                if (fMin > f13 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f13) * f12, f10);
                }
            }
            float f14 = fMin;
            double d10 = f14;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f18917f.f18945b;
            float f15 = Float.NaN;
            float f16 = 0.0f;
            for (r rVar : this.f18935x) {
                androidx.constraintlayout.core.motion.utils.d dVar2 = rVar.f18945b;
                double d11 = d10;
                if (dVar2 != null) {
                    float f17 = rVar.f18947d;
                    if (f17 < f14) {
                        f16 = f17;
                        dVar = dVar2;
                    } else if (Float.isNaN(f15)) {
                        f15 = rVar.f18947d;
                    }
                }
                d10 = d11;
            }
            double d12 = d10;
            if (dVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f18 = f15 - f16;
                dA = (((float) dVar.a((f14 - f16) / f18)) * f18) + f16;
            } else {
                dA = d12;
            }
            this.f18921j[0].d(dA, this.f18929r);
            androidx.constraintlayout.core.motion.utils.b bVar3 = this.f18922k;
            if (bVar3 != null) {
                double[] dArr = this.f18929r;
                if (dArr.length > 0) {
                    bVar3.d(dA, dArr);
                }
            }
            int i12 = i11 * 2;
            int i13 = i11;
            this.f18917f.h(dA, this.f18928q, this.f18929r, fArr, i12);
            if (bVar != null) {
                fArr[i12] = fArr[i12] + bVar.a(f14);
            } else if (cVar != null) {
                fArr[i12] = fArr[i12] + cVar.a(f14);
            }
            if (bVar2 != null) {
                int i14 = i12 + 1;
                fArr[i14] = fArr[i14] + bVar2.a(f14);
            } else if (cVar2 != null) {
                int i15 = i12 + 1;
                fArr[i15] = fArr[i15] + cVar2.a(f14);
            }
            i11 = i13 + 1;
            f10 = 1.0f;
        }
    }

    void g(float f10, float[] fArr, int i10) {
        this.f18921j[0].d(j(f10, null), this.f18929r);
        this.f18917f.m(this.f18928q, this.f18929r, fArr, i10);
    }

    void h(float[] fArr, int i10) {
        float f10 = 1.0f / (i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18921j[0].d(j(i11 * f10, null), this.f18929r);
            this.f18917f.m(this.f18928q, this.f18929r, fArr, i11 * 8);
        }
    }

    void i(boolean z10) {
        if (!"button".equals(c.k(this.f18913b)) || this.D == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            m[] mVarArr = this.D;
            if (i10 >= mVarArr.length) {
                return;
            }
            mVarArr[i10].A(z10 ? -100.0f : 100.0f, this.f18913b);
            i10++;
        }
    }

    public int k() {
        return this.f18917f.f18956m;
    }

    int l(String str, float[] fArr, int i10) {
        androidx.constraintlayout.motion.utils.c cVar = this.B.get(str);
        if (cVar == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = cVar.a(i11 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void m(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f18921j[0].d(d10, dArr);
        this.f18921j[0].g(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f18917f.i(d10, this.f18928q, dArr, fArr, dArr2, fArr2);
    }

    public float n() {
        return this.f18926o;
    }

    public float o() {
        return this.f18927p;
    }

    void p(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float fJ = j(f10, this.f18936y);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f18921j;
        int i10 = 0;
        if (bVarArr == null) {
            r rVar = this.f18918g;
            float f13 = rVar.f18949f;
            r rVar2 = this.f18917f;
            float f14 = f13 - rVar2.f18949f;
            float f15 = rVar.f18950g - rVar2.f18950g;
            float f16 = (rVar.f18951h - rVar2.f18951h) + f14;
            float f17 = (rVar.f18952i - rVar2.f18952i) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            return;
        }
        double d10 = fJ;
        bVarArr[0].g(d10, this.f18930s);
        this.f18921j[0].d(d10, this.f18929r);
        float f18 = this.f18936y[0];
        while (true) {
            dArr = this.f18930s;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f18);
            i10++;
        }
        androidx.constraintlayout.core.motion.utils.b bVar = this.f18922k;
        if (bVar == null) {
            this.f18917f.t(f11, f12, fArr, this.f18928q, dArr, this.f18929r);
            return;
        }
        double[] dArr2 = this.f18929r;
        if (dArr2.length > 0) {
            bVar.d(d10, dArr2);
            this.f18922k.g(d10, this.f18930s);
            this.f18917f.t(f11, f12, fArr, this.f18928q, this.f18930s, this.f18929r);
        }
    }

    public int q() {
        int iMax = this.f18917f.f18946c;
        Iterator<r> it = this.f18935x.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f18946c);
        }
        return Math.max(iMax, this.f18918g.f18946c);
    }

    public float r() {
        return this.f18918g.f18952i;
    }

    public float s() {
        return this.f18918g.f18951h;
    }

    public float t() {
        return this.f18918g.f18949f;
    }

    public String toString() {
        return " start: x: " + this.f18917f.f18949f + " y: " + this.f18917f.f18950g + " end: x: " + this.f18918g.f18949f + " y: " + this.f18918g.f18950g;
    }

    public float u() {
        return this.f18918g.f18950g;
    }

    r w(int i10) {
        return this.f18935x.get(i10);
    }

    public int x(int i10, int[] iArr) {
        float[] fArr = new float[2];
        int i11 = 0;
        int i12 = 0;
        for (f fVar : this.f18937z) {
            int i13 = fVar.f18742d;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                int i14 = i12 + 1;
                iArr[i14] = i13;
                int i15 = i14 + 1;
                int i16 = fVar.f18739a;
                iArr[i15] = i16;
                double d10 = i16 / 100.0f;
                this.f18921j[0].d(d10, this.f18929r);
                this.f18917f.h(d10, this.f18928q, this.f18929r, fArr, 0);
                int i17 = i15 + 1;
                iArr[i17] = Float.floatToIntBits(fArr[0]);
                int i18 = i17 + 1;
                iArr[i18] = Float.floatToIntBits(fArr[1]);
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    int i19 = i18 + 1;
                    iArr[i19] = jVar.O;
                    int i20 = i19 + 1;
                    iArr[i20] = Float.floatToIntBits(jVar.K);
                    i18 = i20 + 1;
                    iArr[i18] = Float.floatToIntBits(jVar.L);
                }
                int i21 = i18 + 1;
                iArr[i12] = i21 - i12;
                i11++;
                i12 = i21;
            }
        }
        return i11;
    }

    float y(int i10, float f10, float f11) {
        r rVar = this.f18918g;
        float f12 = rVar.f18949f;
        r rVar2 = this.f18917f;
        float f13 = rVar2.f18949f;
        float f14 = f12 - f13;
        float f15 = rVar.f18950g;
        float f16 = rVar2.f18950g;
        float f17 = f15 - f16;
        float f18 = f13 + (rVar2.f18951h / 2.0f);
        float f19 = f16 + (rVar2.f18952i / 2.0f);
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f20 * f14) + (f21 * f17);
        if (i10 == 0) {
            return f22 / fHypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i10 == 2) {
            return f20 / f14;
        }
        if (i10 == 3) {
            return f21 / f14;
        }
        if (i10 == 4) {
            return f20 / f17;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public int z(int[] iArr, float[] fArr) {
        int i10 = 0;
        int i11 = 0;
        for (f fVar : this.f18937z) {
            int i12 = fVar.f18739a;
            iArr[i10] = (fVar.f18742d * 1000) + i12;
            double d10 = i12 / 100.0f;
            this.f18921j[0].d(d10, this.f18929r);
            this.f18917f.h(d10, this.f18928q, this.f18929r, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }
}
