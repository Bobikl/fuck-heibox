package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttCssParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f49896c = "WebvttCssParser";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f49897d = "{";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f49898e = "}";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f49899f = "color";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f49900g = "background-color";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f49901h = "font-family";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f49902i = "font-weight";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f49903j = "font-size";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f49904k = "ruby-position";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f49905l = "over";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f49906m = "under";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f49907n = "text-combine-upright";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f49908o = "all";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f49909p = "digits";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f49910q = "text-decoration";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f49911r = "bold";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f49912s = "underline";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f49913t = "font-style";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f49914u = "italic";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f49915v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f49916w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f49917a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f49918b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f49915v.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.A((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrP1 = u0.p1(str, "\\.");
        String str2 = strArrP1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.z(str2.substring(0, iIndexOf2));
            dVar.y(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.z(str2);
        }
        if (strArrP1.length > 1) {
            dVar.x((String[]) u0.a1(strArrP1, 1, strArrP1.length));
        }
    }

    private static boolean b(e0 e0Var) {
        int iE = e0Var.e();
        int iF = e0Var.f();
        byte[] bArrD = e0Var.d();
        if (iE + 2 > iF) {
            return false;
        }
        int i10 = iE + 1;
        if (bArrD[iE] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArrD[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF) {
                e0Var.T(iF - e0Var.e());
                return true;
            }
            if (((char) bArrD[i11]) == '*' && ((char) bArrD[i12]) == '/') {
                i11 = i12 + 1;
                iF = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(e0 e0Var) {
        char cK = k(e0Var, e0Var.e());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        e0Var.T(1);
        return true;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f49916w.matcher(com.google.common.base.a.g(str));
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("Invalid font-size: '");
            sb2.append(str);
            sb2.append("'.");
            u.m(f49896c, sb2.toString());
            return;
        }
        String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                dVar.t(3);
                break;
            case "em":
                dVar.t(2);
                break;
            case "px":
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))));
    }

    private static String f(e0 e0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iE = e0Var.e();
        int iF = e0Var.f();
        while (iE < iF && !z10) {
            char c10 = (char) e0Var.d()[iE];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iE++;
                sb2.append(c10);
            }
        }
        e0Var.T(iE - e0Var.e());
        return sb2.toString();
    }

    @p0
    static String g(e0 e0Var, StringBuilder sb2) {
        n(e0Var);
        if (e0Var.a() == 0) {
            return null;
        }
        String strF = f(e0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        char cG = (char) e0Var.G();
        StringBuilder sb3 = new StringBuilder(1);
        sb3.append(cG);
        return sb3.toString();
    }

    @p0
    private static String h(e0 e0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iE = e0Var.e();
            String strG = g(e0Var, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                e0Var.S(iE);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    @p0
    private static String i(e0 e0Var, StringBuilder sb2) {
        n(e0Var);
        if (e0Var.a() < 5 || !"::cue".equals(e0Var.D(5))) {
            return null;
        }
        int iE = e0Var.e();
        String strG = g(e0Var, sb2);
        if (strG == null) {
            return null;
        }
        if (f49897d.equals(strG)) {
            e0Var.S(iE);
            return "";
        }
        String strL = "(".equals(strG) ? l(e0Var) : null;
        if (")".equals(g(e0Var, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(e0 e0Var, d dVar, StringBuilder sb2) {
        n(e0Var);
        String strF = f(e0Var, sb2);
        if (!"".equals(strF) && ":".equals(g(e0Var, sb2))) {
            n(e0Var);
            String strH = h(e0Var, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iE = e0Var.e();
            String strG = g(e0Var, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    e0Var.S(iE);
                }
            }
            if ("color".equals(strF)) {
                dVar.q(com.google.android.exoplayer2.util.g.b(strH));
                return;
            }
            if (f49900g.equals(strF)) {
                dVar.n(com.google.android.exoplayer2.util.g.b(strH));
                return;
            }
            boolean z10 = true;
            if (f49904k.equals(strF)) {
                if (f49905l.equals(strH)) {
                    dVar.w(1);
                    return;
                } else {
                    if (f49906m.equals(strH)) {
                        dVar.w(2);
                        return;
                    }
                    return;
                }
            }
            if (f49907n.equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith(f49909p)) {
                    z10 = false;
                }
                dVar.p(z10);
                return;
            }
            if (f49910q.equals(strF)) {
                if ("underline".equals(strH)) {
                    dVar.B(true);
                    return;
                }
                return;
            }
            if (f49901h.equals(strF)) {
                dVar.r(strH);
                return;
            }
            if (f49902i.equals(strF)) {
                if ("bold".equals(strH)) {
                    dVar.o(true);
                }
            } else if (f49913t.equals(strF)) {
                if ("italic".equals(strH)) {
                    dVar.u(true);
                }
            } else if (f49903j.equals(strF)) {
                e(strH, dVar);
            }
        }
    }

    private static char k(e0 e0Var, int i10) {
        return (char) e0Var.d()[i10];
    }

    private static String l(e0 e0Var) {
        int iE = e0Var.e();
        int iF = e0Var.f();
        boolean z10 = false;
        while (iE < iF && !z10) {
            int i10 = iE + 1;
            z10 = ((char) e0Var.d()[iE]) == ')';
            iE = i10;
        }
        return e0Var.D((iE - 1) - e0Var.e()).trim();
    }

    static void m(e0 e0Var) {
        while (!TextUtils.isEmpty(e0Var.q())) {
        }
    }

    static void n(e0 e0Var) {
        while (true) {
            for (boolean z10 = true; e0Var.a() > 0 && z10; z10 = false) {
                if (!c(e0Var) && !b(e0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(e0 e0Var) {
        this.f49918b.setLength(0);
        int iE = e0Var.e();
        m(e0Var);
        this.f49917a.Q(e0Var.d(), e0Var.e());
        this.f49917a.S(iE);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f49917a, this.f49918b);
            if (strI == null || !f49897d.equals(g(this.f49917a, this.f49918b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iE2 = this.f49917a.e();
                String strG = g(this.f49917a, this.f49918b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f49917a.S(iE2);
                    j(this.f49917a, dVar, this.f49918b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
