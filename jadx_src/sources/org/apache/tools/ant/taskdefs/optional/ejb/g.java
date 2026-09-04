package org.apache.tools.ant.taskdefs.optional.ejb;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.v0;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: EjbJar.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends h4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134945m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f134944l = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134946n = "-generic.jar";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f134947o = "1.0";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<f> f134948p = new ArrayList();

    /* JADX INFO: compiled from: EjbJar.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f134949c = "1.0";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f134950d = "2.0";

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"1.0", f134950d};
        }
    }

    /* JADX INFO: compiled from: EjbJar.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f134951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f134952b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f134954d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o0 f134956f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f134959i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public File f134960j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f134961k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f134953c = Constants.ACCEPT_TIME_SEPARATOR_SERVER;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f134955e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<org.apache.tools.ant.types.b0> f134957g = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList<c> f134958h = new ArrayList<>();

        b() {
        }
    }

    /* JADX INFO: compiled from: EjbJar.java */
    public static class c extends org.apache.tools.ant.types.r {
    }

    /* JADX INFO: compiled from: EjbJar.java */
    public static class d extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f134962c = "ejb-name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f134963d = "directory";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f134964e = "descriptor";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f134965f = "basejarname";

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{f134962c, f134963d, f134964e, f134965f};
        }
    }

    private void Y2() throws BuildException {
        b bVar = this.f134944l;
        File file = bVar.f134951a;
        if (file == null) {
            throw new BuildException("The srcDir attribute must be specified");
        }
        if (bVar.f134952b == null) {
            bVar.f134952b = file;
        }
        d dVar = bVar.f134959i;
        if (dVar == null) {
            bVar.f134959i = new d();
            this.f134944l.f134959i.g(d.f134964e);
        } else if (d.f134965f.equals(dVar.d()) && this.f134944l.f134954d == null) {
            throw new BuildException("The basejarname attribute must be specified with the basejarname naming scheme");
        }
    }

    public o0 A2() {
        b bVar = this.f134944l;
        if (bVar.f134956f == null) {
            bVar.f134956f = new o0(b());
        }
        return this.f134944l.f134956f.u2();
    }

    public c B2() {
        c cVar = new c();
        this.f134944l.f134958h.add(cVar);
        return cVar;
    }

    public i C2() {
        x1("iPlanet Application Server deployment tools", 3);
        i iVar = new i();
        y2(iVar);
        return iVar;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        Y2();
        if (this.f134948p.isEmpty()) {
            h hVar = new h();
            hVar.d(this);
            hVar.C(this.f134945m);
            hVar.D(this.f134946n);
            this.f134948p.add(hVar);
        }
        for (f fVar : this.f134948p) {
            fVar.a(this.f134944l);
            fVar.c();
        }
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(true);
            SAXParser sAXParserNewSAXParser = sAXParserFactoryNewInstance.newSAXParser();
            v0 v0VarP2 = p2(this.f134944l.f134952b);
            v0VarP2.e();
            String[] strArrM = v0VarP2.m();
            x1(strArrM.length + " deployment descriptors located.", 3);
            for (String str : strArrM) {
                Iterator<f> it = this.f134948p.iterator();
                while (it.hasNext()) {
                    it.next().b(str, sAXParserNewSAXParser);
                }
            }
        } catch (ParserConfigurationException e10) {
            throw new BuildException("ParserConfigurationException while creating parser. ", e10);
        } catch (SAXException e11) {
            throw new BuildException("SAXException while creating parser.", e11);
        }
    }

    public q D2() {
        q qVar = new q();
        y2(qVar);
        return qVar;
    }

    public r E2() {
        x1("JOnAS deployment tools", 3);
        r rVar = new r();
        y2(rVar);
        return rVar;
    }

    public s F2() {
        s sVar = new s();
        y2(sVar);
        return sVar;
    }

    public org.apache.tools.ant.types.b0 G2() {
        org.apache.tools.ant.types.b0 b0Var = new org.apache.tools.ant.types.b0();
        this.f134944l.f134957g.add(b0Var);
        return b0Var;
    }

    public d0 H2() {
        d0 d0Var = new d0();
        y2(d0Var);
        return d0Var;
    }

    public e0 I2() {
        x1("The <weblogictoplink> element is no longer required. Please use the <weblogic> element and set newCMP=\"true\"", 2);
        e0 e0Var = new e0();
        y2(e0Var);
        return e0Var;
    }

    public m0 J2() {
        m0 m0Var = new m0();
        y2(m0Var);
        return m0Var;
    }

    public String K2() {
        return this.f134947o;
    }

    public File L2() {
        return this.f134945m;
    }

    public void M2(String str) {
        b bVar = this.f134944l;
        bVar.f134954d = str;
        d dVar = bVar.f134959i;
        if (dVar == null) {
            bVar.f134959i = new d();
            this.f134944l.f134959i.g(d.f134965f);
        } else if (!d.f134965f.equals(dVar.d())) {
            throw new BuildException("The basejarname attribute is not compatible with the %s naming scheme", this.f134944l.f134959i.d());
        }
    }

    public void N2(String str) {
        this.f134944l.f134953c = str;
    }

    public void O2(o0 o0Var) {
        this.f134944l.f134956f = o0Var;
    }

    public void P2(a aVar) {
        this.f134947o = aVar.d();
    }

    public void Q2(String str) {
        this.f134944l.f134961k = str;
    }

    public void R2(File file) {
        this.f134944l.f134952b = file;
    }

    public void S2(File file) {
        this.f134945m = file;
    }

    public void T2(boolean z10) {
        this.f134944l.f134955e = z10;
    }

    public void U2(String str) {
        this.f134946n = str;
    }

    public void V2(File file) {
        this.f134944l.f134960j = file;
    }

    public void W2(d dVar) {
        this.f134944l.f134959i = dVar;
        if (!d.f134965f.equals(dVar.d()) && this.f134944l.f134954d != null) {
            throw new BuildException("The basejarname attribute is not compatible with the %s naming scheme", this.f134944l.f134959i.d());
        }
    }

    public void X2(File file) {
        this.f134944l.f134951a = file;
    }

    protected void y2(f fVar) {
        fVar.d(this);
        this.f134948p.add(fVar);
    }

    public org.apache.tools.ant.taskdefs.optional.ejb.c z2() {
        x1("Borland deployment tools", 3);
        org.apache.tools.ant.taskdefs.optional.ejb.c cVar = new org.apache.tools.ant.taskdefs.optional.ejb.c();
        cVar.d(this);
        this.f134948p.add(cVar);
        return cVar;
    }
}
