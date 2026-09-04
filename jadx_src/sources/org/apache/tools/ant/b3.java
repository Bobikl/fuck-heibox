package org.apache.tools.ant;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: XmlLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class b3 implements l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static DocumentBuilder f133095i = b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f133096j = "build";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f133097k = "target";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f133098l = "task";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f133099m = "message";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f133100n = "name";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f133101o = "time";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f133102p = "priority";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f133103q = "location";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f133104r = "error";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f133105s = "stacktrace";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrintStream f133107c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f133106b = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Document f133108d = f133095i.newDocument();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<u2, b> f133109e = new Hashtable();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<t2, b> f133110f = new Hashtable();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<Thread, Stack<b>> f133111g = new Hashtable();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f133112h = null;

    /* JADX INFO: compiled from: XmlLogger.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f133113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Element f133114b;

        private b() {
        }

        public String toString() {
            return this.f133114b.getTagName() + ":" + this.f133114b.getAttribute("name");
        }
    }

    private static DocumentBuilder b() {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (Exception e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    private String c(BuildEvent buildEvent, String str, String str2) {
        return (buildEvent == null || buildEvent.d() == null || buildEvent.d().u0(str) == null) ? str2 : buildEvent.d().u0(str);
    }

    private Stack<b> d() {
        return (Stack) this.f133111g.computeIfAbsent(Thread.currentThread(), new Function() { // from class: org.apache.tools.ant.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b3.f((Thread) obj);
            }
        });
    }

    private b e(u2 u2Var) {
        b bVar = this.f133109e.get(u2Var);
        if (bVar != null) {
            return bVar;
        }
        for (u2 u2Var2 : new HashSet(this.f133109e.keySet())) {
            if ((u2Var2 instanceof z2) && ((z2) u2Var2).t2() == u2Var) {
                return this.f133109e.get(u2Var2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stack f(Thread thread) {
        return new Stack();
    }

    private void g(Node node, Node node2) {
        synchronized (node) {
            node.appendChild(node2);
        }
    }

    @Override // org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
        t2 t2VarE = buildEvent.e();
        b bVar = this.f133110f.get(t2VarE);
        if (bVar != null) {
            bVar.f133114b.setAttribute("time", y.c(System.currentTimeMillis() - bVar.f133113a));
            b bVarPeek = null;
            Stack<b> stackD = d();
            if (!stackD.empty()) {
                b bVarPop = stackD.pop();
                if (bVarPop != bVar) {
                    throw new RuntimeException("Mismatch - popped element = " + bVarPop + " finished target element = " + bVar);
                }
                if (!stackD.empty()) {
                    bVarPeek = stackD.peek();
                }
            }
            if (bVarPeek == null) {
                g(this.f133112h.f133114b, bVar.f133114b);
            } else {
                g(bVarPeek.f133114b, bVar.f133114b);
            }
        }
        this.f133110f.remove(t2VarE);
    }

    @Override // org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        this.f133112h.f133114b.setAttribute("time", y.c(System.currentTimeMillis() - this.f133112h.f133113a));
        if (buildEvent.a() != null) {
            this.f133112h.f133114b.setAttribute("error", buildEvent.a().toString());
            CDATASection cDATASectionCreateCDATASection = this.f133108d.createCDATASection(org.apache.tools.ant.util.j2.b(buildEvent.a()));
            Element elementCreateElement = this.f133108d.createElement(f133105s);
            elementCreateElement.appendChild(cDATASectionCreateCDATASection);
            g(this.f133112h.f133114b, elementCreateElement);
        }
        String strC = c(buildEvent, "XmlLogger.file", "log.xml");
        String strC2 = c(buildEvent, "ant.XmlLogger.stylesheet.uri", "log.xsl");
        try {
            OutputStream outputStreamNewOutputStream = this.f133107c;
            if (outputStreamNewOutputStream == null) {
                outputStreamNewOutputStream = Files.newOutputStream(Paths.get(strC, new String[0]), new OpenOption[0]);
            }
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, StandardCharsets.UTF_8);
                try {
                    outputStreamWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                    if (!strC2.isEmpty()) {
                        outputStreamWriter.write("<?xml-stylesheet type=\"text/xsl\" href=\"" + strC2 + "\"?>\n\n");
                    }
                    new org.apache.tools.ant.util.y().q(this.f133112h.f133114b, outputStreamWriter, 0, "\t");
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    if (outputStreamNewOutputStream != null) {
                        outputStreamNewOutputStream.close();
                    }
                    this.f133112h = null;
                } catch (Throwable th2) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStreamNewOutputStream != null) {
                    try {
                        outputStreamNewOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to write log file", e10);
        }
    }

    @Override // org.apache.tools.ant.l
    public void S(PrintStream printStream) {
        this.f133107c = new PrintStream((OutputStream) printStream, true);
    }

    @Override // org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
        String str;
        int iC = buildEvent.c();
        if (iC > this.f133106b) {
            return;
        }
        Element elementCreateElement = this.f133108d.createElement("message");
        if (iC == 0) {
            str = "error";
        } else if (iC != 1) {
            str = iC != 2 ? "debug" : "info";
        } else {
            str = "warn";
        }
        elementCreateElement.setAttribute("priority", str);
        Throwable thA = buildEvent.a();
        if (4 <= this.f133106b && thA != null) {
            Node nodeCreateCDATASection = this.f133108d.createCDATASection(org.apache.tools.ant.util.j2.b(thA));
            Node nodeCreateElement = this.f133108d.createElement(f133105s);
            nodeCreateElement.appendChild(nodeCreateCDATASection);
            g(this.f133112h.f133114b, nodeCreateElement);
        }
        elementCreateElement.appendChild(this.f133108d.createCDATASection(buildEvent.b()));
        u2 u2VarF = buildEvent.f();
        t2 t2VarE = buildEvent.e();
        b bVarE = u2VarF != null ? e(u2VarF) : null;
        if (bVarE == null && t2VarE != null) {
            bVarE = this.f133110f.get(t2VarE);
        }
        if (bVarE != null) {
            g(bVarE.f133114b, elementCreateElement);
        } else {
            g(this.f133112h.f133114b, elementCreateElement);
        }
    }

    @Override // org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
        b bVar = new b();
        bVar.f133113a = System.currentTimeMillis();
        bVar.f133114b = this.f133108d.createElement("task");
        u2 u2VarF = buildEvent.f();
        String strK1 = buildEvent.f().K1();
        if (strK1 == null) {
            strK1 = "";
        }
        bVar.f133114b.setAttribute("name", strK1);
        bVar.f133114b.setAttribute("location", buildEvent.f().w1().toString());
        this.f133109e.put(u2VarF, bVar);
        d().push(bVar);
    }

    @Override // org.apache.tools.ant.k
    public void i0(BuildEvent buildEvent) {
        b bVar = new b();
        this.f133112h = bVar;
        bVar.f133113a = System.currentTimeMillis();
        this.f133112h.f133114b = this.f133108d.createElement(f133096j);
    }

    @Override // org.apache.tools.ant.l
    public void m(boolean z10) {
    }

    @Override // org.apache.tools.ant.l
    public void m1(PrintStream printStream) {
    }

    @Override // org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
        t2 t2VarE = buildEvent.e();
        b bVar = new b();
        bVar.f133113a = System.currentTimeMillis();
        bVar.f133114b = this.f133108d.createElement("target");
        bVar.f133114b.setAttribute("name", t2VarE.k());
        this.f133110f.put(t2VarE, bVar);
        d().push(bVar);
    }

    @Override // org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
        b bVarPop;
        u2 u2VarF = buildEvent.f();
        b bVar = this.f133109e.get(u2VarF);
        if (bVar == null) {
            throw new RuntimeException("Unknown task " + u2VarF + " not in " + this.f133109e);
        }
        bVar.f133114b.setAttribute("time", y.c(System.currentTimeMillis() - bVar.f133113a));
        t2 t2VarG1 = u2VarF.G1();
        b bVar2 = t2VarG1 != null ? this.f133110f.get(t2VarG1) : null;
        if (bVar2 == null) {
            g(this.f133112h.f133114b, bVar.f133114b);
        } else {
            g(bVar2.f133114b, bVar.f133114b);
        }
        Stack<b> stackD = d();
        if (stackD.empty() || (bVarPop = stackD.pop()) == bVar) {
            this.f133109e.remove(u2VarF);
            return;
        }
        throw new RuntimeException("Mismatch - popped element = " + bVarPop + " finished task element = " + bVar);
    }

    @Override // org.apache.tools.ant.l
    public void w0(int i10) {
        this.f133106b = i10;
    }
}
