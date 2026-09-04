package org.apache.tools.ant.taskdefs.optional;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.c2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.r0;
import org.apache.tools.ant.util.y2;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.ParserAdapter;

/* JADX INFO: compiled from: XMLValidateTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class h0 extends u2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final j0 f135121x = j0.O();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final String f135122y = "Could not start xml validation: ";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f135123z = " file(s) have been successfully validated.";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected o0 f135130q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f135124k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f135125l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f135126m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f135127n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected File f135128o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected Vector<org.apache.tools.ant.types.b0> f135129p = new Vector<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected XMLReader f135131r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected c f135132s = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Vector<a> f135133t = new Vector<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Vector<b> f135134u = new Vector<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c2 f135135v = new c2();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private org.apache.tools.ant.g f135136w = null;

    /* JADX INFO: compiled from: XMLValidateTask.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135137a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f135138b;

        public String a() {
            return this.f135137a;
        }

        public boolean b() {
            return this.f135138b;
        }

        public void c(String str) {
            this.f135137a = str;
        }

        public void d(boolean z10) {
            this.f135138b = z10;
        }
    }

    /* JADX INFO: compiled from: XMLValidateTask.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f135140b;

        public String a() {
            return this.f135139a;
        }

        public String b() {
            return this.f135140b;
        }

        public void c(String str) {
            this.f135139a = str;
        }

        public void d(String str) {
            this.f135140b = str;
        }
    }

    /* JADX INFO: compiled from: XMLValidateTask.java */
    public class c implements ErrorHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected File f135141b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f135142c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected boolean f135143d = false;

        protected c() {
        }

        private void a(SAXParseException sAXParseException, int i10) {
            h0.this.x1(c(sAXParseException), i10);
        }

        private String c(SAXParseException sAXParseException) {
            String systemId = sAXParseException.getSystemId();
            if (systemId == null) {
                return sAXParseException.getMessage();
            }
            if (systemId.startsWith("file:")) {
                try {
                    systemId = h0.f135121x.K(systemId);
                } catch (Exception unused) {
                }
            }
            int lineNumber = sAXParseException.getLineNumber();
            int columnNumber = sAXParseException.getColumnNumber();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(systemId);
            String string = "";
            if (lineNumber != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(":");
                sb3.append(lineNumber);
                if (columnNumber != -1) {
                    string = ":" + columnNumber;
                }
                sb3.append(string);
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(": ");
            sb2.append(sAXParseException.getMessage());
            return sb2.toString();
        }

        public boolean b() {
            return this.f135143d;
        }

        public void d(File file) {
            this.f135141b = file;
            this.f135143d = false;
        }

        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) {
            this.f135143d = true;
            a(sAXParseException, 0);
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) {
            this.f135143d = true;
            a(sAXParseException, 0);
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) {
            if (h0.this.f135125l) {
                a(sAXParseException, 1);
            }
        }
    }

    private Object q2() {
        try {
            return p2();
        } catch (BuildException unused) {
            return r0.f();
        }
    }

    public void A2(o0 o0Var) {
        o0 o0Var2 = this.f135130q;
        if (o0Var2 == null) {
            this.f135130q = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void B2(q1 q1Var) {
        n2().c2(q1Var);
    }

    public void C2(boolean z10) {
        this.f135124k = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        int i10;
        try {
            if (this.f135128o == null && this.f135129p.isEmpty()) {
                throw new BuildException("Specify at least one source - a file or a fileset.");
            }
            File file = this.f135128o;
            if (file == null) {
                i10 = 0;
            } else if (file.exists() && this.f135128o.canRead() && this.f135128o.isFile()) {
                t2(this.f135128o);
                i10 = 1;
            } else {
                String str = "File " + this.f135128o + " cannot be read";
                if (this.f135124k) {
                    throw new BuildException(str);
                }
                x1(str, 0);
                i10 = 0;
            }
            for (org.apache.tools.ant.types.b0 b0Var : this.f135129p) {
                for (String str2 : b0Var.B2(b()).m()) {
                    t2(new File(b0Var.z2(b()), str2));
                    i10++;
                }
            }
            y2(i10);
            l2();
        } catch (Throwable th2) {
            l2();
            throw th2;
        }
    }

    protected void D2(String str, boolean z10) throws BuildException {
        x1("Setting feature " + str + ContainerUtils.KEY_VALUE_DELIMITER + z10, 4);
        try {
            this.f135131r.setFeature(str, z10);
        } catch (SAXNotRecognizedException e10) {
            throw new BuildException("Parser " + this.f135131r.getClass().getName() + " doesn't recognize feature " + str, e10, w1());
        } catch (SAXNotSupportedException e11) {
            throw new BuildException("Parser " + this.f135131r.getClass().getName() + " doesn't support feature " + str, e11, w1());
        }
    }

    public void E2(File file) {
        this.f135128o = file;
    }

    public void F2(boolean z10) {
        this.f135126m = z10;
    }

    protected void G2(String str, String str2) throws BuildException {
        if (str == null || str2 == null) {
            throw new BuildException("Property name and value must be specified.");
        }
        try {
            this.f135131r.setProperty(str, str2);
        } catch (SAXNotRecognizedException e10) {
            throw new BuildException("Parser " + this.f135131r.getClass().getName() + " doesn't recognize property " + str, e10, w1());
        } catch (SAXNotSupportedException e11) {
            throw new BuildException("Parser " + this.f135131r.getClass().getName() + " doesn't support property " + str, e11, w1());
        }
    }

    public void H2(boolean z10) {
        this.f135125l = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void V1() throws BuildException {
        super.V1();
        this.f135135v.J(b());
    }

    public void j2(c2 c2Var) {
        this.f135135v.k2(c2Var);
    }

    public void k2(org.apache.tools.ant.types.b0 b0Var) {
        this.f135129p.addElement(b0Var);
    }

    protected void l2() {
        org.apache.tools.ant.g gVar = this.f135136w;
        if (gVar != null) {
            gVar.n();
            this.f135136w = null;
        }
    }

    public a m2() {
        a aVar = new a();
        this.f135133t.addElement(aVar);
        return aVar;
    }

    public o0 n2() {
        if (this.f135130q == null) {
            this.f135130q = new o0(b());
        }
        return this.f135130q.u2();
    }

    public org.apache.tools.ant.types.r o2() {
        org.apache.tools.ant.types.r rVar = new org.apache.tools.ant.types.r();
        this.f135135v.l2(rVar);
        return rVar;
    }

    protected XMLReader p2() {
        return r0.i();
    }

    public b r2() {
        b bVar = new b();
        this.f135134u.addElement(bVar);
        return bVar;
    }

    protected XMLReader s2() {
        Class<?> cls;
        Object objNewInstance;
        String str = this.f135127n;
        if (str == null) {
            objNewInstance = q2();
        } else {
            try {
                if (this.f135130q != null) {
                    org.apache.tools.ant.g gVarZ = b().z(this.f135130q);
                    this.f135136w = gVarZ;
                    cls = Class.forName(this.f135127n, true, gVarZ);
                } else {
                    cls = Class.forName(str);
                }
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                throw new BuildException(f135122y + this.f135127n, e10);
            }
        }
        if (objNewInstance instanceof XMLReader) {
            XMLReader xMLReader = (XMLReader) objNewInstance;
            x1("Using SAX2 reader " + objNewInstance.getClass().getName(), 3);
            return xMLReader;
        }
        if (!(objNewInstance instanceof Parser)) {
            throw new BuildException(f135122y + objNewInstance.getClass().getName() + " implements nor SAX1 Parser nor SAX2 XMLReader.");
        }
        ParserAdapter parserAdapter = new ParserAdapter((Parser) objNewInstance);
        x1("Using SAX1 parser " + objNewInstance.getClass().getName(), 3);
        return parserAdapter;
    }

    protected boolean t2(File file) {
        boolean z10;
        w2();
        try {
            x1("Validating " + file.getName() + "... ", 3);
            this.f135132s.d(file);
            InputSource inputSource = new InputSource(Files.newInputStream(file.toPath(), new OpenOption[0]));
            inputSource.setSystemId(f135121x.q0(file.getAbsolutePath()));
            this.f135131r.parse(inputSource);
            z10 = true;
        } catch (IOException e10) {
            throw new BuildException("Could not validate document " + file, e10);
        } catch (SAXException e11) {
            x1("Caught when validating: " + e11.toString(), 4);
            if (this.f135124k) {
                throw new BuildException("Could not validate document " + file);
            }
            log("Could not validate document " + file + ": " + e11.toString());
            z10 = false;
        }
        if (!this.f135132s.b()) {
            return z10;
        }
        if (this.f135124k) {
            throw new BuildException(file + " is not a valid XML document.");
        }
        x1(file + " is not a valid XML document", 0);
        return false;
    }

    protected EntityResolver u2() {
        return this.f135135v;
    }

    protected XMLReader v2() {
        return this.f135131r;
    }

    protected void w2() {
        XMLReader xMLReaderS2 = s2();
        this.f135131r = xMLReaderS2;
        xMLReaderS2.setEntityResolver(u2());
        this.f135131r.setErrorHandler(this.f135132s);
        if (x2()) {
            return;
        }
        if (!this.f135126m) {
            D2(y2.f137027e, true);
        }
        for (a aVar : this.f135133t) {
            D2(aVar.a(), aVar.b());
        }
        for (b bVar : this.f135134u) {
            G2(bVar.a(), bVar.b());
        }
    }

    protected boolean x2() {
        return this.f135131r instanceof ParserAdapter;
    }

    protected void y2(int i10) {
        log(i10 + f135123z);
    }

    public void z2(String str) {
        this.f135127n = str;
    }
}
