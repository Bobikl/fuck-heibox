package org.apache.tools.ant.taskdefs.rmic;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.taskdefs.z5;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.g0;
import org.apache.tools.ant.util.j2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: DefaultRmicAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Random f135691c = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f135692d = "_Stub";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f135693e = "_Skel";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f135694f = "_Tie";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f135695g = "-vcompat";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f135696h = "-v1.1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f135697i = "-v1.2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f135698j = "1.1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f135699k = "1.2";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f135700l = "compat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z5 f135701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f135702b;

    /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.rmic.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultRmicAdapter.java */
    public class C1236b implements g0 {
        private C1236b() {
        }

        @Override // org.apache.tools.ant.util.g0
        public void n0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public void q0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public String[] y0(String str) {
            int i10;
            String strSubstring;
            int i11;
            if (str != null && str.endsWith(".class")) {
                if (!str.endsWith(b.this.m() + ".class")) {
                    if (!str.endsWith(b.this.l() + ".class")) {
                        if (!str.endsWith(b.this.n() + ".class")) {
                            String strI = j2.i(str, ".class");
                            String strReplace = strI.replace(File.separatorChar, lg.a.f131414g);
                            if (b.this.f135701a.e3() && !b.this.f135701a.g3(strReplace)) {
                                return null;
                            }
                            String[] strArr = {str + ".tmp." + b.f135691c.nextLong()};
                            if (!b.this.f135701a.V2() && !b.this.f135701a.T2()) {
                                if ("1.2".equals(b.this.f135701a.d3())) {
                                    return new String[]{strI + b.this.m() + ".class"};
                                }
                                return new String[]{strI + b.this.m() + ".class", strI + b.this.l() + ".class"};
                            }
                            if (b.this.f135701a.T2()) {
                                return strArr;
                            }
                            int iLastIndexOf = strI.lastIndexOf(File.separatorChar);
                            String strReplace2 = "";
                            if (iLastIndexOf == -1) {
                                i10 = 0;
                                strSubstring = "";
                            } else {
                                i10 = iLastIndexOf + 1;
                                strSubstring = strI.substring(0, i10);
                            }
                            String strSubstring2 = strI.substring(i10);
                            try {
                                Class<?> clsLoadClass = b.this.f135701a.Z2().loadClass(strReplace);
                                if (clsLoadClass.isInterface()) {
                                    return new String[]{strSubstring + lg.a.f131412e + strSubstring2 + b.this.m() + ".class"};
                                }
                                String name = b.this.f135701a.b3(clsLoadClass).getName();
                                int iLastIndexOf2 = name.lastIndexOf(46);
                                if (iLastIndexOf2 == -1) {
                                    i11 = 0;
                                } else {
                                    i11 = iLastIndexOf2 + 1;
                                    strReplace2 = name.substring(0, i11).replace(lg.a.f131414g, File.separatorChar);
                                }
                                return new String[]{strSubstring + lg.a.f131412e + strSubstring2 + b.this.n() + ".class", strReplace2 + lg.a.f131412e + name.substring(i11) + b.this.m() + ".class"};
                            } catch (ClassNotFoundException unused) {
                                b.this.f135701a.x1(z5.I + strReplace + z5.J, 1);
                                return strArr;
                            } catch (NoClassDefFoundError unused2) {
                                b.this.f135701a.x1(z5.I + strReplace + z5.K, 1);
                                return strArr;
                            } catch (Throwable th2) {
                                b.this.f135701a.x1(z5.I + strReplace + z5.L + th2.getMessage(), 1);
                                return strArr;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(o oVar, String str) {
        oVar.h().O1(str);
    }

    private void t(o oVar) {
        if (s0.n("9")) {
            for (String str : oVar.r()) {
                if ("-Xnew".equals(str)) {
                    throw new BuildException("JDK9 has removed support for -Xnew");
                }
            }
        }
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public g0 a() {
        return this.f135702b;
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public void b(z5 z5Var) {
        this.f135701a = z5Var;
        this.f135702b = new C1236b();
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public o0 c() {
        return j();
    }

    protected String g() {
        String str;
        String strD3 = this.f135701a.d3();
        if (strD3 == null) {
            str = null;
        } else if ("1.1".equals(strD3)) {
            str = f135696h;
        } else if ("1.2".equals(strD3)) {
            str = f135697i;
        } else if (f135700l.equals(strD3)) {
            str = f135695g;
        } else {
            this.f135701a.log("Unknown stub option " + strD3);
            str = null;
        }
        return (str != null || this.f135701a.V2() || this.f135701a.T2()) ? str : f135695g;
    }

    protected boolean h() {
        return !s0.n("11");
    }

    protected String[] i(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (str.startsWith("-J")) {
                this.f135701a.log("Dropping " + str + " from compiler arguments");
            } else {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    protected o0 j() {
        o0 o0Var = new o0(this.f135701a.b());
        o0Var.C2(this.f135701a.H2());
        o0 o0VarJ2 = this.f135701a.J2();
        if (o0VarJ2 == null) {
            o0VarJ2 = new o0(this.f135701a.b());
        }
        if (this.f135701a.X2()) {
            o0Var.h2(o0VarJ2.s2("last"));
        } else {
            o0Var.h2(o0VarJ2.s2(z0.b.f136024i));
        }
        if (this.f135701a.Y2()) {
            o0Var.m2();
        }
        return o0Var;
    }

    public z5 k() {
        return this.f135701a;
    }

    protected String l() {
        return f135693e;
    }

    protected String m() {
        return f135692d;
    }

    protected String n() {
        return f135694f;
    }

    protected void p(final o oVar) {
        Vector<String> vectorK2 = this.f135701a.K2();
        this.f135701a.x1("Compilation " + oVar.k(), 3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(vectorK2.size() == 1 ? "File" : "Files");
        sb2.append(" to be compiled:");
        sb2.append((String) vectorK2.stream().peek(new Consumer() { // from class: org.apache.tools.ant.taskdefs.rmic.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b.o(oVar, (String) obj);
            }
        }).collect(Collectors.joining("    ")));
        this.f135701a.x1(sb2.toString(), 3);
    }

    protected String[] q(String[] strArr) {
        return strArr;
    }

    protected o r() {
        return s(null);
    }

    protected o s(String[] strArr) {
        o oVar = new o();
        if (strArr != null) {
            for (String str : strArr) {
                oVar.h().O1(str);
            }
        }
        o0 o0VarJ = j();
        oVar.h().O1("-d");
        oVar.h().G1(this.f135701a.a3());
        if (this.f135701a.Q2() != null) {
            oVar.h().O1("-extdirs");
            oVar.h().I1(this.f135701a.Q2());
        }
        oVar.h().O1("-classpath");
        oVar.h().I1(o0VarJ);
        String strG = g();
        if (strG != null) {
            oVar.h().O1(strG);
        }
        if (this.f135701a.c3() != null) {
            oVar.h().O1("-keepgenerated");
        }
        if (this.f135701a.V2()) {
            if (!h()) {
                throw new BuildException("this rmic implementation doesn't support the -iiop switch");
            }
            this.f135701a.x1("IIOP has been turned on.", 2);
            oVar.h().O1("-iiop");
            if (this.f135701a.W2() != null) {
                this.f135701a.x1("IIOP Options: " + this.f135701a.W2(), 2);
                oVar.h().O1(this.f135701a.W2());
            }
        }
        if (this.f135701a.T2()) {
            if (!h()) {
                throw new BuildException("this rmic implementation doesn't support the -idl switch");
            }
            oVar.h().O1("-idl");
            this.f135701a.x1("IDL has been turned on.", 2);
            if (this.f135701a.U2() != null) {
                oVar.h().O1(this.f135701a.U2());
                this.f135701a.x1("IDL Options: " + this.f135701a.U2(), 2);
            }
        }
        if (this.f135701a.N2()) {
            oVar.h().O1("-g");
        }
        oVar.c(q(this.f135701a.M2()));
        t(oVar);
        p(oVar);
        return oVar;
    }
}
