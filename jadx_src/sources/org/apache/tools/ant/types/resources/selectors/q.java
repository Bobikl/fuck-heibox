package org.apache.tools.ant.types.resources.selectors;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.w;

/* JADX INFO: compiled from: Type.java */
/* JADX INFO: loaded from: classes5.dex */
public class q implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f136453c = "file";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f136454d = "dir";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f136455e = "any";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f136456f = new q(new a("file"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f136457g = new q(new a("dir"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f136458h = new q(new a("any"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f136459b = null;

    /* JADX INFO: compiled from: Type.java */
    public static class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f136460c = {"file", "dir", "any"};

        public a() {
        }

        public a(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f136460c;
        }
    }

    public q() {
    }

    public q(a aVar) {
        b(aVar);
    }

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        a aVar = this.f136459b;
        if (aVar == null) {
            throw new BuildException("The type attribute is required.");
        }
        int iB = aVar.b();
        if (iB == 2) {
            return true;
        }
        if (s1Var.o2()) {
            if (iB == 1) {
                return true;
            }
        } else if (iB == 0) {
            return true;
        }
        return false;
    }

    public void b(a aVar) {
        this.f136459b = aVar;
    }
}
