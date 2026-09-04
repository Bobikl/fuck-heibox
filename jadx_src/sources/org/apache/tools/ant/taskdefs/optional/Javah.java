package org.apache.tools.ant.taskdefs.optional;

import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.EnumSet;
import java.util.List;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.u2;

/* JADX INFO: loaded from: classes5.dex */
public class Javah extends u2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134661m;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private o0 f134668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private tj.d f134669u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<a> f134659k = new Vector(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f134662n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f134663o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f134664p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f134665q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f134666r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f134667s = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.b0> f134670v = new Vector<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.optional.javah.c f134671w = null;

    public enum Settings {
        cls,
        files,
        classes
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134672a;

        public a() {
        }

        public String a() {
            return this.f134672a;
        }

        public void b(String str) {
            this.f134672a = str;
        }
    }

    public Javah() {
        this.f134669u = null;
        this.f134669u = new tj.d(org.apache.tools.ant.taskdefs.optional.javah.d.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String[] C2(org.apache.tools.ant.types.b0 b0Var) {
        return b0Var.B2(b()).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D2(String str) {
        return str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, lg.a.f131414g).replace(IOUtils.DIR_SEPARATOR_UNIX, lg.a.f131414g).replaceFirst("\\.class$", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] E2(int i10) {
        return new String[i10];
    }

    public boolean A2() {
        return this.f134667s;
    }

    public boolean B2() {
        return this.f134664p;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(Settings.class);
        if (this.f134660l != null) {
            enumSetNoneOf.add(Settings.cls);
        }
        if (!this.f134659k.isEmpty()) {
            enumSetNoneOf.add(Settings.classes);
        }
        if (!this.f134670v.isEmpty()) {
            enumSetNoneOf.add(Settings.files);
        }
        if (enumSetNoneOf.size() > 1) {
            throw new BuildException("Exactly one of " + Settings.values() + " attributes is required", w1());
        }
        File file = this.f134661m;
        if (file != null) {
            if (!file.isDirectory()) {
                throw new BuildException("destination directory \"" + this.f134661m + "\" does not exist or is not a directory", w1());
            }
            if (this.f134663o != null) {
                throw new BuildException("destdir and outputFile are mutually exclusive", w1());
            }
        }
        o0 o0Var = this.f134662n;
        if (o0Var == null) {
            this.f134662n = new o0(b()).s2("last");
        } else {
            this.f134662n = o0Var.s2(z0.b.f136024i);
        }
        org.apache.tools.ant.taskdefs.optional.javah.c cVarB = this.f134671w;
        if (cVarB == null) {
            cVarB = org.apache.tools.ant.taskdefs.optional.javah.d.b(this.f134669u.f(), this, r2());
        }
        if (!cVarB.a(this)) {
            throw new BuildException("compilation failed");
        }
    }

    public void F2(org.apache.tools.ant.types.o oVar) {
        G2(oVar);
    }

    protected void G2(org.apache.tools.ant.types.o oVar) {
        x1("Compilation " + oVar.k(), 3);
        String[] strArrT2 = t2();
        StringBuilder sb2 = new StringBuilder("Class");
        if (strArrT2.length > 1) {
            sb2.append("es");
        }
        sb2.append(String.format(" to be compiled:%n", new Object[0]));
        for (String str : strArrT2) {
            oVar.h().O1(str);
            sb2.append(String.format("    %s%n", str));
        }
        x1(sb2.toString(), 3);
    }

    public void H2(q1 q1Var) {
        o2().c2(q1Var);
    }

    public void I2(o0 o0Var) {
        o0 o0Var2 = this.f134668t;
        if (o0Var2 == null) {
            this.f134668t = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void J2(String str) {
        this.f134660l = str;
    }

    public void K2(o0 o0Var) {
        o0 o0Var2 = this.f134662n;
        if (o0Var2 == null) {
            this.f134662n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void L2(q1 q1Var) {
        q2().c2(q1Var);
    }

    public void M2(File file) {
        this.f134661m = file;
    }

    public void N2(boolean z10) {
        this.f134665q = z10;
    }

    public void O2(String str) {
        if ("default".equals(str)) {
            this.f134669u.k(org.apache.tools.ant.taskdefs.optional.javah.d.c());
        } else {
            this.f134669u.k(str);
        }
    }

    public void P2(boolean z10) {
        this.f134666r = z10;
    }

    public void Q2(File file) {
        this.f134663o = file;
    }

    public void R2(boolean z10) {
        this.f134667s = z10;
    }

    public void S2(boolean z10) {
        this.f134664p = z10;
    }

    public void l2(org.apache.tools.ant.taskdefs.optional.javah.c cVar) {
        if (this.f134671w != null) {
            throw new BuildException("Can't have more than one javah adapter");
        }
        this.f134671w = cVar;
    }

    public void m2(org.apache.tools.ant.types.b0 b0Var) {
        this.f134670v.add(b0Var);
    }

    public tj.e n2() {
        tj.e eVar = new tj.e();
        this.f134669u.c(eVar);
        return eVar;
    }

    public o0 o2() {
        if (this.f134668t == null) {
            this.f134668t = new o0(b());
        }
        return this.f134668t.u2();
    }

    public a p2() {
        a aVar = new a();
        this.f134659k.add(aVar);
        return aVar;
    }

    public o0 q2() {
        if (this.f134662n == null) {
            this.f134662n = new o0(b());
        }
        return this.f134662n.u2();
    }

    public o0 r2() {
        return this.f134669u.g(b());
    }

    public o0 s2() {
        return this.f134668t;
    }

    public String[] t2() {
        Stream streamConcat = Stream.concat(this.f134670v.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f135279a.C2((org.apache.tools.ant.types.b0) obj);
            }
        }).flatMap(new o()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Javah.D2((String) obj);
            }
        }), this.f134659k.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Javah.a) obj).a();
            }
        }));
        String str = this.f134660l;
        if (str != null) {
            streamConcat = Stream.concat(Stream.of((Object[]) str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)).map(new org.apache.tools.ant.taskdefs.v()), streamConcat);
        }
        return (String[]) streamConcat.toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.optional.r
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return Javah.E2(i10);
            }
        });
    }

    public o0 u2() {
        return this.f134662n;
    }

    public String[] v2() {
        return this.f134669u.d();
    }

    public File w2() {
        return this.f134661m;
    }

    public boolean x2() {
        return this.f134665q;
    }

    public boolean y2() {
        return this.f134666r;
    }

    public File z2() {
        return this.f134663o;
    }
}
