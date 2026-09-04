package org.jsoup.select;

/* JADX INFO: compiled from: StructuralEvaluator.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h extends org.jsoup.select.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    org.jsoup.select.d f138027a;

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class a extends h {
        public a(org.jsoup.select.d dVar) {
            this.f138027a = dVar;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            for (org.jsoup.nodes.f fVar3 : fVar2.E0()) {
                if (fVar3 != fVar2 && this.f138027a.a(fVar, fVar3)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.f138027a);
        }
    }

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class b extends h {
        public b(org.jsoup.select.d dVar) {
            this.f138027a = dVar;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarF;
            return (fVar == fVar2 || (fVarF = fVar2.F()) == null || !this.f138027a.a(fVar, fVarF)) ? false : true;
        }

        public String toString() {
            return String.format(":ImmediateParent%s", this.f138027a);
        }
    }

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class c extends h {
        public c(org.jsoup.select.d dVar) {
            this.f138027a = dVar;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            org.jsoup.nodes.f fVarA1;
            return (fVar == fVar2 || (fVarA1 = fVar2.A1()) == null || !this.f138027a.a(fVar, fVarA1)) ? false : true;
        }

        public String toString() {
            return String.format(":prev%s", this.f138027a);
        }
    }

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class d extends h {
        public d(org.jsoup.select.d dVar) {
            this.f138027a = dVar;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return !this.f138027a.a(fVar, fVar2);
        }

        public String toString() {
            return String.format(":not%s", this.f138027a);
        }
    }

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class e extends h {
        public e(org.jsoup.select.d dVar) {
            this.f138027a = dVar;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            if (fVar == fVar2) {
                return false;
            }
            for (org.jsoup.nodes.f fVarF = fVar2.F(); fVarF != fVar; fVarF = fVarF.F()) {
                if (this.f138027a.a(fVar, fVarF)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":parent%s", this.f138027a);
        }
    }

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class f extends h {
        public f(org.jsoup.select.d dVar) {
            this.f138027a = dVar;
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            if (fVar == fVar2) {
                return false;
            }
            for (org.jsoup.nodes.f fVarA1 = fVar2.A1(); fVarA1 != null; fVarA1 = fVarA1.A1()) {
                if (this.f138027a.a(fVar, fVarA1)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":prev*%s", this.f138027a);
        }
    }

    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class g extends org.jsoup.select.d {
        g() {
        }

        @Override // org.jsoup.select.d
        public boolean a(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            return fVar == fVar2;
        }
    }

    h() {
    }
}
