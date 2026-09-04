package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import org.apache.tools.ant.u2;
import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: DescriptorHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends HandlerBase {
    private static final String A = "ejb-class";
    private static final String B = "prim-key-class";
    private static final String C = "ejb-name";
    private static final String D = "ejb-jar";
    private static final String E = "enterprise-beans";
    private static final String F = "entity";
    private static final String G = "session";
    private static final String H = "message-driven";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f134916n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f134917o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f134918p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f134919q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f134920r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f134921s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f134922t = 6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f134923u = "ejb-ref";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f134924v = "ejb-local-ref";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f134925w = "home";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f134926x = "remote";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f134927y = "local-home";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f134928z = "local";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f134929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f134930c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f134931d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f134932e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f134933f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Hashtable<String, File> f134934g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f134935h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, File> f134936i = new Hashtable();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, String> f134937j = new Hashtable();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f134938k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, URL> f134939l = new Hashtable();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134940m;

    public e(u2 u2Var, File file) {
        this.f134929b = u2Var;
        this.f134940m = file;
    }

    public String a() {
        return this.f134935h;
    }

    public Hashtable<String, File> b() {
        Hashtable<String, File> hashtable = this.f134934g;
        return hashtable == null ? new Hashtable<>(Collections.emptyMap()) : hashtable;
    }

    public String c() {
        return this.f134930c;
    }

    @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        this.f134933f += new String(cArr, i10, i11);
    }

    protected void d() {
        if (this.f134938k) {
            return;
        }
        int i10 = this.f134931d;
        if (i10 == 5 || i10 == 4 || i10 == 6) {
            if ("home".equals(this.f134932e) || "remote".equals(this.f134932e) || "local".equals(this.f134932e) || f134927y.equals(this.f134932e) || A.equals(this.f134932e) || B.equals(this.f134932e)) {
                String strTrim = this.f134933f.trim();
                if (!strTrim.startsWith("java.") && !strTrim.startsWith("javax.")) {
                    String str = strTrim.replace(lg.a.f131414g, File.separatorChar) + ".class";
                    this.f134934g.put(str, new File(this.f134940m, str));
                }
            }
            if (this.f134932e.equals("ejb-name") && this.f134935h == null) {
                this.f134935h = this.f134933f.trim();
            }
        }
    }

    public void e(String str, String str2) {
        if (str2 == null) {
            return;
        }
        File file = new File(str2);
        if (!file.exists()) {
            file = this.f134929b.b().W0(str2);
        }
        if (file.exists()) {
            if (str != null) {
                this.f134936i.put(str, file);
                this.f134929b.x1("Mapped publicId " + str + " to file " + file, 3);
                return;
            }
            return;
        }
        if (getClass().getResource(str2) != null && str != null) {
            this.f134937j.put(str, str2);
            this.f134929b.x1("Mapped publicId " + str + " to resource " + str2, 3);
        }
        if (str != null) {
            try {
                this.f134939l.put(str, new URL(str2));
            } catch (MalformedURLException unused) {
            }
        }
    }

    @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
    public void endElement(String str) throws SAXException {
        d();
        this.f134933f = "";
        this.f134932e = "";
        if (str.equals(f134923u) || str.equals(f134924v)) {
            this.f134938k = false;
            return;
        }
        if (this.f134931d == 5 && str.equals(F)) {
            this.f134931d = 3;
            return;
        }
        if (this.f134931d == 4 && str.equals("session")) {
            this.f134931d = 3;
            return;
        }
        if (this.f134931d == 6 && str.equals(H)) {
            this.f134931d = 3;
            return;
        }
        if (this.f134931d == 3 && str.equals(E)) {
            this.f134931d = 2;
        } else if (this.f134931d == 2 && str.equals(D)) {
            this.f134931d = 1;
        }
    }

    @Override // org.xml.sax.HandlerBase, org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) throws SAXException {
        InputStream resourceAsStream;
        this.f134930c = str;
        File file = this.f134936i.get(str);
        if (file != null) {
            try {
                this.f134929b.x1("Resolved " + str + " to local file " + file, 3);
                return new InputSource(Files.newInputStream(file.toPath(), new OpenOption[0]));
            } catch (IOException unused) {
            }
        }
        String str3 = this.f134937j.get(str);
        if (str3 != null && (resourceAsStream = getClass().getResourceAsStream(str3)) != null) {
            this.f134929b.x1("Resolved " + str + " to local resource " + str3, 3);
            return new InputSource(resourceAsStream);
        }
        URL url = this.f134939l.get(str);
        if (url != null) {
            try {
                InputStream inputStreamOpenStream = url.openStream();
                this.f134929b.x1("Resolved " + str + " to url " + url, 3);
                return new InputSource(inputStreamOpenStream);
            } catch (IOException unused2) {
            }
        }
        this.f134929b.x1("Could not resolve (publicId: " + str + ", systemId: " + str2 + ") to a local entity", 2);
        return null;
    }

    @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
    public void startDocument() throws SAXException {
        this.f134934g = new Hashtable<>(10, 1.0f);
        this.f134932e = null;
        this.f134938k = false;
    }

    @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
    public void startElement(String str, AttributeList attributeList) throws SAXException {
        this.f134932e = str;
        this.f134933f = "";
        if (f134923u.equals(str) || f134924v.equals(str)) {
            this.f134938k = true;
            return;
        }
        if (this.f134931d == 1 && D.equals(str)) {
            this.f134931d = 2;
            return;
        }
        if (this.f134931d == 2 && E.equals(str)) {
            this.f134931d = 3;
            return;
        }
        if (this.f134931d == 3 && "session".equals(str)) {
            this.f134931d = 4;
            return;
        }
        if (this.f134931d == 3 && F.equals(str)) {
            this.f134931d = 5;
        } else if (this.f134931d == 3 && H.equals(str)) {
            this.f134931d = 6;
        }
    }
}
