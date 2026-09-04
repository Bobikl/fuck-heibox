package org.apache.tools.ant.types;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: PatternSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class w0 extends s implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<c> f136652g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<c> f136653h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<d> f136654i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<d> f136655j = new ArrayList();

    /* JADX INFO: compiled from: PatternSet.java */
    public static final class b extends w0 {
        private b(w0 w0Var) {
            J(w0Var.b());
            j2(w0Var);
        }

        @Override // org.apache.tools.ant.types.w0
        public String[] r2(Project project) {
            return super.s2(project);
        }

        @Override // org.apache.tools.ant.types.w0
        public String[] s2(Project project) {
            return super.r2(project);
        }
    }

    /* JADX INFO: compiled from: PatternSet.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f136656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f136657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f136658c;

        public c() {
        }

        private boolean h(Project project) {
            p2 p2VarU = p2.u(project);
            return p2VarU.W(this.f136657b) && p2VarU.X(this.f136658c);
        }

        public String a(Project project) {
            if (h(project)) {
                return this.f136656a;
            }
            return null;
        }

        public String b() {
            return this.f136656a;
        }

        public void c(Object obj) {
            this.f136657b = obj;
        }

        public void d(String str) {
            c(str);
        }

        public void e(String str) {
            this.f136656a = str;
        }

        public void f(Object obj) {
            this.f136658c = obj;
        }

        public void g(String str) {
            f(str);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.f136656a;
            if (str2 == null) {
                sb2.append("noname");
            } else {
                sb2.append(str2);
            }
            if (this.f136657b != null || this.f136658c != null) {
                sb2.append(":");
                if (this.f136657b != null) {
                    sb2.append("if->");
                    sb2.append(this.f136657b);
                    str = ";";
                } else {
                    str = "";
                }
                if (this.f136658c != null) {
                    sb2.append(str);
                    sb2.append("unless->");
                    sb2.append(this.f136658c);
                }
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: PatternSet.java */
    public class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f136660e;

        public d() {
            super();
        }

        public final String i() {
            return this.f136660e;
        }

        public final void j(String str) {
            this.f136660e = str;
        }

        @Override // org.apache.tools.ant.types.w0.c
        public String toString() {
            String string = super.toString();
            if (this.f136660e == null) {
                return string;
            }
            return string + ";encoding->" + this.f136660e;
        }
    }

    private void A2(Project project) {
        if (!this.f136654i.isEmpty()) {
            for (d dVar : this.f136654i) {
                String strA = dVar.a(project);
                if (strA != null) {
                    File fileW0 = project.W0(strA);
                    if (!fileW0.exists()) {
                        throw new BuildException("Includesfile " + fileW0.getAbsolutePath() + " not found.");
                    }
                    B2(fileW0, dVar.i(), this.f136652g, project);
                }
            }
            this.f136654i.clear();
        }
        if (this.f136655j.isEmpty()) {
            return;
        }
        for (d dVar2 : this.f136655j) {
            String strA2 = dVar2.a(project);
            if (strA2 != null) {
                File fileW1 = project.W0(strA2);
                if (!fileW1.exists()) {
                    throw new BuildException("Excludesfile " + fileW1.getAbsolutePath() + " not found.");
                }
                B2(fileW1, dVar2.i(), this.f136653h, project);
            }
        }
        this.f136655j.clear();
    }

    private void B2(File file, String str, final List<c> list, final Project project) throws BuildException {
        try {
            InputStreamReader fileReader = str == null ? new FileReader(file) : new InputStreamReader(new FileInputStream(file), str);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    Stream streamFilter = bufferedReader.lines().filter(new Predicate() { // from class: org.apache.tools.ant.types.p0
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((String) obj).isEmpty();
                        }
                    }.negate());
                    Objects.requireNonNull(project);
                    streamFilter.map(new Function() { // from class: org.apache.tools.ant.types.q0
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return project.V0((String) obj);
                        }
                    }).forEach(new Consumer() { // from class: org.apache.tools.ant.types.r0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f136304b.y2(list, (String) obj);
                        }
                    });
                    bufferedReader.close();
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e10) {
            throw new BuildException("An error occurred while reading from pattern file: " + file, e10);
        }
    }

    private d k2(List<d> list) {
        d dVar = new d();
        list.add(dVar);
        return dVar;
    }

    private c l2(List<c> list) {
        c cVar = new c();
        list.add(cVar);
        return cVar;
    }

    private w0 t2(Project project) {
        return (w0) R1(w0.class, U1(), project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v2(Project project, c cVar) {
        return cVar.a(project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w2(String str) {
        return !str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] x2(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(List list, String str) {
        l2(list).e(str);
    }

    private String[] z2(List<c> list, final Project project) {
        if (list.isEmpty()) {
            return null;
        }
        return (String[]) list.stream().map(new Function() { // from class: org.apache.tools.ant.types.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return w0.v2(project, (w0.c) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.types.t0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((String) obj);
            }
        }).filter(new Predicate() { // from class: org.apache.tools.ant.types.u0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return w0.w2((String) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.types.v0
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return w0.x2(i10);
            }
        });
    }

    public void C2(String str) {
        if (Y1()) {
            throw d2();
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ", false);
        while (stringTokenizer.hasMoreTokens()) {
            n2().e(stringTokenizer.nextToken());
        }
    }

    public void D2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        o2().e(file.getAbsolutePath());
    }

    public void E2(String str) {
        if (Y1()) {
            throw d2();
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ", false);
        while (stringTokenizer.hasMoreTokens()) {
            p2().e(stringTokenizer.nextToken());
        }
    }

    public void F2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        q2().e(file.getAbsolutePath());
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (!this.f136652g.isEmpty() || !this.f136653h.isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        try {
            w0 w0Var = (w0) super.clone();
            w0Var.f136652g = new ArrayList(this.f136652g);
            w0Var.f136653h = new ArrayList(this.f136653h);
            w0Var.f136654i = new ArrayList(this.f136654i);
            w0Var.f136655j = new ArrayList(this.f136655j);
            return w0Var;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public void i2(w0 w0Var) {
        j2(new b());
    }

    public void j2(w0 w0Var) {
        if (Y1()) {
            throw Z1();
        }
        String[] strArrS2 = w0Var.s2(b());
        String[] strArrR2 = w0Var.r2(b());
        if (strArrS2 != null) {
            for (String str : strArrS2) {
                p2().e(str);
            }
        }
        if (strArrR2 != null) {
            for (String str2 : strArrR2) {
                n2().e(str2);
            }
        }
    }

    public void m2(w0 w0Var, Project project) {
        if (Y1()) {
            throw new BuildException("Cannot append to a reference");
        }
        K1(project);
        String[] strArrS2 = w0Var.s2(project);
        if (strArrS2 != null) {
            for (String str : strArrS2) {
                p2().e(str);
            }
        }
        String[] strArrR2 = w0Var.r2(project);
        if (strArrR2 != null) {
            for (String str2 : strArrR2) {
                n2().e(str2);
            }
        }
    }

    public c n2() {
        if (Y1()) {
            throw Z1();
        }
        return l2(this.f136653h);
    }

    public c o2() {
        if (Y1()) {
            throw Z1();
        }
        return k2(this.f136655j);
    }

    public c p2() {
        if (Y1()) {
            throw Z1();
        }
        return l2(this.f136652g);
    }

    public c q2() {
        if (Y1()) {
            throw Z1();
        }
        return k2(this.f136654i);
    }

    public String[] r2(Project project) {
        if (Y1()) {
            return t2(project).r2(project);
        }
        K1(project);
        A2(project);
        return z2(this.f136653h, project);
    }

    public String[] s2(Project project) {
        if (Y1()) {
            return t2(project).s2(project);
        }
        K1(project);
        A2(project);
        return z2(this.f136652g, project);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return String.format("patternSet{ includes: %s excludes: %s }", this.f136652g, this.f136653h);
    }

    public boolean u2(Project project) {
        if (Y1()) {
            return t2(project).u2(project);
        }
        K1(project);
        return (this.f136654i.isEmpty() && this.f136655j.isEmpty() && this.f136652g.isEmpty() && this.f136653h.isEmpty()) ? false : true;
    }
}
