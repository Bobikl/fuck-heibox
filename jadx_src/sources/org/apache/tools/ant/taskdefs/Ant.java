package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.VectorSet;

/* JADX INFO: loaded from: classes5.dex */
public class Ant extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f133615x = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Project f133623r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f133616k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f133617l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f133618m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f133619n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f133620o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<b5> f133621p = new Vector();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<b> f133622q = new Vector();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PrintStream f133624s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<org.apache.tools.ant.types.j1> f133625t = new Vector();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<String> f133626u = new Vector();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f133627v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f133628w = false;

    public enum PropertyType {
        PLAIN,
        INHERITED,
        USER
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133629a;

        static {
            int[] iArr = new int[PropertyType.values().length];
            f133629a = iArr;
            try {
                iArr[PropertyType.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133629a[PropertyType.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133629a[PropertyType.INHERITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b extends org.apache.tools.ant.types.q1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f133630c = null;

        public String g() {
            return this.f133630c;
        }

        public void h(String str) {
            this.f133630c = str;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133631a;

        public String a() {
            return this.f133631a;
        }

        public void b(String str) {
            this.f133631a = str;
        }
    }

    public Ant() {
    }

    public Ant(org.apache.tools.ant.u2 u2Var) {
        B1(u2Var);
    }

    private void A2() throws BuildException {
        HashSet hashSet = new HashSet();
        for (int size = this.f133621p.size() - 1; size >= 0; size--) {
            b5 b5Var = this.f133621p.get(size);
            if (b5Var.r2() != null && !b5Var.r2().isEmpty()) {
                if (hashSet.contains(b5Var.r2())) {
                    this.f133621p.remove(size);
                } else {
                    hashSet.add(b5Var.r2());
                }
            }
        }
        this.f133621p.stream().peek(new Consumer() { // from class: org.apache.tools.ant.taskdefs.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134222b.z2((b5) obj);
            }
        }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((b5) obj).D1();
            }
        });
        if (this.f133628w) {
            m2(b().o0(), PropertyType.INHERITED);
        } else {
            b().w(this.f133623r);
        }
    }

    private void B2() {
        V1();
    }

    private void m2(Map<?, ?> map, final PropertyType propertyType) {
        map.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.j
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f134301a.w2(propertyType, obj, obj2);
            }
        });
    }

    private void q2() throws BuildException {
        HashMap map = new HashMap(b().x0());
        for (b bVar : this.f133622q) {
            String strB = bVar.b();
            if (strB == null) {
                throw new BuildException("the refid attribute is required for reference elements");
            }
            if (map.containsKey(strB)) {
                map.remove(strB);
                String strG = bVar.g();
                if (strG == null) {
                    strG = strB;
                }
                r2(strB, strG);
            } else {
                x1("Parent project doesn't contain any reference '" + strB + "'", 1);
            }
        }
        if (this.f133620o) {
            Hashtable<String, Object> hashtableX0 = this.f133623r.x0();
            for (String str : map.keySet()) {
                if (!hashtableX0.containsKey(str)) {
                    r2(str, str);
                    this.f133623r.E0(b());
                }
            }
        }
    }

    private void r2(String str, String str2) {
        Object objW0 = b().w0(str);
        if (objW0 == null) {
            x1("No object referenced by " + str + ". Can't copy to " + str2, 1);
            return;
        }
        Class<?> cls = objW0.getClass();
        try {
            Method method = cls.getMethod("clone", new Class[0]);
            if (method != null) {
                objW0 = method.invoke(objW0, new Object[0]);
                x1("Adding clone of reference " + str, 4);
            }
        } catch (Exception unused) {
        }
        if (objW0 instanceof org.apache.tools.ant.b2) {
            ((org.apache.tools.ant.b2) objW0).J(this.f133623r);
        } else {
            try {
                Method method2 = cls.getMethod("setProject", Project.class);
                if (method2 != null) {
                    method2.invoke(objW0, this.f133623r);
                }
            } catch (NoSuchMethodException unused2) {
            } catch (Exception e10) {
                throw new BuildException("Error setting new project instance for reference with id " + str, e10, w1());
            }
        }
        this.f133623r.i(str2, objW0);
    }

    private void v2() {
        this.f133623r.j1(b().p0());
        b().a0().forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.k
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134398b.y2((org.apache.tools.ant.k) obj);
            }
        });
        String str = this.f133618m;
        if (str != null) {
            File file = this.f133616k;
            try {
                this.f133624s = new PrintStream(Files.newOutputStream((file != null ? f133615x.n0(file, str) : b().W0(this.f133618m)).toPath(), new OpenOption[0]));
                org.apache.tools.ant.y yVar = new org.apache.tools.ant.y();
                yVar.w0(2);
                yVar.S(this.f133624s);
                yVar.m1(this.f133624s);
                this.f133623r.c(yVar);
            } catch (IOException unused) {
                log("Ant: Can't set output to " + this.f133618m);
            }
        }
        if (this.f133628w) {
            m2(b().B0(), PropertyType.USER);
        } else {
            b().x(this.f133623r);
        }
        if (this.f133619n) {
            m2(b().t0(), PropertyType.PLAIN);
        } else {
            this.f133623r.G0();
        }
        Iterator<org.apache.tools.ant.types.j1> it = this.f133625t.iterator();
        while (it.hasNext()) {
            m2(it.next().A2(), PropertyType.PLAIN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w2(PropertyType propertyType, Object obj, Object obj2) {
        String string = obj.toString();
        if (org.apache.tools.ant.j1.f133489m.equals(string) || org.apache.tools.ant.j1.f133490n.equals(string)) {
            return;
        }
        String string2 = obj2.toString();
        int i10 = a.f133629a[propertyType.ordinal()];
        if (i10 == 1) {
            if (this.f133623r.u0(string) == null) {
                this.f133623r.n1(string, string2);
            }
        } else if (i10 == 2) {
            this.f133623r.s1(string, string2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f133623r.i1(string, string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean x2(String str, org.apache.tools.ant.t2 t2Var) {
        return t2Var.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(org.apache.tools.ant.k kVar) {
        this.f133623r.c(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(b5 b5Var) {
        b5Var.J(this.f133623r);
    }

    public void C2(String str) {
        this.f133617l = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        PrintStream printStream;
        PrintStream printStream2;
        BuildException buildException;
        Throwable th2;
        String strI0;
        File file = this.f133616k;
        String str = this.f133617l;
        VectorSet vectorSet = new VectorSet(this.f133626u);
        try {
            u2();
            if (this.f133616k == null && this.f133619n) {
                this.f133616k = b().Z();
            }
            v2();
            File file2 = this.f133616k;
            if (file2 == null) {
                this.f133616k = b().Z();
            } else if (!this.f133628w) {
                this.f133623r.Z0(file2);
                if (file != null) {
                    this.f133623r.i1(org.apache.tools.ant.j1.f133489m, this.f133616k.getAbsolutePath());
                }
            }
            A2();
            if (this.f133617l == null) {
                this.f133617l = t2();
            }
            File fileN0 = f133615x.n0(this.f133616k, this.f133617l);
            this.f133617l = fileN0.getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("calling target(s) ");
            sb2.append(vectorSet.isEmpty() ? "[default]" : vectorSet.toString());
            sb2.append(" in build file ");
            sb2.append(this.f133617l);
            x1(sb2.toString(), 3);
            this.f133623r.s1(org.apache.tools.ant.j1.f133490n, this.f133617l);
            String strU0 = b().u0(org.apache.tools.ant.j1.f133490n);
            if (strU0 != null && fileN0.equals(b().W0(strU0)) && G1() != null && G1().k().isEmpty()) {
                if (!"antcall".equals(K1())) {
                    throw new BuildException("%s task at the top level must not invoke its own build file.", K1());
                }
                throw new BuildException("antcall must not be used at the top level.");
            }
            try {
                org.apache.tools.ant.e2.i(this.f133623r, fileN0);
                if (vectorSet.isEmpty() && (strI0 = this.f133623r.i0()) != null) {
                    vectorSet.add(strI0);
                }
                if (this.f133623r.u0(org.apache.tools.ant.j1.f133490n).equals(b().u0(org.apache.tools.ant.j1.f133490n)) && G1() != null) {
                    final String strK = G1().k();
                    if (vectorSet.contains(strK)) {
                        throw new BuildException("%s task calling its own parent target.", K1());
                    }
                    final Hashtable<String, org.apache.tools.ant.t2> hashtableY0 = b().y0();
                    Stream stream = vectorSet.stream();
                    Objects.requireNonNull(hashtableY0);
                    if (stream.map(new Function() { // from class: org.apache.tools.ant.taskdefs.e
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (org.apache.tools.ant.t2) hashtableY0.get((String) obj);
                        }
                    }).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.f
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return com.google.auto.common.s.a((org.apache.tools.ant.t2) obj);
                        }
                    }).anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.g
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return Ant.x2(strK, (org.apache.tools.ant.t2) obj);
                        }
                    })) {
                        throw new BuildException("%s task calling a target that depends on its parent target '%s'.", K1(), strK);
                    }
                }
                q2();
                if (!vectorSet.isEmpty() && (vectorSet.size() != 1 || vectorSet.get(0) == 0 || !((String) vectorSet.get(0)).isEmpty())) {
                    try {
                        try {
                            x1("Entering " + this.f133617l + "...", 3);
                            this.f133623r.U();
                            this.f133623r.J(vectorSet);
                            x1("Exiting " + this.f133617l + ".", 3);
                            this.f133623r.T(null);
                        } catch (BuildException e10) {
                            BuildException buildExceptionC = org.apache.tools.ant.e2.c(e10, w1());
                            try {
                                throw buildExceptionC;
                            } catch (Throwable th3) {
                                buildException = buildExceptionC;
                                th2 = th3;
                                x1("Exiting " + this.f133617l + ".", 3);
                                this.f133623r.T(buildException);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        buildException = null;
                        x1("Exiting " + this.f133617l + ".", 3);
                        this.f133623r.T(buildException);
                        throw th2;
                    }
                }
                this.f133623r = null;
                Iterator<b5> it = this.f133621p.iterator();
                while (it.hasNext()) {
                    it.next().J(null);
                }
                if (this.f133618m != null && (printStream2 = this.f133624s) != null) {
                    org.apache.tools.ant.util.j0.d(printStream2);
                }
                this.f133616k = file;
                this.f133617l = str;
            } catch (BuildException e11) {
                throw org.apache.tools.ant.e2.c(e11, w1());
            }
        } catch (Throwable th5) {
            this.f133623r = null;
            Iterator<b5> it2 = this.f133621p.iterator();
            while (it2.hasNext()) {
                it2.next().J(null);
            }
            if (this.f133618m != null && (printStream = this.f133624s) != null) {
                org.apache.tools.ant.util.j0.d(printStream);
            }
            this.f133616k = file;
            this.f133617l = str;
            throw th5;
        }
    }

    public void D2(File file) {
        this.f133616k = file;
    }

    public void E2(boolean z10) {
        this.f133619n = z10;
    }

    public void F2(boolean z10) {
        this.f133620o = z10;
    }

    public void G2(String str) {
        this.f133618m = str;
    }

    public void H2(String str) {
        if (str.isEmpty()) {
            throw new BuildException("target attribute must not be empty");
        }
        this.f133626u.add(str);
        this.f133627v = true;
    }

    public void I2(boolean z10) {
        this.f133628w = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void O1(String str) {
        Project project = this.f133623r;
        if (project != null) {
            project.E(str, true);
        } else {
            super.O1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void Q1(String str) {
        Project project = this.f133623r;
        if (project != null) {
            project.G(str, true);
        } else {
            super.Q1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void R1(String str) {
        Project project = this.f133623r;
        if (project != null) {
            project.E(str, false);
        } else {
            super.R1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public int S1(byte[] bArr, int i10, int i11) throws IOException {
        Project project = this.f133623r;
        return project != null ? project.F(bArr, i10, i11) : super.S1(bArr, i10, i11);
    }

    @Override // org.apache.tools.ant.u2
    public void U1(String str) {
        Project project = this.f133623r;
        if (project != null) {
            project.G(str, false);
        } else {
            super.U1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void V1() {
        Project projectB = b().B();
        this.f133623r = projectB;
        projectB.k1();
    }

    public void n2(c cVar) {
        if (this.f133627v) {
            throw new BuildException("nested target is incompatible with the target attribute");
        }
        String strA = cVar.a();
        if (strA.isEmpty()) {
            throw new BuildException("target name must not be empty");
        }
        this.f133626u.add(strA);
    }

    public void o2(org.apache.tools.ant.types.j1 j1Var) {
        this.f133625t.add(j1Var);
    }

    public void p2(b bVar) {
        this.f133622q.add(bVar);
    }

    public b5 s2() {
        b5 b5Var = new b5(true, b());
        b5Var.J(u2());
        b5Var.g2(org.apache.tools.ant.taskdefs.condition.a0.f133862j);
        this.f133621p.add(b5Var);
        return b5Var;
    }

    protected String t2() {
        return org.apache.tools.ant.v1.f137078v;
    }

    protected Project u2() {
        if (this.f133623r == null) {
            B2();
        }
        return this.f133623r;
    }
}
