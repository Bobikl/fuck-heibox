package org.apache.tools.ant.types;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Predicate;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;
import javax.xml.transform.sax.SAXSource;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: XMLCatalog.java */
/* JADX INFO: loaded from: classes5.dex */
public class c2 extends s implements EntityResolver, URIResolver {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136110k = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f136111l = "org.apache.tools.ant.types.resolver.ApacheCatalogResolver";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f136112m = "org.apache.xml.resolver.tools.CatalogResolver";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f136114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o0 f136115i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Vector<w1> f136113g = new Vector<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f136116j = null;

    /* JADX INFO: compiled from: XMLCatalog.java */
    public interface a extends URIResolver, EntityResolver {
        @Override // org.xml.sax.EntityResolver
        InputSource resolveEntity(String str, String str2);
    }

    /* JADX INFO: compiled from: XMLCatalog.java */
    public class b implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f136117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f136118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f136119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Method f136120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f136121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f136122g = false;

        public b(Class<?> cls, Object obj) {
            this.f136117b = null;
            this.f136118c = null;
            this.f136119d = null;
            this.f136120e = null;
            this.f136121f = obj;
            try {
                this.f136117b = cls.getMethod("setXMLCatalog", c2.class);
                this.f136118c = cls.getMethod("parseCatalog", String.class);
                this.f136119d = cls.getMethod("resolveEntity", String.class, String.class);
                this.f136120e = cls.getMethod("resolve", String.class, String.class);
                c2.this.x1("Apache resolver library found, xml-commons resolver will be used", 3);
            } catch (NoSuchMethodException e10) {
                throw new BuildException(e10);
            }
        }

        private void a() {
            if (!this.f136122g) {
                try {
                    this.f136117b.invoke(this.f136121f, c2.this);
                    if (c2.this.s2() != null) {
                        c2.this.x1("Using catalogpath '" + c2.this.s2() + "'", 4);
                        String[] strArrZ2 = c2.this.s2().z2();
                        int length = strArrZ2.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            File file = new File(strArrZ2[i10]);
                            c2.this.x1("Parsing " + file, 4);
                            try {
                                this.f136118c.invoke(this.f136121f, file.getPath());
                            } catch (Exception e10) {
                                throw new BuildException(e10);
                            }
                        }
                    }
                } catch (Exception e11) {
                    throw new BuildException(e11);
                }
            }
            this.f136122g = true;
        }

        @Override // javax.xml.transform.URIResolver
        public Source resolve(String str, String str2) throws TransformerException {
            w1 w1Var;
            a();
            w1 w1VarR2 = c2.this.r2(str);
            if (w1VarR2 == null) {
                if (str2 == null) {
                    try {
                        str2 = c2.f136110k.N(c2.this.b().Z()).toString();
                    } catch (MalformedURLException e10) {
                        throw new TransformerException(e10);
                    }
                }
                try {
                    return (SAXSource) this.f136120e.invoke(this.f136121f, str, str2);
                } catch (Exception e11) {
                    throw new BuildException(e11);
                }
            }
            c2.this.x1("Matching catalog entry found for uri: '" + w1VarR2.c() + "' location: '" + w1VarR2.b() + "'", 4);
            if (str2 != null) {
                try {
                    URL url = new URL(str2);
                    w1Var = new w1();
                    try {
                        w1Var.d(url);
                    } catch (MalformedURLException unused) {
                    }
                } catch (MalformedURLException unused2) {
                    w1Var = w1VarR2;
                }
            } else {
                w1Var = w1VarR2;
            }
            w1Var.f(w1VarR2.c());
            w1Var.e(w1VarR2.b());
            InputSource inputSourceQ2 = c2.this.q2(w1Var);
            if (inputSourceQ2 == null) {
                inputSourceQ2 = c2.this.n2(w1Var);
            }
            if (inputSourceQ2 != null) {
                return new SAXSource(inputSourceQ2);
            }
            try {
                return (SAXSource) this.f136120e.invoke(this.f136121f, str, str2);
            } catch (Exception e12) {
                throw new BuildException(e12);
            }
        }

        @Override // org.apache.tools.ant.types.c2.a, org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            a();
            w1 w1VarR2 = c2.this.r2(str);
            if (w1VarR2 == null) {
                try {
                    return (InputSource) this.f136119d.invoke(this.f136121f, str, str2);
                } catch (Exception e10) {
                    throw new BuildException(e10);
                }
            }
            c2.this.x1("Matching catalog entry found for publicId: '" + w1VarR2.c() + "' location: '" + w1VarR2.b() + "'", 4);
            InputSource inputSourceQ2 = c2.this.q2(w1VarR2);
            if (inputSourceQ2 == null) {
                inputSourceQ2 = c2.this.n2(w1VarR2);
            }
            if (inputSourceQ2 != null) {
                return inputSourceQ2;
            }
            try {
                return (InputSource) this.f136119d.invoke(this.f136121f, str, str2);
            } catch (Exception e11) {
                throw new BuildException(e11);
            }
        }
    }

    /* JADX INFO: compiled from: XMLCatalog.java */
    public class c implements a {
        public c() {
            c2.this.x1("Apache resolver library not found, internal resolver will be used", 3);
        }

        @Override // javax.xml.transform.URIResolver
        public Source resolve(String str, String str2) throws TransformerException {
            w1 w1Var;
            w1 w1VarR2 = c2.this.r2(str);
            if (w1VarR2 != null) {
                c2.this.x1("Matching catalog entry found for uri: '" + w1VarR2.c() + "' location: '" + w1VarR2.b() + "'", 4);
                if (str2 != null) {
                    try {
                        URL url = new URL(str2);
                        w1Var = new w1();
                        try {
                            w1Var.d(url);
                        } catch (MalformedURLException unused) {
                        }
                    } catch (MalformedURLException unused2) {
                        w1Var = w1VarR2;
                    }
                } else {
                    w1Var = w1VarR2;
                }
                w1Var.f(w1VarR2.c());
                w1Var.e(w1VarR2.b());
                InputSource inputSourceQ2 = c2.this.q2(w1Var);
                if (inputSourceQ2 == null) {
                    inputSourceQ2 = c2.this.n2(w1Var);
                }
                if (inputSourceQ2 == null) {
                    inputSourceQ2 = c2.this.D2(w1Var);
                }
                if (inputSourceQ2 != null) {
                    return new SAXSource(inputSourceQ2);
                }
            }
            return null;
        }

        @Override // org.apache.tools.ant.types.c2.a, org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            w1 w1VarR2 = c2.this.r2(str);
            if (w1VarR2 == null) {
                return null;
            }
            c2.this.x1("Matching catalog entry found for publicId: '" + w1VarR2.c() + "' location: '" + w1VarR2.b() + "'", 4);
            InputSource inputSourceQ2 = c2.this.q2(w1VarR2);
            if (inputSourceQ2 == null) {
                inputSourceQ2 = c2.this.n2(w1VarR2);
            }
            return inputSourceQ2 == null ? c2.this.D2(w1VarR2) : inputSourceQ2;
        }
    }

    public c2() {
        b2(false);
    }

    private void C2(SAXSource sAXSource) throws TransformerException {
        XMLReader xMLReader = sAXSource.getXMLReader();
        if (xMLReader == null) {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            try {
                xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            } catch (ParserConfigurationException | SAXException e10) {
                throw new TransformerException(e10);
            }
        }
        xMLReader.setEntityResolver(this);
        sAXSource.setXMLReader(xMLReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputSource D2(w1 w1Var) {
        URL urlN;
        URL url;
        InputStream inputStream;
        String strB = w1Var.b();
        if (w1Var.a() != null) {
            urlN = w1Var.a();
        } else {
            try {
                urlN = f136110k.N(b().Z());
            } catch (MalformedURLException unused) {
                throw new BuildException("Project basedir cannot be converted to a URL");
            }
        }
        try {
            url = new URL(urlN, strB);
        } catch (MalformedURLException unused2) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection != null) {
                uRLConnectionOpenConnection.setUseCaches(false);
                inputStream = uRLConnectionOpenConnection.getInputStream();
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                return null;
            }
            InputSource inputSource = new InputSource(inputStream);
            try {
                String externalForm = url.toExternalForm();
                inputSource.setSystemId(externalForm);
                x1("catalog entry matched as a URL: '" + externalForm + "'", 4);
            } catch (IOException unused3) {
            }
            return inputSource;
        } catch (IOException unused4) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputSource n2(w1 w1Var) {
        o0 o0Var = this.f136114h;
        org.apache.tools.ant.g gVarZ = b().z(o0Var != null ? o0Var.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i) : new o0(b()).s2("last"));
        InputStream resourceAsStream = gVarZ.getResourceAsStream(w1Var.b());
        if (resourceAsStream == null) {
            return null;
        }
        InputSource inputSource = new InputSource(resourceAsStream);
        String externalForm = gVarZ.getResource(w1Var.b()).toExternalForm();
        inputSource.setSystemId(externalForm);
        x1("catalog entry matched a resource in the classpath: '" + externalForm + "'", 4);
        return inputSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputSource q2(w1 w1Var) {
        URL urlN;
        URL urlN2;
        String strK;
        String strReplace = w1Var.b().replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
        if (w1Var.a() != null) {
            urlN = w1Var.a();
        } else {
            try {
                urlN = f136110k.N(b().Z());
            } catch (MalformedURLException unused) {
                throw new BuildException("Project basedir cannot be converted to a URL");
            }
        }
        try {
            urlN2 = new URL(urlN, strReplace);
        } catch (MalformedURLException unused2) {
            File file = new File(strReplace);
            if (file.exists() && file.canRead()) {
                x1("uri : '" + strReplace + "' matches a readable file", 4);
                try {
                    urlN2 = f136110k.N(file);
                } catch (MalformedURLException unused3) {
                    throw new BuildException("could not find an URL for :" + file.getAbsolutePath());
                }
            } else {
                x1("uri : '" + strReplace + "' does not match a readable file", 4);
                urlN2 = null;
            }
        }
        if (urlN2 == null || !"file".equals(urlN2.getProtocol()) || (strK = f136110k.K(urlN2.toString())) == null) {
            return null;
        }
        x1("fileName " + strK, 4);
        File file2 = new File(strK);
        if (!file2.exists() || !file2.canRead()) {
            return null;
        }
        try {
            InputSource inputSource = new InputSource(Files.newInputStream(file2.toPath(), new OpenOption[0]));
            try {
                String strH = org.apache.tools.ant.util.r0.h(file2);
                inputSource.setSystemId(strH);
                x1("catalog entry matched a readable file: '" + strH + "'", 4);
            } catch (IOException unused4) {
            }
            return inputSource;
        } catch (IOException unused5) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w1 r2(final String str) {
        return (w1) v2().stream().filter(new Predicate() { // from class: org.apache.tools.ant.types.b2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c2.x2(str, (w1) obj);
            }
        }).findFirst().orElse(null);
    }

    private a t2() {
        if (this.f136116j == null) {
            try {
                Class<?> cls = Class.forName(f136111l, true, Class.forName(f136112m, true, Class.forName(f136111l, true, b().z(o0.f136242j)).getClassLoader()).getClassLoader());
                this.f136116j = new b(cls, cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Throwable th2) {
                this.f136116j = new c();
                if (s2() != null && s2().z2().length != 0) {
                    x1("Warning: XML resolver not found; external catalogs will be ignored", 1);
                }
                x1("Failed to load Apache resolver: " + th2, 4);
            }
        }
        return this.f136116j;
    }

    private o0 u2() {
        return w2().f136114h;
    }

    private Vector<w1> v2() {
        return w2().f136113g;
    }

    private c2 w2() {
        return !Y1() ? this : (c2) O1(c2.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean x2(String str, w1 w1Var) {
        return w1Var.c().equals(str);
    }

    private String y2(String str) {
        int iIndexOf = str.indexOf("#");
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public void A2(o0 o0Var) {
        if (Y1()) {
            throw d2();
        }
        o0 o0Var2 = this.f136114h;
        if (o0Var2 == null) {
            this.f136114h = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
        b2(false);
    }

    public void B2(q1 q1Var) {
        if (Y1()) {
            throw d2();
        }
        p2().c2(q1Var);
        b2(false);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            o0 o0Var = this.f136114h;
            if (o0Var != null) {
                s.a2(o0Var, stack, project);
            }
            o0 o0Var2 = this.f136115i;
            if (o0Var2 != null) {
                s.a2(o0Var2, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (!this.f136113g.isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void k2(c2 c2Var) {
        if (Y1()) {
            throw Z1();
        }
        v2().addAll(c2Var.v2());
        p2().n2(c2Var.u2());
        o2().n2(c2Var.s2());
        b2(false);
    }

    public void l2(w1 w1Var) throws BuildException {
        if (Y1()) {
            throw Z1();
        }
        v2().addElement(w1Var);
        b2(false);
    }

    public void m2(w1 w1Var) throws BuildException {
        l2(w1Var);
    }

    public o0 o2() {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136115i == null) {
            this.f136115i = new o0(b());
        }
        b2(false);
        return this.f136115i.u2();
    }

    public o0 p2() {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136114h == null) {
            this.f136114h = new o0(b());
        }
        b2(false);
        return this.f136114h.u2();
    }

    @Override // javax.xml.transform.URIResolver
    public Source resolve(String str, String str2) throws TransformerException {
        if (Y1()) {
            return w2().resolve(str, str2);
        }
        H1();
        String strY2 = y2(str);
        x1("resolve: '" + strY2 + "' with base: '" + str2 + "'", 4);
        SAXSource sAXSource = (SAXSource) t2().resolve(strY2, str2);
        if (sAXSource == null) {
            x1("No matching catalog entry found, parser will use: '" + str + "'", 4);
            sAXSource = new SAXSource();
            try {
                URL urlN = str2 == null ? f136110k.N(b().Z()) : new URL(str2);
                if (!strY2.isEmpty()) {
                    urlN = new URL(urlN, strY2);
                }
                sAXSource.setInputSource(new InputSource(urlN.toString()));
            } catch (MalformedURLException unused) {
                sAXSource.setInputSource(new InputSource(strY2));
            }
        }
        C2(sAXSource);
        return sAXSource;
    }

    @Override // org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
        if (Y1()) {
            return w2().resolveEntity(str, str2);
        }
        H1();
        x1("resolveEntity: '" + str + "': '" + str2 + "'", 4);
        InputSource inputSourceResolveEntity = t2().resolveEntity(str, str2);
        if (inputSourceResolveEntity == null) {
            x1("No matching catalog entry found, parser will use: '" + str2 + "'", 4);
        }
        return inputSourceResolveEntity;
    }

    public o0 s2() {
        return w2().f136115i;
    }

    public void z2(q1 q1Var) {
        if (Y1()) {
            throw d2();
        }
        o2().c2(q1Var);
        b2(false);
    }
}
