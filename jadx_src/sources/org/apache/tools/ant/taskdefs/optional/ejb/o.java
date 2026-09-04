package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: IPlanetEjbcTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f135003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135004o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135005p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private File f135006q;

    private void i2() throws BuildException {
        File file = this.f135000k;
        if (file == null) {
            throw new BuildException("The standard EJB descriptor must be specified using the \"ejbdescriptor\" attribute.", w1());
        }
        if (!file.exists() || !this.f135000k.isFile()) {
            throw new BuildException("The standard EJB descriptor (" + this.f135000k + ") was not found or isn't a file.", w1());
        }
        File file2 = this.f135001l;
        if (file2 == null) {
            throw new BuildException("The iAS-speific XML descriptor must be specified using the \"iasdescriptor\" attribute.", w1());
        }
        if (!file2.exists() || !this.f135001l.isFile()) {
            throw new BuildException("The iAS-specific XML descriptor (" + this.f135001l + ") was not found or isn't a file.", w1());
        }
        File file3 = this.f135002m;
        if (file3 == null) {
            throw new BuildException("The destination directory must be specified using the \"dest\" attribute.", w1());
        }
        if (!file3.exists() || !this.f135002m.isDirectory()) {
            throw new BuildException("The destination directory (" + this.f135002m + ") was not found or isn't a directory.", w1());
        }
        File file4 = this.f135006q;
        if (file4 == null || file4.isDirectory()) {
            return;
        }
        throw new BuildException("If \"iashome\" is specified, it must be a valid directory (it was set to " + this.f135006q + ").", w1());
    }

    private void k2(SAXParser sAXParser) throws BuildException {
        IPlanetEjbc iPlanetEjbc = new IPlanetEjbc(this.f135000k, this.f135001l, this.f135002m, l2().toString(), sAXParser);
        iPlanetEjbc.t(this.f135004o);
        iPlanetEjbc.r(this.f135005p);
        File file = this.f135006q;
        if (file != null) {
            iPlanetEjbc.s(file);
        }
        try {
            iPlanetEjbc.i();
        } catch (IOException e10) {
            throw new BuildException("An IOException occurred while trying to read the XML descriptor file: " + e10.getMessage(), e10, w1());
        } catch (IPlanetEjbc.EjbcException e11) {
            throw new BuildException("An exception occurred while trying to run the ejbc utility: " + e11.getMessage(), e11, w1());
        } catch (SAXException e12) {
            throw new BuildException("A SAXException occurred while trying to read the XML descriptor file: " + e12.getMessage(), e12, w1());
        }
    }

    private o0 l2() {
        o0 o0Var = this.f135003n;
        return o0Var == null ? new o0(b()).s2("last") : o0Var.s2(z0.b.f136024i);
    }

    private SAXParser m2() throws BuildException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(true);
            return sAXParserFactoryNewInstance.newSAXParser();
        } catch (ParserConfigurationException | SAXException e10) {
            throw new BuildException("Unable to create a SAXParser: " + e10.getMessage(), e10, w1());
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        i2();
        k2(m2());
    }

    public o0 j2() {
        if (this.f135003n == null) {
            this.f135003n = new o0(b());
        }
        return this.f135003n.u2();
    }

    public void n2(o0 o0Var) {
        o0 o0Var2 = this.f135003n;
        if (o0Var2 == null) {
            this.f135003n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void o2(boolean z10) {
        this.f135005p = z10;
    }

    public void p2(File file) {
        this.f135002m = file;
    }

    public void q2(File file) {
        this.f135000k = file;
    }

    public void r2(File file) {
        this.f135001l = file;
    }

    public void s2(File file) {
        this.f135006q = file;
    }

    public void t2(boolean z10) {
        this.f135004o = z10;
    }
}
