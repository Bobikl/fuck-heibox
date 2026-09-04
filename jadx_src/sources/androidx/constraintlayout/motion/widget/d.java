package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: DesignTool.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f18708g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f18709h = "DesignTool";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap<Pair<Integer, Integer>, String> f18710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap<String, String> f18711j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f18712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f18713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18714c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f18715d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18716e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18717f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f18710i = map;
        HashMap<String, String> map2 = new HashMap<>();
        f18711j = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public d(MotionLayout motionLayout) {
        this.f18712a = motionLayout;
    }

    private static void j(int i10, androidx.constraintlayout.widget.c cVar, View view, HashMap<String, String> map, int i11, int i12) {
        String str = f18710i.get(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
        String str2 = map.get(str);
        if (str2 != null) {
            String str3 = f18711j.get(str);
            int iK = str3 != null ? k(i10, map.get(str3)) : 0;
            cVar.L(view.getId(), i11, Integer.parseInt(str2), i12, iK);
        }
    }

    private static int k(int i10, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i10) / 160.0f);
    }

    private static void l(int i10, androidx.constraintlayout.widget.c cVar, View view, HashMap<String, String> map) {
        String str = map.get("layout_editor_absoluteX");
        if (str != null) {
            cVar.W0(view.getId(), k(i10, str));
        }
        String str2 = map.get("layout_editor_absoluteY");
        if (str2 != null) {
            cVar.X0(view.getId(), k(i10, str2));
        }
    }

    private static void m(androidx.constraintlayout.widget.c cVar, View view, HashMap<String, String> map, int i10) {
        String str = map.get(i10 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i10 == 0) {
                cVar.f1(view.getId(), Float.parseFloat(str));
            } else if (i10 == 1) {
                cVar.A1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void n(int i10, androidx.constraintlayout.widget.c cVar, View view, HashMap<String, String> map, int i11) {
        String str = map.get(i11 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iK = str.equalsIgnoreCase("wrap_content") ? -2 : k(i10, str);
            if (i11 == 0) {
                cVar.W(view.getId(), iK);
            } else {
                cVar.P(view.getId(), iK);
            }
        }
    }

    public String A() {
        if (this.f18714c != null && this.f18715d != null) {
            float fY = y();
            if (fY <= 0.01f) {
                return this.f18714c;
            }
            if (fY >= 0.99f) {
                return this.f18715d;
            }
        }
        return this.f18714c;
    }

    public boolean B() {
        return (this.f18714c == null || this.f18715d == null) ? false : true;
    }

    public void C(Object obj, String str, Object obj2) {
        if (obj instanceof f) {
            ((f) obj).j(str, obj2);
            this.f18712a.R0();
            this.f18712a.f18640x1 = true;
        }
    }

    public void D(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f18714c == str) {
            return;
        }
        this.f18714c = str;
        this.f18715d = null;
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f18713b;
        }
        int iM0 = motionLayout.M0(str);
        this.f18716e = iM0;
        if (iM0 != 0) {
            if (iM0 == this.f18712a.getStartState()) {
                this.f18712a.setProgress(0.0f);
            } else if (iM0 == this.f18712a.getEndState()) {
                this.f18712a.setProgress(1.0f);
            } else {
                this.f18712a.c1(iM0);
                this.f18712a.setProgress(1.0f);
            }
        }
        this.f18712a.requestLayout();
    }

    public void E(String str, String str2) {
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f18713b;
        }
        int iM0 = motionLayout.M0(str);
        int iM1 = this.f18712a.M0(str2);
        this.f18712a.setTransition(iM0, iM1);
        this.f18716e = iM0;
        this.f18717f = iM1;
        this.f18714c = str;
        this.f18715d = str2;
    }

    public void F(Object obj, int i10) {
        o oVar;
        if ((obj instanceof View) && (oVar = this.f18712a.T.get(obj)) != null) {
            oVar.R(i10);
            this.f18712a.invalidate();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public long a() {
        return this.f18712a.getTransitionTimeMs();
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public int b(int i10, String str, Object obj, float[] fArr, int i11, float[] fArr2, int i12) {
        o oVar;
        View view = (View) obj;
        if (i10 != 0) {
            MotionLayout motionLayout = this.f18712a;
            if (motionLayout.J == null || view == null || (oVar = motionLayout.T.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            int iT = this.f18712a.J.t() / 16;
            oVar.f(fArr2, iT);
            return iT;
        }
        if (i10 == 2) {
            int iT2 = this.f18712a.J.t() / 16;
            oVar.e(fArr2, null);
            return iT2;
        }
        if (i10 != 3) {
            return -1;
        }
        int iT3 = this.f18712a.J.t() / 16;
        return oVar.l(str, fArr2, i12);
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public Boolean c(Object obj, Object obj2, float f10, float f11, String[] strArr, float[] fArr) {
        if (!(obj instanceof k)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f18712a.T.get(view).N(view, (k) obj, f10, f11, strArr, fArr);
        this.f18712a.R0();
        this.f18712a.f18640x1 = true;
        return Boolean.TRUE;
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public boolean d(Object obj, int i10, int i11, float f10, float f11) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J != null) {
            o oVar = motionLayout.T.get(obj);
            MotionLayout motionLayout2 = this.f18712a;
            int i12 = (int) (motionLayout2.W * 100.0f);
            if (oVar != null) {
                View view = (View) obj;
                if (motionLayout2.J.S(view, i12)) {
                    float fY = oVar.y(2, f10, f11);
                    float fY2 = oVar.y(5, f10, f11);
                    this.f18712a.J.l0(view, i12, "motion:percentX", Float.valueOf(fY));
                    this.f18712a.J.l0(view, i12, "motion:percentY", Float.valueOf(fY2));
                    this.f18712a.R0();
                    this.f18712a.s0(true);
                    this.f18712a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public void e(int i10, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap map = (HashMap) obj2;
        int iM0 = this.f18712a.M0(str);
        androidx.constraintlayout.widget.c cVarO = this.f18712a.J.o(iM0);
        if (cVarO == null) {
            return;
        }
        cVarO.E(view.getId());
        n(i10, cVarO, view, map, 0);
        n(i10, cVarO, view, map, 1);
        j(i10, cVarO, view, map, 6, 6);
        j(i10, cVarO, view, map, 6, 7);
        j(i10, cVarO, view, map, 7, 7);
        j(i10, cVarO, view, map, 7, 6);
        j(i10, cVarO, view, map, 1, 1);
        j(i10, cVarO, view, map, 1, 2);
        j(i10, cVarO, view, map, 2, 2);
        j(i10, cVarO, view, map, 2, 1);
        j(i10, cVarO, view, map, 3, 3);
        j(i10, cVarO, view, map, 3, 4);
        j(i10, cVarO, view, map, 4, 3);
        j(i10, cVarO, view, map, 4, 4);
        j(i10, cVarO, view, map, 5, 5);
        m(cVarO, view, map, 0);
        m(cVarO, view, map, 1);
        l(i10, cVarO, view, map);
        this.f18712a.h1(iM0, cVarO);
        this.f18712a.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public void f(float f10) {
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f18713b;
        }
        motionLayout.setProgress(f10);
        this.f18712a.s0(true);
        this.f18712a.requestLayout();
        this.f18712a.invalidate();
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public void g(Object obj, int i10, String str, Object obj2) {
        s sVar = this.f18712a.J;
        if (sVar != null) {
            sVar.l0((View) obj, i10, str, obj2);
            MotionLayout motionLayout = this.f18712a;
            motionLayout.f18615c0 = i10 / 100.0f;
            motionLayout.f18611a0 = 0.0f;
            motionLayout.R0();
            this.f18712a.s0(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public float h(Object obj, int i10, float f10, float f11) {
        o oVar;
        if ((obj instanceof View) && (oVar = this.f18712a.T.get((View) obj)) != null) {
            return oVar.y(i10, f10, f11);
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.u
    public Object i(Object obj, float f10, float f11) {
        o oVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J == null) {
            return -1;
        }
        if (view == null || (oVar = motionLayout.T.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.B(viewGroup.getWidth(), viewGroup.getHeight(), f10, f11);
    }

    public void o(boolean z10) {
        this.f18712a.o0(z10);
    }

    public void p(String str) {
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f18713b;
        }
        int iM0 = motionLayout.M0(str);
        System.out.println(" dumping  " + str + " (" + iM0 + ")");
        try {
            this.f18712a.J.o(iM0).g0(this.f18712a.J, new int[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public int q(Object obj, float[] fArr) {
        s sVar = this.f18712a.J;
        if (sVar == null) {
            return -1;
        }
        int iT = sVar.t() / 16;
        o oVar = this.f18712a.T.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.e(fArr, null);
        return iT;
    }

    public int r(Object obj, float[] fArr, int i10) {
        MotionLayout motionLayout = this.f18712a;
        if (motionLayout.J == null) {
            return -1;
        }
        o oVar = motionLayout.T.get(obj);
        if (oVar == null) {
            return 0;
        }
        oVar.f(fArr, i10);
        return i10;
    }

    public void s(Object obj, float[] fArr) {
        s sVar = this.f18712a.J;
        if (sVar == null) {
            return;
        }
        int iT = sVar.t() / 16;
        o oVar = this.f18712a.T.get(obj);
        if (oVar == null) {
            return;
        }
        oVar.h(fArr, iT);
    }

    public String t() {
        int endState = this.f18712a.getEndState();
        if (this.f18717f == endState) {
            return this.f18715d;
        }
        String strA0 = this.f18712a.A0(endState);
        if (strA0 != null) {
            this.f18715d = strA0;
            this.f18717f = endState;
        }
        return strA0;
    }

    public int u(Object obj, int i10, int[] iArr) {
        o oVar = this.f18712a.T.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.x(i10, iArr);
    }

    public int v(Object obj, int[] iArr, float[] fArr) {
        o oVar = this.f18712a.T.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.z(iArr, fArr);
    }

    public Object w(int i10, int i11, int i12) {
        MotionLayout motionLayout = this.f18712a;
        s sVar = motionLayout.J;
        if (sVar == null) {
            return null;
        }
        return sVar.y(motionLayout.getContext(), i10, i11, i12);
    }

    public Object x(Object obj, int i10, int i11) {
        if (this.f18712a.J == null) {
            return null;
        }
        int id2 = ((View) obj).getId();
        MotionLayout motionLayout = this.f18712a;
        return motionLayout.J.y(motionLayout.getContext(), i10, id2, i11);
    }

    public float y() {
        return this.f18712a.getProgress();
    }

    public String z() {
        int startState = this.f18712a.getStartState();
        if (this.f18716e == startState) {
            return this.f18714c;
        }
        String strA0 = this.f18712a.A0(startState);
        if (strA0 != null) {
            this.f18714c = strA0;
            this.f18716e = startState;
        }
        return this.f18712a.A0(startState);
    }
}
