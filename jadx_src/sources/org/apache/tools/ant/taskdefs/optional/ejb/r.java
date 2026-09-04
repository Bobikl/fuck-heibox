package org.apache.tools.ant.taskdefs.optional.ejb;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.SAXParser;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: JonasDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class r extends h {
    protected static final String M = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN";
    protected static final String N = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN";
    protected static final String O = "-//ObjectWeb//DTD JOnAS 2.4//EN";
    protected static final String P = "-//ObjectWeb//DTD JOnAS 2.5//EN";
    protected static final String Q = "RMI";
    protected static final String R = "JEREMIE";
    protected static final String S = "DAVID";
    protected static final String T = "ejb-jar_1_1.dtd";
    protected static final String U = "ejb-jar_2_0.dtd";
    protected static final String V = "jonas-ejb-jar_2_4.dtd";
    protected static final String W = "jonas-ejb-jar_2_5.dtd";
    protected static final String X = "jonas-ejb-jar.xml";
    protected static final String Y = "org.objectweb.jonas_ejb.genic.GenIC";
    protected static final String Z = "org.objectweb.jonas_ejb.tools.GenWholeIC";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected static final String f135012a0 = "org.objectweb.jonas_ejb.tools.GenIC";
    private String B;
    private String C;
    private String D;
    private String G;
    private File H;
    private String K;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f135014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private File f135015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f135016y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f135017z = false;
    private boolean A = false;
    private boolean E = false;
    private boolean F = false;
    private boolean I = false;
    private String J = ".jar";
    private boolean L = false;

    private void G(File file, String str, Hashtable<String, File> hashtable) {
        if (!file.exists()) {
            throw new IllegalArgumentException();
        }
        if (!file.isDirectory()) {
            hashtable.put(str, file);
            return;
        }
        for (File file2 : file.listFiles()) {
            G(file2, str.isEmpty() ? file2.getName() : str + File.separator + file2.getName(), hashtable);
        }
    }

    private void H(File file, Hashtable<String, File> hashtable) {
        if (this.L) {
            return;
        }
        v2 v2Var = new v2(u());
        v2Var.g2("genic");
        v2Var.S2(true);
        v2Var.t2().O1("-Dinstall.root=" + this.H);
        String str = this.H + File.separator + "config";
        File file2 = new File(str, "java.policy");
        if (file2.exists()) {
            v2Var.t2().O1("-Djava.security.policy=" + file2.toString());
        }
        try {
            this.f135015x = I();
            x("Using temporary output directory: " + this.f135015x, 3);
            v2Var.q2().O1("-d");
            v2Var.q2().G1(this.f135015x);
            Iterator<String> it = hashtable.keySet().iterator();
            while (it.hasNext()) {
                new File(this.f135015x + File.separator + it.next()).getParentFile().mkdirs();
            }
            x("Worked around a bug of GenIC 2.5.", 3);
            o0 o0VarM = m();
            if (o0VarM == null) {
                o0VarM = new o0(u().b());
            }
            o0VarM.n2(new o0(o0VarM.b(), str));
            o0VarM.n2(new o0(o0VarM.b(), this.f135015x.toString()));
            if (this.K != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.H);
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append("lib");
                sb2.append(str2);
                sb2.append(this.K);
                sb2.append("_jonas.jar");
                o0VarM.n2(new o0(o0VarM.b(), sb2.toString()));
            }
            x("Using classpath: " + o0VarM.toString(), 3);
            v2Var.L2(o0VarM);
            String strK = K(o0VarM);
            if (strK == null) {
                x("Cannot find GenIC class in classpath.", 0);
                throw new BuildException("GenIC class not found, please check the classpath.");
            }
            x("Using '" + strK + "' GenIC class.", 3);
            v2Var.K2(strK);
            if (this.f135016y) {
                v2Var.q2().O1("-keepgenerated");
            }
            if (this.f135017z) {
                v2Var.q2().O1("-nocompil");
            }
            if (this.A) {
                v2Var.q2().O1("-novalidation");
            }
            if (this.B != null) {
                v2Var.q2().O1("-javac");
                v2Var.q2().H1(this.B);
            }
            String str3 = this.C;
            if (str3 != null && !str3.isEmpty()) {
                v2Var.q2().O1("-javacopts");
                v2Var.q2().H1(this.C);
            }
            String str4 = this.D;
            if (str4 != null && !str4.isEmpty()) {
                v2Var.q2().O1("-rmicopts");
                v2Var.q2().H1(this.D);
            }
            if (this.E) {
                v2Var.q2().O1("-secpropag");
            }
            if (this.F) {
                v2Var.q2().O1(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
            }
            if (this.G != null) {
                v2Var.q2().O1(this.G);
            }
            v2Var.q2().O1("-noaddinjar");
            v2Var.q2().O1(file.getPath());
            x("Calling " + strK + " for " + n().f134952b + File.separator + this.f135013v + ".", 3);
            if (v2Var.y2() == 0) {
                G(this.f135015x, "", hashtable);
                return;
            }
            x("Deleting temp output directory '" + this.f135015x + "'.", 3);
            J(this.f135015x);
            if (!this.I) {
                x("Deleting generic JAR " + file.toString(), 3);
                file.delete();
            }
            throw new BuildException("GenIC reported an error.");
        } catch (IOException e10) {
            throw new BuildException("Cannot create temp dir: " + e10.getMessage(), e10);
        }
    }

    private File I() throws IOException {
        return Files.createTempDirectory("genic", new FileAttribute[0]).toFile();
    }

    private void J(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                J(file2);
            }
        }
        file.delete();
    }

    private String L() {
        String strSubstring;
        String strSubstring2;
        String str;
        int iLastIndexOf = this.f135013v.lastIndexOf(File.separatorChar);
        boolean z10 = false;
        if (iLastIndexOf != -1) {
            int i10 = iLastIndexOf + 1;
            strSubstring2 = this.f135013v.substring(0, i10);
            strSubstring = this.f135013v.substring(i10);
        } else {
            strSubstring = this.f135013v;
            strSubstring2 = "";
        }
        if (strSubstring.startsWith("ejb-jar.xml")) {
            return strSubstring2 + X;
        }
        int iIndexOf = this.f135013v.indexOf(n().f134953c, iLastIndexOf);
        if (iIndexOf < 0) {
            int iLastIndexOf2 = this.f135013v.lastIndexOf(46) - 1;
            if (iLastIndexOf2 < 0) {
                iLastIndexOf2 = this.f135013v.length() - 1;
            }
            iIndexOf = iLastIndexOf2;
            z10 = true;
        }
        int i11 = iIndexOf + 1;
        String strSubstring3 = this.f135013v.substring(iLastIndexOf + 1, i11);
        String strSubstring4 = this.f135013v.substring(i11);
        if (z10) {
            str = strSubstring2 + "jonas-" + strSubstring3 + ".xml";
        } else {
            str = strSubstring2 + strSubstring3 + "jonas-" + strSubstring4;
        }
        x("Standard EJB descriptor name: " + this.f135013v, 3);
        x("JOnAS-specific descriptor name: " + str, 3);
        return str;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void A(e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.H);
        String str = File.separator;
        sb2.append(str);
        sb2.append("xml");
        sb2.append(str);
        sb2.append(T);
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN", sb2.toString());
        eVar.e("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN", this.H + str + "xml" + str + U);
        eVar.e(O, this.H + str + "xml" + str + V);
        eVar.e(P, this.H + str + "xml" + str + W);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void F(String str, File file, Hashtable<String, File> hashtable, String str2) throws BuildException {
        File fileW = super.w(str);
        super.F(str, fileW, hashtable, str2);
        H(fileW, hashtable);
        super.F(str, w(str), hashtable, str2);
        if (this.I) {
            return;
        }
        x("Deleting generic JAR " + fileW.toString(), 3);
        fileW.delete();
    }

    String K(o0 o0Var) {
        x("Looking for GenIC class in classpath: " + o0Var.toString(), 3);
        org.apache.tools.ant.g gVarZ = o0Var.b().z(o0Var);
        try {
            try {
                gVarZ.loadClass(Y);
                x("Found GenIC class 'org.objectweb.jonas_ejb.genic.GenIC' in classpath.", 3);
                gVarZ.close();
                return Y;
            } catch (ClassNotFoundException unused) {
                x("GenIC class 'org.objectweb.jonas_ejb.genic.GenIC' not found in classpath.", 3);
                try {
                    gVarZ.loadClass(Z);
                    x("Found GenIC class 'org.objectweb.jonas_ejb.tools.GenWholeIC' in classpath.", 3);
                    gVarZ.close();
                    return Z;
                } catch (ClassNotFoundException unused2) {
                    x("GenIC class 'org.objectweb.jonas_ejb.tools.GenWholeIC' not found in classpath.", 3);
                    try {
                        gVarZ.loadClass(f135012a0);
                        x("Found GenIC class 'org.objectweb.jonas_ejb.tools.GenIC' in classpath.", 3);
                        gVarZ.close();
                        return f135012a0;
                    } catch (ClassNotFoundException unused3) {
                        x("GenIC class 'org.objectweb.jonas_ejb.tools.GenIC' not found in classpath.", 3);
                        if (gVarZ == null) {
                            return null;
                        }
                        gVarZ.close();
                        return null;
                    }
                }
            }
        } catch (Throwable th2) {
            if (gVarZ != null) {
                try {
                    gVarZ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void M(String str) {
        this.G = str;
    }

    public void N(String str) {
        this.J = str;
    }

    public void O(String str) {
        this.B = str;
    }

    public void P(String str) {
        this.C = str;
    }

    public void Q(File file) {
        this.H = file;
    }

    public void R(boolean z10) {
        this.f135016y = z10;
    }

    public void S(boolean z10) {
        this.I = z10;
    }

    public void T(boolean z10) {
        this.f135017z = z10;
    }

    public void U(boolean z10) {
        this.L = z10;
    }

    public void V(boolean z10) {
        this.A = z10;
    }

    public void W(String str) {
        this.K = str;
    }

    public void X(String str) {
        this.D = str;
    }

    public void Y(boolean z10) {
        this.E = z10;
    }

    public void Z(boolean z10) {
        this.F = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h, org.apache.tools.ant.taskdefs.optional.ejb.f
    public void b(String str, SAXParser sAXParser) {
        this.f135013v = str;
        x("JOnAS Deployment Tool processing: " + this.f135013v, 3);
        super.b(this.f135013v, sAXParser);
        if (this.f135015x != null) {
            x("Deleting temp output directory '" + this.f135015x + "'.", 3);
            J(this.f135015x);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        this.f135014w = L();
        File file = new File(n().f134952b, this.f135014w);
        if (file.exists()) {
            hashtable.put("META-INF/jonas-ejb-jar.xml", file);
            return;
        }
        x("Unable to locate the JOnAS deployment descriptor. It was expected to be in: " + file.getPath() + ".", 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void i(String str, SAXParser sAXParser) throws BuildException {
        File file = this.H;
        if (file == null) {
            throw new BuildException("The jonasroot attribute is not set.");
        }
        if (!file.isDirectory()) {
            throw new BuildException("The jonasroot attribute '%s' is not a valid directory.", this.H);
        }
        List listAsList = Arrays.asList(Q, R, S);
        String str2 = this.K;
        if (str2 != null && !listAsList.contains(str2)) {
            throw new BuildException("The orb attribute '%s' is not valid (must be one of %s.", this.K, listAsList);
        }
        String str3 = this.G;
        if (str3 != null && str3.isEmpty()) {
            throw new BuildException("Empty additionalargs attribute.");
        }
        String str4 = this.B;
        if (str4 != null && str4.isEmpty()) {
            throw new BuildException("Empty javac attribute.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected String q(String str) {
        String strQ;
        if (!n().f134959i.d().equals(g.d.f134964e) || str.contains(n().f134953c)) {
            strQ = null;
        } else {
            int iLastIndexOf = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX).lastIndexOf(47);
            int iIndexOf = iLastIndexOf != -1 ? str.indexOf(".xml", iLastIndexOf) : str.indexOf(".xml");
            if (iIndexOf != -1) {
                strQ = str.substring(0, iIndexOf);
            } else {
                strQ = null;
            }
        }
        if (strQ == null) {
            strQ = super.q(str);
        }
        x("JAR base name: " + strQ, 3);
        return strQ;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected File w(String str) {
        return new File(p(), str + this.J);
    }
}
