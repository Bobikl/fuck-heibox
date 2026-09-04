package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: WidgetFrame.java */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f18193u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static float f18194v = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidget f18195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f18207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.core.motion.a> f18213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f18214t;

    public o() {
        this.f18195a = null;
        this.f18196b = 0;
        this.f18197c = 0;
        this.f18198d = 0;
        this.f18199e = 0;
        this.f18200f = Float.NaN;
        this.f18201g = Float.NaN;
        this.f18202h = Float.NaN;
        this.f18203i = Float.NaN;
        this.f18204j = Float.NaN;
        this.f18205k = Float.NaN;
        this.f18206l = Float.NaN;
        this.f18207m = Float.NaN;
        this.f18208n = Float.NaN;
        this.f18209o = Float.NaN;
        this.f18210p = Float.NaN;
        this.f18211q = Float.NaN;
        this.f18212r = 0;
        this.f18213s = new HashMap<>();
        this.f18214t = null;
    }

    public o(o oVar) {
        this.f18195a = null;
        this.f18196b = 0;
        this.f18197c = 0;
        this.f18198d = 0;
        this.f18199e = 0;
        this.f18200f = Float.NaN;
        this.f18201g = Float.NaN;
        this.f18202h = Float.NaN;
        this.f18203i = Float.NaN;
        this.f18204j = Float.NaN;
        this.f18205k = Float.NaN;
        this.f18206l = Float.NaN;
        this.f18207m = Float.NaN;
        this.f18208n = Float.NaN;
        this.f18209o = Float.NaN;
        this.f18210p = Float.NaN;
        this.f18211q = Float.NaN;
        this.f18212r = 0;
        this.f18213s = new HashMap<>();
        this.f18214t = null;
        this.f18195a = oVar.f18195a;
        this.f18196b = oVar.f18196b;
        this.f18197c = oVar.f18197c;
        this.f18198d = oVar.f18198d;
        this.f18199e = oVar.f18199e;
        B(oVar);
    }

    public o(ConstraintWidget constraintWidget) {
        this.f18195a = null;
        this.f18196b = 0;
        this.f18197c = 0;
        this.f18198d = 0;
        this.f18199e = 0;
        this.f18200f = Float.NaN;
        this.f18201g = Float.NaN;
        this.f18202h = Float.NaN;
        this.f18203i = Float.NaN;
        this.f18204j = Float.NaN;
        this.f18205k = Float.NaN;
        this.f18206l = Float.NaN;
        this.f18207m = Float.NaN;
        this.f18208n = Float.NaN;
        this.f18209o = Float.NaN;
        this.f18210p = Float.NaN;
        this.f18211q = Float.NaN;
        this.f18212r = 0;
        this.f18213s = new HashMap<>();
        this.f18214t = null;
        this.f18195a = constraintWidget;
    }

    private static void a(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private static float l(float f10, float f11, float f12, float f13) {
        boolean zIsNaN = Float.isNaN(f10);
        boolean zIsNaN2 = Float.isNaN(f11);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f10 = f12;
        }
        if (zIsNaN2) {
            f11 = f12;
        }
        return f10 + (f13 * (f11 - f10));
    }

    public static void m(int i10, int i11, o oVar, o oVar2, o oVar3, n nVar, float f10) {
        int i12;
        float f11;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        int i17;
        float f13 = 100.0f * f10;
        int i18 = (int) f13;
        int i19 = oVar2.f18196b;
        int i20 = oVar2.f18197c;
        int i21 = oVar3.f18196b;
        int i22 = oVar3.f18197c;
        int i23 = oVar2.f18198d - i19;
        int i24 = oVar2.f18199e - i20;
        int i25 = oVar3.f18198d - i21;
        int i26 = oVar3.f18199e - i22;
        float f14 = oVar2.f18210p;
        float f15 = oVar3.f18210p;
        if (oVar2.f18212r == 8) {
            i19 = (int) (i19 - (i25 / 2.0f));
            i20 = (int) (i20 - (i26 / 2.0f));
            if (Float.isNaN(f14)) {
                i13 = i26;
                i12 = i25;
                f11 = 0.0f;
            } else {
                f11 = f14;
                i12 = i25;
                i13 = i26;
            }
        } else {
            i12 = i23;
            f11 = f14;
            i13 = i24;
        }
        if (oVar3.f18212r == 8) {
            i21 = (int) (i21 - (i12 / 2.0f));
            i22 = (int) (i22 - (i13 / 2.0f));
            i25 = i12;
            i26 = i13;
            if (Float.isNaN(f15)) {
                f15 = 0.0f;
            }
        }
        if (Float.isNaN(f11) && !Float.isNaN(f15)) {
            f11 = 1.0f;
        }
        if (!Float.isNaN(f11) && Float.isNaN(f15)) {
            f15 = 1.0f;
        }
        float f16 = oVar2.f18212r == 4 ? 0.0f : f11;
        float f17 = oVar3.f18212r == 4 ? 0.0f : f15;
        if (oVar.f18195a == null || !nVar.I()) {
            i14 = i19;
            f12 = f10;
        } else {
            n.a aVarS = nVar.s(oVar.f18195a.f18280o, i18);
            i14 = i19;
            n.a aVarR = nVar.r(oVar.f18195a.f18280o, i18);
            if (aVarS == aVarR) {
                aVarR = null;
            }
            if (aVarS != null) {
                i14 = (int) (aVarS.f18181d * i10);
                i16 = i11;
                i20 = (int) (aVarS.f18182e * i16);
                i15 = aVarS.f18178a;
            } else {
                i15 = 0;
                i16 = i11;
            }
            if (aVarR != null) {
                int i27 = (int) (aVarR.f18181d * i10);
                int i28 = (int) (aVarR.f18182e * i16);
                i17 = aVarR.f18178a;
                i21 = i27;
                i22 = i28;
            } else {
                i17 = 100;
            }
            f12 = (f13 - i15) / (i17 - i15);
        }
        int i29 = i14;
        oVar.f18195a = oVar2.f18195a;
        int i30 = (int) (i29 + ((i21 - i29) * f12));
        oVar.f18196b = i30;
        int i31 = (int) (i20 + (f12 * (i22 - i20)));
        oVar.f18197c = i31;
        float f18 = 1.0f - f10;
        oVar.f18198d = i30 + ((int) ((i12 * f18) + (i25 * f10)));
        oVar.f18199e = i31 + ((int) ((f18 * i13) + (i26 * f10)));
        oVar.f18200f = l(oVar2.f18200f, oVar3.f18200f, 0.5f, f10);
        oVar.f18201g = l(oVar2.f18201g, oVar3.f18201g, 0.5f, f10);
        oVar.f18202h = l(oVar2.f18202h, oVar3.f18202h, 0.0f, f10);
        oVar.f18203i = l(oVar2.f18203i, oVar3.f18203i, 0.0f, f10);
        oVar.f18204j = l(oVar2.f18204j, oVar3.f18204j, 0.0f, f10);
        oVar.f18208n = l(oVar2.f18208n, oVar3.f18208n, 1.0f, f10);
        oVar.f18209o = l(oVar2.f18209o, oVar3.f18209o, 1.0f, f10);
        oVar.f18205k = l(oVar2.f18205k, oVar3.f18205k, 0.0f, f10);
        oVar.f18206l = l(oVar2.f18206l, oVar3.f18206l, 0.0f, f10);
        oVar.f18207m = l(oVar2.f18207m, oVar3.f18207m, 0.0f, f10);
        oVar.f18210p = l(f16, f17, 1.0f, f10);
    }

    private void t(StringBuilder sb2, ConstraintAnchor.Type type) {
        ConstraintAnchor constraintAnchorR = this.f18195a.r(type);
        if (constraintAnchorR == null || constraintAnchorR.f18222f == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(type.name());
        sb2.append(": ['");
        String str = constraintAnchorR.f18222f.i().f18280o;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(constraintAnchorR.f18222f.l().name());
        sb2.append("', '");
        sb2.append(constraintAnchorR.f18223g);
        sb2.append("'],\n");
    }

    public o A(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.f18195a = constraintWidget;
        z();
        return this;
    }

    public void B(o oVar) {
        this.f18200f = oVar.f18200f;
        this.f18201g = oVar.f18201g;
        this.f18202h = oVar.f18202h;
        this.f18203i = oVar.f18203i;
        this.f18204j = oVar.f18204j;
        this.f18205k = oVar.f18205k;
        this.f18206l = oVar.f18206l;
        this.f18207m = oVar.f18207m;
        this.f18208n = oVar.f18208n;
        this.f18209o = oVar.f18209o;
        this.f18210p = oVar.f18210p;
        this.f18212r = oVar.f18212r;
        this.f18213s.clear();
        for (androidx.constraintlayout.core.motion.a aVar : oVar.f18213s.values()) {
            this.f18213s.put(aVar.k(), aVar.d());
        }
    }

    public int C() {
        return Math.max(0, this.f18198d - this.f18196b);
    }

    public void c(String str, int i10) {
        v(str, 902, i10);
    }

    public void d(String str, float f10) {
        u(str, 901, f10);
    }

    public float e() {
        int i10 = this.f18196b;
        return i10 + ((this.f18198d - i10) / 2.0f);
    }

    public float f() {
        int i10 = this.f18197c;
        return i10 + ((this.f18199e - i10) / 2.0f);
    }

    public androidx.constraintlayout.core.motion.a g(String str) {
        return this.f18213s.get(str);
    }

    public Set<String> h() {
        return this.f18213s.keySet();
    }

    public int i(String str) {
        if (this.f18213s.containsKey(str)) {
            return this.f18213s.get(str).g();
        }
        return -21880;
    }

    public float j(String str) {
        if (this.f18213s.containsKey(str)) {
            return this.f18213s.get(str).h();
        }
        return Float.NaN;
    }

    public int k() {
        return Math.max(0, this.f18199e - this.f18197c);
    }

    public boolean n() {
        return Float.isNaN(this.f18202h) && Float.isNaN(this.f18203i) && Float.isNaN(this.f18204j) && Float.isNaN(this.f18205k) && Float.isNaN(this.f18206l) && Float.isNaN(this.f18207m) && Float.isNaN(this.f18208n) && Float.isNaN(this.f18209o) && Float.isNaN(this.f18210p);
    }

    void o(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f18195a != null) {
            str2 = str3 + "/" + (this.f18195a.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    void p(androidx.constraintlayout.core.parser.c cVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVar;
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.parser.d dVar = (androidx.constraintlayout.core.parser.d) fVar.E(i10);
            dVar.b();
            androidx.constraintlayout.core.parser.c cVarN0 = dVar.n0();
            String strB = cVarN0.b();
            if (strB.matches("#[0-9a-fA-F]+")) {
                v(dVar.b(), 902, Integer.parseInt(strB.substring(1), 16));
            } else if (cVarN0 instanceof androidx.constraintlayout.core.parser.e) {
                u(dVar.b(), 901, cVarN0.i());
            } else {
                w(dVar.b(), 903, strB);
            }
        }
    }

    void q() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        String str2 = this.f18195a != null ? str + "/" + (this.f18195a.hashCode() % 1000) + " " : str + "/NULL ";
        HashMap<String, androidx.constraintlayout.core.motion.a> map = this.f18213s;
        if (map != null) {
            for (String str3 : map.keySet()) {
                System.out.println(str2 + this.f18213s.get(str3).toString());
            }
        }
    }

    public StringBuilder r(StringBuilder sb2) {
        return s(sb2, false);
    }

    public StringBuilder s(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, com.google.android.exoplayer2.text.ttml.d.f49793l0, this.f18196b);
        b(sb2, "top", this.f18197c);
        b(sb2, com.google.android.exoplayer2.text.ttml.d.f49796n0, this.f18198d);
        b(sb2, "bottom", this.f18199e);
        a(sb2, "pivotX", this.f18200f);
        a(sb2, "pivotY", this.f18201g);
        a(sb2, "rotationX", this.f18202h);
        a(sb2, "rotationY", this.f18203i);
        a(sb2, "rotationZ", this.f18204j);
        a(sb2, "translationX", this.f18205k);
        a(sb2, "translationY", this.f18206l);
        a(sb2, "translationZ", this.f18207m);
        a(sb2, "scaleX", this.f18208n);
        a(sb2, "scaleY", this.f18209o);
        a(sb2, "alpha", this.f18210p);
        b(sb2, "visibility", this.f18196b);
        a(sb2, "interpolatedPos", this.f18211q);
        if (this.f18195a != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                t(sb2, type);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f18194v);
        }
        if (z10) {
            a(sb2, "phone_orientation", f18194v);
        }
        if (this.f18213s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f18213s.keySet()) {
                androidx.constraintlayout.core.motion.a aVar = this.f18213s.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (aVar.m()) {
                    case 900:
                        sb2.append(aVar.i());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(aVar.h());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(androidx.constraintlayout.core.motion.a.c(aVar.i()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(aVar.l());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(aVar.f());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void u(String str, int i10, float f10) {
        if (this.f18213s.containsKey(str)) {
            this.f18213s.get(str).u(f10);
        } else {
            this.f18213s.put(str, new androidx.constraintlayout.core.motion.a(str, i10, f10));
        }
    }

    public void v(String str, int i10, int i11) {
        if (this.f18213s.containsKey(str)) {
            this.f18213s.get(str).v(i11);
        } else {
            this.f18213s.put(str, new androidx.constraintlayout.core.motion.a(str, i10, i11));
        }
    }

    public void w(String str, int i10, String str2) {
        if (this.f18213s.containsKey(str)) {
            this.f18213s.get(str).x(str2);
        } else {
            this.f18213s.put(str, new androidx.constraintlayout.core.motion.a(str, i10, str2));
        }
    }

    public void x(String str, int i10, boolean z10) {
        if (this.f18213s.containsKey(str)) {
            this.f18213s.get(str).t(z10);
        } else {
            this.f18213s.put(str, new androidx.constraintlayout.core.motion.a(str, i10, z10));
        }
    }

    public boolean y(String str, androidx.constraintlayout.core.parser.c cVar) throws CLParsingException {
        str.hashCode();
        switch (str) {
            case "phone_orientation":
                f18194v = cVar.i();
                return true;
            case "bottom":
                this.f18199e = cVar.j();
                return true;
            case "custom":
                p(cVar);
                return true;
            case "rotationX":
                this.f18202h = cVar.i();
                return true;
            case "rotationY":
                this.f18203i = cVar.i();
                return true;
            case "rotationZ":
                this.f18204j = cVar.i();
                return true;
            case "translationX":
                this.f18205k = cVar.i();
                return true;
            case "translationY":
                this.f18206l = cVar.i();
                return true;
            case "translationZ":
                this.f18207m = cVar.i();
                return true;
            case "pivotX":
                this.f18200f = cVar.i();
                return true;
            case "pivotY":
                this.f18201g = cVar.i();
                return true;
            case "scaleX":
                this.f18208n = cVar.i();
                return true;
            case "scaleY":
                this.f18209o = cVar.i();
                return true;
            case "top":
                this.f18197c = cVar.j();
                return true;
            case "left":
                this.f18196b = cVar.j();
                return true;
            case "alpha":
                this.f18210p = cVar.i();
                return true;
            case "right":
                this.f18198d = cVar.j();
                return true;
            case "interpolatedPos":
                this.f18211q = cVar.i();
                return true;
            default:
                return false;
        }
    }

    public o z() {
        ConstraintWidget constraintWidget = this.f18195a;
        if (constraintWidget != null) {
            this.f18196b = constraintWidget.L();
            this.f18197c = this.f18195a.b0();
            this.f18198d = this.f18195a.X();
            this.f18199e = this.f18195a.v();
            B(this.f18195a.f18278n);
        }
        return this;
    }
}
