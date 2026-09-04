package org.apache.tools.ant.taskdefs.optional;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.Source;
import javax.xml.transform.SourceLocator;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.XSLTProcess;
import org.apache.tools.ant.taskdefs.u7;
import org.apache.tools.ant.taskdefs.w7;
import org.apache.tools.ant.taskdefs.x7;
import org.apache.tools.ant.types.c2;
import org.apache.tools.ant.types.resources.p1;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.util.h2;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.r0;
import org.apache.tools.ant.util.s0;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: TraXLiaison.java */
/* JADX INFO: loaded from: classes5.dex */
public class g0 implements u7, ErrorListener, x7 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final j0 f135103r = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f135104b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s1 f135107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w7 f135108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EntityResolver f135109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Transformer f135110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Templates f135111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f135112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private URIResolver f135113k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f135105c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TransformerFactory f135106d = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Vector<String[]> f135114l = new Vector<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Hashtable<String, Object> f135115m = new Hashtable<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<Object[]> f135116n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map<String, Boolean> f135117o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135118p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private XSLTProcess.f f135119q = null;

    private void D() {
        this.f135115m.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.f0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f135102a.u((String) obj, obj2);
            }
        });
    }

    private void l() {
        if (s0.n("9")) {
            return;
        }
        try {
            Field declaredField = this.f135106d.getClass().getDeclaredField("_isNotSecureProcessing");
            declaredField.setAccessible(true);
            declaredField.set(this.f135106d, Boolean.TRUE);
        } catch (Exception e10) {
            Project project = this.f135104b;
            if (project != null) {
                project.M0(e10.toString(), 4);
            }
        }
    }

    private void m() throws TransformerException, ParserConfigurationException, SAXException, IOException {
        if (this.f135111i == null) {
            w();
        }
        Transformer transformerNewTransformer = this.f135111i.newTransformer();
        this.f135110h = transformerNewTransformer;
        transformerNewTransformer.setErrorListener(this);
        URIResolver uRIResolver = this.f135113k;
        if (uRIResolver != null) {
            this.f135110h.setURIResolver(uRIResolver);
        }
        for (String[] strArr : this.f135114l) {
            this.f135110h.setOutputProperty(strArr[0], strArr[1]);
        }
        if (this.f135119q != null) {
            if (!"org.apache.xalan.transformer.TransformerImpl".equals(this.f135110h.getClass().getName())) {
                String str = "Not enabling trace support for transformer implementation" + this.f135110h.getClass().getName();
                Project project = this.f135104b;
                if (project != null) {
                    project.M0(str, 1);
                    return;
                } else {
                    System.err.println(str);
                    return;
                }
            }
            try {
                ((i0) Class.forName("org.apache.tools.ant.taskdefs.optional.Xalan2TraceSupport", true, Thread.currentThread().getContextClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).a(this.f135110h, this.f135119q);
            } catch (Exception e10) {
                String str2 = "Failed to enable tracing because of " + e10;
                Project project2 = this.f135104b;
                if (project2 != null) {
                    project2.M0(str2, 1);
                } else {
                    System.err.println(str2);
                }
            }
        }
    }

    private TransformerFactory n() throws BuildException {
        TransformerFactory transformerFactory = this.f135106d;
        if (transformerFactory != null) {
            return transformerFactory;
        }
        String str = this.f135105c;
        if (str == null) {
            this.f135106d = TransformerFactory.newInstance();
        } else {
            Class<?> cls = null;
            try {
                try {
                    cls = Class.forName(str, true, Thread.currentThread().getContextClassLoader());
                } catch (ClassNotFoundException unused) {
                    String str2 = "Failed to load " + this.f135105c + " via the configured classpath, will try Ant's classpath instead.";
                    w7 w7Var = this.f135108f;
                    if (w7Var != null) {
                        w7Var.log(str2);
                    } else {
                        Project project = this.f135104b;
                        if (project != null) {
                            project.M0(str2, 1);
                        } else {
                            System.err.println(str2);
                        }
                    }
                }
                if (cls == null) {
                    cls = Class.forName(this.f135105c);
                }
                this.f135106d = (TransformerFactory) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new BuildException(e10);
            }
        }
        l();
        this.f135106d.setErrorListener(this);
        for (Object[] objArr : this.f135116n) {
            this.f135106d.setAttribute((String) objArr[0], objArr[1]);
        }
        for (Map.Entry<String, Boolean> entry : this.f135117o.entrySet()) {
            try {
                this.f135106d.setFeature(entry.getKey(), entry.getValue().booleanValue());
            } catch (TransformerConfigurationException e11) {
                throw new BuildException(e11);
            }
        }
        URIResolver uRIResolver = this.f135113k;
        if (uRIResolver != null) {
            this.f135106d.setURIResolver(uRIResolver);
        }
        return this.f135106d;
    }

    private Source o(InputStream inputStream, File file) throws ParserConfigurationException, SAXException {
        Source streamSource;
        if (this.f135109g == null) {
            streamSource = new StreamSource(inputStream);
        } else {
            if (!n().getFeature("http://javax.xml.transform.sax.SAXSource/feature")) {
                throw new IllegalStateException("xcatalog specified, but parser doesn't support SAX");
            }
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setEntityResolver(this.f135109g);
            streamSource = new SAXSource(xMLReader, new InputSource(inputStream));
        }
        streamSource.setSystemId(r0.h(file));
        return streamSource;
    }

    private Source p(InputStream inputStream, s1 s1Var) throws ParserConfigurationException, SAXException {
        Source streamSource;
        if (this.f135109g == null) {
            streamSource = new StreamSource(inputStream);
        } else {
            if (!n().getFeature("http://javax.xml.transform.sax.SAXSource/feature")) {
                throw new IllegalStateException("xcatalog specified, but parser doesn't support SAX");
            }
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setEntityResolver(this.f135109g);
            streamSource = new SAXSource(xMLReader, new InputSource(inputStream));
        }
        streamSource.setSystemId(x(s1Var));
        return streamSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(XSLTProcess.b.a aVar) {
        y(aVar.B1(), aVar.D1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(XSLTProcess.b.C1230b c1230b) {
        B(c1230b.a(), c1230b.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(XSLTProcess.c cVar) {
        C(cVar.a(), cVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str, Object obj) {
        this.f135110h.setParameter(str, obj);
    }

    private void v(TransformerException transformerException, String str) {
        if (this.f135108f == null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        SourceLocator locator = transformerException.getLocator();
        if (locator != null) {
            String systemId = locator.getSystemId();
            if (systemId != null) {
                if (systemId.startsWith("file:")) {
                    systemId = j0.O().K(systemId);
                }
                stringBuffer.append(systemId);
            } else {
                stringBuffer.append("Unknown file");
            }
            int lineNumber = locator.getLineNumber();
            if (lineNumber != -1) {
                stringBuffer.append(":");
                stringBuffer.append(lineNumber);
                int columnNumber = locator.getColumnNumber();
                if (columnNumber != -1) {
                    stringBuffer.append(":");
                    stringBuffer.append(columnNumber);
                }
            }
        }
        stringBuffer.append(": ");
        stringBuffer.append(str);
        stringBuffer.append("! ");
        stringBuffer.append(transformerException.getMessage());
        if (transformerException.getCause() != null) {
            stringBuffer.append(" Cause: ");
            stringBuffer.append(transformerException.getCause());
        }
        this.f135108f.log(stringBuffer.toString());
    }

    private void w() throws ParserConfigurationException, TransformerConfigurationException, SAXException, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f135107e.h2());
        try {
            this.f135112j = this.f135107e.i2();
            this.f135111i = n().newTemplates(p(bufferedInputStream, this.f135107e));
            bufferedInputStream.close();
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private String x(s1 s1Var) {
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar != null) {
            return f135103r.q0(yVar.l0().getAbsolutePath());
        }
        p1 p1Var = (p1) s1Var.e2(p1.class);
        return p1Var != null ? String.valueOf(p1Var.getURL()) : s1Var.k2();
    }

    public void A(String str) {
        this.f135105c = str;
    }

    public void B(String str, boolean z10) {
        this.f135117o.put(str, Boolean.valueOf(z10));
    }

    public void C(String str, String str2) {
        this.f135114l.addElement(new String[]{str, str2});
    }

    public void E(URIResolver uRIResolver) {
        this.f135113k = uRIResolver;
    }

    @Override // org.apache.tools.ant.taskdefs.v7
    public void a(String str, String str2) {
        this.f135115m.put(str, str2);
    }

    @Override // org.apache.tools.ant.taskdefs.v7
    public void b(File file) throws Exception {
        org.apache.tools.ant.types.resources.z zVar = new org.apache.tools.ant.types.resources.z();
        zVar.J(this.f135104b);
        zVar.B2(file);
        f(zVar);
    }

    @Override // org.apache.tools.ant.taskdefs.x7
    public void c(w7 w7Var) {
        this.f135108f = w7Var;
    }

    @Override // org.apache.tools.ant.taskdefs.u7
    public void d(String str, Object obj) {
        this.f135115m.put(str, obj);
    }

    @Override // org.apache.tools.ant.taskdefs.s7
    public void e(XSLTProcess xSLTProcess) {
        this.f135104b = xSLTProcess.b();
        XSLTProcess.b bVarR2 = xSLTProcess.R2();
        if (bVarR2 != null) {
            A(bVarR2.e());
            h2.a(bVarR2.c()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.c0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f134685b.r((XSLTProcess.b.a) obj);
                }
            });
            bVarR2.d().forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.d0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f134734b.s((XSLTProcess.b.C1230b) obj);
                }
            });
        }
        c2 c2VarW2 = xSLTProcess.W2();
        if (c2VarW2 != null) {
            z(c2VarW2);
            E(c2VarW2);
        }
        h2.a(xSLTProcess.T2()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.e0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134842b.t((XSLTProcess.c) obj);
            }
        });
        this.f135118p = xSLTProcess.U2();
        this.f135119q = xSLTProcess.V2();
    }

    @Override // javax.xml.transform.ErrorListener
    public void error(TransformerException transformerException) {
        v(transformerException, "Error");
    }

    @Override // org.apache.tools.ant.taskdefs.t7
    public void f(s1 s1Var) throws Exception {
        s1 s1Var2 = this.f135107e;
        if (s1Var2 != null) {
            this.f135110h = null;
            if (!s1Var2.equals(s1Var) || s1Var.i2() != this.f135112j) {
                this.f135111i = null;
            }
        }
        this.f135107e = s1Var;
    }

    @Override // javax.xml.transform.ErrorListener
    public void fatalError(TransformerException transformerException) {
        v(transformerException, "Fatal Error");
        throw new BuildException("Fatal error during transformation using " + this.f135107e + ": " + transformerException.getMessageAndLocation(), transformerException);
    }

    @Override // org.apache.tools.ant.taskdefs.v7
    public void g(File file, File file2) throws Exception {
        if (this.f135110h == null) {
            m();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(file2.toPath(), new OpenOption[0]));
            try {
                StreamResult streamResult = new StreamResult(bufferedOutputStream);
                streamResult.setSystemId(r0.h(file2));
                D();
                this.f135110h.transform(o(bufferedInputStream, file), streamResult);
                bufferedOutputStream.close();
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Deprecated
    protected String q(File file) {
        return r0.h(file);
    }

    @Override // javax.xml.transform.ErrorListener
    public void warning(TransformerException transformerException) {
        if (this.f135118p) {
            return;
        }
        v(transformerException, com.google.common.net.c.f58823g);
    }

    public void y(String str, Object obj) {
        this.f135116n.add(new Object[]{str, obj});
    }

    public void z(EntityResolver entityResolver) {
        this.f135109g = entityResolver;
    }
}
