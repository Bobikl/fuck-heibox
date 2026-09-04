package org.apache.tools.ant.util;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ScriptRunnerCreator.java */
/* JADX INFO: loaded from: classes5.dex */
public class y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f137010e = "auto";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f137011f = "org.apache.tools.ant.util.optional";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f137012g = "bsf";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f137013h = "org.apache.bsf";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f137014i = "org.apache.bsf.BSFManager";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f137015j = "org.apache.tools.ant.util.optional.ScriptRunner";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f137016k = "javax";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f137017l = "javax.script.ScriptEngineManager";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f137018m = "org.apache.tools.ant.util.optional.JavaxScriptRunner";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Project f137019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ClassLoader f137022d = null;

    public y1(Project project) {
        this.f137019a = project;
    }

    private x1 b(String str, String str2, String str3) {
        if (!this.f137020b.equals("auto") && !this.f137020b.equals(str)) {
            return null;
        }
        if (!str2.equals(f137014i)) {
            try {
                Class.forName(str2, true, this.f137022d);
            } catch (Exception unused) {
                return null;
            }
        } else {
            if (this.f137022d.getResource(a1.b(str2)) == null) {
                return null;
            }
            new s1().a(this.f137022d, this.f137021c);
        }
        try {
            x1 x1Var = (x1) Class.forName(str3, true, this.f137022d).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            x1Var.C(this.f137019a);
            x1Var.B(this.f137021c);
            x1Var.D(this.f137022d);
            return x1Var;
        } catch (Exception e10) {
            throw k1.i(e10);
        }
    }

    public synchronized x1 a(String str, String str2, ClassLoader classLoader) {
        x1 x1VarB;
        this.f137020b = str;
        this.f137021c = str2;
        this.f137022d = classLoader;
        if (str2 == null) {
            throw new BuildException("script language must be specified");
        }
        if (!str.equals("auto") && !str.equals(f137016k) && !str.equals(f137012g)) {
            throw new BuildException("Unsupported language prefix " + str);
        }
        x1VarB = b(f137012g, f137014i, f137015j);
        if (x1VarB == null) {
            x1VarB = b(f137016k, f137017l, f137018m);
        }
        if (x1VarB == null) {
            if (f137016k.equals(str)) {
                throw new BuildException("Unable to load the script engine manager (javax.script.ScriptEngineManager)");
            }
            if (f137012g.equals(str)) {
                throw new BuildException("Unable to load the BSF script engine manager (org.apache.bsf.BSFManager)");
            }
            throw new BuildException("Unable to load a script engine manager (org.apache.bsf.BSFManager or javax.script.ScriptEngineManager)");
        }
        return x1VarB;
    }
}
