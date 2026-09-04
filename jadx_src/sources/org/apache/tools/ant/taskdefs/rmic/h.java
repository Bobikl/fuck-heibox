package org.apache.tools.ant.taskdefs.rmic;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: WLRmic.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f135716m = "weblogic.rmic";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f135717n = "weblogic";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f135718o = "Cannot use WebLogic rmic, as it is not available. Add it to Ant's classpath with the -lib option";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f135719p = "Error starting WebLogic rmic: ";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f135720q = "_WLStub";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f135721r = "_WLSkel";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f135722s = "Unsupported stub option: ";

    @Override // org.apache.tools.ant.taskdefs.rmic.e
    public boolean execute() throws Throwable {
        org.apache.tools.ant.g gVarZ;
        Class<?> cls;
        k().x1("Using WebLogic rmic", 3);
        o oVarS = s(new String[]{"-noexit"});
        org.apache.tools.ant.g gVar = null;
        try {
            try {
                if (k().J2() == null) {
                    cls = Class.forName(f135716m);
                    gVarZ = null;
                } else {
                    gVarZ = k().b().z(k().J2());
                    try {
                        cls = Class.forName(f135716m, true, gVarZ);
                    } catch (ClassNotFoundException unused) {
                        throw new BuildException(f135718o, k().w1());
                    } catch (Exception e10) {
                        e = e10;
                        if (e instanceof BuildException) {
                            throw ((BuildException) e);
                        }
                        throw new BuildException(f135719p, e, k().w1());
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVarZ;
                        if (gVar != null) {
                            gVar.n();
                        }
                        throw th;
                    }
                }
                cls.getMethod("main", String[].class).invoke(null, oVarS.r());
                if (gVarZ != null) {
                    gVarZ.n();
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    protected String g() {
        String strD3 = k().d3();
        if (strD3 == null) {
            return null;
        }
        k().x1(f135722s + strD3, 1);
        return null;
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    protected boolean h() {
        return true;
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    public String l() {
        return f135721r;
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    public String m() {
        return f135720q;
    }

    @Override // org.apache.tools.ant.taskdefs.rmic.b
    protected String[] q(String[] strArr) {
        return i(strArr);
    }
}
