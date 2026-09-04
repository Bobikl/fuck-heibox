package org.apache.tools.ant.taskdefs.optional.j2ee;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: JonasHotDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends b implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final String f135160r = "RMI";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f135161s = "org.objectweb.jonas.adm.JonasAdmin";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f135162t = {c.f135155a, c.f135156b, "list", c.f135158d, "update"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135164o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f135166q;

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.b, org.apache.tools.ant.taskdefs.optional.j2ee.a, org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void b() throws BuildException {
        v2 v2VarR = r();
        String strL2 = h().l2();
        if (strL2 == null) {
            throw new BuildException("The \"action\" attribute must be set");
        }
        if (!j()) {
            throw new BuildException("Invalid action \"%s\" passed", strL2);
        }
        if (q() == null) {
            s(f135161s);
        }
        File file = this.f135163n;
        if (file == null || file.isDirectory()) {
            v2VarR.t2().O1("-Dinstall.root=" + this.f135163n);
            v2VarR.t2().O1("-Djava.security.policy=" + this.f135163n + "/config/java.policy");
            if ("DAVID".equals(this.f135164o)) {
                v2VarR.t2().O1("-Dorg.omg.CORBA.ORBClass=org.objectweb.david.libs.binding.orbs.iiop.IIOPORB");
                v2VarR.t2().O1("-Dorg.omg.CORBA.ORBSingletonClass=org.objectweb.david.libs.binding.orbs.ORBSingletonClass");
                v2VarR.t2().O1("-Djavax.rmi.CORBA.StubClass=org.objectweb.david.libs.stub_factories.rmi.StubDelegate");
                v2VarR.t2().O1("-Djavax.rmi.CORBA.PortableRemoteObjectClass=org.objectweb.david.libs.binding.rmi.ORBPortableRemoteObjectDelegate");
                v2VarR.t2().O1("-Djavax.rmi.CORBA.UtilClass=org.objectweb.david.libs.helpers.RMIUtilDelegate");
                v2VarR.t2().O1("-Ddavid.CosNaming.default_method=0");
                v2VarR.t2().O1("-Ddavid.rmi.ValueHandlerClass=com.sun.corba.se.internal.io.ValueHandlerImpl");
                if (this.f135165p != null) {
                    v2VarR.t2().O1("-Ddavid.CosNaming.default_host=" + this.f135165p);
                }
                if (this.f135166q != 0) {
                    v2VarR.t2().O1("-Ddavid.CosNaming.default_port=" + this.f135166q);
                }
            }
        }
        if (g() != null) {
            v2VarR.q2().H1("-n " + g());
        }
        if (c.f135156b.equals(strL2) || "update".equals(strL2) || "redeploy".equals(strL2)) {
            v2VarR.q2().H1("-a " + h().m2());
            return;
        }
        if (!strL2.equals(c.f135155a) && !strL2.equals(c.f135158d)) {
            if (strL2.equals("list")) {
                v2VarR.q2().O1("-l");
            }
        } else {
            v2VarR.q2().H1("-r " + h().m2());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.a
    public o0 e() {
        o0 o0VarE = super.e();
        if (o0VarE == null) {
            o0VarE = new o0(h().b());
        }
        if (this.f135164o != null) {
            String string = new File(this.f135163n, "lib/" + this.f135164o + "_jonas.jar").toString();
            String string2 = new File(this.f135163n, "config/").toString();
            o0VarE.n2(new o0(o0VarE.b(), string + File.pathSeparator + string2));
        }
        return o0VarE;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.b, org.apache.tools.ant.taskdefs.optional.j2ee.a
    protected boolean j() {
        String strL2 = h().l2();
        for (String str : f135162t) {
            if (strL2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void t(String str) {
        this.f135165p = str;
    }

    public void u(int i10) {
        this.f135166q = i10;
    }

    public void v(File file) {
        this.f135163n = file;
    }

    public void w(String str) {
        this.f135164o = str;
    }
}
