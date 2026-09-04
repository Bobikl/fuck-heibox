package org.jsoup.select;

import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: QueryParser.java */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f138021d = {Constants.ACCEPT_TIME_SEPARATOR_SP, ">", "+", Constants.WAVE_SEPARATOR, " "};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f138022e = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f138023f = Pattern.compile("(\\+|-)?(\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.jsoup.parser.f f138024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f138025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<d> f138026c = new ArrayList();

    private g(String str) {
        this.f138025b = str;
        this.f138024a = new org.jsoup.parser.f(str);
    }

    private void a() {
        this.f138026c.add(new d.a());
    }

    private void b() {
        org.jsoup.parser.f fVar = new org.jsoup.parser.f(this.f138024a.d('[', ']'));
        String strN = fVar.n(ContainerUtils.KEY_VALUE_DELIMITER, "!=", "^=", "$=", "*=", "~=");
        org.jsoup.helper.d.h(strN);
        fVar.p();
        if (fVar.r()) {
            if (strN.startsWith("^")) {
                this.f138026c.add(new d.C1250d(strN.substring(1)));
                return;
            } else {
                this.f138026c.add(new d.b(strN));
                return;
            }
        }
        if (fVar.s(ContainerUtils.KEY_VALUE_DELIMITER)) {
            this.f138026c.add(new d.e(strN, fVar.B()));
            return;
        }
        if (fVar.s("!=")) {
            this.f138026c.add(new d.i(strN, fVar.B()));
            return;
        }
        if (fVar.s("^=")) {
            this.f138026c.add(new d.j(strN, fVar.B()));
            return;
        }
        if (fVar.s("$=")) {
            this.f138026c.add(new d.g(strN, fVar.B()));
        } else if (fVar.s("*=")) {
            this.f138026c.add(new d.f(strN, fVar.B()));
        } else {
            if (!fVar.s("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f138025b, fVar.B());
            }
            this.f138026c.add(new d.h(strN, Pattern.compile(fVar.B())));
        }
    }

    private void c() {
        String strJ = this.f138024a.j();
        org.jsoup.helper.d.h(strJ);
        this.f138026c.add(new d.k(strJ.trim().toLowerCase()));
    }

    private void d() {
        String strJ = this.f138024a.j();
        org.jsoup.helper.d.h(strJ);
        this.f138026c.add(new d.o(strJ));
    }

    private void e() {
        String strK = this.f138024a.k();
        org.jsoup.helper.d.h(strK);
        if (strK.contains("|")) {
            strK = strK.replace("|", ":");
        }
        this.f138026c.add(new d.h0(strK.trim().toLowerCase()));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00be, please report this as an issue */
    private void f(char c10) {
        d aVar;
        d dVar;
        boolean z10;
        b.C1249b c1249b;
        d dVar2;
        b.a aVar2;
        b.a aVar3;
        b.a aVar4;
        d dVar3;
        b.a aVar5;
        this.f138024a.p();
        d dVarS = s(h());
        if (this.f138026c.size() == 1) {
            aVar = this.f138026c.get(0);
            if ((aVar instanceof b.C1249b) && c10 != ',') {
                z10 = true;
                dVar = aVar;
                aVar = ((b.C1249b) aVar).c();
            }
            this.f138026c.clear();
            if (c10 == '>') {
                aVar5 = new b.a(dVarS, new h.b(aVar));
            } else if (c10 == ' ') {
                aVar4 = new b.a(dVarS, new h.e(aVar));
            } else if (c10 == '+') {
                aVar3 = new b.a(dVarS, new h.c(aVar));
            } else if (c10 == '~') {
                aVar2 = new b.a(dVarS, new h.f(aVar));
            } else {
                if (c10 == ',') {
                    throw new Selector.SelectorParseException("Unknown combinator: " + c10, new Object[0]);
                }
                if (aVar instanceof b.C1249b) {
                    b.C1249b c1249b2 = (b.C1249b) aVar;
                    c1249b2.d(dVarS);
                    dVar2 = c1249b2;
                } else {
                    c1249b = new b.C1249b();
                    c1249b.d(aVar);
                    c1249b.d(dVarS);
                }
            }
            if (z10) {
                dVar2 = c1249b;
                dVar2 = aVar2;
                dVar2 = aVar3;
                dVar2 = aVar4;
                dVar2 = aVar5;
                ((b.C1249b) dVar).b(dVar2);
                dVar3 = dVar;
            } else {
                dVar2 = c1249b;
                dVar2 = aVar2;
                dVar2 = aVar3;
                dVar2 = aVar4;
                dVar2 = aVar5;
                dVar3 = dVar2;
            }
            this.f138026c.add(dVar3);
        }
        aVar = new b.a(this.f138026c);
        dVar = aVar;
        z10 = false;
        this.f138026c.clear();
        if (c10 == '>') {
            aVar5 = new b.a(dVarS, new h.b(aVar));
        } else if (c10 == ' ') {
            aVar4 = new b.a(dVarS, new h.e(aVar));
        } else if (c10 == '+') {
            aVar3 = new b.a(dVarS, new h.c(aVar));
        } else if (c10 == '~') {
            aVar2 = new b.a(dVarS, new h.f(aVar));
        } else {
            if (c10 == ',') {
                throw new Selector.SelectorParseException("Unknown combinator: " + c10, new Object[0]);
            }
            if (aVar instanceof b.C1249b) {
                b.C1249b c1249b3 = (b.C1249b) aVar;
                c1249b3.d(dVarS);
                dVar2 = c1249b3;
            } else {
                c1249b = new b.C1249b();
                c1249b.d(aVar);
                c1249b.d(dVarS);
            }
        }
        if (z10) {
            dVar2 = c1249b;
            dVar2 = aVar2;
            dVar2 = aVar3;
            dVar2 = aVar4;
            dVar2 = aVar5;
            ((b.C1249b) dVar).b(dVar2);
            dVar3 = dVar;
        } else {
            dVar2 = c1249b;
            dVar2 = aVar2;
            dVar2 = aVar3;
            dVar2 = aVar4;
            dVar2 = aVar5;
            dVar3 = dVar2;
        }
        this.f138026c.add(dVar3);
    }

    private int g() {
        String strTrim = this.f138024a.e(")").trim();
        org.jsoup.helper.d.e(org.jsoup.helper.c.c(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private String h() {
        StringBuilder sb2 = new StringBuilder();
        while (!this.f138024a.r()) {
            if (this.f138024a.t("(")) {
                sb2.append("(");
                sb2.append(this.f138024a.d('(', ')'));
                sb2.append(")");
            } else if (this.f138024a.t(com.meituan.robust.Constants.ARRAY_TYPE)) {
                sb2.append(com.meituan.robust.Constants.ARRAY_TYPE);
                sb2.append(this.f138024a.d('[', ']'));
                sb2.append("]");
            } else {
                if (this.f138024a.v(f138021d)) {
                    break;
                }
                sb2.append(this.f138024a.g());
            }
        }
        return sb2.toString();
    }

    private void i(boolean z10) {
        this.f138024a.h(z10 ? ":containsOwn" : ":contains");
        String strD = org.jsoup.parser.f.D(this.f138024a.d('(', ')'));
        org.jsoup.helper.d.i(strD, ":contains(text) query must not be empty");
        if (z10) {
            this.f138026c.add(new d.l(strD));
        } else {
            this.f138026c.add(new d.m(strD));
        }
    }

    private void j(boolean z10, boolean z11) {
        String lowerCase = this.f138024a.e(")").trim().toLowerCase();
        Matcher matcher = f138022e.matcher(lowerCase);
        Matcher matcher2 = f138023f.matcher(lowerCase);
        int i10 = 2;
        int i11 = 0;
        if ("odd".equals(lowerCase)) {
            i11 = 1;
        } else if (!"even".equals(lowerCase)) {
            if (matcher.matches()) {
                int i12 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i11 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i10 = i12;
            } else {
                if (!matcher2.matches()) {
                    throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", lowerCase);
                }
                i10 = 0;
                i11 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
            }
        }
        if (z11) {
            if (z10) {
                this.f138026c.add(new d.a0(i10, i11));
                return;
            } else {
                this.f138026c.add(new d.b0(i10, i11));
                return;
            }
        }
        if (z10) {
            this.f138026c.add(new d.z(i10, i11));
        } else {
            this.f138026c.add(new d.y(i10, i11));
        }
    }

    private void k() {
        if (this.f138024a.s("#")) {
            d();
            return;
        }
        if (this.f138024a.s(".")) {
            c();
            return;
        }
        if (this.f138024a.z()) {
            e();
            return;
        }
        if (this.f138024a.t(com.meituan.robust.Constants.ARRAY_TYPE)) {
            b();
            return;
        }
        if (this.f138024a.s(androidx.webkit.b.f28327e)) {
            a();
            return;
        }
        if (this.f138024a.s(":lt(")) {
            o();
            return;
        }
        if (this.f138024a.s(":gt(")) {
            n();
            return;
        }
        if (this.f138024a.s(":eq(")) {
            m();
            return;
        }
        if (this.f138024a.t(":has(")) {
            l();
            return;
        }
        if (this.f138024a.t(":contains(")) {
            i(false);
            return;
        }
        if (this.f138024a.t(":containsOwn(")) {
            i(true);
            return;
        }
        if (this.f138024a.t(":matches(")) {
            p(false);
            return;
        }
        if (this.f138024a.t(":matchesOwn(")) {
            p(true);
            return;
        }
        if (this.f138024a.t(":not(")) {
            q();
            return;
        }
        if (this.f138024a.s(":nth-child(")) {
            j(false, false);
            return;
        }
        if (this.f138024a.s(":nth-last-child(")) {
            j(true, false);
            return;
        }
        if (this.f138024a.s(":nth-of-type(")) {
            j(false, true);
            return;
        }
        if (this.f138024a.s(":nth-last-of-type(")) {
            j(true, true);
            return;
        }
        if (this.f138024a.s(":first-child")) {
            this.f138026c.add(new d.u());
            return;
        }
        if (this.f138024a.s(":last-child")) {
            this.f138026c.add(new d.w());
            return;
        }
        if (this.f138024a.s(":first-of-type")) {
            this.f138026c.add(new d.v());
            return;
        }
        if (this.f138024a.s(":last-of-type")) {
            this.f138026c.add(new d.x());
            return;
        }
        if (this.f138024a.s(":only-child")) {
            this.f138026c.add(new d.c0());
            return;
        }
        if (this.f138024a.s(":only-of-type")) {
            this.f138026c.add(new d.d0());
        } else if (this.f138024a.s(":empty")) {
            this.f138026c.add(new d.t());
        } else {
            if (!this.f138024a.s(":root")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f138025b, this.f138024a.B());
            }
            this.f138026c.add(new d.e0());
        }
    }

    private void l() {
        this.f138024a.h(":has");
        String strD = this.f138024a.d('(', ')');
        org.jsoup.helper.d.i(strD, ":has(el) subselect must not be empty");
        this.f138026c.add(new h.a(s(strD)));
    }

    private void m() {
        this.f138026c.add(new d.p(g()));
    }

    private void n() {
        this.f138026c.add(new d.r(g()));
    }

    private void o() {
        this.f138026c.add(new d.s(g()));
    }

    private void p(boolean z10) {
        this.f138024a.h(z10 ? ":matchesOwn" : ":matches");
        String strD = this.f138024a.d('(', ')');
        org.jsoup.helper.d.i(strD, ":matches(regex) query must not be empty");
        if (z10) {
            this.f138026c.add(new d.g0(Pattern.compile(strD)));
        } else {
            this.f138026c.add(new d.f0(Pattern.compile(strD)));
        }
    }

    private void q() {
        this.f138024a.h(":not");
        String strD = this.f138024a.d('(', ')');
        org.jsoup.helper.d.i(strD, ":not(selector) subselect must not be empty");
        this.f138026c.add(new h.d(s(strD)));
    }

    public static d s(String str) {
        return new g(str).r();
    }

    d r() {
        this.f138024a.p();
        if (this.f138024a.v(f138021d)) {
            this.f138026c.add(new h.g());
            f(this.f138024a.g());
        } else {
            k();
        }
        while (!this.f138024a.r()) {
            boolean zP = this.f138024a.p();
            if (this.f138024a.v(f138021d)) {
                f(this.f138024a.g());
            } else if (zP) {
                f(' ');
            } else {
                k();
            }
        }
        return this.f138026c.size() == 1 ? this.f138026c.get(0) : new b.a(this.f138026c);
    }
}
