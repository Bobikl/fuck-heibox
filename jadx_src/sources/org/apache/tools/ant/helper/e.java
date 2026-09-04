package org.apache.tools.ant.helper;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.RuntimeConfigurable;
import org.apache.tools.ant.e2;
import org.apache.tools.ant.g1;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.t2;
import org.apache.tools.ant.types.resources.p1;
import org.apache.tools.ant.types.resources.y;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.r0;
import org.apache.tools.ant.z2;
import org.apache.tools.zip.x;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: ProjectHelper2.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends e2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f133367o = "ant.targets";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f133372t = "ant.parsing.context";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static a f133368p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static a f133369q = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static a f133370r = new c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static a f133371s = new d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final j0 f133373u = j0.O();

    /* JADX INFO: compiled from: ProjectHelper2.java */
    public static class a {
        public void a(char[] cArr, int i10, int i11, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            String strTrim = new String(cArr, i10, i11).trim();
            if (strTrim.isEmpty()) {
                return;
            }
            throw new SAXParseException("Unexpected text \"" + strTrim + "\"", bVar.n());
        }

        protected void b(String str) {
        }

        public void c(String str, String str2, String str3, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
        }

        public void d(String str, String str2, org.apache.tools.ant.helper.b bVar) {
        }

        public a e(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            throw new SAXParseException("Unexpected element \"" + str3 + " \"", bVar.n());
        }

        public void f(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
        }
    }

    /* JADX INFO: compiled from: ProjectHelper2.java */
    public static class b extends a {
        @Override // org.apache.tools.ant.helper.e.a
        public void a(char[] cArr, int i10, int i11, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            bVar.d().c(cArr, i10, i11);
        }

        @Override // org.apache.tools.ant.helper.e.a
        public void d(String str, String str2, org.apache.tools.ant.helper.b bVar) {
            bVar.v();
        }

        @Override // org.apache.tools.ant.helper.e.a
        public a e(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            return e.f133368p;
        }

        @Override // org.apache.tools.ant.helper.e.a
        public void f(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            RuntimeConfigurable runtimeConfigurableD = bVar.d();
            Object objM = runtimeConfigurableD != null ? runtimeConfigurableD.m() : null;
            z2 z2Var = new z2(str2);
            z2Var.J(bVar.p());
            z2Var.y2(str);
            z2Var.z2(str3);
            z2Var.h2(e2.l(z2Var.o2(), str2));
            z2Var.g2(str3);
            z2Var.A1(new Location(bVar.n().getSystemId(), bVar.n().getLineNumber(), bVar.n().getColumnNumber()));
            z2Var.e2(bVar.k());
            if (objM != null) {
                ((z2) objM).i2(z2Var);
            } else {
                bVar.k().c1(z2Var);
            }
            bVar.c(z2Var, attributes);
            RuntimeConfigurable runtimeConfigurable = new RuntimeConfigurable(z2Var, z2Var.K1());
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                String localName = attributes.getLocalName(i10);
                String uri = attributes.getURI(i10);
                if (uri != null && !uri.isEmpty() && !uri.equals(str)) {
                    localName = uri + ":" + attributes.getQName(i10);
                }
                String value = attributes.getValue(i10);
                if (e2.f133123g.equals(localName) || (e2.f133119c.equals(uri) && e2.f133123g.equals(attributes.getLocalName(i10)))) {
                    int iIndexOf = value.indexOf(":");
                    if (iIndexOf >= 0) {
                        String strSubstring = value.substring(0, iIndexOf);
                        String strO = bVar.o(strSubstring);
                        if (strO == null) {
                            throw new BuildException("Unable to find XML NS prefix \"" + strSubstring + "\"");
                        }
                        value = e2.l(strO, value.substring(iIndexOf + 1));
                    }
                    localName = e2.f133123g;
                }
                runtimeConfigurable.v(localName, value);
            }
            if (runtimeConfigurableD != null) {
                runtimeConfigurableD.a(runtimeConfigurable);
            }
            bVar.w(runtimeConfigurable);
        }
    }

    /* JADX INFO: compiled from: ProjectHelper2.java */
    public static class c extends a {
        @Override // org.apache.tools.ant.helper.e.a
        public a e(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            if ("project".equals(str2) && (str.isEmpty() || str.equals(e2.f133119c))) {
                return e.f133371s;
            }
            if (!str2.equals(str3)) {
                throw new SAXParseException("Unexpected element \"" + str3 + "\" " + str2, bVar.n());
            }
            throw new SAXParseException("Unexpected element \"{" + str + z5.g.f141884d + str2 + "\" {" + e2.f133119c + z5.g.f141884d + str2, bVar.n());
        }
    }

    /* JADX INFO: compiled from: ProjectHelper2.java */
    public static class d extends a {
        @Override // org.apache.tools.ant.helper.e.a
        public a e(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            return (("target".equals(str2) || "extension-point".equals(str2)) && (str.isEmpty() || str.equals(e2.f133119c))) ? e.f133369q : e.f133368p;
        }

        @Override // org.apache.tools.ant.helper.e.a
        public void f(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            Object url;
            Object objI;
            Project projectP = bVar.p();
            bVar.m().y(new Location(bVar.n()));
            String str4 = null;
            boolean z10 = false;
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                String uri = attributes.getURI(i10);
                if (uri == null || uri.isEmpty() || uri.equals(str)) {
                    String value = attributes.getValue(i10);
                    String localName = attributes.getLocalName(i10);
                    localName.hashCode();
                    switch (localName) {
                        case "basedir":
                            if (bVar.s()) {
                                break;
                            } else {
                                str4 = value;
                                break;
                            }
                            break;
                        case "id":
                            if (value != null && !bVar.s()) {
                                projectP.i(value, projectP);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "name":
                            if (value != null) {
                                bVar.z(value);
                                if (!bVar.s()) {
                                    projectP.m1(value);
                                    projectP.i(value, projectP);
                                } else if (e2.t() && !value.isEmpty() && e2.o() != null && e2.o().endsWith(e2.f133127k)) {
                                    e2.E(e2.o().replace(e2.f133127k, value));
                                }
                                z10 = true;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "default":
                            if (value != null && !value.isEmpty() && !bVar.s()) {
                                projectP.c1(value);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            throw new SAXParseException("Unexpected attribute \"" + attributes.getQName(i10) + "\"", bVar.n());
                    }
                }
            }
            String str5 = "ant.file." + bVar.j();
            String strU0 = projectP.u0(str5);
            String str6 = "ant.file.type." + bVar.j();
            String strU1 = projectP.u0(str6);
            if (strU0 != null && z10) {
                if ("url".equals(strU1)) {
                    try {
                        url = new URL(strU0);
                        objI = bVar.i();
                    } catch (MalformedURLException e10) {
                        throw new BuildException("failed to parse " + strU0 + " as URL while looking at a duplicate project name.", e10);
                    }
                } else {
                    url = new File(strU0);
                    objI = bVar.f();
                }
                if (bVar.s() && !url.equals(objI)) {
                    projectP.M0("Duplicated project name in import. Project " + bVar.j() + " defined first in " + strU0 + " and again in " + objI, 1);
                }
            }
            if (z10) {
                if (bVar.f() != null) {
                    projectP.s1(str5, bVar.f().toString());
                    projectP.s1(str6, "file");
                } else if (bVar.i() != null) {
                    projectP.s1(str5, bVar.i().toString());
                    projectP.s1(str6, "url");
                }
            }
            if (bVar.s()) {
                return;
            }
            if (projectP.u0(j1.f133489m) != null) {
                projectP.a1(projectP.u0(j1.f133489m));
            } else if (str4 == null) {
                projectP.a1(bVar.g().getAbsolutePath());
            } else if (new File(str4).isAbsolute()) {
                projectP.a1(str4);
            } else {
                projectP.Z0(e.f133373u.n0(bVar.g(), str4));
            }
            projectP.j("", bVar.m());
            bVar.A(bVar.m());
        }
    }

    /* JADX INFO: renamed from: org.apache.tools.ant.helper.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProjectHelper2.java */
    public static class C1228e extends DefaultHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Stack<a> f133374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f133375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private org.apache.tools.ant.helper.b f133376d;

        public C1228e(org.apache.tools.ant.helper.b bVar, a aVar) {
            Stack<a> stack = new Stack<>();
            this.f133374b = stack;
            this.f133375c = aVar;
            stack.push(aVar);
            this.f133376d = bVar;
        }

        public a b() {
            return this.f133375c;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXParseException {
            this.f133375c.a(cArr, i10, i11, this.f133376d);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            this.f133375c.d(str, str2, this.f133376d);
            a aVarPop = this.f133374b.pop();
            this.f133375c = aVarPop;
            if (aVarPop != null) {
                aVarPop.c(str, str2, str3, this.f133376d);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
            this.f133376d.e(str);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            this.f133376d.p().M0("resolving systemId: " + str2, 3);
            if (str2.startsWith("file:")) {
                String strK = e.f133373u.K(str2);
                File file = new File(strK);
                if (!file.isAbsolute()) {
                    file = e.f133373u.n0(this.f133376d.g(), strK);
                    this.f133376d.p().M0("Warning: '" + str2 + "' in " + this.f133376d.f() + " should be expressed simply as '" + strK.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) + "' for compliance with other XML tools", 1);
                }
                this.f133376d.p().M0("file=" + file, 4);
                try {
                    InputSource inputSource = new InputSource(Files.newInputStream(file.toPath(), new OpenOption[0]));
                    inputSource.setSystemId(e.f133373u.q0(file.getAbsolutePath()));
                    return inputSource;
                } catch (IOException unused) {
                    this.f133376d.p().M0(file.getAbsolutePath() + " could not be found", 1);
                }
            }
            this.f133376d.p().M0("could not resolve systemId", 4);
            return null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
            this.f133376d.E(locator);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXParseException {
            a aVarE = this.f133375c.e(str, str2, str3, attributes, this.f133376d);
            this.f133374b.push(this.f133375c);
            this.f133375c = aVarE;
            aVarE.f(str, str2, str3, attributes, this.f133376d);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
            this.f133376d.F(str, str2);
        }
    }

    /* JADX INFO: compiled from: ProjectHelper2.java */
    public static class f extends a {
        private String g(org.apache.tools.ant.helper.b bVar) {
            String strO = e2.o();
            if (strO != null && strO.isEmpty()) {
                strO = null;
            }
            if (strO != null) {
                return strO;
            }
            String strJ = bVar.j();
            if (strJ == null || !strJ.isEmpty()) {
                return strJ;
            }
            return null;
        }

        @Override // org.apache.tools.ant.helper.e.a
        public void d(String str, String str2, org.apache.tools.ant.helper.b bVar) {
            bVar.A(bVar.m());
        }

        @Override // org.apache.tools.ant.helper.e.a
        public a e(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            return e.f133368p;
        }

        @Override // org.apache.tools.ant.helper.e.a
        public void f(String str, String str2, String str3, Attributes attributes, org.apache.tools.ant.helper.b bVar) throws SAXParseException {
            String strG;
            boolean z10;
            Project projectP = bVar.p();
            t2 t2Var = "target".equals(str2) ? new t2() : new g1();
            t2Var.A(projectP);
            t2Var.y(new Location(bVar.n()));
            bVar.b(t2Var);
            String str4 = "";
            String str5 = null;
            String str6 = null;
            e2.a aVarB = null;
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                String uri = attributes.getURI(i10);
                if (uri != null && !uri.isEmpty()) {
                    if (!uri.equals(str)) {
                        continue;
                    }
                }
                String value = attributes.getValue(i10);
                String localName = attributes.getLocalName(i10);
                localName.hashCode();
                switch (localName) {
                    case "description":
                        t2Var.v(value);
                        break;
                    case "unless":
                        t2Var.B(value);
                        break;
                    case "extensionOf":
                        str6 = value;
                        break;
                    case "id":
                        if (value != null && !value.isEmpty()) {
                            bVar.p().i(value, t2Var);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "if":
                        t2Var.w(value);
                        break;
                    case "name":
                        if (value.isEmpty()) {
                            throw new BuildException("name attribute must not be empty");
                        }
                        str5 = value;
                        break;
                        break;
                    case "depends":
                        str4 = value;
                        break;
                    case "onMissingExtensionPoint":
                        try {
                            aVarB = e2.a.b(value);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new BuildException("Invalid onMissingExtensionPoint " + value);
                        }
                        break;
                    default:
                        throw new SAXParseException("Unexpected attribute \"" + attributes.getQName(i10) + "\"", bVar.n());
                }
            }
            if (str5 == null) {
                throw new SAXParseException("target element appears without a name attribute", bVar.n());
            }
            boolean z11 = bVar.s() && e2.t();
            String strN = e2.n();
            if (z11) {
                strG = g(bVar);
                if (strG == null) {
                    throw new BuildException("can't include build file " + bVar.i() + ", no as attribute has been given and the project tag doesn't specify a name attribute");
                }
                str5 = strG + strN + str5;
            } else {
                strG = null;
            }
            if (bVar.l().get(str5) != null) {
                throw new BuildException("Duplicate target '" + str5 + "'", t2Var.j());
            }
            if (projectP.y0().containsKey(str5)) {
                projectP.M0("Already defined in main or a previous import, ignore " + str5, 3);
                z10 = false;
            } else {
                t2Var.z(str5);
                bVar.l().put(str5, t2Var);
                projectP.g(str5, t2Var);
                z10 = true;
            }
            if (!str4.isEmpty()) {
                if (z11) {
                    Iterator<String> it = t2.q(str4, str5, "depends").iterator();
                    while (it.hasNext()) {
                        t2Var.d(strG + strN + it.next());
                    }
                } else {
                    t2Var.u(str4);
                }
            }
            if (!z11 && bVar.s() && (strG = g(bVar)) != null) {
                String str7 = strG + strN + str5;
                t2 t2Var2 = z10 ? "target".equals(str2) ? new t2(t2Var) : new g1(t2Var) : t2Var;
                t2Var2.z(str7);
                bVar.l().put(str7, t2Var2);
                projectP.g(str7, t2Var2);
            }
            if (aVarB != null && str6 == null) {
                throw new BuildException("onMissingExtensionPoint attribute cannot be specified unless extensionOf is specified", t2Var.j());
            }
            if (str6 != null) {
                e2 e2Var = (e2) bVar.p().w0("ant.projectHelper");
                for (String str8 : t2.q(str6, str5, "extensionOf")) {
                    if (aVarB == null) {
                        aVarB = e2.a.f133133b;
                    }
                    if (e2.t()) {
                        e2Var.q().add(new String[]{str8, t2Var.k(), aVarB.a(), strG + strN});
                    } else {
                        e2Var.q().add(new String[]{str8, t2Var.k(), aVarB.a()});
                    }
                }
            }
        }
    }

    protected static a L() {
        return f133368p;
    }

    protected static a M() {
        return f133370r;
    }

    protected static a N() {
        return f133371s;
    }

    protected static a O() {
        return f133369q;
    }

    protected static void R(a aVar) {
        f133368p = aVar;
    }

    protected static void S(a aVar) {
        f133370r = aVar;
    }

    protected static void T(a aVar) {
        f133371s = aVar;
    }

    protected static void U(a aVar) {
        f133369q = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[Catch: all -> 0x010e, IOException -> 0x0112, UnsupportedEncodingException -> 0x0137, FileNotFoundException -> 0x0155, SAXException -> 0x015d, SAXParseException -> 0x0178, TryCatch #5 {FileNotFoundException -> 0x0155, UnsupportedEncodingException -> 0x0137, IOException -> 0x0112, SAXParseException -> 0x0178, SAXException -> 0x015d, all -> 0x010e, blocks: (B:24:0x005f, B:26:0x0066, B:27:0x007f, B:31:0x0094, B:35:0x00ae), top: B:107:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[Catch: all -> 0x010e, IOException -> 0x0112, UnsupportedEncodingException -> 0x0137, FileNotFoundException -> 0x0155, SAXException -> 0x015d, SAXParseException -> 0x0178, TryCatch #5 {FileNotFoundException -> 0x0155, UnsupportedEncodingException -> 0x0137, IOException -> 0x0112, SAXParseException -> 0x0178, SAXException -> 0x015d, all -> 0x010e, blocks: (B:24:0x005f, B:26:0x0066, B:27:0x007f, B:31:0x0094, B:35:0x00ae), top: B:107:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: all -> 0x010e, IOException -> 0x0112, UnsupportedEncodingException -> 0x0137, FileNotFoundException -> 0x0155, SAXException -> 0x015d, SAXParseException -> 0x0178, TRY_ENTER, TRY_LEAVE, TryCatch #5 {FileNotFoundException -> 0x0155, UnsupportedEncodingException -> 0x0137, IOException -> 0x0112, SAXParseException -> 0x0178, SAXException -> 0x015d, all -> 0x010e, blocks: (B:24:0x005f, B:26:0x0066, B:27:0x007f, B:31:0x0094, B:35:0x00ae), top: B:107:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3 A[Catch: IOException -> 0x0103, UnsupportedEncodingException -> 0x0105, FileNotFoundException -> 0x0107, SAXException -> 0x0109, SAXParseException -> 0x010b, all -> 0x01af, TryCatch #12 {all -> 0x01af, blocks: (B:37:0x00bc, B:39:0x00c3, B:40:0x00c6, B:44:0x00e2, B:33:0x00a1, B:61:0x0114, B:62:0x0136, B:65:0x0139, B:66:0x0154, B:69:0x0157, B:70:0x015c, B:73:0x015f, B:75:0x0167, B:79:0x0171, B:80:0x0174, B:81:0x0175, B:82:0x0177, B:85:0x017a, B:87:0x0193, B:89:0x019d, B:90:0x01a0, B:91:0x01a1, B:95:0x01ab, B:96:0x01ae), top: B:107:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01be, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public void P(Project project, Object obj, C1228e c1228e) throws Throwable {
        File fileL0;
        x xVar;
        URL url;
        String string;
        String string2;
        x xVar2;
        InputStream inputStreamO;
        InputSource inputSource;
        String str;
        org.apache.tools.ant.helper.b bVar = c1228e.f133376d;
        try {
            try {
                if (!(obj instanceof File)) {
                    if (!(obj instanceof URL)) {
                        if (obj instanceof s1) {
                            s1 s1Var = (s1) obj;
                            y yVar = (y) s1Var.e2(y.class);
                            if (yVar == null) {
                                p1 p1Var = (p1) s1Var.e2(p1.class);
                                if (p1Var != null) {
                                    url = p1Var.getURL();
                                }
                                if (fileL0 != null) {
                                    fileL0 = f133373u.i0(fileL0.getAbsolutePath());
                                    bVar.x(fileL0);
                                    string = fileL0.toString();
                                } else {
                                    if (xVar != 0) {
                                        throw new BuildException("Source " + obj.getClass().getName() + " not supported by this plugin");
                                    }
                                    try {
                                        bVar.x(null);
                                        bVar.y(xVar);
                                        string = xVar.toString();
                                    } catch (MalformedURLException e10) {
                                        throw new BuildException(e10);
                                    }
                                }
                                XMLReader xMLReaderE = r0.e();
                                if (fileL0 != null) {
                                    String strQ0 = f133373u.q0(fileL0.getAbsolutePath());
                                    inputStreamO = Files.newInputStream(fileL0.toPath(), new OpenOption[0]);
                                    string2 = strQ0;
                                    xVar2 = null;
                                } else {
                                    string2 = xVar.toString();
                                    int iIndexOf = string2.indexOf("!/");
                                    if (string2.startsWith("jar:file") || iIndexOf <= -1) {
                                        URLConnection uRLConnectionOpenConnection = xVar.openConnection();
                                        uRLConnectionOpenConnection.setUseCaches(false);
                                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                                        xVar2 = null;
                                        inputStreamO = inputStream;
                                    } else {
                                        xVar2 = new x(org.apache.tools.ant.launch.Locator.fromJarURI(string2), "UTF-8");
                                        try {
                                            inputStreamO = xVar2.o(xVar2.n(string2.substring(iIndexOf + 2)));
                                        } catch (FileNotFoundException e11) {
                                            e = e11;
                                            throw new BuildException(e);
                                        } catch (UnsupportedEncodingException e12) {
                                            e = e12;
                                            throw new BuildException("Encoding of project file " + string + " is invalid.", e);
                                        } catch (IOException e13) {
                                            e = e13;
                                            throw new BuildException("Error reading project file " + string + ": " + e.getMessage(), e);
                                        } catch (SAXParseException e14) {
                                            e = e14;
                                            Location location = new Location(e.getSystemId(), e.getLineNumber(), e.getColumnNumber());
                                            Exception exception = e.getException();
                                            if (!(exception instanceof BuildException)) {
                                                String message = e.getMessage();
                                                if (exception != null) {
                                                    e = exception;
                                                }
                                                throw new BuildException(message, e, location);
                                            }
                                            BuildException buildException = (BuildException) exception;
                                            if (buildException.b() != Location.f133036e) {
                                                throw buildException;
                                            }
                                            buildException.c(location);
                                            throw buildException;
                                        } catch (SAXException e15) {
                                            e = e15;
                                            Exception exception2 = e.getException();
                                            if (exception2 instanceof BuildException) {
                                                throw ((BuildException) exception2);
                                            }
                                            String message2 = e.getMessage();
                                            if (exception2 != null) {
                                                e = exception2;
                                            }
                                            throw new BuildException(message2, e);
                                        }
                                    }
                                }
                                inputSource = new InputSource(inputStreamO);
                                if (string2 != null) {
                                    inputSource.setSystemId(string2);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("parsing buildfile ");
                                sb2.append(string);
                                sb2.append(" with URI = ");
                                sb2.append(string2);
                                if (xVar2 != null) {
                                    str = " from a zip file";
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                project.M0(sb2.toString(), 3);
                                xMLReaderE.setContentHandler(c1228e);
                                xMLReaderE.setEntityResolver(c1228e);
                                xMLReaderE.setErrorHandler(c1228e);
                                xMLReaderE.setDTDHandler(c1228e);
                                xMLReaderE.parse(inputSource);
                                j0.c(inputStreamO);
                                x.e(xVar2);
                                return;
                            }
                            fileL0 = yVar.l0();
                        }
                        fileL0 = null;
                        xVar = 0;
                        if (fileL0 != null) {
                            fileL0 = f133373u.i0(fileL0.getAbsolutePath());
                            bVar.x(fileL0);
                            string = fileL0.toString();
                        } else {
                            if (xVar != 0) {
                                throw new BuildException("Source " + obj.getClass().getName() + " not supported by this plugin");
                            }
                            bVar.x(null);
                            bVar.y(xVar);
                            string = xVar.toString();
                        }
                        XMLReader xMLReaderE2 = r0.e();
                        if (fileL0 != null) {
                            String strQ1 = f133373u.q0(fileL0.getAbsolutePath());
                            inputStreamO = Files.newInputStream(fileL0.toPath(), new OpenOption[0]);
                            string2 = strQ1;
                            xVar2 = null;
                        } else {
                            string2 = xVar.toString();
                            int iIndexOf2 = string2.indexOf("!/");
                            if (string2.startsWith("jar:file")) {
                                URLConnection uRLConnectionOpenConnection2 = xVar.openConnection();
                                uRLConnectionOpenConnection2.setUseCaches(false);
                                InputStream inputStream2 = uRLConnectionOpenConnection2.getInputStream();
                                xVar2 = null;
                                inputStreamO = inputStream2;
                            } else {
                                URLConnection uRLConnectionOpenConnection3 = xVar.openConnection();
                                uRLConnectionOpenConnection3.setUseCaches(false);
                                InputStream inputStream3 = uRLConnectionOpenConnection3.getInputStream();
                                xVar2 = null;
                                inputStreamO = inputStream3;
                            }
                        }
                        inputSource = new InputSource(inputStreamO);
                        if (string2 != null) {
                            inputSource.setSystemId(string2);
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("parsing buildfile ");
                        sb3.append(string);
                        sb3.append(" with URI = ");
                        sb3.append(string2);
                        if (xVar2 != null) {
                            str = " from a zip file";
                        } else {
                            str = "";
                        }
                        sb3.append(str);
                        project.M0(sb3.toString(), 3);
                        xMLReaderE2.setContentHandler(c1228e);
                        xMLReaderE2.setEntityResolver(c1228e);
                        xMLReaderE2.setErrorHandler(c1228e);
                        xMLReaderE2.setDTDHandler(c1228e);
                        xMLReaderE2.parse(inputSource);
                        j0.c(inputStreamO);
                        x.e(xVar2);
                        return;
                    }
                    url = (URL) obj;
                    xVar = url;
                    fileL0 = null;
                    if (fileL0 != null) {
                        fileL0 = f133373u.i0(fileL0.getAbsolutePath());
                        bVar.x(fileL0);
                        string = fileL0.toString();
                    } else {
                        if (xVar != 0) {
                            throw new BuildException("Source " + obj.getClass().getName() + " not supported by this plugin");
                        }
                        bVar.x(null);
                        bVar.y(xVar);
                        string = xVar.toString();
                    }
                    XMLReader xMLReaderE3 = r0.e();
                    if (fileL0 != null) {
                        String strQ2 = f133373u.q0(fileL0.getAbsolutePath());
                        inputStreamO = Files.newInputStream(fileL0.toPath(), new OpenOption[0]);
                        string2 = strQ2;
                        xVar2 = null;
                    } else {
                        string2 = xVar.toString();
                        int iIndexOf3 = string2.indexOf("!/");
                        if (string2.startsWith("jar:file")) {
                            URLConnection uRLConnectionOpenConnection4 = xVar.openConnection();
                            uRLConnectionOpenConnection4.setUseCaches(false);
                            InputStream inputStream4 = uRLConnectionOpenConnection4.getInputStream();
                            xVar2 = null;
                            inputStreamO = inputStream4;
                        } else {
                            URLConnection uRLConnectionOpenConnection5 = xVar.openConnection();
                            uRLConnectionOpenConnection5.setUseCaches(false);
                            InputStream inputStream5 = uRLConnectionOpenConnection5.getInputStream();
                            xVar2 = null;
                            inputStreamO = inputStream5;
                        }
                    }
                    inputSource = new InputSource(inputStreamO);
                    if (string2 != null) {
                        inputSource.setSystemId(string2);
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("parsing buildfile ");
                    sb4.append(string);
                    sb4.append(" with URI = ");
                    sb4.append(string2);
                    if (xVar2 != null) {
                        str = " from a zip file";
                    } else {
                        str = "";
                    }
                    sb4.append(str);
                    project.M0(sb4.toString(), 3);
                    xMLReaderE3.setContentHandler(c1228e);
                    xMLReaderE3.setEntityResolver(c1228e);
                    xMLReaderE3.setErrorHandler(c1228e);
                    xMLReaderE3.setDTDHandler(c1228e);
                    xMLReaderE3.parse(inputSource);
                    j0.c(inputStreamO);
                    x.e(xVar2);
                    return;
                }
                fileL0 = (File) obj;
                XMLReader xMLReaderE4 = r0.e();
                if (fileL0 != null) {
                    String strQ3 = f133373u.q0(fileL0.getAbsolutePath());
                    inputStreamO = Files.newInputStream(fileL0.toPath(), new OpenOption[0]);
                    string2 = strQ3;
                    xVar2 = null;
                } else {
                    string2 = xVar.toString();
                    int iIndexOf4 = string2.indexOf("!/");
                    if (string2.startsWith("jar:file")) {
                        URLConnection uRLConnectionOpenConnection6 = xVar.openConnection();
                        uRLConnectionOpenConnection6.setUseCaches(false);
                        InputStream inputStream6 = uRLConnectionOpenConnection6.getInputStream();
                        xVar2 = null;
                        inputStreamO = inputStream6;
                    } else {
                        URLConnection uRLConnectionOpenConnection7 = xVar.openConnection();
                        uRLConnectionOpenConnection7.setUseCaches(false);
                        InputStream inputStream7 = uRLConnectionOpenConnection7.getInputStream();
                        xVar2 = null;
                        inputStreamO = inputStream7;
                    }
                }
                inputSource = new InputSource(inputStreamO);
                if (string2 != null) {
                    inputSource.setSystemId(string2);
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("parsing buildfile ");
                sb5.append(string);
                sb5.append(" with URI = ");
                sb5.append(string2);
                if (xVar2 != null) {
                    str = " from a zip file";
                } else {
                    str = "";
                }
                sb5.append(str);
                project.M0(sb5.toString(), 3);
                xMLReaderE4.setContentHandler(c1228e);
                xMLReaderE4.setEntityResolver(c1228e);
                xMLReaderE4.setErrorHandler(c1228e);
                xMLReaderE4.setDTDHandler(c1228e);
                xMLReaderE4.parse(inputSource);
                j0.c(inputStreamO);
                x.e(xVar2);
                return;
            } catch (Throwable th2) {
                th = th2;
                j0.c(null);
                x.e(xVar);
                throw th;
            }
        } catch (FileNotFoundException e16) {
            e = e16;
        } catch (UnsupportedEncodingException e17) {
            e = e17;
        } catch (IOException e18) {
            e = e18;
        } catch (SAXParseException e19) {
            e = e19;
        } catch (SAXException e20) {
            e = e20;
        } catch (Throwable th3) {
            th = th3;
            xVar = 0;
            j0.c(null);
            x.e(xVar);
            throw th;
        }
        xVar = 0;
        if (fileL0 != null) {
            fileL0 = f133373u.i0(fileL0.getAbsolutePath());
            bVar.x(fileL0);
            string = fileL0.toString();
        } else {
            if (xVar != 0) {
                throw new BuildException("Source " + obj.getClass().getName() + " not supported by this plugin");
            }
            bVar.x(null);
            bVar.y(xVar);
            string = xVar.toString();
        }
    }

    public z2 Q(Project project, URL url) throws Throwable {
        t2 t2Var = new t2();
        t2Var.A(project);
        org.apache.tools.ant.helper.b bVar = new org.apache.tools.ant.helper.b(project);
        bVar.b(t2Var);
        bVar.D(t2Var);
        P(bVar.p(), url, new C1228e(bVar, f133368p));
        u2[] u2VarArrM = t2Var.m();
        if (u2VarArrM.length == 1) {
            return (z2) u2VarArrM[0];
        }
        throw new BuildException("No tasks defined");
    }

    @Override // org.apache.tools.ant.e2
    public boolean f(s1 s1Var) {
        return true;
    }

    @Override // org.apache.tools.ant.e2
    public void x(Project project, Object obj) throws Throwable {
        r().addElement(obj);
        org.apache.tools.ant.helper.b bVar = (org.apache.tools.ant.helper.b) project.w0(f133372t);
        if (bVar == null) {
            bVar = new org.apache.tools.ant.helper.b(project);
            project.i(f133372t, bVar);
            project.i(f133367o, bVar.q());
        }
        if (r().size() <= 1) {
            bVar.B(new HashMap());
            P(project, obj, new C1228e(bVar, f133370r));
            bVar.m().f();
            C(project);
            return;
        }
        bVar.C(true);
        t2 t2VarK = bVar.k();
        t2 t2VarM = bVar.m();
        Map<String, t2> mapL = bVar.l();
        try {
            t2 t2Var = new t2();
            t2Var.A(project);
            t2Var.z("");
            bVar.A(t2Var);
            bVar.B(new HashMap());
            bVar.D(t2Var);
            P(project, obj, new C1228e(bVar, f133370r));
            t2Var.f();
        } finally {
            bVar.A(t2VarK);
            bVar.D(t2VarM);
            bVar.B(mapL);
        }
    }

    @Override // org.apache.tools.ant.e2
    public z2 y(Project project, s1 s1Var) {
        p1 p1Var = (p1) s1Var.e2(p1.class);
        if (p1Var != null) {
            return Q(project, p1Var.getURL());
        }
        throw new BuildException("Unsupported resource type: " + s1Var);
    }
}
