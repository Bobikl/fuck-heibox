package org.apache.tools.ant.taskdefs;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.tools.ant.BuildException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: XmlProperty.java */
/* JADX INFO: loaded from: classes5.dex */
public class z7 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f136059v = "id";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f136061x = "location";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f136062y = "value";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f136063z = "path";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f136064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f136065l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136066m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f136067n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f136068o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f136069p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f136070q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f136071r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, String> f136072s = new Hashtable();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private org.apache.tools.ant.types.c2 f136073t = new org.apache.tools.ant.types.c2();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f136074u = Constants.ACCEPT_TIME_SEPARATOR_SP;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f136060w = "refid";
    private static final String A = "pathid";
    private static final String[] B = {"id", f136060w, "location", "value", "path", A};
    private static final org.apache.tools.ant.util.j0 C = org.apache.tools.ant.util.j0.O();

    private static boolean A2(String str) {
        return Arrays.asList(B).contains(str);
    }

    private File C2(String str) {
        org.apache.tools.ant.util.j0 j0Var = C;
        File fileZ = this.f136071r;
        if (fileZ == null) {
            fileZ = b().Z();
        }
        return j0Var.n0(fileZ, str);
    }

    private void l2(Node node, String str, Object obj) {
        if (node.getNodeType() != 3) {
            if (!str.trim().isEmpty()) {
                str = str + ".";
            }
            str = str + node.getNodeName();
        }
        Object objB2 = B2(node, str, obj);
        if (node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            int length = childNodes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                l2(childNodes.item(i10), str, objB2);
            }
        }
    }

    private void m2(String str, String str2, String str3) {
        String str4 = str + ":" + str2;
        if (str3 != null) {
            str4 = str4 + "(id=" + str3 + ")";
        }
        x1(str4, 4);
        if (this.f136072s.containsKey(str)) {
            str2 = this.f136072s.get(str) + q2() + str2;
            b().p1(str, str2);
            this.f136072s.put(str, str2);
        } else if (b().u0(str) == null) {
            b().n1(str, str2);
            this.f136072s.put(str, str2);
        } else {
            x1("Override ignored for property " + str, 3);
        }
        if (str3 != null) {
            b().i(str3, str2);
        }
    }

    private String n2(Node node) {
        StringBuilder sb2;
        String nodeName = node.getNodeName();
        if (this.f136069p) {
            if (f136060w.equals(nodeName)) {
                return "";
            }
            if (A2(nodeName) && !this.f136070q) {
                return "";
            }
            return "." + nodeName;
        }
        if (this.f136068o) {
            sb2 = new StringBuilder();
            sb2.append(".");
        } else {
            sb2 = new StringBuilder();
            sb2.append("(");
            sb2.append(nodeName);
            nodeName = ")";
        }
        sb2.append(nodeName);
        return sb2.toString();
    }

    private String o2(Node node) {
        Object objW0;
        String strTrim = node.getNodeValue().trim();
        if (this.f136069p) {
            String nodeName = node.getNodeName();
            strTrim = b().V0(strTrim);
            if ("location".equals(nodeName)) {
                return C2(strTrim).getPath();
            }
            if (f136060w.equals(nodeName) && (objW0 = b().w0(strTrim)) != null) {
                return objW0.toString();
            }
        }
        return strTrim;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad  */
    public Object B2(Node node, String str, Object obj) {
        String nodeValue;
        org.apache.tools.ant.types.o0 o0Var;
        String nodeValue2;
        String str2 = null;
        if (node.hasAttributes()) {
            NamedNodeMap attributes = node.getAttributes();
            Node namedItem = attributes.getNamedItem("id");
            nodeValue = (!this.f136069p || namedItem == null) ? null : namedItem.getNodeValue();
            o0Var = null;
            int i10 = 0;
            while (i10 < attributes.getLength()) {
                Node nodeItem = attributes.item(i10);
                if (this.f136069p) {
                    String nodeName = nodeItem.getNodeName();
                    String strO2 = o2(nodeItem);
                    boolean z10 = obj instanceof org.apache.tools.ant.types.o0;
                    org.apache.tools.ant.types.o0 o0Var2 = z10 ? (org.apache.tools.ant.types.o0) obj : null;
                    if ("id".equals(nodeName)) {
                        continue;
                    } else if (o0Var2 != null && "path".equals(nodeName)) {
                        o0Var2.D2(strO2);
                    } else if (o0Var2 != null && z10 && f136060w.equals(nodeName)) {
                        o0Var2.D2(strO2);
                    } else if (o0Var2 != null && z10 && "location".equals(nodeName)) {
                        o0Var2.C2(C2(strO2));
                    } else if (!A.equals(nodeName)) {
                        m2(str + n2(nodeItem), strO2, nodeValue);
                    } else {
                        if (obj != null) {
                            throw new BuildException("XmlProperty does not support nested paths");
                        }
                        o0Var = new org.apache.tools.ant.types.o0(b());
                        b().i(strO2, o0Var);
                    }
                } else {
                    String strN2 = n2(nodeItem);
                    m2(str + strN2, o2(nodeItem), str2);
                    attributes = attributes;
                }
                i10++;
                attributes = attributes;
                str2 = null;
            }
        } else {
            nodeValue = null;
            o0Var = null;
        }
        boolean z11 = true;
        boolean z12 = node.getNodeType() == 1 && this.f136069p && node.hasAttributes() && !(node.getAttributes().getNamedItem("value") == null && node.getAttributes().getNamedItem("location") == null && node.getAttributes().getNamedItem(f136060w) == null && node.getAttributes().getNamedItem("path") == null && node.getAttributes().getNamedItem(A) == null);
        if (node.getNodeType() != 3) {
            if (node.getNodeType() == 1 && node.getChildNodes().getLength() == 1 && node.getFirstChild().getNodeType() == 4) {
                nodeValue2 = node.getFirstChild().getNodeValue();
                if (!nodeValue2.isEmpty() || z12) {
                }
            } else if ((node.getNodeType() == 1 && node.getChildNodes().getLength() == 0 && !z12) || (node.getNodeType() == 1 && node.getChildNodes().getLength() == 1 && node.getFirstChild().getNodeType() == 3 && node.getFirstChild().getNodeValue().isEmpty() && !z12)) {
                nodeValue2 = "";
            } else {
                z11 = false;
                nodeValue2 = null;
            }
            if (nodeValue2 != null) {
                if (this.f136069p && nodeValue == null && (obj instanceof String)) {
                    nodeValue = (String) obj;
                }
                if (nodeValue2.trim().isEmpty() || z11) {
                    m2(str, nodeValue2, nodeValue);
                }
            }
            if (o0Var != null) {
                return o0Var;
            }
            return nodeValue;
        }
        nodeValue2 = o2(node);
        z11 = false;
        if (nodeValue2 != null) {
            if (this.f136069p) {
                nodeValue = (String) obj;
            }
            if (nodeValue2.trim().isEmpty()) {
                m2(str, nodeValue2, nodeValue);
            } else {
                m2(str, nodeValue2, nodeValue);
            }
        }
        if (o0Var != null) {
            return o0Var;
        }
        return nodeValue;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.s1 s1VarW2 = w2();
        if (s1VarW2 == null) {
            throw new BuildException("XmlProperty task requires a source resource");
        }
        try {
            x1("Loading " + this.f136064k, 3);
            if (!s1VarW2.p2()) {
                x1("Unable to find property resource: " + s1VarW2, 3);
                return;
            }
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setValidating(this.f136067n);
            documentBuilderFactoryNewInstance.setNamespaceAware(false);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setEntityResolver(r2());
            org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) this.f136064k.e2(org.apache.tools.ant.types.resources.y.class);
            Element documentElement = (yVar != null ? documentBuilderNewDocumentBuilder.parse(yVar.l0()) : documentBuilderNewDocumentBuilder.parse(this.f136064k.h2())).getDocumentElement();
            this.f136072s = new Hashtable();
            if (this.f136066m) {
                l2(documentElement, this.f136065l, null);
                return;
            }
            NodeList childNodes = documentElement.getChildNodes();
            int length = childNodes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                l2(childNodes.item(i10), this.f136065l, null);
            }
        } catch (IOException e10) {
            throw new BuildException("Failed to load " + this.f136064k, e10);
        } catch (ParserConfigurationException e11) {
            throw new BuildException(e11);
        } catch (SAXException e12) {
            Exception exception = e12.getException();
            SAXException exception2 = e12;
            if (exception != null) {
                exception2 = e12.getException();
            }
            throw new BuildException("Failed to load " + this.f136064k, exception2);
        }
    }

    public void D2(boolean z10) {
        this.f136068o = z10;
    }

    public void E2(String str) {
        this.f136074u = str;
    }

    public void F2(File file) {
        L2(new org.apache.tools.ant.types.resources.z(file));
    }

    public void G2(boolean z10) {
        this.f136070q = z10;
    }

    public void H2(boolean z10) {
        this.f136066m = z10;
    }

    public void I2(String str) {
        this.f136065l = str.trim();
    }

    public void J2(File file) {
        this.f136071r = file;
    }

    public void K2(boolean z10) {
        this.f136069p = z10;
    }

    public void L2(org.apache.tools.ant.types.s1 s1Var) {
        if (s1Var.o2()) {
            throw new BuildException("the source can't be a directory");
        }
        if (s1Var.e2(org.apache.tools.ant.types.resources.y.class) == null && !N2()) {
            throw new BuildException("Only FileSystem resources are supported.");
        }
        this.f136064k = s1Var;
    }

    public void M2(boolean z10) {
        this.f136067n = z10;
    }

    protected boolean N2() {
        return getClass().equals(z7.class);
    }

    @Override // org.apache.tools.ant.u2
    public void V1() {
        super.V1();
        this.f136073t.J(b());
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var.size() != 1) {
            throw new BuildException("only single argument resource collections are supported as archives");
        }
        L2(u1Var.iterator().next());
    }

    public void j2(org.apache.tools.ant.types.c2 c2Var) {
        this.f136073t.k2(c2Var);
    }

    void k2(Node node, String str) {
        l2(node, str, null);
    }

    protected File l0() {
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) this.f136064k.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar != null) {
            return yVar.l0();
        }
        return null;
    }

    protected boolean p2() {
        return this.f136068o;
    }

    public String q2() {
        return this.f136074u;
    }

    protected EntityResolver r2() {
        return this.f136073t;
    }

    protected boolean s2() {
        return this.f136070q;
    }

    @Deprecated
    protected boolean t2() {
        return s2();
    }

    protected boolean u2() {
        return this.f136066m;
    }

    protected String v2() {
        return this.f136065l;
    }

    protected org.apache.tools.ant.types.s1 w2() {
        File fileL0 = l0();
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) this.f136064k.e2(org.apache.tools.ant.types.resources.y.class);
        if (fileL0 == null) {
            return this.f136064k;
        }
        return (yVar == null || !yVar.l0().equals(fileL0)) ? new org.apache.tools.ant.types.resources.z(fileL0) : this.f136064k;
    }

    protected File x2() {
        return this.f136071r;
    }

    protected boolean y2() {
        return this.f136069p;
    }

    protected boolean z2() {
        return this.f136067n;
    }
}
