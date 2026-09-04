package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.e0;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements Comparable<c> {
    public static final String E = "MotionPaths";
    public static final boolean F = false;
    static final int G = 1;
    static final int H = 2;
    static String[] I = {CommonNetImpl.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f17454d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f17467q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f17469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f17470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f17471u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f17472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f17473w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f17452b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17453c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17455e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f17456f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f17457g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17458h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17459i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f17460j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f17461k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f17462l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f17463m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f17464n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f17465o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f17466p = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17468r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f17474x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f17475y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17476z = -1;
    LinkedHashMap<String, a> A = new LinkedHashMap<>();
    int B = 0;
    double[] C = new double[18];
    double[] D = new double[18];

    private boolean d(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, o> map, int i10) {
        for (String str : map.keySet()) {
            o oVar = map.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b10 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b10 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b10 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b10 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b10 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b10 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = 11;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b10 = 12;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    oVar.g(i10, Float.isNaN(this.f17458h) ? 0.0f : this.f17458h);
                    break;
                case 1:
                    oVar.g(i10, Float.isNaN(this.f17459i) ? 0.0f : this.f17459i);
                    break;
                case 2:
                    oVar.g(i10, Float.isNaN(this.f17457g) ? 0.0f : this.f17457g);
                    break;
                case 3:
                    oVar.g(i10, Float.isNaN(this.f17464n) ? 0.0f : this.f17464n);
                    break;
                case 4:
                    oVar.g(i10, Float.isNaN(this.f17465o) ? 0.0f : this.f17465o);
                    break;
                case 5:
                    oVar.g(i10, Float.isNaN(this.f17466p) ? 0.0f : this.f17466p);
                    break;
                case 6:
                    oVar.g(i10, Float.isNaN(this.f17475y) ? 0.0f : this.f17475y);
                    break;
                case 7:
                    oVar.g(i10, Float.isNaN(this.f17462l) ? 0.0f : this.f17462l);
                    break;
                case 8:
                    oVar.g(i10, Float.isNaN(this.f17463m) ? 0.0f : this.f17463m);
                    break;
                case 9:
                    oVar.g(i10, Float.isNaN(this.f17460j) ? 1.0f : this.f17460j);
                    break;
                case 10:
                    oVar.g(i10, Float.isNaN(this.f17461k) ? 1.0f : this.f17461k);
                    break;
                case 11:
                    oVar.g(i10, Float.isNaN(this.f17452b) ? 1.0f : this.f17452b);
                    break;
                case 12:
                    oVar.g(i10, Float.isNaN(this.f17474x) ? 0.0f : this.f17474x);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                        if (this.A.containsKey(str2)) {
                            a aVar = this.A.get(str2);
                            if (oVar instanceof o.c) {
                                ((o.c) oVar).k(i10, aVar);
                            } else {
                                e0.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + aVar.n() + oVar);
                            }
                        }
                    } else {
                        e0.f("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public void b(e eVar) {
        this.f17454d = eVar.B();
        this.f17452b = eVar.B() != 4 ? 0.0f : eVar.g();
        this.f17455e = false;
        this.f17457g = eVar.t();
        this.f17458h = eVar.r();
        this.f17459i = eVar.s();
        this.f17460j = eVar.u();
        this.f17461k = eVar.v();
        this.f17462l = eVar.o();
        this.f17463m = eVar.p();
        this.f17464n = eVar.x();
        this.f17465o = eVar.y();
        this.f17466p = eVar.z();
        for (String str : eVar.j()) {
            a aVarI = eVar.i(str);
            if (aVarI != null && aVarI.q()) {
                this.A.put(str, aVarI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        return Float.compare(this.f17469s, cVar.f17469s);
    }

    void e(c cVar, HashSet<String> hashSet) {
        if (d(this.f17452b, cVar.f17452b)) {
            hashSet.add("alpha");
        }
        if (d(this.f17456f, cVar.f17456f)) {
            hashSet.add("translationZ");
        }
        int i10 = this.f17454d;
        int i11 = cVar.f17454d;
        if (i10 != i11 && this.f17453c == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (d(this.f17457g, cVar.f17457g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f17474x) || !Float.isNaN(cVar.f17474x)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f17475y) || !Float.isNaN(cVar.f17475y)) {
            hashSet.add("progress");
        }
        if (d(this.f17458h, cVar.f17458h)) {
            hashSet.add("rotationX");
        }
        if (d(this.f17459i, cVar.f17459i)) {
            hashSet.add("rotationY");
        }
        if (d(this.f17462l, cVar.f17462l)) {
            hashSet.add("pivotX");
        }
        if (d(this.f17463m, cVar.f17463m)) {
            hashSet.add("pivotY");
        }
        if (d(this.f17460j, cVar.f17460j)) {
            hashSet.add("scaleX");
        }
        if (d(this.f17461k, cVar.f17461k)) {
            hashSet.add("scaleY");
        }
        if (d(this.f17464n, cVar.f17464n)) {
            hashSet.add("translationX");
        }
        if (d(this.f17465o, cVar.f17465o)) {
            hashSet.add("translationY");
        }
        if (d(this.f17466p, cVar.f17466p)) {
            hashSet.add("translationZ");
        }
        if (d(this.f17456f, cVar.f17456f)) {
            hashSet.add("elevation");
        }
    }

    void f(c cVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | d(this.f17469s, cVar.f17469s);
        zArr[1] = zArr[1] | d(this.f17470t, cVar.f17470t);
        zArr[2] = zArr[2] | d(this.f17471u, cVar.f17471u);
        zArr[3] = zArr[3] | d(this.f17472v, cVar.f17472v);
        zArr[4] = d(this.f17473w, cVar.f17473w) | zArr[4];
    }

    void g(double[] dArr, int[] iArr) {
        float[] fArr = {this.f17469s, this.f17470t, this.f17471u, this.f17472v, this.f17473w, this.f17452b, this.f17456f, this.f17457g, this.f17458h, this.f17459i, this.f17460j, this.f17461k, this.f17462l, this.f17463m, this.f17464n, this.f17465o, this.f17466p, this.f17474x};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    int h(String str, double[] dArr, int i10) {
        a aVar = this.A.get(str);
        if (aVar.r() == 1) {
            dArr[i10] = aVar.n();
            return 1;
        }
        int iR = aVar.r();
        float[] fArr = new float[iR];
        aVar.o(fArr);
        int i11 = 0;
        while (i11 < iR) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    int i(String str) {
        return this.A.get(str).r();
    }

    boolean j(String str) {
        return this.A.containsKey(str);
    }

    void k(float f10, float f11, float f12, float f13) {
        this.f17470t = f10;
        this.f17471u = f11;
        this.f17472v = f12;
        this.f17473w = f13;
    }

    public void l(e eVar) {
        k(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        b(eVar);
    }

    public void m(m mVar, e eVar, int i10, float f10) {
        k(mVar.f17766b, mVar.f17768d, mVar.b(), mVar.a());
        b(eVar);
        this.f17462l = Float.NaN;
        this.f17463m = Float.NaN;
        if (i10 == 1) {
            this.f17457g = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f17457g = f10 + 90.0f;
        }
    }
}
