package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
public class n implements Comparable<n> {
    public static final String E = "MotionPaths";
    public static final boolean F = false;
    static final int G = 1;
    static final int H = 2;
    static String[] I = {CommonNetImpl.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f18876d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f18889q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f18891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f18892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f18893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f18894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f18895w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f18874b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f18875c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18877e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f18878f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f18879g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f18880h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18881i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f18882j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f18883k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f18884l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f18885m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f18886n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18887o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f18888p = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18890r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f18896x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f18897y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f18898z = -1;
    LinkedHashMap<String, ConstraintAttribute> A = new LinkedHashMap<>();
    int B = 0;
    double[] C = new double[18];
    double[] D = new double[18];

    private boolean e(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.c> map, int i10) {
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.c cVar = map.get(str);
            str.hashCode();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b10 = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b10 = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 7;
                    }
                    break;
                case -760884510:
                    if (str.equals(f.f18724l)) {
                        b10 = 8;
                    }
                    break;
                case -760884509:
                    if (str.equals(f.f18725m)) {
                        b10 = 9;
                    }
                    break;
                case -40300674:
                    if (str.equals(f.f18721i)) {
                        b10 = 10;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b10 = 11;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b10 = 12;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 13;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    cVar.g(i10, Float.isNaN(this.f18880h) ? 0.0f : this.f18880h);
                    break;
                case 1:
                    cVar.g(i10, Float.isNaN(this.f18881i) ? 0.0f : this.f18881i);
                    break;
                case 2:
                    cVar.g(i10, Float.isNaN(this.f18886n) ? 0.0f : this.f18886n);
                    break;
                case 3:
                    cVar.g(i10, Float.isNaN(this.f18887o) ? 0.0f : this.f18887o);
                    break;
                case 4:
                    cVar.g(i10, Float.isNaN(this.f18888p) ? 0.0f : this.f18888p);
                    break;
                case 5:
                    cVar.g(i10, Float.isNaN(this.f18897y) ? 0.0f : this.f18897y);
                    break;
                case 6:
                    cVar.g(i10, Float.isNaN(this.f18882j) ? 1.0f : this.f18882j);
                    break;
                case 7:
                    cVar.g(i10, Float.isNaN(this.f18883k) ? 1.0f : this.f18883k);
                    break;
                case 8:
                    cVar.g(i10, Float.isNaN(this.f18884l) ? 0.0f : this.f18884l);
                    break;
                case 9:
                    cVar.g(i10, Float.isNaN(this.f18885m) ? 0.0f : this.f18885m);
                    break;
                case 10:
                    cVar.g(i10, Float.isNaN(this.f18879g) ? 0.0f : this.f18879g);
                    break;
                case 11:
                    cVar.g(i10, Float.isNaN(this.f18878f) ? 0.0f : this.f18878f);
                    break;
                case 12:
                    cVar.g(i10, Float.isNaN(this.f18896x) ? 0.0f : this.f18896x);
                    break;
                case 13:
                    cVar.g(i10, Float.isNaN(this.f18874b) ? 1.0f : this.f18874b);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                        if (this.A.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.A.get(str2);
                            if (cVar instanceof androidx.constraintlayout.motion.utils.c.b) {
                                ((androidx.constraintlayout.motion.utils.c.b) cVar).n(i10, constraintAttribute);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + constraintAttribute.f() + cVar);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public void b(View view) {
        this.f18876d = view.getVisibility();
        this.f18874b = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f18877e = false;
        this.f18878f = view.getElevation();
        this.f18879g = view.getRotation();
        this.f18880h = view.getRotationX();
        this.f18881i = view.getRotationY();
        this.f18882j = view.getScaleX();
        this.f18883k = view.getScaleY();
        this.f18884l = view.getPivotX();
        this.f18885m = view.getPivotY();
        this.f18886n = view.getTranslationX();
        this.f18887o = view.getTranslationY();
        this.f18888p = view.getTranslationZ();
    }

    public void c(androidx.constraintlayout.widget.c.a aVar) {
        androidx.constraintlayout.widget.c.d dVar = aVar.f19562c;
        int i10 = dVar.f19684c;
        this.f18875c = i10;
        int i11 = dVar.f19683b;
        this.f18876d = i11;
        this.f18874b = (i11 == 0 || i10 != 0) ? dVar.f19685d : 0.0f;
        androidx.constraintlayout.widget.c.e eVar = aVar.f19565f;
        this.f18877e = eVar.f19711m;
        this.f18878f = eVar.f19712n;
        this.f18879g = eVar.f19700b;
        this.f18880h = eVar.f19701c;
        this.f18881i = eVar.f19702d;
        this.f18882j = eVar.f19703e;
        this.f18883k = eVar.f19704f;
        this.f18884l = eVar.f19705g;
        this.f18885m = eVar.f19706h;
        this.f18886n = eVar.f19708j;
        this.f18887o = eVar.f19709k;
        this.f18888p = eVar.f19710l;
        this.f18889q = androidx.constraintlayout.core.motion.utils.d.c(aVar.f19563d.f19671d);
        androidx.constraintlayout.widget.c.C0117c c0117c = aVar.f19563d;
        this.f18896x = c0117c.f19676i;
        this.f18890r = c0117c.f19673f;
        this.f18898z = c0117c.f19669b;
        this.f18897y = aVar.f19562c.f19686e;
        for (String str : aVar.f19566g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f19566g.get(str);
            if (constraintAttribute.h()) {
                this.A.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return Float.compare(this.f18891s, nVar.f18891s);
    }

    void f(n nVar, HashSet<String> hashSet) {
        if (e(this.f18874b, nVar.f18874b)) {
            hashSet.add("alpha");
        }
        if (e(this.f18878f, nVar.f18878f)) {
            hashSet.add("elevation");
        }
        int i10 = this.f18876d;
        int i11 = nVar.f18876d;
        if (i10 != i11 && this.f18875c == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add("alpha");
        }
        if (e(this.f18879g, nVar.f18879g)) {
            hashSet.add(f.f18721i);
        }
        if (!Float.isNaN(this.f18896x) || !Float.isNaN(nVar.f18896x)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f18897y) || !Float.isNaN(nVar.f18897y)) {
            hashSet.add("progress");
        }
        if (e(this.f18880h, nVar.f18880h)) {
            hashSet.add("rotationX");
        }
        if (e(this.f18881i, nVar.f18881i)) {
            hashSet.add("rotationY");
        }
        if (e(this.f18884l, nVar.f18884l)) {
            hashSet.add(f.f18724l);
        }
        if (e(this.f18885m, nVar.f18885m)) {
            hashSet.add(f.f18725m);
        }
        if (e(this.f18882j, nVar.f18882j)) {
            hashSet.add("scaleX");
        }
        if (e(this.f18883k, nVar.f18883k)) {
            hashSet.add("scaleY");
        }
        if (e(this.f18886n, nVar.f18886n)) {
            hashSet.add("translationX");
        }
        if (e(this.f18887o, nVar.f18887o)) {
            hashSet.add("translationY");
        }
        if (e(this.f18888p, nVar.f18888p)) {
            hashSet.add("translationZ");
        }
    }

    void g(n nVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | e(this.f18891s, nVar.f18891s);
        zArr[1] = zArr[1] | e(this.f18892t, nVar.f18892t);
        zArr[2] = zArr[2] | e(this.f18893u, nVar.f18893u);
        zArr[3] = zArr[3] | e(this.f18894v, nVar.f18894v);
        zArr[4] = e(this.f18895w, nVar.f18895w) | zArr[4];
    }

    void h(double[] dArr, int[] iArr) {
        float[] fArr = {this.f18891s, this.f18892t, this.f18893u, this.f18894v, this.f18895w, this.f18874b, this.f18878f, this.f18879g, this.f18880h, this.f18881i, this.f18882j, this.f18883k, this.f18884l, this.f18885m, this.f18886n, this.f18887o, this.f18888p, this.f18896x};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    int i(String str, double[] dArr, int i10) {
        ConstraintAttribute constraintAttribute = this.A.get(str);
        if (constraintAttribute.i() == 1) {
            dArr[i10] = constraintAttribute.f();
            return 1;
        }
        int i11 = constraintAttribute.i();
        float[] fArr = new float[i11];
        constraintAttribute.g(fArr);
        int i12 = 0;
        while (i12 < i11) {
            dArr[i10] = fArr[i12];
            i12++;
            i10++;
        }
        return i11;
    }

    int j(String str) {
        return this.A.get(str).i();
    }

    boolean k(String str) {
        return this.A.containsKey(str);
    }

    void l(float f10, float f11, float f12, float f13) {
        this.f18892t = f10;
        this.f18893u = f11;
        this.f18894v = f12;
        this.f18895w = f13;
    }

    public void m(Rect rect, View view, int i10, float f10) {
        l(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.f18884l = Float.NaN;
        this.f18885m = Float.NaN;
        if (i10 == 1) {
            this.f18879g = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f18879g = f10 + 90.0f;
        }
    }

    public void n(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        l(rect.left, rect.top, rect.width(), rect.height());
        c(cVar.q0(i11));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f18879g + 90.0f;
            this.f18879g = f10;
            if (f10 > 180.0f) {
                this.f18879g = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f18879g -= 90.0f;
    }

    public void o(View view) {
        l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
