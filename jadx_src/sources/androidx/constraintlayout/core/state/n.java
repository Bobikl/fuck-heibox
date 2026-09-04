package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18158i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18159j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18160k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f18161l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f18162m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f18163n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f18164o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f18165p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f18166q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f18167r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f18168s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f18169t = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, b> f18170a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HashMap<Integer, HashMap<String, a>> f18171b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18172c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18173d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18174e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18175f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18176g = 400;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f18177h = 0.0f;

    /* JADX INFO: compiled from: Transition.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f18179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f18181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f18182e;

        public a(String str, int i10, int i11, float f10, float f11) {
            this.f18179b = str;
            this.f18178a = i10;
            this.f18180c = i11;
            this.f18181d = f10;
            this.f18182e = f11;
        }
    }

    /* JADX INFO: compiled from: Transition.java */
    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.core.motion.b f18186d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.g f18190h = new androidx.constraintlayout.core.motion.utils.g();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f18191i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f18192j = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        o f18183a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o f18184b = new o();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        o f18185c = new o();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.constraintlayout.core.motion.e f18187e = new androidx.constraintlayout.core.motion.e(this.f18183a);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.constraintlayout.core.motion.e f18188f = new androidx.constraintlayout.core.motion.e(this.f18184b);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.e f18189g = new androidx.constraintlayout.core.motion.e(this.f18185c);

        public b() {
            androidx.constraintlayout.core.motion.b bVar = new androidx.constraintlayout.core.motion.b(this.f18187e);
            this.f18186d = bVar;
            bVar.U(this.f18187e);
            this.f18186d.S(this.f18188f);
        }

        public o a(int i10) {
            if (i10 == 0) {
                return this.f18183a;
            }
            return i10 == 1 ? this.f18184b : this.f18185c;
        }

        public void b(int i10, int i11, float f10, n nVar) {
            this.f18191i = i11;
            this.f18192j = i10;
            this.f18186d.Y(i10, i11, 1.0f, System.nanoTime());
            o.m(i10, i11, this.f18185c, this.f18183a, this.f18184b, nVar, f10);
            this.f18185c.f18211q = f10;
            this.f18186d.L(this.f18189g, f10, System.nanoTime(), this.f18190h);
        }

        public void c(u uVar) {
            androidx.constraintlayout.core.motion.key.c cVar = new androidx.constraintlayout.core.motion.key.c();
            uVar.g(cVar);
            this.f18186d.a(cVar);
        }

        public void d(u uVar) {
            androidx.constraintlayout.core.motion.key.d dVar = new androidx.constraintlayout.core.motion.key.d();
            uVar.g(dVar);
            this.f18186d.a(dVar);
        }

        public void e(u uVar) {
            androidx.constraintlayout.core.motion.key.e eVar = new androidx.constraintlayout.core.motion.key.e();
            uVar.g(eVar);
            this.f18186d.a(eVar);
        }

        public void f(ConstraintWidget constraintWidget, int i10) {
            if (i10 == 0) {
                this.f18183a.A(constraintWidget);
                this.f18186d.U(this.f18187e);
            } else if (i10 == 1) {
                this.f18184b.A(constraintWidget);
                this.f18186d.S(this.f18188f);
            }
            this.f18192j = -1;
        }
    }

    private b G(String str) {
        return this.f18170a.get(str);
    }

    private b H(String str, ConstraintWidget constraintWidget, int i10) {
        b bVar = this.f18170a.get(str);
        if (bVar == null) {
            bVar = new b();
            int i11 = this.f18172c;
            if (i11 != -1) {
                bVar.f18186d.T(i11);
            }
            this.f18170a.put(str, bVar);
            if (constraintWidget != null) {
                bVar.f(constraintWidget, i10);
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float L(String str, float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c(str).a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float M(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("standard").a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float N(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("accelerate").a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float O(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("decelerate").a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float P(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c(sd.b.f139390h).a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float Q(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("anticipate").a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float R(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("overshoot").a(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float S(float f10) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f10);
    }

    public static androidx.constraintlayout.core.state.b z(int i10, final String str) {
        switch (i10) {
            case -1:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.f
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.L(str, f10);
                    }
                };
            case 0:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.g
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.M(f10);
                    }
                };
            case 1:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.h
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.N(f10);
                    }
                };
            case 2:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.i
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.O(f10);
                    }
                };
            case 3:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.j
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.P(f10);
                    }
                };
            case 4:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.m
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.S(f10);
                    }
                };
            case 5:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.l
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.R(f10);
                    }
                };
            case 6:
                return new androidx.constraintlayout.core.state.b() { // from class: androidx.constraintlayout.core.state.k
                    @Override // androidx.constraintlayout.core.state.b
                    public final float getInterpolation(float f10) {
                        return n.Q(f10);
                    }
                };
            default:
                return null;
        }
    }

    public int A(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f18170a.get(str).f18186d.e(fArr, iArr, iArr2);
    }

    public androidx.constraintlayout.core.motion.b B(String str) {
        return H(str, null, 0).f18186d;
    }

    public int C(o oVar) {
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f18171b.get(Integer.valueOf(i11));
            if (map != null && map.get(oVar.f18195a.f18280o) != null) {
                i10++;
            }
        }
        return i10;
    }

    public float[] D(String str) {
        float[] fArr = new float[124];
        this.f18170a.get(str).f18186d.f(fArr, 62);
        return fArr;
    }

    public o E(ConstraintWidget constraintWidget) {
        return H(constraintWidget.f18280o, null, 0).f18183a;
    }

    public o F(String str) {
        b bVar = this.f18170a.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f18183a;
    }

    public boolean I() {
        return this.f18171b.size() > 0;
    }

    public void J(int i10, int i11, float f10) {
        Iterator<String> it = this.f18170a.keySet().iterator();
        while (it.hasNext()) {
            this.f18170a.get(it.next()).b(i10, i11, f10, this);
        }
    }

    public boolean K() {
        return this.f18170a.isEmpty();
    }

    public void T(u uVar) {
        this.f18172c = uVar.i(509);
        this.f18175f = uVar.i(704);
    }

    public void U(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        ArrayList<ConstraintWidget> arrayListF2 = dVar.f2();
        int size = arrayListF2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = arrayListF2.get(i11);
            H(constraintWidget.f18280o, null, i10).f(constraintWidget, i10);
        }
    }

    public void i(int i10, String str, String str2, int i11) {
        H(str, null, i10).a(i10).c(str2, i11);
    }

    public void j(int i10, String str, String str2, float f10) {
        H(str, null, i10).a(i10).d(str2, f10);
    }

    public void k(String str, u uVar) {
        H(str, null, 0).c(uVar);
    }

    public void l(String str, u uVar) {
        H(str, null, 0).d(uVar);
    }

    public void m(String str, int i10, int i11, float f10, float f11) {
        u uVar = new u();
        uVar.b(510, 2);
        uVar.b(100, i10);
        uVar.a(506, f10);
        uVar.a(507, f11);
        H(str, null, 0).e(uVar);
        a aVar = new a(str, i10, i11, f10, f11);
        HashMap<String, a> map = this.f18171b.get(Integer.valueOf(i10));
        if (map == null) {
            map = new HashMap<>();
            this.f18171b.put(Integer.valueOf(i10), map);
        }
        map.put(str, aVar);
    }

    public void n(String str, u uVar) {
        H(str, null, 0).e(uVar);
    }

    public void o() {
        this.f18170a.clear();
    }

    public boolean p(String str) {
        return this.f18170a.containsKey(str);
    }

    public void q(o oVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap<String, a> map = this.f18171b.get(Integer.valueOf(i11));
            if (map != null && (aVar = map.get(oVar.f18195a.f18280o)) != null) {
                fArr[i10] = aVar.f18181d;
                fArr2[i10] = aVar.f18182e;
                fArr3[i10] = aVar.f18178a;
                i10++;
            }
        }
    }

    public a r(String str, int i10) {
        a aVar;
        while (i10 <= 100) {
            HashMap<String, a> map = this.f18171b.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10++;
        }
        return null;
    }

    public a s(String str, int i10) {
        a aVar;
        while (i10 >= 0) {
            HashMap<String, a> map = this.f18171b.get(Integer.valueOf(i10));
            if (map != null && (aVar = map.get(str)) != null) {
                return aVar;
            }
            i10--;
        }
        return null;
    }

    public int t() {
        return this.f18175f;
    }

    public o u(ConstraintWidget constraintWidget) {
        return H(constraintWidget.f18280o, null, 1).f18184b;
    }

    public o v(String str) {
        b bVar = this.f18170a.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f18184b;
    }

    public o w(ConstraintWidget constraintWidget) {
        return H(constraintWidget.f18280o, null, 2).f18185c;
    }

    public o x(String str) {
        b bVar = this.f18170a.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f18185c;
    }

    public androidx.constraintlayout.core.state.b y() {
        return z(this.f18173d, this.f18174e);
    }
}
