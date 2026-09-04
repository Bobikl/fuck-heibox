package org.apache.tools.ant.helper;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Locale;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.RuntimeConfigurable;
import org.apache.tools.ant.e2;
import org.apache.tools.ant.i1;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.t2;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.r0;
import org.apache.tools.ant.x2;
import org.apache.tools.ant.y2;
import org.apache.tools.ant.z2;
import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLReaderAdapter;

/* JADX INFO: compiled from: ProjectHelperImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends e2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final j0 f133377u = j0.O();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Parser f133378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Project f133379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private File f133380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f133381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Locator f133382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t2 f133383t;

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class a extends HandlerBase {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected DocumentHandler f133384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        f f133385c;

        public a(f fVar, DocumentHandler documentHandler) {
            this.f133384b = documentHandler;
            this.f133385c = fVar;
            fVar.f133378o.setDocumentHandler(this);
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXParseException {
            String strTrim = new String(cArr, i10, i11).trim();
            if (strTrim.isEmpty()) {
                return;
            }
            throw new SAXParseException("Unexpected text \"" + strTrim + "\"", this.f133385c.f133382s);
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void endElement(String str) throws SAXException {
            this.f133385c.f133378o.setDocumentHandler(this.f133384b);
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            throw new SAXParseException("Unexpected element \"" + str + "\"", this.f133385c.f133382s);
        }
    }

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t2 f133386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f133387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RuntimeConfigurable f133388f;

        public b(f fVar, DocumentHandler documentHandler, t2 t2Var) {
            super(fVar, documentHandler);
            this.f133388f = null;
            this.f133386d = t2Var;
        }

        public void a(String str, AttributeList attributeList) throws SAXParseException {
            try {
                Object objA = this.f133385c.f133379p.A(str);
                this.f133387e = objA;
                if (objA == null) {
                    throw new BuildException("Unknown data type " + str);
                }
                RuntimeConfigurable runtimeConfigurable = new RuntimeConfigurable(objA, str);
                this.f133388f = runtimeConfigurable;
                runtimeConfigurable.w(attributeList);
                this.f133386d.c(this.f133388f);
            } catch (BuildException e10) {
                throw new SAXParseException(e10.getMessage(), this.f133385c.f133382s, e10);
            }
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void characters(char[] cArr, int i10, int i11) {
            this.f133388f.c(cArr, i10, i11);
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            new d(this.f133385c, this, this.f133387e, this.f133388f, this.f133386d).a(str, attributeList);
        }
    }

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class c extends a {
        public c(f fVar, DocumentHandler documentHandler) {
            super(fVar, documentHandler);
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String str = new String(cArr, i10, i11);
            String strJ0 = this.f133385c.f133379p.j0();
            if (strJ0 == null) {
                this.f133385c.f133379p.f1(str);
                return;
            }
            this.f133385c.f133379p.f1(strJ0 + str);
        }
    }

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class d extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f133389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f133390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RuntimeConfigurable f133391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private RuntimeConfigurable f133392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private t2 f133393h;

        public d(f fVar, DocumentHandler documentHandler, Object obj, RuntimeConfigurable runtimeConfigurable, t2 t2Var) {
            super(fVar, documentHandler);
            this.f133392g = null;
            if (obj instanceof y2) {
                this.f133389d = ((y2) obj).R();
            } else {
                this.f133389d = obj;
            }
            this.f133391f = runtimeConfigurable;
            this.f133393h = t2Var;
        }

        public void a(String str, AttributeList attributeList) throws SAXParseException {
            i1 i1VarB = i1.B(this.f133385c.f133379p, this.f133389d.getClass());
            try {
                String lowerCase = str.toLowerCase(Locale.ENGLISH);
                if (this.f133389d instanceof z2) {
                    z2 z2Var = new z2(lowerCase);
                    z2Var.J(this.f133385c.f133379p);
                    ((z2) this.f133389d).i2(z2Var);
                    this.f133390e = z2Var;
                } else {
                    this.f133390e = i1VarB.j(this.f133385c.f133379p, this.f133389d, lowerCase);
                }
                this.f133385c.R(this.f133390e, attributeList);
                RuntimeConfigurable runtimeConfigurable = new RuntimeConfigurable(this.f133390e, str);
                this.f133392g = runtimeConfigurable;
                runtimeConfigurable.w(attributeList);
                this.f133391f.a(this.f133392g);
            } catch (BuildException e10) {
                throw new SAXParseException(e10.getMessage(), this.f133385c.f133382s, e10);
            }
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void characters(char[] cArr, int i10, int i11) {
            this.f133392g.c(cArr, i10, i11);
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            Object obj = this.f133390e;
            if (obj instanceof x2) {
                new h(this.f133385c, this, (x2) obj, this.f133392g, this.f133393h).a(str, attributeList);
            } else {
                new d(this.f133385c, this, obj, this.f133392g, this.f133393h).a(str, attributeList);
            }
        }
    }

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class e extends a {
        public e(f fVar, DocumentHandler documentHandler) {
            super(fVar, documentHandler);
        }

        private void a(String str, AttributeList attributeList) throws SAXParseException {
            new g(this.f133385c, this).a(str, attributeList);
        }

        public void b(String str, AttributeList attributeList) throws SAXParseException {
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            for (int i10 = 0; i10 < attributeList.getLength(); i10++) {
                String name = attributeList.getName(i10);
                String value = attributeList.getValue(i10);
                name.hashCode();
                switch (name) {
                    case "basedir":
                        str5 = value;
                        break;
                    case "id":
                        str4 = value;
                        break;
                    case "name":
                        str3 = value;
                        break;
                    case "default":
                        str2 = value;
                        break;
                    default:
                        throw new SAXParseException("Unexpected attribute \"" + name + "\"", this.f133385c.f133382s);
                }
            }
            if (str2 == null || str2.isEmpty()) {
                throw new BuildException("The default attribute is required");
            }
            this.f133385c.f133379p.c1(str2);
            if (str3 != null) {
                this.f133385c.f133379p.m1(str3);
                this.f133385c.f133379p.i(str3, this.f133385c.f133379p);
            }
            if (str4 != null) {
                this.f133385c.f133379p.i(str4, this.f133385c.f133379p);
            }
            if (this.f133385c.f133379p.u0(j1.f133489m) != null) {
                this.f133385c.f133379p.a1(this.f133385c.f133379p.u0(j1.f133489m));
            } else if (str5 == null) {
                this.f133385c.f133379p.a1(this.f133385c.f133381r.getAbsolutePath());
            } else if (new File(str5).isAbsolute()) {
                this.f133385c.f133379p.a1(str5);
            } else {
                this.f133385c.f133379p.Z0(f.f133377u.n0(this.f133385c.f133381r, str5));
            }
            this.f133385c.f133379p.j("", this.f133385c.f133383t);
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            if ("target".equals(str)) {
                a(str, attributeList);
            } else {
                f fVar = this.f133385c;
                f.S(fVar, this, fVar.f133383t, str, attributeList);
            }
        }
    }

    /* JADX INFO: renamed from: org.apache.tools.ant.helper.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class C1229f extends HandlerBase {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f133394b;

        public C1229f(f fVar) {
            this.f133394b = fVar;
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            this.f133394b.f133379p.M0("resolving systemId: " + str2, 3);
            if (!str2.startsWith("file:")) {
                return null;
            }
            String strK = f.f133377u.K(str2);
            File file = new File(strK);
            if (!file.isAbsolute()) {
                file = f.f133377u.n0(this.f133394b.f133381r, strK);
                this.f133394b.f133379p.M0("Warning: '" + str2 + "' in " + this.f133394b.f133380q + " should be expressed simply as '" + strK.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) + "' for compliance with other XML tools", 1);
            }
            try {
                InputSource inputSource = new InputSource(Files.newInputStream(file.toPath(), new OpenOption[0]));
                inputSource.setSystemId(f.f133377u.q0(file.getAbsolutePath()));
                return inputSource;
            } catch (IOException unused) {
                this.f133394b.f133379p.M0(file.getAbsolutePath() + " could not be found", 1);
                return null;
            }
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void setDocumentLocator(Locator locator) {
            this.f133394b.f133382s = locator;
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            if (!"project".equals(str)) {
                throw new SAXParseException("Config file is not of expected XML type", this.f133394b.f133382s);
            }
            new e(this.f133394b, this).b(str, attributeList);
        }
    }

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t2 f133395d;

        public g(f fVar, DocumentHandler documentHandler) {
            super(fVar, documentHandler);
        }

        public void a(String str, AttributeList attributeList) throws SAXParseException {
            String str2 = null;
            String str3 = "";
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            for (int i10 = 0; i10 < attributeList.getLength(); i10++) {
                String name = attributeList.getName(i10);
                String value = attributeList.getValue(i10);
                name.hashCode();
                switch (name) {
                    case "description":
                        str6 = value;
                        break;
                    case "unless":
                        str5 = value;
                        break;
                    case "id":
                        str7 = value;
                        break;
                    case "if":
                        str4 = value;
                        break;
                    case "name":
                        if (value.isEmpty()) {
                            throw new BuildException("name attribute must not be empty", new Location(this.f133385c.f133382s));
                        }
                        str2 = value;
                        break;
                        break;
                    case "depends":
                        str3 = value;
                        break;
                    default:
                        throw new SAXParseException("Unexpected attribute \"" + name + "\"", this.f133385c.f133382s);
                }
            }
            if (str2 == null) {
                throw new SAXParseException("target element appears without a name attribute", this.f133385c.f133382s);
            }
            t2 t2Var = new t2();
            this.f133395d = t2Var;
            t2Var.d("");
            this.f133395d.z(str2);
            this.f133395d.w(str4);
            this.f133395d.B(str5);
            this.f133395d.v(str6);
            this.f133385c.f133379p.j(str2, this.f133395d);
            if (str7 != null && !str7.isEmpty()) {
                this.f133385c.f133379p.i(str7, this.f133395d);
            }
            if (str3.isEmpty()) {
                return;
            }
            this.f133395d.u(str3);
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            f.S(this.f133385c, this, this.f133395d, str, attributeList);
        }
    }

    /* JADX INFO: compiled from: ProjectHelperImpl.java */
    public static class h extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t2 f133396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x2 f133397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private u2 f133398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private RuntimeConfigurable f133399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private RuntimeConfigurable f133400h;

        public h(f fVar, DocumentHandler documentHandler, x2 x2Var, RuntimeConfigurable runtimeConfigurable, t2 t2Var) {
            super(fVar, documentHandler);
            this.f133400h = null;
            this.f133397e = x2Var;
            this.f133399g = runtimeConfigurable;
            this.f133396d = t2Var;
        }

        public void a(String str, AttributeList attributeList) throws SAXParseException {
            try {
                this.f133398f = this.f133385c.f133379p.C(str);
            } catch (BuildException unused) {
            }
            if (this.f133398f == null) {
                z2 z2Var = new z2(str);
                this.f133398f = z2Var;
                z2Var.J(this.f133385c.f133379p);
                this.f133398f.g2(str);
            }
            this.f133398f.A1(new Location(this.f133385c.f133382s));
            this.f133385c.R(this.f133398f, attributeList);
            this.f133398f.e2(this.f133396d);
            this.f133397e.c1(this.f133398f);
            this.f133398f.V1();
            RuntimeConfigurable runtimeConfigurableI1 = this.f133398f.I1();
            this.f133400h = runtimeConfigurableI1;
            runtimeConfigurableI1.w(attributeList);
            RuntimeConfigurable runtimeConfigurable = this.f133399g;
            if (runtimeConfigurable != null) {
                runtimeConfigurable.a(this.f133400h);
            }
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void characters(char[] cArr, int i10, int i11) {
            this.f133400h.c(cArr, i10, i11);
        }

        @Override // org.apache.tools.ant.helper.f.a, org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXParseException {
            Cloneable cloneable = this.f133398f;
            if (cloneable instanceof x2) {
                new h(this.f133385c, this, (x2) cloneable, this.f133400h, this.f133396d).a(str, attributeList);
            } else {
                new d(this.f133385c, this, cloneable, this.f133400h, this.f133396d).a(str, attributeList);
            }
        }
    }

    public f() {
        t2 t2Var = new t2();
        this.f133383t = t2Var;
        t2Var.z("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Object obj, AttributeList attributeList) {
        String value = attributeList.getValue("id");
        if (value != null) {
            this.f133379p.i(value, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(f fVar, DocumentHandler documentHandler, t2 t2Var, String str, AttributeList attributeList) throws SAXParseException {
        if ("description".equals(str)) {
            new c(fVar, documentHandler);
        } else if (fVar.f133379p.g0().get(str) != null) {
            new b(fVar, documentHandler, t2Var).a(str, attributeList);
        } else {
            new h(fVar, documentHandler, t2Var, null, t2Var).a(str, attributeList);
        }
    }

    @Override // org.apache.tools.ant.e2
    public void x(Project project, Object obj) throws BuildException {
        if (!(obj instanceof File)) {
            throw new BuildException("Only File source supported by default plugin");
        }
        File file = (File) obj;
        this.f133379p = project;
        this.f133380q = new File(file.getAbsolutePath());
        this.f133381r = new File(this.f133380q.getParent());
        try {
            this.f133378o = r0.f();
        } catch (BuildException unused) {
            this.f133378o = new XMLReaderAdapter(r0.i());
        }
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                String strQ0 = f133377u.q0(file.getAbsolutePath());
                InputSource inputSource = new InputSource(inputStreamNewInputStream);
                inputSource.setSystemId(strQ0);
                project.M0("parsing buildfile " + file + " with URI = " + strQ0, 3);
                C1229f c1229f = new C1229f(this);
                this.f133378o.setDocumentHandler(c1229f);
                this.f133378o.setEntityResolver(c1229f);
                this.f133378o.setErrorHandler(c1229f);
                this.f133378o.setDTDHandler(c1229f);
                this.f133378o.parse(inputSource);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } catch (Throwable th2) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            throw new BuildException(e10);
        } catch (UnsupportedEncodingException e11) {
            throw new BuildException("Encoding of project file is invalid.", e11);
        } catch (IOException e12) {
            throw new BuildException("Error reading project file: " + e12.getMessage(), e12);
        } catch (SAXParseException e13) {
            Location location = new Location(e13.getSystemId(), e13.getLineNumber(), e13.getColumnNumber());
            Exception exception = e13.getException();
            if (!(exception instanceof BuildException)) {
                throw new BuildException(e13.getMessage(), exception, location);
            }
            BuildException buildException = (BuildException) exception;
            if (buildException.b() != Location.f133036e) {
                throw buildException;
            }
            buildException.c(location);
            throw buildException;
        } catch (SAXException e14) {
            Exception exception2 = e14.getException();
            if (!(exception2 instanceof BuildException)) {
                throw new BuildException(e14.getMessage(), exception2);
            }
            throw ((BuildException) exception2);
        }
    }
}
