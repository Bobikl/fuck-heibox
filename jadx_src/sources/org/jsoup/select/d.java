package org.jsoup.select;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;

/* JADX INFO: compiled from: Evaluator.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class a extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return true;
        }

        public String toString() {
            return androidx.webkit.b.f28327e;
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static class a0 extends n {
        public a0(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.d.n
        protected int b(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.select.c cVarR0 = fVar2.F().r0();
            int i10 = 0;
            for (int iIntValue = fVar2.z0().intValue(); iIntValue < cVarR0.size(); iIntValue++) {
                if (cVarR0.get(iIntValue).E1() == fVar2.E1()) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // org.jsoup.select.d.n
        protected String c() {
            return "nth-last-of-type";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138004a;

        public b(String str) {
            this.f138004a = str;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.v(this.f138004a);
        }

        public String toString() {
            return String.format("[%s]", this.f138004a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static class b0 extends n {
        public b0(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.d.n
        protected int b(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.select.c cVarR0 = fVar2.F().r0();
            int i10 = 0;
            for (int i11 = 0; i11 < cVarR0.size(); i11++) {
                if (cVarR0.get(i11).E1() == fVar2.E1()) {
                    i10++;
                }
                if (cVarR0.get(i11) == fVar2) {
                    break;
                }
            }
            return i10;
        }

        @Override // org.jsoup.select.d.n
        protected String c() {
            return "nth-of-type";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static abstract class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f138005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f138006b;

        public c(String str, String str2) {
            org.jsoup.helper.d.h(str);
            org.jsoup.helper.d.h(str2);
            this.f138005a = str.trim().toLowerCase();
            this.f138006b = str2.trim().toLowerCase();
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class c0 extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarF = fVar2.F();
            return (fVarF == null || (fVarF instanceof Document) || fVar2.D1().size() != 0) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class C1250d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138007a;

        public C1250d(String str) {
            this.f138007a = str;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            Iterator<org.jsoup.nodes.a> it = fVar2.i().h().iterator();
            while (it.hasNext()) {
                if (it.next().getKey().startsWith(this.f138007a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.f138007a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class d0 extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarF = fVar2.F();
            if (fVarF == null || (fVarF instanceof Document)) {
                return false;
            }
            org.jsoup.select.c cVarR0 = fVarF.r0();
            int i10 = 0;
            for (int i11 = 0; i11 < cVarR0.size(); i11++) {
                if (cVarR0.get(i11).E1().equals(fVar2.E1())) {
                    i10++;
                }
            }
            return i10 == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class e extends c {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.v(this.f138005a) && this.f138006b.equalsIgnoreCase(fVar2.g(this.f138005a));
        }

        public String toString() {
            return String.format("[%s=%s]", this.f138005a, this.f138006b);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class e0 extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            if (fVar instanceof Document) {
                fVar = fVar.q0(0);
            }
            return fVar2 == fVar;
        }

        public String toString() {
            return ":root";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class f extends c {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.v(this.f138005a) && fVar2.g(this.f138005a).toLowerCase().contains(this.f138006b);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f138005a, this.f138006b);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class f0 extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Pattern f138008a;

        public f0(Pattern pattern) {
            this.f138008a = pattern;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return this.f138008a.matcher(fVar2.H1()).find();
        }

        public String toString() {
            return String.format(":matches(%s", this.f138008a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class g extends c {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.v(this.f138005a) && fVar2.g(this.f138005a).toLowerCase().endsWith(this.f138006b);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f138005a, this.f138006b);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class g0 extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Pattern f138009a;

        public g0(Pattern pattern) {
            this.f138009a = pattern;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return this.f138009a.matcher(fVar2.q1()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s", this.f138009a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class h extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f138010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Pattern f138011b;

        public h(String str, Pattern pattern) {
            this.f138010a = str.trim().toLowerCase();
            this.f138011b = pattern;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.v(this.f138010a) && this.f138011b.matcher(fVar2.g(this.f138010a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f138010a, this.f138011b.toString());
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class h0 extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138012a;

        public h0(String str) {
            this.f138012a = str;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.F1().equals(this.f138012a);
        }

        public String toString() {
            return String.format("%s", this.f138012a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class i extends c {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return !this.f138006b.equalsIgnoreCase(fVar2.g(this.f138005a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f138005a, this.f138006b);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class j extends c {
        public j(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.v(this.f138005a) && fVar2.g(this.f138005a).toLowerCase().startsWith(this.f138006b);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f138005a, this.f138006b);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class k extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138013a;

        public k(String str) {
            this.f138013a = str;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.d1(this.f138013a);
        }

        public String toString() {
            return String.format(".%s", this.f138013a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class l extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138014a;

        public l(String str) {
            this.f138014a = str.toLowerCase();
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.q1().toLowerCase().contains(this.f138014a);
        }

        public String toString() {
            return String.format(":containsOwn(%s", this.f138014a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class m extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138015a;

        public m(String str) {
            this.f138015a = str.toLowerCase();
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.H1().toLowerCase().contains(this.f138015a);
        }

        public String toString() {
            return String.format(":contains(%s", this.f138015a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static abstract class n extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final int f138016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f138017b;

        public n(int i10) {
            this(0, i10);
        }

        public n(int i10, int i11) {
            this.f138016a = i10;
            this.f138017b = i11;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarF = fVar2.F();
            if (fVarF == null || (fVarF instanceof Document)) {
                return false;
            }
            int iB = b(fVar, fVar2);
            int i10 = this.f138016a;
            if (i10 == 0) {
                return iB == this.f138017b;
            }
            int i11 = this.f138017b;
            return (iB - i11) * i10 >= 0 && (iB - i11) % i10 == 0;
        }

        protected abstract int b(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2);

        protected abstract String c();

        public String toString() {
            if (this.f138016a == 0) {
                return String.format(":%s(%d)", c(), Integer.valueOf(this.f138017b));
            }
            return this.f138017b == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(this.f138016a)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.f138016a), Integer.valueOf(this.f138017b));
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class o extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f138018a;

        public o(String str) {
            this.f138018a = str;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return this.f138018a.equals(fVar2.k1());
        }

        public String toString() {
            return String.format("#%s", this.f138018a);
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class p extends q {
        public p(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.z0().intValue() == this.f138019a;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f138019a));
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static abstract class q extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f138019a;

        public q(int i10) {
            this.f138019a = i10;
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class r extends q {
        public r(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.z0().intValue() > this.f138019a;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f138019a));
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class s extends q {
        public s(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.z0().intValue() < this.f138019a;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f138019a));
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class t extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            List<org.jsoup.nodes.g> listO = fVar2.o();
            for (int i10 = 0; i10 < listO.size(); i10++) {
                org.jsoup.nodes.g gVar = listO.get(i10);
                if (!(gVar instanceof org.jsoup.nodes.c) && !(gVar instanceof org.jsoup.nodes.i) && !(gVar instanceof org.jsoup.nodes.e)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class u extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarF = fVar2.F();
            return (fVarF == null || (fVarF instanceof Document) || fVar2.z0().intValue() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class v extends b0 {
        public v() {
            super(0, 1);
        }

        @Override // org.jsoup.select.d.n
        public String toString() {
            return ":first-of-type";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class w extends d {
        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarF = fVar2.F();
            return (fVarF == null || (fVarF instanceof Document) || fVar2.z0().intValue() != fVarF.r0().size() - 1) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class x extends a0 {
        public x() {
            super(0, 1);
        }

        @Override // org.jsoup.select.d.n
        public String toString() {
            return ":last-of-type";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class y extends n {
        public y(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.d.n
        protected int b(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.z0().intValue() + 1;
        }

        @Override // org.jsoup.select.d.n
        protected String c() {
            return "nth-child";
        }
    }

    /* JADX INFO: compiled from: Evaluator.java */
    public static final class z extends n {
        public z(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.d.n
        protected int b(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar2.F().r0().size() - fVar2.z0().intValue();
        }

        @Override // org.jsoup.select.d.n
        protected String c() {
            return "nth-last-child";
        }
    }

    protected d() {
    }

    public abstract boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2);
}
