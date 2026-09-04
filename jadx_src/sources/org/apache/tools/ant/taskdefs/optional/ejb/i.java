package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import javax.xml.parsers.SAXParser;
import org.apache.tools.ant.BuildException;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: IPlanetDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends h {
    private static final String C = "ias-ejb-jar.xml";
    private String A;
    private String B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private File f134986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f134987w = ".jar";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f134988x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f134989y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f134990z;

    private String G() {
        String str = this.A;
        if (str != null) {
            return str;
        }
        int iLastIndexOf = this.f134990z.lastIndexOf(File.separatorChar);
        String strSubstring = "";
        String strSubstring2 = iLastIndexOf != -1 ? this.f134990z.substring(0, iLastIndexOf + 1) : "";
        int i10 = iLastIndexOf + 1;
        String strSubstring3 = "ejb-jar.xml";
        if (!this.f134990z.substring(i10).equals("ejb-jar.xml")) {
            int iIndexOf = this.f134990z.indexOf(n().f134953c, iLastIndexOf);
            if (iIndexOf < 0 && (iIndexOf = this.f134990z.lastIndexOf(46) - 1) < 0) {
                iIndexOf = this.f134990z.length() - 1;
            }
            int i11 = iIndexOf + 1;
            strSubstring = this.f134990z.substring(i10, i11);
            strSubstring3 = this.f134990z.substring(i11);
        }
        String str2 = strSubstring2 + strSubstring + "ias-" + strSubstring3;
        this.A = str2;
        return str2;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    public void D(String str) {
        x("Since a generic JAR file is not created during processing, the iPlanet Deployment Tool does not support the \"genericjarsuffix\" attribute.  It will be ignored.", 1);
    }

    public void H(boolean z10) {
        this.f134989y = z10;
    }

    public void I(File file) {
        this.f134986v = file;
    }

    public void J(boolean z10) {
        this.f134988x = z10;
    }

    public void K(String str) {
        this.f134987w = str;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h, org.apache.tools.ant.taskdefs.optional.ejb.f
    public void b(String str, SAXParser sAXParser) {
        this.f134990z = str;
        this.A = null;
        x("iPlanet Deployment Tool processing: " + str + " (and " + G() + ")", 3);
        super.b(str, sAXParser);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void g(Hashtable<String, File> hashtable, String str) {
        hashtable.put("META-INF/ias-ejb-jar.xml", new File(n().f134952b, G()));
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected void i(String str, SAXParser sAXParser) throws BuildException {
        if (str.substring(str.lastIndexOf(File.separatorChar) + 1).equals("ejb-jar.xml") && n().f134954d == null) {
            throw new BuildException("No name specified for the completed JAR file.  The EJB descriptor should be prepended with the JAR name or it should be specified using the attribute \"basejarname\" in the \"ejbjar\" task.", r());
        }
        File file = new File(n().f134952b, G());
        if (!file.exists() || !file.isFile()) {
            throw new BuildException("The iAS-specific EJB descriptor (" + file + ") was not found.", r());
        }
        File file2 = this.f134986v;
        if (file2 == null || file2.isDirectory()) {
            return;
        }
        throw new BuildException("If \"iashome\" is specified, it must be a valid directory (it was set to " + this.f134986v + ").", r());
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected String t() {
        return null;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    File w(String str) {
        File file = new File(p(), str + this.f134987w);
        x("JAR file name: " + file.toString(), 3);
        return file;
    }

    @Override // org.apache.tools.ant.taskdefs.optional.ejb.h
    protected Hashtable<String, File> z(String str, SAXParser sAXParser) throws SAXException, IOException {
        IPlanetEjbc iPlanetEjbc = new IPlanetEjbc(new File(n().f134952b, str), new File(n().f134952b, G()), n().f134951a, m().toString(), sAXParser);
        iPlanetEjbc.t(this.f134988x);
        iPlanetEjbc.r(this.f134989y);
        File file = this.f134986v;
        if (file != null) {
            iPlanetEjbc.s(file);
        }
        if (n().f134958h != null) {
            for (g.c cVar : n().f134958h) {
                iPlanetEjbc.q(cVar.c(), cVar.b());
            }
        }
        try {
            iPlanetEjbc.i();
            this.B = iPlanetEjbc.k();
            Hashtable<String, File> hashtableL = iPlanetEjbc.l();
            String[] strArrJ = iPlanetEjbc.j();
            if (strArrJ.length > 0) {
                File file2 = n().f134952b;
                String strSubstring = str.substring(0, str.lastIndexOf(File.separator) + 1);
                for (String str2 : strArrJ) {
                    File file3 = new File(file2, strSubstring + str2.substring(str2.lastIndexOf(47) + 1));
                    if (!file3.exists()) {
                        throw new BuildException("The CMP descriptor file (" + file3 + ") could not be found.", r());
                    }
                    hashtableL.put(str2, file3);
                }
            }
            return hashtableL;
        } catch (IPlanetEjbc.EjbcException e10) {
            throw new BuildException("An error has occurred while trying to execute the iAS ejbc utility", e10, r());
        }
    }
}
